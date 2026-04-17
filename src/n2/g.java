package n2;

import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f15308a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15309b;

    public g(String str, String str2) {
        this.f15308a = str;
        this.f15309b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return TextUtils.equals(this.f15308a, gVar.f15308a) && TextUtils.equals(this.f15309b, gVar.f15309b);
    }

    public final int hashCode() {
        return this.f15309b.hashCode() + (this.f15308a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f15308a);
        sb.append(",value=");
        return kc.r.g(sb, this.f15309b, "]");
    }
}