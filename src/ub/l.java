package ub;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final /* synthetic */ class l extends FunctionReference implements Function1 {
    public final String getName() {
        return "getValueClassPropertyType";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.a.b(DeserializedClassDescriptor.class);
    }

    public final String getSignature() {
        return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    public final Object invoke(Object obj) {
        Name name = (Name) obj;
        Intrinsics.f(name, "p0");
        DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) ((CallableReference) this).receiver;
        int i = DeserializedClassDescriptor.c0;
        return deserializedClassDescriptor.K0(name);
    }
}