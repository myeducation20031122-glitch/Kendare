package v8;

import com.google.android.gms.internal.ads.dq0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends dq0 {
    public final Method B = Class.class.getMethod("isRecord", new Class[0]);
    public final Method C;
    public final Method D;
    public final Method E;

    public a() throws NoSuchMethodException, SecurityException {
        Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
        this.C = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.D = componentType.getMethod("getName", new Class[0]);
        this.E = componentType.getMethod("getType", new Class[0]);
    }

    @Override // com.google.android.gms.internal.ads.dq0
    public final Method g(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.dq0
    public final Constructor h(Class cls) {
        try {
            Object[] objArr = (Object[]) this.C.invoke(cls, new Object[0]);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = (Class) this.E.invoke(objArr[i10], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.dq0
    public final String[] k(Class cls) {
        try {
            Object[] objArr = (Object[]) this.C.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) this.D.invoke(objArr[i10], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.dq0
    public final boolean m(Class cls) {
        try {
            return ((Boolean) this.B.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }
}