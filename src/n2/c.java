package n2;

import android.os.Process;
import g.v0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends Thread {

    /* renamed from: t, reason: collision with root package name */
    public static final boolean f15296t = a0.f15282a;

    /* renamed from: b, reason: collision with root package name */
    public final BlockingQueue f15297b;

    /* renamed from: e, reason: collision with root package name */
    public final BlockingQueue f15298e;

    /* renamed from: f, reason: collision with root package name */
    public final com.android.volley.toolbox.d f15299f;

    /* renamed from: j, reason: collision with root package name */
    public final v0 f15300j;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f15301m = false;

    /* renamed from: n, reason: collision with root package name */
    public final b0 f15302n;

    public c(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, com.android.volley.toolbox.d dVar, v0 v0Var) {
        this.f15297b = priorityBlockingQueue;
        this.f15298e = priorityBlockingQueue2;
        this.f15299f = dVar;
        this.f15300j = v0Var;
        this.f15302n = new b0(this, priorityBlockingQueue2, v0Var);
    }

    private void a() {
        v0 v0Var;
        BlockingQueue blockingQueue;
        p pVar = (p) this.f15297b.take();
        pVar.addMarker("cache-queue-take");
        pVar.sendEvent(1);
        try {
            if (pVar.isCanceled()) {
                pVar.finish("cache-discard-canceled");
            } else {
                b bVarA = this.f15299f.a(pVar.getCacheKey());
                if (bVarA == null) {
                    pVar.addMarker("cache-miss");
                    if (!this.f15302n.a(pVar)) {
                        blockingQueue = this.f15298e;
                        blockingQueue.put(pVar);
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (bVarA.f15288e >= jCurrentTimeMillis) {
                        pVar.addMarker("cache-hit");
                        t networkResponse = pVar.parseNetworkResponse(new j(bVarA.f15284a, bVarA.f15290g));
                        pVar.addMarker("cache-hit-parsed");
                        if (networkResponse.f15340c == null) {
                            if (bVarA.f15289f < jCurrentTimeMillis) {
                                pVar.addMarker("cache-hit-refresh-needed");
                                pVar.setCacheEntry(bVarA);
                                networkResponse.f15341d = true;
                                if (this.f15302n.a(pVar)) {
                                    v0Var = this.f15300j;
                                } else {
                                    this.f15300j.w(pVar, networkResponse, new m.k(17, this, pVar));
                                }
                            } else {
                                v0Var = this.f15300j;
                            }
                            v0Var.w(pVar, networkResponse, null);
                        } else {
                            pVar.addMarker("cache-parsing-failed");
                            com.android.volley.toolbox.d dVar = this.f15299f;
                            String cacheKey = pVar.getCacheKey();
                            synchronized (dVar) {
                                b bVarA2 = dVar.a(cacheKey);
                                if (bVarA2 != null) {
                                    bVarA2.f15289f = 0L;
                                    bVarA2.f15288e = 0L;
                                    dVar.f(cacheKey, bVarA2);
                                }
                            }
                            pVar.setCacheEntry(null);
                            if (!this.f15302n.a(pVar)) {
                                this.f15298e.put(pVar);
                            }
                        }
                        return;
                    }
                    pVar.addMarker("cache-hit-expired");
                    pVar.setCacheEntry(bVarA);
                    if (!this.f15302n.a(pVar)) {
                        blockingQueue = this.f15298e;
                        blockingQueue.put(pVar);
                    }
                }
            }
        } finally {
            pVar.sendEvent(2);
        }
    }

    public final void b() {
        this.f15301m = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (f15296t) {
            a0.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f15299f.d();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f15301m) {
                    Thread.currentThread().interrupt();
                    return;
                }
                a0.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}