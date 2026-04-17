package t5;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a4 extends g4 {
    public static final AtomicLong N = new AtomicLong(Long.MIN_VALUE);
    public final Semaphore M;

    /* renamed from: f, reason: collision with root package name */
    public z3 f17215f;

    /* renamed from: j, reason: collision with root package name */
    public z3 f17216j;

    /* renamed from: m, reason: collision with root package name */
    public final PriorityBlockingQueue f17217m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedBlockingQueue f17218n;

    /* renamed from: t, reason: collision with root package name */
    public final x3 f17219t;

    /* renamed from: u, reason: collision with root package name */
    public final x3 f17220u;

    /* renamed from: w, reason: collision with root package name */
    public final Object f17221w;

    public a4(b4 b4Var) {
        super(b4Var);
        this.f17221w = new Object();
        this.M = new Semaphore(2);
        this.f17217m = new PriorityBlockingQueue();
        this.f17218n = new LinkedBlockingQueue();
        this.f17219t = new x3(this, "Thread death: Uncaught exception on worker thread");
        this.f17220u = new x3(this, "Thread death: Uncaught exception on network thread");
    }

    public final void A(y3 y3Var) {
        synchronized (this.f17221w) {
            try {
                this.f17217m.add(y3Var);
                z3 z3Var = this.f17215f;
                if (z3Var == null) {
                    z3 z3Var2 = new z3(this, "Measurement Worker", this.f17217m);
                    this.f17215f = z3Var2;
                    z3Var2.setUncaughtExceptionHandler(this.f17219t);
                    this.f17215f.start();
                } else {
                    z3Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m0.j
    public final void o() {
        if (Thread.currentThread() != this.f17215f) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // t5.g4
    public final boolean p() {
        return false;
    }

    public final void s() {
        if (Thread.currentThread() != this.f17216j) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final Object t(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            a4 a4Var = ((b4) this.f15046b).M;
            b4.i(a4Var);
            a4Var.x(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                i3 i3Var = ((b4) this.f15046b).f17251w;
                b4.i(i3Var);
                i3Var.f17400w.a("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            i3 i3Var2 = ((b4) this.f15046b).f17251w;
            b4.i(i3Var2);
            i3Var2.f17400w.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final y3 u(Callable callable) {
        q();
        y3 y3Var = new y3(this, callable, false);
        if (Thread.currentThread() == this.f17215f) {
            if (!this.f17217m.isEmpty()) {
                i3 i3Var = ((b4) this.f15046b).f17251w;
                b4.i(i3Var);
                i3Var.f17400w.a("Callable skipped the worker queue.");
            }
            y3Var.run();
        } else {
            A(y3Var);
        }
        return y3Var;
    }

    public final void w(Runnable runnable) {
        q();
        y3 y3Var = new y3(this, runnable, false, "Task exception on network thread");
        synchronized (this.f17221w) {
            try {
                this.f17218n.add(y3Var);
                z3 z3Var = this.f17216j;
                if (z3Var == null) {
                    z3 z3Var2 = new z3(this, "Measurement Network", this.f17218n);
                    this.f17216j = z3Var2;
                    z3Var2.setUncaughtExceptionHandler(this.f17220u);
                    this.f17216j.start();
                } else {
                    z3Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(Runnable runnable) {
        q();
        fc.t.k(runnable);
        A(new y3(this, runnable, false, "Task exception on worker thread"));
    }

    public final void y(Runnable runnable) {
        q();
        A(new y3(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean z() {
        return Thread.currentThread() == this.f17215f;
    }
}