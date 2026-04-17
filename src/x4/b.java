package x4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.ic1;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends b5.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f18951b;

    /* renamed from: e, reason: collision with root package name */
    public final int f18952e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f18953f;

    /* renamed from: j, reason: collision with root package name */
    public final String f18954j;

    /* renamed from: m, reason: collision with root package name */
    public static final b f18950m = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new n(0);

    public b(int i10) {
        this(1, i10, null, null);
    }

    public static String m(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case y4.g.SUCCESS_CACHE /* -1 */:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case QueueFuseable.SYNC /* 1 */:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return "INVALID_ACCOUNT";
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return "RESOLUTION_REQUIRED";
            case y4.g.NETWORK_ERROR /* 7 */:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case y4.g.DEVELOPER_ERROR /* 10 */:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case y4.g.ERROR /* 13 */:
                        return "CANCELED";
                    case y4.g.INTERRUPTED /* 14 */:
                        return "TIMEOUT";
                    case y4.g.TIMEOUT /* 15 */:
                        return "INTERRUPTED";
                    case y4.g.CANCELED /* 16 */:
                        return "API_UNAVAILABLE";
                    case y4.g.API_NOT_CONNECTED /* 17 */:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case y4.g.REMOTE_EXCEPTION /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return ic1.m("UNKNOWN_ERROR_CODE(", i10, ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18952e == bVar.f18952e && o5.y.i(this.f18953f, bVar.f18953f) && o5.y.i(this.f18954j, bVar.f18954j);
    }

    public final boolean h() {
        return (this.f18952e == 0 || this.f18953f == null) ? false : true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18952e), this.f18953f, this.f18954j});
    }

    public final boolean l() {
        return this.f18952e == 0;
    }

    public final String toString() {
        d3.d dVar = new d3.d(this);
        dVar.a(m(this.f18952e), "statusCode");
        dVar.a(this.f18953f, "resolution");
        dVar.a(this.f18954j, "message");
        return dVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f18951b);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f18952e);
        com.bumptech.glide.e.W(parcel, 3, this.f18953f, i10);
        com.bumptech.glide.e.X(parcel, 4, this.f18954j);
        com.bumptech.glide.e.h0(parcel, iC0);
    }

    public b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f18951b = i10;
        this.f18952e = i11;
        this.f18953f = pendingIntent;
        this.f18954j = str;
    }

    public b(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}