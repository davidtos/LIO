package com.davidvlijmincx;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

public class MemoryExamples {

    public static void main(String[] args) {

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        // example 1
        try(var arena = Arena.ofConfined()) {
            MemorySegment intSegment = arena.allocateFrom(ValueLayout.JAVA_INT, 5);

            int i = intSegment.get(ValueLayout.JAVA_INT, 0);

            System.out.println("i = " + i);
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        // example 2 - out of bound 
        try(var arena = Arena.ofConfined()) {
            MemorySegment intSegment = arena.allocateFrom(ValueLayout.JAVA_INT, 5);

            // this changed
/*--->*/    intSegment.set(ValueLayout.JAVA_LONG, 0,6);

            int i = intSegment.get(ValueLayout.JAVA_INT, 0);

            System.out.println("i = " + i);
        } catch (Exception e){e.printStackTrace();}

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        // example 3 - Use after free

        MemorySegment intSegment;
        try (var arena = Arena.ofConfined()) {
              intSegment = arena.allocateFrom(ValueLayout.JAVA_INT, 5);
        }
        //     Already closed
        int i = intSegment.get(ValueLayout.JAVA_INT, 0);
        System.out.println("i = " + i);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        // example 4 - Struc example

        // This is a struc
        StructLayout record = MemoryLayout.structLayout(
                ValueLayout.JAVA_INT.withName("id"),
                ValueLayout.JAVA_INT.withName("score")
        ).withName("record");


        //  allocate the struc
        try(var arena = Arena.ofConfined()) {
            MemorySegment recordsSegment = arena.allocate(record);
            VarHandle scoreHandle = record.varHandle(MemoryLayout.PathElement.groupElement("score"));
            scoreHandle.set(recordsSegment,0L, 1);
            int score = (int)scoreHandle.get(recordsSegment,0L);
            System.out.println("score = " + score);
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        // example 5 - seqeunce  with srtuc

//        StructLayout record = MemoryLayout.structLayout(
//                            ValueLayout.JAVA_INT.withName("id"),
//                            ValueLayout.JAVA_INT.withName("score")
//                    ).withName("record");

        try(var arena = Arena.ofConfined()){
/*--->*/    SequenceLayout recordSeq = MemoryLayout.sequenceLayout(10, record);
            MemorySegment recordsSegment = arena.allocate(recordSeq);
/*--->*/    VarHandle scoreHandle = recordSeq.varHandle(MemoryLayout.PathElement.sequenceElement(),
/*--->*/            MemoryLayout.PathElement.groupElement("score"));

            scoreHandle.set(recordsSegment, 0L, (long) 1, 3);
/*--->*/    int score = (int) scoreHandle.get(recordsSegment,0L,1);
            System.out.println("score = " + score);
        }

    }
}
