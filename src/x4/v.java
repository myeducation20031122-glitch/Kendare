package x4;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v extends b5.a {
    public static final Parcelable.Creator<v> CREATOR = new n(2);

    /* renamed from: b, reason: collision with root package name */
    public final String f18991b;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18992e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18993f;

    /* renamed from: j, reason: collision with root package name */
    public final Context f18994j;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f18995m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f18996n;

    public v(String str, boolean z7, boolean z10, IBinder iBinder, boolean z11, boolean z12) {
        this.f18991b = str;
        this.f18992e = z7;
        this.f18993f = z10;
        this.f18994j = (Context) h5.b.r3(h5.b.q3(iBinder));
        this.f18995m = z11;
        this.f18996n = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.X(parcel, 1, this.f18991b);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f18992e ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 3, 4);
        parcel.writeInt(this.f18993f ? 1 : 0);
        com.bumptech.glide.e.V(parcel, 4, new h5.b(this.f18994j));
        com.bumptech.glide.e.i0(parcel, 5, 4);
        parcel.writeInt(this.f18995m ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 6, 4);
        parcel.writeInt(this.f18996n ? 1 : 0);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}