package p5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d0 extends b5.a implements y4.n {
    public static final Parcelable.Creator<d0> CREATOR = new x4.n(9);

    /* renamed from: b, reason: collision with root package name */
    public final Status f15948b;

    public d0(Status status) {
        this.f15948b = status;
    }

    @Override // y4.n
    public final Status a() {
        return this.f15948b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.W(parcel, 1, this.f15948b, i10);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}