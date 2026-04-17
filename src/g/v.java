package g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Object f12904b = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f12905e = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public final Executor f12906f;

    /* renamed from: j, reason: collision with root package name */
    public Runnable f12907j;

    public v(w wVar) {
        this.f12906f = wVar;
    }

    public final void a() {
        synchronized (this.f12904b) {
            try {
                Runnable runnable = (Runnable) this.f12905e.poll();
                this.f12907j = runnable;
                if (runnable != null) {
                    this.f12906f.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f12904b) {
            try {
                this.f12905e.add(new u(0, this, runnable));
                if (this.f12907j == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}