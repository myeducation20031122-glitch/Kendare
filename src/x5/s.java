package x5;

import com.bumptech.glide.manager.t;
import com.google.android.gms.internal.ads.z6;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19031a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final t f19032b = new t(7);

    /* renamed from: c, reason: collision with root package name */
    public boolean f19033c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f19034d;

    /* renamed from: e, reason: collision with root package name */
    public Object f19035e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f19036f;

    @Override // x5.k
    public final s a(Executor executor, e eVar) {
        this.f19032b.l(new q(executor, eVar));
        r();
        return this;
    }

    @Override // x5.k
    public final s b(e eVar) {
        this.f19032b.l(new q(m.f19012a, eVar));
        r();
        return this;
    }

    @Override // x5.k
    public final s c(Executor executor, f fVar) {
        this.f19032b.l(new q(executor, fVar));
        r();
        return this;
    }

    @Override // x5.k
    public final s d(Executor executor, g gVar) {
        this.f19032b.l(new q(executor, gVar));
        r();
        return this;
    }

    @Override // x5.k
    public final s e(Executor executor, c cVar) {
        s sVar = new s();
        this.f19032b.l(new p(executor, cVar, sVar, 0));
        r();
        return sVar;
    }

    @Override // x5.k
    public final s f(Executor executor, c cVar) {
        s sVar = new s();
        this.f19032b.l(new p(executor, cVar, sVar, 1));
        r();
        return sVar;
    }

    @Override // x5.k
    public final Exception g() {
        Exception exc;
        synchronized (this.f19031a) {
            exc = this.f19036f;
        }
        return exc;
    }

    @Override // x5.k
    public final Object h() {
        Object obj;
        synchronized (this.f19031a) {
            try {
                fc.t.m("Task is not yet complete", this.f19033c);
                if (this.f19034d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f19036f;
                if (exc != null) {
                    throw new i(exc);
                }
                obj = this.f19035e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // x5.k
    public final boolean i() {
        boolean z7;
        synchronized (this.f19031a) {
            z7 = this.f19033c;
        }
        return z7;
    }

    @Override // x5.k
    public final boolean j() {
        boolean z7;
        synchronized (this.f19031a) {
            try {
                z7 = false;
                if (this.f19033c && !this.f19034d && this.f19036f == null) {
                    z7 = true;
                }
            } finally {
            }
        }
        return z7;
    }

    @Override // x5.k
    public final s k(Executor executor, j jVar) {
        s sVar = new s();
        this.f19032b.l(new q(executor, jVar, sVar));
        r();
        return sVar;
    }

    @Override // x5.k
    public final s l(j jVar) {
        f5.a aVar = m.f19012a;
        s sVar = new s();
        this.f19032b.l(new q(aVar, jVar, sVar));
        r();
        return sVar;
    }

    public final void m(Exception exc) {
        if (exc == null) {
            throw new NullPointerException("Exception must not be null");
        }
        synchronized (this.f19031a) {
            q();
            this.f19033c = true;
            this.f19036f = exc;
        }
        this.f19032b.n(this);
    }

    public final void n(Object obj) {
        synchronized (this.f19031a) {
            q();
            this.f19033c = true;
            this.f19035e = obj;
        }
        this.f19032b.n(this);
    }

    public final void o() {
        synchronized (this.f19031a) {
            try {
                if (this.f19033c) {
                    return;
                }
                this.f19033c = true;
                this.f19034d = true;
                this.f19032b.n(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean p(Object obj) {
        synchronized (this.f19031a) {
            try {
                if (this.f19033c) {
                    return false;
                }
                this.f19033c = true;
                this.f19035e = obj;
                this.f19032b.n(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        if (this.f19033c) {
            int i10 = z6.f10399b;
            if (!i()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excG = g();
        }
    }

    public final void r() {
        synchronized (this.f19031a) {
            try {
                if (this.f19033c) {
                    this.f19032b.n(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}