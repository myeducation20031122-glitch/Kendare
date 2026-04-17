package fc;

import com.google.android.gms.internal.ads.ic1;
import kotlin.coroutines.CoroutineContext;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b1 extends p {
    public static final /* synthetic */ int f = 0;

    static {
        new b1();
    }

    @Override // fc.p
    public final void j(CoroutineContext coroutineContext, Runnable runnable) {
        ic1.w(coroutineContext.d(d1.e));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // fc.p
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}