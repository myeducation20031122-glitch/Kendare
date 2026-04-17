package l4;

import android.os.Parcel;
import android.os.Parcelable;
import j4.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o extends b5.a {
    public static final Parcelable.Creator<o> CREATOR = new m2(12);

    /* renamed from: b, reason: collision with root package name */
    public final String f14627b;

    /* renamed from: e, reason: collision with root package name */
    public final int f14628e;

    public o(String str, int i10) {
        this.f14627b = str == null ? "" : str;
        this.f14628e = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.X(parcel, 1, this.f14627b);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f14628e);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}