package n;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import o5.w;
import r3.o;
import r7.p;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15245b;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15246e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15247f;

    public c() {
        this.f15245b = 1;
        this.f15247f = Executors.defaultThreadFactory();
        this.f15246e = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i10 = this.f15245b;
        Object obj = this.f15247f;
        Object obj2 = this.f15246e;
        switch (i10) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) obj2).getAndIncrement());
                return thread;
            case QueueFuseable.SYNC /* 1 */:
                Thread threadNewThread = ((ThreadFactory) obj).newThread(runnable);
                threadNewThread.setName("PlayBillingLibrary-" + ((AtomicInteger) obj2).getAndIncrement());
                return threadNewThread;
            case 2:
                Thread threadNewThread2 = ((ThreadFactory) obj).newThread(new o(runnable, 0));
                threadNewThread2.setName((String) obj2);
                return threadNewThread2;
            case 3:
                w wVar = (w) obj2;
                wVar.getClass();
                int andIncrement = wVar.f15796b.getAndIncrement();
                StringBuilder sb = new StringBuilder(34);
                sb.append("Google consent worker #");
                sb.append(andIncrement);
                Thread thread2 = new Thread(runnable, sb.toString());
                wVar.f15798f = new WeakReference(thread2);
                return thread2;
            default:
                Thread threadNewThread3 = Executors.defaultThreadFactory().newThread(new p(runnable));
                threadNewThread3.setName(((String) obj2) + ((AtomicLong) obj).getAndIncrement());
                return threadNewThread3;
        }
    }

    public c(String str) {
        this.f15245b = 2;
        this.f15247f = Executors.defaultThreadFactory();
        this.f15246e = str;
    }

    public c(String str, AtomicLong atomicLong) {
        this.f15245b = 4;
        this.f15246e = str;
        this.f15247f = atomicLong;
    }

    public c(e eVar) {
        this.f15245b = 0;
        this.f15247f = eVar;
        this.f15246e = new AtomicInteger(0);
    }

    public /* synthetic */ c(w wVar) {
        this.f15245b = 3;
        this.f15246e = wVar;
        this.f15247f = "Google consent worker";
    }
}