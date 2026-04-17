package fc;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class n extends Lambda implements Function1 {
    public static final n e = new n(0);
    public static final n f = new n(1);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i) {
        super(1);
        this.b = i;
    }

    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                p pVar = (CoroutineContext.Element) obj;
                if (pVar instanceof p) {
                    return pVar;
                }
                return null;
            default:
                g0 g0Var = (CoroutineContext.Element) obj;
                if (g0Var instanceof g0) {
                    return g0Var;
                }
                return null;
        }
    }
}