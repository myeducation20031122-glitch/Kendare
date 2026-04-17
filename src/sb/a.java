package sb;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a {
    public final ClassId a;
    public final ClassData b;

    public a(ClassId classId, ClassData classData) {
        Intrinsics.f(classId, "classId");
        this.a = classId;
        this.b = classData;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (Intrinsics.a(this.a, ((a) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}