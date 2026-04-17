package k8;

import kc.r;
import m.s3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f14029h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f14030a;

    /* renamed from: b, reason: collision with root package name */
    public final c f14031b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14032c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14033d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14034e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14035f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14036g;

    static {
        s3 s3Var = new s3(13);
        s3Var.f14932n = 0L;
        s3Var.g(c.f14040b);
        s3Var.f14931m = 0L;
        s3Var.b();
    }

    public a(String str, c cVar, String str2, String str3, long j10, long j11, String str4) {
        this.f14030a = str;
        this.f14031b = cVar;
        this.f14032c = str2;
        this.f14033d = str3;
        this.f14034e = j10;
        this.f14035f = j11;
        this.f14036g = str4;
    }

    public final s3 a() {
        s3 s3Var = new s3();
        s3Var.f14927b = this.f14030a;
        s3Var.f14928e = this.f14031b;
        s3Var.f14929f = this.f14032c;
        s3Var.f14930j = this.f14033d;
        s3Var.f14931m = Long.valueOf(this.f14034e);
        s3Var.f14932n = Long.valueOf(this.f14035f);
        s3Var.f14933t = this.f14036g;
        return s3Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f14030a;
        if (str != null ? str.equals(aVar.f14030a) : aVar.f14030a == null) {
            if (this.f14031b.equals(aVar.f14031b)) {
                String str2 = aVar.f14032c;
                String str3 = this.f14032c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = aVar.f14033d;
                    String str5 = this.f14033d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.f14034e == aVar.f14034e && this.f14035f == aVar.f14035f) {
                            String str6 = aVar.f14036g;
                            String str7 = this.f14036g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
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
        String str = this.f14030a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f14031b.hashCode()) * 1000003;
        String str2 = this.f14032c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f14033d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f14034e;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f14035f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f14036g;
        return (str4 != null ? str4.hashCode() : 0) ^ i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f14030a);
        sb.append(", registrationStatus=");
        sb.append(this.f14031b);
        sb.append(", authToken=");
        sb.append(this.f14032c);
        sb.append(", refreshToken=");
        sb.append(this.f14033d);
        sb.append(", expiresInSecs=");
        sb.append(this.f14034e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f14035f);
        sb.append(", fisError=");
        return r.g(sb, this.f14036g, "}");
    }
}