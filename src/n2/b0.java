package n2;

import g.v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b0 implements n {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15292a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final v0 f15293b;

    /* renamed from: c, reason: collision with root package name */
    public final c f15294c;

    /* renamed from: d, reason: collision with root package name */
    public final BlockingQueue f15295d;

    public b0(c cVar, PriorityBlockingQueue priorityBlockingQueue, v0 v0Var) {
        this.f15293b = v0Var;
        this.f15294c = cVar;
        this.f15295d = priorityBlockingQueue;
    }

    public final synchronized boolean a(p pVar) {
        try {
            String cacheKey = pVar.getCacheKey();
            if (!this.f15292a.containsKey(cacheKey)) {
                this.f15292a.put(cacheKey, null);
                pVar.setNetworkRequestCompleteListener(this);
                if (a0.f15282a) {
                    a0.b("new request, sending to network %s", cacheKey);
                }
                return false;
            }
            List arrayList = (List) this.f15292a.get(cacheKey);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            pVar.addMarker("waiting-for-response");
            arrayList.add(pVar);
            this.f15292a.put(cacheKey, arrayList);
            if (a0.f15282a) {
                a0.b("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(p pVar) {
        BlockingQueue blockingQueue;
        try {
            String cacheKey = pVar.getCacheKey();
            List list = (List) this.f15292a.remove(cacheKey);
            if (list != null && !list.isEmpty()) {
                if (a0.f15282a) {
                    a0.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), cacheKey);
                }
                p pVar2 = (p) list.remove(0);
                this.f15292a.put(cacheKey, list);
                pVar2.setNetworkRequestCompleteListener(this);
                if (this.f15294c != null && (blockingQueue = this.f15295d) != null) {
                    try {
                        blockingQueue.put(pVar2);
                    } catch (InterruptedException e10) {
                        a0.c("Couldn't add request to queue. %s", e10.toString());
                        Thread.currentThread().interrupt();
                        this.f15294c.b();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(p pVar, t tVar) {
        List list;
        b bVar = tVar.f15339b;
        if (bVar == null || bVar.f15288e < System.currentTimeMillis()) {
            b(pVar);
            return;
        }
        String cacheKey = pVar.getCacheKey();
        synchronized (this) {
            list = (List) this.f15292a.remove(cacheKey);
        }
        if (list != null) {
            if (a0.f15282a) {
                a0.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), cacheKey);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f15293b.w((p) it.next(), tVar, null);
            }
        }
    }
}