package i3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public Class f13301a;

    /* renamed from: b, reason: collision with root package name */
    public Class f13302b;

    /* renamed from: c, reason: collision with root package name */
    public Class f13303c;

    public m(Class cls, Class cls2, Class cls3) {
        this.f13301a = cls;
        this.f13302b = cls2;
        this.f13303c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f13301a.equals(mVar.f13301a) && this.f13302b.equals(mVar.f13302b) && o.b(this.f13303c, mVar.f13303c);
    }

    public final int hashCode() {
        int iHashCode = (this.f13302b.hashCode() + (this.f13301a.hashCode() * 31)) * 31;
        Class cls = this.f13303c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f13301a + ", second=" + this.f13302b + '}';
    }
}