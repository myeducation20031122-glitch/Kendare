package s2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Object f16757a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16758b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16759c;

    public k(q2.c cVar, Object obj, q2.n nVar) {
        this.f16757a = cVar;
        this.f16758b = obj;
        this.f16759c = nVar;
    }

    public final void a(x4.k kVar, q2.n nVar) {
        try {
            kVar.a().e((q2.j) this.f16757a, new k((q2.q) this.f16758b, (d0) this.f16759c, nVar));
        } finally {
            ((d0) this.f16759c).a();
        }
    }

    public k(q qVar, e3.f fVar, u uVar) {
        this.f16759c = qVar;
        this.f16758b = fVar;
        this.f16757a = uVar;
    }
}