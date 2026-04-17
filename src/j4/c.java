package j4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.vn;
import com.google.android.gms.internal.ads.xr;
import com.google.android.gms.internal.ads.zk;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cl f13644c;

    public c(Context context, zk zkVar) {
        this.f13643b = context;
        this.f13644c = zkVar;
    }

    @Override // j4.n
    public final /* bridge */ /* synthetic */ Object a() {
        android.support.v4.media.b.i(this.f13643b, "out_of_context_tester");
        return null;
    }

    @Override // j4.n
    public final Object b(s0 s0Var) {
        Context context = this.f13643b;
        h5.b bVar = new h5.b(context);
        ge.a(context);
        if (((Boolean) q.f13781d.f13784c.a(ge.U7)).booleanValue()) {
            return s0Var.I0(bVar, this.f13644c, 231004000);
        }
        return null;
    }

    @Override // j4.n
    public final Object c() throws xr {
        r1 r1Var;
        Context context = this.f13643b;
        h5.b bVar = new h5.b(context);
        ge.a(context);
        if (!((Boolean) q.f13781d.f13784c.a(ge.U7)).booleanValue()) {
            return null;
        }
        try {
            try {
                IBinder iBinderB = com.bumptech.glide.d.Y(context).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                if (iBinderB == null) {
                    r1Var = null;
                } else {
                    String str = "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator";
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    r1Var = iInterfaceQueryLocalInterface instanceof r1 ? (r1) iInterfaceQueryLocalInterface : new r1(iBinderB, str, 0);
                }
                return r1Var.s3(bVar, this.f13644c);
            } catch (Exception e10) {
                throw new xr(e10);
            }
        } catch (RemoteException e11) {
            e = e11;
            vn.a(context).c("ClientApiBroker.getOutOfContextTester", e);
            return null;
        } catch (xr e12) {
            e = e12;
            vn.a(context).c("ClientApiBroker.getOutOfContextTester", e);
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            vn.a(context).c("ClientApiBroker.getOutOfContextTester", e);
            return null;
        }
    }
}