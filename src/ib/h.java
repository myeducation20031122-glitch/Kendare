package ib;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class h extends AbstractSignatureParts {
    public final Annotated a;
    public final boolean b;
    public final LazyJavaResolverContext c;
    public final AnnotationQualifierApplicabilityType d;
    public final boolean e;

    public h(Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2) {
        Intrinsics.f(lazyJavaResolverContext, "containerContext");
        this.a = annotated;
        this.b = z;
        this.c = lazyJavaResolverContext;
        this.d = annotationQualifierApplicabilityType;
        this.e = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj, KotlinTypeMarker kotlinTypeMarker) {
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        Intrinsics.f(annotationDescriptor, "<this>");
        if (!(annotationDescriptor instanceof PossiblyExternalAnnotationDescriptor) || !((PossiblyExternalAnnotationDescriptor) annotationDescriptor).j()) {
            boolean z = annotationDescriptor instanceof LazyJavaAnnotationDescriptor;
            LazyJavaResolverContext lazyJavaResolverContext = this.c;
            if (z) {
                lazyJavaResolverContext.a.t.d();
                if (!((LazyJavaAnnotationDescriptor) annotationDescriptor).h) {
                    if (this.d != AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
                        if (kotlinTypeMarker == null || !KotlinBuiltIns.F((KotlinType) kotlinTypeMarker) || !c().h(annotationDescriptor)) {
                            return false;
                        }
                        lazyJavaResolverContext.a.t.a();
                    }
                }
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final Annotations d(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.f(kotlinTypeMarker, "<this>");
        return ((KotlinType) kotlinTypeMarker).getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final JavaTypeQualifiersByElementType f() {
        return (JavaTypeQualifiersByElementType) this.c.d.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final KotlinType g(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.f(kotlinTypeMarker, "<this>");
        return TypeWithEnhancementKt.a((KotlinType) kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean i() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final SimpleClassicTypeSystemContext j() {
        return SimpleClassicTypeSystemContext.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean k(TypeParameterMarker typeParameterMarker) {
        return typeParameterMarker instanceof LazyJavaTypeParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final AnnotationTypeQualifierResolver c() {
        return this.c.a.q;
    }

    public final boolean n() {
        Annotated annotated = this.a;
        return (annotated instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) annotated).I() != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FqNameUnsafe o(SimpleTypeMarker simpleTypeMarker) {
        Intrinsics.f(simpleTypeMarker, "<this>");
        ErrorType errorType = TypeUtils.a;
        ClassifierDescriptor classifierDescriptorC = ((KotlinType) simpleTypeMarker).L0().c();
        ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
        if (classDescriptor != null) {
            return DescriptorUtils.g(classDescriptor);
        }
        return null;
    }

    public final boolean p(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        Intrinsics.f(kotlinTypeMarker, "<this>");
        Intrinsics.f(kotlinTypeMarker2, "other");
        return this.c.a.u.b((KotlinType) kotlinTypeMarker, (KotlinType) kotlinTypeMarker2);
    }
}