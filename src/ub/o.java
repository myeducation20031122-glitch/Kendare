package ub;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class o extends Lambda implements Function0 {
    public final /* synthetic */ DeserializedClassDescriptor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.b = deserializedClassDescriptor;
    }

    public final Object invoke() {
        Object next;
        ya.b bVar;
        DeserializedClassDescriptor deserializedClassDescriptor = this.b;
        if (!deserializedClassDescriptor.O.c()) {
            List list = deserializedClassDescriptor.n.S;
            Intrinsics.e(list, "classProto.constructorList");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!Flags.m.c(((ProtoBuf.Constructor) next).j).booleanValue()) {
                    break;
                }
            }
            ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) next;
            return constructor != null ? deserializedClassDescriptor.P.i.d(constructor, true) : null;
        }
        ya.h hVar = SourceElement.a;
        Annotations.A.getClass();
        ob.c cVar = new ob.c(deserializedClassDescriptor, null, Annotations.Companion.b, true, CallableMemberDescriptor.Kind.b, hVar);
        List listEmptyList = Collections.emptyList();
        int i = DescriptorUtils.a;
        ClassKind classKind = ClassKind.f;
        ClassKind classKind2 = deserializedClassDescriptor.O;
        if (classKind2 == classKind || classKind2.c()) {
            bVar = DescriptorVisibilities.a;
            if (bVar == null) {
                DescriptorUtils.a(49);
                throw null;
            }
        } else if (DescriptorUtils.r(deserializedClassDescriptor)) {
            bVar = DescriptorVisibilities.a;
            if (bVar == null) {
                DescriptorUtils.a(51);
                throw null;
            }
        } else if (DescriptorUtils.l(deserializedClassDescriptor)) {
            bVar = DescriptorVisibilities.j;
            if (bVar == null) {
                DescriptorUtils.a(52);
                throw null;
            }
        } else {
            bVar = DescriptorVisibilities.e;
            if (bVar == null) {
                DescriptorUtils.a(53);
                throw null;
            }
        }
        cVar.U0(listEmptyList, bVar);
        cVar.R0(deserializedClassDescriptor.n());
        return cVar;
    }
}