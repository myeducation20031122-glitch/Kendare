package a5;

import android.os.Parcel;
import android.os.Parcelable;
import j4.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends b5.a {
    public static final Parcelable.Creator<g> CREATOR = new m2(21);

    /* renamed from: b, reason: collision with root package name */
    public final int f327b;

    /* renamed from: e, reason: collision with root package name */
    public final String f328e;

    public g(int i10, String str) {
        this.f327b = i10;
        this.f328e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return gVar.f327b == this.f327b && o5.y.i(gVar.f328e, this.f328e);
    }

    public final int hashCode() {
        return this.f327b;
    }

    public final String toString() {
        return this.f327b + ":" + this.f328e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f327b);
        com.bumptech.glide.e.X(parcel, 2, this.f328e);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}