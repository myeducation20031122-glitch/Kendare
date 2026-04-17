package f1;

import androidx.lifecycle.b1;
import androidx.lifecycle.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements b1 {

    /* renamed from: b, reason: collision with root package name */
    public final f[] f12656b;

    public c(f... initializers) {
        Intrinsics.f(initializers, "initializers");
        this.f12656b = initializers;
    }

    @Override // androidx.lifecycle.b1
    public final y0 create(Class modelClass) {
        Intrinsics.f(modelClass, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // androidx.lifecycle.b1
    public final y0 create(Class cls, b bVar) {
        y0 y0Var = null;
        for (f fVar : this.f12656b) {
            if (Intrinsics.a(fVar.f12658a, cls)) {
                Object objInvoke = fVar.f12659b.invoke(bVar);
                y0Var = objInvoke instanceof y0 ? (y0) objInvoke : null;
            }
        }
        if (y0Var != null) {
            return y0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}