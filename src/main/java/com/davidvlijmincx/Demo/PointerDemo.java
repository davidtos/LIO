package com.davidvlijmincx.Demo;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;

public class PointerDemo {

    public static void main(String[] args) {

        // example 1
        try (var arena = Arena.ofConfined()) {
            final var linker = Linker.nativeLinker();

            MethodHandle malloc = linker.downcallHandle(
                    linker.defaultLookup().find("malloc").orElseThrow(),
                    FunctionDescriptor.of(ADDRESS, JAVA_INT)
            );

            // Allocate 8 bytes
            MemorySegment pointer = (MemorySegment) malloc.invoke(8);

            // The size is 0 because pointer
            System.out.println("size = " + pointer.byteSize());


        } catch (Throwable e) {
            throw new RuntimeException(e);
        }


    }
}
