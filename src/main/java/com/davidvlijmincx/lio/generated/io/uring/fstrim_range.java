// Generated by jextract

package com.davidvlijmincx.lio.generated.io.uring;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfLong;

/**
 * {@snippet lang=c :
 * struct fstrim_range {
 *     __u64 start;
 *     __u64 len;
 *     __u64 minlen;
 * }
 * }
 */
public class fstrim_range {

    fstrim_range() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        liburingtest.C_LONG_LONG.withName("start"),
        liburingtest.C_LONG_LONG.withName("len"),
        liburingtest.C_LONG_LONG.withName("minlen")
    ).withName("fstrim_range");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong start$LAYOUT = (OfLong)$LAYOUT.select(groupElement("start"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 start
     * }
     */
    public static final OfLong start$layout() {
        return start$LAYOUT;
    }

    private static final long start$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 start
     * }
     */
    public static final long start$offset() {
        return start$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 start
     * }
     */
    public static long start(MemorySegment struct) {
        return struct.get(start$LAYOUT, start$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 start
     * }
     */
    public static void start(MemorySegment struct, long fieldValue) {
        struct.set(start$LAYOUT, start$OFFSET, fieldValue);
    }

    private static final OfLong len$LAYOUT = (OfLong)$LAYOUT.select(groupElement("len"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 len
     * }
     */
    public static final OfLong len$layout() {
        return len$LAYOUT;
    }

    private static final long len$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 len
     * }
     */
    public static final long len$offset() {
        return len$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 len
     * }
     */
    public static long len(MemorySegment struct) {
        return struct.get(len$LAYOUT, len$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 len
     * }
     */
    public static void len(MemorySegment struct, long fieldValue) {
        struct.set(len$LAYOUT, len$OFFSET, fieldValue);
    }

    private static final OfLong minlen$LAYOUT = (OfLong)$LAYOUT.select(groupElement("minlen"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 minlen
     * }
     */
    public static final OfLong minlen$layout() {
        return minlen$LAYOUT;
    }

    private static final long minlen$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 minlen
     * }
     */
    public static final long minlen$offset() {
        return minlen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 minlen
     * }
     */
    public static long minlen(MemorySegment struct) {
        return struct.get(minlen$LAYOUT, minlen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 minlen
     * }
     */
    public static void minlen(MemorySegment struct, long fieldValue) {
        struct.set(minlen$LAYOUT, minlen$OFFSET, fieldValue);
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
