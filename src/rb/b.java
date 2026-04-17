package rb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b extends Lambda implements Function1 {
    public static final b b = new b(1);

    public final Object invoke(Object obj) {
        CallableDescriptor callableDescriptor = (CallableDescriptor) obj;
        Intrinsics.f(callableDescriptor, "$this$selectMostSpecificInEachOverridableGroup");
        return callableDescriptor;
    }
}