package gb;

import com.google.android.gms.internal.ads.dq0;
import java.util.Map;
import java.util.Set;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class j extends Lambda implements Function1 {
    public final /* synthetic */ LazyJavaClassMemberScope b;
    public final /* synthetic */ LazyJavaResolverContext e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        super(1);
        this.b = lazyJavaClassMemberScope;
        this.e = lazyJavaResolverContext;
    }

    public final Object invoke(Object obj) {
        Name name = (Name) obj;
        Intrinsics.f(name, "name");
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.b;
        boolean zContains = ((Set) lazyJavaClassMemberScope.r.invoke()).contains(name);
        LazyJavaResolverContext lazyJavaResolverContext = this.e;
        ClassDescriptor classDescriptor = lazyJavaClassMemberScope.n;
        if (zContains) {
            JavaClassFinder javaClassFinder = lazyJavaResolverContext.a.b;
            ClassId classIdF = DescriptorUtilsKt.f(classDescriptor);
            Intrinsics.c(classIdF);
            ReflectJavaClass reflectJavaClassB = javaClassFinder.b(new JavaClassFinder.Request(classIdF.d(name), lazyJavaClassMemberScope.o, 2));
            if (reflectJavaClassB == null) {
                return null;
            }
            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, classDescriptor, reflectJavaClassB, null);
            lazyJavaResolverContext.a.s.a(lazyJavaClassDescriptor);
            return lazyJavaClassDescriptor;
        }
        if (!((Set) lazyJavaClassMemberScope.s.invoke()).contains(name)) {
            JavaField javaField = (JavaField) ((Map) lazyJavaClassMemberScope.t.invoke()).get(name);
            if (javaField == null) {
                return null;
            }
            vb.g gVarA = lazyJavaResolverContext.a.a.a(new h(lazyJavaClassMemberScope, 2));
            JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.a;
            return EnumEntrySyntheticClassDescriptor.J0(javaResolverComponents.a, lazyJavaClassMemberScope.n, name, gVarA, LazyJavaAnnotationsKt.a(lazyJavaResolverContext, javaField), javaResolverComponents.j.a(javaField));
        }
        ListBuilder listBuilder = new ListBuilder();
        lazyJavaResolverContext.a.x.c(lazyJavaResolverContext, classDescriptor, name, listBuilder);
        ListBuilder listBuilderA = dq0.a(listBuilder);
        int iA = listBuilderA.a();
        if (iA == 0) {
            return null;
        }
        if (iA == 1) {
            return (ClassDescriptor) fa.g.F3(listBuilderA);
        }
        throw new IllegalStateException(("Multiple classes with same name are generated: " + listBuilderA).toString());
    }
}