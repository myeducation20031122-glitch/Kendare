package j4;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.fn;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.gn;
import com.google.android.gms.internal.ads.hn;
import com.google.android.gms.internal.ads.in;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.kn;
import com.google.android.gms.internal.ads.vn;
import com.google.android.gms.internal.ads.wn;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.xr;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f13627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.b f13628c;

    public b(android.support.v4.media.b bVar, Activity activity) {
        this.f13628c = bVar;
        this.f13627b = activity;
    }

    @Override // j4.n
    public final /* bridge */ /* synthetic */ Object a() {
        android.support.v4.media.b.i(this.f13627b, "ad_overlay");
        return null;
    }

    @Override // j4.n
    public final Object b(s0 s0Var) {
        return s0Var.r(new h5.b(this.f13627b));
    }

    @Override // j4.n
    public final Object c() throws xr {
        kn inVar;
        Activity activity = this.f13627b;
        ge.a(activity);
        boolean zBooleanValue = ((Boolean) q.f13781d.f13784c.a(ge.f4790p8)).booleanValue();
        android.support.v4.media.b bVar = this.f13628c;
        if (!zBooleanValue) {
            o2 o2Var = (o2) bVar.f491n;
            o2Var.getClass();
            try {
                h5.b bVar2 = new h5.b(activity);
                in inVar2 = (in) ((kn) o2Var.e(activity));
                Parcel parcelT = inVar2.T();
                z9.e(parcelT, bVar2);
                Parcel parcelK2 = inVar2.k2(parcelT, 1);
                IBinder strongBinder = parcelK2.readStrongBinder();
                parcelK2.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterfaceQueryLocalInterface instanceof hn ? (hn) iInterfaceQueryLocalInterface : new fn(strongBinder);
            } catch (RemoteException e10) {
                e = e10;
                wr.h("Could not create remote AdOverlay.", e);
                return null;
            } catch (h5.c e11) {
                e = e11;
                wr.h("Could not create remote AdOverlay.", e);
                return null;
            }
        }
        try {
            h5.b bVar3 = new h5.b(activity);
            try {
                IBinder iBinderB = com.bumptech.glide.d.Y(activity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl");
                int i10 = jn.f5737b;
                if (iBinderB == null) {
                    inVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    inVar = iInterfaceQueryLocalInterface2 instanceof kn ? (kn) iInterfaceQueryLocalInterface2 : new in(iBinderB);
                }
                in inVar3 = (in) inVar;
                Parcel parcelT2 = inVar3.T();
                z9.e(parcelT2, bVar3);
                Parcel parcelK22 = inVar3.k2(parcelT2, 1);
                IBinder strongBinder2 = parcelK22.readStrongBinder();
                parcelK22.recycle();
                int i11 = gn.f4967b;
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterfaceQueryLocalInterface3 instanceof hn ? (hn) iInterfaceQueryLocalInterface3 : new fn(strongBinder2);
            } catch (Exception e12) {
                throw new xr(e12);
            }
        } catch (RemoteException | xr | NullPointerException e13) {
            wn wnVarA = vn.a(activity.getApplicationContext());
            bVar.f493u = wnVarA;
            wnVarA.c("ClientApiBroker.createAdOverlay", e13);
            return null;
        }
    }
}