package i2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f13248a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13249b;

    public e(String str, int i10) {
        this.f13248a = str;
        this.f13249b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f13249b != eVar.f13249b) {
            return false;
        }
        return this.f13248a.equals(eVar.f13248a);
    }

    public final int hashCode() {
        return (this.f13248a.hashCode() * 31) + this.f13249b;
    }
}