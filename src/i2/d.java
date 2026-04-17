package i2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f13246a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f13247b;

    public d(String str, long j10) {
        this.f13246a = str;
        this.f13247b = Long.valueOf(j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f13246a.equals(dVar.f13246a)) {
            return false;
        }
        Long l10 = dVar.f13247b;
        Long l11 = this.f13247b;
        return l11 != null ? l11.equals(l10) : l10 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f13246a.hashCode() * 31;
        Long l10 = this.f13247b;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }
}