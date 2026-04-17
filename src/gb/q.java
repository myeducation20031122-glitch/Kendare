package gb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class q extends Lambda implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ LazyJavaScope e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(LazyJavaScope lazyJavaScope, int i) {
        super(1);
        this.b = i;
        this.e = lazyJavaScope;
    }

    public final Collection a(Name name) {
        int i = this.b;
        LazyJavaScope lazyJavaScope = this.e;
        switch (i) {
            case 1:
                Intrinsics.f(name, "name");
                LazyJavaScope lazyJavaScope2 = lazyJavaScope.c;
                if (lazyJavaScope2 != null) {
                    return (Collection) lazyJavaScope2.f.invoke(name);
                }
                ArrayList arrayList = new ArrayList();
                for (JavaMethod javaMethod : ((DeclaredMemberIndex) lazyJavaScope.e.invoke()).f(name)) {
                    JavaMethodDescriptor javaMethodDescriptorT = lazyJavaScope.t(javaMethod);
                    if (lazyJavaScope.r(javaMethodDescriptorT)) {
                        lazyJavaScope.b.a.g.d(javaMethod, javaMethodDescriptorT);
                        arrayList.add(javaMethodDescriptorT);
                    }
                }
                lazyJavaScope.j(arrayList, name);
                return arrayList;
            default:
                Intrinsics.f(name, "name");
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) lazyJavaScope.f.invoke(name));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : linkedHashSet) {
                    String strA = MethodSignatureMappingKt.a((SimpleFunctionDescriptor) obj, 2);
                    Object arrayList2 = linkedHashMap.get(strA);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strA, arrayList2);
                    }
                    ((List) arrayList2).add(obj);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        List list2 = list;
                        Collection collectionA = OverridingUtilsKt.a(list2, s.b);
                        linkedHashSet.removeAll(list2);
                        linkedHashSet.addAll(collectionA);
                    }
                }
                lazyJavaScope.m(linkedHashSet, name);
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaScope.b;
                return fa.g.K3(lazyJavaResolverContext.a.r.c(lazyJavaResolverContext, linkedHashSet));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.b;
        LazyJavaScope lazyJavaScope = this.e;
        switch (i) {
            case 0:
                Name name = (Name) obj;
                Intrinsics.f(name, "name");
                LazyJavaScope lazyJavaScope2 = lazyJavaScope.c;
                if (lazyJavaScope2 != null) {
                    return (PropertyDescriptor) lazyJavaScope2.g.invoke(name);
                }
                JavaField javaFieldC = ((DeclaredMemberIndex) lazyJavaScope.e.invoke()).c(name);
                if (javaFieldC == null || javaFieldC.v()) {
                    return null;
                }
                int i2 = 1;
                boolean z = !javaFieldC.isFinal();
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaScope.b;
                LazyJavaAnnotations lazyJavaAnnotationsA = LazyJavaAnnotationsKt.a(lazyJavaResolverContext, javaFieldC);
                DeclarationDescriptor declarationDescriptorQ = lazyJavaScope.q();
                Modality.Companion companion = Modality.b;
                DescriptorVisibility descriptorVisibilityA = UtilsKt.a(javaFieldC.getVisibility());
                Name name2 = javaFieldC.getName();
                JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.a;
                JavaPropertyDescriptor javaPropertyDescriptorQ0 = JavaPropertyDescriptor.Q0(declarationDescriptorQ, lazyJavaAnnotationsA, descriptorVisibilityA, z, name2, javaResolverComponents.j.a(javaFieldC), javaFieldC.isFinal() && javaFieldC.P());
                javaPropertyDescriptorQ0.N0(null, null, null, null);
                KotlinType kotlinTypeD = lazyJavaResolverContext.e.d(javaFieldC.a(), JavaTypeAttributesKt.a(TypeUsage.e, false, false, null, 7));
                if ((KotlinBuiltIns.G(kotlinTypeD) || KotlinBuiltIns.D(kotlinTypeD, StandardNames.FqNames.g)) && javaFieldC.isFinal() && javaFieldC.P()) {
                    javaFieldC.L();
                }
                EmptyList emptyList = EmptyList.b;
                javaPropertyDescriptorQ0.P0(kotlinTypeD, emptyList, lazyJavaScope.p(), null, emptyList);
                KotlinType kotlinTypeA = javaPropertyDescriptorQ0.a();
                if (kotlinTypeA == null) {
                    DescriptorUtils.a(67);
                    throw null;
                }
                int i3 = DescriptorUtils.a;
                if (!javaPropertyDescriptorQ0.n && !KotlinTypeKt.a(kotlinTypeA)) {
                    if (TypeUtils.b(kotlinTypeA)) {
                        javaPropertyDescriptorQ0.J0(null, new r(lazyJavaScope, javaFieldC, javaPropertyDescriptorQ0, i2));
                    } else {
                        KotlinBuiltIns kotlinBuiltInsE = DescriptorUtilsKt.e(javaPropertyDescriptorQ0);
                        if (!KotlinBuiltIns.G(kotlinTypeA)) {
                            NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = KotlinTypeChecker.a;
                            if (newKotlinTypeCheckerImpl.b(kotlinBuiltInsE.u(), kotlinTypeA) || newKotlinTypeCheckerImpl.b(kotlinBuiltInsE.j("Number").n(), kotlinTypeA) || newKotlinTypeCheckerImpl.b(kotlinBuiltInsE.e(), kotlinTypeA) || UnsignedTypes.a(kotlinTypeA)) {
                            }
                        }
                    }
                }
                javaResolverComponents.g.a(javaFieldC, javaPropertyDescriptorQ0);
                return javaPropertyDescriptorQ0;
            case 1:
                return a((Name) obj);
            case 2:
                return a((Name) obj);
            default:
                Name name3 = (Name) obj;
                Intrinsics.f(name3, "name");
                ArrayList arrayList = new ArrayList();
                CollectionsKt.a(arrayList, lazyJavaScope.g.invoke(name3));
                lazyJavaScope.n(arrayList, name3);
                if (DescriptorUtils.o(lazyJavaScope.q(), ClassKind.m)) {
                    return fa.g.K3(arrayList);
                }
                LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaScope.b;
                return fa.g.K3(lazyJavaResolverContext2.a.r.c(lazyJavaResolverContext2, arrayList));
        }
    }
}