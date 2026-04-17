package nb;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class k extends RenderingFormat {
    public k() {
        super("HTML", 1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
    public final String c(String str) {
        Intrinsics.f(str, "string");
        return ec.h.A(ec.h.A(str, "<", "&lt;"), ">", "&gt;");
    }
}