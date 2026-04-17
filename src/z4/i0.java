package z4;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.bu0;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.ic1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i0 implements y4.k, y4.l, g1 {
    public final /* synthetic */ g P;

    /* renamed from: e, reason: collision with root package name */
    public final a5.k f19650e;

    /* renamed from: f, reason: collision with root package name */
    public final a f19651f;

    /* renamed from: j, reason: collision with root package name */
    public final fx f19652j;

    /* renamed from: t, reason: collision with root package name */
    public final int f19655t;

    /* renamed from: u, reason: collision with root package name */
    public final v0 f19656u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19657w;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedList f19649b = new LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f19653m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f19654n = new HashMap();
    public final ArrayList M = new ArrayList();
    public x4.b N = null;
    public int O = 0;

    public i0(g gVar, y4.i iVar) {
        this.P = gVar;
        Looper looper = gVar.P.getLooper();
        a5.h hVarA = iVar.b().a();
        g5.a aVar = iVar.f19244c.f19235a;
        fc.t.k(aVar);
        a5.k kVarA = aVar.a(iVar.f19242a, looper, hVarA, iVar.f19245d, this, this);
        String str = iVar.f19243b;
        if (str != null) {
            kVarA.f313a0 = str;
        }
        this.f19650e = kVarA;
        this.f19651f = iVar.f19246e;
        this.f19652j = new fx(1);
        this.f19655t = iVar.f19247f;
        if (kVarA.o()) {
            this.f19656u = new v0(gVar.f19640m, gVar.P, iVar.b().a());
        } else {
            this.f19656u = null;
        }
    }

    @Override // z4.f
    public final void A(int i10) {
        Looper looperMyLooper = Looper.myLooper();
        g gVar = this.P;
        if (looperMyLooper == gVar.P.getLooper()) {
            f(i10);
        } else {
            gVar.P.post(new y1.p(this, i10, 2));
        }
    }

    @Override // z4.f
    public final void T(Bundle bundle) {
        Looper looperMyLooper = Looper.myLooper();
        g gVar = this.P;
        if (looperMyLooper == gVar.P.getLooper()) {
            e();
        } else {
            gVar.P.post(new t0(this, 2));
        }
    }

    public final void a(x4.b bVar) {
        HashSet hashSet = this.f19653m;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        ic1.v(it.next());
        if (o5.y.i(bVar, x4.b.f18950m)) {
            this.f19650e.w();
        }
        throw null;
    }

    public final void b(Status status) {
        fc.t.e(this.P.P);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z7) {
        fc.t.e(this.P.P);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f19649b.iterator();
        while (it.hasNext()) {
            a1 a1Var = (a1) it.next();
            if (!z7 || a1Var.f19590a == 2) {
                if (status != null) {
                    a1Var.a(status);
                } else {
                    a1Var.b(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f19649b;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a1 a1Var = (a1) arrayList.get(i10);
            if (!this.f19650e.a()) {
                return;
            }
            if (h(a1Var)) {
                linkedList.remove(a1Var);
            }
        }
    }

    public final void e() {
        g gVar = this.P;
        fc.t.e(gVar.P);
        this.N = null;
        a(x4.b.f18950m);
        if (this.f19657w) {
            bu0 bu0Var = gVar.P;
            a aVar = this.f19651f;
            bu0Var.removeMessages(11, aVar);
            gVar.P.removeMessages(9, aVar);
            this.f19657w = false;
        }
        Iterator it = this.f19654n.values().iterator();
        if (it.hasNext()) {
            ic1.v(it.next());
            throw null;
        }
        d();
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i10) {
        Iterator it;
        String str;
        fc.t.e(this.P.P);
        this.N = null;
        this.f19657w = true;
        String str2 = this.f19650e.f323n;
        fx fxVar = this.f19652j;
        fxVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i10 != 1) {
            str = i10 == 3 ? " due to dead object exception." : " due to service disconnection.";
            if (str2 != null) {
                sb.append(" Last reason for disconnect: ");
                sb.append(str2);
            }
            fxVar.a(true, new Status(20, sb.toString(), null, null));
            a aVar = this.f19651f;
            bu0 bu0Var = this.P.P;
            bu0Var.sendMessageDelayed(Message.obtain(bu0Var, 9, aVar), 5000L);
            a aVar2 = this.f19651f;
            bu0 bu0Var2 = this.P.P;
            bu0Var2.sendMessageDelayed(Message.obtain(bu0Var2, 11, aVar2), 120000L);
            ((SparseIntArray) this.P.f19642t.f12309e).clear();
            it = this.f19654n.values().iterator();
            if (it.hasNext()) {
                return;
            }
            ic1.v(it.next());
            throw null;
        }
        sb.append(str);
        if (str2 != null) {
        }
        fxVar.a(true, new Status(20, sb.toString(), null, null));
        a aVar3 = this.f19651f;
        bu0 bu0Var3 = this.P.P;
        bu0Var3.sendMessageDelayed(Message.obtain(bu0Var3, 9, aVar3), 5000L);
        a aVar22 = this.f19651f;
        bu0 bu0Var22 = this.P.P;
        bu0Var22.sendMessageDelayed(Message.obtain(bu0Var22, 11, aVar22), 120000L);
        ((SparseIntArray) this.P.f19642t.f12309e).clear();
        it = this.f19654n.values().iterator();
        if (it.hasNext()) {
        }
    }

    public final void g() {
        g gVar = this.P;
        bu0 bu0Var = gVar.P;
        a aVar = this.f19651f;
        bu0Var.removeMessages(12, aVar);
        bu0 bu0Var2 = gVar.P;
        bu0Var2.sendMessageDelayed(bu0Var2.obtainMessage(12, aVar), gVar.f19636b);
    }

    public final boolean h(a1 a1Var) throws Resources.NotFoundException {
        x4.d dVar;
        if (!(a1Var instanceof o0)) {
            a5.k kVar = this.f19650e;
            a1Var.d(this.f19652j, kVar.o());
            try {
                a1Var.c(this);
            } catch (DeadObjectException unused) {
                A(1);
                kVar.g("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        o0 o0Var = (o0) a1Var;
        x4.d[] dVarArrG = o0Var.g(this);
        if (dVarArrG == null || dVarArrG.length == 0) {
            dVar = null;
        } else {
            x4.d[] dVarArrU = this.f19650e.u();
            if (dVarArrU == null) {
                dVarArrU = new x4.d[0];
            }
            t.b bVar = new t.b(dVarArrU.length);
            for (x4.d dVar2 : dVarArrU) {
                bVar.put(dVar2.f18958b, Long.valueOf(dVar2.h()));
            }
            int length = dVarArrG.length;
            for (int i10 = 0; i10 < length; i10++) {
                dVar = dVarArrG[i10];
                Long l10 = (Long) bVar.getOrDefault(dVar.f18958b, null);
                if (l10 == null || l10.longValue() < dVar.h()) {
                    break;
                }
            }
            dVar = null;
        }
        if (dVar == null) {
            a5.k kVar2 = this.f19650e;
            a1Var.d(this.f19652j, kVar2.o());
            try {
                a1Var.c(this);
            } catch (DeadObjectException unused2) {
                A(1);
                kVar2.g("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.f19650e.getClass().getName() + " could not execute call because it requires feature (" + dVar.f18958b + ", " + dVar.h() + ").");
        if (!this.P.Q || !o0Var.f(this)) {
            o0Var.b(new y4.o(dVar));
            return true;
        }
        j0 j0Var = new j0(this.f19651f, dVar);
        int iIndexOf = this.M.indexOf(j0Var);
        if (iIndexOf >= 0) {
            j0 j0Var2 = (j0) this.M.get(iIndexOf);
            this.P.P.removeMessages(15, j0Var2);
            bu0 bu0Var = this.P.P;
            bu0Var.sendMessageDelayed(Message.obtain(bu0Var, 15, j0Var2), 5000L);
        } else {
            this.M.add(j0Var);
            bu0 bu0Var2 = this.P.P;
            bu0Var2.sendMessageDelayed(Message.obtain(bu0Var2, 15, j0Var), 5000L);
            bu0 bu0Var3 = this.P.P;
            bu0Var3.sendMessageDelayed(Message.obtain(bu0Var3, 16, j0Var), 120000L);
            x4.b bVar2 = new x4.b(2, null);
            if (!i(bVar2)) {
                this.P.b(bVar2, this.f19655t);
            }
        }
        return false;
    }

    public final boolean i(x4.b bVar) {
        synchronized (g.T) {
            this.P.getClass();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [a5.k, u5.c] */
    public final void j() {
        x4.b bVar;
        g gVar = this.P;
        fc.t.e(gVar.P);
        a5.k kVar = this.f19650e;
        if (kVar.a() || kVar.D()) {
            return;
        }
        try {
            int i10 = gVar.f19642t.i(gVar.f19640m, kVar);
            if (i10 != 0) {
                x4.b bVar2 = new x4.b(i10, null);
                Log.w("GoogleApiManager", "The service for " + kVar.getClass().getName() + " is not available: " + bVar2.toString());
                l(bVar2, null);
                return;
            }
            k0 k0Var = new k0(gVar, kVar, this.f19651f);
            if (kVar.o()) {
                v0 v0Var = this.f19656u;
                fc.t.k(v0Var);
                u5.c cVar = v0Var.f19723t;
                if (cVar != null) {
                    cVar.m();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(v0Var));
                a5.h hVar = v0Var.f19722n;
                hVar.f338i = numValueOf;
                c5.b bVar3 = v0Var.f19720j;
                Context context = v0Var.f19718e;
                Handler handler = v0Var.f19719f;
                v0Var.f19723t = bVar3.a(context, handler.getLooper(), hVar, hVar.f337h, v0Var, v0Var);
                v0Var.f19724u = k0Var;
                Set set = v0Var.f19721m;
                if (set == null || set.isEmpty()) {
                    handler.post(new t0(v0Var, 0));
                } else {
                    v0Var.f19723t.p();
                }
            }
            try {
                kVar.c(k0Var);
            } catch (SecurityException e10) {
                e = e10;
                bVar = new x4.b(10);
                l(bVar, e);
            }
        } catch (IllegalStateException e11) {
            e = e11;
            bVar = new x4.b(10);
        }
    }

    public final void k(a1 a1Var) {
        fc.t.e(this.P.P);
        boolean zA = this.f19650e.a();
        LinkedList linkedList = this.f19649b;
        if (zA) {
            if (h(a1Var)) {
                g();
                return;
            } else {
                linkedList.add(a1Var);
                return;
            }
        }
        linkedList.add(a1Var);
        x4.b bVar = this.N;
        if (bVar == null || !bVar.h()) {
            j();
        } else {
            l(this.N, null);
        }
    }

    public final void l(x4.b bVar, RuntimeException runtimeException) {
        u5.c cVar;
        fc.t.e(this.P.P);
        v0 v0Var = this.f19656u;
        if (v0Var != null && (cVar = v0Var.f19723t) != null) {
            cVar.m();
        }
        fc.t.e(this.P.P);
        this.N = null;
        ((SparseIntArray) this.P.f19642t.f12309e).clear();
        a(bVar);
        if ((this.f19650e instanceof c5.d) && bVar.f18952e != 24) {
            g gVar = this.P;
            gVar.f19637e = true;
            bu0 bu0Var = gVar.P;
            bu0Var.sendMessageDelayed(bu0Var.obtainMessage(19), 300000L);
        }
        if (bVar.f18952e == 4) {
            b(g.S);
            return;
        }
        if (this.f19649b.isEmpty()) {
            this.N = bVar;
            return;
        }
        if (runtimeException != null) {
            fc.t.e(this.P.P);
            c(null, runtimeException, false);
            return;
        }
        if (!this.P.Q) {
            b(g.c(this.f19651f, bVar));
            return;
        }
        c(g.c(this.f19651f, bVar), null, true);
        if (this.f19649b.isEmpty() || i(bVar) || this.P.b(bVar, this.f19655t)) {
            return;
        }
        if (bVar.f18952e == 18) {
            this.f19657w = true;
        }
        if (!this.f19657w) {
            b(g.c(this.f19651f, bVar));
            return;
        }
        g gVar2 = this.P;
        a aVar = this.f19651f;
        bu0 bu0Var2 = gVar2.P;
        bu0Var2.sendMessageDelayed(Message.obtain(bu0Var2, 9, aVar), 5000L);
    }

    public final void m(x4.b bVar) {
        fc.t.e(this.P.P);
        a5.k kVar = this.f19650e;
        kVar.g("onSignInFailed for " + kVar.getClass().getName() + " with " + String.valueOf(bVar));
        l(bVar, null);
    }

    public final void n() {
        g gVar = this.P;
        fc.t.e(gVar.P);
        Status status = g.R;
        b(status);
        fx fxVar = this.f19652j;
        fxVar.getClass();
        fxVar.a(false, status);
        for (k kVar : (k[]) this.f19654n.keySet().toArray(new k[0])) {
            k(new z0(kVar, new x5.l()));
        }
        a(new x4.b(4));
        a5.k kVar2 = this.f19650e;
        if (kVar2.a()) {
            d9.c cVar = new d9.c(this);
            kVar2.getClass();
            gVar.P.post(new t0(cVar, 3));
        }
    }

    @Override // z4.g1
    public final void p1(x4.b bVar, y4.e eVar, boolean z7) {
        throw null;
    }

    @Override // z4.n
    public final void x(x4.b bVar) {
        l(bVar, null);
    }
}