// Generated by jextract

package com.davidvlijmincx.generated.io.uring;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct sched_param {
 *     int sched_priority;
 * }
 * }
 */
public class sched_param {

    sched_param() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        liburingtest.C_INT.withName("sched_priority")
    ).withName("sched_param");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt sched_priority$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sched_priority"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int sched_priority
     * }
     */
    public static final OfInt sched_priority$layout() {
        return sched_priority$LAYOUT;
    }

    private static final long sched_priority$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int sched_priority
     * }
     */
    public static final long sched_priority$offset() {
        return sched_priority$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int sched_priority
     * }
     */
    public static int sched_priority(MemorySegment struct) {
        return struct.get(sched_priority$LAYOUT, sched_priority$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int sched_priority
     * }
     */
    public static void sched_priority(MemorySegment struct, int fieldValue) {
        struct.set(sched_priority$LAYOUT, sched_priority$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

