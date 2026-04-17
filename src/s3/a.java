package s3;

import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f16834a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16835b;

    public a(int i10, long j10) {
        if (i10 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f16834a = i10;
        this.f16835b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return v.h.a(this.f16834a, aVar.f16834a) && this.f16835b == aVar.f16835b;
    }

    public final int hashCode() {
        int iB = (v.h.b(this.f16834a) ^ 1000003) * 1000003;
        long j10 = this.f16835b;
        return iB ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(r.r(this.f16834a));
        sb.append(", nextRequestWaitMillis=");
        return a0.h.x(sb, this.f16835b, "}");
    }
}