package com.davidvlijmincx.complete;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.time.Duration;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;

// kill -2 PID
public class UpCallExample {

    public static void main(String[] args) throws Throwable {
        printPID();

        final var linker = Linker.nativeLinker();

        // up call
        MethodHandle handleSignal = MethodHandles.lookup()
                .findStatic(UpCallExample.class,
                        "handleSignal",
                        MethodType.methodType(void.class, int.class));

        FunctionDescriptor signalDescriptor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);

        MemorySegment handlerFunc = linker.upcallStub(handleSignal,
                signalDescriptor,
                Arena.ofAuto());

        try (var _ = Arena.ofConfined()) {

            // down call -  void (*signal(int sig, void (*func)(int)))(int)
            MethodHandle signal = linker.downcallHandle(
                    linker.defaultLookup().find("signal").orElseThrow(),
                    FunctionDescriptor.ofVoid(JAVA_INT, ADDRESS)
            );

            signal.invoke(2, handlerFunc);

            for (int i = 0; i < 60; i++) {
                Thread.sleep(Duration.ofSeconds(1));
            }

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

    }

    private static void printPID() {
        long pid = ProcessHandle.current().pid();
        System.out.println("pid = " + pid);
    }

    static void handleSignal(int signal) {
        System.out.println("Received signal: " + signal);
    }


}
