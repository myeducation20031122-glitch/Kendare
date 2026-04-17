package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17968a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17969b;

    public y(String str, String str2) {
        this.f17968a = str;
        this.f17969b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f17968a.equals(((y) w0Var).f17968a) && this.f17969b.equals(((y) w0Var).f17969b);
    }

    public final int hashCode() {
        return ((this.f17968a.hashCode() ^ 1000003) * 1000003) ^ this.f17969b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f17968a);
        sb.append(", value=");
        return kc.r.g(sb, this.f17969b, "}");
    }
}