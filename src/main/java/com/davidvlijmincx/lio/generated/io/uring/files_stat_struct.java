// Generated by jextract

package com.davidvlijmincx.lio.generated.io.uring;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfLong;

/**
 * {@snippet lang=c :
 * struct files_stat_struct {
 *     unsigned long nr_files;
 *     unsigned long nr_free_files;
 *     unsigned long max_files;
 * }
 * }
 */
public class files_stat_struct {

    files_stat_struct() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        liburingtest.C_LONG.withName("nr_files"),
        liburingtest.C_LONG.withName("nr_free_files"),
        liburingtest.C_LONG.withName("max_files")
    ).withName("files_stat_struct");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong nr_files$LAYOUT = (OfLong)$LAYOUT.select(groupElement("nr_files"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long nr_files
     * }
     */
    public static final OfLong nr_files$layout() {
        return nr_files$LAYOUT;
    }

    private static final long nr_files$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long nr_files
     * }
     */
    public static final long nr_files$offset() {
        return nr_files$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long nr_files
     * }
     */
    public static long nr_files(MemorySegment struct) {
        return struct.get(nr_files$LAYOUT, nr_files$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long nr_files
     * }
     */
    public static void nr_files(MemorySegment struct, long fieldValue) {
        struct.set(nr_files$LAYOUT, nr_files$OFFSET, fieldValue);
    }

    private static final OfLong nr_free_files$LAYOUT = (OfLong)$LAYOUT.select(groupElement("nr_free_files"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long nr_free_files
     * }
     */
    public static final OfLong nr_free_files$layout() {
        return nr_free_files$LAYOUT;
    }

    private static final long nr_free_files$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long nr_free_files
     * }
     */
    public static final long nr_free_files$offset() {
        return nr_free_files$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long nr_free_files
     * }
     */
    public static long nr_free_files(MemorySegment struct) {
        return struct.get(nr_free_files$LAYOUT, nr_free_files$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long nr_free_files
     * }
     */
    public static void nr_free_files(MemorySegment struct, long fieldValue) {
        struct.set(nr_free_files$LAYOUT, nr_free_files$OFFSET, fieldValue);
    }

    private static final OfLong max_files$LAYOUT = (OfLong)$LAYOUT.select(groupElement("max_files"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long max_files
     * }
     */
    public static final OfLong max_files$layout() {
        return max_files$LAYOUT;
    }

    private static final long max_files$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long max_files
     * }
     */
    public static final long max_files$offset() {
        return max_files$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long max_files
     * }
     */
    public static long max_files(MemorySegment struct) {
        return struct.get(max_files$LAYOUT, max_files$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long max_files
     * }
     */
    public static void max_files(MemorySegment struct, long fieldValue) {
        struct.set(max_files$LAYOUT, max_files$OFFSET, fieldValue);
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
