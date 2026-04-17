package z4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19666a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19667b;

    public k(Object obj, String str) {
        this.f19666a = obj;
        this.f19667b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f19666a == kVar.f19666a && this.f19667b.equals(kVar.f19667b);
    }

    public final int hashCode() {
        return this.f19667b.hashCode() + (System.identityHashCode(this.f19666a) * 31);
    }
}