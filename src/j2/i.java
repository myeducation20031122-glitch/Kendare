package j2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i implements Executor {

    /* renamed from: e, reason: collision with root package name */
    public final Executor f13591e;

    /* renamed from: j, reason: collision with root package name */
    public volatile Runnable f13593j;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f13590b = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public final Object f13592f = new Object();

    public i(ExecutorService executorService) {
        this.f13591e = executorService;
    }

    public final boolean a() {
        boolean z7;
        synchronized (this.f13592f) {
            z7 = !this.f13590b.isEmpty();
        }
        return z7;
    }

    public final void b() {
        synchronized (this.f13592f) {
            try {
                Runnable runnable = (Runnable) this.f13590b.poll();
                this.f13593j = runnable;
                if (runnable != null) {
                    this.f13591e.execute(this.f13593j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f13592f) {
            try {
                this.f13590b.add(new m.k(this, runnable, 9));
                if (this.f13593j == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}