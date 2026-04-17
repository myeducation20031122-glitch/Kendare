package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17960a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17961b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17962c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17963d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17964e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17965f;

    /* renamed from: g, reason: collision with root package name */
    public final long f17966g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17967h;

    public x(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2) {
        this.f17960a = i10;
        this.f17961b = str;
        this.f17962c = i11;
        this.f17963d = i12;
        this.f17964e = j10;
        this.f17965f = j11;
        this.f17966g = j12;
        this.f17967h = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f17960a == ((x) v0Var).f17960a) {
            x xVar = (x) v0Var;
            if (this.f17961b.equals(xVar.f17961b) && this.f17962c == xVar.f17962c && this.f17963d == xVar.f17963d && this.f17964e == xVar.f17964e && this.f17965f == xVar.f17965f && this.f17966g == xVar.f17966g) {
                String str = xVar.f17967h;
                String str2 = this.f17967h;
                if (str2 == null) {
                    if (str == null) {
                        return true;
                    }
                } else if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f17960a ^ 1000003) * 1000003) ^ this.f17961b.hashCode()) * 1000003) ^ this.f17962c) * 1000003) ^ this.f17963d) * 1000003;
        long j10 = this.f17964e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f17965f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f17966g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f17967h;
        return i12 ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationExitInfo{pid=");
        sb.append(this.f17960a);
        sb.append(", processName=");
        sb.append(this.f17961b);
        sb.append(", reasonCode=");
        sb.append(this.f17962c);
        sb.append(", importance=");
        sb.append(this.f17963d);
        sb.append(", pss=");
        sb.append(this.f17964e);
        sb.append(", rss=");
        sb.append(this.f17965f);
        sb.append(", timestamp=");
        sb.append(this.f17966g);
        sb.append(", traceFile=");
        return kc.r.g(sb, this.f17967h, "}");
    }
}