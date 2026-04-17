package fc;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b0 implements i0 {
    public final boolean b;

    public b0(boolean z) {
        this.b = z;
    }

    @Override // fc.i0
    public final boolean a() {
        return this.b;
    }

    @Override // fc.i0
    public final v0 c() {
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Empty{");
        sb2.append(this.b ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}