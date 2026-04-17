package y;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f19163k;

    /* renamed from: l, reason: collision with root package name */
    public a f19164l;

    @Override // y.d
    public final void a(d dVar) {
        float f10;
        int i10;
        float f11;
        if (v.h.b(this.f19188j) == 3) {
            x.d dVar2 = this.f19180b;
            l(dVar2.J, dVar2.L, 1);
            return;
        }
        g gVar = this.f19183e;
        if (gVar.f19148c && !gVar.f19155j && this.f19182d == 3) {
            x.d dVar3 = this.f19180b;
            int i11 = dVar3.f18800s;
            if (i11 == 2) {
                x.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    if (dVar4.f18774e.f19183e.f19155j) {
                        f10 = r5.f19152g * dVar3.f18807z;
                        i10 = (int) (f10 + 0.5f);
                    }
                }
            } else if (i11 == 3) {
                g gVar2 = dVar3.f18772d.f19183e;
                if (gVar2.f19155j) {
                    int i12 = dVar3.X;
                    if (i12 == -1) {
                        f11 = gVar2.f19152g;
                    } else if (i12 == 0) {
                        f10 = gVar2.f19152g * dVar3.W;
                        i10 = (int) (f10 + 0.5f);
                    } else if (i12 != 1) {
                        i10 = 0;
                    } else {
                        f11 = gVar2.f19152g;
                    }
                    f10 = f11 / dVar3.W;
                    i10 = (int) (f10 + 0.5f);
                }
            }
            gVar.d(i10);
        }
        f fVar = this.f19186h;
        if (fVar.f19148c) {
            f fVar2 = this.f19187i;
            if (fVar2.f19148c) {
                if (fVar.f19155j && fVar2.f19155j && gVar.f19155j) {
                    return;
                }
                if (!gVar.f19155j && this.f19182d == 3) {
                    x.d dVar5 = this.f19180b;
                    if (dVar5.f18799r == 0 && !dVar5.z()) {
                        f fVar3 = (f) fVar.f19157l.get(0);
                        f fVar4 = (f) fVar2.f19157l.get(0);
                        int i13 = fVar3.f19152g + fVar.f19151f;
                        int i14 = fVar4.f19152g + fVar2.f19151f;
                        fVar.d(i13);
                        fVar2.d(i14);
                        gVar.d(i14 - i13);
                        return;
                    }
                }
                if (!gVar.f19155j && this.f19182d == 3 && this.f19179a == 1 && fVar.f19157l.size() > 0 && fVar2.f19157l.size() > 0) {
                    f fVar5 = (f) fVar.f19157l.get(0);
                    int i15 = (((f) fVar2.f19157l.get(0)).f19152g + fVar2.f19151f) - (fVar5.f19152g + fVar.f19151f);
                    int i16 = gVar.f19158m;
                    if (i15 < i16) {
                        gVar.d(i15);
                    } else {
                        gVar.d(i16);
                    }
                }
                if (gVar.f19155j && fVar.f19157l.size() > 0 && fVar2.f19157l.size() > 0) {
                    f fVar6 = (f) fVar.f19157l.get(0);
                    f fVar7 = (f) fVar2.f19157l.get(0);
                    int i17 = fVar6.f19152g;
                    int i18 = fVar.f19151f + i17;
                    int i19 = fVar7.f19152g;
                    int i20 = fVar2.f19151f + i19;
                    float f12 = this.f19180b.f18775e0;
                    if (fVar6 == fVar7) {
                        f12 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    fVar.d((int) ((((i19 - i17) - gVar.f19152g) * f12) + i17 + 0.5f));
                    fVar2.d(fVar.f19152g + gVar.f19152g);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030c A[PHI: r0
      0x030c: PHI (r0v22 y.k) = (r0v15 y.k), (r0v31 y.k) binds: [B:151:0x030a, B:125:0x0298] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // y.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        x.d dVar;
        x.d dVar2;
        x.d dVar3;
        k kVar;
        p pVar;
        x.d dVar4;
        x.d dVar5;
        x.d dVar6 = this.f19180b;
        boolean z7 = dVar6.f18766a;
        g gVar = this.f19183e;
        if (z7) {
            gVar.d(dVar6.l());
        }
        boolean z10 = gVar.f19155j;
        f fVar = this.f19187i;
        f fVar2 = this.f19186h;
        if (!z10) {
            x.d dVar7 = this.f19180b;
            this.f19182d = dVar7.f18797p0[1];
            if (dVar7.E) {
                this.f19164l = new a(this);
            }
            int i10 = this.f19182d;
            if (i10 != 3) {
                if (i10 == 4 && (dVar5 = this.f19180b.T) != null && dVar5.f18797p0[1] == 1) {
                    int iL = (dVar5.l() - this.f19180b.J.e()) - this.f19180b.L.e();
                    p.b(fVar2, dVar5.f18774e.f19186h, this.f19180b.J.e());
                    p.b(fVar, dVar5.f18774e.f19187i, -this.f19180b.L.e());
                    gVar.d(iL);
                    return;
                }
                if (i10 == 1) {
                    gVar.d(this.f19180b.l());
                }
            }
        } else if (this.f19182d == 4 && (dVar2 = (dVar = this.f19180b).T) != null && dVar2.f18797p0[1] == 1) {
            p.b(fVar2, dVar2.f18774e.f19186h, dVar.J.e());
            p.b(fVar, dVar2.f18774e.f19187i, -this.f19180b.L.e());
            return;
        }
        boolean z11 = gVar.f19155j;
        f fVar3 = this.f19163k;
        if (z11) {
            x.d dVar8 = this.f19180b;
            if (dVar8.f18766a) {
                x.c[] cVarArr = dVar8.Q;
                x.c cVar = cVarArr[2];
                x.c cVar2 = cVar.f18762f;
                if (cVar2 != null && cVarArr[3].f18762f != null) {
                    if (dVar8.z()) {
                        fVar2.f19151f = this.f19180b.Q[2].e();
                        fVar.f19151f = -this.f19180b.Q[3].e();
                    } else {
                        f fVarH = p.h(this.f19180b.Q[2]);
                        if (fVarH != null) {
                            p.b(fVar2, fVarH, this.f19180b.Q[2].e());
                        }
                        f fVarH2 = p.h(this.f19180b.Q[3]);
                        if (fVarH2 != null) {
                            p.b(fVar, fVarH2, -this.f19180b.Q[3].e());
                        }
                        fVar2.f19147b = true;
                        fVar.f19147b = true;
                    }
                    dVar4 = this.f19180b;
                    if (!dVar4.E) {
                        return;
                    }
                } else if (cVar2 != null) {
                    f fVarH3 = p.h(cVar);
                    if (fVarH3 == null) {
                        return;
                    }
                    p.b(fVar2, fVarH3, this.f19180b.Q[2].e());
                    p.b(fVar, fVar2, gVar.f19152g);
                    dVar4 = this.f19180b;
                    if (!dVar4.E) {
                        return;
                    }
                } else {
                    x.c cVar3 = cVarArr[3];
                    if (cVar3.f18762f != null) {
                        f fVarH4 = p.h(cVar3);
                        if (fVarH4 != null) {
                            p.b(fVar, fVarH4, -this.f19180b.Q[3].e());
                            p.b(fVar2, fVar, -gVar.f19152g);
                        }
                        dVar4 = this.f19180b;
                        if (!dVar4.E) {
                            return;
                        }
                    } else {
                        x.c cVar4 = cVarArr[4];
                        if (cVar4.f18762f != null) {
                            f fVarH5 = p.h(cVar4);
                            if (fVarH5 != null) {
                                p.b(fVar3, fVarH5, 0);
                                p.b(fVar2, fVar3, -this.f19180b.f18767a0);
                                p.b(fVar, fVar2, gVar.f19152g);
                                return;
                            }
                            return;
                        }
                        if ((dVar8 instanceof x.i) || dVar8.T == null || dVar8.j(7).f18762f != null) {
                            return;
                        }
                        x.d dVar9 = this.f19180b;
                        p.b(fVar2, dVar9.T.f18774e.f19186h, dVar9.t());
                        p.b(fVar, fVar2, gVar.f19152g);
                        dVar4 = this.f19180b;
                        if (!dVar4.E) {
                            return;
                        }
                    }
                }
                p.b(fVar3, fVar2, dVar4.f18767a0);
                return;
            }
        }
        if (z11 || this.f19182d != 3) {
            gVar.b(this);
        } else {
            x.d dVar10 = this.f19180b;
            int i11 = dVar10.f18800s;
            if (i11 == 2) {
                x.d dVar11 = dVar10.T;
                if (dVar11 != null) {
                    pVar = dVar11.f18774e;
                    g gVar2 = pVar.f19183e;
                    gVar.f19157l.add(gVar2);
                    gVar2.f19156k.add(gVar);
                    gVar.f19147b = true;
                    gVar.f19156k.add(fVar2);
                    gVar.f19156k.add(fVar);
                }
            } else if (i11 == 3 && !dVar10.z()) {
                x.d dVar12 = this.f19180b;
                if (dVar12.f18799r != 3) {
                    pVar = dVar12.f18772d;
                    g gVar22 = pVar.f19183e;
                    gVar.f19157l.add(gVar22);
                    gVar22.f19156k.add(gVar);
                    gVar.f19147b = true;
                    gVar.f19156k.add(fVar2);
                    gVar.f19156k.add(fVar);
                }
            }
        }
        x.d dVar13 = this.f19180b;
        x.c[] cVarArr2 = dVar13.Q;
        x.c cVar5 = cVarArr2[2];
        x.c cVar6 = cVar5.f18762f;
        if (cVar6 != null && cVarArr2[3].f18762f != null) {
            if (dVar13.z()) {
                fVar2.f19151f = this.f19180b.Q[2].e();
                fVar.f19151f = -this.f19180b.Q[3].e();
            } else {
                f fVarH6 = p.h(this.f19180b.Q[2]);
                f fVarH7 = p.h(this.f19180b.Q[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f19188j = 4;
            }
            if (this.f19180b.E) {
            }
        } else if (cVar6 != null) {
            f fVarH8 = p.h(cVar5);
            if (fVarH8 != null) {
                p.b(fVar2, fVarH8, this.f19180b.Q[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f19180b.E) {
                    c(fVar3, fVar2, 1, this.f19164l);
                }
                if (this.f19182d == 3) {
                    x.d dVar14 = this.f19180b;
                    if (dVar14.W > 0.0f) {
                        kVar = dVar14.f18772d;
                        if (kVar.f19182d == 3) {
                            kVar.f19183e.f19156k.add(gVar);
                            gVar.f19157l.add(this.f19180b.f18772d.f19183e);
                            gVar.f19146a = this;
                        }
                    }
                }
            }
        } else {
            x.c cVar7 = cVarArr2[3];
            if (cVar7.f18762f != null) {
                f fVarH9 = p.h(cVar7);
                if (fVarH9 != null) {
                    p.b(fVar, fVarH9, -this.f19180b.Q[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f19180b.E) {
                        c(fVar3, fVar2, 1, this.f19164l);
                    }
                }
            } else {
                x.c cVar8 = cVarArr2[4];
                if (cVar8.f18762f != null) {
                    f fVarH10 = p.h(cVar8);
                    if (fVarH10 != null) {
                        p.b(fVar3, fVarH10, 0);
                        c(fVar2, fVar3, -1, this.f19164l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(dVar13 instanceof x.i) && (dVar3 = dVar13.T) != null) {
                    p.b(fVar2, dVar3.f18774e.f19186h, dVar13.t());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f19180b.E) {
                        c(fVar3, fVar2, 1, this.f19164l);
                    }
                    if (this.f19182d == 3) {
                        x.d dVar15 = this.f19180b;
                        if (dVar15.W > 0.0f) {
                            kVar = dVar15.f18772d;
                            if (kVar.f19182d == 3) {
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f19157l.size() == 0) {
            gVar.f19148c = true;
        }
    }

    @Override // y.p
    public final void e() {
        f fVar = this.f19186h;
        if (fVar.f19155j) {
            this.f19180b.Z = fVar.f19152g;
        }
    }

    @Override // y.p
    public final void f() {
        this.f19181c = null;
        this.f19186h.c();
        this.f19187i.c();
        this.f19163k.c();
        this.f19183e.c();
        this.f19185g = false;
    }

    @Override // y.p
    public final boolean k() {
        return this.f19182d != 3 || this.f19180b.f18800s == 0;
    }

    public final void m() {
        this.f19185g = false;
        f fVar = this.f19186h;
        fVar.c();
        fVar.f19155j = false;
        f fVar2 = this.f19187i;
        fVar2.c();
        fVar2.f19155j = false;
        f fVar3 = this.f19163k;
        fVar3.c();
        fVar3.f19155j = false;
        this.f19183e.f19155j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f19180b.f18781h0;
    }
}