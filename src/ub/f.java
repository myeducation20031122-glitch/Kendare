package ub;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class f extends Lambda implements Function0 {
    public final /* synthetic */ DeserializedClassDescriptor b;
    public final /* synthetic */ ProtoBuf.EnumEntry e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DeserializedClassDescriptor deserializedClassDescriptor, ProtoBuf.EnumEntry enumEntry) {
        super(0);
        this.b = deserializedClassDescriptor;
        this.e = enumEntry;
    }

    public final Object invoke() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.b;
        return fa.g.K3(deserializedClassDescriptor.P.a.e.b(deserializedClassDescriptor.a0, this.e));
    }
}