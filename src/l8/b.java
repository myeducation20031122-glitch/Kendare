package l8;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f14668a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14669b;

    /* renamed from: c, reason: collision with root package name */
    public final f f14670c;

    public b(String str, long j10, f fVar) {
        this.f14668a = str;
        this.f14669b = j10;
        this.f14670c = fVar;
    }

    public static o5.d a() {
        o5.d dVar = new o5.d(19);
        dVar.f15722f = 0L;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f14668a;
        if (str != null ? str.equals(bVar.f14668a) : bVar.f14668a == null) {
            if (this.f14669b == bVar.f14669b) {
                f fVar = bVar.f14670c;
                f fVar2 = this.f14670c;
                if (fVar2 == null) {
                    if (fVar == null) {
                        return true;
                    }
                } else if (fVar2.equals(fVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f14668a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f14669b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        f fVar = this.f14670c;
        return (fVar != null ? fVar.hashCode() : 0) ^ i10;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f14668a + ", tokenExpirationTimestamp=" + this.f14669b + ", responseCode=" + this.f14670c + "}";
    }
}