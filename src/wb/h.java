package wb;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class h extends DelegatingSimpleTypeImpl {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SimpleType simpleType, int i) {
        super(simpleType);
        this.f = i;
        if (i != 1) {
            Intrinsics.f(simpleType, "delegate");
        } else {
            Intrinsics.f(simpleType, "delegate");
            super(simpleType);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean M0() {
        switch (this.f) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType W0(SimpleType simpleType) {
        switch (this.f) {
            case 0:
                return new h(simpleType, 0);
            default:
                return new h(simpleType, 1);
        }
    }
}