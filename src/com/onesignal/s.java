package com.onesignal;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public l f12105a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f12106b = new LinkedBlockingQueue();

    /* renamed from: c, reason: collision with root package name */
    public Object f12107c = new AtomicLong();

    /* renamed from: d, reason: collision with root package name */
    public Object f12108d;

    public s(l lVar) {
        this.f12105a = lVar;
    }

    public final void a(Runnable runnable) {
        n2.m mVar = new n2.m(this, runnable);
        synchronized (((Queue) this.f12106b)) {
            try {
                mVar.f15321e = ((AtomicLong) this.f12107c).incrementAndGet();
                Object obj = this.f12108d;
                if (((ExecutorService) obj) == null) {
                    l lVar = this.f12105a;
                    String str = "Adding a task to the pending queue with ID: " + mVar.f15321e;
                    lVar.getClass();
                    l.d(str);
                    ((Queue) this.f12106b).add(mVar);
                } else if (!((ExecutorService) obj).isShutdown()) {
                    l lVar2 = this.f12105a;
                    String str2 = "Executor is still running, add to the executor with ID: " + mVar.f15321e;
                    lVar2.getClass();
                    l.d(str2);
                    try {
                        ((ExecutorService) this.f12108d).submit(mVar);
                    } catch (RejectedExecutionException e10) {
                        l lVar3 = this.f12105a;
                        String str3 = "Executor is shutdown, running task manually with ID: " + mVar.f15321e;
                        lVar3.getClass();
                        z3.b(y3.f12232m, str3, null);
                        mVar.run();
                        e10.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f12107c) {
            z3.f12275u.getClass();
            this.f12106b = Long.valueOf(SystemClock.elapsedRealtime());
            l lVar = this.f12105a;
            String str = "Application foregrounded focus time: " + ((Long) this.f12106b);
            lVar.getClass();
            l.d(str);
        }
    }

    public final Long c() {
        synchronized (this.f12107c) {
            try {
                if (((Long) this.f12106b) == null) {
                    return null;
                }
                z3.f12275u.getClass();
                long jElapsedRealtime = (long) (((SystemClock.elapsedRealtime() - ((Long) this.f12106b).longValue()) / 1000.0d) + 0.5d);
                if (jElapsedRealtime >= 1 && jElapsedRealtime <= 86400) {
                    return Long.valueOf(jElapsedRealtime);
                }
                return null;
            } finally {
            }
        }
    }

    public final boolean d() {
        if (Thread.currentThread().getName().contains("OS_PENDING_EXECUTOR_")) {
            return false;
        }
        boolean z7 = z3.f12267m;
        if (z7 && ((ExecutorService) this.f12108d) == null) {
            return false;
        }
        if (z7 || ((ExecutorService) this.f12108d) != null) {
            return !((ExecutorService) this.f12108d).isShutdown();
        }
        return true;
    }

    public final void e() {
        synchronized (((Queue) this.f12106b)) {
            try {
                z3.b(y3.f12233n, "startPendingTasks with task queue quantity: " + ((Queue) this.f12106b).size(), null);
                if (!((Queue) this.f12106b).isEmpty()) {
                    this.f12108d = Executors.newSingleThreadExecutor(new j3());
                    while (!((Queue) this.f12106b).isEmpty()) {
                        ((ExecutorService) this.f12108d).submit((Runnable) ((Queue) this.f12106b).poll());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}