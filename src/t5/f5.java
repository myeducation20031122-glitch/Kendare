package t5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17350b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c3 f17351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h5 f17352f;

    public /* synthetic */ f5(h5 h5Var, c3 c3Var, int i10) {
        this.f17350b = i10;
        this.f17352f = h5Var;
        this.f17351e = c3Var;
    }

    private final void a() {
        synchronized (this.f17352f) {
            try {
                this.f17352f.f17383b = false;
                if (!this.f17352f.f17385f.u()) {
                    i3 i3Var = ((b4) this.f17352f.f17385f.f15046b).f17251w;
                    b4.i(i3Var);
                    i3Var.Q.a("Connected to service");
                    i5 i5Var = this.f17352f.f17385f;
                    c3 c3Var = this.f17351e;
                    i5Var.o();
                    fc.t.k(c3Var);
                    i5Var.f17428j = c3Var;
                    i5Var.A();
                    i5Var.z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17350b) {
            case 0:
                a();
                return;
            default:
                synchronized (this.f17352f) {
                    try {
                        this.f17352f.f17383b = false;
                        if (!this.f17352f.f17385f.u()) {
                            i3 i3Var = ((b4) this.f17352f.f17385f.f15046b).f17251w;
                            b4.i(i3Var);
                            i3Var.P.a("Connected to remote service");
                            i5 i5Var = this.f17352f.f17385f;
                            c3 c3Var = this.f17351e;
                            i5Var.o();
                            fc.t.k(c3Var);
                            i5Var.f17428j = c3Var;
                            i5Var.A();
                            i5Var.z();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}