package gb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$Found;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$NotFound;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$SyntheticClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class n extends Lambda implements Function1 {
    public final /* synthetic */ LazyJavaPackageScope b;
    public final /* synthetic */ LazyJavaResolverContext e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext) {
        super(1);
        this.b = lazyJavaPackageScope;
        this.e = lazyJavaResolverContext;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        com.bumptech.glide.c lazyJavaPackageScope$KotlinClassLookupResult$Found;
        ClassDescriptor classDescriptorA;
        m mVar = (m) obj;
        Intrinsics.f(mVar, "request");
        LazyJavaPackageScope lazyJavaPackageScope = this.b;
        ClassId classId = new ClassId(lazyJavaPackageScope.o.m, mVar.a);
        LazyJavaResolverContext lazyJavaResolverContext = this.e;
        JavaClass javaClassB = mVar.b;
        KotlinClassFinder.Result.KotlinClass kotlinClassA = javaClassB != null ? lazyJavaResolverContext.a.c.a(javaClassB, LazyJavaPackageScope.v(lazyJavaPackageScope)) : lazyJavaResolverContext.a.c.b(classId, LazyJavaPackageScope.v(lazyJavaPackageScope));
        KotlinJvmBinaryClass kotlinJvmBinaryClass = kotlinClassA != 0 ? kotlinClassA.a : null;
        ClassId classIdE = kotlinJvmBinaryClass != null ? kotlinJvmBinaryClass.e() : null;
        if (classIdE != null && ((!classIdE.b.e().d()) || classIdE.c)) {
            return null;
        }
        if (kotlinJvmBinaryClass == null) {
            lazyJavaPackageScope$KotlinClassLookupResult$Found = new com.bumptech.glide.c() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$NotFound
            };
        } else if (kotlinJvmBinaryClass.a().a == KotlinClassHeader.Kind.CLASS) {
            DeserializedDescriptorResolver deserializedDescriptorResolver = lazyJavaPackageScope.b.a.d;
            deserializedDescriptorResolver.getClass();
            ClassData classDataF = deserializedDescriptorResolver.f(kotlinJvmBinaryClass);
            if (classDataF == null) {
                classDescriptorA = null;
            } else {
                classDescriptorA = deserializedDescriptorResolver.c().u.a(kotlinJvmBinaryClass.e(), classDataF);
            }
            lazyJavaPackageScope$KotlinClassLookupResult$Found = classDescriptorA != null ? new LazyJavaPackageScope$KotlinClassLookupResult$Found(classDescriptorA) : new com.bumptech.glide.c() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$NotFound
            };
        } else {
            lazyJavaPackageScope$KotlinClassLookupResult$Found = new com.bumptech.glide.c() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$SyntheticClass
            };
        }
        if (lazyJavaPackageScope$KotlinClassLookupResult$Found instanceof LazyJavaPackageScope$KotlinClassLookupResult$Found) {
            return ((LazyJavaPackageScope$KotlinClassLookupResult$Found) lazyJavaPackageScope$KotlinClassLookupResult$Found).g;
        }
        if (lazyJavaPackageScope$KotlinClassLookupResult$Found instanceof LazyJavaPackageScope$KotlinClassLookupResult$SyntheticClass) {
            return null;
        }
        if (!(lazyJavaPackageScope$KotlinClassLookupResult$Found instanceof LazyJavaPackageScope$KotlinClassLookupResult$NotFound)) {
            throw new NoWhenBranchMatchedException();
        }
        if (javaClassB == null) {
            JavaClassFinder javaClassFinder = lazyJavaResolverContext.a.b;
            if (kotlinClassA instanceof KotlinClassFinder.Result.ClassFileContent) {
            }
            javaClassB = javaClassFinder.b(new JavaClassFinder.Request(classId, null, 4));
        }
        if (javaClassB != null) {
            javaClassB.B();
        }
        FqName fqNameD = javaClassB != null ? javaClassB.d() : null;
        if (fqNameD == null || fqNameD.d()) {
            return null;
        }
        FqName fqNameE = fqNameD.e();
        LazyJavaPackageFragment lazyJavaPackageFragment = lazyJavaPackageScope.o;
        if (!Intrinsics.a(fqNameE, lazyJavaPackageFragment.m)) {
            return null;
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, lazyJavaPackageFragment, javaClassB, null);
        lazyJavaResolverContext.a.s.a(lazyJavaClassDescriptor);
        return lazyJavaClassDescriptor;
    }
}