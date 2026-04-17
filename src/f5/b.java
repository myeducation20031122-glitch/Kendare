package f5;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import r3.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f12691e = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    public final ThreadFactory f12692f = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    public final String f12690b = "GAC_Executor";

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f12692f.newThread(new o(runnable, 0));
        threadNewThread.setName(this.f12690b + "[" + this.f12691e.getAndIncrement() + "]");
        return threadNewThread;
    }
}