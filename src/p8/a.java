package p8;

import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f16067a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16068b;

    public a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f16067a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f16068b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16067a.equals(aVar.f16067a) && this.f16068b.equals(aVar.f16068b);
    }

    public final int hashCode() {
        return ((this.f16067a.hashCode() ^ 1000003) * 1000003) ^ this.f16068b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f16067a);
        sb.append(", version=");
        return r.g(sb, this.f16068b, "}");
    }
}