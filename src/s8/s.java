package s8;

import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s extends w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f16942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16943c;

    public s(Object obj, Method method) {
        this.f16942b = method;
        this.f16943c = obj;
    }

    @Override // s8.w
    public final Object a(Class cls) {
        String strC = com.bumptech.glide.manager.t.c(cls);
        if (strC == null) {
            return this.f16942b.invoke(this.f16943c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strC));
    }
}