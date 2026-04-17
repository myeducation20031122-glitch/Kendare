package t5;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17591b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f17592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v4 f17593f;

    public /* synthetic */ r4(v4 v4Var, AtomicReference atomicReference, int i10) {
        this.f17591b = i10;
        this.f17593f = v4Var;
        this.f17592e = atomicReference;
    }

    private final void a() {
        synchronized (this.f17592e) {
            try {
                try {
                    AtomicReference atomicReference = this.f17592e;
                    Object obj = this.f17593f.f15046b;
                    atomicReference.set(Boolean.valueOf(((b4) obj).f17249t.y(((b4) obj).n().t(), a3.K)));
                } finally {
                    this.f17592e.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        String str;
        synchronized (this.f17592e) {
            try {
                try {
                    AtomicReference atomicReference = this.f17592e;
                    Object obj = this.f17593f.f15046b;
                    f fVar = ((b4) obj).f17249t;
                    String strT = ((b4) obj).n().t();
                    z2 z2Var = a3.L;
                    if (strT == null) {
                        fVar.getClass();
                        str = (String) z2Var.a(null);
                    } else {
                        str = (String) z2Var.a(fVar.f17338f.a(strT, z2Var.f17707a));
                    }
                    atomicReference.set(str);
                } finally {
                    this.f17592e.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        synchronized (this.f17592e) {
            try {
                try {
                    AtomicReference atomicReference = this.f17592e;
                    Object obj = this.f17593f.f15046b;
                    atomicReference.set(Long.valueOf(((b4) obj).f17249t.u(((b4) obj).n().t(), a3.M)));
                } finally {
                    this.f17592e.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        synchronized (this.f17592e) {
            try {
                try {
                    AtomicReference atomicReference = this.f17592e;
                    Object obj = this.f17593f.f15046b;
                    atomicReference.set(Integer.valueOf(((b4) obj).f17249t.s(((b4) obj).n().t(), a3.N)));
                } finally {
                    this.f17592e.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17591b) {
            case 0:
                a();
                return;
            case QueueFuseable.SYNC /* 1 */:
                b();
                return;
            case 2:
                c();
                return;
            case 3:
                d();
                return;
            default:
                synchronized (this.f17592e) {
                    try {
                        try {
                            AtomicReference atomicReference = this.f17592e;
                            Object obj = this.f17593f.f15046b;
                            atomicReference.set(Double.valueOf(((b4) obj).f17249t.q(((b4) obj).n().t(), a3.O)));
                        } finally {
                            this.f17592e.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}