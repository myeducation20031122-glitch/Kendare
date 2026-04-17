package la;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f14700a;

    static {
        Method method;
        Method[] throwableMethods = Throwable.class.getMethods();
        Intrinsics.e(throwableMethods, "throwableMethods");
        int length = throwableMethods.length;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                break;
            }
            Method method2 = throwableMethods[i10];
            if (Intrinsics.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                Intrinsics.e(parameterTypes, "it.parameterTypes");
                if (Intrinsics.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i10++;
        }
        f14700a = method;
        int length2 = throwableMethods.length;
        for (int i11 = 0; i11 < length2 && !Intrinsics.a(throwableMethods[i11].getName(), "getSuppressed"); i11++) {
        }
    }
}