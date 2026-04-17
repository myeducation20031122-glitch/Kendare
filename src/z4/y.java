package z4;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y implements c0 {
    public u5.c N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public a5.l R;
    public boolean S;
    public boolean T;
    public final a5.h U;
    public final Map V;
    public final g5.a W;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f19730b;

    /* renamed from: e, reason: collision with root package name */
    public final Lock f19731e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f19732f;

    /* renamed from: j, reason: collision with root package name */
    public final x4.g f19733j;

    /* renamed from: m, reason: collision with root package name */
    public x4.b f19734m;

    /* renamed from: n, reason: collision with root package name */
    public int f19735n;

    /* renamed from: u, reason: collision with root package name */
    public int f19737u;

    /* renamed from: t, reason: collision with root package name */
    public int f19736t = 0;

    /* renamed from: w, reason: collision with root package name */
    public final Bundle f19738w = new Bundle();
    public final HashSet M = new HashSet();
    public final ArrayList X = new ArrayList();

    public y(e0 e0Var, a5.h hVar, Map map, x4.g gVar, g5.a aVar, Lock lock, Context context) {
        this.f19730b = e0Var;
        this.U = hVar;
        this.V = map;
        this.f19733j = gVar;
        this.W = aVar;
        this.f19731e = lock;
        this.f19732f = context;
    }

    public final void a() {
        this.P = false;
        e0 e0Var = this.f19730b;
        e0Var.P.f19605p = Collections.emptySet();
        Iterator it = this.M.iterator();
        while (it.hasNext()) {
            y4.d dVar = (y4.d) it.next();
            HashMap map = e0Var.f19628t;
            if (!map.containsKey(dVar)) {
                map.put(dVar, new x4.b(17, null));
            }
        }
    }

    @Override // z4.c0
    public final void b(Bundle bundle) {
        if (n(1)) {
            if (bundle != null) {
                this.f19738w.putAll(bundle);
            }
            if (o()) {
                j();
            }
        }
    }

    @Override // z4.c0
    public final void c(int i10) {
        k(new x4.b(8, null));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [a5.k, u5.c] */
    @Override // z4.c0
    public final void d() {
        Map map;
        e0 e0Var = this.f19730b;
        e0Var.f19628t.clear();
        int i10 = 0;
        this.P = false;
        this.f19734m = null;
        this.f19736t = 0;
        this.O = true;
        this.Q = false;
        this.S = false;
        HashMap map2 = new HashMap();
        Map map3 = this.V;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = e0Var.f19627n;
            if (!zHasNext) {
                break;
            }
            y4.e eVar = (y4.e) it.next();
            y4.c cVar = (y4.c) map.get(eVar.f19236b);
            fc.t.k(cVar);
            y4.c cVar2 = cVar;
            eVar.f19235a.getClass();
            boolean zBooleanValue = ((Boolean) map3.get(eVar)).booleanValue();
            if (cVar2.o()) {
                this.P = true;
                if (zBooleanValue) {
                    this.M.add(eVar.f19236b);
                } else {
                    this.O = false;
                }
            }
            map2.put(cVar2, new t(this, eVar, zBooleanValue));
        }
        if (this.P) {
            a5.h hVar = this.U;
            fc.t.k(hVar);
            fc.t.k(this.W);
            b0 b0Var = e0Var.P;
            hVar.f338i = Integer.valueOf(System.identityHashCode(b0Var));
            x xVar = new x(this);
            this.N = this.W.a(this.f19732f, b0Var.f19596g, hVar, hVar.f337h, xVar, xVar);
        }
        this.f19737u = map.size();
        this.X.add(f0.f19632a.submit(new v(this, map2, i10)));
    }

    @Override // z4.c0
    public final void e() {
    }

    @Override // z4.c0
    public final p5.c f(p5.c cVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // z4.c0
    public final boolean g() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        i(true);
        this.f19730b.f();
        return true;
    }

    @Override // z4.c0
    public final void h(x4.b bVar, y4.e eVar, boolean z7) {
        if (n(1)) {
            l(bVar, eVar, z7);
            if (o()) {
                j();
            }
        }
    }

    public final void i(boolean z7) {
        u5.c cVar = this.N;
        if (cVar != null) {
            if (cVar.a() && z7) {
                cVar.l();
            }
            cVar.m();
            fc.t.k(this.U);
            this.R = null;
        }
    }

    public final void j() {
        e0 e0Var = this.f19730b;
        e0Var.f19622b.lock();
        try {
            e0Var.P.k();
            e0Var.N = new s(e0Var);
            e0Var.N.d();
            e0Var.f19623e.signalAll();
            e0Var.f19622b.unlock();
            f0.f19632a.execute(new t0(this, 1));
            u5.c cVar = this.N;
            if (cVar != null) {
                if (this.S) {
                    a5.l lVar = this.R;
                    fc.t.k(lVar);
                    cVar.h(lVar, this.T);
                }
                i(false);
            }
            Iterator it = this.f19730b.f19628t.keySet().iterator();
            while (it.hasNext()) {
                y4.c cVar2 = (y4.c) this.f19730b.f19627n.get((y4.d) it.next());
                fc.t.k(cVar2);
                cVar2.m();
            }
            this.f19730b.Q.a(this.f19738w.isEmpty() ? null : this.f19738w);
        } catch (Throwable th) {
            e0Var.f19622b.unlock();
            throw th;
        }
    }

    public final void k(x4.b bVar) {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        i(!bVar.h());
        e0 e0Var = this.f19730b;
        e0Var.f();
        e0Var.Q.b(bVar);
    }

    public final void l(x4.b bVar, y4.e eVar, boolean z7) {
        eVar.f19235a.getClass();
        if ((!z7 || bVar.h() || this.f19733j.b(bVar.f18952e, null, null) != null) && (this.f19734m == null || Integer.MAX_VALUE < this.f19735n)) {
            this.f19734m = bVar;
            this.f19735n = Integer.MAX_VALUE;
        }
        this.f19730b.f19628t.put(eVar.f19236b, bVar);
    }

    public final void m() {
        if (this.f19737u != 0) {
            return;
        }
        if (!this.P || this.Q) {
            ArrayList arrayList = new ArrayList();
            int i10 = 1;
            this.f19736t = 1;
            e0 e0Var = this.f19730b;
            this.f19737u = e0Var.f19627n.size();
            Map map = e0Var.f19627n;
            for (y4.d dVar : map.keySet()) {
                if (!e0Var.f19628t.containsKey(dVar)) {
                    arrayList.add((y4.c) map.get(dVar));
                } else if (o()) {
                    j();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.X.add(f0.f19632a.submit(new v(this, arrayList, i10)));
        }
    }

    public final boolean n(int i10) {
        if (this.f19736t == i10) {
            return true;
        }
        b0 b0Var = this.f19730b.P;
        b0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        b0Var.h("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.f19737u);
        StringBuilder sbA = a0.h.A("GoogleApiClient connecting is in step ", this.f19736t != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN", " but received callback for step ");
        sbA.append(i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN");
        Log.e("GACConnecting", sbA.toString(), new Exception());
        k(new x4.b(8, null));
        return false;
    }

    public final boolean o() {
        x4.b bVar;
        int i10 = this.f19737u - 1;
        this.f19737u = i10;
        if (i10 > 0) {
            return false;
        }
        e0 e0Var = this.f19730b;
        if (i10 < 0) {
            b0 b0Var = e0Var.P;
            b0Var.getClass();
            StringWriter stringWriter = new StringWriter();
            b0Var.h("", null, new PrintWriter(stringWriter), null);
            Log.w("GACConnecting", stringWriter.toString());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            bVar = new x4.b(8, null);
        } else {
            bVar = this.f19734m;
            if (bVar == null) {
                return true;
            }
            e0Var.O = this.f19735n;
        }
        k(bVar);
        return false;
    }
}