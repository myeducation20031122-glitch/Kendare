package u4;

import android.os.Parcel;
import android.os.Parcelable;
import j4.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends b5.a {
    public static final Parcelable.Creator<c> CREATOR = new m2(14);

    /* renamed from: b, reason: collision with root package name */
    public final String f18274b;

    /* renamed from: e, reason: collision with root package name */
    public final String f18275e;

    public c(String str, String str2) {
        this.f18274b = str;
        this.f18275e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.X(parcel, 1, this.f18274b);
        com.bumptech.glide.e.X(parcel, 2, this.f18275e);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}