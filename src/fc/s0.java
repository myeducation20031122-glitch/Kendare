package fc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public class s0 implements l0, y0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    public static j v(kotlinx.coroutines.internal.h hVar) {
        while (hVar.q()) {
            hVar = hVar.o();
        }
        while (true) {
            hVar = hVar.k();
            if (!hVar.q()) {
                if (hVar instanceof j) {
                    return (j) hVar;
                }
                if (hVar instanceof v0) {
                    return null;
                }
            }
        }
    }

    public static String z(Object obj) {
        if (!(obj instanceof q0)) {
            return obj instanceof i0 ? ((i0) obj).a() ? "Active" : "New" : obj instanceof l ? "Cancelled" : "Completed";
        }
        q0 q0Var = (q0) obj;
        return q0Var.e() ? "Cancelling" : q0Var.f() ? "Completing" : "Active";
    }

    public final Object A(Object obj, Object obj2) throws androidx.fragment.app.y {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        r4.d dVar;
        if (!(obj instanceof i0)) {
            return t0.a;
        }
        if (((obj instanceof b0) || (obj instanceof o0)) && !(obj instanceof j) && !(obj2 instanceof l)) {
            i0 i0Var = (i0) obj;
            r4.d dVar2 = t0.a;
            Object qVar = obj2 instanceof i0 ? new q((i0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, i0Var, qVar)) {
                    m(i0Var, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == i0Var);
            return t0.c;
        }
        i0 i0Var2 = (i0) obj;
        v0 v0VarQ = q(i0Var2);
        if (v0VarQ == null) {
            return t0.c;
        }
        q0 q0Var = i0Var2 instanceof q0 ? (q0) i0Var2 : null;
        if (q0Var == null) {
            q0Var = new q0(v0VarQ, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (q0Var) {
            try {
                if (!q0Var.f()) {
                    q0Var.i();
                    if (q0Var != i0Var2) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, i0Var2, q0Var)) {
                            if (atomicReferenceFieldUpdater2.get(this) != i0Var2) {
                                dVar = t0.c;
                            }
                        }
                    }
                    boolean zE = q0Var.e();
                    l lVar = obj2 instanceof l ? (l) obj2 : null;
                    if (lVar != null) {
                        q0Var.b(lVar.a);
                    }
                    Throwable thD = Boolean.valueOf(zE ^ true).booleanValue() ? q0Var.d() : null;
                    objectRef.b = thD;
                    Unit unit = Unit.a;
                    if (thD != null) {
                        w(v0VarQ, thD);
                    }
                    if (i0Var2 instanceof j) {
                    }
                    v0 v0VarC = i0Var2.c();
                    if (v0VarC != null) {
                        v(v0VarC);
                    }
                    return o(q0Var, obj2);
                }
                dVar = t0.a;
                return dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // fc.l0
    public boolean a() {
        Object objR = r();
        return (objR instanceof i0) && ((i0) objR).a();
    }

    public final CoroutineContext.Element d(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.b(this, key);
    }

    public final CoroutineContext e(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.d(this, coroutineContext);
    }

    public final Object f(Object obj, Function2 function2) {
        return CoroutineContext.Element.DefaultImpls.a(this, obj, function2);
    }

    public final boolean g(Object obj, v0 v0Var, o0 o0Var) {
        char c;
        r0 r0Var = new r0(o0Var, this, obj);
        do {
            kotlinx.coroutines.internal.h hVarO = v0Var.o();
            kotlinx.coroutines.internal.h.e.lazySet(o0Var, hVarO);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.h.b;
            atomicReferenceFieldUpdater.lazySet(o0Var, v0Var);
            r0Var.c = v0Var;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(hVarO, v0Var, r0Var)) {
                    c = r0Var.a(hVarO) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater.get(hVarO) != v0Var) {
                    c = 0;
                    break;
                }
            }
            if (c == 1) {
                return true;
            }
        } while (c != 2);
        return false;
    }

    public final CoroutineContext.Key getKey() {
        return q.e;
    }

    public final CoroutineContext h(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.c(this, key);
    }

    public void i(Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        r10 = fc.t0.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(Object obj) throws androidx.fragment.app.y {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        r4.d dVar = t0.a;
        Throwable thN = null;
        loop0: while (true) {
            Object objR = r();
            if (!(objR instanceof q0)) {
                if (!(objR instanceof i0)) {
                    obj2 = t0.d;
                    break;
                }
                if (thN == null) {
                    thN = n(obj);
                }
                i0 i0Var = (i0) objR;
                if (i0Var.a()) {
                    v0 v0VarQ = q(i0Var);
                    if (v0VarQ == null) {
                        continue;
                    } else {
                        q0 q0Var = new q0(v0VarQ, thN);
                        do {
                            atomicReferenceFieldUpdater = b;
                            if (atomicReferenceFieldUpdater.compareAndSet(this, i0Var, q0Var)) {
                                w(v0VarQ, thN);
                                break loop0;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == i0Var);
                    }
                } else {
                    Object objA = A(objR, new l(false, thN));
                    if (objA == t0.a) {
                        throw new IllegalStateException(("Cannot happen in " + objR).toString());
                    }
                    if (objA != t0.c) {
                        obj2 = objA;
                        break;
                    }
                }
            } else {
                synchronized (objR) {
                    try {
                        if (((q0) objR).g()) {
                            obj2 = t0.d;
                        } else {
                            boolean zE = ((q0) objR).e();
                            if (thN == null) {
                                thN = n(obj);
                            }
                            ((q0) objR).b(thN);
                            Throwable thD = zE ^ true ? ((q0) objR).d() : null;
                            if (thD != null) {
                                w(((q0) objR).b, thD);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return obj2 == t0.a || obj2 == t0.b || obj2 != t0.d;
    }

    public final boolean k(Throwable th) {
        if (this instanceof kotlinx.coroutines.internal.q) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        i iVar = (i) this._parentHandle;
        return (iVar == null || iVar == w0.b) ? z : iVar.b(th) || z;
    }

    public String l() {
        return "Job was cancelled";
    }

    public final void m(i0 i0Var, Object obj) throws androidx.fragment.app.y {
        i iVar = (i) this._parentHandle;
        if (iVar != null) {
            iVar.dispose();
            this._parentHandle = w0.b;
        }
        androidx.fragment.app.y yVar = null;
        l lVar = obj instanceof l ? (l) obj : null;
        Throwable th = lVar != null ? lVar.a : null;
        if (i0Var instanceof o0) {
            try {
                ((o0) i0Var).u(th);
                return;
            } catch (Throwable th2) {
                t(new androidx.fragment.app.y("Exception in completion handler " + i0Var + " for " + this, th2));
                return;
            }
        }
        v0 v0VarC = i0Var.c();
        if (v0VarC != null) {
            for (kotlinx.coroutines.internal.h hVarK = (kotlinx.coroutines.internal.h) v0VarC.h(); !Intrinsics.a(hVarK, v0VarC); hVarK = hVarK.k()) {
                if (hVarK instanceof o0) {
                    o0 o0Var = (o0) hVarK;
                    try {
                        o0Var.u(th);
                    } catch (Throwable th3) {
                        if (yVar != null) {
                            ExceptionsKt.a(yVar, th3);
                        } else {
                            yVar = new androidx.fragment.app.y("Exception in completion handler " + o0Var + " for " + this, th3);
                            Unit unit = Unit.a;
                        }
                    }
                }
            }
            if (yVar != null) {
                t(yVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable n(Object obj) {
        CancellationException cancellationExceptionD;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        s0 s0Var = (s0) ((y0) obj);
        Object objR = s0Var.r();
        if (objR instanceof q0) {
            cancellationExceptionD = ((q0) objR).d();
        } else if (objR instanceof l) {
            cancellationExceptionD = ((l) objR).a;
        } else {
            if (objR instanceof i0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objR).toString());
            }
            cancellationExceptionD = null;
        }
        CancellationException m0Var = cancellationExceptionD instanceof CancellationException ? cancellationExceptionD : null;
        if (m0Var == null) {
            m0Var = new m0("Parent job is ".concat(z(objR)), cancellationExceptionD, s0Var);
        }
        return m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object o(q0 q0Var, Object obj) throws androidx.fragment.app.y {
        Throwable m0Var = null;
        l lVar = obj instanceof l ? (l) obj : null;
        Throwable th = lVar != null ? lVar.a : null;
        synchronized (q0Var) {
            q0Var.e();
            ArrayList<Throwable> arrayListH = q0Var.h(th);
            if (!arrayListH.isEmpty()) {
                Iterator it = arrayListH.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        m0Var = next;
                        break;
                    }
                }
                m0Var = m0Var;
                if (m0Var == null) {
                    m0Var = (Throwable) arrayListH.get(0);
                }
            } else if (q0Var.e()) {
                m0Var = new m0(l(), null, this);
            }
            if (m0Var != null && arrayListH.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListH.size()));
                for (Throwable th2 : arrayListH) {
                    if (th2 != m0Var && th2 != m0Var && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        ExceptionsKt.a(m0Var, th2);
                    }
                }
            }
        }
        if (m0Var != null && m0Var != th) {
            obj = new l(false, m0Var);
        }
        if (m0Var != null && (k(m0Var) || s(m0Var))) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            }
            l.b.compareAndSet((l) obj, 0, 1);
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        Object qVar = obj instanceof i0 ? new q((i0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, q0Var, qVar) && atomicReferenceFieldUpdater.get(this) == q0Var) {
        }
        m(q0Var, obj);
        return obj;
    }

    public final CancellationException p() {
        CancellationException cancellationException;
        Object objR = r();
        if (!(objR instanceof q0)) {
            if (objR instanceof i0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objR instanceof l)) {
                return new m0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((l) objR).a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new m0(l(), th, this) : cancellationException;
        }
        Throwable thD = ((q0) objR).d();
        if (thD == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = l();
        }
        return new m0(strConcat, thD, this);
    }

    public final v0 q(i0 i0Var) {
        v0 v0VarC = i0Var.c();
        if (v0VarC != null) {
            return v0VarC;
        }
        if (i0Var instanceof b0) {
            return new v0();
        }
        if (i0Var instanceof o0) {
            y((o0) i0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + i0Var).toString());
    }

    public final Object r() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.n)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.n) obj).a(this);
        }
    }

    public boolean s(Throwable th) {
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.fragment.app.y */
    public void t(androidx.fragment.app.y yVar) throws androidx.fragment.app.y {
        throw yVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(u() + '{' + z(r()) + '}');
        sb2.append('@');
        sb2.append(t.s(this));
        return sb2.toString();
    }

    public String u() {
        return getClass().getSimpleName();
    }

    public final void w(v0 v0Var, Throwable th) throws androidx.fragment.app.y {
        androidx.fragment.app.y yVar = null;
        for (kotlinx.coroutines.internal.h hVarK = (kotlinx.coroutines.internal.h) v0Var.h(); !Intrinsics.a(hVarK, v0Var); hVarK = hVarK.k()) {
            if (hVarK instanceof n0) {
                o0 o0Var = (o0) hVarK;
                try {
                    o0Var.u(th);
                } catch (Throwable th2) {
                    if (yVar != null) {
                        ExceptionsKt.a(yVar, th2);
                    } else {
                        yVar = new androidx.fragment.app.y("Exception in completion handler " + o0Var + " for " + this, th2);
                        Unit unit = Unit.a;
                    }
                }
            }
        }
        if (yVar != null) {
            t(yVar);
        }
        k(th);
    }

    public void x(Object obj) {
    }

    public final void y(o0 o0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        v0 v0Var = new v0();
        o0Var.getClass();
        kotlinx.coroutines.internal.h.e.lazySet(v0Var, o0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kotlinx.coroutines.internal.h.b;
        atomicReferenceFieldUpdater2.lazySet(v0Var, o0Var);
        loop0: while (true) {
            if (o0Var.h() == o0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(o0Var, o0Var, v0Var)) {
                    if (atomicReferenceFieldUpdater2.get(o0Var) != o0Var) {
                        break;
                    }
                }
                v0Var.g(o0Var);
                break loop0;
            }
            break;
        }
        kotlinx.coroutines.internal.h hVarK = o0Var.k();
        do {
            atomicReferenceFieldUpdater = b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, o0Var, hVarK)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == o0Var);
    }
}