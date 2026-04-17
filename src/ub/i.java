package ub;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class i extends Lambda implements Function0 {
    public final /* synthetic */ DeserializedClassDescriptor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.b = deserializedClassDescriptor;
    }

    public final Object invoke() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.b;
        return fa.g.K3(deserializedClassDescriptor.P.a.e.g(deserializedClassDescriptor.a0));
    }
}