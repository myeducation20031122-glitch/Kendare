package t2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public final c f17123a;

    /* renamed from: b, reason: collision with root package name */
    public int f17124b;

    /* renamed from: c, reason: collision with root package name */
    public Class f17125c;

    public g(c cVar) {
        this.f17123a = cVar;
    }

    @Override // t2.k
    public final void a() {
        this.f17123a.k(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f17124b == gVar.f17124b && this.f17125c == gVar.f17125c;
    }

    public final int hashCode() {
        int i10 = this.f17124b * 31;
        Class cls = this.f17125c;
        return i10 + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f17124b + "array=" + this.f17125c + '}';
    }
}