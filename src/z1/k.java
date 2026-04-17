package z1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k extends n {

    /* renamed from: a, reason: collision with root package name */
    public final g f19478a = g.f19472c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return this.f19478a.equals(((k) obj).f19478a);
    }

    public final int hashCode() {
        return this.f19478a.hashCode() + (k.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f19478a + '}';
    }
}