package a5;

import android.os.Parcel;
import android.os.Parcelable;
import j4.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q extends b5.a {
    public static final Parcelable.Creator<q> CREATOR = new m2(26);

    /* renamed from: b, reason: collision with root package name */
    public final int f388b;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f389e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f390f;

    /* renamed from: j, reason: collision with root package name */
    public final int f391j;

    /* renamed from: m, reason: collision with root package name */
    public final int f392m;

    public q(int i10, boolean z7, boolean z10, int i11, int i12) {
        this.f388b = i10;
        this.f389e = z7;
        this.f390f = z10;
        this.f391j = i11;
        this.f392m = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f388b);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f389e ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 3, 4);
        parcel.writeInt(this.f390f ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 4, 4);
        parcel.writeInt(this.f391j);
        com.bumptech.glide.e.i0(parcel, 5, 4);
        parcel.writeInt(this.f392m);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}