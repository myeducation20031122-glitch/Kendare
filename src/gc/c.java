package gc;

import a0.h;
import android.os.Handler;
import android.os.Looper;
import fc.l0;
import fc.q;
import fc.s0;
import fc.u0;
import fc.w;
import fc.z;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.scheduling.e;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class c extends u0 implements w {
    private volatile c _immediate;
    public final Handler f;
    public final String j;
    public final boolean m;
    public final c n;

    public c(Handler handler) {
        this(handler, null, false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f == this.f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f);
    }

    @Override // fc.p
    public final void j(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        l0 l0Var = (l0) coroutineContext.d(q.e);
        if (l0Var != null) {
            ((s0) l0Var).j(cancellationException);
        }
        z.b.j(coroutineContext, runnable);
    }

    @Override // fc.p
    public final boolean k() {
        return (this.m && Intrinsics.a(Looper.myLooper(), this.f.getLooper())) ? false : true;
    }

    @Override // fc.p
    public final String toString() {
        c cVar;
        String str;
        e eVar = z.a;
        u0 u0Var = m.a;
        if (this == u0Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = ((c) u0Var).n;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.j;
        if (string == null) {
            string = this.f.toString();
        }
        return this.m ? h.F(string, ".immediate") : string;
    }

    public c(Handler handler, String str, boolean z) {
        this.f = handler;
        this.j = str;
        this.m = z;
        this._immediate = z ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.n = cVar;
    }
}