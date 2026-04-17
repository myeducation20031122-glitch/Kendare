package fc;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class h extends n0 {
    public final f m;

    public h(f fVar) {
        this.m = fVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        u((Throwable) obj);
        return Unit.a;
    }

    @Override // fc.o0
    public final void u(Throwable th) {
        a0 a0Var;
        s0 s0VarS = s();
        f fVar = this.m;
        fVar.getClass();
        CancellationException cancellationExceptionP = s0VarS.p();
        if (fVar.m() && ((kotlinx.coroutines.internal.c) fVar.j).h(cancellationExceptionP)) {
            return;
        }
        fVar.i(cancellationExceptionP);
        if (fVar.m() || (a0Var = fVar.n) == null) {
            return;
        }
        a0Var.dispose();
        fVar.n = w0.b;
    }
}