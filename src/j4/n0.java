package j4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n0 extends b5.a {
    public static final Parcelable.Creator<n0> CREATOR = new android.support.v4.media.a(28);

    /* renamed from: b, reason: collision with root package name */
    public final String f13767b;

    /* renamed from: e, reason: collision with root package name */
    public final String f13768e;

    public n0(String str, String str2) {
        this.f13767b = str;
        this.f13768e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.X(parcel, 1, this.f13767b);
        com.bumptech.glide.e.X(parcel, 2, this.f13768e);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}