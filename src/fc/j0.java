package fc;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class j0 extends d {
    public final Function1 b;

    public j0(Function1 function1) {
        this.b = function1;
    }

    public final Object invoke(Object obj) {
        this.b.invoke((Throwable) obj);
        return Unit.a;
    }

    public final String toString() {
        return "InvokeOnCancel[" + this.b.getClass().getSimpleName() + '@' + t.s(this) + ']';
    }
}