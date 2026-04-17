package xb;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class f extends g {
    public f() {
        super("UNKNOWN", 2);
    }

    @Override // xb.g
    public final g c(UnwrappedType unwrappedType) {
        Intrinsics.f(unwrappedType, "nextType");
        g gVarE = g.e(unwrappedType);
        return gVarE == g.e ? this : gVarE;
    }
}