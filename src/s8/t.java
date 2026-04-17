package s8;

import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t extends w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f16944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16945c;

    public t(Method method, int i10) {
        this.f16944b = method;
        this.f16945c = i10;
    }

    @Override // s8.w
    public final Object a(Class cls) {
        String strC = com.bumptech.glide.manager.t.c(cls);
        if (strC == null) {
            return this.f16944b.invoke(null, cls, Integer.valueOf(this.f16945c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strC));
    }
}