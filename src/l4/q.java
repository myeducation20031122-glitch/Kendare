package l4;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f14630a;

    /* renamed from: b, reason: collision with root package name */
    public final double f14631b;

    /* renamed from: c, reason: collision with root package name */
    public final double f14632c;

    /* renamed from: d, reason: collision with root package name */
    public final double f14633d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14634e;

    public q(String str, double d10, double d11, double d12, int i10) {
        this.f14630a = str;
        this.f14632c = d10;
        this.f14631b = d11;
        this.f14633d = d12;
        this.f14634e = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return o5.y.i(this.f14630a, qVar.f14630a) && this.f14631b == qVar.f14631b && this.f14632c == qVar.f14632c && this.f14634e == qVar.f14634e && Double.compare(this.f14633d, qVar.f14633d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14630a, Double.valueOf(this.f14631b), Double.valueOf(this.f14632c), Double.valueOf(this.f14633d), Integer.valueOf(this.f14634e)});
    }

    public final String toString() {
        d3.d dVar = new d3.d(this);
        dVar.a(this.f14630a, "name");
        dVar.a(Double.valueOf(this.f14632c), "minBound");
        dVar.a(Double.valueOf(this.f14631b), "maxBound");
        dVar.a(Double.valueOf(this.f14633d), "percent");
        dVar.a(Integer.valueOf(this.f14634e), "count");
        return dVar.toString();
    }
}