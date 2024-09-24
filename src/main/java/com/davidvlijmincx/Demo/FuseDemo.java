package com.davidvlijmincx.Demo;

import com.davidvlijmincx.generated.src.org.libfuse.*;

import java.io.IOException;
import java.lang.foreign.*;
import java.time.Instant;
import java.util.*;

// https://www.cs.hmc.edu/~geoff/classes/hmc.cs135.201001/homework/fuse/fuse_doc.html
public class FuseDemo {

    static List<String> directories = new ArrayList<>();
    static List<String> files = new ArrayList<>();
    static Map<String, String> filesContent = new HashMap<>();
    static Arena fuseScope = null;


    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, IOException {
        args = new String[]{"-f", "-d", "/home/david/test/"};


        // Fuse Main Method
        // fuse_main_real(argc, argv, op, sizeof(*(op)), private_data)

    }

    public static int getAttr(MemorySegment path, MemorySegment statMemorySegment, MemorySegment fi) {

        System.out.println("getting some attributes");
        String jPath = path.getString(0);

        int S_IFDIR = 0040000; /* directory */
        int S_IFREG = 0100000; /* regular */

        // setting the stat atim (last access time)
        Instant now = Instant.now();
        timespec.tv_sec(stat.st_atim(statMemorySegment), now.getEpochSecond());
        timespec.tv_nsec(stat.st_atim(statMemorySegment), now.getNano());

        // setting the stat mtim (last modify time)
        timespec.tv_sec(stat.st_mtim(statMemorySegment), now.getEpochSecond());
        timespec.tv_nsec(stat.st_mtim(statMemorySegment), now.getNano());

        stat.st_uid(statMemorySegment, 1000);
        stat.st_gid(statMemorySegment, 1000);

        if ("/".equals(jPath) || isDir(jPath.substring(1))) {
            stat.st_mode(statMemorySegment, (short) (S_IFDIR | 0755));
            stat.st_nlink(statMemorySegment, 2);
        } else if (isFile(jPath.substring(1))) {
            stat.st_mode(statMemorySegment, S_IFREG | 0644);
            stat.st_nlink(statMemorySegment, 1);
            stat.st_size(statMemorySegment, filesContent.get(jPath.substring(1)).getBytes().length);
        } else {
            return -2;
        }

        return 0;
    }

    public static int readDir(MemorySegment path, MemorySegment buffer, MemorySegment filler, long offset, MemorySegment fileInfo, int flags) {

        fuse_fill_dir_t.invoke(filler, buffer, fuseScope.allocateFrom("."), MemorySegment.NULL, 0, 0);
        fuse_fill_dir_t.invoke(filler, buffer, fuseScope.allocateFrom(".."), MemorySegment.NULL, 0, 0);

        String jPath = path.getString(0);

        if ("/".equals(jPath)) {
            for (String p : directories) {
                fuse_fill_dir_t.invoke(filler, buffer, fuseScope.allocateFrom(p), MemorySegment.NULL, 0, 0);
            }

            for (String p : files) {
                fuse_fill_dir_t.invoke(filler, buffer, fuseScope.allocateFrom(p), MemorySegment.NULL, 0, 0);
            }
        }

        return 0;
    }

    static int doMknod(MemorySegment path, int mode, long rdev) {
        String jPath = path.getString(0);
        addFile(jPath.substring(1));
        return 0;
    }

    // read(const char* path, char *buf, size_t size, off_t offset, struct fuse_file_info* fi)
    public static int read(MemorySegment path, MemorySegment buffer, long size, long offset, MemorySegment fileInfo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // mkdir(const char* path, mode_t mode)
    static int doMkdir(MemorySegment path, int mode) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // write(const char* path, char *buf, size_t size, off_t offset, struct fuse_file_info* fi)
    static int doWrite(MemorySegment path, MemorySegment buffer, long size, long offset, MemorySegment info) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    static boolean isDir(String path) {
        return directories.contains(path);
    }
    static void addFile(String filename) {
        files.add(filename);
        filesContent.put(filename, "");
    }
    static boolean isFile(String path) {
        return files.contains(path);
    }

    static StructLayout getFuseOpsLayout() {
        return MemoryLayout.structLayout(
                ValueLayout.ADDRESS.withName("getattr"),
                ValueLayout.ADDRESS.withName("readlink"),
                ValueLayout.ADDRESS.withName("mknod"),
                ValueLayout.ADDRESS.withName("mkdir"),
                ValueLayout.ADDRESS.withName("unlink"),
                ValueLayout.ADDRESS.withName("rmdir"),
                ValueLayout.ADDRESS.withName("symlink"),
                ValueLayout.ADDRESS.withName("rename"),
                ValueLayout.ADDRESS.withName("link"),
                ValueLayout.ADDRESS.withName("chmod"),
                ValueLayout.ADDRESS.withName("chown"),
                ValueLayout.ADDRESS.withName("truncate"),
                ValueLayout.ADDRESS.withName("open"),
                ValueLayout.ADDRESS.withName("read"),
                ValueLayout.ADDRESS.withName("write"),
                ValueLayout.ADDRESS.withName("statfs"),
                ValueLayout.ADDRESS.withName("flush"),
                ValueLayout.ADDRESS.withName("release"),
                ValueLayout.ADDRESS.withName("fsync"),
                ValueLayout.ADDRESS.withName("setxattr"),
                ValueLayout.ADDRESS.withName("getxattr"),
                ValueLayout.ADDRESS.withName("listxattr"),
                ValueLayout.ADDRESS.withName("removexattr"),
                ValueLayout.ADDRESS.withName("opendir"),
                ValueLayout.ADDRESS.withName("readdir"),
                ValueLayout.ADDRESS.withName("releasedir"),
                ValueLayout.ADDRESS.withName("fsyncdir"),
                ValueLayout.ADDRESS.withName("init"),
                ValueLayout.ADDRESS.withName("destroy"),
                ValueLayout.ADDRESS.withName("access"),
                ValueLayout.ADDRESS.withName("create"),
                ValueLayout.ADDRESS.withName("lock"),
                ValueLayout.ADDRESS.withName("utimens"),
                ValueLayout.ADDRESS.withName("bmap"),
                ValueLayout.ADDRESS.withName("ioctl"),
                ValueLayout.ADDRESS.withName("poll"),
                ValueLayout.ADDRESS.withName("write_buf"),
                ValueLayout.ADDRESS.withName("read_buf"),
                ValueLayout.ADDRESS.withName("flock"),
                ValueLayout.ADDRESS.withName("fallocate"),
                ValueLayout.ADDRESS.withName("copy_file_range"),
                ValueLayout.ADDRESS.withName("lseek")
        ).withName("fuse_operations");
    }

}
