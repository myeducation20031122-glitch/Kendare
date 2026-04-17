package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q0 extends n1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17913a;

    public q0(String str) {
        this.f17913a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        return this.f17913a.equals(((q0) ((n1) obj)).f17913a);
    }

    public final int hashCode() {
        return this.f17913a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return kc.r.g(new StringBuilder("User{identifier="), this.f17913a, "}");
    }
}