package o5;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w implements Executor {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadPoolExecutor f15797e;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f15796b = new AtomicInteger(1);

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f15798f = new WeakReference(null);

    public w() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new n.c(this));
        this.f15797e = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f15798f.get()) {
            runnable.run();
        } else {
            this.f15797e.execute(runnable);
        }
    }
}