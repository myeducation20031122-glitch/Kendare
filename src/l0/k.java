package l0;

import j2.r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14459b;

    /* renamed from: e, reason: collision with root package name */
    public int f14460e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14461f;

    public k() {
        this.f14459b = 0;
        this.f14461f = "fonts-androidx";
        this.f14460e = 10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f14459b) {
            case 0:
                return new j(runnable, (String) this.f14461f, this.f14460e);
            default:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f14460e);
                this.f14460e = this.f14460e + 1;
                return threadNewThread;
        }
    }

    public k(r rVar) {
        this.f14459b = 1;
        this.f14461f = rVar;
        this.f14460e = 0;
    }
}