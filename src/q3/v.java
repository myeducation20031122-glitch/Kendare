package q3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f16235a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f16236b;

    public v(g0 g0Var, f0 f0Var) {
        this.f16235a = g0Var;
        this.f16236b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        g0 g0Var = this.f16235a;
        if (g0Var != null ? g0Var.equals(((v) h0Var).f16235a) : ((v) h0Var).f16235a == null) {
            f0 f0Var = this.f16236b;
            v vVar = (v) h0Var;
            if (f0Var == null) {
                if (vVar.f16236b == null) {
                    return true;
                }
            } else if (f0Var.equals(vVar.f16236b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        g0 g0Var = this.f16235a;
        int iHashCode = ((g0Var == null ? 0 : g0Var.hashCode()) ^ 1000003) * 1000003;
        f0 f0Var = this.f16236b;
        return (f0Var != null ? f0Var.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f16235a + ", mobileSubtype=" + this.f16236b + "}";
    }
}