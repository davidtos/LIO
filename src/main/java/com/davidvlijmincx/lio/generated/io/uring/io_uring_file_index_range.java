// Generated by jextract

package com.davidvlijmincx.lio.generated.io.uring;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.OfLong;

/**
 * {@snippet lang=c :
 * struct io_uring_file_index_range {
 *     __u32 off;
 *     __u32 len;
 *     __u64 resv;
 * }
 * }
 */
public class io_uring_file_index_range {

    io_uring_file_index_range() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        liburingtest.C_INT.withName("off"),
        liburingtest.C_INT.withName("len"),
        liburingtest.C_LONG_LONG.withName("resv")
    ).withName("io_uring_file_index_range");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt off$LAYOUT = (OfInt)$LAYOUT.select(groupElement("off"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u32 off
     * }
     */
    public static final OfInt off$layout() {
        return off$LAYOUT;
    }

    private static final long off$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u32 off
     * }
     */
    public static final long off$offset() {
        return off$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u32 off
     * }
     */
    public static int off(MemorySegment struct) {
        return struct.get(off$LAYOUT, off$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u32 off
     * }
     */
    public static void off(MemorySegment struct, int fieldValue) {
        struct.set(off$LAYOUT, off$OFFSET, fieldValue);
    }

    private static final OfInt len$LAYOUT = (OfInt)$LAYOUT.select(groupElement("len"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u32 len
     * }
     */
    public static final OfInt len$layout() {
        return len$LAYOUT;
    }

    private static final long len$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u32 len
     * }
     */
    public static final long len$offset() {
        return len$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u32 len
     * }
     */
    public static int len(MemorySegment struct) {
        return struct.get(len$LAYOUT, len$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u32 len
     * }
     */
    public static void len(MemorySegment struct, int fieldValue) {
        struct.set(len$LAYOUT, len$OFFSET, fieldValue);
    }

    private static final OfLong resv$LAYOUT = (OfLong)$LAYOUT.select(groupElement("resv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 resv
     * }
     */
    public static final OfLong resv$layout() {
        return resv$LAYOUT;
    }

    private static final long resv$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 resv
     * }
     */
    public static final long resv$offset() {
        return resv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 resv
     * }
     */
    public static long resv(MemorySegment struct) {
        return struct.get(resv$LAYOUT, resv$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 resv
     * }
     */
    public static void resv(MemorySegment struct, long fieldValue) {
        struct.set(resv$LAYOUT, resv$OFFSET, fieldValue);
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
