package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h0 extends h1 {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f17820a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f17821b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f17822c;

    /* renamed from: d, reason: collision with root package name */
    public final e1 f17823d;

    /* renamed from: e, reason: collision with root package name */
    public final q1 f17824e;

    public h0(q1 q1Var, d1 d1Var, v0 v0Var, e1 e1Var, q1 q1Var2) {
        this.f17820a = q1Var;
        this.f17821b = d1Var;
        this.f17822c = v0Var;
        this.f17823d = e1Var;
        this.f17824e = q1Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        q1 q1Var = this.f17820a;
        if (q1Var != null) {
            if (q1Var.f17914b.equals(((h0) h1Var).f17820a)) {
            }
        } else if (((h0) h1Var).f17820a == null) {
            d1 d1Var = this.f17821b;
            if (d1Var != null ? d1Var.equals(((h0) h1Var).f17821b) : ((h0) h1Var).f17821b == null) {
                v0 v0Var = this.f17822c;
                if (v0Var != null ? v0Var.equals(((h0) h1Var).f17822c) : ((h0) h1Var).f17822c == null) {
                    h0 h0Var = (h0) h1Var;
                    if (this.f17823d.equals(h0Var.f17823d) && this.f17824e.f17914b.equals(h0Var.f17824e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        q1 q1Var = this.f17820a;
        int iHashCode = ((q1Var == null ? 0 : q1Var.f17914b.hashCode()) ^ 1000003) * 1000003;
        d1 d1Var = this.f17821b;
        int iHashCode2 = (iHashCode ^ (d1Var == null ? 0 : d1Var.hashCode())) * 1000003;
        v0 v0Var = this.f17822c;
        return (((((v0Var != null ? v0Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f17823d.hashCode()) * 1000003) ^ this.f17824e.f17914b.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f17820a + ", exception=" + this.f17821b + ", appExitInfo=" + this.f17822c + ", signal=" + this.f17823d + ", binaries=" + this.f17824e + "}";
    }
}