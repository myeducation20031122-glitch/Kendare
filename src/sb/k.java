package sb;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class k extends Lambda implements Function0 {
    public final /* synthetic */ TypeDeserializer b;
    public final /* synthetic */ ProtoBuf.Type e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        super(0);
        this.b = typeDeserializer;
        this.e = type;
    }

    public final Object invoke() {
        DeserializationContext deserializationContext = this.b.a;
        return deserializationContext.a.e.h(this.e, deserializationContext.b);
    }
}