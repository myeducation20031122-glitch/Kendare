package j4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.gr;
import com.google.android.gms.internal.ads.xr;
import com.google.android.gms.internal.ads.zk;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cl f13667c;

    public d(Context context, zk zkVar) {
        this.f13666b = context;
        this.f13667c = zkVar;
    }

    @Override // j4.n
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // j4.n
    public final Object b(s0 s0Var) {
        return s0Var.f1(new h5.b(this.f13666b), this.f13667c, 231004000);
    }

    @Override // j4.n
    public final Object c() throws xr {
        IInterface erVar;
        Context context = this.f13666b;
        h5.b bVar = new h5.b(context);
        try {
            try {
                IBinder iBinderB = com.bumptech.glide.d.Y(context).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl");
                int i10 = fr.f4404b;
                if (iBinderB == null) {
                    erVar = null;
                } else {
                    String str = "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator";
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    erVar = iInterfaceQueryLocalInterface instanceof gr ? (gr) iInterfaceQueryLocalInterface : new er(iBinderB, str, 0);
                }
                return ((er) erVar).s3(bVar, this.f13667c);
            } catch (RemoteException | xr | NullPointerException unused) {
                return null;
            }
        } catch (Exception e10) {
            throw new xr(e10);
        }
    }
}