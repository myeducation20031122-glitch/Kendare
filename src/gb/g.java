package gb;

import com.google.android.gms.internal.ads.dq0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class g extends Lambda implements Function0 {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ LazyJavaResolverContext e;
    public final /* synthetic */ LazyJavaClassMemberScope f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(0);
        this.e = lazyJavaResolverContext;
        this.f = lazyJavaClassMemberScope;
    }

    public final Object invoke() {
        SignatureEnhancement signatureEnhancement;
        LazyJavaResolverContext lazyJavaResolverContext;
        Collection collectionQ;
        SignatureEnhancement signatureEnhancement2;
        LazyJavaResolverContext lazyJavaResolverContext2;
        boolean z;
        List listEmptyList;
        JavaClassConstructorDescriptor javaClassConstructorDescriptor;
        JavaTypeAttributes javaTypeAttributes;
        JavaTypeResolver javaTypeResolver;
        ArrayList arrayList;
        ArrayList arrayList2;
        Pair pair;
        int i = this.b;
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.f;
        LazyJavaResolverContext lazyJavaResolverContext3 = this.e;
        switch (i) {
            case 0:
                Collection collectionM = lazyJavaClassMemberScope.o.m();
                ArrayList arrayList3 = new ArrayList(collectionM.size());
                Iterator it = collectionM.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    LazyJavaResolverContext lazyJavaResolverContext4 = lazyJavaClassMemberScope.b;
                    ClassDescriptor classDescriptor = lazyJavaClassMemberScope.n;
                    if (!zHasNext) {
                        JavaClass javaClass = lazyJavaClassMemberScope.o;
                        boolean zD = javaClass.D();
                        TypeUsage typeUsage = TypeUsage.e;
                        if (zD) {
                            Annotations.A.getClass();
                            JavaClassConstructorDescriptor javaClassConstructorDescriptorW0 = JavaClassConstructorDescriptor.W0(classDescriptor, Annotations.Companion.b, true, lazyJavaResolverContext4.a.j.a(javaClass));
                            ArrayList<JavaRecordComponent> arrayListP = javaClass.p();
                            ArrayList arrayList4 = new ArrayList(arrayListP.size());
                            JavaTypeAttributes javaTypeAttributesA = JavaTypeAttributesKt.a(typeUsage, false, false, null, 6);
                            int i2 = 0;
                            for (JavaRecordComponent javaRecordComponent : arrayListP) {
                                int i3 = i2 + 1;
                                KotlinType kotlinTypeD = lazyJavaResolverContext4.e.d(javaRecordComponent.a(), javaTypeAttributesA);
                                boolean zH = javaRecordComponent.h();
                                JavaTypeAttributes javaTypeAttributes2 = javaTypeAttributesA;
                                JavaResolverComponents javaResolverComponents = lazyJavaResolverContext4.a;
                                KotlinType kotlinTypeF = zH ? javaResolverComponents.o.q().f(kotlinTypeD) : null;
                                Annotations.A.getClass();
                                arrayList4.add(new ValueParameterDescriptorImpl(javaClassConstructorDescriptorW0, null, i2, Annotations.Companion.b, javaRecordComponent.getName(), kotlinTypeD, false, false, false, kotlinTypeF, javaResolverComponents.j.a(javaRecordComponent)));
                                i2 = i3;
                                javaTypeAttributesA = javaTypeAttributes2;
                            }
                            javaClassConstructorDescriptorW0.Q0(false);
                            DescriptorVisibility visibility = classDescriptor.getVisibility();
                            Intrinsics.e(visibility, "classDescriptor.visibility");
                            if (Intrinsics.a(visibility, JavaDescriptorVisibilities.b)) {
                                visibility = JavaDescriptorVisibilities.c;
                                Intrinsics.e(visibility, "PROTECTED_AND_PACKAGE");
                            }
                            javaClassConstructorDescriptorW0.U0(arrayList4, visibility);
                            javaClassConstructorDescriptorW0.P0(false);
                            javaClassConstructorDescriptorW0.R0(classDescriptor.n());
                            String strA = MethodSignatureMappingKt.a(javaClassConstructorDescriptorW0, 2);
                            if (arrayList3.isEmpty()) {
                                arrayList3.add(javaClassConstructorDescriptorW0);
                                lazyJavaResolverContext3.a.g.c(javaClass, javaClassConstructorDescriptorW0);
                            } else {
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    if (Intrinsics.a(MethodSignatureMappingKt.a((ClassConstructorDescriptor) it2.next(), 2), strA)) {
                                    }
                                }
                                arrayList3.add(javaClassConstructorDescriptorW0);
                                lazyJavaResolverContext3.a.g.c(javaClass, javaClassConstructorDescriptorW0);
                            }
                        }
                        lazyJavaResolverContext3.a.x.b(lazyJavaResolverContext3, classDescriptor, arrayList3);
                        SignatureEnhancement signatureEnhancement3 = lazyJavaResolverContext3.a.r;
                        if (arrayList3.isEmpty()) {
                            boolean zY = javaClass.y();
                            if (!javaClass.A()) {
                                javaClass.J();
                            }
                            if (zY) {
                                Annotations.A.getClass();
                                JavaClassConstructorDescriptor javaClassConstructorDescriptorW02 = JavaClassConstructorDescriptor.W0(classDescriptor, Annotations.Companion.b, true, lazyJavaResolverContext4.a.j.a(javaClass));
                                if (zY) {
                                    Collection collectionI = javaClass.I();
                                    ArrayList arrayList5 = new ArrayList(collectionI.size());
                                    JavaTypeAttributes javaTypeAttributesA2 = JavaTypeAttributesKt.a(typeUsage, true, false, null, 6);
                                    ArrayList arrayList6 = new ArrayList();
                                    ArrayList arrayList7 = new ArrayList();
                                    Iterator it3 = collectionI.iterator();
                                    while (it3.hasNext()) {
                                        Object next = it3.next();
                                        Iterator it4 = it3;
                                        if (Intrinsics.a(((JavaMethod) next).getName(), JvmAnnotationNames.b)) {
                                            arrayList6.add(next);
                                        } else {
                                            arrayList7.add(next);
                                        }
                                        it3 = it4;
                                    }
                                    arrayList6.size();
                                    JavaMethod javaMethod = (JavaMethod) fa.g.s3(arrayList6);
                                    JavaTypeResolver javaTypeResolver2 = lazyJavaResolverContext4.e;
                                    if (javaMethod != null) {
                                        JavaType javaTypeK = javaMethod.k();
                                        if (javaTypeK instanceof JavaArrayType) {
                                            JavaArrayType javaArrayType = (JavaArrayType) javaTypeK;
                                            arrayList = arrayList7;
                                            pair = new Pair(javaTypeResolver2.c(javaArrayType, javaTypeAttributesA2, true), javaTypeResolver2.d(javaArrayType.G(), javaTypeAttributesA2));
                                        } else {
                                            arrayList = arrayList7;
                                            pair = new Pair(javaTypeResolver2.d(javaTypeK, javaTypeAttributesA2), (Object) null);
                                        }
                                        signatureEnhancement2 = signatureEnhancement3;
                                        javaTypeAttributes = javaTypeAttributesA2;
                                        javaTypeResolver = javaTypeResolver2;
                                        arrayList2 = arrayList5;
                                        lazyJavaResolverContext2 = lazyJavaResolverContext3;
                                        z = true;
                                        lazyJavaClassMemberScope.x(arrayList5, javaClassConstructorDescriptorW02, 0, javaMethod, (KotlinType) pair.b, (KotlinType) pair.e);
                                    } else {
                                        signatureEnhancement2 = signatureEnhancement3;
                                        javaTypeAttributes = javaTypeAttributesA2;
                                        javaTypeResolver = javaTypeResolver2;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList5;
                                        lazyJavaResolverContext2 = lazyJavaResolverContext3;
                                        z = true;
                                    }
                                    int i4 = javaMethod != null ? 1 : 0;
                                    Iterator it5 = arrayList.iterator();
                                    int i5 = 0;
                                    while (it5.hasNext()) {
                                        JavaMethod javaMethod2 = (JavaMethod) it5.next();
                                        JavaTypeResolver javaTypeResolver3 = javaTypeResolver;
                                        lazyJavaClassMemberScope.x(arrayList2, javaClassConstructorDescriptorW02, i5 + i4, javaMethod2, javaTypeResolver3.d(javaMethod2.k(), javaTypeAttributes), null);
                                        i5++;
                                        javaTypeResolver = javaTypeResolver3;
                                    }
                                    listEmptyList = arrayList2;
                                } else {
                                    signatureEnhancement2 = signatureEnhancement3;
                                    lazyJavaResolverContext2 = lazyJavaResolverContext3;
                                    z = true;
                                    listEmptyList = Collections.emptyList();
                                }
                                javaClassConstructorDescriptorW02.Q0(false);
                                DescriptorVisibility visibility2 = classDescriptor.getVisibility();
                                Intrinsics.e(visibility2, "classDescriptor.visibility");
                                if (Intrinsics.a(visibility2, JavaDescriptorVisibilities.b)) {
                                    visibility2 = JavaDescriptorVisibilities.c;
                                    Intrinsics.e(visibility2, "PROTECTED_AND_PACKAGE");
                                }
                                javaClassConstructorDescriptorW02.U0(listEmptyList, visibility2);
                                javaClassConstructorDescriptorW02.P0(z);
                                javaClassConstructorDescriptorW02.R0(classDescriptor.n());
                                lazyJavaResolverContext4.a.g.c(javaClass, javaClassConstructorDescriptorW02);
                                javaClassConstructorDescriptor = javaClassConstructorDescriptorW02;
                            } else {
                                signatureEnhancement2 = signatureEnhancement3;
                                lazyJavaResolverContext2 = lazyJavaResolverContext3;
                                javaClassConstructorDescriptor = null;
                            }
                            lazyJavaResolverContext = lazyJavaResolverContext2;
                            signatureEnhancement = signatureEnhancement2;
                            collectionQ = dq0.q(javaClassConstructorDescriptor);
                        } else {
                            signatureEnhancement = signatureEnhancement3;
                            lazyJavaResolverContext = lazyJavaResolverContext3;
                            collectionQ = arrayList3;
                        }
                        return fa.g.K3(signatureEnhancement.c(lazyJavaResolverContext, collectionQ));
                    }
                    JavaConstructor javaConstructor = (JavaConstructor) it.next();
                    LazyJavaAnnotations lazyJavaAnnotationsA = LazyJavaAnnotationsKt.a(lazyJavaResolverContext4, javaConstructor);
                    JavaResolverComponents javaResolverComponents2 = lazyJavaResolverContext4.a;
                    JavaClassConstructorDescriptor javaClassConstructorDescriptorW03 = JavaClassConstructorDescriptor.W0(classDescriptor, lazyJavaAnnotationsA, false, javaResolverComponents2.j.a(javaConstructor));
                    LazyJavaResolverContext lazyJavaResolverContext5 = new LazyJavaResolverContext(javaResolverComponents2, new LazyJavaTypeParameterResolver(lazyJavaResolverContext4, javaClassConstructorDescriptorW03, javaConstructor, classDescriptor.u().size()), lazyJavaResolverContext4.c);
                    LazyJavaScope.ResolvedValueParameters resolvedValueParametersU = LazyJavaScope.u(lazyJavaResolverContext5, javaClassConstructorDescriptorW03, javaConstructor.i());
                    List listU = classDescriptor.u();
                    Intrinsics.e(listU, "classDescriptor.declaredTypeParameters");
                    List list = listU;
                    ArrayList typeParameters = javaConstructor.getTypeParameters();
                    ArrayList arrayList8 = new ArrayList(fa.d.f3(typeParameters));
                    Iterator it6 = typeParameters.iterator();
                    while (it6.hasNext()) {
                        TypeParameterDescriptor typeParameterDescriptorA = lazyJavaResolverContext5.b.a((JavaTypeParameter) it6.next());
                        Intrinsics.c(typeParameterDescriptorA);
                        arrayList8.add(typeParameterDescriptorA);
                    }
                    javaClassConstructorDescriptorW03.V0(resolvedValueParametersU.a, UtilsKt.a(javaConstructor.getVisibility()), fa.g.C3(arrayList8, list));
                    javaClassConstructorDescriptorW03.P0(false);
                    javaClassConstructorDescriptorW03.Q0(resolvedValueParametersU.b);
                    javaClassConstructorDescriptorW03.R0(classDescriptor.n());
                    lazyJavaResolverContext5.a.g.c(javaConstructor, javaClassConstructorDescriptorW03);
                    arrayList3.add(javaClassConstructorDescriptorW03);
                }
            default:
                return fa.g.N3(lazyJavaResolverContext3.a.x.a(lazyJavaResolverContext3, lazyJavaClassMemberScope.n));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        super(0);
        this.f = lazyJavaClassMemberScope;
        this.e = lazyJavaResolverContext;
    }
}