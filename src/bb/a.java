package bb;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public abstract class a {
    public static ClassLiteralValue a(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            Intrinsics.e(cls, "currentClass.componentType");
        }
        if (cls.isPrimitive()) {
            if (Intrinsics.a(cls, Void.TYPE)) {
                return new ClassLiteralValue(ClassId.k(StandardNames.FqNames.e.g()), i);
            }
            PrimitiveType primitiveTypeJ = JvmPrimitiveType.e(cls.getName()).j();
            Intrinsics.e(primitiveTypeJ, "get(currentClass.name).primitiveType");
            return i > 0 ? new ClassLiteralValue(ClassId.k((FqName) primitiveTypeJ.j.getValue()), i - 1) : new ClassLiteralValue(ClassId.k((FqName) primitiveTypeJ.f.getValue()), i);
        }
        ClassId classIdA = ReflectClassUtilKt.a(cls);
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.a;
        FqName fqNameB = classIdA.b();
        Intrinsics.e(fqNameB, "javaClassId.asSingleFqName()");
        javaToKotlinClassMap.getClass();
        ClassId classId = (ClassId) JavaToKotlinClassMap.i.get(fqNameB.i());
        if (classId != null) {
            classIdA = classId;
        }
        return new ClassLiteralValue(classIdA, i);
    }

    public static void b(Class cls, KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.f(cls, "klass");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        Intrinsics.e(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            Intrinsics.e(annotation, "annotation");
            c(annotationVisitor, annotation);
        }
        annotationVisitor.a();
    }

    public static void c(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class clsB = JvmClassMappingKt.b(JvmClassMappingKt.a(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorB = annotationVisitor.b(ReflectClassUtilKt.a(clsB), new ReflectAnnotationSource(annotation));
        if (annotationArgumentVisitorB != null) {
            d(annotationArgumentVisitorB, annotation, clsB);
        }
    }

    public static void d(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class cls) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.e(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, new Object[0]);
                Intrinsics.c(objInvoke);
                Name nameK = Name.k(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (Intrinsics.a(enclosingClass, Class.class)) {
                    annotationArgumentVisitor.b(nameK, a((Class) objInvoke));
                } else if (ReflectKotlinClassKt.a.contains(enclosingClass)) {
                    annotationArgumentVisitor.f(objInvoke, nameK);
                } else {
                    List list = ReflectClassUtilKt.a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        Intrinsics.e(enclosingClass, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                        annotationArgumentVisitor.d(nameK, ReflectClassUtilKt.a(enclosingClass), Name.k(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        Intrinsics.e(interfaces, "clazz.interfaces");
                        Class cls2 = (Class) ArraysKt.H3(interfaces);
                        Intrinsics.e(cls2, "annotationClass");
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorC = annotationArgumentVisitor.c(ReflectClassUtilKt.a(cls2), nameK);
                        if (annotationArgumentVisitorC != null) {
                            d(annotationArgumentVisitorC, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor annotationArrayArgumentVisitorE = annotationArgumentVisitor.e(nameK);
                        if (annotationArrayArgumentVisitorE != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                ClassId classIdA = ReflectClassUtilKt.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    annotationArrayArgumentVisitorE.e(classIdA, Name.k(((Enum) obj).name()));
                                }
                            } else if (Intrinsics.a(componentType, Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    Intrinsics.d(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    annotationArrayArgumentVisitorE.c(a((Class) obj2));
                                }
                            } else {
                                Object[] objArr = (Object[]) objInvoke;
                                if (Annotation.class.isAssignableFrom(componentType)) {
                                    for (Object obj3 : objArr) {
                                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorB = annotationArrayArgumentVisitorE.b(ReflectClassUtilKt.a(componentType));
                                        if (annotationArgumentVisitorB != null) {
                                            Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                            d(annotationArgumentVisitorB, (Annotation) obj3, componentType);
                                        }
                                    }
                                } else {
                                    for (Object obj4 : objArr) {
                                        annotationArrayArgumentVisitorE.d(obj4);
                                    }
                                }
                            }
                            annotationArrayArgumentVisitorE.a();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.a();
    }
}