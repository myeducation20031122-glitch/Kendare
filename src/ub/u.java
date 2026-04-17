package ub;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.MemberComparator;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import okio.internal.BufferKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class u implements r {
    public static final /* synthetic */ KProperty[] j;
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final Map c;
    public final MemoizedFunctionToNotNull d;
    public final MemoizedFunctionToNotNull e;
    public final MemoizedFunctionToNullable f;
    public final NotNullLazyValue g;
    public final NotNullLazyValue h;
    public final /* synthetic */ DeserializedMemberScope i;

    static {
        ReflectionFactory reflectionFactory = Reflection.a;
        j = new KProperty[]{reflectionFactory.h(new PropertyReference1Impl(reflectionFactory.b(u.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), reflectionFactory.h(new PropertyReference1Impl(reflectionFactory.b(u.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
    }

    public u(DeserializedMemberScope deserializedMemberScope, List list, List list2, List list3) {
        this.i = deserializedMemberScope;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Name nameB = NameResolverUtilKt.b(deserializedMemberScope.b.b, ((ProtoBuf.Function) ((MessageLite) obj)).n);
            Object arrayList = linkedHashMap.get(nameB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(nameB, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.a = h(linkedHashMap);
        DeserializedMemberScope deserializedMemberScope2 = this.i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            Name nameB2 = NameResolverUtilKt.b(deserializedMemberScope2.b.b, ((ProtoBuf.Property) ((MessageLite) obj2)).n);
            Object arrayList2 = linkedHashMap2.get(nameB2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(nameB2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.b = h(linkedHashMap2);
        this.i.b.a.c.d();
        DeserializedMemberScope deserializedMemberScope3 = this.i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            Name nameB3 = NameResolverUtilKt.b(deserializedMemberScope3.b.b, ((ProtoBuf.TypeAlias) ((MessageLite) obj3)).m);
            Object arrayList3 = linkedHashMap3.get(nameB3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(nameB3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.c = h(linkedHashMap3);
        this.d = this.i.b.a.a.f(new t(this, 0));
        this.e = this.i.b.a.a.f(new t(this, 1));
        this.f = this.i.b.a.a.h(new t(this, 2));
        DeserializedMemberScope deserializedMemberScope4 = this.i;
        this.g = deserializedMemberScope4.b.a.a.a(new s(this, deserializedMemberScope4, 0));
        DeserializedMemberScope deserializedMemberScope5 = this.i;
        this.h = deserializedMemberScope5.b.a.a.a(new s(this, deserializedMemberScope5, 1));
    }

    public static LinkedHashMap h(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(com.bumptech.glide.e.w(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<AbstractMessageLite> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(fa.d.f3(iterable));
            for (AbstractMessageLite abstractMessageLite : iterable) {
                int iB = abstractMessageLite.b();
                int iF = CodedOutputStream.f(iB) + iB;
                if (iF > 4096) {
                    iF = BufferKt.SEGMENTING_THRESHOLD;
                }
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(byteArrayOutputStream, iF);
                codedOutputStreamJ.v(iB);
                abstractMessageLite.e(codedOutputStreamJ);
                codedOutputStreamJ.i();
                arrayList.add(Unit.a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }

    @Override // ub.r
    public final Collection a(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        return !b().contains(name) ? EmptyList.b : (Collection) this.d.invoke(name);
    }

    @Override // ub.r
    public final Set b() {
        return (Set) StorageKt.a(this.g, j[0]);
    }

    @Override // ub.r
    public final Set c() {
        return (Set) StorageKt.a(this.h, j[1]);
    }

    @Override // ub.r
    public final Collection d(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        return !c().contains(name) ? EmptyList.b : (Collection) this.e.invoke(name);
    }

    @Override // ub.r
    public final void e(ArrayList arrayList, DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        NoLookupLocation noLookupLocation = NoLookupLocation.j;
        Intrinsics.f(descriptorKindFilter, "kindFilter");
        Intrinsics.f(function1, "nameFilter");
        DescriptorKindFilter.c.getClass();
        if (descriptorKindFilter.a(DescriptorKindFilter.i)) {
            Set<Name> setC = c();
            ArrayList arrayList2 = new ArrayList();
            for (Name name : setC) {
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    arrayList2.addAll(d(name, noLookupLocation));
                }
            }
            MemberComparator.NameAndTypeMemberComparator nameAndTypeMemberComparator = MemberComparator.NameAndTypeMemberComparator.b;
            Intrinsics.e(nameAndTypeMemberComparator, "INSTANCE");
            fa.e.g3(arrayList2, nameAndTypeMemberComparator);
            arrayList.addAll(arrayList2);
        }
        DescriptorKindFilter.c.getClass();
        if (descriptorKindFilter.a(DescriptorKindFilter.h)) {
            Set<Name> setB = b();
            ArrayList arrayList3 = new ArrayList();
            for (Name name2 : setB) {
                if (((Boolean) function1.invoke(name2)).booleanValue()) {
                    arrayList3.addAll(a(name2, noLookupLocation));
                }
            }
            MemberComparator.NameAndTypeMemberComparator nameAndTypeMemberComparator2 = MemberComparator.NameAndTypeMemberComparator.b;
            Intrinsics.e(nameAndTypeMemberComparator2, "INSTANCE");
            fa.e.g3(arrayList3, nameAndTypeMemberComparator2);
            arrayList.addAll(arrayList3);
        }
    }

    @Override // ub.r
    public final Set f() {
        return this.c.keySet();
    }

    @Override // ub.r
    public final TypeAliasDescriptor g(Name name) {
        Intrinsics.f(name, "name");
        return (TypeAliasDescriptor) this.f.invoke(name);
    }
}