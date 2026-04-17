package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17937a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17938b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17939c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17940d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17941e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17942f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17943g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17944h;

    /* renamed from: i, reason: collision with root package name */
    public final String f17945i;

    public t0(int i10, String str, int i11, long j10, long j11, boolean z7, int i12, String str2, String str3) {
        this.f17937a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f17938b = str;
        this.f17939c = i11;
        this.f17940d = j10;
        this.f17941e = j11;
        this.f17942f = z7;
        this.f17943g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f17944h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f17945i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f17937a == t0Var.f17937a && this.f17938b.equals(t0Var.f17938b) && this.f17939c == t0Var.f17939c && this.f17940d == t0Var.f17940d && this.f17941e == t0Var.f17941e && this.f17942f == t0Var.f17942f && this.f17943g == t0Var.f17943g && this.f17944h.equals(t0Var.f17944h) && this.f17945i.equals(t0Var.f17945i);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f17937a ^ 1000003) * 1000003) ^ this.f17938b.hashCode()) * 1000003) ^ this.f17939c) * 1000003;
        long j10 = this.f17940d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f17941e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f17942f ? 1231 : 1237)) * 1000003) ^ this.f17943g) * 1000003) ^ this.f17944h.hashCode()) * 1000003) ^ this.f17945i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f17937a);
        sb.append(", model=");
        sb.append(this.f17938b);
        sb.append(", availableProcessors=");
        sb.append(this.f17939c);
        sb.append(", totalRam=");
        sb.append(this.f17940d);
        sb.append(", diskSpace=");
        sb.append(this.f17941e);
        sb.append(", isEmulator=");
        sb.append(this.f17942f);
        sb.append(", state=");
        sb.append(this.f17943g);
        sb.append(", manufacturer=");
        sb.append(this.f17944h);
        sb.append(", modelClass=");
        return kc.r.g(sb, this.f17945i, "}");
    }
}