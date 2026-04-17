package x;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f18817a;

    /* renamed from: d, reason: collision with root package name */
    public c f18820d;

    /* renamed from: e, reason: collision with root package name */
    public c f18821e;

    /* renamed from: f, reason: collision with root package name */
    public c f18822f;

    /* renamed from: g, reason: collision with root package name */
    public c f18823g;

    /* renamed from: h, reason: collision with root package name */
    public int f18824h;

    /* renamed from: i, reason: collision with root package name */
    public int f18825i;

    /* renamed from: j, reason: collision with root package name */
    public int f18826j;

    /* renamed from: k, reason: collision with root package name */
    public int f18827k;

    /* renamed from: q, reason: collision with root package name */
    public int f18833q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f18834r;

    /* renamed from: b, reason: collision with root package name */
    public d f18818b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f18819c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f18828l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f18829m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f18830n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f18831o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f18832p = 0;

    public f(g gVar, int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11) {
        this.f18834r = gVar;
        this.f18824h = 0;
        this.f18825i = 0;
        this.f18826j = 0;
        this.f18827k = 0;
        this.f18833q = 0;
        this.f18817a = i10;
        this.f18820d = cVar;
        this.f18821e = cVar2;
        this.f18822f = cVar3;
        this.f18823g = cVar4;
        this.f18824h = gVar.f18841w0;
        this.f18825i = gVar.f18837s0;
        this.f18826j = gVar.f18842x0;
        this.f18827k = gVar.f18838t0;
        this.f18833q = i11;
    }

    public final void a(d dVar) {
        int i10 = this.f18817a;
        g gVar = this.f18834r;
        if (i10 == 0) {
            int iU = gVar.U(this.f18833q, dVar);
            if (dVar.f18797p0[0] == 3) {
                this.f18832p++;
                iU = 0;
            }
            this.f18828l = iU + (dVar.f18779g0 != 8 ? gVar.P0 : 0) + this.f18828l;
            int iT = gVar.T(this.f18833q, dVar);
            if (this.f18818b == null || this.f18819c < iT) {
                this.f18818b = dVar;
                this.f18819c = iT;
                this.f18829m = iT;
            }
        } else {
            int iU2 = gVar.U(this.f18833q, dVar);
            int iT2 = gVar.T(this.f18833q, dVar);
            if (dVar.f18797p0[1] == 3) {
                this.f18832p++;
                iT2 = 0;
            }
            this.f18829m = iT2 + (dVar.f18779g0 != 8 ? gVar.Q0 : 0) + this.f18829m;
            if (this.f18818b == null || this.f18819c < iU2) {
                this.f18818b = dVar;
                this.f18819c = iU2;
                this.f18828l = iU2;
            }
        }
        this.f18831o++;
    }

    public final void b(int i10, boolean z7, boolean z10) {
        g gVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        d dVar;
        int i16;
        int i17;
        int i18;
        float f10;
        float f11;
        int i19;
        float f12;
        int i20;
        int i21 = this.f18831o;
        int i22 = 0;
        while (true) {
            gVar = this.f18834r;
            if (i22 >= i21 || (i20 = this.f18830n + i22) >= gVar.f18836b1) {
                break;
            }
            d dVar2 = gVar.f18835a1[i20];
            if (dVar2 != null) {
                dVar2.E();
            }
            i22++;
        }
        if (i21 == 0 || this.f18818b == null) {
            return;
        }
        boolean z11 = z10 && i10 == 0;
        int i23 = -1;
        int i24 = -1;
        for (int i25 = 0; i25 < i21; i25++) {
            int i26 = this.f18830n + (z7 ? (i21 - 1) - i25 : i25);
            if (i26 >= gVar.f18836b1) {
                break;
            }
            d dVar3 = gVar.f18835a1[i26];
            if (dVar3 != null && dVar3.f18779g0 == 0) {
                if (i23 == -1) {
                    i23 = i25;
                }
                i24 = i25;
            }
        }
        if (this.f18817a != 0) {
            d dVar4 = this.f18818b;
            dVar4.f18783i0 = gVar.D0;
            int i27 = this.f18824h;
            if (i10 > 0) {
                i27 += gVar.P0;
            }
            c cVar = dVar4.I;
            c cVar2 = dVar4.K;
            if (z7) {
                cVar2.a(this.f18822f, i27);
                if (z10) {
                    cVar.a(this.f18820d, this.f18826j);
                }
                if (i10 > 0) {
                    this.f18822f.f18760d.I.a(cVar2, 0);
                }
            } else {
                cVar.a(this.f18820d, i27);
                if (z10) {
                    cVar2.a(this.f18822f, this.f18826j);
                }
                if (i10 > 0) {
                    this.f18820d.f18760d.K.a(cVar, 0);
                }
            }
            d dVar5 = null;
            for (int i28 = 0; i28 < i21; i28++) {
                int i29 = this.f18830n + i28;
                if (i29 >= gVar.f18836b1) {
                    return;
                }
                d dVar6 = gVar.f18835a1[i29];
                if (dVar6 != null) {
                    c cVar3 = dVar6.J;
                    if (i28 == 0) {
                        dVar6.g(cVar3, this.f18821e, this.f18825i);
                        int i30 = gVar.E0;
                        float f13 = gVar.K0;
                        if (this.f18830n == 0) {
                            i15 = gVar.G0;
                            i13 = i30;
                            i14 = -1;
                            if (i15 != -1) {
                                f13 = gVar.M0;
                            }
                            dVar6.f18785j0 = i15;
                            dVar6.f18775e0 = f13;
                        } else {
                            i13 = i30;
                            i14 = -1;
                        }
                        if (!z10 || (i15 = gVar.I0) == i14) {
                            i15 = i13;
                        } else {
                            f13 = gVar.O0;
                        }
                        dVar6.f18785j0 = i15;
                        dVar6.f18775e0 = f13;
                    }
                    if (i28 == i21 - 1) {
                        dVar6.g(dVar6.L, this.f18823g, this.f18827k);
                    }
                    if (dVar5 != null) {
                        int i31 = gVar.Q0;
                        c cVar4 = dVar5.L;
                        cVar3.a(cVar4, i31);
                        if (i28 == i23) {
                            int i32 = this.f18825i;
                            if (cVar3.h()) {
                                cVar3.f18764h = i32;
                            }
                        }
                        cVar4.a(cVar3, 0);
                        if (i28 == i24 + 1) {
                            int i33 = this.f18827k;
                            if (cVar4.h()) {
                                cVar4.f18764h = i33;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        c cVar5 = dVar6.K;
                        c cVar6 = dVar6.I;
                        if (z7) {
                            int i34 = gVar.R0;
                            if (i34 != 0) {
                                if (i34 == 1) {
                                    cVar6.a(cVar, 0);
                                } else if (i34 == 2) {
                                    i12 = 0;
                                    cVar6.a(cVar, 0);
                                }
                                dVar5 = dVar6;
                            } else {
                                i12 = 0;
                            }
                            cVar5.a(cVar2, i12);
                            dVar5 = dVar6;
                        } else {
                            int i35 = gVar.R0;
                            if (i35 != 0) {
                                if (i35 == 1) {
                                    i11 = 0;
                                } else if (i35 == 2) {
                                    if (z11) {
                                        cVar6.a(this.f18820d, this.f18824h);
                                        cVar5.a(this.f18822f, this.f18826j);
                                    } else {
                                        i11 = 0;
                                        cVar6.a(cVar, 0);
                                    }
                                }
                                cVar5.a(cVar2, i11);
                            } else {
                                cVar6.a(cVar, 0);
                            }
                            dVar5 = dVar6;
                        }
                    } else {
                        dVar5 = dVar6;
                    }
                }
            }
            return;
        }
        d dVar7 = this.f18818b;
        dVar7.f18785j0 = gVar.E0;
        int i36 = this.f18825i;
        if (i10 > 0) {
            i36 += gVar.Q0;
        }
        c cVar7 = this.f18821e;
        c cVar8 = dVar7.J;
        cVar8.a(cVar7, i36);
        c cVar9 = dVar7.L;
        if (z10) {
            cVar9.a(this.f18823g, this.f18827k);
        }
        if (i10 > 0) {
            this.f18821e.f18760d.L.a(cVar8, 0);
        }
        if (gVar.S0 != 3 || dVar7.E) {
            dVar = dVar7;
        } else {
            for (int i37 = 0; i37 < i21; i37++) {
                int i38 = this.f18830n + (z7 ? (i21 - 1) - i37 : i37);
                if (i38 >= gVar.f18836b1) {
                    break;
                }
                dVar = gVar.f18835a1[i38];
                if (dVar.E) {
                    break;
                }
            }
            dVar = dVar7;
        }
        d dVar8 = null;
        int i39 = 0;
        while (i39 < i21) {
            int i40 = z7 ? (i21 - 1) - i39 : i39;
            int i41 = this.f18830n + i40;
            if (i41 >= gVar.f18836b1) {
                return;
            }
            d dVar9 = gVar.f18835a1[i41];
            if (dVar9 == null) {
                i16 = i21;
            } else {
                c cVar10 = dVar9.I;
                if (i39 == 0) {
                    dVar9.g(cVar10, this.f18820d, this.f18824h);
                }
                if (i40 == 0) {
                    int i42 = gVar.D0;
                    if (z7) {
                        i18 = i42;
                        f10 = 1.0f - gVar.J0;
                    } else {
                        i18 = i42;
                        f10 = gVar.J0;
                    }
                    if (this.f18830n == 0) {
                        int i43 = gVar.F0;
                        f11 = f10;
                        if (i43 != -1) {
                            f12 = z7 ? 1.0f - gVar.L0 : gVar.L0;
                            i19 = i43;
                        }
                        dVar9.f18783i0 = i19;
                        dVar9.f18773d0 = f12;
                    } else {
                        f11 = f10;
                    }
                    if (!z10 || (i19 = gVar.H0) == -1) {
                        i19 = i18;
                        f12 = f11;
                    } else {
                        f12 = z7 ? 1.0f - gVar.N0 : gVar.N0;
                    }
                    dVar9.f18783i0 = i19;
                    dVar9.f18773d0 = f12;
                }
                if (i39 == i21 - 1) {
                    i16 = i21;
                    dVar9.g(dVar9.K, this.f18822f, this.f18826j);
                } else {
                    i16 = i21;
                }
                if (dVar8 != null) {
                    int i44 = gVar.P0;
                    c cVar11 = dVar8.K;
                    cVar10.a(cVar11, i44);
                    if (i39 == i23) {
                        int i45 = this.f18824h;
                        if (cVar10.h()) {
                            cVar10.f18764h = i45;
                        }
                    }
                    cVar11.a(cVar10, 0);
                    if (i39 == i24 + 1) {
                        int i46 = this.f18826j;
                        if (cVar11.h()) {
                            cVar11.f18764h = i46;
                        }
                    }
                }
                if (dVar9 != dVar7) {
                    int i47 = gVar.S0;
                    if (i47 == 3 && dVar.E && dVar9 != dVar && dVar9.E) {
                        dVar9.M.a(dVar.M, 0);
                    } else {
                        c cVar12 = dVar9.J;
                        if (i47 != 0) {
                            c cVar13 = dVar9.L;
                            if (i47 == 1) {
                                i17 = 0;
                            } else if (z11) {
                                cVar12.a(this.f18821e, this.f18825i);
                                cVar13.a(this.f18823g, this.f18827k);
                            } else {
                                i17 = 0;
                                cVar12.a(cVar8, 0);
                            }
                            cVar13.a(cVar9, i17);
                        } else {
                            cVar12.a(cVar8, 0);
                        }
                    }
                }
                dVar8 = dVar9;
            }
            i39++;
            i21 = i16;
        }
    }

    public final int c() {
        return this.f18817a == 1 ? this.f18829m - this.f18834r.Q0 : this.f18829m;
    }

    public final int d() {
        return this.f18817a == 0 ? this.f18828l - this.f18834r.P0 : this.f18828l;
    }

    public final void e(int i10) {
        g gVar;
        int i11;
        int i12;
        int iR;
        int iL;
        int i13 = this.f18832p;
        if (i13 == 0) {
            return;
        }
        int i14 = this.f18831o;
        int i15 = i10 / i13;
        int i16 = 0;
        while (true) {
            gVar = this.f18834r;
            if (i16 >= i14 || (i11 = this.f18830n + i16) >= gVar.f18836b1) {
                break;
            }
            d dVar = gVar.f18835a1[i11];
            int i17 = 1;
            if (this.f18817a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f18797p0;
                    if (iArr[0] == 3 && dVar.f18799r == 0) {
                        int i18 = iArr[1];
                        i12 = 1;
                        iR = i15;
                        i17 = i18;
                        iL = dVar.l();
                        gVar.V(dVar, i12, iR, i17, iL);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f18797p0;
                if (iArr2[1] == 3 && dVar.f18800s == 0) {
                    i12 = iArr2[0];
                    iR = dVar.r();
                    iL = i15;
                    gVar.V(dVar, i12, iR, i17, iL);
                }
            }
            i16++;
        }
        this.f18828l = 0;
        this.f18829m = 0;
        this.f18818b = null;
        this.f18819c = 0;
        int i19 = this.f18831o;
        for (int i20 = 0; i20 < i19; i20++) {
            int i21 = this.f18830n + i20;
            if (i21 >= gVar.f18836b1) {
                return;
            }
            d dVar2 = gVar.f18835a1[i21];
            if (this.f18817a == 0) {
                int iR2 = dVar2.r();
                int i22 = gVar.P0;
                if (dVar2.f18779g0 == 8) {
                    i22 = 0;
                }
                this.f18828l = iR2 + i22 + this.f18828l;
                int iT = gVar.T(this.f18833q, dVar2);
                if (this.f18818b == null || this.f18819c < iT) {
                    this.f18818b = dVar2;
                    this.f18819c = iT;
                    this.f18829m = iT;
                }
            } else {
                int iU = gVar.U(this.f18833q, dVar2);
                int iT2 = gVar.T(this.f18833q, dVar2);
                int i23 = gVar.Q0;
                if (dVar2.f18779g0 == 8) {
                    i23 = 0;
                }
                this.f18829m = iT2 + i23 + this.f18829m;
                if (this.f18818b == null || this.f18819c < iU) {
                    this.f18818b = dVar2;
                    this.f18819c = iU;
                    this.f18828l = iU;
                }
            }
        }
    }

    public final void f(int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11, int i12, int i13, int i14, int i15) {
        this.f18817a = i10;
        this.f18820d = cVar;
        this.f18821e = cVar2;
        this.f18822f = cVar3;
        this.f18823g = cVar4;
        this.f18824h = i11;
        this.f18825i = i12;
        this.f18826j = i13;
        this.f18827k = i14;
        this.f18833q = i15;
    }
}