package z4;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.ic1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p implements p0 {
    public final Lock O;

    /* renamed from: b, reason: collision with root package name */
    public final Context f19679b;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f19680e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f19681f;

    /* renamed from: j, reason: collision with root package name */
    public final e0 f19682j;

    /* renamed from: m, reason: collision with root package name */
    public final Map f19683m;

    /* renamed from: t, reason: collision with root package name */
    public final y4.c f19685t;

    /* renamed from: u, reason: collision with root package name */
    public Bundle f19686u;

    /* renamed from: n, reason: collision with root package name */
    public final Set f19684n = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: w, reason: collision with root package name */
    public x4.b f19687w = null;
    public x4.b M = null;
    public boolean N = false;
    public int P = 0;

    public p(Context context, b0 b0Var, Lock lock, Looper looper, x4.f fVar, t.b bVar, t.b bVar2, a5.h hVar, g5.a aVar, y4.c cVar, ArrayList arrayList, ArrayList arrayList2, t.b bVar3, t.b bVar4) {
        this.f19679b = context;
        this.f19680e = b0Var;
        this.O = lock;
        this.f19685t = cVar;
        this.f19681f = new e0(context, b0Var, lock, looper, fVar, bVar2, null, bVar4, null, arrayList2, new h1(this, 0));
        this.f19682j = new e0(context, b0Var, lock, looper, fVar, bVar, hVar, bVar3, aVar, arrayList, new h1(this, 1));
        t.b bVar5 = new t.b();
        Iterator it = ((t.h) bVar2.keySet()).iterator();
        while (it.hasNext()) {
            bVar5.put((y4.d) it.next(), this.f19681f);
        }
        Iterator it2 = ((t.h) bVar.keySet()).iterator();
        while (it2.hasNext()) {
            bVar5.put((y4.d) it2.next(), this.f19682j);
        }
        this.f19683m = Collections.unmodifiableMap(bVar5);
    }

    public static /* bridge */ /* synthetic */ void h(p pVar, int i10, boolean z7) {
        pVar.f19680e.c(i10, z7);
        pVar.M = null;
        pVar.f19687w = null;
    }

    public static void i(p pVar) {
        x4.b bVar;
        x4.b bVar2;
        x4.b bVar3;
        x4.b bVar4 = pVar.f19687w;
        boolean z7 = bVar4 != null && bVar4.l();
        e0 e0Var = pVar.f19681f;
        if (!z7) {
            x4.b bVar5 = pVar.f19687w;
            e0 e0Var2 = pVar.f19682j;
            if (bVar5 != null && (bVar2 = pVar.M) != null && bVar2.l()) {
                e0Var2.b();
                x4.b bVar6 = pVar.f19687w;
                fc.t.k(bVar6);
                pVar.f(bVar6);
                return;
            }
            x4.b bVar7 = pVar.f19687w;
            if (bVar7 == null || (bVar = pVar.M) == null) {
                return;
            }
            if (e0Var2.O < e0Var.O) {
                bVar7 = bVar;
            }
            pVar.f(bVar7);
            return;
        }
        x4.b bVar8 = pVar.M;
        if (!(bVar8 != null && bVar8.l()) && ((bVar3 = pVar.M) == null || bVar3.f18952e != 4)) {
            if (bVar3 != null) {
                if (pVar.P == 1) {
                    pVar.g();
                    return;
                } else {
                    pVar.f(bVar3);
                    e0Var.b();
                    return;
                }
            }
            return;
        }
        int i10 = pVar.P;
        if (i10 == 1) {
            pVar.g();
        } else if (i10 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
        } else {
            b0 b0Var = pVar.f19680e;
            fc.t.k(b0Var);
            b0Var.a(pVar.f19686u);
            pVar.g();
        }
        pVar.P = 0;
    }

    @Override // z4.p0
    public final void a() {
        this.P = 2;
        this.N = false;
        this.M = null;
        this.f19687w = null;
        this.f19681f.a();
        this.f19682j.a();
    }

    @Override // z4.p0
    public final void b() {
        this.M = null;
        this.f19687w = null;
        this.P = 0;
        this.f19681f.b();
        this.f19682j.b();
        g();
    }

    @Override // z4.p0
    public final p5.c c(p5.c cVar) {
        PendingIntent activity;
        e0 e0Var = (e0) this.f19683m.get(cVar.f15943k);
        fc.t.l(e0Var, "GoogleApiClient is not configured to use the API required for this call.");
        if (!e0Var.equals(this.f19682j)) {
            e0 e0Var2 = this.f19681f;
            e0Var2.getClass();
            cVar.p0();
            return e0Var2.N.f(cVar);
        }
        x4.b bVar = this.M;
        if (bVar == null || bVar.f18952e != 4) {
            e0 e0Var3 = this.f19682j;
            e0Var3.getClass();
            cVar.p0();
            return e0Var3.N.f(cVar);
        }
        y4.c cVar2 = this.f19685t;
        if (cVar2 == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(this.f19679b, System.identityHashCode(this.f19680e), cVar2.n(), l5.d.f14649a | 134217728);
        }
        cVar.s0(new Status(4, null, activity, null));
        return cVar;
    }

    @Override // z4.p0
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f19682j.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f19681f.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // z4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        x4.b bVar;
        this.O.lock();
        try {
            boolean z7 = false;
            if (this.f19681f.N instanceof s) {
                if ((this.f19682j.N instanceof s) || ((bVar = this.M) != null && bVar.f18952e == 4)) {
                    z7 = true;
                } else if (this.P == 1) {
                }
            }
            return z7;
        } finally {
            this.O.unlock();
        }
    }

    public final void f(x4.b bVar) {
        int i10 = this.P;
        if (i10 == 1) {
            g();
        } else if (i10 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.f19680e.b(bVar);
            g();
        }
        this.P = 0;
    }

    public final void g() {
        Set set = this.f19684n;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ic1.v(it.next());
            throw null;
        }
        set.clear();
    }
}