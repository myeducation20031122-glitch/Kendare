package z1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final g f19479a;

    public m(g gVar) {
        this.f19479a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return this.f19479a.equals(((m) obj).f19479a);
    }

    public final int hashCode() {
        return this.f19479a.hashCode() + (m.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f19479a + '}';
    }
}