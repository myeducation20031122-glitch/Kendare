package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f17921a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f17922b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f17923c;

    public r0(s0 s0Var, u0 u0Var, t0 t0Var) {
        this.f17921a = s0Var;
        this.f17922b = u0Var;
        this.f17923c = t0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f17921a.equals(r0Var.f17921a) && this.f17922b.equals(r0Var.f17922b) && this.f17923c.equals(r0Var.f17923c);
    }

    public final int hashCode() {
        return ((((this.f17921a.hashCode() ^ 1000003) * 1000003) ^ this.f17922b.hashCode()) * 1000003) ^ this.f17923c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f17921a + ", osData=" + this.f17922b + ", deviceData=" + this.f17923c + "}";
    }
}