package v8;

import a0.h;
import com.google.android.gms.internal.ads.cn0;
import com.google.android.gms.internal.ads.dq0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m7.p;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final dq0 f18515a;

    static {
        dq0 cn0Var;
        try {
            cn0Var = new a();
        } catch (NoSuchMethodException unused) {
            cn0Var = new cn0();
        }
        f18515a = cn0Var;
    }

    public static void a(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i10].getSimpleName());
        }
        sb.append(')');
    }

    public static String b(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        a(constructor, sb);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(AccessibleObject accessibleObject, boolean z7) {
        StringBuilder sb;
        String strB;
        String string;
        if (accessibleObject instanceof Field) {
            Field field = (Field) accessibleObject;
            sb = new StringBuilder("field '");
            sb.append(field.getDeclaringClass().getName());
            sb.append("#");
            strB = field.getName();
        } else {
            if (accessibleObject instanceof Method) {
                Method method = (Method) accessibleObject;
                StringBuilder sb2 = new StringBuilder(method.getName());
                a(method, sb2);
                string = "method '" + method.getDeclaringClass().getName() + "#" + sb2.toString() + "'";
                if (z7 && Character.isLowerCase(string.charAt(0))) {
                    return Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            }
            if (!(accessibleObject instanceof Constructor)) {
                sb = new StringBuilder("<unknown AccessibleObject> ");
                sb.append(accessibleObject.toString());
                string = sb.toString();
                return z7 ? string : string;
            }
            sb = new StringBuilder("constructor '");
            strB = b((Constructor) accessibleObject);
        }
        sb.append(strB);
        sb.append("'");
        string = sb.toString();
        if (z7) {
        }
    }

    public static void d(AccessibleObject accessibleObject) throws SecurityException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e10) {
            throw new p(h.w("Failed making ", c(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e10);
        }
    }
}