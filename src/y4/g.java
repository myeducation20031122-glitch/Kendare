package y4;

import io.reactivex.internal.fuseable.QueueFuseable;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class g {
    public static final int API_NOT_CONNECTED = 17;
    public static final int CANCELED = 16;
    public static final int CONNECTION_SUSPENDED_DURING_CALL = 20;
    public static final int DEVELOPER_ERROR = 10;
    public static final int ERROR = 13;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 14;
    public static final int INVALID_ACCOUNT = 5;
    public static final int NETWORK_ERROR = 7;
    public static final int RECONNECTION_TIMED_OUT = 22;
    public static final int RECONNECTION_TIMED_OUT_DURING_UPDATE = 21;
    public static final int REMOTE_EXCEPTION = 19;
    public static final int RESOLUTION_REQUIRED = 6;

    @Deprecated
    public static final int SERVICE_DISABLED = 3;

    @Deprecated
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int SUCCESS_CACHE = -1;
    public static final int TIMEOUT = 15;

    public static String getStatusCodeString(int i10) {
        switch (i10) {
            case SUCCESS_CACHE /* -1 */:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case QueueFuseable.SYNC /* 1 */:
            case 9:
            case 11:
            case 12:
            default:
                return r.d("unknown status code: ", i10);
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case INVALID_ACCOUNT /* 5 */:
                return "INVALID_ACCOUNT";
            case RESOLUTION_REQUIRED /* 6 */:
                return "RESOLUTION_REQUIRED";
            case NETWORK_ERROR /* 7 */:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case DEVELOPER_ERROR /* 10 */:
                return "DEVELOPER_ERROR";
            case ERROR /* 13 */:
                return "ERROR";
            case INTERRUPTED /* 14 */:
                return "INTERRUPTED";
            case TIMEOUT /* 15 */:
                return "TIMEOUT";
            case CANCELED /* 16 */:
                return "CANCELED";
            case API_NOT_CONNECTED /* 17 */:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case REMOTE_EXCEPTION /* 19 */:
                return "REMOTE_EXCEPTION";
            case CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case RECONNECTION_TIMED_OUT /* 22 */:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}