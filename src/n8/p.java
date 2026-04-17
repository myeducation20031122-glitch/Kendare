package n8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p extends b5.a {
    public static final Parcelable.Creator<p> CREATOR = new com.google.android.material.datepicker.d(4);

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f15431b;

    public p(Bundle bundle) {
        this.f15431b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.T(parcel, 2, this.f15431b);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}