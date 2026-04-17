package q3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f16217a;

    public q(Integer num) {
        this.f16217a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        Integer num = this.f16217a;
        return num == null ? ((q) b0Var).f16217a == null : num.equals(((q) b0Var).f16217a);
    }

    public final int hashCode() {
        Integer num = this.f16217a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f16217a + "}";
    }
}