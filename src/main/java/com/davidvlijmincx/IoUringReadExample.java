package com.davidvlijmincx;

import com.davidvlijmincx.generated.io.uring.*;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;

public class IoUringReadExample {

    static int QD = 4;

    public static void main(String[] args) throws Throwable {
        int fd, ret;

        try (var arena = Arena.ofConfined()) {
            final var linker = Linker.nativeLinker();
            final var cStdLib = linker.defaultLookup();

            // Init ring
            MemorySegment ring = arena.allocate(io_uring.layout());

            // ret = liburingtest.io_uring_queue_init(QD, ring, 0);
            MemorySegment ioup = arena.allocate(io_uring_params.layout());

            io_uring_params.flags(ioup, (1 << 1));
            io_uring_params.sq_thread_idle(ioup, 2000);

            ret = liburingtest.io_uring_queue_init_params(QD, ring, ioup);


            if (ret < 0) {
                System.out.println("ring init ret = " + ret);
            }

            // open file
            MethodHandle open = linker.downcallHandle(
                    cStdLib.find("open").orElseThrow(),
                    FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_INT)
            );

            String path = "./tmp_file";
            int mode = 000;

            // Allocate native memory for the file path
            MemorySegment pathSegment = arena.allocateFrom(path);
            fd = (int) open.invoke(pathSegment, mode);

            MemorySegment fds = arena.allocate(JAVA_INT, 2);
            fds.setAtIndex(JAVA_INT, 0, fd);

            liburingtest.io_uring_register_files(ring, fds, 1);

            MethodHandle fstat = linker.downcallHandle(
                    cStdLib.find("fstat").get(),
                    FunctionDescriptor.of(JAVA_INT, JAVA_INT, ADDRESS)
            );
            MemorySegment sb = arena.allocate(stat.layout());
            if ((int) fstat.invoke(fd, sb) < 0) {
                System.out.println("fstat error");
            }

            // Create and init iovecs
            SequenceLayout iovecsLayout = MemoryLayout.sequenceLayout(QD, iovec.layout());
            MemorySegment iovecs = Arena.ofAuto().allocate(iovecsLayout);
            VarHandle iov_baseHandle = iovecsLayout.varHandle(PathElement.sequenceElement(),
                    PathElement.groupElement("iov_base"));

            VarHandle iov_lenHandle = iovecsLayout.varHandle(PathElement.sequenceElement(),
                    PathElement.groupElement("iov_len"));

            MethodHandle posix_memalign = linker.downcallHandle(
                    cStdLib.find("posix_memalign").get(),
                    FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT)
            );
            MemorySegment buf = arena.allocate(ValueLayout.ADDRESS);

            long offset = 0;
            int j = 0;
            for (int i = 0; i < QD; i++) {

                if ((int) posix_memalign.invoke(buf, 4096, 4096) < 0) {
                    System.out.println("posix_memalign goes wrong");
                }
                iov_baseHandle.set(iovecs, 0L, (long) i, buf);
                iov_lenHandle.set(iovecs, 0L, (long) i, 4096L);
            }

            // Create read request
            MemorySegment sqe = liburingtest.io_uring_get_sqe(ring);
            liburingtest.io_uring_sqe_set_flags(sqe, 1 << 0);

            //  liburingtest.io_uring_prep_readv(sqe, fd, iovecs.asSlice(nIovecOffset, iovec.layout().byteSize()), 1, 0);

            MemorySegment buff4 = arena.allocate(JAVA_CHAR, 4);
            liburingtest.io_uring_prep_read(sqe, 0, buff4, 4, 0);

            // set user data, so it's possible to match requests with cqe
            liburingtest.io_uring_sqe_set_data(sqe, arena.allocateFrom(JAVA_LONG, 999888L));


            // Submit the queue to be picked up
            ret = liburingtest.io_uring_submit(ring);

            if (ret < 0) {
                System.out.println("io_uring_submit " + ret);
            }

            // wait for cqe
            MemorySegment cqePtr = arena.allocate(io_uring_cqe.layout());

            ret = liburingtest.io_uring_wait_cqe(ring, cqePtr);
            if (ret != 0) {
                throw new RuntimeException("io_uring_wait_cqe failed with code: " + ret);
            }


            MemorySegment buffer = (MemorySegment) buff4;

            System.out.printf("file content: %s%n", buffer.getString(0));
            System.out.printf("cqe result: %d%n", io_uring_cqe.res(cqePtr));

            // Get the user data that was set earlier
            MemorySegment usersData = liburingtest.io_uring_cqe_get_data(cqePtr);
            MemorySegment ptr = usersData.reinterpret(JAVA_LONG.byteSize(), arena, null);

            long userData = liburingtest.io_uring_cqe_get_data(ptr).reinterpret(JAVA_LONG.byteSize(), arena, null).getAtIndex(JAVA_LONG, 0);
            System.out.printf("Got finished job  = %d%n", userData);

            // mark as the cqe consumed
            liburingtest.io_uring_cqe_seen(ring, cqePtr);

            // close the resources used for this ring
            liburingtest.io_uring_queue_exit(ring);

        }


    }
}
