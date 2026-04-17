package jb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b extends Lambda implements Function1 {
    public static final b b = new b(1);

    public final Object invoke(Object obj) {
        String str = (String) obj;
        Intrinsics.f(str, "it");
        SignatureBuildingComponents.a.getClass();
        if (str.length() <= 1) {
            return str;
        }
        return "L" + str + ';';
    }
}