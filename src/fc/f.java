package fc;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class f extends y implements e, CoroutineStackFrame {
    public static final /* synthetic */ AtomicIntegerFieldUpdater t = AtomicIntegerFieldUpdater.newUpdater(f.class, "_decision");
    public static final /* synthetic */ AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;
    public final Continuation j;
    public final CoroutineContext m;
    public a0 n;

    public f(Continuation continuation) {
        super(1);
        this.j = continuation;
        this.m = continuation.getContext();
        this._decision = 0;
        this._state = b.b;
    }

    public static void n(Function1 function1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + function1 + ", already has " + obj).toString());
    }

    @Override // fc.y
    public final void a(Object obj, CancellationException cancellationException) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof x0) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof l) {
                return;
            }
            if (!(obj2 instanceof k)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u;
                k kVar = new k(obj2, (d) null, (Function1) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, kVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            k kVar2 = (k) obj2;
            if (!(!(kVar2.e != null))) {
                throw new IllegalStateException("Must be called at most once".toString());
            }
            k kVarA = k.a(kVar2, null, cancellationException, 15);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, kVarA)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                    break;
                }
            }
            d dVar = kVar2.b;
            if (dVar != null) {
                g(dVar, cancellationException);
            }
            Function1 function1 = kVar2.c;
            if (function1 != null) {
                try {
                    function1.invoke(cancellationException);
                    return;
                } catch (Throwable th) {
                    j4.t(this.m, new androidx.fragment.app.y("Exception in resume onCancellation handler for " + this, th));
                    return;
                }
            }
            return;
        }
    }

    @Override // fc.y
    public final Continuation b() {
        return this.j;
    }

    @Override // fc.y
    public final Throwable c(Object obj) {
        Throwable thC = super.c(obj);
        if (thC != null) {
            return thC;
        }
        return null;
    }

    @Override // fc.y
    public final Object d(Object obj) {
        return obj instanceof k ? ((k) obj).a : obj;
    }

    @Override // fc.y
    public final Object f() {
        return this._state;
    }

    public final void g(d dVar, Throwable th) {
        try {
            ((j0) dVar).b.invoke(th);
        } catch (Throwable th2) {
            j4.t(this.m, new androidx.fragment.app.y("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final CoroutineStackFrame getCallerFrame() {
        CoroutineStackFrame coroutineStackFrame = this.j;
        if (coroutineStackFrame instanceof CoroutineStackFrame) {
            return coroutineStackFrame;
        }
        return null;
    }

    public final CoroutineContext getContext() {
        return this.m;
    }

    public final void h(Function1 function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            j4.t(this.m, new androidx.fragment.app.y("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void i(Throwable th) {
        a0 a0Var;
        while (true) {
            Object obj = this._state;
            if (obj instanceof x0) {
                boolean z = obj instanceof d;
                g gVar = new g(this, th, z);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, gVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                d dVar = z ? (d) obj : null;
                if (dVar != null) {
                    g(dVar, th);
                }
                if (!m() && (a0Var = this.n) != null) {
                    a0Var.dispose();
                    this.n = w0.b;
                }
                j(this.f);
                return;
            }
            return;
        }
    }

    public final void j(int i) {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                Continuation continuation = this.j;
                boolean z = i == 4;
                if (z || !(continuation instanceof kotlinx.coroutines.internal.c) || t7.z0.d(i) != t7.z0.d(this.f)) {
                    t7.z0.g(this, continuation, z);
                    return;
                }
                p pVar = ((kotlinx.coroutines.internal.c) continuation).j;
                CoroutineContext context = continuation.getContext();
                if (pVar.k()) {
                    pVar.j(context, this);
                    return;
                }
                e0 e0VarA = a1.a();
                if (e0VarA.f >= 4294967296L) {
                    e0VarA.m(this);
                    return;
                }
                e0VarA.o(true);
                try {
                    t7.z0.g(this, this.j, true);
                    do {
                    } while (e0VarA.p());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!t.compareAndSet(this, 0, 2));
    }

    public final Object k() throws Throwable {
        q qVar;
        w0 w0Var;
        l0 l0Var;
        kotlinx.coroutines.internal.c cVar;
        Throwable thJ;
        Throwable thJ2;
        l0 l0Var2;
        boolean zM = m();
        do {
            int i = this._decision;
            qVar = q.e;
            w0Var = w0.b;
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                if (zM) {
                    Continuation continuation = this.j;
                    cVar = continuation instanceof kotlinx.coroutines.internal.c ? (kotlinx.coroutines.internal.c) continuation : null;
                    if (cVar != null && (thJ = cVar.j(this)) != null) {
                        a0 a0Var = this.n;
                        if (a0Var != null) {
                            a0Var.dispose();
                            this.n = w0Var;
                        }
                        i(thJ);
                    }
                }
                Object obj = this._state;
                if (obj instanceof l) {
                    throw ((l) obj).a;
                }
                if (!t7.z0.d(this.f) || (l0Var = (l0) this.m.d(qVar)) == null || l0Var.a()) {
                    return d(obj);
                }
                CancellationException cancellationExceptionP = ((s0) l0Var).p();
                a(obj, cancellationExceptionP);
                throw cancellationExceptionP;
            }
        } while (!t.compareAndSet(this, 0, 1));
        if (this.n == null && (l0Var2 = (l0) this.m.d(qVar)) != null) {
            this.n = j4.z(l0Var2, true, new h(this), 2);
        }
        if (zM) {
            Continuation continuation2 = this.j;
            cVar = continuation2 instanceof kotlinx.coroutines.internal.c ? (kotlinx.coroutines.internal.c) continuation2 : null;
            if (cVar != null && (thJ2 = cVar.j(this)) != null) {
                a0 a0Var2 = this.n;
                if (a0Var2 != null) {
                    a0Var2.dispose();
                    this.n = w0Var;
                }
                i(thJ2);
            }
        }
        return CoroutineSingletons.b;
    }

    public final void l(Function1 function1) {
        d j0Var = function1 instanceof d ? (d) function1 : new j0(function1);
        while (true) {
            Object obj = this._state;
            if (obj instanceof b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, j0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof d) {
                n(function1, obj);
                throw null;
            }
            boolean z = obj instanceof l;
            if (z) {
                l lVar = (l) obj;
                lVar.getClass();
                if (!l.b.compareAndSet(lVar, 0, 1)) {
                    n(function1, obj);
                    throw null;
                }
                if (obj instanceof g) {
                    if (!z) {
                        lVar = null;
                    }
                    h(function1, lVar != null ? lVar.a : null);
                    return;
                }
                return;
            }
            if (!(obj instanceof k)) {
                k kVar = new k(obj, j0Var, (Function1) null, (CancellationException) null, 28);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, kVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            k kVar2 = (k) obj;
            if (kVar2.b != null) {
                n(function1, obj);
                throw null;
            }
            Throwable th = kVar2.e;
            if (th != null) {
                h(function1, th);
                return;
            }
            k kVarA = k.a(kVar2, j0Var, null, 29);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = u;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, kVarA)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean m() {
        return this.f == 2 && ((kotlinx.coroutines.internal.c) this.j).g();
    }

    public final void resumeWith(Object obj) {
        Object kVar;
        a0 a0Var;
        boolean z;
        Throwable thA = Result.a(obj);
        if (thA != null) {
            obj = new l(false, thA);
        }
        int i = this.f;
        Function1 function1 = null;
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof x0)) {
                if (obj2 instanceof g) {
                    g gVar = (g) obj2;
                    gVar.getClass();
                    if (g.c.compareAndSet(gVar, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            x0 x0Var = (x0) obj2;
            if (!(obj instanceof l) && t7.z0.d(i) && ((z = x0Var instanceof d))) {
                kVar = new k(obj, z ? (d) x0Var : null, function1, (CancellationException) null, 16);
            } else {
                kVar = obj;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, kVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!m() && (a0Var = this.n) != null) {
                a0Var.dispose();
                this.n = w0.b;
            }
            j(i);
            return;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CancellableContinuation(");
        sb2.append(t.O(this.j));
        sb2.append("){");
        Object obj = this._state;
        sb2.append(obj instanceof x0 ? "Active" : obj instanceof g ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(t.s(this));
        return sb2.toString();
    }
}