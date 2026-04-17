package w3;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18607a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18608b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f18609c;

    public c(long j10, long j11, Set set) {
        this.f18607a = j10;
        this.f18608b = j11;
        this.f18609c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f18607a == cVar.f18607a && this.f18608b == cVar.f18608b && this.f18609c.equals(cVar.f18609c);
    }

    public final int hashCode() {
        long j10 = this.f18607a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f18608b;
        return this.f18609c.hashCode() ^ ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f18607a + ", maxAllowedDelay=" + this.f18608b + ", flags=" + this.f18609c + "}";
    }
}