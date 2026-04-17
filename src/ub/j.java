package ub;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class j extends Lambda implements Function0 {
    public final /* synthetic */ DeserializedClassDescriptor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.b = deserializedClassDescriptor;
    }

    public final Object invoke() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.b;
        ProtoBuf.Class r1 = deserializedClassDescriptor.n;
        if (!((r1.f & 4) == 4)) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorF = deserializedClassDescriptor.J0().f(NameResolverUtilKt.b(deserializedClassDescriptor.P.b, r1.n), NoLookupLocation.t);
        if (classifierDescriptorF instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorF;
        }
        return null;
    }
}