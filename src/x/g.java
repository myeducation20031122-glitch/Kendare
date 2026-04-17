package x;

import java.util.ArrayList;
import y.n;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends j {
    public int A0;
    public y.b B0;
    public n C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public d[] X0;
    public d[] Y0;
    public int[] Z0;

    /* renamed from: a1, reason: collision with root package name */
    public d[] f18835a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f18836b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f18837s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f18838t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f18839u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f18840v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f18841w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f18842x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f18843y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f18844z0;

    public final int T(int i10, d dVar) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f18797p0;
        if (iArr[1] == 3) {
            int i11 = dVar.f18800s;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (dVar.f18807z * i10);
                if (i12 != dVar.l()) {
                    dVar.f18778g = true;
                    V(dVar, iArr[0], dVar.r(), 1, i12);
                }
                return i12;
            }
            if (i11 == 1) {
                return dVar.l();
            }
            if (i11 == 3) {
                return (int) ((dVar.r() * dVar.W) + 0.5f);
            }
        }
        return dVar.l();
    }

    public final int U(int i10, d dVar) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f18797p0;
        if (iArr[0] == 3) {
            int i11 = dVar.f18799r;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (dVar.f18804w * i10);
                if (i12 != dVar.r()) {
                    dVar.f18778g = true;
                    V(dVar, 1, i12, iArr[1], dVar.l());
                }
                return i12;
            }
            if (i11 == 1) {
                return dVar.r();
            }
            if (i11 == 3) {
                return (int) ((dVar.l() * dVar.W) + 0.5f);
            }
        }
        return dVar.r();
    }

    public final void V(d dVar, int i10, int i11, int i12, int i13) {
        n nVar;
        d dVar2;
        while (true) {
            nVar = this.C0;
            if (nVar != null || (dVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((e) dVar2).f18811u0;
            }
        }
        y.b bVar = this.B0;
        bVar.f19125a = i10;
        bVar.f19126b = i12;
        bVar.f19127c = i11;
        bVar.f19128d = i13;
        nVar.b(dVar, bVar);
        dVar.P(this.B0.f19129e);
        dVar.M(this.B0.f19130f);
        y.b bVar2 = this.B0;
        dVar.E = bVar2.f19132h;
        dVar.J(bVar2.f19131g);
    }

    @Override // x.j, x.i
    public final void a() {
        for (int i10 = 0; i10 < this.f18852r0; i10++) {
            d dVar = this.f18851q0[i10];
            if (dVar != null) {
                dVar.F = true;
            }
        }
    }

    @Override // x.d
    public final void c(v.d dVar, boolean z7) {
        d dVar2;
        float f10;
        int i10;
        super.c(dVar, z7);
        d dVar3 = this.T;
        boolean z10 = dVar3 != null && ((e) dVar3).f18812v0;
        int i11 = this.T0;
        ArrayList arrayList = this.W0;
        if (i11 != 0) {
            if (i11 == 1) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    ((f) arrayList.get(i12)).b(i12, z10, i12 == size + (-1));
                    i12++;
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        ((f) arrayList.get(i13)).b(i13, z10, i13 == size2 + (-1));
                        i13++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i14 = 0; i14 < this.f18836b1; i14++) {
                    this.f18835a1[i14].E();
                }
                int[] iArr = this.Z0;
                int i15 = iArr[0];
                int i16 = iArr[1];
                float f11 = this.J0;
                d dVar4 = null;
                int i17 = 0;
                while (i17 < i15) {
                    if (z10) {
                        i10 = (i15 - i17) - 1;
                        f10 = 1.0f - this.J0;
                    } else {
                        f10 = f11;
                        i10 = i17;
                    }
                    d dVar5 = this.Y0[i10];
                    if (dVar5 != null && dVar5.f18779g0 != 8) {
                        c cVar = dVar5.I;
                        if (i17 == 0) {
                            dVar5.g(cVar, this.I, this.f18841w0);
                            dVar5.f18783i0 = this.D0;
                            dVar5.f18773d0 = f10;
                        }
                        if (i17 == i15 - 1) {
                            dVar5.g(dVar5.K, this.K, this.f18842x0);
                        }
                        if (i17 > 0 && dVar4 != null) {
                            int i18 = this.P0;
                            c cVar2 = dVar4.K;
                            dVar5.g(cVar, cVar2, i18);
                            dVar4.g(cVar2, cVar, 0);
                        }
                        dVar4 = dVar5;
                    }
                    i17++;
                    f11 = f10;
                }
                for (int i19 = 0; i19 < i16; i19++) {
                    d dVar6 = this.X0[i19];
                    if (dVar6 != null && dVar6.f18779g0 != 8) {
                        c cVar3 = dVar6.J;
                        if (i19 == 0) {
                            dVar6.g(cVar3, this.J, this.f18837s0);
                            dVar6.f18785j0 = this.E0;
                            dVar6.f18775e0 = this.K0;
                        }
                        if (i19 == i16 - 1) {
                            dVar6.g(dVar6.L, this.L, this.f18838t0);
                        }
                        if (i19 > 0 && dVar4 != null) {
                            int i20 = this.Q0;
                            c cVar4 = dVar4.L;
                            dVar6.g(cVar3, cVar4, i20);
                            dVar4.g(cVar4, cVar3, 0);
                        }
                        dVar4 = dVar6;
                    }
                }
                for (int i21 = 0; i21 < i15; i21++) {
                    for (int i22 = 0; i22 < i16; i22++) {
                        int i23 = (i22 * i15) + i21;
                        if (this.V0 == 1) {
                            i23 = (i21 * i16) + i22;
                        }
                        d[] dVarArr = this.f18835a1;
                        if (i23 < dVarArr.length && (dVar2 = dVarArr[i23]) != null && dVar2.f18779g0 != 8) {
                            d dVar7 = this.Y0[i21];
                            d dVar8 = this.X0[i22];
                            if (dVar2 != dVar7) {
                                dVar2.g(dVar2.I, dVar7.I, 0);
                                dVar2.g(dVar2.K, dVar7.K, 0);
                            }
                            if (dVar2 != dVar8) {
                                dVar2.g(dVar2.J, dVar8.J, 0);
                                dVar2.g(dVar2.L, dVar8.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z10, true);
        }
        this.f18843y0 = false;
    }
}