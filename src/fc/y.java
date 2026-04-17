package fc;

import com.google.android.gms.internal.ads.xz0;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public abstract class y extends kotlinx.coroutines.scheduling.i {
    public int f;

    public y(int i) {
        super(0L, kotlinx.coroutines.scheduling.k.f);
        this.f = i;
    }

    public abstract void a(Object obj, CancellationException cancellationException);

    public abstract Continuation b();

    public Throwable c(Object obj) {
        l lVar = obj instanceof l ? (l) obj : null;
        if (lVar != null) {
            return lVar.a;
        }
        return null;
    }

    public Object d(Object obj) {
        return obj;
    }

    public final void e(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            ExceptionsKt.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Intrinsics.c(th);
        j4.t(b().getContext(), new xz0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object f();

    @Override // java.lang.Runnable
    public final void run() {
        Unit unitA;
        Object objD;
        Unit unitA2;
        z1.o oVar = this.e;
        try {
            kotlinx.coroutines.internal.c cVar = (kotlinx.coroutines.internal.c) b();
            Continuation continuation = cVar.m;
            Object obj = cVar.t;
            CoroutineContext context = continuation.getContext();
            Object objC = kotlinx.coroutines.internal.t.c(context, obj);
            if (objC != kotlinx.coroutines.internal.t.a) {
                com.bumptech.glide.f.w(continuation, context);
            }
            try {
                CoroutineContext context2 = continuation.getContext();
                Object objF = f();
                Throwable thC = c(objF);
                l0 l0Var = (thC == null && t7.z0.d(this.f)) ? (l0) context2.d(q.e) : null;
                if (l0Var != null && !l0Var.a()) {
                    CancellationException cancellationExceptionP = ((s0) l0Var).p();
                    a(objF, cancellationExceptionP);
                    int i = Result.b;
                    objD = ResultKt.a(cancellationExceptionP);
                } else if (thC != null) {
                    int i2 = Result.b;
                    objD = ResultKt.a(thC);
                } else {
                    int i3 = Result.b;
                    objD = d(objF);
                }
                continuation.resumeWith(objD);
                Unit unit = Unit.a;
                kotlinx.coroutines.internal.t.a(context, objC);
                try {
                    oVar.getClass();
                    unitA2 = Unit.a;
                } catch (Throwable th) {
                    int i4 = Result.b;
                    unitA2 = ResultKt.a(th);
                }
                e(null, Result.a(unitA2));
            } catch (Throwable th2) {
                kotlinx.coroutines.internal.t.a(context, objC);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                int i5 = Result.b;
                oVar.getClass();
                unitA = Unit.a;
            } catch (Throwable th4) {
                int i6 = Result.b;
                unitA = ResultKt.a(th4);
            }
            e(th3, Result.a(unitA));
        }
    }
}