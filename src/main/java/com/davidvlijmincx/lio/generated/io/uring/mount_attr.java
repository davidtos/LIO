// Generated by jextract

package com.davidvlijmincx.lio.generated.io.uring;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfLong;

/**
 * {@snippet lang=c :
 * struct mount_attr {
 *     __u64 attr_set;
 *     __u64 attr_clr;
 *     __u64 propagation;
 *     __u64 userns_fd;
 * }
 * }
 */
public class mount_attr {

    mount_attr() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        liburingtest.C_LONG_LONG.withName("attr_set"),
        liburingtest.C_LONG_LONG.withName("attr_clr"),
        liburingtest.C_LONG_LONG.withName("propagation"),
        liburingtest.C_LONG_LONG.withName("userns_fd")
    ).withName("mount_attr");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong attr_set$LAYOUT = (OfLong)$LAYOUT.select(groupElement("attr_set"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 attr_set
     * }
     */
    public static final OfLong attr_set$layout() {
        return attr_set$LAYOUT;
    }

    private static final long attr_set$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 attr_set
     * }
     */
    public static final long attr_set$offset() {
        return attr_set$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 attr_set
     * }
     */
    public static long attr_set(MemorySegment struct) {
        return struct.get(attr_set$LAYOUT, attr_set$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 attr_set
     * }
     */
    public static void attr_set(MemorySegment struct, long fieldValue) {
        struct.set(attr_set$LAYOUT, attr_set$OFFSET, fieldValue);
    }

    private static final OfLong attr_clr$LAYOUT = (OfLong)$LAYOUT.select(groupElement("attr_clr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 attr_clr
     * }
     */
    public static final OfLong attr_clr$layout() {
        return attr_clr$LAYOUT;
    }

    private static final long attr_clr$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 attr_clr
     * }
     */
    public static final long attr_clr$offset() {
        return attr_clr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 attr_clr
     * }
     */
    public static long attr_clr(MemorySegment struct) {
        return struct.get(attr_clr$LAYOUT, attr_clr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 attr_clr
     * }
     */
    public static void attr_clr(MemorySegment struct, long fieldValue) {
        struct.set(attr_clr$LAYOUT, attr_clr$OFFSET, fieldValue);
    }

    private static final OfLong propagation$LAYOUT = (OfLong)$LAYOUT.select(groupElement("propagation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 propagation
     * }
     */
    public static final OfLong propagation$layout() {
        return propagation$LAYOUT;
    }

    private static final long propagation$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 propagation
     * }
     */
    public static final long propagation$offset() {
        return propagation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 propagation
     * }
     */
    public static long propagation(MemorySegment struct) {
        return struct.get(propagation$LAYOUT, propagation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 propagation
     * }
     */
    public static void propagation(MemorySegment struct, long fieldValue) {
        struct.set(propagation$LAYOUT, propagation$OFFSET, fieldValue);
    }

    private static final OfLong userns_fd$LAYOUT = (OfLong)$LAYOUT.select(groupElement("userns_fd"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 userns_fd
     * }
     */
    public static final OfLong userns_fd$layout() {
        return userns_fd$LAYOUT;
    }

    private static final long userns_fd$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 userns_fd
     * }
     */
    public static final long userns_fd$offset() {
        return userns_fd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 userns_fd
     * }
     */
    public static long userns_fd(MemorySegment struct) {
        return struct.get(userns_fd$LAYOUT, userns_fd$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 userns_fd
     * }
     */
    public static void userns_fd(MemorySegment struct, long fieldValue) {
        struct.set(userns_fd$LAYOUT, userns_fd$OFFSET, fieldValue);
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
