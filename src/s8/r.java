package s8;

import java.lang.reflect.AccessibleObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f16941a;

    static {
        r pVar;
        if (h.f16913a >= 9) {
            try {
                pVar = new p(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
        } else {
            pVar = null;
        }
        if (pVar == null) {
            pVar = new q();
        }
        f16941a = pVar;
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}