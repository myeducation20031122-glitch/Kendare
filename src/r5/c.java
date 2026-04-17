package r5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.ic1;
import java.util.Arrays;
import o5.y;
import p5.p;
import p5.u;
import x4.n;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends b5.a {
    public static final Parcelable.Creator<c> CREATOR = new n(12);

    /* renamed from: b, reason: collision with root package name */
    public final long f16525b;

    /* renamed from: e, reason: collision with root package name */
    public final int f16526e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16527f;

    /* renamed from: j, reason: collision with root package name */
    public final String f16528j;

    /* renamed from: m, reason: collision with root package name */
    public final p f16529m;

    public c(long j10, int i10, boolean z7, String str, p pVar) {
        this.f16525b = j10;
        this.f16526e = i10;
        this.f16527f = z7;
        this.f16528j = str;
        this.f16529m = pVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f16525b == cVar.f16525b && this.f16526e == cVar.f16526e && this.f16527f == cVar.f16527f && y.i(this.f16528j, cVar.f16528j) && y.i(this.f16529m, cVar.f16529m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f16525b), Integer.valueOf(this.f16526e), Boolean.valueOf(this.f16527f)});
    }

    public final String toString() {
        StringBuilder sbN = ic1.n("LastLocationRequest[");
        long j10 = this.f16525b;
        if (j10 != Long.MAX_VALUE) {
            sbN.append("maxAge=");
            u.a(j10, sbN);
        }
        int i10 = this.f16526e;
        if (i10 != 0) {
            sbN.append(", ");
            sbN.append(dq0.h1(i10));
        }
        if (this.f16527f) {
            sbN.append(", bypass");
        }
        String str = this.f16528j;
        if (str != null) {
            sbN.append(", moduleId=");
            sbN.append(str);
        }
        p pVar = this.f16529m;
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
        parcel.writeLong(this.f16525b);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f16526e);
        com.bumptech.glide.e.i0(parcel, 3, 4);
        parcel.writeInt(this.f16527f ? 1 : 0);
        com.bumptech.glide.e.X(parcel, 4, this.f16528j);
        com.bumptech.glide.e.W(parcel, 5, this.f16529m, i10);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}