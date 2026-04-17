package za;

import fa.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a extends Lambda implements Function1 {
    public static final a b = new a(1);

    public final Object invoke(Object obj) {
        Annotations annotations = (Annotations) obj;
        Intrinsics.f(annotations, "it");
        return g.k3(annotations);
    }
}