package z1;

import java.util.HashSet;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f19469a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return this.f19469a.equals(((e) obj).f19469a);
    }

    public final int hashCode() {
        return this.f19469a.hashCode();
    }
}