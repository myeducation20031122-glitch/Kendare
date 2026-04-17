package hb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b extends Lambda implements Function1 {
    public final /* synthetic */ ClassDescriptor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ClassDescriptor classDescriptor, JavaTypeAttributes javaTypeAttributes, RawSubstitution rawSubstitution, SimpleType simpleType) {
        super(1);
        this.b = classDescriptor;
    }

    public final Object invoke(Object obj) {
        ClassId classIdF;
        KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        ClassDescriptor classDescriptor = this.b;
        if (!(classDescriptor instanceof ClassDescriptor)) {
            classDescriptor = null;
        }
        if (classDescriptor != null && (classIdF = DescriptorUtilsKt.f(classDescriptor)) != null) {
            kotlinTypeRefiner.b(classIdF);
        }
        return null;
    }
}