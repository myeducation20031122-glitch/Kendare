package pb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a extends Lambda implements Function1 {
    public static final a b = new a(1);

    public final Object invoke(Object obj) {
        KotlinType kotlinType = (KotlinType) obj;
        Intrinsics.f(kotlinType, "it");
        return kotlinType.toString();
    }
}