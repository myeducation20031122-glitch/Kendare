package ea;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.UNINITIALIZED_VALUE;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements Lazy, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public Function0 f12618b;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f12619e = UNINITIALIZED_VALUE.f14088a;

    /* renamed from: f, reason: collision with root package name */
    public final Object f12620f = this;

    public b(Function0 function0) {
        this.f12618b = function0;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f12619e;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f14088a;
        if (obj != uninitialized_value) {
            return obj;
        }
        synchronized (this.f12620f) {
            objInvoke = this.f12619e;
            if (objInvoke == uninitialized_value) {
                Function0 function0 = this.f12618b;
                Intrinsics.c(function0);
                objInvoke = function0.invoke();
                this.f12619e = objInvoke;
                this.f12618b = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f12619e != UNINITIALIZED_VALUE.f14088a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}