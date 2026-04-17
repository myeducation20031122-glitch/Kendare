package z1;

import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final c f19458i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19460b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19461c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19462d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19463e;

    /* renamed from: a, reason: collision with root package name */
    public p f19459a = p.f19482b;

    /* renamed from: f, reason: collision with root package name */
    public long f19464f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f19465g = -1;

    /* renamed from: h, reason: collision with root package name */
    public e f19466h = new e();

    static {
        p pVar = p.f19482b;
        e eVar = new e();
        c cVar = new c();
        cVar.f19459a = pVar;
        cVar.f19464f = -1L;
        cVar.f19465g = -1L;
        cVar.f19466h = new e();
        cVar.f19460b = false;
        int i10 = Build.VERSION.SDK_INT;
        cVar.f19461c = false;
        cVar.f19459a = pVar;
        cVar.f19462d = false;
        cVar.f19463e = false;
        if (i10 >= 24) {
            cVar.f19466h = eVar;
            cVar.f19464f = -1L;
            cVar.f19465g = -1L;
        }
        f19458i = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f19460b == cVar.f19460b && this.f19461c == cVar.f19461c && this.f19462d == cVar.f19462d && this.f19463e == cVar.f19463e && this.f19464f == cVar.f19464f && this.f19465g == cVar.f19465g && this.f19459a == cVar.f19459a) {
            return this.f19466h.equals(cVar.f19466h);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f19459a.hashCode() * 31) + (this.f19460b ? 1 : 0)) * 31) + (this.f19461c ? 1 : 0)) * 31) + (this.f19462d ? 1 : 0)) * 31) + (this.f19463e ? 1 : 0)) * 31;
        long j10 = this.f19464f;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f19465g;
        return this.f19466h.f19469a.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }
}