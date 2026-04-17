package a5;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.bu0;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f404h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static s0 f405i;

    /* renamed from: j, reason: collision with root package name */
    public static HandlerThread f406j;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f407a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f408b;

    /* renamed from: c, reason: collision with root package name */
    public volatile bu0 f409c;

    /* renamed from: d, reason: collision with root package name */
    public final d5.a f410d;

    /* renamed from: e, reason: collision with root package name */
    public final long f411e;

    /* renamed from: f, reason: collision with root package name */
    public final long f412f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Executor f413g;

    public s0(Context context, Looper looper) {
        b3.g gVar = new b3.g(this);
        this.f408b = context.getApplicationContext();
        this.f409c = new bu0(looper, gVar, 2);
        this.f410d = d5.a.b();
        this.f411e = 5000L;
        this.f412f = 300000L;
        this.f413g = null;
    }

    public static s0 a(Context context) {
        synchronized (f404h) {
            try {
                if (f405i == null) {
                    f405i = new s0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f405i;
    }

    public static HandlerThread b() {
        synchronized (f404h) {
            try {
                HandlerThread handlerThread = f406j;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f406j = handlerThread2;
                handlerThread2.start();
                return f406j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, String str2, l0 l0Var, boolean z7) {
        p0 p0Var = new p0(str, str2, z7);
        synchronized (this.f407a) {
            try {
                r0 r0Var = (r0) this.f407a.get(p0Var);
                if (r0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(p0Var.toString()));
                }
                if (!r0Var.f395b.containsKey(l0Var)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(p0Var.toString()));
                }
                r0Var.f395b.remove(l0Var);
                if (r0Var.f395b.isEmpty()) {
                    this.f409c.sendMessageDelayed(this.f409c.obtainMessage(0, p0Var), this.f411e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(p0 p0Var, l0 l0Var, String str, Executor executor) {
        boolean z7;
        synchronized (this.f407a) {
            try {
                r0 r0Var = (r0) this.f407a.get(p0Var);
                if (executor == null) {
                    executor = this.f413g;
                }
                if (r0Var == null) {
                    r0Var = new r0(this, p0Var);
                    r0Var.f395b.put(l0Var, l0Var);
                    r0Var.a(str, executor);
                    this.f407a.put(p0Var, r0Var);
                } else {
                    this.f409c.removeMessages(0, p0Var);
                    if (r0Var.f395b.containsKey(l0Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(p0Var.toString()));
                    }
                    r0Var.f395b.put(l0Var, l0Var);
                    int i10 = r0Var.f396e;
                    if (i10 == 1) {
                        l0Var.onServiceConnected(r0Var.f400n, r0Var.f398j);
                    } else if (i10 == 2) {
                        r0Var.a(str, executor);
                    }
                }
                z7 = r0Var.f397f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }
}