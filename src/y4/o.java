package y4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o extends UnsupportedOperationException {

    /* renamed from: b, reason: collision with root package name */
    public final x4.d f19263b;

    public o(x4.d dVar) {
        this.f19263b = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f19263b));
    }
}