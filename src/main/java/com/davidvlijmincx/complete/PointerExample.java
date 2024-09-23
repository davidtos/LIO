package com.davidvlijmincx.complete;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;

public class PointerExample {

    public static void main(String[] args) {

        // example 1
        try (var arena = Arena.ofConfined()) {
            final var linker = Linker.nativeLinker();

            // Description of the C method
            MethodHandle malloc = linker.downcallHandle(
                    linker.defaultLookup().find("malloc").orElseThrow(),
                    FunctionDescriptor.of(ADDRESS, JAVA_INT)
            );

            MethodHandle free = linker.downcallHandle(linker.defaultLookup()
                    .find("free").orElseThrow(), FunctionDescriptor.ofVoid(ADDRESS));

            // Allocate 8 bytes
            MemorySegment pointer = (MemorySegment) malloc.invoke(8);

            // The size is 0 because pointer
            System.out.println("size = " + pointer.byteSize());

            ////// demo starts here ////////
            // second part - reinterpret


            MemorySegment mallocMemory = pointer.reinterpret(8, arena, c -> {
                try {
                    free.invokeExact(c);
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            });

            // Can now store value
            mallocMemory.set(JAVA_INT, 0, 1);

            // proof
            int storedValue = mallocMemory.get(JAVA_INT, 0);
            System.out.println("storedValue = " + storedValue);


        } catch (Throwable e) {
            throw new RuntimeException(e);
        }


    }
}
