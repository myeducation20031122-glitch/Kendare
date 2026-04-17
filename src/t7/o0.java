package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o0 extends k1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17894a;

    public o0(String str) {
        this.f17894a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        return this.f17894a.equals(((o0) ((k1) obj)).f17894a);
    }

    public final int hashCode() {
        return this.f17894a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return kc.r.g(new StringBuilder("Log{content="), this.f17894a, "}");
    }
}