package v5;

import a5.b0;
import android.os.Parcel;
import android.os.Parcelable;
import x4.n;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h extends b5.a {
    public static final Parcelable.Creator<h> CREATOR = new n(26);

    /* renamed from: b, reason: collision with root package name */
    public final int f18409b;

    /* renamed from: e, reason: collision with root package name */
    public final x4.b f18410e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f18411f;

    public h(int i10, x4.b bVar, b0 b0Var) {
        this.f18409b = i10;
        this.f18410e = bVar;
        this.f18411f = b0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f18409b);
        com.bumptech.glide.e.W(parcel, 2, this.f18410e, i10);
        com.bumptech.glide.e.W(parcel, 3, this.f18411f, i10);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}