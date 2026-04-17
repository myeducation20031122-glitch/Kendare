package s8;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f16940b;

    public p(Method method) {
        this.f16940b = method;
    }

    @Override // s8.r
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f16940b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e10) {
            throw new RuntimeException("Failed invoking canAccess", e10);
        }
    }
}