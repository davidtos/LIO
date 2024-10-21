package com.davidvlijmincx;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;


public class FdGetter {

    public static FdData  openFiles(String[] filePaths, Arena arena, MethodHandle openFilesHandle, MemorySegment pathsArray) throws Throwable {

        for (int i = 0; i < filePaths.length; i++) {
            pathsArray.setAtIndex(ValueLayout.ADDRESS, i, arena.allocateFrom(filePaths[i]));
        }

        MemorySegment fdPointer = ((MemorySegment) openFilesHandle.invoke(pathsArray, filePaths.length));

        return new FdData( fdPointer);
    }

    // FFM API wrapper for the close_files function
    public static void closeFiles(String[] filePaths, MethodHandle closeFilesHandle) throws Throwable {
        closeFilesHandle.invoke(filePaths.length);
    }
}

