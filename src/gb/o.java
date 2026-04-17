package gb;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class o extends Lambda implements Function0 {
    public final /* synthetic */ LazyJavaScope b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(LazyJavaScope lazyJavaScope) {
        super(0);
        this.b = lazyJavaScope;
    }

    public final Object invoke() {
        DescriptorKindFilter descriptorKindFilter = DescriptorKindFilter.l;
        MemberScope.a.getClass();
        kotlin.reflect.jvm.internal.impl.resolve.scopes.b bVar = MemberScope.Companion.b;
        LazyJavaScope lazyJavaScope = this.b;
        lazyJavaScope.getClass();
        Intrinsics.f(descriptorKindFilter, "kindFilter");
        Intrinsics.f(bVar, "nameFilter");
        NoLookupLocation noLookupLocation = NoLookupLocation.j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DescriptorKindFilter.c.getClass();
        if (descriptorKindFilter.a(DescriptorKindFilter.k)) {
            for (Name name : lazyJavaScope.h(descriptorKindFilter, bVar)) {
                if (((Boolean) bVar.invoke(name)).booleanValue()) {
                    CollectionsKt.a(linkedHashSet, lazyJavaScope.f(name, noLookupLocation));
                }
            }
        }
        DescriptorKindFilter.c.getClass();
        boolean zA = descriptorKindFilter.a(DescriptorKindFilter.h);
        List list = descriptorKindFilter.a;
        if (zA && !list.contains(DescriptorKindExclude.NonExtensions.a)) {
            for (Name name2 : lazyJavaScope.i(descriptorKindFilter, bVar)) {
                if (((Boolean) bVar.invoke(name2)).booleanValue()) {
                    linkedHashSet.addAll(lazyJavaScope.a(name2, noLookupLocation));
                }
            }
        }
        DescriptorKindFilter.c.getClass();
        if (descriptorKindFilter.a(DescriptorKindFilter.i) && !list.contains(DescriptorKindExclude.NonExtensions.a)) {
            for (Name name3 : lazyJavaScope.o(descriptorKindFilter)) {
                if (((Boolean) bVar.invoke(name3)).booleanValue()) {
                    linkedHashSet.addAll(lazyJavaScope.d(name3, noLookupLocation));
                }
            }
        }
        return fa.g.K3(linkedHashSet);
    }
}