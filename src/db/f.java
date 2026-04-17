package db;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class f extends Lambda implements Function1 {
    public static final f b = new f(1);

    public final Object invoke(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        Intrinsics.f(callableMemberDescriptor, "it");
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) callableMemberDescriptor;
        BuiltinMethodsWithDifferentJvmName.m.getClass();
        return Boolean.valueOf(KotlinBuiltIns.z(simpleFunctionDescriptor) && DescriptorUtilsKt.b(simpleFunctionDescriptor, new kotlin.reflect.jvm.internal.impl.load.java.a(simpleFunctionDescriptor)) != null);
    }
}