package ib;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class e extends Lambda implements Function1 {
    public static final e b = new e(1);

    public final Object invoke(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        Intrinsics.f(callableMemberDescriptor, "it");
        ReceiverParameterDescriptor receiverParameterDescriptorL = callableMemberDescriptor.L();
        Intrinsics.c(receiverParameterDescriptorL);
        KotlinType kotlinTypeA = receiverParameterDescriptorL.a();
        Intrinsics.e(kotlinTypeA, "it.extensionReceiverParameter!!.type");
        return kotlinTypeA;
    }
}