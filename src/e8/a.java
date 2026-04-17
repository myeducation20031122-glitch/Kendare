package e8;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f12543a;

    /* renamed from: b, reason: collision with root package name */
    public final d f12544b;

    public a(int i10, d dVar) {
        this.f12543a = i10;
        this.f12544b = dVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f12543a == ((a) eVar).f12543a && this.f12544b.equals(((a) eVar).f12544b);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f12543a) + (this.f12544b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f12543a + "intEncoding=" + this.f12544b + ')';
    }
}