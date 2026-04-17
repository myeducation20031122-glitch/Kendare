package o3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15691a;

    /* renamed from: b, reason: collision with root package name */
    public final d f15692b;

    /* renamed from: c, reason: collision with root package name */
    public final b f15693c;

    public a(Object obj, d dVar, b bVar) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f15691a = obj;
        this.f15692b = dVar;
        this.f15693c = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (this.f15691a.equals(aVar.f15691a) && this.f15692b.equals(aVar.f15692b)) {
            b bVar = aVar.f15693c;
            b bVar2 = this.f15693c;
            if (bVar2 == null) {
                if (bVar == null) {
                    return true;
                }
            } else if (bVar2.equals(bVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f15691a.hashCode() ^ (-721379959)) * 1000003) ^ this.f15692b.hashCode()) * 1000003;
        b bVar = this.f15693c;
        return iHashCode ^ (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f15691a + ", priority=" + this.f15692b + ", productData=" + this.f15693c + "}";
    }
}