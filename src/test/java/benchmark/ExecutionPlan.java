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
public class ExecutionPlan {

    String[] files;

    @Setup
    public void setup() {
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 200; i++) {
            strings.add("./TestFiles/tmp_file" + i);
        }

        files = strings.toArray(new String[0]);

    }

}
