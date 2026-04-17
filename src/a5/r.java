package a5;

import android.os.Parcel;
import android.os.Parcelable;
import j4.m2;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r extends b5.a {
    public static final Parcelable.Creator<r> CREATOR = new m2(22);

    /* renamed from: b, reason: collision with root package name */
    public final int f393b;

    /* renamed from: e, reason: collision with root package name */
    public List f394e;

    public r(int i10, List list) {
        this.f393b = i10;
        this.f394e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f393b);
        com.bumptech.glide.e.b0(parcel, 2, this.f394e);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}