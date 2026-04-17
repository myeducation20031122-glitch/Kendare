package j4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a2 extends b5.a {
    public static final Parcelable.Creator<a2> CREATOR = new android.support.v4.media.a(29);

    /* renamed from: b, reason: collision with root package name */
    public final int f13625b;

    public a2(int i10) {
        this.f13625b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f13625b);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}