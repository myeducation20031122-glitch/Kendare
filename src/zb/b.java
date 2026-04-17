package zb;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b {
    public final TypeParameterDescriptor a;
    public final KotlinType b;
    public final KotlinType c;

    public b(TypeParameterDescriptor typeParameterDescriptor, KotlinType kotlinType, KotlinType kotlinType2) {
        Intrinsics.f(typeParameterDescriptor, "typeParameter");
        Intrinsics.f(kotlinType, "inProjection");
        Intrinsics.f(kotlinType2, "outProjection");
        this.a = typeParameterDescriptor;
        this.b = kotlinType;
        this.c = kotlinType2;
    }
}