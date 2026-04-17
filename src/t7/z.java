package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f17970a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17971b;

    public z(q1 q1Var, String str) {
        this.f17970a = q1Var;
        this.f17971b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (this.f17970a.f17914b.equals(((z) y0Var).f17970a)) {
            String str = this.f17971b;
            String str2 = ((z) y0Var).f17971b;
            if (str == null) {
                if (str2 == null) {
                    return true;
                }
            } else if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f17970a.f17914b.hashCode() ^ 1000003) * 1000003;
        String str = this.f17971b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f17970a);
        sb.append(", orgId=");
        return kc.r.g(sb, this.f17971b, "}");
    }
}