package gb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class u extends Lambda implements Function1 {
    public static final u b = new u(1);

    public final Object invoke(Object obj) {
        JavaMember javaMember = (JavaMember) obj;
        Intrinsics.f(javaMember, "it");
        return Boolean.valueOf(javaMember.P());
    }
}