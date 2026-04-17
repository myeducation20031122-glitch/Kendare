package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.bh;
import com.google.android.gms.internal.ads.ch;
import com.google.android.gms.internal.ads.dh;
import com.google.android.gms.internal.ads.eh;
import com.google.android.gms.internal.ads.fg;
import com.google.android.gms.internal.ads.fh;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.hh;
import com.google.android.gms.internal.ads.ih;
import com.google.android.gms.internal.ads.kh;
import com.google.android.gms.internal.ads.lh;
import com.google.android.gms.internal.ads.lj;
import com.google.android.gms.internal.ads.mh;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.pj;
import com.google.android.gms.internal.ads.qj;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.z9;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class d0 extends y9 implements e0 {
    public d0() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        ih hhVar;
        int i11 = 0;
        w uVar = null;
        qj pjVar = null;
        oh mhVar = null;
        lh khVar = null;
        t0 t0Var = null;
        gh fhVar = null;
        eh dhVar = null;
        ch bhVar = null;
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                b0 b0VarZze = zze();
                parcel2.writeNoException();
                z9.e(parcel2, b0VarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    uVar = iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new u(strongBinder);
                }
                z9.b(parcel);
                n0(uVar);
                break;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    String str = "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener";
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    bhVar = iInterfaceQueryLocalInterface2 instanceof ch ? (ch) iInterfaceQueryLocalInterface2 : new bh(strongBinder2, str, i11);
                }
                z9.b(parcel);
                N2(bhVar);
                break;
            case 4:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    String str2 = "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener";
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    dhVar = iInterfaceQueryLocalInterface3 instanceof eh ? (eh) iInterfaceQueryLocalInterface3 : new dh(strongBinder3, str2, i11);
                }
                z9.b(parcel);
                B2(dhVar);
                break;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                String string = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    hhVar = null;
                } else {
                    String str3 = "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener";
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    hhVar = iInterfaceQueryLocalInterface4 instanceof ih ? (ih) iInterfaceQueryLocalInterface4 : new hh(strongBinder4, str3, i11);
                }
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    String str4 = "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener";
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    fhVar = iInterfaceQueryLocalInterface5 instanceof gh ? (gh) iInterfaceQueryLocalInterface5 : new fh(strongBinder5, str4, i11);
                }
                z9.b(parcel);
                N1(string, hhVar, fhVar);
                break;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                fg fgVar = (fg) z9.a(parcel, fg.CREATOR);
                z9.b(parcel);
                c2(fgVar);
                break;
            case y4.g.NETWORK_ERROR /* 7 */:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    t0Var = iInterfaceQueryLocalInterface6 instanceof t0 ? (t0) iInterfaceQueryLocalInterface6 : new t0(strongBinder6);
                }
                z9.b(parcel);
                o0(t0Var);
                break;
            case 8:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    String str5 = "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener";
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    khVar = iInterfaceQueryLocalInterface7 instanceof lh ? (lh) iInterfaceQueryLocalInterface7 : new kh(strongBinder7, str5, i11);
                }
                f3 f3Var = (f3) z9.a(parcel, f3.CREATOR);
                z9.b(parcel);
                V2(khVar, f3Var);
                break;
            case 9:
                f4.d dVar = (f4.d) z9.a(parcel, f4.d.CREATOR);
                z9.b(parcel);
                x2(dVar);
                break;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    String str6 = "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener";
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    mhVar = iInterfaceQueryLocalInterface8 instanceof oh ? (oh) iInterfaceQueryLocalInterface8 : new mh(strongBinder8, str6, i11);
                }
                z9.b(parcel);
                D2(mhVar);
                break;
            case 11:
            case 12:
            default:
                return false;
            case y4.g.ERROR /* 13 */:
                lj ljVar = (lj) z9.a(parcel, lj.CREATOR);
                z9.b(parcel);
                X(ljVar);
                break;
            case y4.g.INTERRUPTED /* 14 */:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    String str7 = "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback";
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    pjVar = iInterfaceQueryLocalInterface9 instanceof qj ? (qj) iInterfaceQueryLocalInterface9 : new pj(strongBinder9, str7, i11);
                }
                z9.b(parcel);
                j0(pjVar);
                break;
            case y4.g.TIMEOUT /* 15 */:
                f4.a aVar = (f4.a) z9.a(parcel, f4.a.CREATOR);
                z9.b(parcel);
                W1(aVar);
                parcel2.writeNoException();
                return true;
        }
        parcel2.writeNoException();
        return true;
    }
}