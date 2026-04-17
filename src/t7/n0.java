package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n0 extends j1 {

    /* renamed from: a, reason: collision with root package name */
    public final Double f17884a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17885b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17886c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17887d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17888e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17889f;

    public n0(Double d10, int i10, boolean z7, int i11, long j10, long j11) {
        this.f17884a = d10;
        this.f17885b = i10;
        this.f17886c = z7;
        this.f17887d = i11;
        this.f17888e = j10;
        this.f17889f = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        Double d10 = this.f17884a;
        if (d10 != null ? d10.equals(((n0) j1Var).f17884a) : ((n0) j1Var).f17884a == null) {
            if (this.f17885b == ((n0) j1Var).f17885b) {
                n0 n0Var = (n0) j1Var;
                if (this.f17886c == n0Var.f17886c && this.f17887d == n0Var.f17887d && this.f17888e == n0Var.f17888e && this.f17889f == n0Var.f17889f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d10 = this.f17884a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f17885b) * 1000003) ^ (this.f17886c ? 1231 : 1237)) * 1000003) ^ this.f17887d) * 1000003;
        long j10 = this.f17888e;
        long j11 = this.f17889f;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f17884a);
        sb.append(", batteryVelocity=");
        sb.append(this.f17885b);
        sb.append(", proximityOn=");
        sb.append(this.f17886c);
        sb.append(", orientation=");
        sb.append(this.f17887d);
        sb.append(", ramUsed=");
        sb.append(this.f17888e);
        sb.append(", diskUsed=");
        return a0.h.x(sb, this.f17889f, "}");
    }
}