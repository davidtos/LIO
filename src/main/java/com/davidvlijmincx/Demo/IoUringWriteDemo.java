package com.davidvlijmincx.Demo;

import com.davidvlijmincx.generated.io.uring.io_uring;
import com.davidvlijmincx.generated.io.uring.io_uring_cqe;
import com.davidvlijmincx.generated.io.uring.liburingtest;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

public class IoUringWriteDemo {

    static int QD = 4;
    final static String path = "./tmp_file";
    static String content = "Hello, io_uring!";

    static int flags = 0x0201 | 0x02000 | 0x0040; // O_WRONLY | O_TRUNC | O_CREAT
    static int mode = 0644;

    long userData = 9876432L;

    public static void main(String[] args) throws Throwable {
        int fd, ret;


    }
}
