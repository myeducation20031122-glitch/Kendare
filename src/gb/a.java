package gb;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a extends Lambda implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ LazyJavaAnnotationDescriptor e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor, int i) {
        super(0);
        this.b = i;
        this.e = lazyJavaAnnotationDescriptor;
    }

    public final Object invoke() {
        int i = this.b;
        LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.e;
        switch (i) {
            case 0:
                ArrayList<JavaAnnotationArgument> arrayListB = lazyJavaAnnotationDescriptor.b.b();
                ArrayList arrayList = new ArrayList();
                for (JavaAnnotationArgument javaAnnotationArgument : arrayListB) {
                    Name name = javaAnnotationArgument.getName();
                    if (name == null) {
                        name = JvmAnnotationNames.b;
                    }
                    ConstantValue constantValueC = lazyJavaAnnotationDescriptor.c(javaAnnotationArgument);
                    Pair pair = constantValueC != null ? new Pair(name, constantValueC) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return fa.j.m0(arrayList);
            case 1:
                ClassId classIdE = lazyJavaAnnotationDescriptor.b.e();
                if (classIdE != null) {
                    return classIdE.b();
                }
                return null;
            default:
                FqName fqNameD = lazyJavaAnnotationDescriptor.d();
                JavaAnnotation javaAnnotation = lazyJavaAnnotationDescriptor.b;
                if (fqNameD == null) {
                    return ErrorUtils.c(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, javaAnnotation.toString());
                }
                JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.a;
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaAnnotationDescriptor.a;
                ClassDescriptor classDescriptorC = JavaToKotlinClassMapper.c(javaToKotlinClassMapper, fqNameD, lazyJavaResolverContext.a.o.q());
                if (classDescriptorC == null) {
                    ReflectJavaClass reflectJavaClassO = javaAnnotation.o();
                    JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.a;
                    ClassDescriptor classDescriptorA = reflectJavaClassO != null ? javaResolverComponents.k.a(reflectJavaClassO) : null;
                    classDescriptorC = classDescriptorA == null ? FindClassInModuleKt.c(javaResolverComponents.o, ClassId.k(fqNameD), javaResolverComponents.d.c().l) : classDescriptorA;
                }
                return classDescriptorC.n();
        }
    }
}