package fc;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public abstract class p extends AbstractCoroutineContextElement implements ContinuationInterceptor {
    public static final o e = new o(0);

    public p() {
        super(ContinuationInterceptor.y);
    }

    public final void b(Continuation continuation) {
        ((kotlinx.coroutines.internal.c) continuation).i();
    }

    public final kotlinx.coroutines.internal.c c(Continuation continuation) {
        return new kotlinx.coroutines.internal.c(this, continuation);
    }

    public final CoroutineContext.Element d(CoroutineContext.Key key) {
        Intrinsics.f(key, "key");
        if (!(key instanceof AbstractCoroutineContextKey)) {
            if (ContinuationInterceptor.y == key) {
                return this;
            }
            return null;
        }
        CoroutineContext.Key key2 = (AbstractCoroutineContextKey) key;
        CoroutineContext.Key key3 = ((AbstractCoroutineContextElement) this).b;
        Intrinsics.f(key3, "key");
        if (key3 != key2 && ((AbstractCoroutineContextKey) key2).e != key3) {
            return null;
        }
        CoroutineContext.Element element = (CoroutineContext.Element) ((AbstractCoroutineContextKey) key2).b.invoke(this);
        if (element instanceof CoroutineContext.Element) {
            return element;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (kotlin.coroutines.ContinuationInterceptor.y == r3) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        return kotlin.coroutines.EmptyCoroutineContext.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (((kotlin.coroutines.CoroutineContext.Element) ((kotlin.coroutines.AbstractCoroutineContextKey) r3).b.invoke(r2)) == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineContext h(CoroutineContext.Key key) {
        Intrinsics.f(key, "key");
        if (key instanceof AbstractCoroutineContextKey) {
            CoroutineContext.Key key2 = (AbstractCoroutineContextKey) key;
            CoroutineContext.Key key3 = ((AbstractCoroutineContextElement) this).b;
            Intrinsics.f(key3, "key");
            if (key3 != key2) {
                if (((AbstractCoroutineContextKey) key2).e == key3) {
                }
                return this;
            }
        }
    }

    public abstract void j(CoroutineContext coroutineContext, Runnable runnable);

    public boolean k() {
        return !(this instanceof b1);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + t.s(this);
    }
}