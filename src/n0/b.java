package n0;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15251a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15252b;

    public b(Object obj, Object obj2) {
        this.f15251a = obj;
        this.f15252b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f15251a, this.f15251a) && Objects.equals(bVar.f15252b, this.f15252b);
    }

    public final int hashCode() {
        Object obj = this.f15251a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f15252b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f15251a + " " + this.f15252b + "}";
    }
}