package q3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f16215a;

    /* renamed from: b, reason: collision with root package name */
    public final z f16216b;

    public p(c0 c0Var, z zVar) {
        this.f16215a = c0Var;
        this.f16216b = zVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        c0 c0Var = this.f16215a;
        if (c0Var != null ? c0Var.equals(((p) a0Var).f16215a) : ((p) a0Var).f16215a == null) {
            z zVar = this.f16216b;
            p pVar = (p) a0Var;
            if (zVar == null) {
                if (pVar.f16216b == null) {
                    return true;
                }
            } else if (zVar.equals(pVar.f16216b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        c0 c0Var = this.f16215a;
        int iHashCode = ((c0Var == null ? 0 : c0Var.hashCode()) ^ 1000003) * 1000003;
        z zVar = this.f16216b;
        return (zVar != null ? zVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f16215a + ", productIdOrigin=" + this.f16216b + "}";
    }
}