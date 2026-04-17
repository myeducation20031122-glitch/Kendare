package a5;

import android.os.Parcel;
import android.os.Parcelable;
import j4.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o extends b5.a {
    public static final Parcelable.Creator<o> CREATOR = new m2(23);

    /* renamed from: b, reason: collision with root package name */
    public final int f368b;

    /* renamed from: e, reason: collision with root package name */
    public final int f369e;

    /* renamed from: f, reason: collision with root package name */
    public final int f370f;

    /* renamed from: j, reason: collision with root package name */
    public final long f371j;

    /* renamed from: m, reason: collision with root package name */
    public final long f372m;

    /* renamed from: n, reason: collision with root package name */
    public final String f373n;

    /* renamed from: t, reason: collision with root package name */
    public final String f374t;

    /* renamed from: u, reason: collision with root package name */
    public final int f375u;

    /* renamed from: w, reason: collision with root package name */
    public final int f376w;

    public o(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f368b = i10;
        this.f369e = i11;
        this.f370f = i12;
        this.f371j = j10;
        this.f372m = j11;
        this.f373n = str;
        this.f374t = str2;
        this.f375u = i13;
        this.f376w = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f368b);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f369e);
        com.bumptech.glide.e.i0(parcel, 3, 4);
        parcel.writeInt(this.f370f);
        com.bumptech.glide.e.i0(parcel, 4, 8);
        parcel.writeLong(this.f371j);
        com.bumptech.glide.e.i0(parcel, 5, 8);
        parcel.writeLong(this.f372m);
        com.bumptech.glide.e.X(parcel, 6, this.f373n);
        com.bumptech.glide.e.X(parcel, 7, this.f374t);
        com.bumptech.glide.e.i0(parcel, 8, 4);
        parcel.writeInt(this.f375u);
        com.bumptech.glide.e.i0(parcel, 9, 4);
        parcel.writeInt(this.f376w);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}