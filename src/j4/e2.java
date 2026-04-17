package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e2 extends b5.a {
    public static final Parcelable.Creator<e2> CREATOR = new m2(1);

    /* renamed from: b, reason: collision with root package name */
    public final int f13674b;

    /* renamed from: e, reason: collision with root package name */
    public final String f13675e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13676f;

    /* renamed from: j, reason: collision with root package name */
    public e2 f13677j;

    /* renamed from: m, reason: collision with root package name */
    public IBinder f13678m;

    public e2(int i10, String str, String str2, e2 e2Var, IBinder iBinder) {
        this.f13674b = i10;
        this.f13675e = str;
        this.f13676f = str2;
        this.f13677j = e2Var;
        this.f13678m = iBinder;
    }

    public final w4.j h() {
        w4.j jVar;
        e2 e2Var = this.f13677j;
        if (e2Var == null) {
            jVar = null;
        } else {
            jVar = new w4.j(e2Var.f13675e, e2Var.f13674b, e2Var.f13676f);
        }
        return new w4.j(this.f13674b, this.f13675e, this.f13676f, jVar);
    }

    public final c4.l l() {
        w4.j jVar;
        u1 s1Var;
        e2 e2Var = this.f13677j;
        if (e2Var == null) {
            jVar = null;
        } else {
            jVar = new w4.j(e2Var.f13675e, e2Var.f13674b, e2Var.f13676f);
        }
        int i10 = this.f13674b;
        String str = this.f13675e;
        String str2 = this.f13676f;
        IBinder iBinder = this.f13678m;
        if (iBinder == null) {
            s1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            s1Var = iInterfaceQueryLocalInterface instanceof u1 ? (u1) iInterfaceQueryLocalInterface : new s1(iBinder);
        }
        return new c4.l(i10, str, str2, jVar, s1Var != null ? new c4.q(s1Var) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.i0(parcel, 1, 4);
        parcel.writeInt(this.f13674b);
        com.bumptech.glide.e.X(parcel, 2, this.f13675e);
        com.bumptech.glide.e.X(parcel, 3, this.f13676f);
        com.bumptech.glide.e.W(parcel, 4, this.f13677j, i10);
        com.bumptech.glide.e.V(parcel, 5, this.f13678m);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}