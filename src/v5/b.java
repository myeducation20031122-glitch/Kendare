package v5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import y4.n;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends b5.a implements n {
    public static final Parcelable.Creator<b> CREATOR = new x4.n(23);

    /* renamed from: b, reason: collision with root package name */
    public final int f18402b;

    /* renamed from: e, reason: collision with root package name */
    public final int f18403e;

    /* renamed from: f, reason: collision with root package name */
    public final Intent f18404f;

    public b(int i10, int i11, Intent intent) {
        this.f18402b = i10;
        this.f18403e = i11;
        this.f18404f = intent;
    }

    @Override // y4.n
    public final Status a() {
        return this.f18403e == 0 ? Status.f2478m : Status.f2481u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f18402b);
        com.bumptech.glide.e.i0(parcel, 2, 4);
        parcel.writeInt(this.f18403e);
        com.bumptech.glide.e.W(parcel, 3, this.f18404f, i10);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}