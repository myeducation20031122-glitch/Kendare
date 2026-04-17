package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w extends p1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f17952b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17953c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17954d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17955e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17956f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17957g;

    /* renamed from: h, reason: collision with root package name */
    public final o1 f17958h;

    /* renamed from: i, reason: collision with root package name */
    public final y0 f17959i;

    public w(String str, String str2, int i10, String str3, String str4, String str5, o1 o1Var, y0 y0Var) {
        this.f17952b = str;
        this.f17953c = str2;
        this.f17954d = i10;
        this.f17955e = str3;
        this.f17956f = str4;
        this.f17957g = str5;
        this.f17958h = o1Var;
        this.f17959i = y0Var;
    }

    public final android.support.v4.media.b a() {
        android.support.v4.media.b bVar = new android.support.v4.media.b();
        bVar.f486b = this.f17952b;
        bVar.f487e = this.f17953c;
        bVar.f488f = Integer.valueOf(this.f17954d);
        bVar.f489j = this.f17955e;
        bVar.f490m = this.f17956f;
        bVar.f491n = this.f17957g;
        bVar.f492t = this.f17958h;
        bVar.f493u = this.f17959i;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        w wVar = (w) ((p1) obj);
        if (this.f17952b.equals(wVar.f17952b)) {
            if (this.f17953c.equals(wVar.f17953c) && this.f17954d == wVar.f17954d && this.f17955e.equals(wVar.f17955e) && this.f17956f.equals(wVar.f17956f) && this.f17957g.equals(wVar.f17957g)) {
                o1 o1Var = wVar.f17958h;
                o1 o1Var2 = this.f17958h;
                if (o1Var2 != null ? o1Var2.equals(o1Var) : o1Var == null) {
                    y0 y0Var = wVar.f17959i;
                    y0 y0Var2 = this.f17959i;
                    if (y0Var2 == null) {
                        if (y0Var == null) {
                            return true;
                        }
                    } else if (y0Var2.equals(y0Var)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.f17952b.hashCode() ^ 1000003) * 1000003) ^ this.f17953c.hashCode()) * 1000003) ^ this.f17954d) * 1000003) ^ this.f17955e.hashCode()) * 1000003) ^ this.f17956f.hashCode()) * 1000003) ^ this.f17957g.hashCode()) * 1000003;
        o1 o1Var = this.f17958h;
        int iHashCode2 = (iHashCode ^ (o1Var == null ? 0 : o1Var.hashCode())) * 1000003;
        y0 y0Var = this.f17959i;
        return iHashCode2 ^ (y0Var != null ? y0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f17952b + ", gmpAppId=" + this.f17953c + ", platform=" + this.f17954d + ", installationUuid=" + this.f17955e + ", buildVersion=" + this.f17956f + ", displayVersion=" + this.f17957g + ", session=" + this.f17958h + ", ndkPayload=" + this.f17959i + "}";
    }
}