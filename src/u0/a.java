package u0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f18114a;

    /* renamed from: b, reason: collision with root package name */
    public int f18115b;

    /* renamed from: c, reason: collision with root package name */
    public float f18116c;

    /* renamed from: d, reason: collision with root package name */
    public float f18117d;

    /* renamed from: e, reason: collision with root package name */
    public long f18118e;

    /* renamed from: f, reason: collision with root package name */
    public long f18119f;

    /* renamed from: g, reason: collision with root package name */
    public long f18120g;

    /* renamed from: h, reason: collision with root package name */
    public float f18121h;

    /* renamed from: i, reason: collision with root package name */
    public int f18122i;

    public final float a(long j10) {
        if (j10 < this.f18118e) {
            return 0.0f;
        }
        long j11 = this.f18120g;
        if (j11 < 0 || j10 < j11) {
            return g.b((j10 - r0) / this.f18114a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.f18121h;
        return (g.b((j10 - j11) / this.f18122i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}