package com.davidvlijmincx;

import java.lang.foreign.MemorySegment;

public record FdData(MemorySegment fdPointer) {
}
