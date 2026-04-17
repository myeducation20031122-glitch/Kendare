package x3;

import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f18912f;

    /* renamed from: a, reason: collision with root package name */
    public final long f18913a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18914b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18915c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18916d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18917e;

    static {
        Long l10 = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l11 = 604800000L;
        Integer num3 = 81920;
        String strF = l10 == null ? " maxStorageSizeInBytes" : "";
        if (num == null) {
            strF = strF.concat(" loadBatchSize");
        }
        if (num2 == null) {
            strF = a0.h.F(strF, " criticalSectionEnterTimeoutMs");
        }
        if (l11 == null) {
            strF = a0.h.F(strF, " eventCleanUpAge");
        }
        if (num3 == null) {
            strF = a0.h.F(strF, " maxBlobByteSizePerRow");
        }
        if (!strF.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }
        f18912f = new a(l10.longValue(), num.intValue(), num2.intValue(), l11.longValue(), num3.intValue());
    }

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.f18913a = j10;
        this.f18914b = i10;
        this.f18915c = i11;
        this.f18916d = j11;
        this.f18917e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18913a == aVar.f18913a && this.f18914b == aVar.f18914b && this.f18915c == aVar.f18915c && this.f18916d == aVar.f18916d && this.f18917e == aVar.f18917e;
    }

    public final int hashCode() {
        long j10 = this.f18913a;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f18914b) * 1000003) ^ this.f18915c) * 1000003;
        long j11 = this.f18916d;
        return this.f18917e ^ ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f18913a);
        sb.append(", loadBatchSize=");
        sb.append(this.f18914b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f18915c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f18916d);
        sb.append(", maxBlobByteSizePerRow=");
        return r.f(sb, this.f18917e, "}");
    }
}