package n2;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import g.v0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final BlockingQueue f15310b;

    /* renamed from: e, reason: collision with root package name */
    public final g.e f15311e;

    /* renamed from: f, reason: collision with root package name */
    public final com.android.volley.toolbox.d f15312f;

    /* renamed from: j, reason: collision with root package name */
    public final v0 f15313j;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f15314m = false;

    public h(PriorityBlockingQueue priorityBlockingQueue, g.e eVar, com.android.volley.toolbox.d dVar, v0 v0Var) {
        this.f15310b = priorityBlockingQueue;
        this.f15311e = eVar;
        this.f15312f = dVar;
        this.f15313j = v0Var;
    }

    private void a() {
        p pVar = (p) this.f15310b.take();
        v0 v0Var = this.f15313j;
        SystemClock.elapsedRealtime();
        pVar.sendEvent(3);
        try {
            try {
                pVar.addMarker("network-queue-take");
            } catch (x e10) {
                SystemClock.elapsedRealtime();
                x networkError = pVar.parseNetworkError(e10);
                v0Var.getClass();
                pVar.addMarker("post-error");
                ((Executor) v0Var.f12909e).execute(new l0.a(pVar, new t(networkError), null, 10, 0));
                pVar.notifyListenerResponseNotUsable();
            } catch (Exception e11) {
                Log.e("Volley", a0.a("Unhandled exception %s", e11.toString()), e11);
                x xVar = new x(e11);
                SystemClock.elapsedRealtime();
                v0Var.getClass();
                pVar.addMarker("post-error");
                ((Executor) v0Var.f12909e).execute(new l0.a(pVar, new t(xVar), null, 10, 0));
                pVar.notifyListenerResponseNotUsable();
            }
            if (pVar.isCanceled()) {
                pVar.finish("network-discard-cancelled");
                pVar.notifyListenerResponseNotUsable();
                return;
            }
            TrafficStats.setThreadStatsTag(pVar.getTrafficStatsTag());
            j jVarJ = this.f15311e.J(pVar);
            pVar.addMarker("network-http-complete");
            if (jVarJ.f15319e && pVar.hasHadResponseDelivered()) {
                pVar.finish("not-modified");
                pVar.notifyListenerResponseNotUsable();
            } else {
                t networkResponse = pVar.parseNetworkResponse(jVarJ);
                pVar.addMarker("network-parse-complete");
                if (pVar.shouldCache() && networkResponse.f15339b != null) {
                    this.f15312f.f(pVar.getCacheKey(), networkResponse.f15339b);
                    pVar.addMarker("network-cache-written");
                }
                pVar.markDelivered();
                v0Var.w(pVar, networkResponse, null);
                pVar.notifyListenerResponseReceived(networkResponse);
            }
        } finally {
            pVar.sendEvent(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f15314m) {
                    Thread.currentThread().interrupt();
                    return;
                }
                a0.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}