package x;

import com.google.android.gms.internal.ads.ic1;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends j {

    /* renamed from: s0, reason: collision with root package name */
    public int f18736s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f18737t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f18738u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f18739v0;

    @Override // x.d
    public final boolean B() {
        return this.f18739v0;
    }

    @Override // x.d
    public final boolean C() {
        return this.f18739v0;
    }

    public final boolean T() {
        int i10;
        c cVarJ;
        c cVarJ2;
        c cVarJ3;
        int i11;
        int i12;
        int i13 = 0;
        boolean z7 = true;
        while (true) {
            i10 = this.f18852r0;
            if (i13 >= i10) {
                break;
            }
            d dVar = this.f18851q0[i13];
            if ((this.f18737t0 || dVar.d()) && ((((i11 = this.f18736s0) == 0 || i11 == 1) && !dVar.B()) || (((i12 = this.f18736s0) == 2 || i12 == 3) && !dVar.C()))) {
                z7 = false;
            }
            i13++;
        }
        if (!z7 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z10 = false;
        for (int i14 = 0; i14 < this.f18852r0; i14++) {
            d dVar2 = this.f18851q0[i14];
            if (this.f18737t0 || dVar2.d()) {
                if (!z10) {
                    int i15 = this.f18736s0;
                    if (i15 == 0) {
                        cVarJ3 = dVar2.j(2);
                    } else if (i15 == 1) {
                        cVarJ3 = dVar2.j(4);
                    } else if (i15 == 2) {
                        cVarJ3 = dVar2.j(3);
                    } else {
                        if (i15 == 3) {
                            cVarJ3 = dVar2.j(5);
                        }
                        z10 = true;
                    }
                    iMax = cVarJ3.d();
                    z10 = true;
                }
                int i16 = this.f18736s0;
                if (i16 == 0) {
                    cVarJ2 = dVar2.j(2);
                } else {
                    if (i16 == 1) {
                        cVarJ = dVar2.j(4);
                    } else if (i16 == 2) {
                        cVarJ2 = dVar2.j(3);
                    } else if (i16 == 3) {
                        cVarJ = dVar2.j(5);
                    }
                    iMax = Math.max(iMax, cVarJ.d());
                }
                iMax = Math.min(iMax, cVarJ2.d());
            }
        }
        int i17 = iMax + this.f18738u0;
        int i18 = this.f18736s0;
        if (i18 == 0 || i18 == 1) {
            K(i17, i17);
        } else {
            L(i17, i17);
        }
        this.f18739v0 = true;
        return true;
    }

    public final int U() {
        int i10 = this.f18736s0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // x.d
    public final void c(v.d dVar, boolean z7) {
        boolean z10;
        v.i iVar;
        c cVar;
        int i10;
        int i11;
        v.i iVar2;
        int i12;
        c[] cVarArr = this.Q;
        c cVar2 = this.I;
        cVarArr[0] = cVar2;
        c cVar3 = this.J;
        int i13 = 2;
        cVarArr[2] = cVar3;
        c cVar4 = this.K;
        cVarArr[1] = cVar4;
        c cVar5 = this.L;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.f18765i = dVar.k(cVar6);
        }
        int i14 = this.f18736s0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i14];
        if (!this.f18739v0) {
            T();
        }
        if (this.f18739v0) {
            this.f18739v0 = false;
            int i15 = this.f18736s0;
            if (i15 == 0 || i15 == 1) {
                dVar.d(cVar2.f18765i, this.Y);
                iVar2 = cVar4.f18765i;
                i12 = this.Y;
            } else {
                if (i15 != 2 && i15 != 3) {
                    return;
                }
                dVar.d(cVar3.f18765i, this.Z);
                iVar2 = cVar5.f18765i;
                i12 = this.Z;
            }
            dVar.d(iVar2, i12);
            return;
        }
        for (int i16 = 0; i16 < this.f18852r0; i16++) {
            d dVar2 = this.f18851q0[i16];
            if ((this.f18737t0 || dVar2.d()) && ((((i11 = this.f18736s0) == 0 || i11 == 1) && dVar2.f18797p0[0] == 3 && dVar2.I.f18762f != null && dVar2.K.f18762f != null) || ((i11 == 2 || i11 == 3) && dVar2.f18797p0[1] == 3 && dVar2.J.f18762f != null && dVar2.L.f18762f != null))) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        boolean z11 = cVar2.g() || cVar4.g();
        boolean z12 = cVar3.g() || cVar5.g();
        int i17 = (z10 || !(((i10 = this.f18736s0) == 0 && z11) || ((i10 == 2 && z12) || ((i10 == 1 && z11) || (i10 == 3 && z12))))) ? 4 : 5;
        int i18 = 0;
        while (i18 < this.f18852r0) {
            d dVar3 = this.f18851q0[i18];
            if (this.f18737t0 || dVar3.d()) {
                v.i iVarK = dVar.k(dVar3.Q[this.f18736s0]);
                int i19 = this.f18736s0;
                c cVar8 = dVar3.Q[i19];
                cVar8.f18765i = iVarK;
                c cVar9 = cVar8.f18762f;
                int i20 = (cVar9 == null || cVar9.f18760d != this) ? 0 : cVar8.f18763g;
                if (i19 == 0 || i19 == i13) {
                    v.i iVar3 = cVar7.f18765i;
                    int i21 = this.f18738u0 - i20;
                    v.c cVarL = dVar.l();
                    v.i iVarM = dVar.m();
                    iVarM.f18356j = 0;
                    cVarL.c(iVar3, iVarK, iVarM, i21);
                    dVar.c(cVarL);
                } else {
                    v.i iVar4 = cVar7.f18765i;
                    int i22 = this.f18738u0 + i20;
                    v.c cVarL2 = dVar.l();
                    v.i iVarM2 = dVar.m();
                    iVarM2.f18356j = 0;
                    cVarL2.b(iVar4, iVarK, iVarM2, i22);
                    dVar.c(cVarL2);
                }
                dVar.e(cVar7.f18765i, iVarK, this.f18738u0 + i20, i17);
            }
            i18++;
            i13 = 2;
        }
        int i23 = this.f18736s0;
        if (i23 == 0) {
            dVar.e(cVar4.f18765i, cVar2.f18765i, 0, 8);
            dVar.e(cVar2.f18765i, this.T.K.f18765i, 0, 4);
            iVar = cVar2.f18765i;
            cVar = this.T.I;
        } else if (i23 == 1) {
            dVar.e(cVar2.f18765i, cVar4.f18765i, 0, 8);
            dVar.e(cVar2.f18765i, this.T.I.f18765i, 0, 4);
            iVar = cVar2.f18765i;
            cVar = this.T.K;
        } else if (i23 == 2) {
            dVar.e(cVar5.f18765i, cVar3.f18765i, 0, 8);
            dVar.e(cVar3.f18765i, this.T.L.f18765i, 0, 4);
            iVar = cVar3.f18765i;
            cVar = this.T.J;
        } else {
            if (i23 != 3) {
                return;
            }
            dVar.e(cVar3.f18765i, cVar5.f18765i, 0, 8);
            dVar.e(cVar3.f18765i, this.T.J.f18765i, 0, 4);
            iVar = cVar3.f18765i;
            cVar = this.T.L;
        }
        dVar.e(iVar, cVar.f18765i, 0, 0);
    }

    @Override // x.d
    public final boolean d() {
        return true;
    }

    @Override // x.d
    public final String toString() {
        String strG = r.g(new StringBuilder("[Barrier] "), this.f18781h0, " {");
        for (int i10 = 0; i10 < this.f18852r0; i10++) {
            d dVar = this.f18851q0[i10];
            if (i10 > 0) {
                strG = a0.h.F(strG, ", ");
            }
            StringBuilder sbN = ic1.n(strG);
            sbN.append(dVar.f18781h0);
            strG = sbN.toString();
        }
        return a0.h.F(strG, "}");
    }
}