package r5;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.ic1;
import fc.t;
import java.util.Arrays;
import o5.y;
import p5.p;
import p5.u;
import x4.n;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends b5.a {
    public static final Parcelable.Creator<a> CREATOR = new n(11);

    /* renamed from: b, reason: collision with root package name */
    public final long f16516b;

    /* renamed from: e, reason: collision with root package name */
    public final int f16517e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16518f;

    /* renamed from: j, reason: collision with root package name */
    public final long f16519j;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f16520m;

    /* renamed from: n, reason: collision with root package name */
    public final int f16521n;

    /* renamed from: t, reason: collision with root package name */
    public final String f16522t;

    /* renamed from: u, reason: collision with root package name */
    public final WorkSource f16523u;

    /* renamed from: w, reason: collision with root package name */
    public final p f16524w;

    public a(long j10, int i10, int i11, long j11, boolean z7, int i12, String str, WorkSource workSource, p pVar) {
        boolean z10 = true;
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            z10 = false;
        }
        t.c(z10);
        this.f16516b = j10;
        this.f16517e = i10;
        this.f16518f = i11;
        this.f16519j = j11;
        this.f16520m = z7;
        this.f16521n = i12;
        this.f16522t = str;
        this.f16523u = workSource;
        this.f16524w = pVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16516b == aVar.f16516b && this.f16517e == aVar.f16517e && this.f16518f == aVar.f16518f && this.f16519j == aVar.f16519j && this.f16520m == aVar.f16520m && this.f16521n == aVar.f16521n && y.i(this.f16522t, aVar.f16522t) && y.i(this.f16523u, aVar.f16523u) && y.i(this.f16524w, aVar.f16524w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f16516b), Integer.valueOf(this.f16517e), Integer.valueOf(this.f16518f), Long.valueOf(this.f16519j)});
    }

    public final String toString() {
        String str;
        StringBuilder sbN = ic1.n("CurrentLocationRequest[");
        sbN.append(dq0.k1(this.f16518f));
        long j10 = this.f16516b;
        if (j10 != Long.MAX_VALUE) {
            sbN.append(", maxAge=");
            u.a(j10, sbN);
        }
        long j11 = this.f16519j;
        if (j11 != Long.MAX_VALUE) {
            sbN.append(", duration=");
            sbN.append(j11);
            sbN.append("ms");
        }
        int i10 = this.f16517e;
        if (i10 != 0) {
            sbN.append(", ");
            sbN.append(dq0.h1(i10));
        }
        if (this.f16520m) {
            sbN.append(", bypass");
        }
        int i11 = this.f16521n;
        if (i11 != 0) {
            sbN.append(", ");
            if (i11 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i11 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i11 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "THROTTLE_NEVER";
            }
            sbN.append(str);
        }
        String str2 = this.f16522t;
        if (str2 != null) {
            sbN.append(", moduleId=");
            sbN.append(str2);
        }
        WorkSource workSource = this.f16523u;
        if (!e5.e.c(workSource)) {
            sbN.append(", workSource=");
            sbN.append(workSource);
        }
        p pVar = this.f16524w;
        if (pVar != null) {
            sbN.append(", impersonation=");
            sbN.append(pVar);
        }
        sbN.append(']');
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 8);
        parcel.writeLong(this.f16516b);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f16517e);
        com.bumptech.glide.e.i0(parcel, 3, 4);
        parcel.writeInt(this.f16518f);
        com.bumptech.glide.e.i0(parcel, 4, 8);
        parcel.writeLong(this.f16519j);
        com.bumptech.glide.e.i0(parcel, 5, 4);
        parcel.writeInt(this.f16520m ? 1 : 0);
        com.bumptech.glide.e.W(parcel, 6, this.f16523u, i10);
        com.bumptech.glide.e.i0(parcel, 7, 4);
        parcel.writeInt(this.f16521n);
        com.bumptech.glide.e.X(parcel, 8, this.f16522t);
        com.bumptech.glide.e.W(parcel, 9, this.f16524w, i10);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}