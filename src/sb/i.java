package sb;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class i extends Lambda implements Function0 {
    public final /* synthetic */ MemberDeserializer b;
    public final /* synthetic */ ProtoContainer e;
    public final /* synthetic */ MessageLite f;
    public final /* synthetic */ AnnotatedCallableKind j;
    public final /* synthetic */ int m;
    public final /* synthetic */ ProtoBuf.ValueParameter n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
        super(0);
        this.b = memberDeserializer;
        this.e = protoContainer;
        this.f = messageLite;
        this.j = annotatedCallableKind;
        this.m = i;
        this.n = valueParameter;
    }

    public final Object invoke() {
        return fa.g.K3(this.b.a.a.e.e(this.e, this.f, this.j, this.m, this.n));
    }
}