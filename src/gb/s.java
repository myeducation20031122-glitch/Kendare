package gb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class s extends Lambda implements Function1 {
    public static final s b = new s(1);

    public final Object invoke(Object obj) {
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
        Intrinsics.f(simpleFunctionDescriptor, "$this$selectMostSpecificInEachOverridableGroup");
        return simpleFunctionDescriptor;
    }
}