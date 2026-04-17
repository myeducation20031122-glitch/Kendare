package j4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.jp;
import com.google.android.gms.internal.ads.lp;
import com.google.android.gms.internal.ads.pp;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.xr;
import com.google.android.gms.internal.ads.zk;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13763c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl f13764d;

    public m(Context context, String str, zk zkVar) {
        this.f13762b = context;
        this.f13763c = str;
        this.f13764d = zkVar;
    }

    @Override // j4.n
    public final Object a() {
        android.support.v4.media.b.i(this.f13762b, "rewarded");
        return new u2();
    }

    @Override // j4.n
    public final Object b(s0 s0Var) {
        return s0Var.Z2(new h5.b(this.f13762b), this.f13763c, this.f13764d, 231004000);
    }

    @Override // j4.n
    public final Object c() throws xr {
        pp ppVar;
        String str = this.f13763c;
        cl clVar = this.f13764d;
        Context context = this.f13762b;
        h5.b bVar = new h5.b(context);
        try {
            try {
                IBinder iBinderB = com.bumptech.glide.d.Y(context).b("com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl");
                if (iBinderB == null) {
                    ppVar = null;
                } else {
                    String str2 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator";
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    ppVar = iInterfaceQueryLocalInterface instanceof pp ? (pp) iInterfaceQueryLocalInterface : new pp(iBinderB, str2, 0);
                }
                IBinder iBinderS3 = ppVar.s3(bVar, str, clVar);
                if (iBinderS3 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinderS3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
                return iInterfaceQueryLocalInterface2 instanceof lp ? (lp) iInterfaceQueryLocalInterface2 : new jp(iBinderS3);
            } catch (Exception e10) {
                throw new xr(e10);
            }
        } catch (RemoteException e11) {
            e = e11;
            wr.i("#007 Could not call remote method.", e);
            return null;
        } catch (xr e12) {
            e = e12;
            wr.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}