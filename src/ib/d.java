package ib;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class d extends Lambda implements Function1 {
    public static final d b = new d(1);

    public final Object invoke(Object obj) {
        ClassifierDescriptor classifierDescriptorC = ((UnwrappedType) obj).L0().c();
        if (classifierDescriptorC == null) {
            return Boolean.FALSE;
        }
        Name name = classifierDescriptorC.getName();
        JavaToKotlinClassMap.a.getClass();
        FqName fqName = JavaToKotlinClassMap.g;
        return Boolean.valueOf(Intrinsics.a(name, fqName.f()) && Intrinsics.a(DescriptorUtilsKt.c(classifierDescriptorC), fqName));
    }
}