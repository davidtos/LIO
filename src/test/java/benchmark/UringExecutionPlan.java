package benchmark;

import com.davidvlijmincx.IoUringReadMultipleFiles;
import com.davidvlijmincx.generated.io.uring.io_uring_cqe;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.foreign.ValueLayout.JAVA_INT;

@State(Scope.Benchmark)
public class UringExecutionPlan {

    IoUringReadMultipleFiles uring;
    MemorySegment fds;
    MemorySegment pntr;
    String[] files;
    MethodHandle openFiles;
    MethodHandle closeFiles;
    MethodHandle queue_prepped;
    MemorySegment pathsArray;

    @Setup
    public void setup() {
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 200; i++) {
            strings.add("./TestFiles/tmp_file" + i);
        }

        files = strings.toArray(new String[0]);

        uring  = new IoUringReadMultipleFiles(files.length);
        fds = uring.arena.allocate(JAVA_INT, files.length);
        pntr = uring.arena.allocate(io_uring_cqe.layout());
        uring.submit();

        pathsArray = uring.arena.allocate(ValueLayout.ADDRESS, files.length);
        SymbolLookup SYMBOL_LOOKUP = SymbolLookup.libraryLookup("/home/david/IdeaProjects/C_project/libfilemanager.so", uring.arena);

        openFiles = Linker.nativeLinker().downcallHandle(
                SYMBOL_LOOKUP.find("open_files").orElseThrow(),
                FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );

        closeFiles = Linker.nativeLinker().downcallHandle(
                SYMBOL_LOOKUP.find("close_files").orElseThrow(),
                FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)
        );

        queue_prepped = Linker.nativeLinker().downcallHandle(
                SYMBOL_LOOKUP.find("queue_prepped").orElseThrow(),
                FunctionDescriptor.ofVoid(ValueLayout.ADDRESS,  ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
        );


    }


    @TearDown
    public void tearDown() {
        uring.close();
    }

}
