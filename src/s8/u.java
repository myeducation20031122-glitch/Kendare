package s8;

import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u extends w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f16946b;

    public u(Method method) {
        this.f16946b = method;
    }

    @Override // s8.w
    public final Object a(Class cls) {
        String strC = com.bumptech.glide.manager.t.c(cls);
        if (strC == null) {
            return this.f16946b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strC));
    }
}