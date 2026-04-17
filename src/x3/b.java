package x3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f18918a;

    /* renamed from: b, reason: collision with root package name */
    public final r3.i f18919b;

    /* renamed from: c, reason: collision with root package name */
    public final r3.h f18920c;

    public b(long j10, r3.i iVar, r3.h hVar) {
        this.f18918a = j10;
        if (iVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f18919b = iVar;
        this.f18920c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18918a == bVar.f18918a && this.f18919b.equals(bVar.f18919b) && this.f18920c.equals(bVar.f18920c);
    }

    public final int hashCode() {
        long j10 = this.f18918a;
        return this.f18920c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f18919b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f18918a + ", transportContext=" + this.f18919b + ", event=" + this.f18920c + "}";
    }
}