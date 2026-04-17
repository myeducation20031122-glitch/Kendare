package q3;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f16227a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16228b;

    /* renamed from: c, reason: collision with root package name */
    public final y f16229c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f16230d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16231e;

    /* renamed from: f, reason: collision with root package name */
    public final List f16232f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f16233g;

    public t(long j10, long j11, y yVar, Integer num, String str, List list, i0 i0Var) {
        this.f16227a = j10;
        this.f16228b = j11;
        this.f16229c = yVar;
        this.f16230d = num;
        this.f16231e = str;
        this.f16232f = list;
        this.f16233g = i0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        t tVar = (t) ((e0) obj);
        if (this.f16227a == tVar.f16227a) {
            if (this.f16228b == tVar.f16228b) {
                y yVar = tVar.f16229c;
                y yVar2 = this.f16229c;
                if (yVar2 != null ? yVar2.equals(yVar) : yVar == null) {
                    Integer num = tVar.f16230d;
                    Integer num2 = this.f16230d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = tVar.f16231e;
                        String str2 = this.f16231e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = tVar.f16232f;
                            List list2 = this.f16232f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                i0 i0Var = tVar.f16233g;
                                i0 i0Var2 = this.f16233g;
                                if (i0Var2 == null) {
                                    if (i0Var == null) {
                                        return true;
                                    }
                                } else if (i0Var2.equals(i0Var)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f16227a;
        long j11 = this.f16228b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        y yVar = this.f16229c;
        int iHashCode = (i10 ^ (yVar == null ? 0 : yVar.hashCode())) * 1000003;
        Integer num = this.f16230d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f16231e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f16232f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        i0 i0Var = this.f16233g;
        return iHashCode4 ^ (i0Var != null ? i0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f16227a + ", requestUptimeMs=" + this.f16228b + ", clientInfo=" + this.f16229c + ", logSource=" + this.f16230d + ", logSourceName=" + this.f16231e + ", logEvents=" + this.f16232f + ", qosTier=" + this.f16233g + "}";
    }
}