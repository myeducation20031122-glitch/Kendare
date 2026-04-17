package y;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k extends p {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f19160k = new int[2];

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0236, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // y.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        int iG;
        int iG2;
        float f10;
        int iG3;
        int iG4;
        float f11;
        float f12;
        float f13;
        int i10;
        if (v.h.b(this.f19188j) == 3) {
            x.d dVar2 = this.f19180b;
            l(dVar2.I, dVar2.K, 0);
            return;
        }
        g gVar = this.f19183e;
        boolean z7 = gVar.f19155j;
        f fVar = this.f19186h;
        f fVar2 = this.f19187i;
        if (!z7 && this.f19182d == 3) {
            x.d dVar3 = this.f19180b;
            int i11 = dVar3.f18799r;
            if (i11 == 2) {
                x.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    if (dVar4.f18772d.f19183e.f19155j) {
                        gVar.d((int) ((r3.f19152g * dVar3.f18804w) + 0.5f));
                    }
                }
            } else if (i11 == 3) {
                int i12 = dVar3.f18800s;
                if (i12 == 0 || i12 == 3) {
                    m mVar = dVar3.f18774e;
                    f fVar3 = mVar.f19186h;
                    f fVar4 = mVar.f19187i;
                    boolean z10 = dVar3.I.f18762f != null;
                    boolean z11 = dVar3.J.f18762f != null;
                    boolean z12 = dVar3.K.f18762f != null;
                    boolean z13 = dVar3.L.f18762f != null;
                    int i13 = dVar3.X;
                    if (z10 && z11 && z12 && z13) {
                        float f14 = dVar3.W;
                        boolean z14 = fVar3.f19155j;
                        int[] iArr = f19160k;
                        if (z14 && fVar4.f19155j) {
                            if (fVar.f19148c && fVar2.f19148c) {
                                m(iArr, ((f) fVar.f19157l.get(0)).f19152g + fVar.f19151f, ((f) fVar2.f19157l.get(0)).f19152g - fVar2.f19151f, fVar3.f19152g + fVar3.f19151f, fVar4.f19152g - fVar4.f19151f, f14, i13);
                                gVar.d(iArr[0]);
                                this.f19180b.f18774e.f19183e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z15 = fVar.f19155j;
                        ArrayList arrayList = fVar3.f19157l;
                        if (z15 && fVar2.f19155j) {
                            if (!fVar3.f19148c || !fVar4.f19148c) {
                                return;
                            }
                            m(iArr, fVar.f19152g + fVar.f19151f, fVar2.f19152g - fVar2.f19151f, ((f) arrayList.get(0)).f19152g + fVar3.f19151f, ((f) fVar4.f19157l.get(0)).f19152g - fVar4.f19151f, f14, i13);
                            gVar.d(iArr[0]);
                            this.f19180b.f18774e.f19183e.d(iArr[1]);
                        }
                        if (!fVar.f19148c || !fVar2.f19148c || !fVar3.f19148c || !fVar4.f19148c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f19157l.get(0)).f19152g + fVar.f19151f, ((f) fVar2.f19157l.get(0)).f19152g - fVar2.f19151f, ((f) arrayList.get(0)).f19152g + fVar3.f19151f, ((f) fVar4.f19157l.get(0)).f19152g - fVar4.f19151f, f14, i13);
                        gVar.d(iArr[0]);
                        this.f19180b.f18774e.f19183e.d(iArr[1]);
                    } else if (z10 && z12) {
                        if (!fVar.f19148c || !fVar2.f19148c) {
                            return;
                        }
                        float f15 = dVar3.W;
                        int i14 = ((f) fVar.f19157l.get(0)).f19152g + fVar.f19151f;
                        int i15 = ((f) fVar2.f19157l.get(0)).f19152g - fVar2.f19151f;
                        if (i13 == -1 || i13 == 0) {
                            iG3 = g(i15 - i14, 0);
                            int i16 = (int) ((iG3 * f15) + 0.5f);
                            iG4 = g(i16, 1);
                            if (i16 != iG4) {
                                f11 = iG4 / f15;
                                iG3 = (int) (f11 + 0.5f);
                            }
                            gVar.d(iG3);
                            this.f19180b.f18774e.f19183e.d(iG4);
                        } else if (i13 == 1) {
                            iG3 = g(i15 - i14, 0);
                            int i17 = (int) ((iG3 / f15) + 0.5f);
                            iG4 = g(i17, 1);
                            if (i17 != iG4) {
                                f11 = iG4 * f15;
                                iG3 = (int) (f11 + 0.5f);
                            }
                            gVar.d(iG3);
                            this.f19180b.f18774e.f19183e.d(iG4);
                        }
                    } else if (z11 && z13) {
                        if (!fVar3.f19148c || !fVar4.f19148c) {
                            return;
                        }
                        float f16 = dVar3.W;
                        int i18 = ((f) fVar3.f19157l.get(0)).f19152g + fVar3.f19151f;
                        int i19 = ((f) fVar4.f19157l.get(0)).f19152g - fVar4.f19151f;
                        if (i13 == -1) {
                            iG = g(i19 - i18, 1);
                            int i20 = (int) ((iG / f16) + 0.5f);
                            iG2 = g(i20, 0);
                            if (i20 != iG2) {
                                f10 = iG2 * f16;
                                iG = (int) (f10 + 0.5f);
                            }
                            gVar.d(iG2);
                            this.f19180b.f18774e.f19183e.d(iG);
                        } else if (i13 == 0) {
                            iG = g(i19 - i18, 1);
                            int i21 = (int) ((iG * f16) + 0.5f);
                            iG2 = g(i21, 0);
                            if (i21 != iG2) {
                                f10 = iG2 / f16;
                                iG = (int) (f10 + 0.5f);
                            }
                            gVar.d(iG2);
                            this.f19180b.f18774e.f19183e.d(iG);
                        }
                    }
                } else {
                    int i22 = dVar3.X;
                    if (i22 == -1) {
                        f12 = dVar3.f18774e.f19183e.f19152g;
                    } else if (i22 == 0) {
                        f13 = dVar3.f18774e.f19183e.f19152g / dVar3.W;
                        i10 = (int) (f13 + 0.5f);
                        gVar.d(i10);
                    } else if (i22 != 1) {
                        i10 = 0;
                        gVar.d(i10);
                    } else {
                        f12 = dVar3.f18774e.f19183e.f19152g;
                    }
                    f13 = f12 * dVar3.W;
                    i10 = (int) (f13 + 0.5f);
                    gVar.d(i10);
                }
            }
        }
        if (fVar.f19148c && fVar2.f19148c) {
            if (fVar.f19155j && fVar2.f19155j && gVar.f19155j) {
                return;
            }
            if (!gVar.f19155j && this.f19182d == 3) {
                x.d dVar5 = this.f19180b;
                if (dVar5.f18799r == 0 && !dVar5.y()) {
                    f fVar5 = (f) fVar.f19157l.get(0);
                    f fVar6 = (f) fVar2.f19157l.get(0);
                    int i23 = fVar5.f19152g + fVar.f19151f;
                    int i24 = fVar6.f19152g + fVar2.f19151f;
                    fVar.d(i23);
                    fVar2.d(i24);
                    gVar.d(i24 - i23);
                    return;
                }
            }
            if (!gVar.f19155j && this.f19182d == 3 && this.f19179a == 1 && fVar.f19157l.size() > 0 && fVar2.f19157l.size() > 0) {
                int iMin = Math.min((((f) fVar2.f19157l.get(0)).f19152g + fVar2.f19151f) - (((f) fVar.f19157l.get(0)).f19152g + fVar.f19151f), gVar.f19158m);
                x.d dVar6 = this.f19180b;
                int i25 = dVar6.f18803v;
                int iMax = Math.max(dVar6.f18802u, iMin);
                if (i25 > 0) {
                    iMax = Math.min(i25, iMax);
                }
                gVar.d(iMax);
            }
            if (gVar.f19155j) {
                f fVar7 = (f) fVar.f19157l.get(0);
                f fVar8 = (f) fVar2.f19157l.get(0);
                int i26 = fVar7.f19152g;
                int i27 = fVar.f19151f + i26;
                int i28 = fVar8.f19152g;
                int i29 = fVar2.f19151f + i28;
                float f17 = this.f19180b.f18773d0;
                if (fVar7 == fVar8) {
                    f17 = 0.5f;
                } else {
                    i26 = i27;
                    i28 = i29;
                }
                fVar.d((int) ((((i28 - i26) - gVar.f19152g) * f17) + i26 + 0.5f));
                fVar2.d(fVar.f19152g + gVar.f19152g);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    @Override // y.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        x.d dVar;
        x.d dVar2;
        int i10;
        x.d dVar3;
        x.c cVar;
        ArrayList arrayList;
        x.d dVar4;
        int i11;
        x.d dVar5 = this.f19180b;
        boolean z7 = dVar5.f18766a;
        g gVar = this.f19183e;
        if (z7) {
            gVar.d(dVar5.r());
        }
        boolean z10 = gVar.f19155j;
        f fVar = this.f19187i;
        f fVar2 = this.f19186h;
        if (!z10) {
            x.d dVar6 = this.f19180b;
            int i12 = dVar6.f18797p0[0];
            this.f19182d = i12;
            if (i12 != 3) {
                if (i12 == 4 && (dVar4 = dVar6.T) != null && ((i11 = dVar4.f18797p0[0]) == 1 || i11 == 4)) {
                    int iR = (dVar4.r() - this.f19180b.I.e()) - this.f19180b.K.e();
                    p.b(fVar2, dVar4.f18772d.f19186h, this.f19180b.I.e());
                    p.b(fVar, dVar4.f18772d.f19187i, -this.f19180b.K.e());
                    gVar.d(iR);
                    return;
                }
                if (i12 == 1) {
                    gVar.d(dVar6.r());
                }
            }
        } else if (this.f19182d == 4 && (dVar2 = (dVar = this.f19180b).T) != null && ((i10 = dVar2.f18797p0[0]) == 1 || i10 == 4)) {
            p.b(fVar2, dVar2.f18772d.f19186h, dVar.I.e());
            p.b(fVar, dVar2.f18772d.f19187i, -this.f19180b.K.e());
            return;
        }
        if (gVar.f19155j) {
            x.d dVar7 = this.f19180b;
            if (dVar7.f18766a) {
                x.c[] cVarArr = dVar7.Q;
                x.c cVar2 = cVarArr[0];
                x.c cVar3 = cVar2.f18762f;
                if (cVar3 == null || cVarArr[1].f18762f == null) {
                    if (cVar3 != null) {
                        f fVarH = p.h(cVar2);
                        if (fVarH == null) {
                            return;
                        } else {
                            p.b(fVar2, fVarH, this.f19180b.Q[0].e());
                        }
                    } else {
                        x.c cVar4 = cVarArr[1];
                        if (cVar4.f18762f != null) {
                            f fVarH2 = p.h(cVar4);
                            if (fVarH2 != null) {
                                p.b(fVar, fVarH2, -this.f19180b.Q[1].e());
                                p.b(fVar2, fVar, -gVar.f19152g);
                                return;
                            }
                            return;
                        }
                        if ((dVar7 instanceof x.i) || dVar7.T == null || dVar7.j(7).f18762f != null) {
                            return;
                        }
                        x.d dVar8 = this.f19180b;
                        p.b(fVar2, dVar8.T.f18772d.f19186h, dVar8.s());
                    }
                    p.b(fVar, fVar2, gVar.f19152g);
                    return;
                }
                if (!dVar7.y()) {
                    f fVarH3 = p.h(this.f19180b.Q[0]);
                    if (fVarH3 != null) {
                        p.b(fVar2, fVarH3, this.f19180b.Q[0].e());
                    }
                    f fVarH4 = p.h(this.f19180b.Q[1]);
                    if (fVarH4 != null) {
                        p.b(fVar, fVarH4, -this.f19180b.Q[1].e());
                    }
                    fVar2.f19147b = true;
                    fVar.f19147b = true;
                    return;
                }
                fVar2.f19151f = this.f19180b.Q[0].e();
                cVar = this.f19180b.Q[1];
            } else {
                if (this.f19182d == 3) {
                    x.d dVar9 = this.f19180b;
                    int i13 = dVar9.f18799r;
                    if (i13 == 2) {
                        x.d dVar10 = dVar9.T;
                        if (dVar10 != null) {
                            g gVar2 = dVar10.f18774e.f19183e;
                            gVar.f19157l.add(gVar2);
                            gVar2.f19156k.add(gVar);
                            gVar.f19147b = true;
                            gVar.f19156k.add(fVar2);
                            gVar.f19156k.add(fVar);
                        }
                    } else if (i13 == 3) {
                        if (dVar9.f18800s == 3) {
                            fVar2.f19146a = this;
                            fVar.f19146a = this;
                            m mVar = dVar9.f18774e;
                            mVar.f19186h.f19146a = this;
                            mVar.f19187i.f19146a = this;
                            gVar.f19146a = this;
                            if (dVar9.z()) {
                                gVar.f19157l.add(this.f19180b.f18774e.f19183e);
                                this.f19180b.f18774e.f19183e.f19156k.add(gVar);
                                m mVar2 = this.f19180b.f18774e;
                                mVar2.f19183e.f19146a = this;
                                gVar.f19157l.add(mVar2.f19186h);
                                gVar.f19157l.add(this.f19180b.f18774e.f19187i);
                                this.f19180b.f18774e.f19186h.f19156k.add(gVar);
                                arrayList = this.f19180b.f18774e.f19187i.f19156k;
                            } else if (this.f19180b.y()) {
                                this.f19180b.f18774e.f19183e.f19157l.add(gVar);
                                gVar.f19156k.add(this.f19180b.f18774e.f19183e);
                            } else {
                                arrayList = this.f19180b.f18774e.f19183e.f19157l;
                            }
                        } else {
                            g gVar3 = dVar9.f18774e.f19183e;
                            gVar.f19157l.add(gVar3);
                            gVar3.f19156k.add(gVar);
                            this.f19180b.f18774e.f19186h.f19156k.add(gVar);
                            this.f19180b.f18774e.f19187i.f19156k.add(gVar);
                            gVar.f19147b = true;
                            gVar.f19156k.add(fVar2);
                            gVar.f19156k.add(fVar);
                            fVar2.f19157l.add(gVar);
                            arrayList = fVar.f19157l;
                        }
                        arrayList.add(gVar);
                    }
                }
                x.d dVar11 = this.f19180b;
                x.c[] cVarArr2 = dVar11.Q;
                x.c cVar5 = cVarArr2[0];
                x.c cVar6 = cVar5.f18762f;
                if (cVar6 == null || cVarArr2[1].f18762f == null) {
                    if (cVar6 != null) {
                        f fVarH5 = p.h(cVar5);
                        if (fVarH5 == null) {
                            return;
                        } else {
                            p.b(fVar2, fVarH5, this.f19180b.Q[0].e());
                        }
                    } else {
                        x.c cVar7 = cVarArr2[1];
                        if (cVar7.f18762f != null) {
                            f fVarH6 = p.h(cVar7);
                            if (fVarH6 != null) {
                                p.b(fVar, fVarH6, -this.f19180b.Q[1].e());
                                c(fVar2, fVar, -1, gVar);
                                return;
                            }
                            return;
                        }
                        if ((dVar11 instanceof x.i) || (dVar3 = dVar11.T) == null) {
                            return;
                        } else {
                            p.b(fVar2, dVar3.f18772d.f19186h, dVar11.s());
                        }
                    }
                    c(fVar, fVar2, 1, gVar);
                    return;
                }
                if (!dVar11.y()) {
                    f fVarH7 = p.h(this.f19180b.Q[0]);
                    f fVarH8 = p.h(this.f19180b.Q[1]);
                    if (fVarH7 != null) {
                        fVarH7.b(this);
                    }
                    if (fVarH8 != null) {
                        fVarH8.b(this);
                    }
                    this.f19188j = 4;
                    return;
                }
                fVar2.f19151f = this.f19180b.Q[0].e();
                cVar = this.f19180b.Q[1];
            }
        }
        fVar.f19151f = -cVar.e();
    }

    @Override // y.p
    public final void e() {
        f fVar = this.f19186h;
        if (fVar.f19155j) {
            this.f19180b.Y = fVar.f19152g;
        }
    }

    @Override // y.p
    public final void f() {
        this.f19181c = null;
        this.f19186h.c();
        this.f19187i.c();
        this.f19183e.c();
        this.f19185g = false;
    }

    @Override // y.p
    public final boolean k() {
        return this.f19182d != 3 || this.f19180b.f18799r == 0;
    }

    public final void n() {
        this.f19185g = false;
        f fVar = this.f19186h;
        fVar.c();
        fVar.f19155j = false;
        f fVar2 = this.f19187i;
        fVar2.c();
        fVar2.f19155j = false;
        this.f19183e.f19155j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f19180b.f18781h0;
    }
}