package y;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends p {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f19135k;

    /* renamed from: l, reason: collision with root package name */
    public int f19136l;

    public c(int i10, x.d dVar) {
        x.d dVarM;
        super(dVar);
        this.f19135k = new ArrayList();
        this.f19184f = i10;
        x.d dVarN = this.f19180b;
        while (true) {
            x.d dVar2 = dVarN;
            dVarN = dVarN.n(i10);
            dVarM = dVar2;
            if (dVarN == null) {
                break;
            } else {
                i10 = this.f19184f;
            }
        }
        this.f19180b = dVarM;
        int i11 = this.f19184f;
        p pVar = i11 == 0 ? dVarM.f18772d : i11 == 1 ? dVarM.f18774e : null;
        ArrayList arrayList = this.f19135k;
        while (true) {
            arrayList.add(pVar);
            dVarM = dVarM.m(this.f19184f);
            if (dVarM == null) {
                break;
            }
            int i12 = this.f19184f;
            pVar = i12 == 0 ? dVarM.f18772d : i12 == 1 ? dVarM.f18774e : null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p pVar2 = (p) it.next();
            int i13 = this.f19184f;
            if (i13 == 0) {
                pVar2.f19180b.f18768b = this;
            } else if (i13 == 1) {
                pVar2.f19180b.f18770c = this;
            }
        }
        if (this.f19184f == 0 && ((x.e) this.f19180b.T).f18812v0 && arrayList.size() > 1) {
            this.f19180b = ((p) arrayList.get(arrayList.size() - 1)).f19180b;
        }
        this.f19136l = this.f19184f == 0 ? this.f19180b.f18783i0 : this.f19180b.f18785j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
    @Override // y.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        boolean z7;
        ArrayList arrayList2;
        int i17;
        int i18;
        int i19;
        boolean z10;
        int i20;
        int i21;
        int i22;
        float f11;
        int i23;
        boolean z11;
        int i24;
        f fVar = this.f19186h;
        if (fVar.f19155j) {
            f fVar2 = this.f19187i;
            if (fVar2.f19155j) {
                x.d dVar2 = this.f19180b.T;
                boolean z12 = dVar2 instanceof x.e ? ((x.e) dVar2).f18812v0 : false;
                int i25 = fVar2.f19152g - fVar.f19152g;
                ArrayList arrayList3 = this.f19135k;
                int size = arrayList3.size();
                int i26 = 0;
                while (true) {
                    i10 = -1;
                    i11 = 8;
                    if (i26 >= size) {
                        i26 = -1;
                        break;
                    } else if (((p) arrayList3.get(i26)).f19180b.f18779g0 != 8) {
                        break;
                    } else {
                        i26++;
                    }
                }
                int i27 = size - 1;
                int i28 = i27;
                while (true) {
                    if (i28 < 0) {
                        break;
                    }
                    if (((p) arrayList3.get(i28)).f19180b.f18779g0 != 8) {
                        i10 = i28;
                        break;
                    }
                    i28--;
                }
                int i29 = 0;
                while (i29 < 2) {
                    int i30 = 0;
                    i15 = 0;
                    int i31 = 0;
                    int i32 = 0;
                    f10 = 0.0f;
                    while (i30 < size) {
                        p pVar = (p) arrayList3.get(i30);
                        x.d dVar3 = pVar.f19180b;
                        ArrayList arrayList4 = arrayList3;
                        if (dVar3.f18779g0 == i11) {
                            i23 = i26;
                        } else {
                            i32++;
                            if (i30 > 0 && i30 >= i26) {
                                i15 += pVar.f19186h.f19151f;
                            }
                            g gVar = pVar.f19183e;
                            int i33 = gVar.f19152g;
                            i23 = i26;
                            boolean z13 = pVar.f19182d != 3;
                            if (z13) {
                                int i34 = this.f19184f;
                                if (i34 == 0 && !dVar3.f18772d.f19183e.f19155j) {
                                    return;
                                }
                                if (i34 == 1 && !dVar3.f18774e.f19183e.f19155j) {
                                    return;
                                } else {
                                    z11 = z13;
                                }
                            } else {
                                z11 = z13;
                                if (pVar.f19179a == 1 && i29 == 0) {
                                    i24 = gVar.f19158m;
                                    i31++;
                                } else if (gVar.f19155j) {
                                    i24 = i33;
                                }
                                z11 = true;
                                if (z11) {
                                    i31++;
                                    float f12 = dVar3.f18787k0[this.f19184f];
                                    if (f12 >= 0.0f) {
                                        f10 += f12;
                                    }
                                } else {
                                    i15 += i24;
                                }
                                if (i30 >= i27 && i30 < i10) {
                                    i15 += -pVar.f19187i.f19151f;
                                }
                            }
                            i24 = i33;
                            if (z11) {
                            }
                            if (i30 >= i27) {
                            }
                        }
                        i30++;
                        arrayList3 = arrayList4;
                        i26 = i23;
                        i11 = 8;
                    }
                    arrayList = arrayList3;
                    i12 = i26;
                    if (i15 < i25 || i31 == 0) {
                        i13 = i31;
                        i14 = i32;
                        break;
                    } else {
                        i29++;
                        arrayList3 = arrayList;
                        i26 = i12;
                        i11 = 8;
                    }
                }
                arrayList = arrayList3;
                i12 = i26;
                i13 = 0;
                i14 = 0;
                i15 = 0;
                f10 = 0.0f;
                int i35 = fVar.f19152g;
                if (z12) {
                    i35 = fVar2.f19152g;
                }
                if (i15 > i25) {
                    int i36 = (int) (((i15 - i25) / 2.0f) + 0.5f);
                    i35 = z12 ? i35 + i36 : i35 - i36;
                }
                if (i13 > 0) {
                    float f13 = i25 - i15;
                    int i37 = (int) ((f13 / i13) + 0.5f);
                    int i38 = 0;
                    int i39 = 0;
                    while (i38 < size) {
                        ArrayList arrayList5 = arrayList;
                        p pVar2 = (p) arrayList5.get(i38);
                        int i40 = i37;
                        x.d dVar4 = pVar2.f19180b;
                        int i41 = i15;
                        int i42 = i35;
                        if (dVar4.f18779g0 != 8 && pVar2.f19182d == 3) {
                            g gVar2 = pVar2.f19183e;
                            if (gVar2.f19155j) {
                                z10 = z12;
                                f11 = f13;
                            } else {
                                if (f10 > 0.0f) {
                                    z10 = z12;
                                    i20 = (int) (((dVar4.f18787k0[this.f19184f] * f13) / f10) + 0.5f);
                                } else {
                                    z10 = z12;
                                    i20 = i40;
                                }
                                if (this.f19184f == 0) {
                                    i21 = dVar4.f18803v;
                                    i22 = dVar4.f18802u;
                                } else {
                                    i21 = dVar4.f18806y;
                                    i22 = dVar4.f18805x;
                                }
                                f11 = f13;
                                int iMax = Math.max(i22, pVar2.f19179a == 1 ? Math.min(i20, gVar2.f19158m) : i20);
                                if (i21 > 0) {
                                    iMax = Math.min(i21, iMax);
                                }
                                if (iMax != i20) {
                                    i39++;
                                    i20 = iMax;
                                }
                                gVar2.d(i20);
                            }
                        }
                        i38++;
                        i37 = i40;
                        i15 = i41;
                        i35 = i42;
                        z12 = z10;
                        f13 = f11;
                        arrayList = arrayList5;
                    }
                    i16 = i35;
                    z7 = z12;
                    arrayList2 = arrayList;
                    int i43 = i15;
                    if (i39 > 0) {
                        i13 -= i39;
                        int i44 = 0;
                        i15 = 0;
                        while (i44 < size) {
                            p pVar3 = (p) arrayList2.get(i44);
                            if (pVar3.f19180b.f18779g0 == 8) {
                                i19 = i12;
                            } else {
                                i19 = i12;
                                if (i44 > 0 && i44 >= i19) {
                                    i15 += pVar3.f19186h.f19151f;
                                }
                                i15 += pVar3.f19183e.f19152g;
                                if (i44 < i27 && i44 < i10) {
                                    i15 += -pVar3.f19187i.f19151f;
                                }
                            }
                            i44++;
                            i12 = i19;
                        }
                        i17 = i12;
                    } else {
                        i17 = i12;
                        i15 = i43;
                    }
                    i18 = 2;
                    if (this.f19136l == 2 && i39 == 0) {
                        this.f19136l = 0;
                    }
                } else {
                    i16 = i35;
                    z7 = z12;
                    arrayList2 = arrayList;
                    i17 = i12;
                    i18 = 2;
                }
                if (i15 > i25) {
                    this.f19136l = i18;
                }
                if (i14 > 0 && i13 == 0 && i17 == i10) {
                    this.f19136l = i18;
                }
                int i45 = this.f19136l;
                if (i45 == 1) {
                    int i46 = i14 > 1 ? (i25 - i15) / (i14 - 1) : i14 == 1 ? (i25 - i15) / 2 : 0;
                    if (i13 > 0) {
                        i46 = 0;
                    }
                    int i47 = i16;
                    for (int i48 = 0; i48 < size; i48++) {
                        p pVar4 = (p) arrayList2.get(z7 ? size - (i48 + 1) : i48);
                        int i49 = pVar4.f19180b.f18779g0;
                        f fVar3 = pVar4.f19187i;
                        f fVar4 = pVar4.f19186h;
                        if (i49 == 8) {
                            fVar4.d(i47);
                            fVar3.d(i47);
                        } else {
                            if (i48 > 0) {
                                i47 = z7 ? i47 - i46 : i47 + i46;
                            }
                            if (i48 > 0 && i48 >= i17) {
                                int i50 = fVar4.f19151f;
                                i47 = z7 ? i47 - i50 : i47 + i50;
                            }
                            if (z7) {
                                fVar3.d(i47);
                            } else {
                                fVar4.d(i47);
                            }
                            g gVar3 = pVar4.f19183e;
                            int i51 = gVar3.f19152g;
                            if (pVar4.f19182d == 3 && pVar4.f19179a == 1) {
                                i51 = gVar3.f19158m;
                            }
                            i47 = z7 ? i47 - i51 : i47 + i51;
                            if (z7) {
                                fVar4.d(i47);
                            } else {
                                fVar3.d(i47);
                            }
                            pVar4.f19185g = true;
                            if (i48 < i27 && i48 < i10) {
                                int i52 = -fVar3.f19151f;
                                i47 = z7 ? i47 - i52 : i47 + i52;
                            }
                        }
                    }
                    return;
                }
                if (i45 == 0) {
                    int i53 = (i25 - i15) / (i14 + 1);
                    if (i13 > 0) {
                        i53 = 0;
                    }
                    int i54 = i16;
                    for (int i55 = 0; i55 < size; i55++) {
                        p pVar5 = (p) arrayList2.get(z7 ? size - (i55 + 1) : i55);
                        int i56 = pVar5.f19180b.f18779g0;
                        f fVar5 = pVar5.f19187i;
                        f fVar6 = pVar5.f19186h;
                        if (i56 == 8) {
                            fVar6.d(i54);
                            fVar5.d(i54);
                        } else {
                            int i57 = z7 ? i54 - i53 : i54 + i53;
                            if (i55 > 0 && i55 >= i17) {
                                int i58 = fVar6.f19151f;
                                i57 = z7 ? i57 - i58 : i57 + i58;
                            }
                            if (z7) {
                                fVar5.d(i57);
                            } else {
                                fVar6.d(i57);
                            }
                            g gVar4 = pVar5.f19183e;
                            int iMin = gVar4.f19152g;
                            if (pVar5.f19182d == 3 && pVar5.f19179a == 1) {
                                iMin = Math.min(iMin, gVar4.f19158m);
                            }
                            i54 = z7 ? i57 - iMin : i57 + iMin;
                            if (z7) {
                                fVar6.d(i54);
                            } else {
                                fVar5.d(i54);
                            }
                            if (i55 < i27 && i55 < i10) {
                                int i59 = -fVar5.f19151f;
                                i54 = z7 ? i54 - i59 : i54 + i59;
                            }
                        }
                    }
                    return;
                }
                if (i45 == 2) {
                    float f14 = this.f19184f == 0 ? this.f19180b.f18773d0 : this.f19180b.f18775e0;
                    if (z7) {
                        f14 = 1.0f - f14;
                    }
                    int i60 = (int) (((i25 - i15) * f14) + 0.5f);
                    if (i60 < 0 || i13 > 0) {
                        i60 = 0;
                    }
                    int i61 = z7 ? i16 - i60 : i16 + i60;
                    for (int i62 = 0; i62 < size; i62++) {
                        p pVar6 = (p) arrayList2.get(z7 ? size - (i62 + 1) : i62);
                        int i63 = pVar6.f19180b.f18779g0;
                        f fVar7 = pVar6.f19187i;
                        f fVar8 = pVar6.f19186h;
                        if (i63 == 8) {
                            fVar8.d(i61);
                            fVar7.d(i61);
                        } else {
                            if (i62 > 0 && i62 >= i17) {
                                int i64 = fVar8.f19151f;
                                i61 = z7 ? i61 - i64 : i61 + i64;
                            }
                            if (z7) {
                                fVar7.d(i61);
                            } else {
                                fVar8.d(i61);
                            }
                            g gVar5 = pVar6.f19183e;
                            int i65 = gVar5.f19152g;
                            if (pVar6.f19182d == 3 && pVar6.f19179a == 1) {
                                i65 = gVar5.f19158m;
                            }
                            i61 = z7 ? i61 - i65 : i61 + i65;
                            if (z7) {
                                fVar8.d(i61);
                            } else {
                                fVar7.d(i61);
                            }
                            if (i62 < i27 && i62 < i10) {
                                int i66 = -fVar7.f19151f;
                                i61 = z7 ? i61 - i66 : i61 + i66;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[PHI: r0 r1
      0x009f: PHI (r0v9 int) = (r0v6 int), (r0v13 int) binds: [B:29:0x009d, B:19:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r1v10 y.f) = (r1v7 y.f), (r1v14 y.f) binds: [B:29:0x009d, B:19:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // y.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        f fVarI;
        int iE;
        ArrayList arrayList = this.f19135k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        x.d dVar = ((p) arrayList.get(0)).f19180b;
        x.d dVar2 = ((p) arrayList.get(size - 1)).f19180b;
        int i10 = this.f19184f;
        f fVar = this.f19187i;
        f fVar2 = this.f19186h;
        if (i10 == 0) {
            x.c cVar = dVar.I;
            x.c cVar2 = dVar2.K;
            f fVarI2 = p.i(cVar, 0);
            int iE2 = cVar.e();
            x.d dVarM = m();
            if (dVarM != null) {
                iE2 = dVarM.I.e();
            }
            if (fVarI2 != null) {
                p.b(fVar2, fVarI2, iE2);
            }
            fVarI = p.i(cVar2, 0);
            iE = cVar2.e();
            x.d dVarN = n();
            if (dVarN != null) {
                iE = dVarN.K.e();
            }
            if (fVarI != null) {
                p.b(fVar, fVarI, -iE);
            }
        } else {
            x.c cVar3 = dVar.J;
            x.c cVar4 = dVar2.L;
            f fVarI3 = p.i(cVar3, 1);
            int iE3 = cVar3.e();
            x.d dVarM2 = m();
            if (dVarM2 != null) {
                iE3 = dVarM2.J.e();
            }
            if (fVarI3 != null) {
                p.b(fVar2, fVarI3, iE3);
            }
            fVarI = p.i(cVar4, 1);
            iE = cVar4.e();
            x.d dVarN2 = n();
            if (dVarN2 != null) {
                iE = dVarN2.L.e();
            }
            if (fVarI != null) {
            }
        }
        fVar2.f19146a = this;
        fVar.f19146a = this;
    }

    @Override // y.p
    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f19135k;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((p) arrayList.get(i10)).e();
            i10++;
        }
    }

    @Override // y.p
    public final void f() {
        this.f19181c = null;
        Iterator it = this.f19135k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
    }

    @Override // y.p
    public final long j() {
        ArrayList arrayList = this.f19135k;
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = r5.f19187i.f19151f + ((p) arrayList.get(i10)).j() + j10 + r5.f19186h.f19151f;
        }
        return j10;
    }

    @Override // y.p
    public final boolean k() {
        ArrayList arrayList = this.f19135k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((p) arrayList.get(i10)).k()) {
                return false;
            }
        }
        return true;
    }

    public final x.d m() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f19135k;
            if (i10 >= arrayList.size()) {
                return null;
            }
            x.d dVar = ((p) arrayList.get(i10)).f19180b;
            if (dVar.f18779g0 != 8) {
                return dVar;
            }
            i10++;
        }
    }

    public final x.d n() {
        ArrayList arrayList = this.f19135k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            x.d dVar = ((p) arrayList.get(size)).f19180b;
            if (dVar.f18779g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f19184f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f19135k.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            sb.append("<");
            sb.append(pVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}