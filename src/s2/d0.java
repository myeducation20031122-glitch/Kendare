package s2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d0 implements e0, j3.b {

    /* renamed from: m, reason: collision with root package name */
    public static final g.e f16697m = j3.d.a(20, new g8.e());

    /* renamed from: b, reason: collision with root package name */
    public final j3.e f16698b = new j3.e();

    /* renamed from: e, reason: collision with root package name */
    public e0 f16699e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16700f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16701j;

    public final synchronized void a() {
        this.f16698b.a();
        if (!this.f16700f) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f16700f = false;
        if (this.f16701j) {
            d();
        }
    }

    @Override // s2.e0
    public final int b() {
        return this.f16699e.b();
    }

    @Override // s2.e0
    public final Class c() {
        return this.f16699e.c();
    }

    @Override // s2.e0
    public final synchronized void d() {
        this.f16698b.a();
        this.f16701j = true;
        if (!this.f16700f) {
            this.f16699e.d();
            this.f16699e = null;
            f16697m.d(this);
        }
    }

    @Override // j3.b
    public final j3.e g() {
        return this.f16698b;
    }

    @Override // s2.e0
    public final Object get() {
        return this.f16699e.get();
    }
}