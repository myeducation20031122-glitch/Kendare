package k2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends c7.b {
    @Override // c7.b
    public boolean a(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f13976e != cVar) {
                    return false;
                }
                hVar.f13976e = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c7.b
    public boolean b(u.g gVar, u.d dVar, u.d dVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f18112e != dVar) {
                    return false;
                }
                gVar.f18112e = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c7.b
    public boolean c(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f13975b != obj) {
                    return false;
                }
                hVar.f13975b = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c7.b
    public boolean d(u.g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f18111b != obj) {
                    return false;
                }
                gVar.f18111b = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c7.b
    public boolean e(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f13977f != gVar) {
                    return false;
                }
                hVar.f13977f = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c7.b
    public boolean f(u.g gVar, u.f fVar, u.f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f18113f != fVar) {
                    return false;
                }
                gVar.f18113f = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c7.b
    public void i(g gVar, g gVar2) {
        gVar.f13970b = gVar2;
    }

    @Override // c7.b
    public void j(u.f fVar, u.f fVar2) {
        fVar.f18106b = fVar2;
    }

    @Override // c7.b
    public void k(g gVar, Thread thread) {
        gVar.f13969a = thread;
    }

    @Override // c7.b
    public void l(u.f fVar, Thread thread) {
        fVar.f18105a = thread;
    }
}