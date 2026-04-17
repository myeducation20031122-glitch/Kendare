package ub;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class q extends Lambda implements Function0 {
    public final /* synthetic */ DeserializedClassDescriptor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.b = deserializedClassDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList] */
    public final Object invoke() {
        Object inlineClassRepresentation;
        SimpleTypeMarker simpleTypeMarker;
        ?? arrayList;
        int i = DeserializedClassDescriptor.c0;
        DeserializedClassDescriptor deserializedClassDescriptor = this.b;
        if (!deserializedClassDescriptor.isInline() && !deserializedClassDescriptor.b0()) {
            return null;
        }
        DeserializationContext deserializationContext = deserializedClassDescriptor.P;
        NameResolver nameResolver = deserializationContext.b;
        k kVar = new k(1, deserializationContext.h);
        l lVar = new l(1, deserializedClassDescriptor);
        ProtoBuf.Class r8 = deserializedClassDescriptor.n;
        Intrinsics.f(r8, "<this>");
        Intrinsics.f(nameResolver, "nameResolver");
        TypeTable typeTable = deserializationContext.d;
        Intrinsics.f(typeTable, "typeTable");
        if (r8.c0.size() > 0) {
            List list = r8.c0;
            Intrinsics.e(list, "multiFieldValueClassUnderlyingNameList");
            List<Integer> list2 = list;
            ArrayList arrayList2 = new ArrayList(fa.d.f3(list2));
            for (Integer num : list2) {
                Intrinsics.e(num, "it");
                arrayList2.add(NameResolverUtilKt.b(nameResolver, num.intValue()));
            }
            Pair pair = new Pair(Integer.valueOf(r8.f0.size()), Integer.valueOf(r8.e0.size()));
            if (Intrinsics.a(pair, new Pair(Integer.valueOf(arrayList2.size()), 0))) {
                List list3 = r8.f0;
                Intrinsics.e(list3, "multiFieldValueClassUnderlyingTypeIdList");
                List<Integer> list4 = list3;
                arrayList = new ArrayList(fa.d.f3(list4));
                for (Integer num2 : list4) {
                    Intrinsics.e(num2, "it");
                    arrayList.add(typeTable.a(num2.intValue()));
                }
            } else {
                if (!Intrinsics.a(pair, new Pair(0, Integer.valueOf(arrayList2.size())))) {
                    throw new IllegalStateException(("class " + NameResolverUtilKt.b(nameResolver, r8.m) + " has illegal multi-field value class representation").toString());
                }
                arrayList = r8.e0;
            }
            Intrinsics.e((Object) arrayList, "when (typeIdCount to typ…epresentation\")\n        }");
            Iterable iterable = (Iterable) arrayList;
            ArrayList arrayList3 = new ArrayList(fa.d.f3(iterable));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList3.add(kVar.invoke(it.next()));
            }
            inlineClassRepresentation = new MultiFieldValueClassRepresentation(fa.g.P3(arrayList2, arrayList3));
        } else if ((r8.f & 8) == 8) {
            Name nameB = NameResolverUtilKt.b(nameResolver, r8.Z);
            int i2 = r8.f;
            ProtoBuf.Type typeA = (i2 & 16) == 16 ? r8.a0 : (i2 & 32) == 32 ? typeTable.a(r8.b0) : null;
            if ((typeA == null || (simpleTypeMarker = (SimpleTypeMarker) kVar.invoke(typeA)) == null) && (simpleTypeMarker = (SimpleTypeMarker) lVar.invoke(nameB)) == null) {
                throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtilKt.b(nameResolver, r8.m) + " with property " + nameB).toString());
            }
            inlineClassRepresentation = new InlineClassRepresentation(nameB, simpleTypeMarker);
        } else {
            inlineClassRepresentation = null;
        }
        if (inlineClassRepresentation != null) {
            return inlineClassRepresentation;
        }
        if (deserializedClassDescriptor.t.a(1, 5, 1)) {
            return null;
        }
        ClassConstructorDescriptor classConstructorDescriptorP0 = deserializedClassDescriptor.p0();
        if (classConstructorDescriptorP0 == null) {
            throw new IllegalStateException(("Inline class has no primary constructor: " + deserializedClassDescriptor).toString());
        }
        List listI = classConstructorDescriptorP0.i();
        Intrinsics.e(listI, "constructor.valueParameters");
        Name name = ((ValueParameterDescriptor) fa.g.q3(listI)).getName();
        Intrinsics.e(name, "constructor.valueParameters.first().name");
        SimpleType simpleTypeK0 = deserializedClassDescriptor.K0(name);
        if (simpleTypeK0 != null) {
            return new InlineClassRepresentation(name, simpleTypeK0);
        }
        throw new IllegalStateException(("Value class has no underlying property: " + deserializedClassDescriptor).toString());
    }
}