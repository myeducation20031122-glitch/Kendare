package gb;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class m {
    public final Name a;
    public final JavaClass b;

    public m(Name name, JavaClass javaClass) {
        Intrinsics.f(name, "name");
        this.a = name;
        this.b = javaClass;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (Intrinsics.a(this.a, ((m) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}