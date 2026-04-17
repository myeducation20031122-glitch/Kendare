package s2;

import java.security.MessageDigest;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements q2.j {

    /* renamed from: b, reason: collision with root package name */
    public final q2.j f16711b;

    /* renamed from: c, reason: collision with root package name */
    public final q2.j f16712c;

    public f(q2.j jVar, q2.j jVar2) {
        this.f16711b = jVar;
        this.f16712c = jVar2;
    }

    @Override // q2.j
    public final void a(MessageDigest messageDigest) {
        this.f16711b.a(messageDigest);
        this.f16712c.a(messageDigest);
    }

    @Override // q2.j
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f16711b.equals(fVar.f16711b) && this.f16712c.equals(fVar.f16712c);
    }

    @Override // q2.j
    public final int hashCode() {
        return this.f16712c.hashCode() + (this.f16711b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f16711b + ", signature=" + this.f16712c + '}';
    }
}