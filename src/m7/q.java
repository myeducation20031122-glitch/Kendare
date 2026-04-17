package m7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q implements i8.c, i8.b {

    /* renamed from: c, reason: collision with root package name */
    public static final o0.h f15216c = new o0.h(23);

    /* renamed from: d, reason: collision with root package name */
    public static final f f15217d = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public i8.a f15218a;

    /* renamed from: b, reason: collision with root package name */
    public volatile i8.c f15219b;

    public q(o0.h hVar, i8.c cVar) {
        this.f15218a = hVar;
        this.f15219b = cVar;
    }

    public final void a(i8.a aVar) {
        i8.c cVar;
        i8.c cVar2;
        i8.c cVar3 = this.f15219b;
        f fVar = f15217d;
        if (cVar3 != fVar) {
            aVar.d(cVar3);
            return;
        }
        synchronized (this) {
            cVar = this.f15219b;
            if (cVar != fVar) {
                cVar2 = cVar;
            } else {
                this.f15218a = new w3.i(2, this.f15218a, aVar);
                cVar2 = null;
            }
        }
        if (cVar2 != null) {
            aVar.d(cVar);
        }
    }

    @Override // i8.c
    public final Object get() {
        return this.f15219b.get();
    }
}