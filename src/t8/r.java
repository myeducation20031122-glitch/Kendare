package t8;

import com.google.android.gms.internal.ads.dq0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r extends p {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f18011e;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f18012b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f18013c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f18014d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f18011e = map;
    }

    public r(Class cls, LinkedHashMap linkedHashMap) throws SecurityException {
        super(linkedHashMap);
        this.f18014d = new HashMap();
        dq0 dq0Var = v8.b.f18515a;
        Constructor constructorH = dq0Var.h(cls);
        this.f18012b = constructorH;
        v8.b.d(constructorH);
        String[] strArrK = dq0Var.k(cls);
        for (int i10 = 0; i10 < strArrK.length; i10++) {
            this.f18014d.put(strArrK[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.f18012b.getParameterTypes();
        this.f18013c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.f18013c[i11] = f18011e.get(parameterTypes[i11]);
        }
    }

    @Override // t8.p
    public final Object d() {
        return (Object[]) this.f18013c.clone();
    }

    @Override // t8.p
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f18012b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e10) {
            dq0 dq0Var = v8.b.f18515a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + v8.b.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new RuntimeException("Failed to invoke constructor '" + v8.b.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Failed to invoke constructor '" + v8.b.b(constructor) + "' with args " + Arrays.toString(objArr), e13.getCause());
        }
    }

    @Override // t8.p
    public final void f(Object obj, y8.a aVar, o oVar) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.f18014d;
        String str = oVar.f17997b;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + v8.b.b(this.f18012b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objB = oVar.f18004i.b(aVar);
        if (objB != null || !oVar.f18007l) {
            objArr[iIntValue] = objB;
        } else {
            StringBuilder sbA = a0.h.A("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbA.append(aVar.h(false));
            throw new androidx.fragment.app.y(sbA.toString());
        }
    }
}