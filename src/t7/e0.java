package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17782a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17783b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17784c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17785d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17786e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17787f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17788g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17789h;

    /* renamed from: i, reason: collision with root package name */
    public final String f17790i;

    public e0(int i10, String str, int i11, long j10, long j11, boolean z7, int i12, String str2, String str3) {
        this.f17782a = i10;
        this.f17783b = str;
        this.f17784c = i11;
        this.f17785d = j10;
        this.f17786e = j11;
        this.f17787f = z7;
        this.f17788g = i12;
        this.f17789h = str2;
        this.f17790i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (this.f17782a == ((e0) b1Var).f17782a) {
            e0 e0Var = (e0) b1Var;
            if (this.f17783b.equals(e0Var.f17783b) && this.f17784c == e0Var.f17784c && this.f17785d == e0Var.f17785d && this.f17786e == e0Var.f17786e && this.f17787f == e0Var.f17787f && this.f17788g == e0Var.f17788g && this.f17789h.equals(e0Var.f17789h) && this.f17790i.equals(e0Var.f17790i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f17782a ^ 1000003) * 1000003) ^ this.f17783b.hashCode()) * 1000003) ^ this.f17784c) * 1000003;
        long j10 = this.f17785d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f17786e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f17787f ? 1231 : 1237)) * 1000003) ^ this.f17788g) * 1000003) ^ this.f17789h.hashCode()) * 1000003) ^ this.f17790i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f17782a);
        sb.append(", model=");
        sb.append(this.f17783b);
        sb.append(", cores=");
        sb.append(this.f17784c);
        sb.append(", ram=");
        sb.append(this.f17785d);
        sb.append(", diskSpace=");
        sb.append(this.f17786e);
        sb.append(", simulator=");
        sb.append(this.f17787f);
        sb.append(", state=");
        sb.append(this.f17788g);
        sb.append(", manufacturer=");
        sb.append(this.f17789h);
        sb.append(", modelClass=");
        return kc.r.g(sb, this.f17790i, "}");
    }
}