package q3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f16200a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16201b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16202c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16203d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16204e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16205f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16206g;

    /* renamed from: h, reason: collision with root package name */
    public final String f16207h;

    /* renamed from: i, reason: collision with root package name */
    public final String f16208i;

    /* renamed from: j, reason: collision with root package name */
    public final String f16209j;

    /* renamed from: k, reason: collision with root package name */
    public final String f16210k;

    /* renamed from: l, reason: collision with root package name */
    public final String f16211l;

    public m(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f16200a = num;
        this.f16201b = str;
        this.f16202c = str2;
        this.f16203d = str3;
        this.f16204e = str4;
        this.f16205f = str5;
        this.f16206g = str6;
        this.f16207h = str7;
        this.f16208i = str8;
        this.f16209j = str9;
        this.f16210k = str10;
        this.f16211l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f16200a;
        if (num != null ? num.equals(((m) aVar).f16200a) : ((m) aVar).f16200a == null) {
            String str = this.f16201b;
            if (str != null ? str.equals(((m) aVar).f16201b) : ((m) aVar).f16201b == null) {
                String str2 = this.f16202c;
                if (str2 != null ? str2.equals(((m) aVar).f16202c) : ((m) aVar).f16202c == null) {
                    String str3 = this.f16203d;
                    if (str3 != null ? str3.equals(((m) aVar).f16203d) : ((m) aVar).f16203d == null) {
                        String str4 = this.f16204e;
                        if (str4 != null ? str4.equals(((m) aVar).f16204e) : ((m) aVar).f16204e == null) {
                            String str5 = this.f16205f;
                            if (str5 != null ? str5.equals(((m) aVar).f16205f) : ((m) aVar).f16205f == null) {
                                String str6 = this.f16206g;
                                if (str6 != null ? str6.equals(((m) aVar).f16206g) : ((m) aVar).f16206g == null) {
                                    String str7 = this.f16207h;
                                    if (str7 != null ? str7.equals(((m) aVar).f16207h) : ((m) aVar).f16207h == null) {
                                        String str8 = this.f16208i;
                                        if (str8 != null ? str8.equals(((m) aVar).f16208i) : ((m) aVar).f16208i == null) {
                                            String str9 = this.f16209j;
                                            if (str9 != null ? str9.equals(((m) aVar).f16209j) : ((m) aVar).f16209j == null) {
                                                String str10 = this.f16210k;
                                                if (str10 != null ? str10.equals(((m) aVar).f16210k) : ((m) aVar).f16210k == null) {
                                                    String str11 = this.f16211l;
                                                    m mVar = (m) aVar;
                                                    if (str11 == null) {
                                                        if (mVar.f16211l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(mVar.f16211l)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f16200a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f16201b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f16202c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f16203d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f16204e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f16205f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f16206g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f16207h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f16208i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f16209j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f16210k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f16211l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f16200a);
        sb.append(", model=");
        sb.append(this.f16201b);
        sb.append(", hardware=");
        sb.append(this.f16202c);
        sb.append(", device=");
        sb.append(this.f16203d);
        sb.append(", product=");
        sb.append(this.f16204e);
        sb.append(", osBuild=");
        sb.append(this.f16205f);
        sb.append(", manufacturer=");
        sb.append(this.f16206g);
        sb.append(", fingerprint=");
        sb.append(this.f16207h);
        sb.append(", locale=");
        sb.append(this.f16208i);
        sb.append(", country=");
        sb.append(this.f16209j);
        sb.append(", mccMnc=");
        sb.append(this.f16210k);
        sb.append(", applicationBuild=");
        return kc.r.g(sb, this.f16211l, "}");
    }
}