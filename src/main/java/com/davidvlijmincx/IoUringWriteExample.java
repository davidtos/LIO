package com.davidvlijmincx;

import com.davidvlijmincx.generated.io.uring.liburingtest;
import com.davidvlijmincx.generated.io.uring.io_uring;
import com.davidvlijmincx.generated.io.uring.io_uring_cqe;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.Random;

import static java.lang.foreign.ValueLayout.*;

public class IoUringWriteExample {

    static int QD = 4;

    public static void main(String[] args) throws Throwable {
        int fd, ret;

        try (var arena = Arena.ofConfined()) {
            final var linker = Linker.nativeLinker();
            final var cStdLib = linker.defaultLookup();

            // Init ring
            MemorySegment ring = arena.allocate(io_uring.layout());

            ret = liburingtest.io_uring_queue_init(QD, ring, 0);

            if (ret < 0) {
                System.out.println("ring init ret = " + ret);
            }

            // open file
            MethodHandle open = linker.downcallHandle(
                    cStdLib.find("open").orElseThrow(),
                    FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT)
            );

            String path = "./tmp_file";
            int flags = 0x0201 | 0x02000 | 0x0040; // O_WRONLY | O_TRUNC | O_CREAT
            int mode = 0644;

            // Allocate native memory for the file path
            MemorySegment pathSegment = arena.allocateFrom(path);
            fd = (int) open.invoke(pathSegment, flags, mode);

            // align memory
            MethodHandle posixMemalignHandle = linker.downcallHandle(
                    linker.defaultLookup().find("posix_memalign").orElseThrow(),
                    FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_LONG, JAVA_LONG)
            );

            // Prepare the arguments for posix_memalign
            long alignment = 1024;
            long size = 1024;

            // Allocate space for the pointer to the aligned memory
            MemorySegment bufPtr = arena.allocate(ADDRESS);

            ret = (int) posixMemalignHandle.invoke(bufPtr, alignment, size);
            if (ret != 0) {
                throw new RuntimeException("posix_memalign failed with code: %d".formatted(ret));
            }

            // The content to write to the file
            String content = "Hello io_uring! from home";
            MemorySegment mem = bufPtr.reinterpret(size);
            mem.setString(0, content);

            // get a sqe to fill
            MemorySegment sqe = liburingtest.io_uring_get_sqe(ring);

            // set user data, so it's possible to match requests with cqe
            // number to look for in the cqe
            long userData = 9876432L;

            // alternative way to set userdata
            // io_uring_sqe.user_data(sqe.reinterpret(io_uring_sqe.layout().byteSize()),userData);

            // set the user data
            liburingtest.io_uring_sqe_set_data(sqe, arena.allocateFrom(JAVA_LONG, userData));

            System.out.println("submit job with user data " + userData);

            // prep the IO write
            int nbytes = content.length();
            long offset = 0;

            liburingtest.io_uring_prep_write(sqe, fd, bufPtr, nbytes, offset);

            // Submit the queue to be picked up
            ret = liburingtest.io_uring_submit(ring);

            if (ret < 0) {
                System.out.println("io_uring_submit " + ret);
            }

            // Wait for an IO Completion
            MemorySegment cqePtr = arena.allocate(io_uring_cqe.layout());
            ret = liburingtest.io_uring_wait_cqe(ring, cqePtr);
            if (ret != 0) {
                throw new RuntimeException("io_uring_wait_cqe failed with code: " + ret);
            }

            // Get the user data that was set earlier
            MemorySegment usersData = liburingtest.io_uring_cqe_get_data(cqePtr);
            MemorySegment ptr = usersData.reinterpret(JAVA_LONG.byteSize(), arena, null);

            long userDatas = liburingtest.io_uring_cqe_get_data(ptr).reinterpret(JAVA_LONG.byteSize(), arena, null).getAtIndex(JAVA_LONG, 0);
            System.out.printf("Got finished job  = %d%n", userDatas);

            // mark as the cqe consumed
            liburingtest.io_uring_cqe_seen(ring, cqePtr);

            // close the resources used for this ring
            liburingtest.io_uring_queue_exit(ring);

            //// close the file
            MethodHandle close = linker.downcallHandle(
                    cStdLib.find("close").get(),
                    FunctionDescriptor.ofVoid(JAVA_INT)
            );

            close.invoke(fd);

        }


    }
}
