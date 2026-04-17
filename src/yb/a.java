package yb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a extends Lambda implements Function1 {
    public static final a b = new a(1);

    public final Object invoke(Object obj) {
        UnwrappedType unwrappedType = (UnwrappedType) obj;
        Intrinsics.f(unwrappedType, "it");
        ClassifierDescriptor classifierDescriptorC = unwrappedType.L0().c();
        boolean z = false;
        if (classifierDescriptorC != null && (classifierDescriptorC instanceof TypeParameterDescriptor) && (((TypeParameterDescriptor) classifierDescriptorC).e() instanceof TypeAliasDescriptor)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}