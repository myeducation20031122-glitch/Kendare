package cb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class i extends Lambda implements Function1 {
    public static final i b = new i(1);

    public final Object invoke(Object obj) {
        String simpleName = ((Class) obj).getSimpleName();
        if (!Name.l(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return Name.k(simpleName);
        }
        return null;
    }
}