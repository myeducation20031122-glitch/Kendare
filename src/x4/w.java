package x4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.play_billing.i0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w extends b5.a {
    public static final Parcelable.Creator<w> CREATOR = new n(3);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18997b;

    /* renamed from: e, reason: collision with root package name */
    public final String f18998e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18999f;

    /* renamed from: j, reason: collision with root package name */
    public final int f19000j;

    public w(String str, int i10, int i11, boolean z7) {
        this.f18997b = z7;
        this.f18998e = str;
        this.f18999f = i0.e(i10) - 1;
        this.f19000j = com.bumptech.glide.c.i(i11) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f18997b ? 1 : 0);
        com.bumptech.glide.e.X(parcel, 2, this.f18998e);
        com.bumptech.glide.e.i0(parcel, 3, 4);
        parcel.writeInt(this.f18999f);
        com.bumptech.glide.e.i0(parcel, 4, 4);
        parcel.writeInt(this.f19000j);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}