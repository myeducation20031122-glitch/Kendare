package y;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b f19159a = new b();

    public static boolean a(x.d dVar) {
        int[] iArr = dVar.f18797p0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        x.d dVar2 = dVar.T;
        x.e eVar = dVar2 != null ? (x.e) dVar2 : null;
        if (eVar != null) {
            int i12 = eVar.f18797p0[0];
        }
        if (eVar != null) {
            int i13 = eVar.f18797p0[1];
        }
        boolean z7 = i10 == 1 || dVar.B() || i10 == 2 || (i10 == 3 && dVar.f18799r == 0 && dVar.W == 0.0f && dVar.u(0)) || (i10 == 3 && dVar.f18799r == 1 && dVar.v(0, dVar.r()));
        boolean z10 = i11 == 1 || dVar.C() || i11 == 2 || (i11 == 3 && dVar.f18800s == 0 && dVar.W == 0.0f && dVar.u(1)) || (i11 == 3 && dVar.f18800s == 1 && dVar.v(1, dVar.l()));
        if (dVar.W <= 0.0f || !(z7 || z10)) {
            return z7 && z10;
        }
        return true;
    }

    public static void b(int i10, x.d dVar, n nVar, boolean z7) {
        x.c cVar;
        x.c cVar2;
        x.c cVar3;
        x.c cVar4;
        if (dVar.f18790m) {
            return;
        }
        if (!(dVar instanceof x.e) && dVar.A() && a(dVar)) {
            x.e.W(dVar, nVar, new b());
        }
        x.c cVarJ = dVar.j(2);
        x.c cVarJ2 = dVar.j(4);
        int iD = cVarJ.d();
        int iD2 = cVarJ2.d();
        HashSet hashSet = cVarJ.f18757a;
        char c10 = 0;
        if (hashSet != null && cVarJ.f18759c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                x.c cVar5 = (x.c) it.next();
                x.d dVar2 = cVar5.f18760d;
                int i11 = i10 + 1;
                boolean zA = a(dVar2);
                if (dVar2.A() && zA) {
                    x.e.W(dVar2, nVar, new b());
                }
                x.c cVar6 = dVar2.I;
                x.c cVar7 = dVar2.K;
                boolean z10 = (cVar5 == cVar6 && (cVar4 = cVar7.f18762f) != null && cVar4.f18759c) || (cVar5 == cVar7 && (cVar3 = cVar6.f18762f) != null && cVar3.f18759c);
                int i12 = dVar2.f18797p0[c10];
                if (i12 != 3 || zA) {
                    if (!dVar2.A()) {
                        if (cVar5 == cVar6 && cVar7.f18762f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.K(iE, dVar2.r() + iE);
                        } else if (cVar5 == cVar7 && cVar6.f18762f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.K(iE2 - dVar2.r(), iE2);
                        } else if (z10 && !dVar2.y()) {
                            c(i11, dVar2, nVar, z7);
                        }
                        b(i11, dVar2, nVar, z7);
                    }
                } else if (i12 == 3 && dVar2.f18803v >= 0 && dVar2.f18802u >= 0 && ((dVar2.f18779g0 == 8 || (dVar2.f18799r == 0 && dVar2.W == 0.0f)) && !dVar2.y() && !dVar2.F && z10 && !dVar2.y())) {
                    d(i11, dVar, nVar, dVar2, z7);
                }
                c10 = 0;
            }
        }
        if (dVar instanceof x.h) {
            return;
        }
        HashSet hashSet2 = cVarJ2.f18757a;
        if (hashSet2 != null && cVarJ2.f18759c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                x.c cVar8 = (x.c) it2.next();
                x.d dVar3 = cVar8.f18760d;
                int i13 = i10 + 1;
                boolean zA2 = a(dVar3);
                if (dVar3.A() && zA2) {
                    x.e.W(dVar3, nVar, new b());
                }
                x.c cVar9 = dVar3.I;
                x.c cVar10 = dVar3.K;
                boolean z11 = (cVar8 == cVar9 && (cVar2 = cVar10.f18762f) != null && cVar2.f18759c) || (cVar8 == cVar10 && (cVar = cVar9.f18762f) != null && cVar.f18759c);
                int i14 = dVar3.f18797p0[0];
                if (i14 != 3 || zA2) {
                    if (!dVar3.A()) {
                        if (cVar8 == cVar9 && cVar10.f18762f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.K(iE3, dVar3.r() + iE3);
                        } else if (cVar8 == cVar10 && cVar9.f18762f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.K(iE4 - dVar3.r(), iE4);
                        } else if (z11 && !dVar3.y()) {
                            c(i13, dVar3, nVar, z7);
                        }
                        b(i13, dVar3, nVar, z7);
                    }
                } else if (i14 == 3 && dVar3.f18803v >= 0 && dVar3.f18802u >= 0) {
                    if (dVar3.f18779g0 != 8) {
                        if (dVar3.f18799r == 0) {
                            if (dVar3.W == 0.0f) {
                            }
                        }
                    }
                    if (!dVar3.y() && !dVar3.F && z11 && !dVar3.y()) {
                        d(i13, dVar, nVar, dVar3, z7);
                    }
                }
            }
        }
        dVar.f18790m = true;
    }

    public static void c(int i10, x.d dVar, n nVar, boolean z7) {
        float f10 = dVar.f18773d0;
        x.c cVar = dVar.I;
        int iD = cVar.f18762f.d();
        x.c cVar2 = dVar.K;
        int iD2 = cVar2.f18762f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iR = dVar.r();
        int i11 = (iD2 - iD) - iR;
        if (iD > iD2) {
            i11 = (iD - iD2) - iR;
        }
        int i12 = ((int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11)) + iD;
        int i13 = i12 + iR;
        if (iD > iD2) {
            i13 = i12 - iR;
        }
        dVar.K(i12, i13);
        b(i10 + 1, dVar, nVar, z7);
    }

    public static void d(int i10, x.d dVar, n nVar, x.d dVar2, boolean z7) {
        float f10 = dVar2.f18773d0;
        x.c cVar = dVar2.I;
        int iE = cVar.e() + cVar.f18762f.d();
        x.c cVar2 = dVar2.K;
        int iD = cVar2.f18762f.d() - cVar2.e();
        if (iD >= iE) {
            int iR = dVar2.r();
            if (dVar2.f18779g0 != 8) {
                int i11 = dVar2.f18799r;
                if (i11 == 2) {
                    if (!(dVar instanceof x.e)) {
                        dVar = dVar.T;
                    }
                    iR = (int) (dVar2.f18773d0 * 0.5f * dVar.r());
                } else if (i11 == 0) {
                    iR = iD - iE;
                }
                iR = Math.max(dVar2.f18802u, iR);
                int i12 = dVar2.f18803v;
                if (i12 > 0) {
                    iR = Math.min(i12, iR);
                }
            }
            int i13 = iE + ((int) ((f10 * ((iD - iE) - iR)) + 0.5f));
            dVar2.K(i13, iR + i13);
            b(i10 + 1, dVar2, nVar, z7);
        }
    }

    public static void e(int i10, x.d dVar, n nVar) {
        float f10 = dVar.f18775e0;
        x.c cVar = dVar.J;
        int iD = cVar.f18762f.d();
        x.c cVar2 = dVar.L;
        int iD2 = cVar2.f18762f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iL = dVar.l();
        int i11 = (iD2 - iD) - iL;
        if (iD > iD2) {
            i11 = (iD - iD2) - iL;
        }
        int i12 = (int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11);
        int i13 = iD + i12;
        int i14 = i13 + iL;
        if (iD > iD2) {
            i13 = iD - i12;
            i14 = i13 - iL;
        }
        dVar.L(i13, i14);
        g(i10 + 1, dVar, nVar);
    }

    public static void f(int i10, x.d dVar, n nVar, x.d dVar2) {
        float f10 = dVar2.f18775e0;
        x.c cVar = dVar2.J;
        int iE = cVar.e() + cVar.f18762f.d();
        x.c cVar2 = dVar2.L;
        int iD = cVar2.f18762f.d() - cVar2.e();
        if (iD >= iE) {
            int iL = dVar2.l();
            if (dVar2.f18779g0 != 8) {
                int i11 = dVar2.f18800s;
                if (i11 == 2) {
                    if (!(dVar instanceof x.e)) {
                        dVar = dVar.T;
                    }
                    iL = (int) (f10 * 0.5f * dVar.l());
                } else if (i11 == 0) {
                    iL = iD - iE;
                }
                iL = Math.max(dVar2.f18805x, iL);
                int i12 = dVar2.f18806y;
                if (i12 > 0) {
                    iL = Math.min(i12, iL);
                }
            }
            int i13 = iE + ((int) ((f10 * ((iD - iE) - iL)) + 0.5f));
            dVar2.L(i13, iL + i13);
            g(i10 + 1, dVar2, nVar);
        }
    }

    public static void g(int i10, x.d dVar, n nVar) {
        x.c cVar;
        x.c cVar2;
        x.c cVar3;
        x.c cVar4;
        x.c cVar5;
        if (dVar.f18792n) {
            return;
        }
        if (!(dVar instanceof x.e) && dVar.A() && a(dVar)) {
            x.e.W(dVar, nVar, new b());
        }
        x.c cVarJ = dVar.j(3);
        x.c cVarJ2 = dVar.j(5);
        int iD = cVarJ.d();
        int iD2 = cVarJ2.d();
        HashSet hashSet = cVarJ.f18757a;
        if (hashSet != null && cVarJ.f18759c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                x.c cVar6 = (x.c) it.next();
                x.d dVar2 = cVar6.f18760d;
                int i11 = i10 + 1;
                boolean zA = a(dVar2);
                if (dVar2.A() && zA) {
                    x.e.W(dVar2, nVar, new b());
                }
                x.c cVar7 = dVar2.J;
                x.c cVar8 = dVar2.L;
                boolean z7 = (cVar6 == cVar7 && (cVar5 = cVar8.f18762f) != null && cVar5.f18759c) || (cVar6 == cVar8 && (cVar4 = cVar7.f18762f) != null && cVar4.f18759c);
                int i12 = dVar2.f18797p0[1];
                if (i12 != 3 || zA) {
                    if (!dVar2.A()) {
                        if (cVar6 == cVar7 && cVar8.f18762f == null) {
                            int iE = cVar7.e() + iD;
                            dVar2.L(iE, dVar2.l() + iE);
                        } else if (cVar6 == cVar8 && cVar7.f18762f == null) {
                            int iE2 = iD - cVar8.e();
                            dVar2.L(iE2 - dVar2.l(), iE2);
                        } else if (z7 && !dVar2.z()) {
                            e(i11, dVar2, nVar);
                        }
                        g(i11, dVar2, nVar);
                    }
                } else if (i12 == 3 && dVar2.f18806y >= 0 && dVar2.f18805x >= 0 && (dVar2.f18779g0 == 8 || (dVar2.f18800s == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.z() && !dVar2.F && z7 && !dVar2.z()) {
                        f(i11, dVar, nVar, dVar2);
                    }
                }
            }
        }
        if (dVar instanceof x.h) {
            return;
        }
        HashSet hashSet2 = cVarJ2.f18757a;
        if (hashSet2 != null && cVarJ2.f18759c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                x.c cVar9 = (x.c) it2.next();
                x.d dVar3 = cVar9.f18760d;
                int i13 = i10 + 1;
                boolean zA2 = a(dVar3);
                if (dVar3.A() && zA2) {
                    x.e.W(dVar3, nVar, new b());
                }
                x.c cVar10 = dVar3.J;
                x.c cVar11 = dVar3.L;
                boolean z10 = (cVar9 == cVar10 && (cVar3 = cVar11.f18762f) != null && cVar3.f18759c) || (cVar9 == cVar11 && (cVar2 = cVar10.f18762f) != null && cVar2.f18759c);
                int i14 = dVar3.f18797p0[1];
                if (i14 != 3 || zA2) {
                    if (!dVar3.A()) {
                        if (cVar9 == cVar10 && cVar11.f18762f == null) {
                            int iE3 = cVar10.e() + iD2;
                            dVar3.L(iE3, dVar3.l() + iE3);
                        } else if (cVar9 == cVar11 && cVar10.f18762f == null) {
                            int iE4 = iD2 - cVar11.e();
                            dVar3.L(iE4 - dVar3.l(), iE4);
                        } else if (z10 && !dVar3.z()) {
                            e(i13, dVar3, nVar);
                        }
                        g(i13, dVar3, nVar);
                    }
                } else if (i14 == 3 && dVar3.f18806y >= 0 && dVar3.f18805x >= 0) {
                    if (dVar3.f18779g0 != 8) {
                        if (dVar3.f18800s == 0) {
                            if (dVar3.W == 0.0f) {
                            }
                        }
                    }
                    if (!dVar3.z() && !dVar3.F && z10 && !dVar3.z()) {
                        f(i13, dVar, nVar, dVar3);
                    }
                }
            }
        }
        x.c cVarJ3 = dVar.j(6);
        if (cVarJ3.f18757a != null && cVarJ3.f18759c) {
            int iD3 = cVarJ3.d();
            Iterator it3 = cVarJ3.f18757a.iterator();
            while (it3.hasNext()) {
                x.c cVar12 = (x.c) it3.next();
                x.d dVar4 = cVar12.f18760d;
                int i15 = i10 + 1;
                boolean zA3 = a(dVar4);
                if (dVar4.A() && zA3) {
                    x.e.W(dVar4, nVar, new b());
                }
                if (dVar4.f18797p0[1] != 3 || zA3) {
                    if (!dVar4.A() && cVar12 == (cVar = dVar4.M)) {
                        int iE5 = cVar12.e() + iD3;
                        if (dVar4.E) {
                            int i16 = iE5 - dVar4.f18767a0;
                            int i17 = dVar4.V + i16;
                            dVar4.Z = i16;
                            dVar4.J.l(i16);
                            dVar4.L.l(i17);
                            cVar.l(iE5);
                            dVar4.f18788l = true;
                        }
                        g(i15, dVar4, nVar);
                    }
                }
            }
        }
        dVar.f18792n = true;
    }
}