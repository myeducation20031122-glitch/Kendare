package j4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.vn;
import com.google.android.gms.internal.ads.wn;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.xr;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k extends n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.b f13752c;

    public k(android.support.v4.media.b bVar, Context context) {
        this.f13752c = bVar;
        this.f13751b = context;
    }

    @Override // j4.n
    public final Object a() {
        android.support.v4.media.b.i(this.f13751b, "mobile_ads_settings");
        return new s2();
    }

    @Override // j4.n
    public final Object b(s0 s0Var) {
        return s0Var.t(new h5.b(this.f13751b), 231004000);
    }

    @Override // j4.n
    public final Object c() throws xr {
        c1 c1Var;
        Context context = this.f13751b;
        ge.a(context);
        boolean zBooleanValue = ((Boolean) q.f13781d.f13784c.a(ge.f4790p8)).booleanValue();
        android.support.v4.media.b bVar = this.f13752c;
        if (!zBooleanValue) {
            o2 o2Var = (o2) bVar.f488f;
            o2Var.getClass();
            try {
                h5.b bVar2 = new h5.b(context);
                c1 c1Var2 = (c1) o2Var.e(context);
                Parcel parcelT = c1Var2.T();
                z9.e(parcelT, bVar2);
                parcelT.writeInt(231004000);
                Parcel parcelK2 = c1Var2.k2(parcelT, 1);
                IBinder strongBinder = parcelK2.readStrongBinder();
                parcelK2.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface instanceof b1 ? (b1) iInterfaceQueryLocalInterface : new z0(strongBinder);
            } catch (RemoteException e10) {
                e = e10;
                wr.h("Could not get remote MobileAdsSettingManager.", e);
                return null;
            } catch (h5.c e11) {
                e = e11;
                wr.h("Could not get remote MobileAdsSettingManager.", e);
                return null;
            }
        }
        try {
            h5.b bVar3 = new h5.b(context);
            try {
                IBinder iBinderB = com.bumptech.glide.d.Y(context).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                if (iBinderB == null) {
                    c1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    c1Var = iInterfaceQueryLocalInterface2 instanceof c1 ? (c1) iInterfaceQueryLocalInterface2 : new c1(iBinderB);
                }
                Parcel parcelT2 = c1Var.T();
                z9.e(parcelT2, bVar3);
                parcelT2.writeInt(231004000);
                Parcel parcelK22 = c1Var.k2(parcelT2, 1);
                IBinder strongBinder2 = parcelK22.readStrongBinder();
                parcelK22.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface3 instanceof b1 ? (b1) iInterfaceQueryLocalInterface3 : new z0(strongBinder2);
            } catch (Exception e12) {
                throw new xr(e12);
            }
        } catch (RemoteException e13) {
            e = e13;
            wn wnVarA = vn.a(context);
            bVar.f493u = wnVarA;
            wnVarA.c("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (xr e14) {
            e = e14;
            wn wnVarA2 = vn.a(context);
            bVar.f493u = wnVarA2;
            wnVarA2.c("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (NullPointerException e15) {
            e = e15;
            wn wnVarA22 = vn.a(context);
            bVar.f493u = wnVarA22;
            wnVarA22.c("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        }
    }
}