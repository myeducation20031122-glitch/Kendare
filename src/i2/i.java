package i2;

import z1.x;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public String f13256a;

    /* renamed from: b, reason: collision with root package name */
    public x f13257b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f13257b != iVar.f13257b) {
            return false;
        }
        return this.f13256a.equals(iVar.f13256a);
    }

    public final int hashCode() {
        return this.f13257b.hashCode() + (this.f13256a.hashCode() * 31);
    }
}