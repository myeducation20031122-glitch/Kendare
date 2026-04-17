package e3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12480a;

    /* renamed from: b, reason: collision with root package name */
    public final d f12481b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f12482c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f12483d;

    /* renamed from: e, reason: collision with root package name */
    public int f12484e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f12485f = 3;

    public b(Object obj, d dVar) {
        this.f12480a = obj;
        this.f12481b = dVar;
    }

    @Override // e3.d, e3.c
    public final boolean a() {
        boolean z7;
        synchronized (this.f12480a) {
            try {
                z7 = this.f12482c.a() || this.f12483d.a();
            } finally {
            }
        }
        return z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    @Override // e3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(c cVar) {
        int i10;
        boolean z7;
        synchronized (this.f12480a) {
            d dVar = this.f12481b;
            if (dVar == null || dVar.b(this)) {
                if (this.f12484e != 5) {
                    z7 = cVar.equals(this.f12482c);
                } else if (!cVar.equals(this.f12483d) || ((i10 = this.f12485f) != 4 && i10 != 5)) {
                }
            }
        }
        return z7;
    }

    @Override // e3.d
    public final void c(c cVar) {
        synchronized (this.f12480a) {
            try {
                if (cVar.equals(this.f12482c)) {
                    this.f12484e = 4;
                } else if (cVar.equals(this.f12483d)) {
                    this.f12485f = 4;
                }
                d dVar = this.f12481b;
                if (dVar != null) {
                    dVar.c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e3.c
    public final void clear() {
        synchronized (this.f12480a) {
            try {
                this.f12484e = 3;
                this.f12482c.clear();
                if (this.f12485f != 3) {
                    this.f12485f = 3;
                    this.f12483d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e3.c
    public final boolean d(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        return this.f12482c.d(bVar.f12482c) && this.f12483d.d(bVar.f12483d);
    }

    @Override // e3.c
    public final boolean e() {
        boolean z7;
        synchronized (this.f12480a) {
            try {
                z7 = this.f12484e == 3 && this.f12485f == 3;
            } finally {
            }
        }
        return z7;
    }

    @Override // e3.d
    public final boolean f(c cVar) {
        boolean z7;
        synchronized (this.f12480a) {
            d dVar = this.f12481b;
            z7 = dVar == null || dVar.f(this);
        }
        return z7;
    }

    @Override // e3.d
    public final void g(c cVar) {
        synchronized (this.f12480a) {
            try {
                if (cVar.equals(this.f12483d)) {
                    this.f12485f = 5;
                    d dVar = this.f12481b;
                    if (dVar != null) {
                        dVar.g(this);
                    }
                    return;
                }
                this.f12484e = 5;
                if (this.f12485f != 1) {
                    this.f12485f = 1;
                    this.f12483d.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e3.d
    public final boolean h(c cVar) {
        boolean z7;
        synchronized (this.f12480a) {
            d dVar = this.f12481b;
            z7 = (dVar == null || dVar.h(this)) && cVar.equals(this.f12482c);
        }
        return z7;
    }

    @Override // e3.d
    public final d i() {
        d dVarI;
        synchronized (this.f12480a) {
            try {
                d dVar = this.f12481b;
                dVarI = dVar != null ? dVar.i() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVarI;
    }

    @Override // e3.c
    public final boolean isRunning() {
        boolean z7;
        synchronized (this.f12480a) {
            try {
                z7 = true;
                if (this.f12484e != 1 && this.f12485f != 1) {
                    z7 = false;
                }
            } finally {
            }
        }
        return z7;
    }

    @Override // e3.c
    public final void j() {
        synchronized (this.f12480a) {
            try {
                if (this.f12484e == 1) {
                    this.f12484e = 2;
                    this.f12482c.j();
                }
                if (this.f12485f == 1) {
                    this.f12485f = 2;
                    this.f12483d.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e3.c
    public final void k() {
        synchronized (this.f12480a) {
            try {
                if (this.f12484e != 1) {
                    this.f12484e = 1;
                    this.f12482c.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e3.c
    public final boolean l() {
        boolean z7;
        synchronized (this.f12480a) {
            try {
                z7 = this.f12484e == 4 || this.f12485f == 4;
            } finally {
            }
        }
        return z7;
    }
}