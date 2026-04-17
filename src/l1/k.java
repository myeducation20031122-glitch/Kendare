package l1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14486b = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14487e;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i10 = this.f14486b;
        Object obj = this.f14487e;
        switch (i10) {
            case 0:
                g5.a aVar = (g5.a) obj;
                int i11 = n.f14489e;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f)) {
                        new e().f14470b = iBinder;
                    }
                }
                aVar.getClass();
                aVar.getClass();
                aVar.getClass();
                throw null;
            default:
                d7.o oVar = (d7.o) obj;
                oVar.f12334b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                oVar.a().post(new d7.n(this, iBinder));
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i10 = this.f14486b;
        Object obj = this.f14487e;
        switch (i10) {
            case 0:
                g5.a aVar = (g5.a) obj;
                aVar.getClass();
                aVar.getClass();
                throw null;
            default:
                d7.o oVar = (d7.o) obj;
                oVar.f12334b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                oVar.a().post(new d7.m(this, 1));
                return;
        }
    }
}