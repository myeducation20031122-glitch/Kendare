package s2;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.measurement.n3;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m implements g, Runnable, Comparable, j3.b {
    public com.bumptech.glide.i M;
    public w N;
    public int O;
    public int P;
    public p Q;
    public q2.n R;
    public j S;
    public int T;
    public long U;
    public boolean V;
    public Object W;
    public Thread X;
    public q2.j Y;
    public q2.j Z;

    /* renamed from: a0, reason: collision with root package name */
    public Object f16763a0;

    /* renamed from: b0, reason: collision with root package name */
    public q2.a f16765b0;

    /* renamed from: c0, reason: collision with root package name */
    public com.bumptech.glide.load.data.e f16766c0;

    /* renamed from: d0, reason: collision with root package name */
    public volatile h f16767d0;

    /* renamed from: e0, reason: collision with root package name */
    public volatile boolean f16769e0;

    /* renamed from: f0, reason: collision with root package name */
    public volatile boolean f16771f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f16772g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f16773h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f16774i0;

    /* renamed from: j, reason: collision with root package name */
    public final x4.k f16775j;

    /* renamed from: m, reason: collision with root package name */
    public final n0.c f16776m;

    /* renamed from: u, reason: collision with root package name */
    public com.bumptech.glide.h f16779u;

    /* renamed from: w, reason: collision with root package name */
    public q2.j f16780w;

    /* renamed from: b, reason: collision with root package name */
    public final i f16764b = new i();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f16768e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final j3.e f16770f = new j3.e();

    /* renamed from: n, reason: collision with root package name */
    public final k f16777n = new k();

    /* renamed from: t, reason: collision with root package name */
    public final l f16778t = new l();

    public m(x4.k kVar, n0.c cVar) {
        this.f16775j = kVar;
        this.f16776m = cVar;
    }

    @Override // s2.g
    public final void c() {
        v(2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        int iOrdinal = this.M.ordinal() - mVar.M.ordinal();
        return iOrdinal == 0 ? this.T - mVar.T : iOrdinal;
    }

    @Override // s2.g
    public final void e(q2.j jVar, Exception exc, com.bumptech.glide.load.data.e eVar, q2.a aVar) {
        eVar.b();
        a0 a0Var = new a0("Fetching data failed", Collections.singletonList(exc));
        Class clsA = eVar.a();
        a0Var.f16683e = jVar;
        a0Var.f16684f = aVar;
        a0Var.f16685j = clsA;
        this.f16768e.add(a0Var);
        if (Thread.currentThread() != this.X) {
            v(2);
        } else {
            w();
        }
    }

    @Override // j3.b
    public final j3.e g() {
        return this.f16770f;
    }

    @Override // s2.g
    public final void j(q2.j jVar, Object obj, com.bumptech.glide.load.data.e eVar, q2.a aVar, q2.j jVar2) {
        this.Y = jVar;
        this.f16763a0 = obj;
        this.f16766c0 = eVar;
        this.f16765b0 = aVar;
        this.Z = jVar2;
        this.f16772g0 = jVar != this.f16764b.a().get(0);
        if (Thread.currentThread() != this.X) {
            v(3);
        } else {
            m();
        }
    }

    public final e0 k(com.bumptech.glide.load.data.e eVar, Object obj, q2.a aVar) {
        if (obj == null) {
            return null;
        }
        try {
            int i10 = i3.i.f13294b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            e0 e0VarL = l(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                p("Decoded result " + e0VarL, null, jElapsedRealtimeNanos);
            }
            return e0VarL;
        } finally {
            eVar.b();
        }
    }

    public final e0 l(Object obj, q2.a aVar) {
        Class<?> cls = obj.getClass();
        i iVar = this.f16764b;
        c0 c0VarC = iVar.c(cls);
        q2.n nVar = this.R;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z7 = aVar == q2.a.f16116j || iVar.f16749r;
            q2.m mVar = z2.p.f19548i;
            Boolean bool = (Boolean) nVar.c(mVar);
            if (bool == null || (bool.booleanValue() && !z7)) {
                nVar = new q2.n();
                i3.d dVar = this.R.f16133b;
                i3.d dVar2 = nVar.f16133b;
                dVar2.j(dVar);
                dVar2.put(mVar, Boolean.valueOf(z7));
            }
        }
        q2.n nVar2 = nVar;
        com.bumptech.glide.load.data.g gVarH = this.f16779u.a().h(obj);
        try {
            return c0VarC.a(this.O, this.P, nVar2, gVarH, new n3(this, aVar, 18));
        } finally {
            gVarH.b();
        }
    }

    public final void m() {
        e0 e0VarK;
        if (Log.isLoggable("DecodeJob", 2)) {
            p("Retrieved data", "data: " + this.f16763a0 + ", cache key: " + this.Y + ", fetcher: " + this.f16766c0, this.U);
        }
        d0 d0Var = null;
        try {
            e0VarK = k(this.f16766c0, this.f16763a0, this.f16765b0);
        } catch (a0 e10) {
            q2.j jVar = this.Z;
            q2.a aVar = this.f16765b0;
            e10.f16683e = jVar;
            e10.f16684f = aVar;
            e10.f16685j = null;
            this.f16768e.add(e10);
            e0VarK = null;
        }
        if (e0VarK == null) {
            w();
            return;
        }
        q2.a aVar2 = this.f16765b0;
        boolean z7 = this.f16772g0;
        if (e0VarK instanceof b0) {
            ((b0) e0VarK).a();
        }
        if (((d0) this.f16777n.f16759c) != null) {
            d0Var = (d0) d0.f16697m.j();
            g5.a.f(d0Var);
            d0Var.f16701j = false;
            d0Var.f16700f = true;
            d0Var.f16699e = e0VarK;
            e0VarK = d0Var;
        }
        y();
        u uVar = (u) this.S;
        synchronized (uVar) {
            uVar.T = e0VarK;
            uVar.U = aVar2;
            uVar.f16807b0 = z7;
        }
        uVar.h();
        this.f16773h0 = 5;
        try {
            k kVar = this.f16777n;
            if (((d0) kVar.f16759c) != null) {
                kVar.a(this.f16775j, this.R);
            }
            r();
        } finally {
            if (d0Var != null) {
                d0Var.a();
            }
        }
    }

    public final h n() {
        int iB = v.h.b(this.f16773h0);
        i iVar = this.f16764b;
        if (iB == 1) {
            return new f0(iVar, this);
        }
        if (iB == 2) {
            return new e(iVar.a(), iVar, this);
        }
        if (iB == 3) {
            return new i0(iVar, this);
        }
        if (iB == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(kc.r.q(this.f16773h0)));
    }

    public final int o(int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            switch (((o) this.Q).f16786d) {
                case QueueFuseable.SYNC /* 1 */:
                case 2:
                    return o(2);
                default:
                    return 2;
            }
        }
        if (i11 == 1) {
            switch (((o) this.Q).f16786d) {
                case QueueFuseable.SYNC /* 1 */:
                    return o(3);
                default:
                    return 3;
            }
        }
        if (i11 == 2) {
            return this.V ? 6 : 4;
        }
        if (i11 == 3 || i11 == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(kc.r.q(i10)));
    }

    public final void p(String str, String str2, long j10) {
        StringBuilder sbO = ic1.o(str, " in ");
        sbO.append(i3.i.a(j10));
        sbO.append(", load key: ");
        sbO.append(this.N);
        sbO.append(str2 != null ? ", ".concat(str2) : "");
        sbO.append(", thread: ");
        sbO.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbO.toString());
    }

    public final void q() {
        y();
        a0 a0Var = new a0("Failed to load resource", new ArrayList(this.f16768e));
        u uVar = (u) this.S;
        synchronized (uVar) {
            uVar.W = a0Var;
        }
        uVar.f();
        s();
    }

    public final void r() {
        boolean zA;
        l lVar = this.f16778t;
        synchronized (lVar) {
            lVar.f16761b = true;
            zA = lVar.a();
        }
        if (zA) {
            u();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.e eVar = this.f16766c0;
        try {
            try {
                if (this.f16771f0) {
                    q();
                    if (eVar != null) {
                        eVar.b();
                        return;
                    }
                    return;
                }
                x();
                if (eVar != null) {
                    eVar.b();
                }
            } catch (Throwable th) {
                if (eVar != null) {
                    eVar.b();
                }
                throw th;
            }
        } catch (d e10) {
            throw e10;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f16771f0 + ", stage: " + kc.r.q(this.f16773h0), th2);
            }
            if (this.f16773h0 != 5) {
                this.f16768e.add(th2);
                q();
            }
            if (!this.f16771f0) {
                throw th2;
            }
            throw th2;
        }
    }

    public final void s() {
        boolean zA;
        l lVar = this.f16778t;
        synchronized (lVar) {
            lVar.f16762c = true;
            zA = lVar.a();
        }
        if (zA) {
            u();
        }
    }

    public final void t() {
        boolean zA;
        l lVar = this.f16778t;
        synchronized (lVar) {
            lVar.f16760a = true;
            zA = lVar.a();
        }
        if (zA) {
            u();
        }
    }

    public final void u() {
        l lVar = this.f16778t;
        synchronized (lVar) {
            lVar.f16761b = false;
            lVar.f16760a = false;
            lVar.f16762c = false;
        }
        k kVar = this.f16777n;
        kVar.f16757a = null;
        kVar.f16758b = null;
        kVar.f16759c = null;
        i iVar = this.f16764b;
        iVar.f16734c = null;
        iVar.f16735d = null;
        iVar.f16745n = null;
        iVar.f16738g = null;
        iVar.f16742k = null;
        iVar.f16740i = null;
        iVar.f16746o = null;
        iVar.f16741j = null;
        iVar.f16747p = null;
        iVar.f16732a.clear();
        iVar.f16743l = false;
        iVar.f16733b.clear();
        iVar.f16744m = false;
        this.f16769e0 = false;
        this.f16779u = null;
        this.f16780w = null;
        this.R = null;
        this.M = null;
        this.N = null;
        this.S = null;
        this.f16773h0 = 0;
        this.f16767d0 = null;
        this.X = null;
        this.Y = null;
        this.f16763a0 = null;
        this.f16765b0 = null;
        this.f16766c0 = null;
        this.U = 0L;
        this.f16771f0 = false;
        this.f16768e.clear();
        this.f16776m.d(this);
    }

    public final void v(int i10) {
        this.f16774i0 = i10;
        u uVar = (u) this.S;
        (uVar.Q ? uVar.f16815w : uVar.R ? uVar.M : uVar.f16814u).execute(this);
    }

    public final void w() {
        this.X = Thread.currentThread();
        int i10 = i3.i.f13294b;
        this.U = SystemClock.elapsedRealtimeNanos();
        boolean zA = false;
        while (!this.f16771f0 && this.f16767d0 != null && !(zA = this.f16767d0.a())) {
            this.f16773h0 = o(this.f16773h0);
            this.f16767d0 = n();
            if (this.f16773h0 == 4) {
                v(2);
                return;
            }
        }
        if ((this.f16773h0 == 6 || this.f16771f0) && !zA) {
            q();
        }
    }

    public final void x() {
        int iB = v.h.b(this.f16774i0);
        if (iB == 0) {
            this.f16773h0 = o(1);
            this.f16767d0 = n();
        } else if (iB != 1) {
            if (iB != 2) {
                throw new IllegalStateException("Unrecognized run reason: ".concat(kc.r.p(this.f16774i0)));
            }
            m();
            return;
        }
        w();
    }

    public final void y() {
        Throwable th;
        this.f16770f.a();
        if (!this.f16769e0) {
            this.f16769e0 = true;
            return;
        }
        if (this.f16768e.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f16768e;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }
}