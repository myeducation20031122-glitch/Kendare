package gb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class v extends Lambda implements Function1 {
    public static final v b = new v(1);

    public final Object invoke(Object obj) {
        MemberScope memberScope = (MemberScope) obj;
        Intrinsics.f(memberScope, "it");
        return memberScope.c();
    }
}