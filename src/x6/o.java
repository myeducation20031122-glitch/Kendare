package x6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static o f19089e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f19090a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Handler f19091b = new Handler(Looper.getMainLooper(), new b3.g(this, 3));

    /* renamed from: c, reason: collision with root package name */
    public n f19092c;

    /* renamed from: d, reason: collision with root package name */
    public n f19093d;

    public static o b() {
        if (f19089e == null) {
            f19089e = new o();
        }
        return f19089e;
    }

    public final boolean a(n nVar, int i10) {
        g gVar = (g) nVar.f19086a.get();
        if (gVar == null) {
            return false;
        }
        this.f19091b.removeCallbacksAndMessages(nVar);
        Handler handler = j.f19060x;
        handler.sendMessage(handler.obtainMessage(1, i10, 0, gVar.f19047a));
        return true;
    }

    public final boolean c(g gVar) {
        n nVar = this.f19092c;
        return (nVar == null || gVar == null || nVar.f19086a.get() != gVar) ? false : true;
    }

    public final void d(g gVar) {
        synchronized (this.f19090a) {
            try {
                if (c(gVar)) {
                    n nVar = this.f19092c;
                    if (!nVar.f19088c) {
                        nVar.f19088c = true;
                        this.f19091b.removeCallbacksAndMessages(nVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(g gVar) {
        synchronized (this.f19090a) {
            try {
                if (c(gVar)) {
                    n nVar = this.f19092c;
                    if (nVar.f19088c) {
                        nVar.f19088c = false;
                        f(nVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(n nVar) {
        int i10 = nVar.f19087b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        Handler handler = this.f19091b;
        handler.removeCallbacksAndMessages(nVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, nVar), i10);
    }

    public final void g() {
        n nVar = this.f19093d;
        if (nVar != null) {
            this.f19092c = nVar;
            this.f19093d = null;
            g gVar = (g) nVar.f19086a.get();
            if (gVar == null) {
                this.f19092c = null;
            } else {
                Handler handler = j.f19060x;
                handler.sendMessage(handler.obtainMessage(0, gVar.f19047a));
            }
        }
    }
}