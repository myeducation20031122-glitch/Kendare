package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.an;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.br;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.fn;
import com.google.android.gms.internal.ads.gn;
import com.google.android.gms.internal.ads.hn;
import com.google.android.gms.internal.ads.jp;
import com.google.android.gms.internal.ads.kp;
import com.google.android.gms.internal.ads.lp;
import com.google.android.gms.internal.ads.pg;
import com.google.android.gms.internal.ads.qg;
import com.google.android.gms.internal.ads.rg;
import com.google.android.gms.internal.ads.sf0;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q0 extends x9 implements s0 {
    @Override // j4.s0
    public final rg C1(h5.a aVar, h5.a aVar2) {
        rg pgVar;
        Parcel parcelT = T();
        z9.e(parcelT, aVar);
        z9.e(parcelT, aVar2);
        Parcel parcelK2 = k2(parcelT, 5);
        IBinder strongBinder = parcelK2.readStrongBinder();
        int i10 = qg.f7738b;
        if (strongBinder == null) {
            pgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            pgVar = iInterfaceQueryLocalInterface instanceof rg ? (rg) iInterfaceQueryLocalInterface : new pg(strongBinder);
        }
        parcelK2.recycle();
        return pgVar;
    }

    @Override // j4.s0
    public final i0 H0(h5.a aVar, f3 f3Var, String str, cl clVar, int i10) {
        i0 g0Var;
        Parcel parcelT = T();
        z9.e(parcelT, aVar);
        z9.c(parcelT, f3Var);
        parcelT.writeString(str);
        z9.e(parcelT, clVar);
        parcelT.writeInt(231004000);
        Parcel parcelK2 = k2(parcelT, 13);
        IBinder strongBinder = parcelK2.readStrongBinder();
        if (strongBinder == null) {
            g0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            g0Var = iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new g0(strongBinder);
        }
        parcelK2.recycle();
        return g0Var;
    }

    @Override // j4.s0
    public final q1 I0(h5.a aVar, cl clVar, int i10) {
        q1 o1Var;
        Parcel parcelT = T();
        z9.e(parcelT, aVar);
        z9.e(parcelT, clVar);
        parcelT.writeInt(231004000);
        Parcel parcelK2 = k2(parcelT, 17);
        IBinder strongBinder = parcelK2.readStrongBinder();
        if (strongBinder == null) {
            o1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            o1Var = iInterfaceQueryLocalInterface instanceof q1 ? (q1) iInterfaceQueryLocalInterface : new o1(strongBinder);
        }
        parcelK2.recycle();
        return o1Var;
    }

    @Override // j4.s0
    public final bn V0(h5.a aVar, cl clVar, int i10) {
        bn anVar;
        Parcel parcelT = T();
        z9.e(parcelT, aVar);
        z9.e(parcelT, clVar);
        parcelT.writeInt(231004000);
        Parcel parcelK2 = k2(parcelT, 15);
        IBinder strongBinder = parcelK2.readStrongBinder();
        int i11 = sf0.f8392n;
        if (strongBinder == null) {
            anVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            anVar = iInterfaceQueryLocalInterface instanceof bn ? (bn) iInterfaceQueryLocalInterface : new an(strongBinder);
        }
        parcelK2.recycle();
        return anVar;
    }

    @Override // j4.s0
    public final lp Z2(h5.a aVar, String str, cl clVar, int i10) {
        lp jpVar;
        Parcel parcelT = T();
        z9.e(parcelT, aVar);
        parcelT.writeString(str);
        z9.e(parcelT, clVar);
        parcelT.writeInt(231004000);
        Parcel parcelK2 = k2(parcelT, 12);
        IBinder strongBinder = parcelK2.readStrongBinder();
        int i11 = kp.f6041b;
        if (strongBinder == null) {
            jpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            jpVar = iInterfaceQueryLocalInterface instanceof lp ? (lp) iInterfaceQueryLocalInterface : new jp(strongBinder);
        }
        parcelK2.recycle();
        return jpVar;
    }

    @Override // j4.s0
    public final e0 d3(h5.a aVar, String str, cl clVar, int i10) {
        e0 c0Var;
        Parcel parcelT = T();
        z9.e(parcelT, aVar);
        parcelT.writeString(str);
        z9.e(parcelT, clVar);
        parcelT.writeInt(231004000);
        Parcel parcelK2 = k2(parcelT, 3);
        IBinder strongBinder = parcelK2.readStrongBinder();
        if (strongBinder == null) {
            c0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            c0Var = iInterfaceQueryLocalInterface instanceof e0 ? (e0) iInterfaceQueryLocalInterface : new c0(strongBinder);
        }
        parcelK2.recycle();
        return c0Var;
    }

    @Override // j4.s0
    public final dr f1(h5.a aVar, cl clVar, int i10) {
        dr brVar;
        Parcel parcelT = T();
        z9.e(parcelT, aVar);
        z9.e(parcelT, clVar);
        parcelT.writeInt(231004000);
        Parcel parcelK2 = k2(parcelT, 14);
        IBinder strongBinder = parcelK2.readStrongBinder();
        int i11 = cr.f3435b;
        if (strongBinder == null) {
            brVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            brVar = iInterfaceQueryLocalInterface instanceof dr ? (dr) iInterfaceQueryLocalInterface : new br(strongBinder);
        }
        parcelK2.recycle();
        return brVar;
    }

    @Override // j4.s0
    public final hn r(h5.a aVar) {
        hn fnVar;
        Parcel parcelT = T();
        z9.e(parcelT, aVar);
        Parcel parcelK2 = k2(parcelT, 8);
        IBinder strongBinder = parcelK2.readStrongBinder();
        int i10 = gn.f4967b;
        if (strongBinder == null) {
            fnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            fnVar = iInterfaceQueryLocalInterface instanceof hn ? (hn) iInterfaceQueryLocalInterface : new fn(strongBinder);
        }
        parcelK2.recycle();
        return fnVar;
    }

    @Override // j4.s0
    public final b1 t(h5.a aVar, int i10) {
        b1 z0Var;
        Parcel parcelT = T();
        z9.e(parcelT, aVar);
        parcelT.writeInt(231004000);
        Parcel parcelK2 = k2(parcelT, 9);
        IBinder strongBinder = parcelK2.readStrongBinder();
        if (strongBinder == null) {
            z0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            z0Var = iInterfaceQueryLocalInterface instanceof b1 ? (b1) iInterfaceQueryLocalInterface : new z0(strongBinder);
        }
        parcelK2.recycle();
        return z0Var;
    }

    @Override // j4.s0
    public final i0 t0(h5.a aVar, f3 f3Var, String str, int i10) {
        i0 g0Var;
        Parcel parcelT = T();
        z9.e(parcelT, aVar);
        z9.c(parcelT, f3Var);
        parcelT.writeString(str);
        parcelT.writeInt(231004000);
        Parcel parcelK2 = k2(parcelT, 10);
        IBinder strongBinder = parcelK2.readStrongBinder();
        if (strongBinder == null) {
            g0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            g0Var = iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new g0(strongBinder);
        }
        parcelK2.recycle();
        return g0Var;
    }

    @Override // j4.s0
    public final i0 t1(h5.a aVar, f3 f3Var, String str, cl clVar, int i10) {
        i0 g0Var;
        Parcel parcelT = T();
        z9.e(parcelT, aVar);
        z9.c(parcelT, f3Var);
        parcelT.writeString(str);
        z9.e(parcelT, clVar);
        parcelT.writeInt(231004000);
        Parcel parcelK2 = k2(parcelT, 1);
        IBinder strongBinder = parcelK2.readStrongBinder();
        if (strongBinder == null) {
            g0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            g0Var = iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new g0(strongBinder);
        }
        parcelK2.recycle();
        return g0Var;
    }

    @Override // j4.s0
    public final i0 w2(h5.a aVar, f3 f3Var, String str, cl clVar, int i10) {
        i0 g0Var;
        Parcel parcelT = T();
        z9.e(parcelT, aVar);
        z9.c(parcelT, f3Var);
        parcelT.writeString(str);
        z9.e(parcelT, clVar);
        parcelT.writeInt(231004000);
        Parcel parcelK2 = k2(parcelT, 2);
        IBinder strongBinder = parcelK2.readStrongBinder();
        if (strongBinder == null) {
            g0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            g0Var = iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new g0(strongBinder);
        }
        parcelK2.recycle();
        return g0Var;
    }
}