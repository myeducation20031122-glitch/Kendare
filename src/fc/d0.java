package fc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public abstract class d0 extends e0 implements w {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "_queue");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    static {
        AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "_delayed");
    }

    @Override // fc.p
    public final void j(CoroutineContext coroutineContext, Runnable runnable) {
        q(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        fc.u.t.q(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(Runnable runnable) {
        loop0: while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof kotlinx.coroutines.internal.k)) {
                    if (obj != f0.a) {
                        kotlinx.coroutines.internal.k kVar = new kotlinx.coroutines.internal.k(8, true);
                        kVar.a((Runnable) obj);
                        kVar.a(runnable);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                kotlinx.coroutines.internal.k kVar2 = (kotlinx.coroutines.internal.k) obj;
                int iA = kVar2.a(runnable);
                if (iA == 0) {
                    break;
                }
                if (iA == 1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = n;
                    kotlinx.coroutines.internal.k kVarE = kVar2.e();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, kVarE) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                } else if (iA == 2) {
                    break;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = n;
                while (!atomicReferenceFieldUpdater3.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater3.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            }
        }
        Thread threadN = n();
        if (Thread.currentThread() != threadN) {
            LockSupport.unpark(threadN);
        }
    }

    public final long r() {
        z0.b bVar = this.m;
        if (((bVar == null || bVar.a == bVar.b) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.k)) {
                return obj == f0.a ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.internal.k) obj).d()) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    public final boolean s() {
        z0.b bVar = this.m;
        if (bVar != null && bVar.a != bVar.b) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.k) {
                return ((kotlinx.coroutines.internal.k) obj).d();
            }
            if (obj != f0.a) {
                return false;
            }
        }
        return true;
    }

    @Override // fc.e0
    public void shutdown() {
        a1.a.set(null);
        this._isCompleted = 1;
        loop0: while (true) {
            Object obj = this._queue;
            if (obj != null) {
                if (!(obj instanceof kotlinx.coroutines.internal.k)) {
                    if (obj != f0.a) {
                        kotlinx.coroutines.internal.k kVar = new kotlinx.coroutines.internal.k(8, true);
                        kVar.a((Runnable) obj);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((kotlinx.coroutines.internal.k) obj).b();
                break;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = n;
            r4.d dVar = f0.a;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, dVar)) {
                if (atomicReferenceFieldUpdater2.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (t() <= 0) {
        }
        System.nanoTime();
    }

    public final long t() {
        Runnable runnable;
        if (p()) {
            return 0L;
        }
        loop0: while (true) {
            Object obj = this._queue;
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof kotlinx.coroutines.internal.k)) {
                if (obj != f0.a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
                break;
            }
            kotlinx.coroutines.internal.k kVar = (kotlinx.coroutines.internal.k) obj;
            Object objF = kVar.f();
            if (objF != kotlinx.coroutines.internal.k.g) {
                runnable = (Runnable) objF;
                break;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = n;
            kotlinx.coroutines.internal.k kVarE = kVar.e();
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, kVarE) && atomicReferenceFieldUpdater2.get(this) == obj) {
            }
        }
        if (runnable == null) {
            return r();
        }
        runnable.run();
        return 0L;
    }

    public final void u() {
        this._queue = null;
        this._delayed = null;
    }
}