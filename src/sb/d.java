package sb;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class d extends Lambda implements Function0 {
    public final /* synthetic */ MemberDeserializer b;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ProtoBuf.Property f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MemberDeserializer memberDeserializer, boolean z, ProtoBuf.Property property) {
        super(0);
        this.b = memberDeserializer;
        this.e = z;
        this.f = property;
    }

    public final Object invoke() {
        List listK3;
        MemberDeserializer memberDeserializer = this.b;
        ProtoContainer protoContainerA = memberDeserializer.a(memberDeserializer.a.c);
        if (protoContainerA != null) {
            DeserializationContext deserializationContext = memberDeserializer.a;
            boolean z = this.e;
            ProtoBuf.Property property = this.f;
            listK3 = fa.g.K3(z ? deserializationContext.a.e.f(protoContainerA, property) : deserializationContext.a.e.c(protoContainerA, property));
        } else {
            listK3 = null;
        }
        return listK3 == null ? EmptyList.b : listK3;
    }
}