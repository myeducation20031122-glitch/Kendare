package fc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public abstract class o0 extends kotlinx.coroutines.internal.h implements a0, i0, Function1 {
    public s0 j;

    @Override // fc.i0
    public final boolean a() {
        return true;
    }

    @Override // fc.i0
    public final v0 c() {
        return null;
    }

    @Override // fc.a0
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        s0 s0VarS = s();
        while (true) {
            Object objR = s0VarS.r();
            if (!(objR instanceof o0)) {
                if (!(objR instanceof i0) || ((i0) objR).c() == null) {
                    return;
                }
                r();
                return;
            }
            if (objR != this) {
                return;
            }
            b0 b0Var = t0.f;
            do {
                atomicReferenceFieldUpdater = s0.b;
                if (atomicReferenceFieldUpdater.compareAndSet(s0VarS, objR, b0Var)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(s0VarS) == objR);
        }
    }

    public final s0 s() {
        s0 s0Var = this.j;
        if (s0Var != null) {
            return s0Var;
        }
        Intrinsics.n("job");
        throw null;
    }

    @Override // kotlinx.coroutines.internal.h
    public final String toString() {
        return getClass().getSimpleName() + '@' + t.s(this) + "[job@" + t.s(s()) + ']';
    }

    public abstract void u(Throwable th);
}