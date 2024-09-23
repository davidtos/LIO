package com.davidvlijmincx.talk;

import com.davidvlijmincx.generated.io.uring.io_uring;
import com.davidvlijmincx.generated.io.uring.io_uring_cqe;
import com.davidvlijmincx.generated.io.uring.liburingtest;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

public class IoUringWriteExample {

    static int QD = 4;
    static String path = "./tmp_file";
    static String content = "Hello, io_uring!!";

    static int flags = 0x0201 | 0x02000 | 0x0040; // O_WRONLY | O_TRUNC | O_CREAT
    static int mode = 0644;

    public static void main(String[] args) throws Throwable {
        int fd, ret;

        try (var arena = Arena.ofConfined()) {

            MemorySegment pathSegment = arena.allocateFrom(path);

            final var linker = Linker.nativeLinker();
            final var defaultLookup = linker.defaultLookup();

            MethodHandle open = linker.downcallHandle(
                    defaultLookup.find("open").orElseThrow(),
                    FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT)
            );

            MethodHandle close = linker.downcallHandle(
                    defaultLookup.find("close").get(),
                    FunctionDescriptor.ofVoid(JAVA_INT)
            );

            // open file
            // Allocate native memory for the file path
            fd = (int) open.invoke(pathSegment, flags, mode);


            SymbolLookup liburing = SymbolLookup.libraryLookup("/lib/liburing-ffi.so", arena);
            // Init ring
            MemorySegment ring = arena.allocate(io_uring.layout());

            MethodHandle io_uring_queue_init = linker.downcallHandle(
                    liburing.find("io_uring_queue_init").orElseThrow(),
                    FunctionDescriptor.of(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT)
            );

            ret = (int) io_uring_queue_init.invoke(QD, ring, 0);

            if (ret < 0) {
                System.out.println("ring init ret = " + ret);
            }

            // align memory
            MemorySegment bufPtr = arena.allocate(1024,1024);

            // The content to write to the file
            bufPtr.setString(0, content);

            // get a sqe to submit a write request
            MemorySegment sqe = liburingtest.io_uring_get_sqe(ring);

            // set user data, so it's possible to match requests with cqe
            // number to look for in the cqe
            long userData = 9876432L;

            // TODO: Tell about how this is your own method
            liburingtest.io_uring_sqe_set_data_long(sqe,  userData);

            System.out.println("submit job with user data " + userData);

            // prep the IO write
            liburingtest.io_uring_prep_write(sqe, fd, bufPtr, content.length(), 0);

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

            // Get the user data that was set earlier to match requests
            MemorySegment usersData = liburingtest.io_uring_cqe_get_data(cqePtr);
            System.out.printf("Got finished job  = %d%n", usersData.get(JAVA_LONG,0));

            // mark as the cqe consumed
            liburingtest.io_uring_cqe_seen(ring, cqePtr);

            // close the resources used for this ring
            liburingtest.io_uring_queue_exit(ring);

            // close the file

            close.invoke(fd);

        }

    }

    public static void close(MemorySegment cqePtr) {

    }
}
