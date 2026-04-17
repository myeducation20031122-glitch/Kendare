package l8;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f14663a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14664b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14665c;

    /* renamed from: d, reason: collision with root package name */
    public final b f14666d;

    /* renamed from: e, reason: collision with root package name */
    public final d f14667e;

    public a(String str, String str2, String str3, b bVar, d dVar) {
        this.f14663a = str;
        this.f14664b = str2;
        this.f14665c = str3;
        this.f14666d = bVar;
        this.f14667e = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f14663a;
        if (str != null ? str.equals(aVar.f14663a) : aVar.f14663a == null) {
            String str2 = this.f14664b;
            if (str2 != null ? str2.equals(aVar.f14664b) : aVar.f14664b == null) {
                String str3 = this.f14665c;
                if (str3 != null ? str3.equals(aVar.f14665c) : aVar.f14665c == null) {
                    b bVar = this.f14666d;
                    if (bVar != null ? bVar.equals(aVar.f14666d) : aVar.f14666d == null) {
                        d dVar = this.f14667e;
                        if (dVar == null) {
                            if (aVar.f14667e == null) {
                                return true;
                            }
                        } else if (dVar.equals(aVar.f14667e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f14663a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f14664b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f14665c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f14666d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        d dVar = this.f14667e;
        return (dVar != null ? dVar.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f14663a + ", fid=" + this.f14664b + ", refreshToken=" + this.f14665c + ", authToken=" + this.f14666d + ", responseCode=" + this.f14667e + "}";
    }
}