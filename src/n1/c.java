package n1;

import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f15266a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15267b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15268c;

    /* renamed from: d, reason: collision with root package name */
    public final List f15269d;

    /* renamed from: e, reason: collision with root package name */
    public final List f15270e;

    public c(String str, String str2, String str3, List list, List list2) {
        this.f15266a = str;
        this.f15267b = str2;
        this.f15268c = str3;
        this.f15269d = Collections.unmodifiableList(list);
        this.f15270e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f15266a.equals(cVar.f15266a) && this.f15267b.equals(cVar.f15267b) && this.f15268c.equals(cVar.f15268c) && this.f15269d.equals(cVar.f15269d)) {
            return this.f15270e.equals(cVar.f15270e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15270e.hashCode() + ((this.f15269d.hashCode() + ((this.f15268c.hashCode() + ((this.f15267b.hashCode() + (this.f15266a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f15266a + "', onDelete='" + this.f15267b + "', onUpdate='" + this.f15268c + "', columnNames=" + this.f15269d + ", referenceColumnNames=" + this.f15270e + '}';
    }
}