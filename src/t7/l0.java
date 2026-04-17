package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l0 extends g1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17866a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17867b;

    /* renamed from: c, reason: collision with root package name */
    public final q1 f17868c;

    public l0(String str, int i10, q1 q1Var) {
        this.f17866a = str;
        this.f17867b = i10;
        this.f17868c = q1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (this.f17866a.equals(((l0) g1Var).f17866a)) {
            l0 l0Var = (l0) g1Var;
            if (this.f17867b == l0Var.f17867b && this.f17868c.f17914b.equals(l0Var.f17868c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f17866a.hashCode() ^ 1000003) * 1000003) ^ this.f17867b) * 1000003) ^ this.f17868c.f17914b.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f17866a + ", importance=" + this.f17867b + ", frames=" + this.f17868c + "}";
    }
}