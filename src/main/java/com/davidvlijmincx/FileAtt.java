package com.davidvlijmincx;

import java.io.File;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static java.lang.foreign.ValueLayout.JAVA_CHAR;

public class FileAtt{

    public int user_data;
    public MemorySegment buffer;
    public String path;
    public int fd;
    public int fileSize;


    public FileAtt(String path, int fd, int userData, Arena arena){
        this.user_data = userData;
        this.path = path;
        this.fd = fd;
        this.fileSize = (int) new File(path).length();
        this.buffer = arena.allocate(JAVA_CHAR,  fileSize);
    }


}
