package b3;

import a5.p0;
import a5.r0;
import a5.s0;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import fc.t;
import io.reactivex.internal.fuseable.QueueFuseable;
import n8.r;
import x6.n;
import x6.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1867b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1868e;

    public /* synthetic */ g(s0 s0Var) {
        this.f1867b = 2;
        this.f1868e = s0Var;
    }

    private final void a(Message message) {
        w4.g gVar = (w4.g) this.f1868e;
        int i10 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i10);
            Log.d("MessengerIpcClient", sb.toString());
        }
        synchronized (gVar) {
            try {
                w4.i iVar = (w4.i) gVar.f18666m.get(i10);
                if (iVar == null) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i10);
                    Log.w("MessengerIpcClient", sb2.toString());
                    return;
                }
                gVar.f18666m.remove(i10);
                gVar.c();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    iVar.a(new r("Not supported by GmsCore", null));
                    return;
                }
                w4.h hVar = (w4.h) iVar;
                switch (hVar.f18668e) {
                    case 0:
                        if (data.getBoolean("ack", false)) {
                            hVar.b(null);
                            return;
                        } else {
                            hVar.a(new r("Invalid response to one way request", null));
                            return;
                        }
                    default:
                        Bundle bundle = data.getBundle("data");
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        hVar.b(bundle);
                        return;
                }
            } finally {
            }
        }
    }

    private final boolean b(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (((s0) this.f1868e).f407a) {
                try {
                    p0 p0Var = (p0) message.obj;
                    r0 r0Var = (r0) ((s0) this.f1868e).f407a.get(p0Var);
                    if (r0Var != null && r0Var.f395b.isEmpty()) {
                        if (r0Var.f397f) {
                            r0Var.f401t.f409c.removeMessages(1, r0Var.f399m);
                            s0 s0Var = r0Var.f401t;
                            s0Var.f410d.c(s0Var.f408b, r0Var);
                            r0Var.f397f = false;
                            r0Var.f396e = 2;
                        }
                        ((s0) this.f1868e).f407a.remove(p0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (((s0) this.f1868e).f407a) {
            try {
                p0 p0Var2 = (p0) message.obj;
                r0 r0Var2 = (r0) ((s0) this.f1868e).f407a.get(p0Var2);
                if (r0Var2 != null && r0Var2.f396e == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(p0Var2)), new Exception());
                    ComponentName componentName = r0Var2.f400n;
                    if (componentName == null) {
                        p0Var2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = p0Var2.f386b;
                        t.k(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    r0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f1867b) {
            case 0:
                int i10 = message.what;
                Object obj = this.f1868e;
                if (i10 == 1) {
                    ((h) obj).b((e) message.obj);
                    return true;
                }
                if (i10 != 2) {
                    return false;
                }
                ((h) obj).f1872d.k((e) message.obj);
                return false;
            case QueueFuseable.SYNC /* 1 */:
                a(message);
                return true;
            case 2:
                return b(message);
            default:
                if (message.what != 0) {
                    return false;
                }
                o oVar = (o) this.f1868e;
                n nVar = (n) message.obj;
                synchronized (oVar.f19090a) {
                    try {
                        if (oVar.f19092c == nVar || oVar.f19093d == nVar) {
                            oVar.a(nVar, 2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
        }
    }

    public /* synthetic */ g(Object obj, int i10) {
        this.f1867b = i10;
        this.f1868e = obj;
    }
}