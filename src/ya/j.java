package ya;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class j extends Lambda implements Function1 {
    public static final j b = new j(1);

    public final Object invoke(Object obj) {
        Intrinsics.f((DeclarationDescriptor) obj, "it");
        return Boolean.valueOf(!(r2 instanceof ConstructorDescriptor));
    }
}