package p5;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t extends b5.a {
    public static final Parcelable.Creator<t> CREATOR = new x4.n(7);

    /* renamed from: b, reason: collision with root package name */
    public final int f15982b;

    /* renamed from: e, reason: collision with root package name */
    public final s f15983e;

    /* renamed from: f, reason: collision with root package name */
    public final r5.m f15984f;

    /* renamed from: j, reason: collision with root package name */
    public final r5.j f15985j;

    /* renamed from: m, reason: collision with root package name */
    public final PendingIntent f15986m;

    /* renamed from: n, reason: collision with root package name */
    public final g0 f15987n;

    /* renamed from: t, reason: collision with root package name */
    public final String f15988t;

    public t(int i10, s sVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        r5.m kVar;
        r5.j hVar;
        this.f15982b = i10;
        this.f15983e = sVar;
        int i11 = 3;
        g0 e0Var = null;
        if (iBinder != null) {
            int i12 = r5.l.f16553e;
            String str2 = "com.google.android.gms.location.ILocationListener";
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            kVar = iInterfaceQueryLocalInterface instanceof r5.m ? (r5.m) iInterfaceQueryLocalInterface : new r5.k(iBinder, str2, i11);
        } else {
            kVar = null;
        }
        this.f15984f = kVar;
        this.f15986m = pendingIntent;
        if (iBinder2 != null) {
            int i13 = r5.i.f16552e;
            String str3 = "com.google.android.gms.location.ILocationCallback";
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            hVar = iInterfaceQueryLocalInterface2 instanceof r5.j ? (r5.j) iInterfaceQueryLocalInterface2 : new r5.h(iBinder2, str3, i11);
        } else {
            hVar = null;
        }
        this.f15985j = hVar;
        if (iBinder3 != null) {
            String str4 = "com.google.android.gms.location.internal.IFusedLocationProviderCallback";
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            e0Var = iInterfaceQueryLocalInterface3 instanceof g0 ? (g0) iInterfaceQueryLocalInterface3 : new e0(iBinder3, str4, i11);
        }
        this.f15987n = e0Var;
        this.f15988t = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f15982b);
        com.bumptech.glide.e.W(parcel, 2, this.f15983e, i10);
        r5.m mVar = this.f15984f;
        com.bumptech.glide.e.V(parcel, 3, mVar == null ? null : mVar.asBinder());
        com.bumptech.glide.e.W(parcel, 4, this.f15986m, i10);
        r5.j jVar = this.f15985j;
        com.bumptech.glide.e.V(parcel, 5, jVar == null ? null : jVar.asBinder());
        g0 g0Var = this.f15987n;
        com.bumptech.glide.e.V(parcel, 6, g0Var != null ? g0Var.asBinder() : null);
        com.bumptech.glide.e.X(parcel, 8, this.f15988t);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}