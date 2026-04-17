package fc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class k0 extends n0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(k0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;
    public final Function1 m;

    public k0(o0 o0Var) {
        this.m = o0Var;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        u((Throwable) obj);
        return Unit.a;
    }

    @Override // fc.o0
    public final void u(Throwable th) {
        if (n.compareAndSet(this, 0, 1)) {
            this.m.invoke(th);
        }
    }
}