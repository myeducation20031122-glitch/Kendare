package m7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Class f15204a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15205b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15206c;

    public j(int i10, int i11, Class cls) {
        this.f15204a = cls;
        this.f15205b = i10;
        this.f15206c = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f15204a == jVar.f15204a && this.f15205b == jVar.f15205b && this.f15206c == jVar.f15206c;
    }

    public final int hashCode() {
        return ((((this.f15204a.hashCode() ^ 1000003) * 1000003) ^ this.f15205b) * 1000003) ^ this.f15206c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f15204a);
        sb.append(", type=");
        int i10 = this.f15205b;
        sb.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i11 = this.f15206c;
        if (i11 == 0) {
            str = "direct";
        } else if (i11 == 1) {
            str = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(kc.r.d("Unsupported injection: ", i11));
            }
            str = "deferred";
        }
        return kc.r.g(sb, str, "}");
    }
}