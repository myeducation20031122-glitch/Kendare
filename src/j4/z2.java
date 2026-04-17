package j4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z2 extends b5.a {
    public static final Parcelable.Creator<z2> CREATOR = new m2(4);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13793b;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13794e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13795f;

    public z2(s2.l lVar) {
        this(lVar.f16760a, lVar.f16761b, lVar.f16762c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f13793b ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 3, 4);
        parcel.writeInt(this.f13794e ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 4, 4);
        parcel.writeInt(this.f13795f ? 1 : 0);
        com.bumptech.glide.e.h0(parcel, iC0);
    }

    public z2(boolean z7, boolean z10, boolean z11) {
        this.f13793b = z7;
        this.f13794e = z10;
        this.f13795f = z11;
    }
}