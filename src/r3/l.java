package r3;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final o3.c f16418a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f16419b;

    public l(o3.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f16418a = cVar;
        this.f16419b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f16418a.equals(lVar.f16418a)) {
            return Arrays.equals(this.f16419b, lVar.f16419b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16418a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f16419b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f16418a + ", bytes=[...]}";
    }
}