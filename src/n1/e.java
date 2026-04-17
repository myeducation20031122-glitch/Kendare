package n1;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f15275a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15276b;

    /* renamed from: c, reason: collision with root package name */
    public final List f15277c;

    public e(String str, List list, boolean z7) {
        this.f15275a = str;
        this.f15276b = z7;
        this.f15277c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f15276b != eVar.f15276b || !this.f15277c.equals(eVar.f15277c)) {
            return false;
        }
        String str = this.f15275a;
        boolean zStartsWith = str.startsWith("index_");
        String str2 = eVar.f15275a;
        return zStartsWith ? str2.startsWith("index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f15275a;
        return this.f15277c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f15276b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f15275a + "', unique=" + this.f15276b + ", columns=" + this.f15277c + '}';
    }
}