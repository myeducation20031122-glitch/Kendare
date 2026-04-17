package q3;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f16219a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f16220b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f16221c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16222d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f16223e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16224f;

    /* renamed from: g, reason: collision with root package name */
    public final long f16225g;

    /* renamed from: h, reason: collision with root package name */
    public final h0 f16226h;

    public s(long j10, Integer num, a0 a0Var, long j11, byte[] bArr, String str, long j12, h0 h0Var) {
        this.f16219a = j10;
        this.f16220b = num;
        this.f16221c = a0Var;
        this.f16222d = j11;
        this.f16223e = bArr;
        this.f16224f = str;
        this.f16225g = j12;
        this.f16226h = h0Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        a0 a0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        s sVar = (s) d0Var;
        if (this.f16219a == sVar.f16219a && ((num = this.f16220b) != null ? num.equals(sVar.f16220b) : sVar.f16220b == null) && ((a0Var = this.f16221c) != null ? a0Var.equals(sVar.f16221c) : sVar.f16221c == null)) {
            if (this.f16222d == sVar.f16222d) {
                if (Arrays.equals(this.f16223e, d0Var instanceof s ? ((s) d0Var).f16223e : sVar.f16223e)) {
                    String str = sVar.f16224f;
                    String str2 = this.f16224f;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f16225g == sVar.f16225g) {
                            h0 h0Var = sVar.f16226h;
                            h0 h0Var2 = this.f16226h;
                            if (h0Var2 == null) {
                                if (h0Var == null) {
                                    return true;
                                }
                            } else if (h0Var2.equals(h0Var)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f16219a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f16220b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        a0 a0Var = this.f16221c;
        int iHashCode2 = (iHashCode ^ (a0Var == null ? 0 : a0Var.hashCode())) * 1000003;
        long j11 = this.f16222d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f16223e)) * 1000003;
        String str = this.f16224f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f16225g;
        int i11 = (iHashCode4 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        h0 h0Var = this.f16226h;
        return i11 ^ (h0Var != null ? h0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f16219a + ", eventCode=" + this.f16220b + ", complianceData=" + this.f16221c + ", eventUptimeMs=" + this.f16222d + ", sourceExtension=" + Arrays.toString(this.f16223e) + ", sourceExtensionJsonProto3=" + this.f16224f + ", timezoneOffsetSeconds=" + this.f16225g + ", networkConnectionInfo=" + this.f16226h + "}";
    }
}