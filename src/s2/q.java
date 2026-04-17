package s2;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.ic1;
import g.u0;
import g.v0;
import java.util.Map;
import java.util.concurrent.Executor;
import m.s3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q implements v, u2.h, x {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f16790h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final fx f16791a;

    /* renamed from: b, reason: collision with root package name */
    public final v6.e f16792b;

    /* renamed from: c, reason: collision with root package name */
    public final u2.g f16793c;

    /* renamed from: d, reason: collision with root package name */
    public final s3 f16794d;

    /* renamed from: e, reason: collision with root package name */
    public final com.onesignal.w f16795e;

    /* renamed from: f, reason: collision with root package name */
    public final g0.d f16796f;

    /* renamed from: g, reason: collision with root package name */
    public final c f16797g;

    public q(u2.g gVar, u2.d dVar, v2.d dVar2, v2.d dVar3, v2.d dVar4, v2.d dVar5) {
        this.f16793c = gVar;
        x4.k kVar = new x4.k(dVar);
        c cVar = new c();
        this.f16797g = cVar;
        synchronized (this) {
            synchronized (cVar) {
                cVar.f16693d = this;
            }
        }
        this.f16792b = new v6.e(24, (Object) null);
        this.f16791a = new fx(0);
        s3 s3Var = new s3();
        s3Var.f14933t = j3.d.a(150, new u0(s3Var, 18));
        s3Var.f14927b = dVar2;
        s3Var.f14928e = dVar3;
        s3Var.f14929f = dVar4;
        s3Var.f14930j = dVar5;
        s3Var.f14931m = this;
        s3Var.f14932n = this;
        this.f16794d = s3Var;
        g0.d dVar6 = new g0.d();
        dVar6.f12952f = j3.d.a(150, new v0(dVar6, 12));
        dVar6.f12951e = kVar;
        this.f16796f = dVar6;
        this.f16795e = new com.onesignal.w(2);
        gVar.f18236e = this;
    }

    public static void d(String str, long j10, q2.j jVar) {
        StringBuilder sbO = ic1.o(str, " in ");
        sbO.append(i3.i.a(j10));
        sbO.append("ms, key: ");
        sbO.append(jVar);
        Log.v("Engine", sbO.toString());
    }

    public static void g(e0 e0Var) {
        if (!(e0Var instanceof y)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((y) e0Var).e();
    }

    public final k a(com.bumptech.glide.h hVar, Object obj, q2.j jVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.i iVar, p pVar, i3.d dVar, boolean z7, boolean z10, q2.n nVar, boolean z11, boolean z12, boolean z13, boolean z14, e3.f fVar, Executor executor) {
        long jElapsedRealtimeNanos;
        if (f16790h) {
            int i12 = i3.i.f13294b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        long j10 = jElapsedRealtimeNanos;
        this.f16792b.getClass();
        w wVar = new w(obj, jVar, i10, i11, dVar, cls, cls2, nVar);
        synchronized (this) {
            try {
                y yVarC = c(wVar, z11, j10);
                if (yVarC == null) {
                    return h(hVar, obj, jVar, i10, i11, cls, cls2, iVar, pVar, dVar, z7, z10, nVar, z11, z12, z13, z14, fVar, executor, wVar, j10);
                }
                ((e3.g) fVar).m(yVarC, q2.a.f16117m, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final y b(q2.j jVar) {
        Object obj;
        u2.g gVar = this.f16793c;
        synchronized (gVar) {
            i3.j jVar2 = (i3.j) gVar.f13297a.remove(jVar);
            if (jVar2 == null) {
                obj = null;
            } else {
                gVar.f13299c -= jVar2.f13296b;
                obj = jVar2.f13295a;
            }
        }
        e0 e0Var = (e0) obj;
        y yVar = e0Var != null ? e0Var instanceof y ? (y) e0Var : new y(e0Var, true, true, jVar, this) : null;
        if (yVar != null) {
            yVar.a();
            this.f16797g.a(jVar, yVar);
        }
        return yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final y c(w wVar, boolean z7, long j10) {
        y yVar;
        if (!z7) {
            return null;
        }
        c cVar = this.f16797g;
        synchronized (cVar) {
            b bVar = (b) cVar.f16691b.get(wVar);
            if (bVar == null) {
                yVar = null;
            } else {
                yVar = (y) bVar.get();
                if (yVar == null) {
                    cVar.b(bVar);
                }
            }
        }
        if (yVar != null) {
            yVar.a();
        }
        if (yVar != null) {
            if (f16790h) {
                d("Loaded resource from active resources", j10, wVar);
            }
            return yVar;
        }
        y yVarB = b(wVar);
        if (yVarB == null) {
            return null;
        }
        if (f16790h) {
            d("Loaded resource from cache", j10, wVar);
        }
        return yVarB;
    }

    public final synchronized void e(u uVar, q2.j jVar, y yVar) {
        if (yVar != null) {
            try {
                if (yVar.f16825b) {
                    this.f16797g.a(jVar, yVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        fx fxVar = this.f16791a;
        fxVar.getClass();
        Map map = uVar.S ? fxVar.f4470b : fxVar.f4469a;
        if (uVar.equals(map.get(jVar))) {
            map.remove(jVar);
        }
    }

    public final void f(q2.j jVar, y yVar) {
        c cVar = this.f16797g;
        synchronized (cVar) {
            b bVar = (b) cVar.f16691b.remove(jVar);
            if (bVar != null) {
                bVar.f16689c = null;
                bVar.clear();
            }
        }
        if (yVar.f16825b) {
        } else {
            this.f16795e.b(yVar, false);
        }
    }

    public final k h(com.bumptech.glide.h hVar, Object obj, q2.j jVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.i iVar, p pVar, i3.d dVar, boolean z7, boolean z10, q2.n nVar, boolean z11, boolean z12, boolean z13, boolean z14, e3.f fVar, Executor executor, w wVar, long j10) {
        fx fxVar = this.f16791a;
        u uVar = (u) (z14 ? fxVar.f4470b : fxVar.f4469a).get(wVar);
        if (uVar != null) {
            uVar.a(fVar, executor);
            if (f16790h) {
                d("Added to existing load", j10, wVar);
            }
            return new k(this, fVar, uVar);
        }
        u uVar2 = (u) ((n0.c) this.f16794d.f14933t).j();
        g5.a.f(uVar2);
        synchronized (uVar2) {
            uVar2.O = wVar;
            uVar2.P = z11;
            uVar2.Q = z12;
            uVar2.R = z13;
            uVar2.S = z14;
        }
        g0.d dVar2 = this.f16796f;
        m mVar = (m) ((n0.c) dVar2.f12952f).j();
        g5.a.f(mVar);
        int i12 = dVar2.f12950b;
        dVar2.f12950b = i12 + 1;
        i iVar2 = mVar.f16764b;
        iVar2.f16734c = hVar;
        iVar2.f16735d = obj;
        iVar2.f16745n = jVar;
        iVar2.f16736e = i10;
        iVar2.f16737f = i11;
        iVar2.f16747p = pVar;
        iVar2.f16738g = cls;
        iVar2.f16739h = mVar.f16775j;
        iVar2.f16742k = cls2;
        iVar2.f16746o = iVar;
        iVar2.f16740i = nVar;
        iVar2.f16741j = dVar;
        iVar2.f16748q = z7;
        iVar2.f16749r = z10;
        mVar.f16779u = hVar;
        mVar.f16780w = jVar;
        mVar.M = iVar;
        mVar.N = wVar;
        mVar.O = i10;
        mVar.P = i11;
        mVar.Q = pVar;
        mVar.V = z14;
        mVar.R = nVar;
        mVar.S = uVar2;
        mVar.T = i12;
        mVar.f16774i0 = 1;
        mVar.W = obj;
        fx fxVar2 = this.f16791a;
        fxVar2.getClass();
        (uVar2.S ? fxVar2.f4470b : fxVar2.f4469a).put(wVar, uVar2);
        uVar2.a(fVar, executor);
        uVar2.k(mVar);
        if (f16790h) {
            d("Started new load", j10, wVar);
        }
        return new k(this, fVar, uVar2);
    }
}