// Generated by jextract

package com.davidvlijmincx.lio.generated.io.uring;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.MemoryLayout.PathElement.sequenceElement;
import static java.lang.foreign.ValueLayout.*;

/**
 * {@snippet lang=c :
 * struct io_uring_napi {
 *     __u32 busy_poll_to;
 *     __u8 prefer_busy_poll;
 *     __u8 pad[3];
 *     __u64 resv;
 * }
 * }
 */
public class io_uring_napi {

    io_uring_napi() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        liburingtest.C_INT.withName("busy_poll_to"),
        liburingtest.C_CHAR.withName("prefer_busy_poll"),
        MemoryLayout.sequenceLayout(3, liburingtest.C_CHAR).withName("pad"),
        liburingtest.C_LONG_LONG.withName("resv")
    ).withName("io_uring_napi");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt busy_poll_to$LAYOUT = (OfInt)$LAYOUT.select(groupElement("busy_poll_to"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u32 busy_poll_to
     * }
     */
    public static final OfInt busy_poll_to$layout() {
        return busy_poll_to$LAYOUT;
    }

    private static final long busy_poll_to$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u32 busy_poll_to
     * }
     */
    public static final long busy_poll_to$offset() {
        return busy_poll_to$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u32 busy_poll_to
     * }
     */
    public static int busy_poll_to(MemorySegment struct) {
        return struct.get(busy_poll_to$LAYOUT, busy_poll_to$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u32 busy_poll_to
     * }
     */
    public static void busy_poll_to(MemorySegment struct, int fieldValue) {
        struct.set(busy_poll_to$LAYOUT, busy_poll_to$OFFSET, fieldValue);
    }

    private static final OfByte prefer_busy_poll$LAYOUT = (OfByte)$LAYOUT.select(groupElement("prefer_busy_poll"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u8 prefer_busy_poll
     * }
     */
    public static final OfByte prefer_busy_poll$layout() {
        return prefer_busy_poll$LAYOUT;
    }

    private static final long prefer_busy_poll$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u8 prefer_busy_poll
     * }
     */
    public static final long prefer_busy_poll$offset() {
        return prefer_busy_poll$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u8 prefer_busy_poll
     * }
     */
    public static byte prefer_busy_poll(MemorySegment struct) {
        return struct.get(prefer_busy_poll$LAYOUT, prefer_busy_poll$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u8 prefer_busy_poll
     * }
     */
    public static void prefer_busy_poll(MemorySegment struct, byte fieldValue) {
        struct.set(prefer_busy_poll$LAYOUT, prefer_busy_poll$OFFSET, fieldValue);
    }

    private static final SequenceLayout pad$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("pad"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u8 pad[3]
     * }
     */
    public static final SequenceLayout pad$layout() {
        return pad$LAYOUT;
    }

    private static final long pad$OFFSET = 5;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u8 pad[3]
     * }
     */
    public static final long pad$offset() {
        return pad$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u8 pad[3]
     * }
     */
    public static MemorySegment pad(MemorySegment struct) {
        return struct.asSlice(pad$OFFSET, pad$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u8 pad[3]
     * }
     */
    public static void pad(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pad$OFFSET, pad$LAYOUT.byteSize());
    }

    private static long[] pad$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __u8 pad[3]
     * }
     */
    public static long[] pad$dimensions() {
        return pad$DIMS;
    }
    private static final VarHandle pad$ELEM_HANDLE = pad$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __u8 pad[3]
     * }
     */
    public static byte pad(MemorySegment struct, long index0) {
        return (byte)pad$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __u8 pad[3]
     * }
     */
    public static void pad(MemorySegment struct, long index0, byte fieldValue) {
        pad$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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
