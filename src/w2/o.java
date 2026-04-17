package w2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f18575a;

    public o(String str) {
        this.f18575a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f18575a.equals(((o) obj).f18575a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18575a.hashCode();
    }

    public final String toString() {
        return kc.r.g(new StringBuilder("StringHeaderFactory{value='"), this.f18575a, "'}");
    }
}