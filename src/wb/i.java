package wb;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class i extends DelegatingSimpleTypeImpl {
    public final TypeAttributes f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SimpleType simpleType, TypeAttributes typeAttributes) {
        super(simpleType);
        Intrinsics.f(simpleType, "delegate");
        Intrinsics.f(typeAttributes, "attributes");
        this.f = typeAttributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes K0() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType W0(SimpleType simpleType) {
        return new i(simpleType, this.f);
    }
}