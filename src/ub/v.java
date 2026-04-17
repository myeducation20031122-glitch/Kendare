package ub;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class v extends Lambda implements Function0 {
    public final /* synthetic */ DeserializedTypeParameterDescriptor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor) {
        super(0);
        this.b = deserializedTypeParameterDescriptor;
    }

    public final Object invoke() {
        DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor = this.b;
        DeserializationContext deserializationContext = deserializedTypeParameterDescriptor.N;
        return fa.g.K3(deserializationContext.a.e.a(deserializedTypeParameterDescriptor.O, deserializationContext.b));
    }
}