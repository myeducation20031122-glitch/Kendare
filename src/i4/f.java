package i4;

import android.os.Parcel;
import android.os.Parcelable;
import j4.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends b5.a {
    public static final Parcelable.Creator<f> CREATOR = new m2(13);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13324b;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13325e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13326f;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f13327j;

    /* renamed from: m, reason: collision with root package name */
    public final float f13328m;

    /* renamed from: n, reason: collision with root package name */
    public final int f13329n;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f13330t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f13331u;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f13332w;

    public f(boolean z7, boolean z10, String str, boolean z11, float f10, int i10, boolean z12, boolean z13, boolean z14) {
        this.f13324b = z7;
        this.f13325e = z10;
        this.f13326f = str;
        this.f13327j = z11;
        this.f13328m = f10;
        this.f13329n = i10;
        this.f13330t = z12;
        this.f13331u = z13;
        this.f13332w = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f13324b ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 3, 4);
        parcel.writeInt(this.f13325e ? 1 : 0);
        com.bumptech.glide.e.X(parcel, 4, this.f13326f);
        com.bumptech.glide.e.i0(parcel, 5, 4);
        parcel.writeInt(this.f13327j ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 6, 4);
        parcel.writeFloat(this.f13328m);
        com.bumptech.glide.e.i0(parcel, 7, 4);
        parcel.writeInt(this.f13329n);
        com.bumptech.glide.e.i0(parcel, 8, 4);
        parcel.writeInt(this.f13330t ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 9, 4);
        parcel.writeInt(this.f13331u ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 10, 4);
        parcel.writeInt(this.f13332w ? 1 : 0);
        com.bumptech.glide.e.h0(parcel, iC0);
    }

    public f(boolean z7, boolean z10, boolean z11, float f10, boolean z12, boolean z13, boolean z14) {
        this(z7, z10, null, z11, f10, -1, z12, z13, z14);
    }
}