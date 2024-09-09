# LIO (Linux IO)
This repository is part of my talk about Project Panama. I aim to show how you can call C libraries from inside your Java code.

## What is inside this repository
The library contains a working example of FUSE and IO_URING with liburing. 

- **FUSE** code see [this](https://github.com/davidtos/LIO/blob/master/src/main/java/com/davidvlijmincx/FuseMain.java)
  - To unmount use the following command `fusermount3 -u $FILE_PATH`
- **IO_URING READ** code see [this](https://github.com/davidtos/LIO/blob/master/src/main/java/com/davidvlijmincx/IoUringReadExample.java)
  - The read example uses polling to reduce the number of system calls.
  - To see that the polling is working you can use `sudo bpftrace -e 'tracepoint:io_uring:io_uring_submit_req* {printf("%s(%d)\n", comm, pid);}'` this shows you what called submit.
- **IO_URING WRITE** code see [this](https://github.com/davidtos/LIO/blob/master/src/main/java/com/davidvlijmincx/IoUringWriteExample.java)
  - The write example does not use polling but makes a system call.

## Wrapper code
The code that calls the C code is generated using [Jextract](https://github.com/openjdk/jextract). Jextract creates Java code based on the header files.

To generate FUSE:
`jextract -D _FILE_OFFSET_BITS=64 -D FUSE_USE_VERSION=35 --source -d generated/src -t org.libfuse -I /Documents/libfuse-fuse-3.10.5/include/ /Documents/libfuse-fuse-3.10.5/include/fuse.h`

To generate Liburing:
`jextract -D IOURINGINLINE=extern  -l uring -t io.uring -I include --output ./generated --header-class-name liburingtest include/liburing.h`

## Side note
This sample code is not production ready, it's just a proof of concept that happens to work.
