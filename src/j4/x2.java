package j4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x2 extends b5.a {
    public static final Parcelable.Creator<x2> CREATOR = new m2(3);

    /* renamed from: b, reason: collision with root package name */
    public final String f13791b;

    public x2(String str) {
        this.f13791b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.X(parcel, 15, this.f13791b);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}