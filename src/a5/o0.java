package a5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j4.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o0 extends b5.a {
    public static final Parcelable.Creator<o0> CREATOR = new m2(27);

    /* renamed from: b, reason: collision with root package name */
    public Bundle f377b;

    /* renamed from: e, reason: collision with root package name */
    public x4.d[] f378e;

    /* renamed from: f, reason: collision with root package name */
    public int f379f;

    /* renamed from: j, reason: collision with root package name */
    public i f380j;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.T(parcel, 1, this.f377b);
        com.bumptech.glide.e.a0(parcel, 2, this.f378e, i10);
        com.bumptech.glide.e.i0(parcel, 3, 4);
        parcel.writeInt(this.f379f);
        com.bumptech.glide.e.W(parcel, 4, this.f380j, i10);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}