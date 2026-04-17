package ua;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a implements InvocationHandler {
    public final Class a;
    public final Map b;
    public final Lazy c;
    public final Lazy d;
    public final List e;

    public a(Class cls, Map map, ea.b bVar, ea.b bVar2, List list) {
        this.a = cls;
        this.b = map;
        this.c = bVar;
        this.d = bVar2;
        this.e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean zA;
        Class cls = this.a;
        Intrinsics.f(cls, "$annotationClass");
        Map map = this.b;
        Intrinsics.f(map, "$values");
        Lazy lazy = this.c;
        Intrinsics.f(lazy, "$toString$delegate");
        Lazy lazy2 = this.d;
        Intrinsics.f(lazy2, "$hashCode$delegate");
        List list = this.e;
        Intrinsics.f(list, "$methods");
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) lazy2.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) lazy.getValue();
            }
        }
        boolean z = false;
        if (!Intrinsics.a(name, "equals") || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb2 = new StringBuilder("Method is not supported: ");
            sb2.append(method);
            sb2.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb2.append(ArraysKt.J3(objArr));
            sb2.append(')');
            throw new KotlinReflectionInternalError(sb2.toString());
        }
        Object objH3 = ArraysKt.H3(objArr);
        Annotation annotation = objH3 instanceof Annotation ? (Annotation) objH3 : null;
        if (Intrinsics.a(annotation != null ? JvmClassMappingKt.b(JvmClassMappingKt.a(annotation)) : null, cls)) {
            List<Method> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z = true;
            } else {
                for (Method method2 : list2) {
                    Object obj2 = map.get(method2.getName());
                    Object objInvoke = method2.invoke(objH3, new Object[0]);
                    if (obj2 instanceof boolean[]) {
                        Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        zA = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                        zA = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        zA = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        zA = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                        zA = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        zA = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                        zA = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        zA = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        zA = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zA = Intrinsics.a(obj2, objInvoke);
                    }
                    if (!zA) {
                        break;
                    }
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}