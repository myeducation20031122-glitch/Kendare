package v5;

import a5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import x4.n;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends b5.a {
    public static final Parcelable.Creator<g> CREATOR = new n(25);

    /* renamed from: b, reason: collision with root package name */
    public final int f18407b;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f18408e;

    public g(int i10, a0 a0Var) {
        this.f18407b = i10;
        this.f18408e = a0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f18407b);
        com.bumptech.glide.e.W(parcel, 2, this.f18408e, i10);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}