package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g0 extends i1 {

    /* renamed from: a, reason: collision with root package name */
    public final h1 f17805a;

    /* renamed from: b, reason: collision with root package name */
    public final q1 f17806b;

    /* renamed from: c, reason: collision with root package name */
    public final q1 f17807c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f17808d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17809e;

    public g0(h1 h1Var, q1 q1Var, q1 q1Var2, Boolean bool, int i10) {
        this.f17805a = h1Var;
        this.f17806b = q1Var;
        this.f17807c = q1Var2;
        this.f17808d = bool;
        this.f17809e = i10;
    }

    public final boolean equals(Object obj) {
        q1 q1Var;
        q1 q1Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        g0 g0Var = (g0) ((i1) obj);
        return this.f17805a.equals(g0Var.f17805a) && ((q1Var = this.f17806b) != null ? q1Var.f17914b.equals(g0Var.f17806b) : g0Var.f17806b == null) && ((q1Var2 = this.f17807c) != null ? q1Var2.f17914b.equals(g0Var.f17807c) : g0Var.f17807c == null) && ((bool = this.f17808d) != null ? bool.equals(g0Var.f17808d) : g0Var.f17808d == null) && this.f17809e == g0Var.f17809e;
    }

    public final int hashCode() {
        int iHashCode = (this.f17805a.hashCode() ^ 1000003) * 1000003;
        q1 q1Var = this.f17806b;
        int iHashCode2 = (iHashCode ^ (q1Var == null ? 0 : q1Var.f17914b.hashCode())) * 1000003;
        q1 q1Var2 = this.f17807c;
        int iHashCode3 = (iHashCode2 ^ (q1Var2 == null ? 0 : q1Var2.f17914b.hashCode())) * 1000003;
        Boolean bool = this.f17808d;
        return ((iHashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f17809e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f17805a);
        sb.append(", customAttributes=");
        sb.append(this.f17806b);
        sb.append(", internalKeys=");
        sb.append(this.f17807c);
        sb.append(", background=");
        sb.append(this.f17808d);
        sb.append(", uiOrientation=");
        return kc.r.f(sb, this.f17809e, "}");
    }
}