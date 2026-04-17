package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m0 extends f1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f17875a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17876b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17877c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17878d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17879e;

    public m0(long j10, String str, String str2, long j11, int i10) {
        this.f17875a = j10;
        this.f17876b = str;
        this.f17877c = str2;
        this.f17878d = j11;
        this.f17879e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (this.f17875a == ((m0) f1Var).f17875a) {
            m0 m0Var = (m0) f1Var;
            if (this.f17876b.equals(m0Var.f17876b)) {
                String str = m0Var.f17877c;
                String str2 = this.f17877c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f17878d == m0Var.f17878d && this.f17879e == m0Var.f17879e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f17875a;
        int iHashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f17876b.hashCode()) * 1000003;
        String str = this.f17877c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f17878d;
        return this.f17879e ^ ((iHashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f17875a);
        sb.append(", symbol=");
        sb.append(this.f17876b);
        sb.append(", file=");
        sb.append(this.f17877c);
        sb.append(", offset=");
        sb.append(this.f17878d);
        sb.append(", importance=");
        return kc.r.f(sb, this.f17879e, "}");
    }
}