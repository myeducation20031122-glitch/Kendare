package sb;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class f extends Lambda implements Function0 {
    public final /* synthetic */ MemberDeserializer b;
    public final /* synthetic */ ProtoBuf.Property e;
    public final /* synthetic */ DeserializedPropertyDescriptor f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        super(0);
        this.b = memberDeserializer;
        this.e = property;
        this.f = deserializedPropertyDescriptor;
    }

    public final Object invoke() {
        MemberDeserializer memberDeserializer = this.b;
        return memberDeserializer.a.a.a.c(new e(memberDeserializer, this.e, this.f));
    }
}