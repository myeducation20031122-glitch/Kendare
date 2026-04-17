package r3;

import java.util.HashMap;
import java.util.Map;
import m.s3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f16402a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f16403b;

    /* renamed from: c, reason: collision with root package name */
    public final l f16404c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16405d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16406e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f16407f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f16408g;

    public h(String str, Integer num, l lVar, long j10, long j11, Map map, Integer num2) {
        this.f16402a = str;
        this.f16403b = num;
        this.f16404c = lVar;
        this.f16405d = j10;
        this.f16406e = j11;
        this.f16407f = map;
        this.f16408g = num2;
    }

    public final String a(String str) {
        String str2 = (String) this.f16407f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f16407f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final s3 c() {
        s3 s3Var = new s3(3);
        String str = this.f16402a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        s3Var.f14927b = str;
        s3Var.f14928e = this.f16403b;
        s3Var.f14933t = this.f16408g;
        s3Var.f(this.f16404c);
        s3Var.f14930j = Long.valueOf(this.f16405d);
        s3Var.f14931m = Long.valueOf(this.f16406e);
        s3Var.f14932n = new HashMap(this.f16407f);
        return s3Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f16402a.equals(hVar.f16402a)) {
            Integer num = hVar.f16403b;
            Integer num2 = this.f16403b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f16404c.equals(hVar.f16404c) && this.f16405d == hVar.f16405d && this.f16406e == hVar.f16406e && this.f16407f.equals(hVar.f16407f)) {
                    Integer num3 = hVar.f16408g;
                    Integer num4 = this.f16408g;
                    if (num4 == null) {
                        if (num3 == null) {
                            return true;
                        }
                    } else if (num4.equals(num3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f16402a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f16403b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f16404c.hashCode()) * 1000003;
        long j10 = this.f16405d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f16406e;
        int iHashCode3 = (((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f16407f.hashCode()) * 1000003;
        Integer num2 = this.f16408g;
        return iHashCode3 ^ (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f16402a + ", code=" + this.f16403b + ", encodedPayload=" + this.f16404c + ", eventMillis=" + this.f16405d + ", uptimeMillis=" + this.f16406e + ", autoMetadata=" + this.f16407f + ", productId=" + this.f16408g + "}";
    }
}