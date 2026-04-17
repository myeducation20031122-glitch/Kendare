package xb;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class e extends g {
    public e() {
        super("START", 0);
    }

    @Override // xb.g
    public final g c(UnwrappedType unwrappedType) {
        Intrinsics.f(unwrappedType, "nextType");
        return g.e(unwrappedType);
    }
}