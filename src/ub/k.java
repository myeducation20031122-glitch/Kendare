package ub;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final /* synthetic */ class k extends FunctionReference implements Function1 {
    public final String getName() {
        return "simpleType";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.a.b(Intrinsics.Kotlin.class);
    }

    public final String getSignature() {
        return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    public final Object invoke(Object obj) {
        ProtoBuf.Type type = (ProtoBuf.Type) obj;
        Intrinsics.f(type, "p0");
        return ((TypeDeserializer) ((CallableReference) this).receiver).d(type, true);
    }
}