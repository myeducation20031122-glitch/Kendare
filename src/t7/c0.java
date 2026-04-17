package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c0 extends a1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17770a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17771b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17772c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17773d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17774e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17775f;

    public c0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f17770a = str;
        this.f17771b = str2;
        this.f17772c = str3;
        this.f17773d = str4;
        this.f17774e = str5;
        this.f17775f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (this.f17770a.equals(((c0) a1Var).f17770a)) {
            c0 c0Var = (c0) a1Var;
            if (this.f17771b.equals(c0Var.f17771b)) {
                String str = c0Var.f17772c;
                String str2 = this.f17772c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c0Var.f17773d;
                    String str4 = this.f17773d;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = c0Var.f17774e;
                        String str6 = this.f17774e;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = c0Var.f17775f;
                            String str8 = this.f17775f;
                            if (str8 == null) {
                                if (str7 == null) {
                                    return true;
                                }
                            } else if (str8.equals(str7)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f17770a.hashCode() ^ 1000003) * 1000003) ^ this.f17771b.hashCode()) * 1000003;
        String str = this.f17772c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f17773d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f17774e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f17775f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f17770a);
        sb.append(", version=");
        sb.append(this.f17771b);
        sb.append(", displayVersion=");
        sb.append(this.f17772c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.f17773d);
        sb.append(", developmentPlatform=");
        sb.append(this.f17774e);
        sb.append(", developmentPlatformVersion=");
        return kc.r.g(sb, this.f17775f, "}");
    }
}