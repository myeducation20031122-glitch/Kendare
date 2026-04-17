package ea;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.SafePublicationLazyImpl$Companion;
import kotlin.UNINITIALIZED_VALUE;
import kotlin.jvm.functions.Function0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements Lazy, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12615f;

    /* renamed from: b, reason: collision with root package name */
    public volatile Function0 f12616b;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f12617e;

    static {
        new SafePublicationLazyImpl$Companion(0);
        f12615f = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "e");
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object obj = this.f12617e;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f14088a;
        if (obj != uninitialized_value) {
            return obj;
        }
        Function0 function0 = this.f12616b;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12615f;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, uninitialized_value, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != uninitialized_value) {
                }
            }
            this.f12616b = null;
            return objInvoke;
        }
        return this.f12617e;
    }

    public final String toString() {
        return this.f12617e != UNINITIALIZED_VALUE.f14088a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}