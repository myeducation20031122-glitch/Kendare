package j4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.pg;
import com.google.android.gms.internal.ads.qg;
import com.google.android.gms.internal.ads.rg;
import com.google.android.gms.internal.ads.sg;
import com.google.android.gms.internal.ads.tg;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.vn;
import com.google.android.gms.internal.ads.wn;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.xr;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l extends n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f13755b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f13756c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f13757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.b f13758e;

    public l(android.support.v4.media.b bVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f13758e = bVar;
        this.f13755b = frameLayout;
        this.f13756c = frameLayout2;
        this.f13757d = context;
    }

    @Override // j4.n
    public final Object a() {
        android.support.v4.media.b.i(this.f13757d, "native_ad_view_delegate");
        return new t2();
    }

    @Override // j4.n
    public final Object b(s0 s0Var) {
        return s0Var.C1(new h5.b(this.f13755b), new h5.b(this.f13756c));
    }

    @Override // j4.n
    public final Object c() throws xr {
        IInterface sgVar;
        Context context = this.f13757d;
        ge.a(context);
        boolean zBooleanValue = ((Boolean) q.f13781d.f13784c.a(ge.f4790p8)).booleanValue();
        FrameLayout frameLayout = this.f13756c;
        FrameLayout frameLayout2 = this.f13755b;
        android.support.v4.media.b bVar = this.f13758e;
        if (!zBooleanValue) {
            o2 o2Var = (o2) bVar.f489j;
            o2Var.getClass();
            try {
                h5.b bVar2 = new h5.b(context);
                h5.b bVar3 = new h5.b(frameLayout2);
                h5.b bVar4 = new h5.b(frameLayout);
                sg sgVar2 = (sg) ((ug) o2Var.e(context));
                Parcel parcelT = sgVar2.T();
                z9.e(parcelT, bVar2);
                z9.e(parcelT, bVar3);
                z9.e(parcelT, bVar4);
                parcelT.writeInt(231004000);
                Parcel parcelK2 = sgVar2.k2(parcelT, 1);
                IBinder strongBinder = parcelK2.readStrongBinder();
                parcelK2.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return iInterfaceQueryLocalInterface instanceof rg ? (rg) iInterfaceQueryLocalInterface : new pg(strongBinder);
            } catch (RemoteException e10) {
                e = e10;
                wr.h("Could not create remote NativeAdViewDelegate.", e);
                return null;
            } catch (h5.c e11) {
                e = e11;
                wr.h("Could not create remote NativeAdViewDelegate.", e);
                return null;
            }
        }
        try {
            h5.b bVar5 = new h5.b(context);
            h5.b bVar6 = new h5.b(frameLayout2);
            h5.b bVar7 = new h5.b(frameLayout);
            try {
                IBinder iBinderB = com.bumptech.glide.d.Y(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl");
                int i10 = tg.f8741b;
                if (iBinderB == null) {
                    sgVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    sgVar = iInterfaceQueryLocalInterface2 instanceof ug ? (ug) iInterfaceQueryLocalInterface2 : new sg(iBinderB);
                }
                sg sgVar3 = (sg) sgVar;
                Parcel parcelT2 = sgVar3.T();
                z9.e(parcelT2, bVar5);
                z9.e(parcelT2, bVar6);
                z9.e(parcelT2, bVar7);
                parcelT2.writeInt(231004000);
                Parcel parcelK22 = sgVar3.k2(parcelT2, 1);
                IBinder strongBinder2 = parcelK22.readStrongBinder();
                parcelK22.recycle();
                int i11 = qg.f7738b;
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return iInterfaceQueryLocalInterface3 instanceof rg ? (rg) iInterfaceQueryLocalInterface3 : new pg(strongBinder2);
            } catch (Exception e12) {
                throw new xr(e12);
            }
        } catch (RemoteException | xr | NullPointerException e13) {
            wn wnVarA = vn.a(context);
            bVar.f493u = wnVarA;
            wnVarA.c("ClientApiBroker.createNativeAdViewDelegate", e13);
            return null;
        }
    }
}