package j8;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13840a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13841b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13842c;

    public a(String str, long j10, long j11) {
        this.f13840a = str;
        this.f13841b = j10;
        this.f13842c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13840a.equals(aVar.f13840a) && this.f13841b == aVar.f13841b && this.f13842c == aVar.f13842c;
    }

    public final int hashCode() {
        int iHashCode = (this.f13840a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f13841b;
        long j11 = this.f13842c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f13840a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f13841b);
        sb.append(", tokenCreationTimestamp=");
        return a0.h.x(sb, this.f13842c, "}");
    }
}