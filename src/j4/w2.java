package j4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w2 extends b5.a {
    public static final Parcelable.Creator<w2> CREATOR = new m2(2);

    /* renamed from: b, reason: collision with root package name */
    public final int f13789b;

    /* renamed from: e, reason: collision with root package name */
    public final int f13790e;

    public w2(int i10, int i11) {
        this.f13789b = i10;
        this.f13790e = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f13789b);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f13790e);
        com.bumptech.glide.e.h0(parcel, iC0);
    }

    public w2(c4.p pVar) {
        this.f13789b = pVar.f2123a;
        this.f13790e = pVar.f2124b;
    }
}