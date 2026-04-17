package h1;

import com.google.android.gms.internal.ads.dq0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import s8.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements o {

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f13166b;

    public a(Constructor constructor) {
        this.f13166b = constructor;
    }

    @Override // s8.o
    public final Object j() {
        Constructor constructor = this.f13166b;
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            dq0 dq0Var = v8.b.f18515a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + v8.b.b(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + v8.b.b(constructor) + "' with no args", e12.getCause());
        }
    }
}