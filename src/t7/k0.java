package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k0 extends e1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17857a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17858b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17859c;

    public k0(String str, String str2, long j10) {
        this.f17857a = str;
        this.f17858b = str2;
        this.f17859c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (this.f17857a.equals(((k0) e1Var).f17857a)) {
            k0 k0Var = (k0) e1Var;
            if (this.f17858b.equals(k0Var.f17858b) && this.f17859c == k0Var.f17859c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f17857a.hashCode() ^ 1000003) * 1000003) ^ this.f17858b.hashCode()) * 1000003;
        long j10 = this.f17859c;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f17857a);
        sb.append(", code=");
        sb.append(this.f17858b);
        sb.append(", address=");
        return a0.h.x(sb, this.f17859c, "}");
    }
}