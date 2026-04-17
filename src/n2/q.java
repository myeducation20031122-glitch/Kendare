package n2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.ic1;
import g.v0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f15327a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f15328b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityBlockingQueue f15329c;

    /* renamed from: d, reason: collision with root package name */
    public final PriorityBlockingQueue f15330d;

    /* renamed from: e, reason: collision with root package name */
    public final com.android.volley.toolbox.d f15331e;

    /* renamed from: f, reason: collision with root package name */
    public final g.e f15332f;

    /* renamed from: g, reason: collision with root package name */
    public final v0 f15333g;

    /* renamed from: h, reason: collision with root package name */
    public final h[] f15334h;

    /* renamed from: i, reason: collision with root package name */
    public c f15335i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f15336j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f15337k;

    public q(com.android.volley.toolbox.d dVar, g.e eVar) {
        v0 v0Var = new v0(new Handler(Looper.getMainLooper()));
        this.f15327a = new AtomicInteger();
        this.f15328b = new HashSet();
        this.f15329c = new PriorityBlockingQueue();
        this.f15330d = new PriorityBlockingQueue();
        this.f15336j = new ArrayList();
        this.f15337k = new ArrayList();
        this.f15331e = dVar;
        this.f15332f = eVar;
        this.f15334h = new h[4];
        this.f15333g = v0Var;
    }

    public final void a(p pVar) {
        pVar.setRequestQueue(this);
        synchronized (this.f15328b) {
            this.f15328b.add(pVar);
        }
        pVar.setSequence(this.f15327a.incrementAndGet());
        pVar.addMarker("add-to-queue");
        b();
        if (pVar.shouldCache()) {
            this.f15329c.add(pVar);
        } else {
            this.f15330d.add(pVar);
        }
    }

    public final void b() {
        synchronized (this.f15337k) {
            try {
                Iterator it = this.f15337k.iterator();
                if (it.hasNext()) {
                    ic1.v(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}