package a5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l0 implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final int f362b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f363e;

    public l0(f fVar, int i10) {
        this.f363e = fVar;
        this.f362b = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f fVar = this.f363e;
        if (iBinder == null) {
            f.G(fVar);
            return;
        }
        synchronized (fVar.P) {
            try {
                f fVar2 = this.f363e;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                fVar2.Q = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e0)) ? new e0(iBinder) : (e0) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar3 = this.f363e;
        int i10 = this.f362b;
        fVar3.getClass();
        n0 n0Var = new n0(fVar3, 0);
        j0 j0Var = fVar3.N;
        j0Var.sendMessage(j0Var.obtainMessage(7, i10, -1, n0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        f fVar;
        synchronized (this.f363e.P) {
            fVar = this.f363e;
            fVar.Q = null;
        }
        int i10 = this.f362b;
        j0 j0Var = fVar.N;
        j0Var.sendMessage(j0Var.obtainMessage(6, i10, 1));
    }
}