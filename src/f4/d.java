package f4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import j4.m0;
import j4.o0;
import j4.p0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends b5.a {
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.a(27);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12684b;

    /* renamed from: e, reason: collision with root package name */
    public final p0 f12685e;

    /* renamed from: f, reason: collision with root package name */
    public final IBinder f12686f;

    public d(boolean z7, IBinder iBinder, IBinder iBinder2) {
        p0 m0Var;
        this.f12684b = z7;
        if (iBinder != null) {
            int i10 = o0.f13777b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            m0Var = iInterfaceQueryLocalInterface instanceof p0 ? (p0) iInterfaceQueryLocalInterface : new m0(iBinder);
        } else {
            m0Var = null;
        }
        this.f12685e = m0Var;
        this.f12686f = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f12684b ? 1 : 0);
        p0 p0Var = this.f12685e;
        com.bumptech.glide.e.V(parcel, 2, p0Var == null ? null : p0Var.asBinder());
        com.bumptech.glide.e.V(parcel, 3, this.f12686f);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}