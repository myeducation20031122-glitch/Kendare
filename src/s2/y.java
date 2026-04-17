package s2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16825b;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16826e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f16827f;

    /* renamed from: j, reason: collision with root package name */
    public final x f16828j;

    /* renamed from: m, reason: collision with root package name */
    public final q2.j f16829m;

    /* renamed from: n, reason: collision with root package name */
    public int f16830n;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16831t;

    public y(e0 e0Var, boolean z7, boolean z10, q2.j jVar, x xVar) {
        if (e0Var == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f16827f = e0Var;
        this.f16825b = z7;
        this.f16826e = z10;
        this.f16829m = jVar;
        if (xVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f16828j = xVar;
    }

    public final synchronized void a() {
        if (this.f16831t) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f16830n++;
    }

    @Override // s2.e0
    public final int b() {
        return this.f16827f.b();
    }

    @Override // s2.e0
    public final Class c() {
        return this.f16827f.c();
    }

    @Override // s2.e0
    public final synchronized void d() {
        if (this.f16830n > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f16831t) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f16831t = true;
        if (this.f16826e) {
            this.f16827f.d();
        }
    }

    public final void e() {
        boolean z7;
        synchronized (this) {
            int i10 = this.f16830n;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z7 = true;
            int i11 = i10 - 1;
            this.f16830n = i11;
            if (i11 != 0) {
                z7 = false;
            }
        }
        if (z7) {
            ((q) this.f16828j).f(this.f16829m, this);
        }
    }

    @Override // s2.e0
    public final Object get() {
        return this.f16827f.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f16825b + ", listener=" + this.f16828j + ", key=" + this.f16829m + ", acquired=" + this.f16830n + ", isRecycled=" + this.f16831t + ", resource=" + this.f16827f + '}';
    }
}