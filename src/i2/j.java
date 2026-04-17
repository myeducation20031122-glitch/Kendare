package i2;

import kc.r;
import z1.o;
import z1.x;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public String f13258a;

    /* renamed from: b, reason: collision with root package name */
    public x f13259b = x.f19490b;

    /* renamed from: c, reason: collision with root package name */
    public String f13260c;

    /* renamed from: d, reason: collision with root package name */
    public String f13261d;

    /* renamed from: e, reason: collision with root package name */
    public z1.g f13262e;

    /* renamed from: f, reason: collision with root package name */
    public z1.g f13263f;

    /* renamed from: g, reason: collision with root package name */
    public long f13264g;

    /* renamed from: h, reason: collision with root package name */
    public long f13265h;

    /* renamed from: i, reason: collision with root package name */
    public long f13266i;

    /* renamed from: j, reason: collision with root package name */
    public z1.c f13267j;

    /* renamed from: k, reason: collision with root package name */
    public int f13268k;

    /* renamed from: l, reason: collision with root package name */
    public int f13269l;

    /* renamed from: m, reason: collision with root package name */
    public long f13270m;

    /* renamed from: n, reason: collision with root package name */
    public long f13271n;

    /* renamed from: o, reason: collision with root package name */
    public long f13272o;

    /* renamed from: p, reason: collision with root package name */
    public long f13273p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13274q;

    /* renamed from: r, reason: collision with root package name */
    public int f13275r;

    static {
        o.t("WorkSpec");
    }

    public j(String str, String str2) {
        z1.g gVar = z1.g.f19472c;
        this.f13262e = gVar;
        this.f13263f = gVar;
        this.f13267j = z1.c.f19458i;
        this.f13269l = 1;
        this.f13270m = 30000L;
        this.f13273p = -1L;
        this.f13275r = 1;
        this.f13258a = str;
        this.f13260c = str2;
    }

    public final long a() {
        int i10;
        if (this.f13259b == x.f19490b && (i10 = this.f13268k) > 0) {
            return Math.min(18000000L, this.f13269l == 2 ? this.f13270m * i10 : (long) Math.scalb(this.f13270m, i10 - 1)) + this.f13271n;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.f13271n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f13264g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j10 = this.f13271n;
        if (j10 == 0) {
            j10 = this.f13264g + jCurrentTimeMillis2;
        }
        long j11 = this.f13266i;
        long j12 = this.f13265h;
        if (j11 != j12) {
            return j10 + j12 + (j10 == 0 ? j11 * (-1) : 0L);
        }
        return j10 + (j10 != 0 ? j12 : 0L);
    }

    public final boolean b() {
        return !z1.c.f19458i.equals(this.f13267j);
    }

    public final boolean c() {
        return this.f13265h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f13264g != jVar.f13264g || this.f13265h != jVar.f13265h || this.f13266i != jVar.f13266i || this.f13268k != jVar.f13268k || this.f13270m != jVar.f13270m || this.f13271n != jVar.f13271n || this.f13272o != jVar.f13272o || this.f13273p != jVar.f13273p || this.f13274q != jVar.f13274q || !this.f13258a.equals(jVar.f13258a) || this.f13259b != jVar.f13259b || !this.f13260c.equals(jVar.f13260c)) {
            return false;
        }
        String str = this.f13261d;
        if (str == null ? jVar.f13261d == null : str.equals(jVar.f13261d)) {
            return this.f13262e.equals(jVar.f13262e) && this.f13263f.equals(jVar.f13263f) && this.f13267j.equals(jVar.f13267j) && this.f13269l == jVar.f13269l && this.f13275r == jVar.f13275r;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f13260c.hashCode() + ((this.f13259b.hashCode() + (this.f13258a.hashCode() * 31)) * 31)) * 31;
        String str = this.f13261d;
        int iHashCode2 = (this.f13263f.hashCode() + ((this.f13262e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j10 = this.f13264g;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f13265h;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f13266i;
        int iB = (v.h.b(this.f13269l) + ((((this.f13267j.hashCode() + ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f13268k) * 31)) * 31;
        long j13 = this.f13270m;
        int i12 = (iB + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f13271n;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f13272o;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f13273p;
        return v.h.b(this.f13275r) + ((((i14 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f13274q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return r.g(new StringBuilder("{WorkSpec: "), this.f13258a, "}");
    }
}