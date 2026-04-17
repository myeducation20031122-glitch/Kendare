package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i0 extends c1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f17837a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17838b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17839c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17840d;

    public i0(long j10, long j11, String str, String str2) {
        this.f17837a = j10;
        this.f17838b = j11;
        this.f17839c = str;
        this.f17840d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (this.f17837a == ((i0) c1Var).f17837a) {
            i0 i0Var = (i0) c1Var;
            if (this.f17838b == i0Var.f17838b && this.f17839c.equals(i0Var.f17839c)) {
                String str = i0Var.f17840d;
                String str2 = this.f17840d;
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
        long j10 = this.f17837a;
        long j11 = this.f17838b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f17839c.hashCode()) * 1000003;
        String str = this.f17840d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f17837a);
        sb.append(", size=");
        sb.append(this.f17838b);
        sb.append(", name=");
        sb.append(this.f17839c);
        sb.append(", uuid=");
        return kc.r.g(sb, this.f17840d, "}");
    }
}