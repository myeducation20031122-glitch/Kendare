package q3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o extends y {

    /* renamed from: a, reason: collision with root package name */
    public final x f16213a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16214b;

    public o(x xVar, a aVar) {
        this.f16213a = xVar;
        this.f16214b = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        x xVar = this.f16213a;
        if (xVar != null ? xVar.equals(((o) yVar).f16213a) : ((o) yVar).f16213a == null) {
            a aVar = this.f16214b;
            o oVar = (o) yVar;
            if (aVar == null) {
                if (oVar.f16214b == null) {
                    return true;
                }
            } else if (aVar.equals(oVar.f16214b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        x xVar = this.f16213a;
        int iHashCode = ((xVar == null ? 0 : xVar.hashCode()) ^ 1000003) * 1000003;
        a aVar = this.f16214b;
        return (aVar != null ? aVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f16213a + ", androidClientInfo=" + this.f16214b + "}";
    }
}