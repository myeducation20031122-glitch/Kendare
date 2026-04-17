package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j0 extends d1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17847a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17848b;

    /* renamed from: c, reason: collision with root package name */
    public final q1 f17849c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f17850d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17851e;

    public j0(String str, String str2, q1 q1Var, d1 d1Var, int i10) {
        this.f17847a = str;
        this.f17848b = str2;
        this.f17849c = q1Var;
        this.f17850d = d1Var;
        this.f17851e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        j0 j0Var = (j0) ((d1) obj);
        if (this.f17847a.equals(j0Var.f17847a) && ((str = this.f17848b) != null ? str.equals(j0Var.f17848b) : j0Var.f17848b == null) && this.f17849c.f17914b.equals(j0Var.f17849c)) {
            d1 d1Var = j0Var.f17850d;
            d1 d1Var2 = this.f17850d;
            if (d1Var2 != null ? d1Var2.equals(d1Var) : d1Var == null) {
                if (this.f17851e == j0Var.f17851e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f17847a.hashCode() ^ 1000003) * 1000003;
        String str = this.f17848b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f17849c.f17914b.hashCode()) * 1000003;
        d1 d1Var = this.f17850d;
        return ((iHashCode2 ^ (d1Var != null ? d1Var.hashCode() : 0)) * 1000003) ^ this.f17851e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f17847a);
        sb.append(", reason=");
        sb.append(this.f17848b);
        sb.append(", frames=");
        sb.append(this.f17849c);
        sb.append(", causedBy=");
        sb.append(this.f17850d);
        sb.append(", overflowCount=");
        return kc.r.f(sb, this.f17851e, "}");
    }
}