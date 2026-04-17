package sb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class m extends Lambda implements Function1 {
    public final /* synthetic */ TypeDeserializer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TypeDeserializer typeDeserializer) {
        super(1);
        this.b = typeDeserializer;
    }

    public final Object invoke(Object obj) {
        ProtoBuf.Type type = (ProtoBuf.Type) obj;
        Intrinsics.f(type, "it");
        return ProtoTypeTableUtilKt.a(type, this.b.a.d);
    }
}