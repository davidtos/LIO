// Generated by jextract

package com.davidvlijmincx.generated.io.uring;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct io_uring_files_update {
 *     __u32 offset;
 *     __u32 resv;
 *     __u64 fds;
 * }
 * }
 */
public class io_uring_files_update {

    io_uring_files_update() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        liburingtest.C_INT.withName("offset"),
        liburingtest.C_INT.withName("resv"),
        liburingtest.C_LONG_LONG.withName("fds")
    ).withName("io_uring_files_update");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt offset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u32 offset
     * }
     */
    public static final OfInt offset$layout() {
        return offset$LAYOUT;
    }

    private static final long offset$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u32 offset
     * }
     */
    public static final long offset$offset() {
        return offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u32 offset
     * }
     */
    public static int offset(MemorySegment struct) {
        return struct.get(offset$LAYOUT, offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u32 offset
     * }
     */
    public static void offset(MemorySegment struct, int fieldValue) {
        struct.set(offset$LAYOUT, offset$OFFSET, fieldValue);
    }

    private static final OfInt resv$LAYOUT = (OfInt)$LAYOUT.select(groupElement("resv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u32 resv
     * }
     */
    public static final OfInt resv$layout() {
        return resv$LAYOUT;
    }

    private static final long resv$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u32 resv
     * }
     */
    public static final long resv$offset() {
        return resv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u32 resv
     * }
     */
    public static int resv(MemorySegment struct) {
        return struct.get(resv$LAYOUT, resv$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u32 resv
     * }
     */
    public static void resv(MemorySegment struct, int fieldValue) {
        struct.set(resv$LAYOUT, resv$OFFSET, fieldValue);
    }

    private static final OfLong fds$LAYOUT = (OfLong)$LAYOUT.select(groupElement("fds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 fds
     * }
     */
    public static final OfLong fds$layout() {
        return fds$LAYOUT;
    }

    private static final long fds$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 fds
     * }
     */
    public static final long fds$offset() {
        return fds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 fds
     * }
     */
    public static long fds(MemorySegment struct) {
        return struct.get(fds$LAYOUT, fds$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 fds
     * }
     */
    public static void fds(MemorySegment struct, long fieldValue) {
        struct.set(fds$LAYOUT, fds$OFFSET, fieldValue);
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

