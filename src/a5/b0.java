package a5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import j4.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b0 extends b5.a {
    public static final Parcelable.Creator<b0> CREATOR = new m2(25);

    /* renamed from: b, reason: collision with root package name */
    public final int f299b;

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f300e;

    /* renamed from: f, reason: collision with root package name */
    public final x4.b f301f;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f302j;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f303m;

    public b0(int i10, IBinder iBinder, x4.b bVar, boolean z7, boolean z10) {
        this.f299b = i10;
        this.f300e = iBinder;
        this.f301f = bVar;
        this.f302j = z7;
        this.f303m = z10;
    }

    public final boolean equals(Object obj) {
        Object t0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f301f.equals(b0Var.f301f)) {
            int i10 = 2;
            String str = "com.google.android.gms.common.internal.IAccountAccessor";
            Object t0Var2 = null;
            IBinder iBinder = this.f300e;
            if (iBinder == null) {
                t0Var = null;
            } else {
                int i11 = a.f294e;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                t0Var = iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new t0(iBinder, str, i10);
            }
            IBinder iBinder2 = b0Var.f300e;
            if (iBinder2 != null) {
                int i12 = a.f294e;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                t0Var2 = iInterfaceQueryLocalInterface2 instanceof l ? (l) iInterfaceQueryLocalInterface2 : new t0(iBinder2, str, i10);
            }
            if (o5.y.i(t0Var, t0Var2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f299b);
        com.bumptech.glide.e.V(parcel, 2, this.f300e);
        com.bumptech.glide.e.W(parcel, 3, this.f301f, i10);
        com.bumptech.glide.e.i0(parcel, 4, 4);
        parcel.writeInt(this.f302j ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 5, 4);
        parcel.writeInt(this.f303m ? 1 : 0);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}