package w4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import j4.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends b5.a {
    public static final Parcelable.Creator<a> CREATOR = new m2(17);

    /* renamed from: b, reason: collision with root package name */
    public final Intent f18647b;

    public a(Intent intent) {
        this.f18647b = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.W(parcel, 1, this.f18647b, i10);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}