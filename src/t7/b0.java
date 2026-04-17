package t7;

import com.google.android.gms.internal.ads.r5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b0 extends o1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17750a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17751b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17752c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f17753d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17754e;

    /* renamed from: f, reason: collision with root package name */
    public final a1 f17755f;

    /* renamed from: g, reason: collision with root package name */
    public final n1 f17756g;

    /* renamed from: h, reason: collision with root package name */
    public final m1 f17757h;

    /* renamed from: i, reason: collision with root package name */
    public final b1 f17758i;

    /* renamed from: j, reason: collision with root package name */
    public final q1 f17759j;

    /* renamed from: k, reason: collision with root package name */
    public final int f17760k;

    public b0(String str, String str2, long j10, Long l10, boolean z7, a1 a1Var, n1 n1Var, m1 m1Var, b1 b1Var, q1 q1Var, int i10) {
        this.f17750a = str;
        this.f17751b = str2;
        this.f17752c = j10;
        this.f17753d = l10;
        this.f17754e = z7;
        this.f17755f = a1Var;
        this.f17756g = n1Var;
        this.f17757h = m1Var;
        this.f17758i = b1Var;
        this.f17759j = q1Var;
        this.f17760k = i10;
    }

    @Override // t7.o1
    public final r5 a() {
        r5 r5Var = new r5();
        r5Var.f7937a = this.f17750a;
        r5Var.f7938b = this.f17751b;
        r5Var.f7939c = Long.valueOf(this.f17752c);
        r5Var.f7940d = this.f17753d;
        r5Var.f7941e = Boolean.valueOf(this.f17754e);
        r5Var.f7942f = this.f17755f;
        r5Var.f7943g = this.f17756g;
        r5Var.f7944h = this.f17757h;
        r5Var.f7945i = this.f17758i;
        r5Var.f7946j = this.f17759j;
        r5Var.f7947k = Integer.valueOf(this.f17760k);
        return r5Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        b0 b0Var = (b0) ((o1) obj);
        if (this.f17750a.equals(b0Var.f17750a)) {
            if (this.f17751b.equals(b0Var.f17751b) && this.f17752c == b0Var.f17752c) {
                Long l10 = b0Var.f17753d;
                Long l11 = this.f17753d;
                if (l11 != null ? l11.equals(l10) : l10 == null) {
                    if (this.f17754e == b0Var.f17754e && this.f17755f.equals(b0Var.f17755f)) {
                        n1 n1Var = b0Var.f17756g;
                        n1 n1Var2 = this.f17756g;
                        if (n1Var2 != null ? n1Var2.equals(n1Var) : n1Var == null) {
                            m1 m1Var = b0Var.f17757h;
                            m1 m1Var2 = this.f17757h;
                            if (m1Var2 != null ? m1Var2.equals(m1Var) : m1Var == null) {
                                b1 b1Var = b0Var.f17758i;
                                b1 b1Var2 = this.f17758i;
                                if (b1Var2 != null ? b1Var2.equals(b1Var) : b1Var == null) {
                                    q1 q1Var = b0Var.f17759j;
                                    q1 q1Var2 = this.f17759j;
                                    if (q1Var2 != null ? q1Var2.f17914b.equals(q1Var) : q1Var == null) {
                                        if (this.f17760k == b0Var.f17760k) {
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
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f17750a.hashCode() ^ 1000003) * 1000003) ^ this.f17751b.hashCode()) * 1000003;
        long j10 = this.f17752c;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f17753d;
        int iHashCode2 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f17754e ? 1231 : 1237)) * 1000003) ^ this.f17755f.hashCode()) * 1000003;
        n1 n1Var = this.f17756g;
        int iHashCode3 = (iHashCode2 ^ (n1Var == null ? 0 : n1Var.hashCode())) * 1000003;
        m1 m1Var = this.f17757h;
        int iHashCode4 = (iHashCode3 ^ (m1Var == null ? 0 : m1Var.hashCode())) * 1000003;
        b1 b1Var = this.f17758i;
        int iHashCode5 = (iHashCode4 ^ (b1Var == null ? 0 : b1Var.hashCode())) * 1000003;
        q1 q1Var = this.f17759j;
        return ((iHashCode5 ^ (q1Var != null ? q1Var.f17914b.hashCode() : 0)) * 1000003) ^ this.f17760k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f17750a);
        sb.append(", identifier=");
        sb.append(this.f17751b);
        sb.append(", startedAt=");
        sb.append(this.f17752c);
        sb.append(", endedAt=");
        sb.append(this.f17753d);
        sb.append(", crashed=");
        sb.append(this.f17754e);
        sb.append(", app=");
        sb.append(this.f17755f);
        sb.append(", user=");
        sb.append(this.f17756g);
        sb.append(", os=");
        sb.append(this.f17757h);
        sb.append(", device=");
        sb.append(this.f17758i);
        sb.append(", events=");
        sb.append(this.f17759j);
        sb.append(", generatorType=");
        return kc.r.f(sb, this.f17760k, "}");
    }
}