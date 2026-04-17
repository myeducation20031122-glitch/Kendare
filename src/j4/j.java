package j4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.vn;
import com.google.android.gms.internal.ads.wn;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.xr;
import com.google.android.gms.internal.ads.z9;
import com.google.android.gms.internal.ads.zk;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j extends n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13748c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl f13749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.b f13750e;

    public j(android.support.v4.media.b bVar, Context context, String str, zk zkVar) {
        this.f13750e = bVar;
        this.f13747b = context;
        this.f13748c = str;
        this.f13749d = zkVar;
    }

    @Override // j4.n
    public final Object a() {
        android.support.v4.media.b.i(this.f13747b, "native_ad");
        return new q2();
    }

    @Override // j4.n
    public final Object b(s0 s0Var) {
        return s0Var.d3(new h5.b(this.f13747b), this.f13748c, this.f13749d, 231004000);
    }

    @Override // j4.n
    public final Object c() throws xr {
        f0 f0Var;
        Context context = this.f13747b;
        ge.a(context);
        boolean zBooleanValue = ((Boolean) q.f13781d.f13784c.a(ge.f4790p8)).booleanValue();
        cl clVar = this.f13749d;
        String str = this.f13748c;
        android.support.v4.media.b bVar = this.f13750e;
        if (!zBooleanValue) {
            o2 o2Var = (o2) bVar.f487e;
            o2Var.getClass();
            try {
                h5.b bVar2 = new h5.b(context);
                f0 f0Var2 = (f0) o2Var.e(context);
                Parcel parcelT = f0Var2.T();
                z9.e(parcelT, bVar2);
                parcelT.writeString(str);
                z9.e(parcelT, clVar);
                parcelT.writeInt(231004000);
                Parcel parcelK2 = f0Var2.k2(parcelT, 1);
                IBinder strongBinder = parcelK2.readStrongBinder();
                parcelK2.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface instanceof e0 ? (e0) iInterfaceQueryLocalInterface : new c0(strongBinder);
            } catch (RemoteException e10) {
                e = e10;
                wr.h("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (h5.c e11) {
                e = e11;
                wr.h("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            h5.b bVar3 = new h5.b(context);
            try {
                IBinder iBinderB = com.bumptech.glide.d.Y(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (iBinderB == null) {
                    f0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    f0Var = iInterfaceQueryLocalInterface2 instanceof f0 ? (f0) iInterfaceQueryLocalInterface2 : new f0(iBinderB);
                }
                Parcel parcelT2 = f0Var.T();
                z9.e(parcelT2, bVar3);
                parcelT2.writeString(str);
                z9.e(parcelT2, clVar);
                parcelT2.writeInt(231004000);
                Parcel parcelK22 = f0Var.k2(parcelT2, 1);
                IBinder strongBinder2 = parcelK22.readStrongBinder();
                parcelK22.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface3 instanceof e0 ? (e0) iInterfaceQueryLocalInterface3 : new c0(strongBinder2);
            } catch (Exception e12) {
                throw new xr(e12);
            }
        } catch (RemoteException e13) {
            e = e13;
            wn wnVarA = vn.a(context);
            bVar.f493u = wnVarA;
            wnVarA.c("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (xr e14) {
            e = e14;
            wn wnVarA2 = vn.a(context);
            bVar.f493u = wnVarA2;
            wnVarA2.c("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e15) {
            e = e15;
            wn wnVarA22 = vn.a(context);
            bVar.f493u = wnVarA22;
            wnVarA22.c("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }
}