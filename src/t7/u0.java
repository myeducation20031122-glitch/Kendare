package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17948a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17949b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17950c;

    public u0(String str, String str2, boolean z7) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f17948a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f17949b = str2;
        this.f17950c = z7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f17948a.equals(u0Var.f17948a) && this.f17949b.equals(u0Var.f17949b) && this.f17950c == u0Var.f17950c;
    }

    public final int hashCode() {
        return ((((this.f17948a.hashCode() ^ 1000003) * 1000003) ^ this.f17949b.hashCode()) * 1000003) ^ (this.f17950c ? 1231 : 1237);
    }

    public final String toString() {
        return "OsData{osRelease=" + this.f17948a + ", osCodeName=" + this.f17949b + ", isRooted=" + this.f17950c + "}";
    }
}