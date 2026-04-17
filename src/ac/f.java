package ac;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.OperatorChecks;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class f extends Lambda implements Function1 {
    public static final f b = new f(1);

    public final Object invoke(Object obj) {
        ClassId classIdF;
        KotlinType returnType;
        FunctionDescriptor functionDescriptor = (FunctionDescriptor) obj;
        Intrinsics.f(functionDescriptor, "$this$$receiver");
        ReceiverParameterDescriptor receiverParameterDescriptorC = functionDescriptor.C();
        if (receiverParameterDescriptorC == null) {
            receiverParameterDescriptorC = functionDescriptor.L();
        }
        OperatorChecks operatorChecks = OperatorChecks.a;
        if (receiverParameterDescriptorC != null) {
            KotlinType returnType2 = functionDescriptor.getReturnType();
            if (returnType2 != null) {
                KotlinType kotlinTypeA = receiverParameterDescriptorC.a();
                Intrinsics.e(kotlinTypeA, "receiver.type");
                if (TypeUtilsKt.h(returnType2, kotlinTypeA)) {
                    return null;
                }
            }
            operatorChecks.getClass();
            ReceiverValue value = receiverParameterDescriptorC.getValue();
            Intrinsics.e(value, "receiver.value");
            if (value instanceof ImplicitClassReceiver) {
                ClassDescriptor classDescriptor = ((ImplicitClassReceiver) value).b;
                if (classDescriptor.f0() && (classIdF = DescriptorUtilsKt.f(classDescriptor)) != null) {
                    ClassifierDescriptor classifierDescriptorB = FindClassInModuleKt.b(DescriptorUtilsKt.j(classDescriptor), classIdF);
                    TypeAliasDescriptor typeAliasDescriptor = classifierDescriptorB instanceof TypeAliasDescriptor ? (TypeAliasDescriptor) classifierDescriptorB : null;
                    if (typeAliasDescriptor != null && (returnType = functionDescriptor.getReturnType()) != null && TypeUtilsKt.h(returnType, typeAliasDescriptor.y0())) {
                        return null;
                    }
                }
            }
        }
        return "receiver must be a supertype of the return type";
    }
}