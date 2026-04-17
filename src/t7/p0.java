package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p0 extends m1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17901a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17902b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17903c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17904d;

    public p0(int i10, String str, String str2, boolean z7) {
        this.f17901a = i10;
        this.f17902b = str;
        this.f17903c = str2;
        this.f17904d = z7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (this.f17901a == ((p0) m1Var).f17901a) {
            p0 p0Var = (p0) m1Var;
            if (this.f17902b.equals(p0Var.f17902b) && this.f17903c.equals(p0Var.f17903c) && this.f17904d == p0Var.f17904d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f17901a ^ 1000003) * 1000003) ^ this.f17902b.hashCode()) * 1000003) ^ this.f17903c.hashCode()) * 1000003) ^ (this.f17904d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f17901a + ", version=" + this.f17902b + ", buildVersion=" + this.f17903c + ", jailbroken=" + this.f17904d + "}";
    }
}