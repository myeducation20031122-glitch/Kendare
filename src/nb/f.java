package nb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class f extends Lambda implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ DescriptorRendererImpl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(DescriptorRendererImpl descriptorRendererImpl, int i) {
        super(1);
        this.b = i;
        this.e = descriptorRendererImpl;
    }

    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        int i = this.b;
        DescriptorRendererImpl descriptorRendererImpl = this.e;
        switch (i) {
            case 0:
                TypeProjection typeProjection = (TypeProjection) obj;
                Intrinsics.f(typeProjection, "it");
                if (typeProjection.d()) {
                    return "*";
                }
                KotlinType kotlinTypeA = typeProjection.a();
                Intrinsics.e(kotlinTypeA, "it.type");
                String strU = descriptorRendererImpl.u(kotlinTypeA);
                if (typeProjection.b() == Variance.INVARIANT) {
                    return strU;
                }
                return typeProjection.b() + ' ' + strU;
            case 1:
                ConstantValue constantValue = (ConstantValue) obj;
                Intrinsics.f(constantValue, "it");
                int i2 = DescriptorRendererImpl.g;
                return descriptorRendererImpl.I(constantValue);
            default:
                KotlinType kotlinType = (KotlinType) obj;
                Intrinsics.e(kotlinType, "it");
                return descriptorRendererImpl.u(kotlinType);
        }
    }
}