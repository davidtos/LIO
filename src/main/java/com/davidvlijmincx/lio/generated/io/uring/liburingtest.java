// Generated by jextract

package com.davidvlijmincx.lio.generated.io.uring;

public class liburingtest extends liburingtest_1 {

    public liburingtest() {
        // Should not be called directly
    }
    private static final long FS_IOC32_SETVERSION = 1074034178L;
    /**
     * {@snippet lang=c :
     * #define FS_IOC32_SETVERSION 1074034178
     * }
     */
    public static long FS_IOC32_SETVERSION() {
        return FS_IOC32_SETVERSION;
    }
    private static final long FS_IOC_FSGETXATTR = 2149341215L;
    /**
     * {@snippet lang=c :
     * #define FS_IOC_FSGETXATTR 2149341215
     * }
     */
    public static long FS_IOC_FSGETXATTR() {
        return FS_IOC_FSGETXATTR;
    }
    private static final long FS_IOC_FSSETXATTR = 1075599392L;
    /**
     * {@snippet lang=c :
     * #define FS_IOC_FSSETXATTR 1075599392
     * }
     */
    public static long FS_IOC_FSSETXATTR() {
        return FS_IOC_FSSETXATTR;
    }
    private static final long FS_IOC_GETFSLABEL = 2164298801L;
    /**
     * {@snippet lang=c :
     * #define FS_IOC_GETFSLABEL 2164298801
     * }
     */
    public static long FS_IOC_GETFSLABEL() {
        return FS_IOC_GETFSLABEL;
    }
    private static final long FS_IOC_SETFSLABEL = 1090556978L;
    /**
     * {@snippet lang=c :
     * #define FS_IOC_SETFSLABEL 1090556978
     * }
     */
    public static long FS_IOC_SETFSLABEL() {
        return FS_IOC_SETFSLABEL;
    }
    private static final long FS_IOC_GETFSUUID = 2148603136L;
    /**
     * {@snippet lang=c :
     * #define FS_IOC_GETFSUUID 2148603136
     * }
     */
    public static long FS_IOC_GETFSUUID() {
        return FS_IOC_GETFSUUID;
    }
    private static final long FS_IOC_GETFSSYSFSPATH = 2155943169L;
    /**
     * {@snippet lang=c :
     * #define FS_IOC_GETFSSYSFSPATH 2155943169
     * }
     */
    public static long FS_IOC_GETFSSYSFSPATH() {
        return FS_IOC_GETFSSYSFSPATH;
    }
    private static final int FS_RESERVED_FL = (int)2147483648L;
    /**
     * {@snippet lang=c :
     * #define FS_RESERVED_FL 2147483648
     * }
     */
    public static int FS_RESERVED_FL() {
        return FS_RESERVED_FL;
    }
    private static final int SYNC_FILE_RANGE_WRITE_AND_WAIT = (int)7L;
    /**
     * {@snippet lang=c :
     * #define SYNC_FILE_RANGE_WRITE_AND_WAIT 7
     * }
     */
    public static int SYNC_FILE_RANGE_WRITE_AND_WAIT() {
        return SYNC_FILE_RANGE_WRITE_AND_WAIT;
    }
    private static final int RWF_HIPRI = (int)1L;
    /**
     * {@snippet lang=c :
     * #define RWF_HIPRI 1
     * }
     */
    public static int RWF_HIPRI() {
        return RWF_HIPRI;
    }
    private static final int RWF_DSYNC = (int)2L;
    /**
     * {@snippet lang=c :
     * #define RWF_DSYNC 2
     * }
     */
    public static int RWF_DSYNC() {
        return RWF_DSYNC;
    }
    private static final int RWF_SYNC = (int)4L;
    /**
     * {@snippet lang=c :
     * #define RWF_SYNC 4
     * }
     */
    public static int RWF_SYNC() {
        return RWF_SYNC;
    }
    private static final int RWF_NOWAIT = (int)8L;
    /**
     * {@snippet lang=c :
     * #define RWF_NOWAIT 8
     * }
     */
    public static int RWF_NOWAIT() {
        return RWF_NOWAIT;
    }
    private static final int RWF_APPEND = (int)16L;
    /**
     * {@snippet lang=c :
     * #define RWF_APPEND 16
     * }
     */
    public static int RWF_APPEND() {
        return RWF_APPEND;
    }
    private static final int RWF_NOAPPEND = (int)32L;
    /**
     * {@snippet lang=c :
     * #define RWF_NOAPPEND 32
     * }
     */
    public static int RWF_NOAPPEND() {
        return RWF_NOAPPEND;
    }
    private static final int RWF_SUPPORTED = (int)63L;
    /**
     * {@snippet lang=c :
     * #define RWF_SUPPORTED 63
     * }
     */
    public static int RWF_SUPPORTED() {
        return RWF_SUPPORTED;
    }
    private static final long PAGEMAP_SCAN = 3227543056L;
    /**
     * {@snippet lang=c :
     * #define PAGEMAP_SCAN 3227543056
     * }
     */
    public static long PAGEMAP_SCAN() {
        return PAGEMAP_SCAN;
    }
    private static final int PAGE_IS_WPALLOWED = (int)1L;
    /**
     * {@snippet lang=c :
     * #define PAGE_IS_WPALLOWED 1
     * }
     */
    public static int PAGE_IS_WPALLOWED() {
        return PAGE_IS_WPALLOWED;
    }
    private static final int PAGE_IS_WRITTEN = (int)2L;
    /**
     * {@snippet lang=c :
     * #define PAGE_IS_WRITTEN 2
     * }
     */
    public static int PAGE_IS_WRITTEN() {
        return PAGE_IS_WRITTEN;
    }
    private static final int PAGE_IS_FILE = (int)4L;
    /**
     * {@snippet lang=c :
     * #define PAGE_IS_FILE 4
     * }
     */
    public static int PAGE_IS_FILE() {
        return PAGE_IS_FILE;
    }
    private static final int PAGE_IS_PRESENT = (int)8L;
    /**
     * {@snippet lang=c :
     * #define PAGE_IS_PRESENT 8
     * }
     */
    public static int PAGE_IS_PRESENT() {
        return PAGE_IS_PRESENT;
    }
    private static final int PAGE_IS_SWAPPED = (int)16L;
    /**
     * {@snippet lang=c :
     * #define PAGE_IS_SWAPPED 16
     * }
     */
    public static int PAGE_IS_SWAPPED() {
        return PAGE_IS_SWAPPED;
    }
    private static final int PAGE_IS_PFNZERO = (int)32L;
    /**
     * {@snippet lang=c :
     * #define PAGE_IS_PFNZERO 32
     * }
     */
    public static int PAGE_IS_PFNZERO() {
        return PAGE_IS_PFNZERO;
    }
    private static final int PAGE_IS_HUGE = (int)64L;
    /**
     * {@snippet lang=c :
     * #define PAGE_IS_HUGE 64
     * }
     */
    public static int PAGE_IS_HUGE() {
        return PAGE_IS_HUGE;
    }
    private static final int PAGE_IS_SOFT_DIRTY = (int)128L;
    /**
     * {@snippet lang=c :
     * #define PAGE_IS_SOFT_DIRTY 128
     * }
     */
    public static int PAGE_IS_SOFT_DIRTY() {
        return PAGE_IS_SOFT_DIRTY;
    }
    private static final int PM_SCAN_WP_MATCHING = (int)1L;
    /**
     * {@snippet lang=c :
     * #define PM_SCAN_WP_MATCHING 1
     * }
     */
    public static int PM_SCAN_WP_MATCHING() {
        return PM_SCAN_WP_MATCHING;
    }
    private static final int PM_SCAN_CHECK_WPASYNC = (int)2L;
    /**
     * {@snippet lang=c :
     * #define PM_SCAN_CHECK_WPASYNC 2
     * }
     */
    public static int PM_SCAN_CHECK_WPASYNC() {
        return PM_SCAN_CHECK_WPASYNC;
    }
    private static final int IORING_FILE_INDEX_ALLOC = (int)4294967295L;
    /**
     * {@snippet lang=c :
     * #define IORING_FILE_INDEX_ALLOC 4294967295
     * }
     */
    public static int IORING_FILE_INDEX_ALLOC() {
        return IORING_FILE_INDEX_ALLOC;
    }
    private static final int IOSQE_FIXED_FILE = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IOSQE_FIXED_FILE 1
     * }
     */
    public static int IOSQE_FIXED_FILE() {
        return IOSQE_FIXED_FILE;
    }
    private static final int IOSQE_IO_DRAIN = (int)2L;
    /**
     * {@snippet lang=c :
     * #define IOSQE_IO_DRAIN 2
     * }
     */
    public static int IOSQE_IO_DRAIN() {
        return IOSQE_IO_DRAIN;
    }
    private static final int IOSQE_IO_LINK = (int)4L;
    /**
     * {@snippet lang=c :
     * #define IOSQE_IO_LINK 4
     * }
     */
    public static int IOSQE_IO_LINK() {
        return IOSQE_IO_LINK;
    }
    private static final int IOSQE_IO_HARDLINK = (int)8L;
    /**
     * {@snippet lang=c :
     * #define IOSQE_IO_HARDLINK 8
     * }
     */
    public static int IOSQE_IO_HARDLINK() {
        return IOSQE_IO_HARDLINK;
    }
    private static final int IOSQE_ASYNC = (int)16L;
    /**
     * {@snippet lang=c :
     * #define IOSQE_ASYNC 16
     * }
     */
    public static int IOSQE_ASYNC() {
        return IOSQE_ASYNC;
    }
    private static final int IOSQE_BUFFER_SELECT = (int)32L;
    /**
     * {@snippet lang=c :
     * #define IOSQE_BUFFER_SELECT 32
     * }
     */
    public static int IOSQE_BUFFER_SELECT() {
        return IOSQE_BUFFER_SELECT;
    }
    private static final int IOSQE_CQE_SKIP_SUCCESS = (int)64L;
    /**
     * {@snippet lang=c :
     * #define IOSQE_CQE_SKIP_SUCCESS 64
     * }
     */
    public static int IOSQE_CQE_SKIP_SUCCESS() {
        return IOSQE_CQE_SKIP_SUCCESS;
    }
    private static final int IORING_SETUP_IOPOLL = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_IOPOLL 1
     * }
     */
    public static int IORING_SETUP_IOPOLL() {
        return IORING_SETUP_IOPOLL;
    }
    private static final int IORING_SETUP_SQPOLL = (int)2L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_SQPOLL 2
     * }
     */
    public static int IORING_SETUP_SQPOLL() {
        return IORING_SETUP_SQPOLL;
    }
    private static final int IORING_SETUP_SQ_AFF = (int)4L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_SQ_AFF 4
     * }
     */
    public static int IORING_SETUP_SQ_AFF() {
        return IORING_SETUP_SQ_AFF;
    }
    private static final int IORING_SETUP_CQSIZE = (int)8L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_CQSIZE 8
     * }
     */
    public static int IORING_SETUP_CQSIZE() {
        return IORING_SETUP_CQSIZE;
    }
    private static final int IORING_SETUP_CLAMP = (int)16L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_CLAMP 16
     * }
     */
    public static int IORING_SETUP_CLAMP() {
        return IORING_SETUP_CLAMP;
    }
    private static final int IORING_SETUP_ATTACH_WQ = (int)32L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_ATTACH_WQ 32
     * }
     */
    public static int IORING_SETUP_ATTACH_WQ() {
        return IORING_SETUP_ATTACH_WQ;
    }
    private static final int IORING_SETUP_R_DISABLED = (int)64L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_R_DISABLED 64
     * }
     */
    public static int IORING_SETUP_R_DISABLED() {
        return IORING_SETUP_R_DISABLED;
    }
    private static final int IORING_SETUP_SUBMIT_ALL = (int)128L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_SUBMIT_ALL 128
     * }
     */
    public static int IORING_SETUP_SUBMIT_ALL() {
        return IORING_SETUP_SUBMIT_ALL;
    }
    private static final int IORING_SETUP_COOP_TASKRUN = (int)256L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_COOP_TASKRUN 256
     * }
     */
    public static int IORING_SETUP_COOP_TASKRUN() {
        return IORING_SETUP_COOP_TASKRUN;
    }
    private static final int IORING_SETUP_TASKRUN_FLAG = (int)512L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_TASKRUN_FLAG 512
     * }
     */
    public static int IORING_SETUP_TASKRUN_FLAG() {
        return IORING_SETUP_TASKRUN_FLAG;
    }
    private static final int IORING_SETUP_SQE128 = (int)1024L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_SQE128 1024
     * }
     */
    public static int IORING_SETUP_SQE128() {
        return IORING_SETUP_SQE128;
    }
    private static final int IORING_SETUP_CQE32 = (int)2048L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_CQE32 2048
     * }
     */
    public static int IORING_SETUP_CQE32() {
        return IORING_SETUP_CQE32;
    }
    private static final int IORING_SETUP_SINGLE_ISSUER = (int)4096L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_SINGLE_ISSUER 4096
     * }
     */
    public static int IORING_SETUP_SINGLE_ISSUER() {
        return IORING_SETUP_SINGLE_ISSUER;
    }
    private static final int IORING_SETUP_DEFER_TASKRUN = (int)8192L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_DEFER_TASKRUN 8192
     * }
     */
    public static int IORING_SETUP_DEFER_TASKRUN() {
        return IORING_SETUP_DEFER_TASKRUN;
    }
    private static final int IORING_SETUP_NO_MMAP = (int)16384L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_NO_MMAP 16384
     * }
     */
    public static int IORING_SETUP_NO_MMAP() {
        return IORING_SETUP_NO_MMAP;
    }
    private static final int IORING_SETUP_REGISTERED_FD_ONLY = (int)32768L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_REGISTERED_FD_ONLY 32768
     * }
     */
    public static int IORING_SETUP_REGISTERED_FD_ONLY() {
        return IORING_SETUP_REGISTERED_FD_ONLY;
    }
    private static final int IORING_SETUP_NO_SQARRAY = (int)65536L;
    /**
     * {@snippet lang=c :
     * #define IORING_SETUP_NO_SQARRAY 65536
     * }
     */
    public static int IORING_SETUP_NO_SQARRAY() {
        return IORING_SETUP_NO_SQARRAY;
    }
    private static final int IORING_URING_CMD_FIXED = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_URING_CMD_FIXED 1
     * }
     */
    public static int IORING_URING_CMD_FIXED() {
        return IORING_URING_CMD_FIXED;
    }
    private static final int IORING_URING_CMD_MASK = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_URING_CMD_MASK 1
     * }
     */
    public static int IORING_URING_CMD_MASK() {
        return IORING_URING_CMD_MASK;
    }
    private static final int IORING_FSYNC_DATASYNC = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_FSYNC_DATASYNC 1
     * }
     */
    public static int IORING_FSYNC_DATASYNC() {
        return IORING_FSYNC_DATASYNC;
    }
    private static final int IORING_TIMEOUT_ABS = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_TIMEOUT_ABS 1
     * }
     */
    public static int IORING_TIMEOUT_ABS() {
        return IORING_TIMEOUT_ABS;
    }
    private static final int IORING_TIMEOUT_UPDATE = (int)2L;
    /**
     * {@snippet lang=c :
     * #define IORING_TIMEOUT_UPDATE 2
     * }
     */
    public static int IORING_TIMEOUT_UPDATE() {
        return IORING_TIMEOUT_UPDATE;
    }
    private static final int IORING_TIMEOUT_BOOTTIME = (int)4L;
    /**
     * {@snippet lang=c :
     * #define IORING_TIMEOUT_BOOTTIME 4
     * }
     */
    public static int IORING_TIMEOUT_BOOTTIME() {
        return IORING_TIMEOUT_BOOTTIME;
    }
    private static final int IORING_TIMEOUT_REALTIME = (int)8L;
    /**
     * {@snippet lang=c :
     * #define IORING_TIMEOUT_REALTIME 8
     * }
     */
    public static int IORING_TIMEOUT_REALTIME() {
        return IORING_TIMEOUT_REALTIME;
    }
    private static final int IORING_LINK_TIMEOUT_UPDATE = (int)16L;
    /**
     * {@snippet lang=c :
     * #define IORING_LINK_TIMEOUT_UPDATE 16
     * }
     */
    public static int IORING_LINK_TIMEOUT_UPDATE() {
        return IORING_LINK_TIMEOUT_UPDATE;
    }
    private static final int IORING_TIMEOUT_ETIME_SUCCESS = (int)32L;
    /**
     * {@snippet lang=c :
     * #define IORING_TIMEOUT_ETIME_SUCCESS 32
     * }
     */
    public static int IORING_TIMEOUT_ETIME_SUCCESS() {
        return IORING_TIMEOUT_ETIME_SUCCESS;
    }
    private static final int IORING_TIMEOUT_MULTISHOT = (int)64L;
    /**
     * {@snippet lang=c :
     * #define IORING_TIMEOUT_MULTISHOT 64
     * }
     */
    public static int IORING_TIMEOUT_MULTISHOT() {
        return IORING_TIMEOUT_MULTISHOT;
    }
    private static final int IORING_TIMEOUT_CLOCK_MASK = (int)12L;
    /**
     * {@snippet lang=c :
     * #define IORING_TIMEOUT_CLOCK_MASK 12
     * }
     */
    public static int IORING_TIMEOUT_CLOCK_MASK() {
        return IORING_TIMEOUT_CLOCK_MASK;
    }
    private static final int IORING_TIMEOUT_UPDATE_MASK = (int)18L;
    /**
     * {@snippet lang=c :
     * #define IORING_TIMEOUT_UPDATE_MASK 18
     * }
     */
    public static int IORING_TIMEOUT_UPDATE_MASK() {
        return IORING_TIMEOUT_UPDATE_MASK;
    }
    private static final int SPLICE_F_FD_IN_FIXED = (int)2147483648L;
    /**
     * {@snippet lang=c :
     * #define SPLICE_F_FD_IN_FIXED 2147483648
     * }
     */
    public static int SPLICE_F_FD_IN_FIXED() {
        return SPLICE_F_FD_IN_FIXED;
    }
    private static final int IORING_POLL_ADD_MULTI = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_POLL_ADD_MULTI 1
     * }
     */
    public static int IORING_POLL_ADD_MULTI() {
        return IORING_POLL_ADD_MULTI;
    }
    private static final int IORING_POLL_UPDATE_EVENTS = (int)2L;
    /**
     * {@snippet lang=c :
     * #define IORING_POLL_UPDATE_EVENTS 2
     * }
     */
    public static int IORING_POLL_UPDATE_EVENTS() {
        return IORING_POLL_UPDATE_EVENTS;
    }
    private static final int IORING_POLL_UPDATE_USER_DATA = (int)4L;
    /**
     * {@snippet lang=c :
     * #define IORING_POLL_UPDATE_USER_DATA 4
     * }
     */
    public static int IORING_POLL_UPDATE_USER_DATA() {
        return IORING_POLL_UPDATE_USER_DATA;
    }
    private static final int IORING_POLL_ADD_LEVEL = (int)8L;
    /**
     * {@snippet lang=c :
     * #define IORING_POLL_ADD_LEVEL 8
     * }
     */
    public static int IORING_POLL_ADD_LEVEL() {
        return IORING_POLL_ADD_LEVEL;
    }
    private static final int IORING_ASYNC_CANCEL_ALL = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_ASYNC_CANCEL_ALL 1
     * }
     */
    public static int IORING_ASYNC_CANCEL_ALL() {
        return IORING_ASYNC_CANCEL_ALL;
    }
    private static final int IORING_ASYNC_CANCEL_FD = (int)2L;
    /**
     * {@snippet lang=c :
     * #define IORING_ASYNC_CANCEL_FD 2
     * }
     */
    public static int IORING_ASYNC_CANCEL_FD() {
        return IORING_ASYNC_CANCEL_FD;
    }
    private static final int IORING_ASYNC_CANCEL_ANY = (int)4L;
    /**
     * {@snippet lang=c :
     * #define IORING_ASYNC_CANCEL_ANY 4
     * }
     */
    public static int IORING_ASYNC_CANCEL_ANY() {
        return IORING_ASYNC_CANCEL_ANY;
    }
    private static final int IORING_ASYNC_CANCEL_FD_FIXED = (int)8L;
    /**
     * {@snippet lang=c :
     * #define IORING_ASYNC_CANCEL_FD_FIXED 8
     * }
     */
    public static int IORING_ASYNC_CANCEL_FD_FIXED() {
        return IORING_ASYNC_CANCEL_FD_FIXED;
    }
    private static final int IORING_ASYNC_CANCEL_USERDATA = (int)16L;
    /**
     * {@snippet lang=c :
     * #define IORING_ASYNC_CANCEL_USERDATA 16
     * }
     */
    public static int IORING_ASYNC_CANCEL_USERDATA() {
        return IORING_ASYNC_CANCEL_USERDATA;
    }
    private static final int IORING_ASYNC_CANCEL_OP = (int)32L;
    /**
     * {@snippet lang=c :
     * #define IORING_ASYNC_CANCEL_OP 32
     * }
     */
    public static int IORING_ASYNC_CANCEL_OP() {
        return IORING_ASYNC_CANCEL_OP;
    }
    private static final int IORING_RECVSEND_POLL_FIRST = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_RECVSEND_POLL_FIRST 1
     * }
     */
    public static int IORING_RECVSEND_POLL_FIRST() {
        return IORING_RECVSEND_POLL_FIRST;
    }
    private static final int IORING_RECV_MULTISHOT = (int)2L;
    /**
     * {@snippet lang=c :
     * #define IORING_RECV_MULTISHOT 2
     * }
     */
    public static int IORING_RECV_MULTISHOT() {
        return IORING_RECV_MULTISHOT;
    }
    private static final int IORING_RECVSEND_FIXED_BUF = (int)4L;
    /**
     * {@snippet lang=c :
     * #define IORING_RECVSEND_FIXED_BUF 4
     * }
     */
    public static int IORING_RECVSEND_FIXED_BUF() {
        return IORING_RECVSEND_FIXED_BUF;
    }
    private static final int IORING_SEND_ZC_REPORT_USAGE = (int)8L;
    /**
     * {@snippet lang=c :
     * #define IORING_SEND_ZC_REPORT_USAGE 8
     * }
     */
    public static int IORING_SEND_ZC_REPORT_USAGE() {
        return IORING_SEND_ZC_REPORT_USAGE;
    }
    private static final int IORING_RECVSEND_BUNDLE = (int)16L;
    /**
     * {@snippet lang=c :
     * #define IORING_RECVSEND_BUNDLE 16
     * }
     */
    public static int IORING_RECVSEND_BUNDLE() {
        return IORING_RECVSEND_BUNDLE;
    }
    private static final int IORING_NOTIF_USAGE_ZC_COPIED = (int)2147483648L;
    /**
     * {@snippet lang=c :
     * #define IORING_NOTIF_USAGE_ZC_COPIED 2147483648
     * }
     */
    public static int IORING_NOTIF_USAGE_ZC_COPIED() {
        return IORING_NOTIF_USAGE_ZC_COPIED;
    }
    private static final int IORING_ACCEPT_MULTISHOT = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_ACCEPT_MULTISHOT 1
     * }
     */
    public static int IORING_ACCEPT_MULTISHOT() {
        return IORING_ACCEPT_MULTISHOT;
    }
    private static final int IORING_ACCEPT_DONTWAIT = (int)2L;
    /**
     * {@snippet lang=c :
     * #define IORING_ACCEPT_DONTWAIT 2
     * }
     */
    public static int IORING_ACCEPT_DONTWAIT() {
        return IORING_ACCEPT_DONTWAIT;
    }
    private static final int IORING_ACCEPT_POLL_FIRST = (int)4L;
    /**
     * {@snippet lang=c :
     * #define IORING_ACCEPT_POLL_FIRST 4
     * }
     */
    public static int IORING_ACCEPT_POLL_FIRST() {
        return IORING_ACCEPT_POLL_FIRST;
    }
    private static final int IORING_MSG_RING_CQE_SKIP = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_MSG_RING_CQE_SKIP 1
     * }
     */
    public static int IORING_MSG_RING_CQE_SKIP() {
        return IORING_MSG_RING_CQE_SKIP;
    }
    private static final int IORING_MSG_RING_FLAGS_PASS = (int)2L;
    /**
     * {@snippet lang=c :
     * #define IORING_MSG_RING_FLAGS_PASS 2
     * }
     */
    public static int IORING_MSG_RING_FLAGS_PASS() {
        return IORING_MSG_RING_FLAGS_PASS;
    }
    private static final int IORING_FIXED_FD_NO_CLOEXEC = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_FIXED_FD_NO_CLOEXEC 1
     * }
     */
    public static int IORING_FIXED_FD_NO_CLOEXEC() {
        return IORING_FIXED_FD_NO_CLOEXEC;
    }
    private static final int IORING_NOP_INJECT_RESULT = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_NOP_INJECT_RESULT 1
     * }
     */
    public static int IORING_NOP_INJECT_RESULT() {
        return IORING_NOP_INJECT_RESULT;
    }
    private static final int IORING_CQE_F_BUFFER = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_CQE_F_BUFFER 1
     * }
     */
    public static int IORING_CQE_F_BUFFER() {
        return IORING_CQE_F_BUFFER;
    }
    private static final int IORING_CQE_F_MORE = (int)2L;
    /**
     * {@snippet lang=c :
     * #define IORING_CQE_F_MORE 2
     * }
     */
    public static int IORING_CQE_F_MORE() {
        return IORING_CQE_F_MORE;
    }
    private static final int IORING_CQE_F_SOCK_NONEMPTY = (int)4L;
    /**
     * {@snippet lang=c :
     * #define IORING_CQE_F_SOCK_NONEMPTY 4
     * }
     */
    public static int IORING_CQE_F_SOCK_NONEMPTY() {
        return IORING_CQE_F_SOCK_NONEMPTY;
    }
    private static final int IORING_CQE_F_NOTIF = (int)8L;
    /**
     * {@snippet lang=c :
     * #define IORING_CQE_F_NOTIF 8
     * }
     */
    public static int IORING_CQE_F_NOTIF() {
        return IORING_CQE_F_NOTIF;
    }
    private static final long IORING_OFF_SQ_RING = 0L;
    /**
     * {@snippet lang=c :
     * #define IORING_OFF_SQ_RING 0
     * }
     */
    public static long IORING_OFF_SQ_RING() {
        return IORING_OFF_SQ_RING;
    }
    private static final long IORING_OFF_CQ_RING = 134217728L;
    /**
     * {@snippet lang=c :
     * #define IORING_OFF_CQ_RING 134217728
     * }
     */
    public static long IORING_OFF_CQ_RING() {
        return IORING_OFF_CQ_RING;
    }
    private static final long IORING_OFF_SQES = 268435456L;
    /**
     * {@snippet lang=c :
     * #define IORING_OFF_SQES 268435456
     * }
     */
    public static long IORING_OFF_SQES() {
        return IORING_OFF_SQES;
    }
    private static final long IORING_OFF_PBUF_RING = 2147483648L;
    /**
     * {@snippet lang=c :
     * #define IORING_OFF_PBUF_RING 2147483648
     * }
     */
    public static long IORING_OFF_PBUF_RING() {
        return IORING_OFF_PBUF_RING;
    }
    private static final long IORING_OFF_MMAP_MASK = 4160749568L;
    /**
     * {@snippet lang=c :
     * #define IORING_OFF_MMAP_MASK 4160749568
     * }
     */
    public static long IORING_OFF_MMAP_MASK() {
        return IORING_OFF_MMAP_MASK;
    }
    private static final int IORING_SQ_NEED_WAKEUP = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_SQ_NEED_WAKEUP 1
     * }
     */
    public static int IORING_SQ_NEED_WAKEUP() {
        return IORING_SQ_NEED_WAKEUP;
    }
    private static final int IORING_SQ_CQ_OVERFLOW = (int)2L;
    /**
     * {@snippet lang=c :
     * #define IORING_SQ_CQ_OVERFLOW 2
     * }
     */
    public static int IORING_SQ_CQ_OVERFLOW() {
        return IORING_SQ_CQ_OVERFLOW;
    }
    private static final int IORING_SQ_TASKRUN = (int)4L;
    /**
     * {@snippet lang=c :
     * #define IORING_SQ_TASKRUN 4
     * }
     */
    public static int IORING_SQ_TASKRUN() {
        return IORING_SQ_TASKRUN;
    }
    private static final int IORING_CQ_EVENTFD_DISABLED = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_CQ_EVENTFD_DISABLED 1
     * }
     */
    public static int IORING_CQ_EVENTFD_DISABLED() {
        return IORING_CQ_EVENTFD_DISABLED;
    }
    private static final int IORING_ENTER_GETEVENTS = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_ENTER_GETEVENTS 1
     * }
     */
    public static int IORING_ENTER_GETEVENTS() {
        return IORING_ENTER_GETEVENTS;
    }
    private static final int IORING_ENTER_SQ_WAKEUP = (int)2L;
    /**
     * {@snippet lang=c :
     * #define IORING_ENTER_SQ_WAKEUP 2
     * }
     */
    public static int IORING_ENTER_SQ_WAKEUP() {
        return IORING_ENTER_SQ_WAKEUP;
    }
    private static final int IORING_ENTER_SQ_WAIT = (int)4L;
    /**
     * {@snippet lang=c :
     * #define IORING_ENTER_SQ_WAIT 4
     * }
     */
    public static int IORING_ENTER_SQ_WAIT() {
        return IORING_ENTER_SQ_WAIT;
    }
    private static final int IORING_ENTER_EXT_ARG = (int)8L;
    /**
     * {@snippet lang=c :
     * #define IORING_ENTER_EXT_ARG 8
     * }
     */
    public static int IORING_ENTER_EXT_ARG() {
        return IORING_ENTER_EXT_ARG;
    }
    private static final int IORING_ENTER_REGISTERED_RING = (int)16L;
    /**
     * {@snippet lang=c :
     * #define IORING_ENTER_REGISTERED_RING 16
     * }
     */
    public static int IORING_ENTER_REGISTERED_RING() {
        return IORING_ENTER_REGISTERED_RING;
    }
    private static final int IORING_ENTER_ABS_TIMER = (int)32L;
    /**
     * {@snippet lang=c :
     * #define IORING_ENTER_ABS_TIMER 32
     * }
     */
    public static int IORING_ENTER_ABS_TIMER() {
        return IORING_ENTER_ABS_TIMER;
    }
    private static final int IORING_FEAT_SINGLE_MMAP = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_FEAT_SINGLE_MMAP 1
     * }
     */
    public static int IORING_FEAT_SINGLE_MMAP() {
        return IORING_FEAT_SINGLE_MMAP;
    }
    private static final int IORING_FEAT_NODROP = (int)2L;
    /**
     * {@snippet lang=c :
     * #define IORING_FEAT_NODROP 2
     * }
     */
    public static int IORING_FEAT_NODROP() {
        return IORING_FEAT_NODROP;
    }
    private static final int IORING_FEAT_SUBMIT_STABLE = (int)4L;
    /**
     * {@snippet lang=c :
     * #define IORING_FEAT_SUBMIT_STABLE 4
     * }
     */
    public static int IORING_FEAT_SUBMIT_STABLE() {
        return IORING_FEAT_SUBMIT_STABLE;
    }
    private static final int IORING_FEAT_RW_CUR_POS = (int)8L;
    /**
     * {@snippet lang=c :
     * #define IORING_FEAT_RW_CUR_POS 8
     * }
     */
    public static int IORING_FEAT_RW_CUR_POS() {
        return IORING_FEAT_RW_CUR_POS;
    }
    private static final int IORING_FEAT_CUR_PERSONALITY = (int)16L;
    /**
     * {@snippet lang=c :
     * #define IORING_FEAT_CUR_PERSONALITY 16
     * }
     */
    public static int IORING_FEAT_CUR_PERSONALITY() {
        return IORING_FEAT_CUR_PERSONALITY;
    }
    private static final int IORING_FEAT_FAST_POLL = (int)32L;
    /**
     * {@snippet lang=c :
     * #define IORING_FEAT_FAST_POLL 32
     * }
     */
    public static int IORING_FEAT_FAST_POLL() {
        return IORING_FEAT_FAST_POLL;
    }
    private static final int IORING_FEAT_POLL_32BITS = (int)64L;
    /**
     * {@snippet lang=c :
     * #define IORING_FEAT_POLL_32BITS 64
     * }
     */
    public static int IORING_FEAT_POLL_32BITS() {
        return IORING_FEAT_POLL_32BITS;
    }
    private static final int IORING_FEAT_SQPOLL_NONFIXED = (int)128L;
    /**
     * {@snippet lang=c :
     * #define IORING_FEAT_SQPOLL_NONFIXED 128
     * }
     */
    public static int IORING_FEAT_SQPOLL_NONFIXED() {
        return IORING_FEAT_SQPOLL_NONFIXED;
    }
    private static final int IORING_FEAT_EXT_ARG = (int)256L;
    /**
     * {@snippet lang=c :
     * #define IORING_FEAT_EXT_ARG 256
     * }
     */
    public static int IORING_FEAT_EXT_ARG() {
        return IORING_FEAT_EXT_ARG;
    }
    private static final int IORING_FEAT_NATIVE_WORKERS = (int)512L;
    /**
     * {@snippet lang=c :
     * #define IORING_FEAT_NATIVE_WORKERS 512
     * }
     */
    public static int IORING_FEAT_NATIVE_WORKERS() {
        return IORING_FEAT_NATIVE_WORKERS;
    }
    private static final int IORING_FEAT_RSRC_TAGS = (int)1024L;
    /**
     * {@snippet lang=c :
     * #define IORING_FEAT_RSRC_TAGS 1024
     * }
     */
    public static int IORING_FEAT_RSRC_TAGS() {
        return IORING_FEAT_RSRC_TAGS;
    }
    private static final int IORING_FEAT_CQE_SKIP = (int)2048L;
    /**
     * {@snippet lang=c :
     * #define IORING_FEAT_CQE_SKIP 2048
     * }
     */
    public static int IORING_FEAT_CQE_SKIP() {
        return IORING_FEAT_CQE_SKIP;
    }
    private static final int IORING_FEAT_LINKED_FILE = (int)4096L;
    /**
     * {@snippet lang=c :
     * #define IORING_FEAT_LINKED_FILE 4096
     * }
     */
    public static int IORING_FEAT_LINKED_FILE() {
        return IORING_FEAT_LINKED_FILE;
    }
    private static final int IORING_FEAT_REG_REG_RING = (int)8192L;
    /**
     * {@snippet lang=c :
     * #define IORING_FEAT_REG_REG_RING 8192
     * }
     */
    public static int IORING_FEAT_REG_REG_RING() {
        return IORING_FEAT_REG_REG_RING;
    }
    private static final int IORING_FEAT_RECVSEND_BUNDLE = (int)16384L;
    /**
     * {@snippet lang=c :
     * #define IORING_FEAT_RECVSEND_BUNDLE 16384
     * }
     */
    public static int IORING_FEAT_RECVSEND_BUNDLE() {
        return IORING_FEAT_RECVSEND_BUNDLE;
    }
    private static final int IORING_RSRC_REGISTER_SPARSE = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IORING_RSRC_REGISTER_SPARSE 1
     * }
     */
    public static int IORING_RSRC_REGISTER_SPARSE() {
        return IORING_RSRC_REGISTER_SPARSE;
    }
    private static final int IORING_REGISTER_FILES_SKIP = (int)-2L;
    /**
     * {@snippet lang=c :
     * #define IORING_REGISTER_FILES_SKIP -2
     * }
     */
    public static int IORING_REGISTER_FILES_SKIP() {
        return IORING_REGISTER_FILES_SKIP;
    }
    private static final int IO_URING_OP_SUPPORTED = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IO_URING_OP_SUPPORTED 1
     * }
     */
    public static int IO_URING_OP_SUPPORTED() {
        return IO_URING_OP_SUPPORTED;
    }
    private static final int ATOMIC_BOOL_LOCK_FREE = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ATOMIC_BOOL_LOCK_FREE 2
     * }
     */
    public static int ATOMIC_BOOL_LOCK_FREE() {
        return ATOMIC_BOOL_LOCK_FREE;
    }
    private static final int ATOMIC_CHAR_LOCK_FREE = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ATOMIC_CHAR_LOCK_FREE 2
     * }
     */
    public static int ATOMIC_CHAR_LOCK_FREE() {
        return ATOMIC_CHAR_LOCK_FREE;
    }
    private static final int ATOMIC_CHAR16_T_LOCK_FREE = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ATOMIC_CHAR16_T_LOCK_FREE 2
     * }
     */
    public static int ATOMIC_CHAR16_T_LOCK_FREE() {
        return ATOMIC_CHAR16_T_LOCK_FREE;
    }
    private static final int ATOMIC_CHAR32_T_LOCK_FREE = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ATOMIC_CHAR32_T_LOCK_FREE 2
     * }
     */
    public static int ATOMIC_CHAR32_T_LOCK_FREE() {
        return ATOMIC_CHAR32_T_LOCK_FREE;
    }
    private static final int ATOMIC_WCHAR_T_LOCK_FREE = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ATOMIC_WCHAR_T_LOCK_FREE 2
     * }
     */
    public static int ATOMIC_WCHAR_T_LOCK_FREE() {
        return ATOMIC_WCHAR_T_LOCK_FREE;
    }
    private static final int ATOMIC_SHORT_LOCK_FREE = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ATOMIC_SHORT_LOCK_FREE 2
     * }
     */
    public static int ATOMIC_SHORT_LOCK_FREE() {
        return ATOMIC_SHORT_LOCK_FREE;
    }
    private static final int ATOMIC_INT_LOCK_FREE = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ATOMIC_INT_LOCK_FREE 2
     * }
     */
    public static int ATOMIC_INT_LOCK_FREE() {
        return ATOMIC_INT_LOCK_FREE;
    }
    private static final int ATOMIC_LONG_LOCK_FREE = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ATOMIC_LONG_LOCK_FREE 2
     * }
     */
    public static int ATOMIC_LONG_LOCK_FREE() {
        return ATOMIC_LONG_LOCK_FREE;
    }
    private static final int ATOMIC_LLONG_LOCK_FREE = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ATOMIC_LLONG_LOCK_FREE 2
     * }
     */
    public static int ATOMIC_LLONG_LOCK_FREE() {
        return ATOMIC_LLONG_LOCK_FREE;
    }
    private static final int ATOMIC_POINTER_LOCK_FREE = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ATOMIC_POINTER_LOCK_FREE 2
     * }
     */
    public static int ATOMIC_POINTER_LOCK_FREE() {
        return ATOMIC_POINTER_LOCK_FREE;
    }
    private static final long LIBURING_UDATA_TIMEOUT = -1L;
    /**
     * {@snippet lang=c :
     * #define LIBURING_UDATA_TIMEOUT -1
     * }
     */
    public static long LIBURING_UDATA_TIMEOUT() {
        return LIBURING_UDATA_TIMEOUT;
    }
}
