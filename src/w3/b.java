package w3;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final z3.a f18605a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f18606b;

    public b(z3.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f18605a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f18606b = map;
    }

    public final long a(o3.d dVar, long j10, int i10) {
        long jA = j10 - ((z3.c) this.f18605a).a();
        c cVar = (c) this.f18606b.get(dVar);
        long j11 = cVar.f18607a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i10 - 1) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j11 > 1 ? j11 : 2L) * r12))), jA), cVar.f18608b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18605a.equals(bVar.f18605a) && this.f18606b.equals(bVar.f18606b);
    }

    public final int hashCode() {
        return ((this.f18605a.hashCode() ^ 1000003) * 1000003) ^ this.f18606b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f18605a + ", values=" + this.f18606b + "}";
    }
}