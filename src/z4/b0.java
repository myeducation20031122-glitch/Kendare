package z4;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.ads.bu0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b0 extends GoogleApiClient implements n0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lock f19591b;

    /* renamed from: c, reason: collision with root package name */
    public final a5.z f19592c;

    /* renamed from: e, reason: collision with root package name */
    public final int f19594e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f19595f;

    /* renamed from: g, reason: collision with root package name */
    public final Looper f19596g;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f19598i;

    /* renamed from: l, reason: collision with root package name */
    public final z f19601l;

    /* renamed from: m, reason: collision with root package name */
    public final x4.f f19602m;

    /* renamed from: n, reason: collision with root package name */
    public m0 f19603n;

    /* renamed from: o, reason: collision with root package name */
    public final Map f19604o;

    /* renamed from: q, reason: collision with root package name */
    public final a5.h f19606q;

    /* renamed from: r, reason: collision with root package name */
    public final Map f19607r;

    /* renamed from: s, reason: collision with root package name */
    public final g5.a f19608s;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f19610u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f19611v;

    /* renamed from: w, reason: collision with root package name */
    public final x0 f19612w;

    /* renamed from: d, reason: collision with root package name */
    public p0 f19593d = null;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedList f19597h = new LinkedList();

    /* renamed from: j, reason: collision with root package name */
    public final long f19599j = 120000;

    /* renamed from: k, reason: collision with root package name */
    public final long f19600k = 5000;

    /* renamed from: p, reason: collision with root package name */
    public Set f19605p = new HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final d9.c f19609t = new d9.c();

    public b0(Context context, ReentrantLock reentrantLock, Looper looper, a5.h hVar, x4.f fVar, c5.b bVar, t.b bVar2, ArrayList arrayList, ArrayList arrayList2, t.b bVar3, int i10, int i11, ArrayList arrayList3) {
        this.f19611v = null;
        d9.c cVar = new d9.c(this);
        this.f19595f = context;
        this.f19591b = reentrantLock;
        this.f19592c = new a5.z(looper, cVar);
        this.f19596g = looper;
        this.f19601l = new z(this, looper, 0);
        this.f19602m = fVar;
        this.f19594e = i10;
        if (i10 >= 0) {
            this.f19611v = Integer.valueOf(i11);
        }
        this.f19607r = bVar2;
        this.f19604o = bVar3;
        this.f19610u = arrayList3;
        this.f19612w = new x0();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y4.k kVar = (y4.k) it.next();
            a5.z zVar = this.f19592c;
            zVar.getClass();
            fc.t.k(kVar);
            synchronized (zVar.f432w) {
                try {
                    if (zVar.f425e.contains(kVar)) {
                        Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(kVar) + " is already registered");
                    } else {
                        zVar.f425e.add(kVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zVar.f424b.a()) {
                bu0 bu0Var = zVar.f431u;
                bu0Var.sendMessage(bu0Var.obtainMessage(1, kVar));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.f19592c.a((y4.l) it2.next());
        }
        this.f19606q = hVar;
        this.f19608s = bVar;
    }

    public static int i(Collection collection, boolean z7) {
        Iterator it = collection.iterator();
        boolean zO = false;
        while (it.hasNext()) {
            y4.c cVar = (y4.c) it.next();
            zO |= cVar.o();
            cVar.d();
        }
        return zO ? 1 : 3;
    }

    public static /* bridge */ /* synthetic */ void j(b0 b0Var) {
        b0Var.f19591b.lock();
        try {
            if (b0Var.f19598i) {
                b0Var.m();
            }
        } finally {
            b0Var.f19591b.unlock();
        }
    }

    @Override // z4.n0
    public final void a(Bundle bundle) {
        while (!this.f19597h.isEmpty()) {
            d((p5.c) this.f19597h.remove());
        }
        a5.z zVar = this.f19592c;
        if (Looper.myLooper() != zVar.f431u.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (zVar.f432w) {
            try {
                fc.t.n(!zVar.f430t);
                zVar.f431u.removeMessages(1);
                zVar.f430t = true;
                fc.t.n(zVar.f426f.isEmpty());
                ArrayList arrayList = new ArrayList(zVar.f425e);
                int i10 = zVar.f429n.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    y4.k kVar = (y4.k) it.next();
                    if (!zVar.f428m || !zVar.f424b.a() || zVar.f429n.get() != i10) {
                        break;
                    } else if (!zVar.f426f.contains(kVar)) {
                        kVar.T(bundle);
                    }
                }
                zVar.f426f.clear();
                zVar.f430t = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z4.n0
    public final void b(x4.b bVar) {
        x4.f fVar = this.f19602m;
        Context context = this.f19595f;
        int i10 = bVar.f18952e;
        fVar.getClass();
        AtomicBoolean atomicBoolean = x4.j.f18966a;
        if (i10 != 18 && (i10 != 1 || !x4.j.b(context))) {
            k();
        }
        if (this.f19598i) {
            return;
        }
        a5.z zVar = this.f19592c;
        if (Looper.myLooper() != zVar.f431u.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        zVar.f431u.removeMessages(1);
        synchronized (zVar.f432w) {
            try {
                ArrayList arrayList = new ArrayList(zVar.f427j);
                int i11 = zVar.f429n.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    y4.l lVar = (y4.l) it.next();
                    if (!zVar.f428m || zVar.f429n.get() != i11) {
                        break;
                    } else if (zVar.f427j.contains(lVar)) {
                        lVar.x(bVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a5.z zVar2 = this.f19592c;
        zVar2.f428m = false;
        zVar2.f429n.incrementAndGet();
    }

    @Override // z4.n0
    public final void c(int i10, boolean z7) {
        if (i10 == 1) {
            if (!z7 && !this.f19598i) {
                this.f19598i = true;
                if (this.f19603n == null) {
                    try {
                        x4.f fVar = this.f19602m;
                        Context applicationContext = this.f19595f.getApplicationContext();
                        a0 a0Var = new a0(this);
                        fVar.getClass();
                        this.f19603n = x4.f.g(applicationContext, a0Var);
                    } catch (SecurityException unused) {
                    }
                }
                z zVar = this.f19601l;
                zVar.sendMessageDelayed(zVar.obtainMessage(1), this.f19599j);
                z zVar2 = this.f19601l;
                zVar2.sendMessageDelayed(zVar2.obtainMessage(2), this.f19600k);
            }
            i10 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f19612w.f19728a.toArray(new BasePendingResult[0])) {
            basePendingResult.k0(x0.f19727c);
        }
        a5.z zVar3 = this.f19592c;
        if (Looper.myLooper() != zVar3.f431u.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        zVar3.f431u.removeMessages(1);
        synchronized (zVar3.f432w) {
            try {
                zVar3.f430t = true;
                ArrayList arrayList = new ArrayList(zVar3.f425e);
                int i11 = zVar3.f429n.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    y4.k kVar = (y4.k) it.next();
                    if (!zVar3.f428m || zVar3.f429n.get() != i11) {
                        break;
                    } else if (zVar3.f425e.contains(kVar)) {
                        kVar.A(i10);
                    }
                }
                zVar3.f426f.clear();
                zVar3.f430t = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        a5.z zVar4 = this.f19592c;
        zVar4.f428m = false;
        zVar4.f429n.incrementAndGet();
        if (i10 == 2) {
            m();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        Lock lock = this.f19591b;
        lock.lock();
        try {
            int i10 = 2;
            boolean z7 = false;
            if (this.f19594e >= 0) {
                fc.t.m("Sign-in mode should have been set explicitly by auto-manage.", this.f19611v != null);
            } else {
                Integer num = this.f19611v;
                if (num == null) {
                    this.f19611v = Integer.valueOf(i(this.f19604o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.f19611v;
            fc.t.k(num2);
            int iIntValue = num2.intValue();
            lock.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i10 = iIntValue;
                    }
                    fc.t.b("Illegal sign-in mode: " + i10, z7);
                    l(i10);
                    m();
                    lock.unlock();
                    return;
                }
                i10 = iIntValue;
                fc.t.b("Illegal sign-in mode: " + i10, z7);
                l(i10);
                m();
                lock.unlock();
                return;
            } finally {
                lock.unlock();
            }
            z7 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final p5.c d(p5.c cVar) {
        Map map = this.f19604o;
        y4.e eVar = cVar.f15944l;
        fc.t.b("GoogleApiClient is not configured to use " + (eVar != null ? eVar.f19237c : "the API") + " required for this call.", map.containsKey(cVar.f15943k));
        this.f19591b.lock();
        try {
            p0 p0Var = this.f19593d;
            if (p0Var == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f19598i) {
                this.f19597h.add(cVar);
                while (!this.f19597h.isEmpty()) {
                    p5.c cVar2 = (p5.c) this.f19597h.remove();
                    x0 x0Var = this.f19612w;
                    x0Var.f19728a.add(cVar2);
                    cVar2.f2491e.set(x0Var.f19729b);
                    cVar2.s0(Status.f2479n);
                }
            } else {
                cVar = p0Var.c(cVar);
            }
            this.f19591b.unlock();
            return cVar;
        } catch (Throwable th) {
            this.f19591b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        Lock lock = this.f19591b;
        lock.lock();
        try {
            this.f19612w.a();
            p0 p0Var = this.f19593d;
            if (p0Var != null) {
                p0Var.b();
            }
            Object obj = this.f19609t.f12366b;
            for (m mVar : (Set) obj) {
                mVar.f19675b = null;
                mVar.f19676c = null;
            }
            ((Set) obj).clear();
            LinkedList<p5.c> linkedList = this.f19597h;
            for (p5.c cVar : linkedList) {
                cVar.f2491e.set(null);
                cVar.j0();
            }
            linkedList.clear();
            if (this.f19593d != null) {
                k();
                a5.z zVar = this.f19592c;
                zVar.f428m = false;
                zVar.f429n.incrementAndGet();
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final y4.c e() {
        y4.c cVar = (y4.c) this.f19604o.get(p5.e.f15949i);
        fc.t.l(cVar, "Appropriate Api was not requested.");
        return cVar;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper f() {
        return this.f19596g;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean g() {
        p0 p0Var = this.f19593d;
        return p0Var != null && p0Var.e();
    }

    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f19595f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f19598i);
        printWriter.append(" mWorkQueue.size()=").print(this.f19597h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f19612w.f19728a.size());
        p0 p0Var = this.f19593d;
        if (p0Var != null) {
            p0Var.d(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean k() {
        if (!this.f19598i) {
            return false;
        }
        this.f19598i = false;
        this.f19601l.removeMessages(2);
        this.f19601l.removeMessages(1);
        m0 m0Var = this.f19603n;
        if (m0Var != null) {
            m0Var.a();
            this.f19603n = null;
        }
        return true;
    }

    public final void l(int i10) {
        Integer num = this.f19611v;
        if (num == null) {
            this.f19611v = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            int iIntValue = this.f19611v.intValue();
            String str = iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            StringBuilder sb = new StringBuilder("Cannot use sign-in mode: ");
            sb.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED");
            sb.append(". Mode was already set to ");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f19593d != null) {
            return;
        }
        Map map = this.f19604o;
        boolean zO = false;
        for (y4.c cVar : map.values()) {
            zO |= cVar.o();
            cVar.d();
        }
        int iIntValue2 = this.f19611v.intValue();
        if (iIntValue2 != 1) {
            if (iIntValue2 == 2 && zO) {
                Context context = this.f19595f;
                Lock lock = this.f19591b;
                Looper looper = this.f19596g;
                x4.f fVar = this.f19602m;
                a5.h hVar = this.f19606q;
                g5.a aVar = this.f19608s;
                t.b bVar = new t.b();
                t.b bVar2 = new t.b();
                for (Map.Entry entry : map.entrySet()) {
                    y4.c cVar2 = (y4.c) entry.getValue();
                    cVar2.d();
                    boolean zO2 = cVar2.o();
                    y4.d dVar = (y4.d) entry.getKey();
                    if (zO2) {
                        bVar.put(dVar, cVar2);
                    } else {
                        bVar2.put(dVar, cVar2);
                    }
                }
                fc.t.m("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !bVar.isEmpty());
                t.b bVar3 = new t.b();
                t.b bVar4 = new t.b();
                Map map2 = this.f19607r;
                for (y4.e eVar : map2.keySet()) {
                    y4.d dVar2 = eVar.f19236b;
                    if (bVar.containsKey(dVar2)) {
                        bVar3.put(eVar, (Boolean) map2.get(eVar));
                    } else {
                        if (!bVar2.containsKey(dVar2)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        bVar4.put(eVar, (Boolean) map2.get(eVar));
                    }
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = this.f19610u;
                int size = arrayList3.size();
                int i11 = 0;
                while (i11 < size) {
                    ArrayList arrayList4 = arrayList3;
                    f1 f1Var = (f1) arrayList3.get(i11);
                    int i12 = size;
                    if (bVar3.containsKey(f1Var.f19633b)) {
                        arrayList.add(f1Var);
                    } else {
                        if (!bVar4.containsKey(f1Var.f19633b)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList2.add(f1Var);
                    }
                    i11++;
                    arrayList3 = arrayList4;
                    size = i12;
                }
                this.f19593d = new p(context, this, lock, looper, fVar, bVar, bVar2, hVar, aVar, null, arrayList, arrayList2, bVar3, bVar4);
                return;
            }
        } else if (!zO) {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        }
        this.f19593d = new e0(this.f19595f, this, this.f19591b, this.f19596g, this.f19602m, this.f19604o, this.f19606q, this.f19607r, this.f19608s, this.f19610u, this);
    }

    public final void m() {
        this.f19592c.f428m = true;
        p0 p0Var = this.f19593d;
        fc.t.k(p0Var);
        p0Var.a();
    }
}