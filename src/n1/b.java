package n1;

import java.util.Locale;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f15259a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15260b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15261c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15262d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15263e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15264f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15265g;

    public b(int i10, int i11, String str, String str2, String str3, boolean z7) {
        this.f15259a = str;
        this.f15260b = str2;
        this.f15262d = z7;
        this.f15263e = i10;
        int i12 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i12 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i12 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i12 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.f15261c = i12;
        this.f15264f = str3;
        this.f15265g = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f15263e != bVar.f15263e || !this.f15259a.equals(bVar.f15259a) || this.f15262d != bVar.f15262d) {
            return false;
        }
        String str = this.f15264f;
        int i10 = this.f15265g;
        int i11 = bVar.f15265g;
        String str2 = bVar.f15264f;
        if (i10 == 1 && i11 == 2 && str != null && !str.equals(str2)) {
            return false;
        }
        if (i10 != 2 || i11 != 1 || str2 == null || str2.equals(str)) {
            return (i10 == 0 || i10 != i11 || (str == null ? str2 == null : str.equals(str2))) && this.f15261c == bVar.f15261c;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f15259a.hashCode() * 31) + this.f15261c) * 31) + (this.f15262d ? 1231 : 1237)) * 31) + this.f15263e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f15259a);
        sb.append("', type='");
        sb.append(this.f15260b);
        sb.append("', affinity='");
        sb.append(this.f15261c);
        sb.append("', notNull=");
        sb.append(this.f15262d);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f15263e);
        sb.append(", defaultValue='");
        return r.g(sb, this.f15264f, "'}");
    }
}