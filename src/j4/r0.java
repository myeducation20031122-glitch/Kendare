package j4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.internal.ads.bl;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.fw;
import com.google.android.gms.internal.ads.g4;
import com.google.android.gms.internal.ads.ib0;
import com.google.android.gms.internal.ads.l70;
import com.google.android.gms.internal.ads.no0;
import com.google.android.gms.internal.ads.nw;
import com.google.android.gms.internal.ads.pv;
import com.google.android.gms.internal.ads.sf1;
import com.google.android.gms.internal.ads.sn;
import com.google.android.gms.internal.ads.xi;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.yi;
import com.google.android.gms.internal.ads.z9;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class r0 extends y9 implements s0 {
    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        IInterface iInterfaceT1;
        int i11 = 0;
        IInterface l70Var = null;
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                h5.a aVarQ3 = h5.b.q3(parcel.readStrongBinder());
                f3 f3Var = (f3) z9.a(parcel, f3.CREATOR);
                String string = parcel.readString();
                cl clVarR3 = bl.r3(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                z9.b(parcel);
                iInterfaceT1 = ((ClientApi) this).t1(aVarQ3, f3Var, string, clVarR3, i12);
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceT1);
                return true;
            case 2:
                h5.a aVarQ32 = h5.b.q3(parcel.readStrongBinder());
                f3 f3Var2 = (f3) z9.a(parcel, f3.CREATOR);
                String string2 = parcel.readString();
                cl clVarR32 = bl.r3(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                z9.b(parcel);
                iInterfaceT1 = ((ClientApi) this).w2(aVarQ32, f3Var2, string2, clVarR32, i13);
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceT1);
                return true;
            case 3:
                h5.a aVarQ33 = h5.b.q3(parcel.readStrongBinder());
                String string3 = parcel.readString();
                cl clVarR33 = bl.r3(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                z9.b(parcel);
                iInterfaceT1 = ((ClientApi) this).d3(aVarQ33, string3, clVarR33, i14);
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceT1);
                return true;
            case 4:
            case y4.g.NETWORK_ERROR /* 7 */:
                h5.b.q3(parcel.readStrongBinder());
                z9.b(parcel);
                parcel2.writeNoException();
                z9.e(parcel2, l70Var);
                return true;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                h5.a aVarQ34 = h5.b.q3(parcel.readStrongBinder());
                h5.a aVarQ35 = h5.b.q3(parcel.readStrongBinder());
                z9.b(parcel);
                iInterfaceT1 = ((ClientApi) this).C1(aVarQ34, aVarQ35);
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceT1);
                return true;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                h5.a aVarQ36 = h5.b.q3(parcel.readStrongBinder());
                cl clVarR34 = bl.r3(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                z9.b(parcel);
                Context context = (Context) h5.b.r3(aVarQ36);
                g4 g4Var = new g4(pv.b(context, clVarR34, i15).f4437c);
                context.getClass();
                g4Var.f4532f = context;
                iInterfaceT1 = (no0) ((sf1) g4Var.w().f6057h).zzb();
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceT1);
                return true;
            case 8:
                h5.a aVarQ37 = h5.b.q3(parcel.readStrongBinder());
                z9.b(parcel);
                iInterfaceT1 = ((ClientApi) this).r(aVarQ37);
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceT1);
                return true;
            case 9:
                h5.a aVarQ38 = h5.b.q3(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                z9.b(parcel);
                iInterfaceT1 = ((ClientApi) this).t(aVarQ38, i16);
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceT1);
                return true;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                h5.a aVarQ39 = h5.b.q3(parcel.readStrongBinder());
                f3 f3Var3 = (f3) z9.a(parcel, f3.CREATOR);
                String string4 = parcel.readString();
                int i17 = parcel.readInt();
                z9.b(parcel);
                iInterfaceT1 = ((ClientApi) this).t0(aVarQ39, f3Var3, string4, i17);
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceT1);
                return true;
            case 11:
                h5.a aVarQ310 = h5.b.q3(parcel.readStrongBinder());
                h5.a aVarQ311 = h5.b.q3(parcel.readStrongBinder());
                h5.a aVarQ312 = h5.b.q3(parcel.readStrongBinder());
                z9.b(parcel);
                l70Var = new l70((View) h5.b.r3(aVarQ310), (HashMap) h5.b.r3(aVarQ311), (HashMap) h5.b.r3(aVarQ312));
                parcel2.writeNoException();
                z9.e(parcel2, l70Var);
                return true;
            case 12:
                h5.a aVarQ313 = h5.b.q3(parcel.readStrongBinder());
                String string5 = parcel.readString();
                cl clVarR35 = bl.r3(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                z9.b(parcel);
                iInterfaceT1 = ((ClientApi) this).Z2(aVarQ313, string5, clVarR35, i18);
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceT1);
                return true;
            case y4.g.ERROR /* 13 */:
                h5.a aVarQ314 = h5.b.q3(parcel.readStrongBinder());
                f3 f3Var4 = (f3) z9.a(parcel, f3.CREATOR);
                String string6 = parcel.readString();
                cl clVarR36 = bl.r3(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                z9.b(parcel);
                iInterfaceT1 = ((ClientApi) this).H0(aVarQ314, f3Var4, string6, clVarR36, i19);
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceT1);
                return true;
            case y4.g.INTERRUPTED /* 14 */:
                h5.a aVarQ315 = h5.b.q3(parcel.readStrongBinder());
                cl clVarR37 = bl.r3(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                z9.b(parcel);
                iInterfaceT1 = ((ClientApi) this).f1(aVarQ315, clVarR37, i20);
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceT1);
                return true;
            case y4.g.TIMEOUT /* 15 */:
                h5.a aVarQ316 = h5.b.q3(parcel.readStrongBinder());
                cl clVarR38 = bl.r3(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                z9.b(parcel);
                iInterfaceT1 = ((ClientApi) this).V0(aVarQ316, clVarR38, i21);
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceT1);
                return true;
            case y4.g.CANCELED /* 16 */:
                h5.a aVarQ317 = h5.b.q3(parcel.readStrongBinder());
                cl clVarR39 = bl.r3(parcel.readStrongBinder());
                int i22 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    String str = "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener";
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    l70Var = iInterfaceQueryLocalInterface instanceof yi ? (yi) iInterfaceQueryLocalInterface : new xi(strongBinder, str, i11);
                }
                z9.b(parcel);
                Context context2 = (Context) h5.b.r3(aVarQ317);
                sn snVar = new sn(pv.b(context2, clVarR39, i22).f4437c);
                context2.getClass();
                snVar.f8470e = context2;
                l70Var.getClass();
                snVar.f8472j = l70Var;
                dq0.z1((Context) snVar.f8470e, Context.class);
                dq0.z1((yi) snVar.f8472j, yi.class);
                iInterfaceT1 = (ib0) new nw((fw) snVar.f8471f, (Context) snVar.f8470e, (yi) snVar.f8472j).f6925e.zzb();
                parcel2.writeNoException();
                z9.e(parcel2, iInterfaceT1);
                return true;
            case y4.g.API_NOT_CONNECTED /* 17 */:
                h5.a aVarQ318 = h5.b.q3(parcel.readStrongBinder());
                cl clVarR310 = bl.r3(parcel.readStrongBinder());
                int i23 = parcel.readInt();
                z9.b(parcel);
                q1 q1VarI0 = ((ClientApi) this).I0(aVarQ318, clVarR310, i23);
                parcel2.writeNoException();
                z9.e(parcel2, q1VarI0);
                return true;
            default:
                return false;
        }
    }
}