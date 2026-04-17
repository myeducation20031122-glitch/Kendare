package s2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16798b;

    /* renamed from: e, reason: collision with root package name */
    public final e3.f f16799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f16800f;

    public /* synthetic */ r(u uVar, e3.f fVar, int i10) {
        this.f16798b = i10;
        this.f16800f = uVar;
        this.f16799e = fVar;
    }

    private void a() {
        e3.g gVar = (e3.g) this.f16799e;
        gVar.f12487b.a();
        synchronized (gVar.f12488c) {
            synchronized (this.f16800f) {
                try {
                    t tVar = this.f16800f.f16806b;
                    e3.f fVar = this.f16799e;
                    tVar.getClass();
                    if (tVar.f16803b.contains(new s(fVar, i3.g.f13292b))) {
                        u uVar = this.f16800f;
                        e3.f fVar2 = this.f16799e;
                        uVar.getClass();
                        try {
                            ((e3.g) fVar2).h(uVar.W, 5);
                        } catch (Throwable th) {
                            throw new d(th);
                        }
                    }
                    this.f16800f.c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16798b) {
            case 0:
                a();
                return;
            default:
                e3.g gVar = (e3.g) this.f16799e;
                gVar.f12487b.a();
                synchronized (gVar.f12488c) {
                    synchronized (this.f16800f) {
                        try {
                            t tVar = this.f16800f.f16806b;
                            e3.f fVar = this.f16799e;
                            tVar.getClass();
                            if (tVar.f16803b.contains(new s(fVar, i3.g.f13292b))) {
                                this.f16800f.Y.a();
                                u uVar = this.f16800f;
                                e3.f fVar2 = this.f16799e;
                                uVar.getClass();
                                try {
                                    ((e3.g) fVar2).m(uVar.Y, uVar.U, uVar.f16807b0);
                                    this.f16800f.j(this.f16799e);
                                } catch (Throwable th) {
                                    throw new d(th);
                                }
                            }
                            this.f16800f.c();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return;
        }
    }
}