package t7;

import com.google.android.gms.internal.measurement.l9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17926a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17927b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17928c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17929d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17930e;

    /* renamed from: f, reason: collision with root package name */
    public final l9 f17931f;

    public s0(String str, String str2, String str3, String str4, int i10, l9 l9Var) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f17926a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f17927b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f17928c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f17929d = str4;
        this.f17930e = i10;
        if (l9Var == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f17931f = l9Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f17926a.equals(s0Var.f17926a) && this.f17927b.equals(s0Var.f17927b) && this.f17928c.equals(s0Var.f17928c) && this.f17929d.equals(s0Var.f17929d) && this.f17930e == s0Var.f17930e && this.f17931f.equals(s0Var.f17931f);
    }

    public final int hashCode() {
        return ((((((((((this.f17926a.hashCode() ^ 1000003) * 1000003) ^ this.f17927b.hashCode()) * 1000003) ^ this.f17928c.hashCode()) * 1000003) ^ this.f17929d.hashCode()) * 1000003) ^ this.f17930e) * 1000003) ^ this.f17931f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f17926a + ", versionCode=" + this.f17927b + ", versionName=" + this.f17928c + ", installUuid=" + this.f17929d + ", deliveryMechanism=" + this.f17930e + ", developmentPlatformProvider=" + this.f17931f + "}";
    }
}