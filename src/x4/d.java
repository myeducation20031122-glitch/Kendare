package x4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends b5.a {
    public static final Parcelable.Creator<d> CREATOR = new n(1);

    /* renamed from: b, reason: collision with root package name */
    public final String f18958b;

    /* renamed from: e, reason: collision with root package name */
    public final int f18959e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18960f;

    public d(int i10, String str, long j10) {
        this.f18958b = str;
        this.f18959e = i10;
        this.f18960f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f18958b;
            if (((str != null && str.equals(dVar.f18958b)) || (str == null && dVar.f18958b == null)) && h() == dVar.h()) {
                return true;
            }
        }
        return false;
    }

    public final long h() {
        long j10 = this.f18960f;
        return j10 == -1 ? this.f18959e : j10;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18958b, Long.valueOf(h())});
    }

    public final String toString() {
        d3.d dVar = new d3.d(this);
        dVar.a(this.f18958b, "name");
        dVar.a(Long.valueOf(h()), "version");
        return dVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.X(parcel, 1, this.f18958b);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f18959e);
        long jH = h();
        com.bumptech.glide.e.i0(parcel, 3, 8);
        parcel.writeLong(jH);
        com.bumptech.glide.e.h0(parcel, iC0);
    }

    public d(String str, long j10) {
        this.f18958b = str;
        this.f18960f = j10;
        this.f18959e = -1;
    }
}