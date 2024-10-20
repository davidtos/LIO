package benchmark;

import com.davidvlijmincx.IoUringReadMultipleFiles;
import com.davidvlijmincx.generated.io.uring.io_uring_cqe;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;

import java.lang.foreign.MemorySegment;
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

    @Setup
    public void setup() {
        List<String> strings = new ArrayList<>();

        strings.add("./tmp_file");
        for (int i = 1; i < 20; i++) {
            strings.add("./tmp_file" + i);
        }

        files = strings.toArray(new String[0]);

        uring  = new IoUringReadMultipleFiles(files.length);
        fds = uring.arena.allocate(JAVA_INT, files.length);
        pntr = uring.arena.allocate(io_uring_cqe.layout());
        uring.submit();
    }


    @TearDown
    public void tearDown() {
        uring.close();
    }

}
