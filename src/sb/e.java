package sb;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class e extends Lambda implements Function0 {
    public final /* synthetic */ MemberDeserializer b;
    public final /* synthetic */ ProtoBuf.Property e;
    public final /* synthetic */ DeserializedPropertyDescriptor f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        super(0);
        this.b = memberDeserializer;
        this.e = property;
        this.f = deserializedPropertyDescriptor;
    }

    public final Object invoke() {
        MemberDeserializer memberDeserializer = this.b;
        ProtoContainer protoContainerA = memberDeserializer.a(memberDeserializer.a.c);
        Intrinsics.c(protoContainerA);
        AnnotationAndConstantLoader annotationAndConstantLoader = memberDeserializer.a.a.e;
        KotlinType returnType = this.f.getReturnType();
        Intrinsics.e(returnType, "property.returnType");
        return (ConstantValue) annotationAndConstantLoader.j(protoContainerA, this.e, returnType);
    }
}