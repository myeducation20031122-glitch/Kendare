package j4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.cn;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.en;
import com.google.android.gms.internal.ads.xr;
import com.google.android.gms.internal.ads.zk;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cl f13673c;

    public e(Context context, zk zkVar) {
        this.f13672b = context;
        this.f13673c = zkVar;
    }

    @Override // j4.n
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // j4.n
    public final Object b(s0 s0Var) {
        return s0Var.V0(new h5.b(this.f13672b), this.f13673c, 231004000);
    }

    @Override // j4.n
    public final Object c() throws xr {
        IInterface cnVar;
        Context context = this.f13672b;
        h5.b bVar = new h5.b(context);
        try {
            try {
                IBinder iBinderB = com.bumptech.glide.d.Y(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl");
                int i10 = dn.f3712b;
                if (iBinderB == null) {
                    cnVar = null;
                } else {
                    String str = "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator";
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    cnVar = iInterfaceQueryLocalInterface instanceof en ? (en) iInterfaceQueryLocalInterface : new cn(iBinderB, str, 0);
                }
                return ((cn) cnVar).s3(bVar, this.f13673c);
            } catch (RemoteException | xr | NullPointerException unused) {
                return null;
            }
        } catch (Exception e10) {
            throw new xr(e10);
        }
    }
}