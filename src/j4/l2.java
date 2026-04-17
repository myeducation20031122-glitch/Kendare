package j4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l2 extends b5.a {
    public static final Parcelable.Creator<l2> CREATOR = new m2(0);

    /* renamed from: b, reason: collision with root package name */
    public final int f13759b;

    /* renamed from: e, reason: collision with root package name */
    public final int f13760e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13761f;

    public l2(int i10, int i11, String str) {
        this.f13759b = i10;
        this.f13760e = i11;
        this.f13761f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f13759b);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f13760e);
        com.bumptech.glide.e.X(parcel, 3, this.f13761f);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}