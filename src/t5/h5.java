package t5;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zn;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h5 implements ServiceConnection, a5.b, a5.c {

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f17383b;

    /* renamed from: e, reason: collision with root package name */
    public volatile zn f17384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i5 f17385f;

    public h5(i5 i5Var) {
        this.f17385f = i5Var;
    }

    @Override // a5.b
    public final void A(int i10) {
        fc.t.f("MeasurementServiceConnection.onConnectionSuspended");
        i5 i5Var = this.f17385f;
        i3 i3Var = ((b4) i5Var.f15046b).f17251w;
        b4.i(i3Var);
        i3Var.P.a("Service connection suspended");
        a4 a4Var = ((b4) i5Var.f15046b).M;
        b4.i(a4Var);
        a4Var.x(new g5(this, 0));
    }

    @Override // a5.b
    public final void T(Bundle bundle) {
        fc.t.f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                fc.t.k(this.f17384e);
                c3 c3Var = (c3) this.f17384e.z();
                a4 a4Var = ((b4) this.f17385f.f15046b).M;
                b4.i(a4Var);
                a4Var.x(new f5(this, c3Var, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f17384e = null;
                this.f17383b = false;
            }
        }
    }

    public final void a() {
        this.f17385f.o();
        Context context = ((b4) this.f17385f.f15046b).f17234b;
        synchronized (this) {
            try {
                if (this.f17383b) {
                    i3 i3Var = ((b4) this.f17385f.f15046b).f17251w;
                    b4.i(i3Var);
                    i3Var.Q.a("Connection attempt already in progress");
                } else {
                    if (this.f17384e != null && (this.f17384e.D() || this.f17384e.a())) {
                        i3 i3Var2 = ((b4) this.f17385f.f15046b).f17251w;
                        b4.i(i3Var2);
                        i3Var2.Q.a("Already awaiting connection attempt");
                        return;
                    }
                    this.f17384e = new zn(context, Looper.getMainLooper(), this, this, 1);
                    i3 i3Var3 = ((b4) this.f17385f.f15046b).f17251w;
                    b4.i(i3Var3);
                    i3Var3.Q.a("Connecting to remote service");
                    this.f17383b = true;
                    fc.t.k(this.f17384e);
                    this.f17384e.q();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        fc.t.f("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f17383b = false;
                i3 i3Var = ((b4) this.f17385f.f15046b).f17251w;
                b4.i(i3Var);
                i3Var.f17397n.a("Service connected with null binder");
                return;
            }
            c3 b3Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    b3Var = iInterfaceQueryLocalInterface instanceof c3 ? (c3) iInterfaceQueryLocalInterface : new b3(iBinder);
                    i3 i3Var2 = ((b4) this.f17385f.f15046b).f17251w;
                    b4.i(i3Var2);
                    i3Var2.Q.a("Bound to IMeasurementService interface");
                } else {
                    i3 i3Var3 = ((b4) this.f17385f.f15046b).f17251w;
                    b4.i(i3Var3);
                    i3Var3.f17397n.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                i3 i3Var4 = ((b4) this.f17385f.f15046b).f17251w;
                b4.i(i3Var4);
                i3Var4.f17397n.a("Service connect failed to get IMeasurementService");
            }
            if (b3Var == null) {
                this.f17383b = false;
                try {
                    d5.a aVarB = d5.a.b();
                    i5 i5Var = this.f17385f;
                    aVarB.c(((b4) i5Var.f15046b).f17234b, i5Var.f17427f);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                a4 a4Var = ((b4) this.f17385f.f15046b).M;
                b4.i(a4Var);
                a4Var.x(new f5(this, b3Var, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        fc.t.f("MeasurementServiceConnection.onServiceDisconnected");
        i5 i5Var = this.f17385f;
        i3 i3Var = ((b4) i5Var.f15046b).f17251w;
        b4.i(i3Var);
        i3Var.P.a("Service disconnected");
        a4 a4Var = ((b4) i5Var.f15046b).M;
        b4.i(a4Var);
        a4Var.x(new z4.u0(11, this, componentName));
    }

    @Override // a5.c
    public final void x(x4.b bVar) {
        fc.t.f("MeasurementServiceConnection.onConnectionFailed");
        i3 i3Var = ((b4) this.f17385f.f15046b).f17251w;
        if (i3Var == null || !i3Var.f17368e) {
            i3Var = null;
        }
        if (i3Var != null) {
            i3Var.f17400w.b(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f17383b = false;
            this.f17384e = null;
        }
        a4 a4Var = ((b4) this.f17385f.f15046b).M;
        b4.i(a4Var);
        a4Var.x(new g5(this, 1));
    }
}