package benchmark;

import com.davidvlijmincx.FileAtt;
import com.davidvlijmincx.generated.io.uring.io_uring_cqe;
import com.davidvlijmincx.generated.io.uring.liburingtest;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.lang.foreign.ValueLayout.JAVA_LONG;


public class BenchMarkLibUring {

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(BenchMarkLibUring.class.getSimpleName())
                .forks(1)
                .shouldDoGC(false)
                .build();

        new Runner(opt).run();
    }


    @Benchmark()
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void ReadUsingBufferedReader(Blackhole blackhole, ExecutionPlan plan) throws Throwable {

        for (var path : plan.files) {
            int length = (int) new File(path).length();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("./tmp_file"),
                            "UTF-8"));
            char[] chars = new char[length + 4];
            in.read(chars, 0, length);


            blackhole.consume(new String(chars));
        }

    }



    @Benchmark()
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void readUsingChannel(Blackhole blackhole, ExecutionPlan plan) throws Throwable {

        for (var path : plan.files) {
            File file = new File(path);
            try (var fin = new FileInputStream(file)) {
                FileChannel channel = fin.getChannel();

                channel.position(0);
                ByteBuffer buff = ByteBuffer.allocate((int) new File(path).length());
                channel.read(buff);
                blackhole.consume(new String(buff.array(), StandardCharsets.UTF_8));
            }
        }
    }



    @Benchmark()
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void ReadUsingFileReader(Blackhole blackhole, ExecutionPlan plan) throws Throwable {

        for (var path : plan.files) {
            try (FileReader reader = new FileReader(path)) {
                int length = (int) new File(path).length();
                char[] buffer = new char[length];
                blackhole.consume(reader.read(buffer, 0, length));
                blackhole.consume(new String(buffer));
            }
        }


    }


    @Benchmark()
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void ReadUsingLiburing(UringExecutionPlan plan, Blackhole blackhole) throws Throwable {

        var files = plan.files;
        var uring = plan.uring;

        FileAtt[] atts = new FileAtt[files.length];
        Map<Integer, FileAtt> attMap = new HashMap<>();

        for (int i = 0; i < files.length; i++) {
            atts[i] = new FileAtt(files[i], uring.getFd(files[i]), i, uring.arena);
            uring.createReadRequest(atts[i].buffer, atts[i].fileSize, i, atts[i].user_data);
            attMap.put(i, atts[i]);
        }

        uring.registerFds(atts, plan.fds);

        uring.submit();


        for (int i = 0; i < atts.length; i++) {
            var pntr = uring.see(uring.arena.allocate(io_uring_cqe.layout()));
            long userData = liburingtest.io_uring_cqe_get_data(pntr).get(JAVA_LONG, 0);

            blackhole.consume(attMap.get((int)userData).buffer.getString(0));

            uring.closeFd(attMap.get((int)userData).fd);
            uring.seen(pntr);

        }


    }

}
