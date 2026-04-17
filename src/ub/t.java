package ub;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class t extends Lambda implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ u e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, int i) {
        super(1);
        this.b = i;
        this.e = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection a(Name name) {
        List<ProtoBuf.Function> list;
        List<ProtoBuf.Property> list2;
        int i = this.b;
        u uVar = this.e;
        switch (i) {
            case 0:
                Intrinsics.f(name, "it");
                LinkedHashMap linkedHashMap = uVar.a;
                final kotlin.reflect.jvm.internal.impl.metadata.j jVar = ProtoBuf.Function.Y;
                Intrinsics.e(jVar, "PARSER");
                byte[] bArr = (byte[]) linkedHashMap.get(name);
                final DeserializedMemberScope deserializedMemberScope = uVar.i;
                if (bArr != null) {
                    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    Function0 function0 = new Function0() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        public final Object invoke() {
                            return jVar.a(byteArrayInputStream, deserializedMemberScope.b.a.p);
                        }
                    };
                    Sequence bVar = new cc.b(function0, new k9.c(function0, 23));
                    if (!(bVar instanceof ConstrainedOnceSequence)) {
                        bVar = new ConstrainedOnceSequence(bVar);
                    }
                    List listY = SequencesKt.y(bVar);
                    list = listY != null ? listY : EmptyList.b;
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (ProtoBuf.Function function : list) {
                    MemberDeserializer memberDeserializer = deserializedMemberScope.b.i;
                    Intrinsics.e(function, "it");
                    DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptorE = memberDeserializer.e(function);
                    if (!deserializedMemberScope.r(deserializedSimpleFunctionDescriptorE)) {
                        deserializedSimpleFunctionDescriptorE = null;
                    }
                    if (deserializedSimpleFunctionDescriptorE != null) {
                        arrayList.add(deserializedSimpleFunctionDescriptorE);
                    }
                }
                deserializedMemberScope.j(name, arrayList);
                return CollectionsKt.b(arrayList);
            default:
                Intrinsics.f(name, "it");
                LinkedHashMap linkedHashMap2 = uVar.b;
                final kotlin.reflect.jvm.internal.impl.metadata.m mVar = ProtoBuf.Property.Y;
                Intrinsics.e(mVar, "PARSER");
                byte[] bArr2 = (byte[]) linkedHashMap2.get(name);
                final DeserializedMemberScope deserializedMemberScope2 = uVar.i;
                if (bArr2 != null) {
                    final ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr2);
                    Function0 function02 = new Function0() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        public final Object invoke() {
                            return mVar.a(byteArrayInputStream2, deserializedMemberScope2.b.a.p);
                        }
                    };
                    Sequence bVar2 = new cc.b(function02, new k9.c(function02, 23));
                    if (!(bVar2 instanceof ConstrainedOnceSequence)) {
                        bVar2 = new ConstrainedOnceSequence(bVar2);
                    }
                    List listY2 = SequencesKt.y(bVar2);
                    list2 = listY2 != null ? listY2 : EmptyList.b;
                }
                ArrayList arrayList2 = new ArrayList(list2.size());
                for (ProtoBuf.Property property : list2) {
                    MemberDeserializer memberDeserializer2 = deserializedMemberScope2.b.i;
                    Intrinsics.e(property, "it");
                    arrayList2.add(memberDeserializer2.f(property));
                }
                deserializedMemberScope2.k(name, arrayList2);
                return CollectionsKt.b(arrayList2);
        }
    }

    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return a((Name) obj);
            case 1:
                return a((Name) obj);
            default:
                Name name = (Name) obj;
                Intrinsics.f(name, "it");
                u uVar = this.e;
                byte[] bArr = (byte[]) uVar.c.get(name);
                if (bArr == null) {
                    return null;
                }
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                DeserializedMemberScope deserializedMemberScope = uVar.i;
                ProtoBuf.TypeAlias typeAlias = (ProtoBuf.TypeAlias) ProtoBuf.TypeAlias.S.a(byteArrayInputStream, deserializedMemberScope.b.a.p);
                if (typeAlias == null) {
                    return null;
                }
                return deserializedMemberScope.b.i.g(typeAlias);
        }
    }
}