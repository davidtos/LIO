package com.davidvlijmincx;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;

public class FunctionExamples {

    public static void main(String[] args) {

        // example 1
        try (var arena = Arena.ofConfined()) {
            final var linker = Linker.nativeLinker();

            MethodHandle malloc = linker.downcallHandle(
                    linker.defaultLookup().find("malloc").orElseThrow(),
                    FunctionDescriptor.of(ADDRESS, JAVA_INT)
            );

            MemorySegment pointer = (MemorySegment) malloc.invoke(8);

            System.out.println("size = " + pointer.byteSize());


            // second part
            MethodHandle free = linker.downcallHandle(linker.defaultLookup().find("free").orElseThrow(), FunctionDescriptor.ofVoid(ADDRESS)
            );
            MemorySegment mallocMemory = pointer.reinterpret(8, arena, c -> {
                try {
                    free.invokeExact(c);
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            });
            mallocMemory.set(JAVA_INT, 0, 1);
            int storedValue = mallocMemory.get(JAVA_INT, 0);
            System.out.println("storedValue = " + storedValue);


        } catch (Throwable e) {
            throw new RuntimeException(e);
        }


    }
}
