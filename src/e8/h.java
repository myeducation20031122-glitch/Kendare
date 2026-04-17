package e8;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h implements b8.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12558a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12559b = false;

    /* renamed from: c, reason: collision with root package name */
    public b8.c f12560c;

    /* renamed from: d, reason: collision with root package name */
    public final f f12561d;

    public h(f fVar) {
        this.f12561d = fVar;
    }

    @Override // b8.g
    public final b8.g b(String str) {
        if (this.f12558a) {
            throw new b8.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f12558a = true;
        this.f12561d.g(this.f12560c, str, this.f12559b);
        return this;
    }

    @Override // b8.g
    public final b8.g c(boolean z7) {
        if (this.f12558a) {
            throw new b8.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f12558a = true;
        this.f12561d.b(this.f12560c, z7 ? 1 : 0, this.f12559b);
        return this;
    }
}