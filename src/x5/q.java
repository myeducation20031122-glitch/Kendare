package x5;

import g.w;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.concurrent.Executor;
import t5.n5;
import z4.u0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q implements r, g, f, d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19027b;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f19028e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f19029f;

    /* renamed from: j, reason: collision with root package name */
    public final Object f19030j;

    public q(w wVar, d dVar) {
        this.f19027b = 0;
        this.f19029f = new Object();
        this.f19028e = wVar;
        this.f19030j = dVar;
    }

    private final void b(k kVar) {
        if (((s) kVar).f19034d) {
            synchronized (this.f19029f) {
                try {
                    if (((d) this.f19030j) == null) {
                        return;
                    }
                    this.f19028e.execute(new n5(this, 2));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final void c(k kVar) {
        synchronized (this.f19029f) {
            try {
                if (((e) this.f19030j) == null) {
                    return;
                }
                this.f19028e.execute(new u0(17, this, kVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d(k kVar) {
        if (kVar.j() || ((s) kVar).f19034d) {
            return;
        }
        synchronized (this.f19029f) {
            try {
                if (((f) this.f19030j) == null) {
                    return;
                }
                this.f19028e.execute(new u0(18, this, kVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // x5.r
    public final void a(k kVar) {
        switch (this.f19027b) {
            case 0:
                b(kVar);
                return;
            case QueueFuseable.SYNC /* 1 */:
                c(kVar);
                return;
            case 2:
                d(kVar);
                return;
            case 3:
                if (kVar.j()) {
                    synchronized (this.f19029f) {
                        try {
                            if (((g) this.f19030j) != null) {
                                this.f19028e.execute(new u0(19, this, kVar));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                this.f19028e.execute(new u0(20, this, kVar));
                return;
        }
    }

    @Override // x5.f
    public final void f(Exception exc) {
        ((s) this.f19030j).m(exc);
    }

    @Override // x5.d
    public final void onCanceled() {
        ((s) this.f19030j).o();
    }

    @Override // x5.g
    public final void onSuccess(Object obj) {
        ((s) this.f19030j).n(obj);
    }

    public q(Executor executor, e eVar) {
        this.f19027b = 1;
        this.f19029f = new Object();
        this.f19028e = executor;
        this.f19030j = eVar;
    }

    public q(Executor executor, f fVar) {
        this.f19027b = 2;
        this.f19029f = new Object();
        this.f19028e = executor;
        this.f19030j = fVar;
    }

    public q(Executor executor, g gVar) {
        this.f19027b = 3;
        this.f19029f = new Object();
        this.f19028e = executor;
        this.f19030j = gVar;
    }

    public q(Executor executor, j jVar, s sVar) {
        this.f19027b = 4;
        this.f19028e = executor;
        this.f19029f = jVar;
        this.f19030j = sVar;
    }
}