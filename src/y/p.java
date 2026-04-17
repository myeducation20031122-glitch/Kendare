package y;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f19179a;

    /* renamed from: b, reason: collision with root package name */
    public x.d f19180b;

    /* renamed from: c, reason: collision with root package name */
    public l f19181c;

    /* renamed from: d, reason: collision with root package name */
    public int f19182d;

    /* renamed from: e, reason: collision with root package name */
    public final g f19183e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f19184f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19185g = false;

    /* renamed from: h, reason: collision with root package name */
    public final f f19186h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public final f f19187i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f19188j = 1;

    public p(x.d dVar) {
        this.f19180b = dVar;
    }

    public static void b(f fVar, f fVar2, int i10) {
        fVar.f19157l.add(fVar2);
        fVar.f19151f = i10;
        fVar2.f19156k.add(fVar);
    }

    public static f h(x.c cVar) {
        p pVar;
        p pVar2;
        x.c cVar2 = cVar.f18762f;
        if (cVar2 == null) {
            return null;
        }
        int iB = v.h.b(cVar2.f18761e);
        x.d dVar = cVar2.f18760d;
        if (iB == 1) {
            pVar = dVar.f18772d;
        } else {
            if (iB != 2) {
                if (iB == 3) {
                    pVar2 = dVar.f18772d;
                } else {
                    if (iB != 4) {
                        if (iB != 5) {
                            return null;
                        }
                        return dVar.f18774e.f19163k;
                    }
                    pVar2 = dVar.f18774e;
                }
                return pVar2.f19187i;
            }
            pVar = dVar.f18774e;
        }
        return pVar.f19186h;
    }

    public static f i(x.c cVar, int i10) {
        x.c cVar2 = cVar.f18762f;
        if (cVar2 == null) {
            return null;
        }
        x.d dVar = cVar2.f18760d;
        p pVar = i10 == 0 ? dVar.f18772d : dVar.f18774e;
        int iB = v.h.b(cVar2.f18761e);
        if (iB == 1 || iB == 2) {
            return pVar.f19186h;
        }
        if (iB == 3 || iB == 4) {
            return pVar.f19187i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f19157l.add(fVar2);
        fVar.f19157l.add(this.f19183e);
        fVar.f19153h = i10;
        fVar.f19154i = gVar;
        fVar2.f19156k.add(fVar);
        gVar.f19156k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int iMax;
        if (i11 == 0) {
            x.d dVar = this.f19180b;
            int i12 = dVar.f18803v;
            iMax = Math.max(dVar.f18802u, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        } else {
            x.d dVar2 = this.f19180b;
            int i13 = dVar2.f18806y;
            iMax = Math.max(dVar2.f18805x, i10);
            if (i13 > 0) {
                iMax = Math.min(i13, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        }
        return iMax;
    }

    public long j() {
        if (this.f19183e.f19155j) {
            return r0.f19152g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(x.c cVar, x.c cVar2, int i10) {
        int iG;
        f fVarH = h(cVar);
        f fVarH2 = h(cVar2);
        if (fVarH.f19155j && fVarH2.f19155j) {
            int iE = cVar.e() + fVarH.f19152g;
            int iE2 = fVarH2.f19152g - cVar2.e();
            int i11 = iE2 - iE;
            g gVar = this.f19183e;
            if (!gVar.f19155j && this.f19182d == 3) {
                int i12 = this.f19179a;
                if (i12 == 0) {
                    iG = g(i11, i10);
                } else if (i12 == 1) {
                    iG = Math.min(g(gVar.f19158m, i10), i11);
                } else if (i12 == 2) {
                    x.d dVar = this.f19180b;
                    x.d dVar2 = dVar.T;
                    if (dVar2 != null) {
                        if ((i10 == 0 ? dVar2.f18772d : dVar2.f18774e).f19183e.f19155j) {
                            iG = g((int) ((r6.f19152g * (i10 == 0 ? dVar.f18804w : dVar.f18807z)) + 0.5f), i10);
                        }
                    }
                } else if (i12 == 3) {
                    x.d dVar3 = this.f19180b;
                    p pVar = dVar3.f18772d;
                    if (pVar.f19182d == 3 && pVar.f19179a == 3) {
                        m mVar = dVar3.f18774e;
                        if (mVar.f19182d != 3 || mVar.f19179a != 3) {
                        }
                    } else {
                        if (i10 == 0) {
                            pVar = dVar3.f18774e;
                        }
                        g gVar2 = pVar.f19183e;
                        if (gVar2.f19155j) {
                            float f10 = dVar3.W;
                            float f11 = gVar2.f19152g;
                            iG = i10 == 1 ? (int) ((f11 / f10) + 0.5f) : (int) ((f10 * f11) + 0.5f);
                        }
                    }
                }
                gVar.d(iG);
            }
            if (gVar.f19155j) {
                int i13 = gVar.f19152g;
                f fVar = this.f19187i;
                f fVar2 = this.f19186h;
                if (i13 == i11) {
                    fVar2.d(iE);
                    fVar.d(iE2);
                    return;
                }
                x.d dVar4 = this.f19180b;
                float f12 = i10 == 0 ? dVar4.f18773d0 : dVar4.f18775e0;
                if (fVarH == fVarH2) {
                    iE = fVarH.f19152g;
                    iE2 = fVarH2.f19152g;
                    f12 = 0.5f;
                }
                fVar2.d((int) ((((iE2 - iE) - i13) * f12) + iE + 0.5f));
                fVar.d(fVar2.f19152g + gVar.f19152g);
            }
        }
    }
}