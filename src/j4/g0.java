package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.bb;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g0 extends x9 implements i0 {
    public g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager", 0);
    }

    @Override // j4.i0
    public final void A1(i3 i3Var) {
        Parcel parcelT = T();
        z9.c(parcelT, i3Var);
        q2(parcelT, 39);
    }

    @Override // j4.i0
    public final void B1(w wVar) {
        Parcel parcelT = T();
        z9.e(parcelT, wVar);
        q2(parcelT, 7);
    }

    @Override // j4.i0
    public final void G2(p0 p0Var) {
        Parcel parcelT = T();
        z9.e(parcelT, p0Var);
        q2(parcelT, 8);
    }

    @Override // j4.i0
    public final void L0(h5.a aVar) {
        Parcel parcelT = T();
        z9.e(parcelT, aVar);
        q2(parcelT, 44);
    }

    @Override // j4.i0
    public final void M0(c3 c3Var, y yVar) {
        Parcel parcelT = T();
        z9.c(parcelT, c3Var);
        z9.e(parcelT, yVar);
        q2(parcelT, 43);
    }

    @Override // j4.i0
    public final void Q1(boolean z7) {
        Parcel parcelT = T();
        ClassLoader classLoader = z9.f10427a;
        parcelT.writeInt(z7 ? 1 : 0);
        q2(parcelT, 34);
    }

    @Override // j4.i0
    public final void T0(t tVar) {
        Parcel parcelT = T();
        z9.e(parcelT, tVar);
        q2(parcelT, 20);
    }

    @Override // j4.i0
    public final void V1(v0 v0Var) {
        Parcel parcelT = T();
        z9.e(parcelT, v0Var);
        q2(parcelT, 45);
    }

    @Override // j4.i0
    public final void a1() {
        q2(T(), 5);
    }

    @Override // j4.i0
    public final void g0(f3 f3Var) {
        Parcel parcelT = T();
        z9.c(parcelT, f3Var);
        q2(parcelT, 13);
    }

    @Override // j4.i0
    public final void g1(n1 n1Var) {
        Parcel parcelT = T();
        z9.e(parcelT, n1Var);
        q2(parcelT, 42);
    }

    @Override // j4.i0
    public final void i() {
        q2(T(), 2);
    }

    @Override // j4.i0
    public final void i2(bb bbVar) {
        Parcel parcelT = T();
        z9.e(parcelT, bbVar);
        q2(parcelT, 40);
    }

    @Override // j4.i0
    public final void i3(boolean z7) {
        Parcel parcelT = T();
        ClassLoader classLoader = z9.f10427a;
        parcelT.writeInt(z7 ? 1 : 0);
        q2(parcelT, 22);
    }

    @Override // j4.i0
    public final void k() {
        q2(T(), 6);
    }

    @Override // j4.i0
    public final boolean v0(c3 c3Var) {
        Parcel parcelT = T();
        z9.c(parcelT, c3Var);
        Parcel parcelK2 = k2(parcelT, 4);
        boolean z7 = parcelK2.readInt() != 0;
        parcelK2.recycle();
        return z7;
    }

    @Override // j4.i0
    public final void z1(z2 z2Var) {
        Parcel parcelT = T();
        z9.c(parcelT, z2Var);
        q2(parcelT, 29);
    }

    @Override // j4.i0
    public final f3 zzg() {
        Parcel parcelK2 = k2(T(), 12);
        f3 f3Var = (f3) z9.a(parcelK2, f3.CREATOR);
        parcelK2.recycle();
        return f3Var;
    }

    @Override // j4.i0
    public final u1 zzk() {
        u1 s1Var;
        Parcel parcelK2 = k2(T(), 41);
        IBinder strongBinder = parcelK2.readStrongBinder();
        if (strongBinder == null) {
            s1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            s1Var = iInterfaceQueryLocalInterface instanceof u1 ? (u1) iInterfaceQueryLocalInterface : new s1(strongBinder);
        }
        parcelK2.recycle();
        return s1Var;
    }

    @Override // j4.i0
    public final x1 zzl() {
        x1 v1Var;
        Parcel parcelK2 = k2(T(), 26);
        IBinder strongBinder = parcelK2.readStrongBinder();
        if (strongBinder == null) {
            v1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            v1Var = iInterfaceQueryLocalInterface instanceof x1 ? (x1) iInterfaceQueryLocalInterface : new v1(strongBinder);
        }
        parcelK2.recycle();
        return v1Var;
    }

    @Override // j4.i0
    public final h5.a zzn() {
        return ic1.l(k2(T(), 1));
    }

    @Override // j4.i0
    public final String zzr() {
        Parcel parcelK2 = k2(T(), 31);
        String string = parcelK2.readString();
        parcelK2.recycle();
        return string;
    }
}