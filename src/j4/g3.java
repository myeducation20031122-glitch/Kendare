package j4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g3 extends b5.a {
    public static final Parcelable.Creator<g3> CREATOR = new m2(7);

    /* renamed from: b, reason: collision with root package name */
    public final int f13714b;

    /* renamed from: e, reason: collision with root package name */
    public final int f13715e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13716f;

    /* renamed from: j, reason: collision with root package name */
    public final long f13717j;

    public g3(int i10, int i11, long j10, String str) {
        this.f13714b = i10;
        this.f13715e = i11;
        this.f13716f = str;
        this.f13717j = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f13714b);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f13715e);
        com.bumptech.glide.e.X(parcel, 3, this.f13716f);
        com.bumptech.glide.e.i0(parcel, 4, 8);
        parcel.writeLong(this.f13717j);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}