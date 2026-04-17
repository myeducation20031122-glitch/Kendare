package ub;

import com.bumptech.glide.d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class p extends Lambda implements Function0 {
    public final /* synthetic */ DeserializedClassDescriptor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.b = deserializedClassDescriptor;
    }

    public final Object invoke() {
        int i = DeserializedClassDescriptor.c0;
        DeserializedClassDescriptor deserializedClassDescriptor = this.b;
        deserializedClassDescriptor.getClass();
        Modality modality = Modality.f;
        Modality modality2 = deserializedClassDescriptor.M;
        if (modality2 != modality) {
            return EmptyList.b;
        }
        List<Integer> list = deserializedClassDescriptor.n.X;
        Intrinsics.e(list, "fqNames");
        if (!(!list.isEmpty())) {
            CliSealedClassInheritorsProvider.a.getClass();
            if (modality2 != modality) {
                return EmptyList.b;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeclarationDescriptor declarationDescriptor = deserializedClassDescriptor.U;
            if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                CliSealedClassInheritorsProvider.a(deserializedClassDescriptor, linkedHashSet, ((PackageFragmentDescriptor) declarationDescriptor).t(), false);
            }
            MemberScope memberScopeM0 = deserializedClassDescriptor.m0();
            Intrinsics.e(memberScopeM0, "sealedClass.unsubstitutedInnerClassesScope");
            CliSealedClassInheritorsProvider.a(deserializedClassDescriptor, linkedHashSet, memberScopeM0, true);
            return fa.g.I3(new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider$computeSealedSubclasses$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return d.f(DescriptorUtilsKt.g((ClassDescriptor) obj).b(), DescriptorUtilsKt.g((ClassDescriptor) obj2).b());
                }
            }, linkedHashSet);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            DeserializationContext deserializationContext = deserializedClassDescriptor.P;
            DeserializationComponents deserializationComponents = deserializationContext.a;
            Intrinsics.e(num, "index");
            ClassDescriptor classDescriptorB = deserializationComponents.b(NameResolverUtilKt.a(deserializationContext.b, num.intValue()));
            if (classDescriptorB != null) {
                arrayList.add(classDescriptorB);
            }
        }
        return arrayList;
    }
}