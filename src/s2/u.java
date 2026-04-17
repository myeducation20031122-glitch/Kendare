package s2;

import com.google.android.gms.internal.ads.fx;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u implements j, j3.b {

    /* renamed from: c0, reason: collision with root package name */
    public static final g8.e f16804c0 = new g8.e();
    public final v2.d M;
    public final AtomicInteger N;
    public q2.j O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public e0 T;
    public q2.a U;
    public boolean V;
    public a0 W;
    public boolean X;
    public y Y;
    public m Z;

    /* renamed from: a0, reason: collision with root package name */
    public volatile boolean f16805a0;

    /* renamed from: b, reason: collision with root package name */
    public final t f16806b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f16807b0;

    /* renamed from: e, reason: collision with root package name */
    public final j3.e f16808e;

    /* renamed from: f, reason: collision with root package name */
    public final x f16809f;

    /* renamed from: j, reason: collision with root package name */
    public final n0.c f16810j;

    /* renamed from: m, reason: collision with root package name */
    public final g8.e f16811m;

    /* renamed from: n, reason: collision with root package name */
    public final v f16812n;

    /* renamed from: t, reason: collision with root package name */
    public final v2.d f16813t;

    /* renamed from: u, reason: collision with root package name */
    public final v2.d f16814u;

    /* renamed from: w, reason: collision with root package name */
    public final v2.d f16815w;

    public u(v2.d dVar, v2.d dVar2, v2.d dVar3, v2.d dVar4, v vVar, x xVar, n0.c cVar) {
        g8.e eVar = f16804c0;
        this.f16806b = new t(new ArrayList(2));
        this.f16808e = new j3.e();
        this.N = new AtomicInteger();
        this.f16813t = dVar;
        this.f16814u = dVar2;
        this.f16815w = dVar3;
        this.M = dVar4;
        this.f16812n = vVar;
        this.f16809f = xVar;
        this.f16810j = cVar;
        this.f16811m = eVar;
    }

    public final synchronized void a(e3.f fVar, Executor executor) {
        r rVar;
        try {
            this.f16808e.a();
            t tVar = this.f16806b;
            tVar.getClass();
            tVar.f16803b.add(new s(fVar, executor));
            int i10 = 1;
            if (this.V) {
                d(1);
                rVar = new r(this, fVar, i10);
            } else if (this.X) {
                d(1);
                rVar = new r(this, fVar, 0);
            } else {
                g5.a.c("Cannot add callbacks to a cancelled EngineJob", !this.f16805a0);
            }
            executor.execute(rVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        if (e()) {
            return;
        }
        this.f16805a0 = true;
        m mVar = this.Z;
        mVar.f16771f0 = true;
        h hVar = mVar.f16767d0;
        if (hVar != null) {
            hVar.cancel();
        }
        v vVar = this.f16812n;
        q2.j jVar = this.O;
        q qVar = (q) vVar;
        synchronized (qVar) {
            fx fxVar = qVar.f16791a;
            fxVar.getClass();
            Map map = this.S ? fxVar.f4470b : fxVar.f4469a;
            if (equals(map.get(jVar))) {
                map.remove(jVar);
            }
        }
    }

    public final void c() {
        y yVar;
        synchronized (this) {
            try {
                this.f16808e.a();
                g5.a.c("Not yet complete!", e());
                int iDecrementAndGet = this.N.decrementAndGet();
                g5.a.c("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    yVar = this.Y;
                    i();
                } else {
                    yVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yVar != null) {
            yVar.e();
        }
    }

    public final synchronized void d(int i10) {
        y yVar;
        g5.a.c("Not yet complete!", e());
        if (this.N.getAndAdd(i10) == 0 && (yVar = this.Y) != null) {
            yVar.a();
        }
    }

    public final boolean e() {
        return this.X || this.V || this.f16805a0;
    }

    public final void f() {
        synchronized (this) {
            try {
                this.f16808e.a();
                if (this.f16805a0) {
                    i();
                    return;
                }
                if (this.f16806b.f16803b.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.X) {
                    throw new IllegalStateException("Already failed once");
                }
                this.X = true;
                q2.j jVar = this.O;
                t tVar = this.f16806b;
                tVar.getClass();
                ArrayList<s> arrayList = new ArrayList(tVar.f16803b);
                d(arrayList.size() + 1);
                ((q) this.f16812n).e(this, jVar, null);
                for (s sVar : arrayList) {
                    sVar.f16802b.execute(new r(this, sVar.f16801a, 0));
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j3.b
    public final j3.e g() {
        return this.f16808e;
    }

    public final void h() {
        synchronized (this) {
            try {
                this.f16808e.a();
                if (this.f16805a0) {
                    this.T.d();
                    i();
                    return;
                }
                if (this.f16806b.f16803b.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.V) {
                    throw new IllegalStateException("Already have resource");
                }
                g8.e eVar = this.f16811m;
                e0 e0Var = this.T;
                boolean z7 = this.P;
                q2.j jVar = this.O;
                x xVar = this.f16809f;
                eVar.getClass();
                this.Y = new y(e0Var, z7, true, jVar, xVar);
                int i10 = 1;
                this.V = true;
                t tVar = this.f16806b;
                tVar.getClass();
                ArrayList<s> arrayList = new ArrayList(tVar.f16803b);
                d(arrayList.size() + 1);
                ((q) this.f16812n).e(this, this.O, this.Y);
                for (s sVar : arrayList) {
                    sVar.f16802b.execute(new r(this, sVar.f16801a, i10));
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void i() {
        if (this.O == null) {
            throw new IllegalArgumentException();
        }
        this.f16806b.f16803b.clear();
        this.O = null;
        this.Y = null;
        this.T = null;
        this.X = false;
        this.f16805a0 = false;
        this.V = false;
        this.f16807b0 = false;
        this.Z.t();
        this.Z = null;
        this.W = null;
        this.U = null;
        this.f16810j.d(this);
    }

    public final synchronized void j(e3.f fVar) {
        try {
            this.f16808e.a();
            t tVar = this.f16806b;
            tVar.f16803b.remove(new s(fVar, i3.g.f13292b));
            if (this.f16806b.f16803b.isEmpty()) {
                b();
                if (this.V || this.X) {
                    if (this.N.get() == 0) {
                        i();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(m mVar) {
        this.Z = mVar;
        int iO = mVar.o(1);
        ((iO == 2 || iO == 3) ? this.f16813t : this.Q ? this.f16815w : this.R ? this.M : this.f16814u).execute(mVar);
    }
}