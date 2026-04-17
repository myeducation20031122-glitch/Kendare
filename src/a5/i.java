package a5;

import android.os.Parcel;
import android.os.Parcelable;
import j4.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends b5.a {
    public static final Parcelable.Creator<i> CREATOR = new m2(28);

    /* renamed from: b, reason: collision with root package name */
    public final q f339b;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f340e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f341f;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f342j;

    /* renamed from: m, reason: collision with root package name */
    public final int f343m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f344n;

    public i(q qVar, boolean z7, boolean z10, int[] iArr, int i10, int[] iArr2) {
        this.f339b = qVar;
        this.f340e = z7;
        this.f341f = z10;
        this.f342j = iArr;
        this.f343m = i10;
        this.f344n = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.W(parcel, 1, this.f339b, i10);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f340e ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 3, 4);
        parcel.writeInt(this.f341f ? 1 : 0);
        int[] iArr = this.f342j;
        if (iArr != null) {
            int iC02 = com.bumptech.glide.e.c0(parcel, 4);
            parcel.writeIntArray(iArr);
            com.bumptech.glide.e.h0(parcel, iC02);
        }
        com.bumptech.glide.e.i0(parcel, 5, 4);
        parcel.writeInt(this.f343m);
        int[] iArr2 = this.f344n;
        if (iArr2 != null) {
            int iC03 = com.bumptech.glide.e.c0(parcel, 6);
            parcel.writeIntArray(iArr2);
            com.bumptech.glide.e.h0(parcel, iC03);
        }
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}