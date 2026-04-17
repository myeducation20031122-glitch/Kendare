package r5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import x4.n;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends b5.a {
    public static final Parcelable.Creator<f> CREATOR = new n(10);

    /* renamed from: b, reason: collision with root package name */
    public final int f16547b;

    /* renamed from: e, reason: collision with root package name */
    public final int f16548e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16549f;

    /* renamed from: j, reason: collision with root package name */
    public final long f16550j;

    public f(int i10, int i11, long j10, long j11) {
        this.f16547b = i10;
        this.f16548e = i11;
        this.f16549f = j10;
        this.f16550j = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f16547b == fVar.f16547b && this.f16548e == fVar.f16548e && this.f16549f == fVar.f16549f && this.f16550j == fVar.f16550j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16548e), Integer.valueOf(this.f16547b), Long.valueOf(this.f16550j), Long.valueOf(this.f16549f)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f16547b + " Cell status: " + this.f16548e + " elapsed time NS: " + this.f16550j + " system time ms: " + this.f16549f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f16547b);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f16548e);
        com.bumptech.glide.e.i0(parcel, 3, 8);
        parcel.writeLong(this.f16549f);
        com.bumptech.glide.e.i0(parcel, 4, 8);
        parcel.writeLong(this.f16550j);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}