package v2;

import g8.e;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import m.k;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f18376b;

    /* renamed from: e, reason: collision with root package name */
    public final String f18377e;

    /* renamed from: f, reason: collision with root package name */
    public final c f18378f;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f18379j;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicInteger f18380m;

    public b(s2.a aVar, String str, boolean z7) {
        e eVar = c.J;
        this.f18380m = new AtomicInteger();
        this.f18376b = aVar;
        this.f18377e = str;
        this.f18378f = eVar;
        this.f18379j = z7;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f18376b.newThread(new k(19, this, runnable));
        threadNewThread.setName("glide-" + this.f18377e + "-thread-" + this.f18380m.getAndIncrement());
        return threadNewThread;
    }
}