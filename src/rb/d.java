package rb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class d extends Lambda implements Function1 {
    public static final d b = new d(1);

    public final Object invoke(Object obj) {
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) obj;
        Intrinsics.f(propertyDescriptor, "$this$selectMostSpecificInEachOverridableGroup");
        return propertyDescriptor;
    }
}