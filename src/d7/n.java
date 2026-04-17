package d7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n extends k {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ IBinder f12330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.k f12331f;

    public n(l1.k kVar, IBinder iBinder) {
        this.f12331f = kVar;
        this.f12330e = iBinder;
    }

    @Override // d7.k
    public final void a() throws RemoteException {
        g eVar;
        l1.k kVar = this.f12331f;
        o oVar = (o) kVar.f14487e;
        int i10 = f.f12324e;
        IBinder iBinder = this.f12330e;
        if (iBinder == null) {
            eVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            eVar = iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new e(iBinder);
        }
        oVar.f12345m = eVar;
        Object obj = kVar.f14487e;
        o oVar2 = (o) obj;
        oVar2.f12334b.c("linkToDeath", new Object[0]);
        try {
            oVar2.f12345m.asBinder().linkToDeath(oVar2.f12342j, 0);
        } catch (RemoteException e10) {
            oVar2.f12334b.b(e10, "linkToDeath failed", new Object[0]);
        }
        o oVar3 = (o) obj;
        oVar3.f12339g = false;
        Iterator it = oVar3.f12336d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((o) obj).f12336d.clear();
    }
}