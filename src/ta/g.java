package ta;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class g extends Lambda implements Function2 {
    public static final g b = new g(2);

    public final Object invoke(Object obj, Object obj2) {
        Integer numB = DescriptorVisibilities.b((DescriptorVisibility) obj, (DescriptorVisibility) obj2);
        return Integer.valueOf(numB == null ? 0 : numB.intValue());
    }
}