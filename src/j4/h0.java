package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.ab;
import com.google.android.gms.internal.ads.ap;
import com.google.android.gms.internal.ads.bb;
import com.google.android.gms.internal.ads.ln;
import com.google.android.gms.internal.ads.nn;
import com.google.android.gms.internal.ads.oe;
import com.google.android.gms.internal.ads.pe;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.z9;
import com.google.android.gms.internal.ads.zo;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h0 extends y9 implements i0 {
    public h0() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        IInterface iInterfaceZzn;
        Parcelable parcelableZzg;
        String strZzs;
        int i11;
        boolean zR2;
        w uVar = null;
        v0 u0Var = null;
        y xVar = null;
        n1 m1Var = null;
        bb abVar = null;
        ap zoVar = null;
        t0 t0Var = null;
        t sVar = null;
        pe oeVar = null;
        p0 m0Var = null;
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                iInterfaceZzn = zzn();
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceZzn);
                return true;
            case 2:
                i();
                parcel2.writeNoException();
                return true;
            case 3:
                zR2 = R2();
                parcel2.writeNoException();
                ClassLoader classLoader = z9.f10427a;
                i11 = zR2;
                parcel2.writeInt(i11);
                return true;
            case 4:
                c3 c3Var = (c3) z9.a(parcel, c3.CREATOR);
                z9.b(parcel);
                boolean zV0 = v0(c3Var);
                parcel2.writeNoException();
                i11 = zV0;
                parcel2.writeInt(i11);
                return true;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                a1();
                parcel2.writeNoException();
                return true;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                k();
                parcel2.writeNoException();
                return true;
            case y4.g.NETWORK_ERROR /* 7 */:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    uVar = iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new u(strongBinder);
                }
                z9.b(parcel);
                B1(uVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    m0Var = iInterfaceQueryLocalInterface2 instanceof p0 ? (p0) iInterfaceQueryLocalInterface2 : new m0(strongBinder2);
                }
                z9.b(parcel);
                G2(m0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                G();
                parcel2.writeNoException();
                return true;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                parcel2.writeNoException();
                return true;
            case 11:
                q();
                parcel2.writeNoException();
                return true;
            case 12:
                parcelableZzg = zzg();
                parcel2.writeNoException();
                z9.d(parcel2, parcelableZzg);
                return true;
            case y4.g.ERROR /* 13 */:
                f3 f3Var = (f3) z9.a(parcel, f3.CREATOR);
                z9.b(parcel);
                g0(f3Var);
                parcel2.writeNoException();
                return true;
            case y4.g.INTERRUPTED /* 14 */:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    if (iInterfaceQueryLocalInterface3 instanceof ln) {
                    }
                }
                z9.b(parcel);
                o();
                parcel2.writeNoException();
                return true;
            case y4.g.TIMEOUT /* 15 */:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    if (iInterfaceQueryLocalInterface4 instanceof nn) {
                    }
                }
                parcel.readString();
                z9.b(parcel);
                O();
                parcel2.writeNoException();
                return true;
            case y4.g.CANCELED /* 16 */:
            case y4.g.API_NOT_CONNECTED /* 17 */:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case y4.g.REMOTE_EXCEPTION /* 19 */:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    String str = "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener";
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    oeVar = iInterfaceQueryLocalInterface5 instanceof pe ? (pe) iInterfaceQueryLocalInterface5 : new oe(strongBinder5, str, z ? 1 : 0);
                }
                z9.b(parcel);
                n2(oeVar);
                parcel2.writeNoException();
                return true;
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    String str2 = "com.google.android.gms.ads.internal.client.IAdClickListener";
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    sVar = iInterfaceQueryLocalInterface6 instanceof t ? (t) iInterfaceQueryLocalInterface6 : new s(strongBinder6, str2, z ? 1 : 0);
                }
                z9.b(parcel);
                T0(sVar);
                parcel2.writeNoException();
                return true;
            case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    t0Var = iInterfaceQueryLocalInterface7 instanceof t0 ? (t0) iInterfaceQueryLocalInterface7 : new t0(strongBinder7);
                }
                z9.b(parcel);
                j2(t0Var);
                parcel2.writeNoException();
                return true;
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                ClassLoader classLoader2 = z9.f10427a;
                z = parcel.readInt() != 0;
                z9.b(parcel);
                i3(z);
                parcel2.writeNoException();
                return true;
            case 23:
                zR2 = N();
                parcel2.writeNoException();
                ClassLoader classLoader3 = z9.f10427a;
                i11 = zR2;
                parcel2.writeInt(i11);
                return true;
            case 24:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zoVar = iInterfaceQueryLocalInterface8 instanceof ap ? (ap) iInterfaceQueryLocalInterface8 : new zo(strongBinder8);
                }
                z9.b(parcel);
                S2(zoVar);
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.readString();
                z9.b(parcel);
                D1();
                parcel2.writeNoException();
                return true;
            case 26:
                iInterfaceZzn = zzl();
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceZzn);
                return true;
            case 29:
                z2 z2Var = (z2) z9.a(parcel, z2.CREATOR);
                z9.b(parcel);
                z1(z2Var);
                parcel2.writeNoException();
                return true;
            case 30:
                z9.b(parcel);
                E();
                parcel2.writeNoException();
                return true;
            case 31:
                strZzs = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 32:
                iInterfaceZzn = zzj();
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceZzn);
                return true;
            case 33:
                iInterfaceZzn = zzi();
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceZzn);
                return true;
            case 34:
                ClassLoader classLoader4 = z9.f10427a;
                boolean z7 = parcel.readInt() != 0;
                z9.b(parcel);
                Q1(z7);
                parcel2.writeNoException();
                return true;
            case 35:
                strZzs = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 36:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (iInterfaceQueryLocalInterface9 instanceof l0) {
                    }
                }
                z9.b(parcel);
                Q();
                parcel2.writeNoException();
                return true;
            case 37:
                parcelableZzg = zzd();
                parcel2.writeNoException();
                z9.d(parcel2, parcelableZzg);
                return true;
            case 38:
                parcel.readString();
                z9.b(parcel);
                R();
                parcel2.writeNoException();
                return true;
            case 39:
                i3 i3Var = (i3) z9.a(parcel, i3.CREATOR);
                z9.b(parcel);
                A1(i3Var);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    String str3 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback";
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    abVar = iInterfaceQueryLocalInterface10 instanceof bb ? (bb) iInterfaceQueryLocalInterface10 : new ab(strongBinder10, str3, z ? 1 : 0);
                }
                z9.b(parcel);
                i2(abVar);
                parcel2.writeNoException();
                return true;
            case 41:
                iInterfaceZzn = zzk();
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceZzn);
                return true;
            case 42:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    m1Var = iInterfaceQueryLocalInterface11 instanceof n1 ? (n1) iInterfaceQueryLocalInterface11 : new m1(strongBinder11);
                }
                z9.b(parcel);
                g1(m1Var);
                parcel2.writeNoException();
                return true;
            case 43:
                c3 c3Var2 = (c3) z9.a(parcel, c3.CREATOR);
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    String str4 = "com.google.android.gms.ads.internal.client.IAdLoadCallback";
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    xVar = iInterfaceQueryLocalInterface12 instanceof y ? (y) iInterfaceQueryLocalInterface12 : new x(strongBinder12, str4, z ? 1 : 0);
                }
                z9.b(parcel);
                M0(c3Var2, xVar);
                parcel2.writeNoException();
                return true;
            case 44:
                h5.a aVarQ3 = h5.b.q3(parcel.readStrongBinder());
                z9.b(parcel);
                L0(aVarQ3);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    String str5 = "com.google.android.gms.ads.internal.client.IFullScreenContentCallback";
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    u0Var = iInterfaceQueryLocalInterface13 instanceof v0 ? (v0) iInterfaceQueryLocalInterface13 : new u0(strongBinder13, str5, z ? 1 : 0);
                }
                z9.b(parcel);
                V1(u0Var);
                parcel2.writeNoException();
                return true;
        }
    }
}