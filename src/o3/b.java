package o3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f15694a;

    public b(Integer num) {
        this.f15694a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        Integer num = this.f15694a;
        return num == null ? bVar.f15694a == null : num.equals(bVar.f15694a);
    }

    public final int hashCode() {
        Integer num = this.f15694a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f15694a + "}";
    }
}