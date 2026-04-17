package ub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class d extends DeserializedMemberScope {
    public final KotlinTypeRefiner g;
    public final NotNullLazyValue h;
    public final NotNullLazyValue i;
    public final /* synthetic */ DeserializedClassDescriptor j;

    public d(DeserializedClassDescriptor deserializedClassDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.j = deserializedClassDescriptor;
        DeserializationContext deserializationContext = deserializedClassDescriptor.P;
        ProtoBuf.Class r0 = deserializedClassDescriptor.n;
        List list = r0.T;
        Intrinsics.e(list, "classProto.functionList");
        List list2 = r0.U;
        Intrinsics.e(list2, "classProto.propertyList");
        List list3 = r0.V;
        Intrinsics.e(list3, "classProto.typeAliasList");
        List list4 = r0.N;
        Intrinsics.e(list4, "classProto.nestedClassNameList");
        List list5 = list4;
        NameResolver nameResolver = deserializedClassDescriptor.P.b;
        ArrayList arrayList = new ArrayList(fa.d.f3(list5));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(NameResolverUtilKt.b(nameResolver, ((Number) it.next()).intValue()));
        }
        super(deserializationContext, list, list2, list3, new a(0, arrayList));
        this.g = kotlinTypeRefiner;
        this.h = this.b.a.a.a(new b(this));
        this.i = this.b.a.a.a(new c(this, 0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection a(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        s(name, noLookupLocation);
        return super.a(name, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection d(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        s(name, noLookupLocation);
        return super.d(name, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection e(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        Intrinsics.f(descriptorKindFilter, "kindFilter");
        Intrinsics.f(function1, "nameFilter");
        return (Collection) this.h.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, NoLookupLocation noLookupLocation) {
        ClassDescriptor classDescriptor;
        Intrinsics.f(name, "name");
        s(name, noLookupLocation);
        h hVar = this.j.T;
        return (hVar == null || (classDescriptor = (ClassDescriptor) hVar.b.invoke(name)) == null) ? super.f(name, noLookupLocation) : classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final void h(ArrayList arrayList, Function1 function1) {
        ArrayList arrayList2;
        Intrinsics.f(function1, "nameFilter");
        h hVar = this.j.T;
        if (hVar != null) {
            Set<Name> setKeySet = hVar.a.keySet();
            arrayList2 = new ArrayList();
            for (Name name : setKeySet) {
                Intrinsics.f(name, "name");
                ClassDescriptor classDescriptor = (ClassDescriptor) hVar.b.invoke(name);
                if (classDescriptor != null) {
                    arrayList2.add(classDescriptor);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            arrayList2 = EmptyList.b;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final void j(Name name, ArrayList arrayList) {
        Intrinsics.f(name, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((KotlinType) it.next()).t().a(name, NoLookupLocation.f));
        }
        DeserializationContext deserializationContext = this.b;
        arrayList.addAll(deserializationContext.a.n.e(name, this.j));
        deserializationContext.a.q.a().h(name, arrayList2, new ArrayList(arrayList), this.j, new DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1(arrayList));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final void k(Name name, ArrayList arrayList) {
        Intrinsics.f(name, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((KotlinType) it.next()).t().d(name, NoLookupLocation.f));
        }
        this.b.a.q.a().h(name, arrayList2, new ArrayList(arrayList), this.j, new DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1(arrayList));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final ClassId l(Name name) {
        Intrinsics.f(name, "name");
        return this.j.w.d(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set n() {
        List listG = this.j.R.g();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            Set setG = ((KotlinType) it.next()).t().g();
            if (setG == null) {
                return null;
            }
            fa.f.j3(setG, linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set o() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.j;
        List listG = deserializedClassDescriptor.R.g();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            fa.f.j3(((KotlinType) it.next()).t().b(), linkedHashSet);
        }
        linkedHashSet.addAll(this.b.a.n.b(deserializedClassDescriptor));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set p() {
        List listG = this.j.R.g();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            fa.f.j3(((KotlinType) it.next()).t().c(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final boolean r(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor) {
        return this.b.a.o.c(this.j, deserializedSimpleFunctionDescriptor);
    }

    public final void s(Name name, LookupLocation lookupLocation) {
        Intrinsics.f(name, "name");
        UtilsKt.a(this.b.a.i, (NoLookupLocation) lookupLocation, this.j, name);
    }
}