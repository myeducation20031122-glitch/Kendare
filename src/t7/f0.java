package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f0 extends l1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f17799a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17800b;

    /* renamed from: c, reason: collision with root package name */
    public final i1 f17801c;

    /* renamed from: d, reason: collision with root package name */
    public final j1 f17802d;

    /* renamed from: e, reason: collision with root package name */
    public final k1 f17803e;

    public f0(long j10, String str, i1 i1Var, j1 j1Var, k1 k1Var) {
        this.f17799a = j10;
        this.f17800b = str;
        this.f17801c = i1Var;
        this.f17802d = j1Var;
        this.f17803e = k1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        f0 f0Var = (f0) ((l1) obj);
        if (this.f17799a == f0Var.f17799a) {
            if (this.f17800b.equals(f0Var.f17800b) && this.f17801c.equals(f0Var.f17801c) && this.f17802d.equals(f0Var.f17802d)) {
                k1 k1Var = f0Var.f17803e;
                k1 k1Var2 = this.f17803e;
                if (k1Var2 == null) {
                    if (k1Var == null) {
                        return true;
                    }
                } else if (k1Var2.equals(k1Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f17799a;
        int iHashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f17800b.hashCode()) * 1000003) ^ this.f17801c.hashCode()) * 1000003) ^ this.f17802d.hashCode()) * 1000003;
        k1 k1Var = this.f17803e;
        return (k1Var == null ? 0 : k1Var.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f17799a + ", type=" + this.f17800b + ", app=" + this.f17801c + ", device=" + this.f17802d + ", log=" + this.f17803e + "}";
    }
}