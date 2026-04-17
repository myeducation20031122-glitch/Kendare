package e3;

import com.google.android.gms.internal.ads.ic1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final d f12512a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12513b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f12514c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f12515d;

    /* renamed from: e, reason: collision with root package name */
    public int f12516e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f12517f = 3;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12518g;

    public h(Object obj, d dVar) {
        this.f12513b = obj;
        this.f12512a = dVar;
    }

    @Override // e3.d, e3.c
    public final boolean a() {
        boolean z7;
        synchronized (this.f12513b) {
            try {
                z7 = this.f12515d.a() || this.f12514c.a();
            } finally {
            }
        }
        return z7;
    }

    @Override // e3.d
    public final boolean b(c cVar) {
        boolean z7;
        synchronized (this.f12513b) {
            try {
                d dVar = this.f12512a;
                z7 = (dVar == null || dVar.b(this)) && cVar.equals(this.f12514c) && !a();
            } finally {
            }
        }
        return z7;
    }

    @Override // e3.d
    public final void c(c cVar) {
        synchronized (this.f12513b) {
            try {
                if (cVar.equals(this.f12515d)) {
                    this.f12517f = 4;
                    return;
                }
                this.f12516e = 4;
                d dVar = this.f12512a;
                if (dVar != null) {
                    dVar.c(this);
                }
                if (!ic1.a(this.f12517f)) {
                    this.f12515d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e3.c
    public final void clear() {
        synchronized (this.f12513b) {
            this.f12518g = false;
            this.f12516e = 3;
            this.f12517f = 3;
            this.f12515d.clear();
            this.f12514c.clear();
        }
    }

    @Override // e3.c
    public final boolean d(c cVar) {
        if (!(cVar instanceof h)) {
            return false;
        }
        h hVar = (h) cVar;
        if (this.f12514c == null) {
            if (hVar.f12514c != null) {
                return false;
            }
        } else if (!this.f12514c.d(hVar.f12514c)) {
            return false;
        }
        if (this.f12515d == null) {
            if (hVar.f12515d != null) {
                return false;
            }
        } else if (!this.f12515d.d(hVar.f12515d)) {
            return false;
        }
        return true;
    }

    @Override // e3.c
    public final boolean e() {
        boolean z7;
        synchronized (this.f12513b) {
            z7 = this.f12516e == 3;
        }
        return z7;
    }

    @Override // e3.d
    public final boolean f(c cVar) {
        boolean z7;
        synchronized (this.f12513b) {
            try {
                d dVar = this.f12512a;
                z7 = (dVar == null || dVar.f(this)) && (cVar.equals(this.f12514c) || this.f12516e != 4);
            } finally {
            }
        }
        return z7;
    }

    @Override // e3.d
    public final void g(c cVar) {
        synchronized (this.f12513b) {
            try {
                if (!cVar.equals(this.f12514c)) {
                    this.f12517f = 5;
                    return;
                }
                this.f12516e = 5;
                d dVar = this.f12512a;
                if (dVar != null) {
                    dVar.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e3.d
    public final boolean h(c cVar) {
        boolean z7;
        synchronized (this.f12513b) {
            try {
                d dVar = this.f12512a;
                z7 = (dVar == null || dVar.h(this)) && cVar.equals(this.f12514c) && this.f12516e != 2;
            } finally {
            }
        }
        return z7;
    }

    @Override // e3.d
    public final d i() {
        d dVarI;
        synchronized (this.f12513b) {
            try {
                d dVar = this.f12512a;
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
        synchronized (this.f12513b) {
            z7 = true;
            if (this.f12516e != 1) {
                z7 = false;
            }
        }
        return z7;
    }

    @Override // e3.c
    public final void j() {
        synchronized (this.f12513b) {
            try {
                if (!ic1.a(this.f12517f)) {
                    this.f12517f = 2;
                    this.f12515d.j();
                }
                if (!ic1.a(this.f12516e)) {
                    this.f12516e = 2;
                    this.f12514c.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e3.c
    public final void k() {
        synchronized (this.f12513b) {
            try {
                this.f12518g = true;
                try {
                    if (this.f12516e != 4 && this.f12517f != 1) {
                        this.f12517f = 1;
                        this.f12515d.k();
                    }
                    if (this.f12518g && this.f12516e != 1) {
                        this.f12516e = 1;
                        this.f12514c.k();
                    }
                    this.f12518g = false;
                } catch (Throwable th) {
                    this.f12518g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // e3.c
    public final boolean l() {
        boolean z7;
        synchronized (this.f12513b) {
            z7 = this.f12516e == 4;
        }
        return z7;
    }
}