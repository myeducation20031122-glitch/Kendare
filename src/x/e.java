package x;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import o5.u;
import o5.y;
import y.n;
import y.o;
import y.p;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends l {
    public int A0;
    public b[] B0;
    public b[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final y.b L0;

    /* renamed from: r0, reason: collision with root package name */
    public final g.e f18808r0;

    /* renamed from: s0, reason: collision with root package name */
    public final y.e f18809s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f18810t0;

    /* renamed from: u0, reason: collision with root package name */
    public n f18811u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f18812v0;

    /* renamed from: w0, reason: collision with root package name */
    public final v.d f18813w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f18814x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f18815y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f18816z0;

    public e() {
        this.f18854q0 = new ArrayList();
        this.f18808r0 = new g.e(this);
        y.e eVar = new y.e();
        eVar.f19137a = true;
        eVar.f19138b = true;
        eVar.f19141e = new ArrayList();
        eVar.f19142f = new ArrayList();
        eVar.f19144h = null;
        eVar.f19145i = new y.b();
        eVar.f19143g = new ArrayList();
        eVar.f19139c = this;
        eVar.f19140d = this;
        this.f18809s0 = eVar;
        this.f18811u0 = null;
        this.f18812v0 = false;
        this.f18813w0 = new v.d();
        this.f18816z0 = 0;
        this.A0 = 0;
        this.B0 = new b[4];
        this.C0 = new b[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new y.b();
    }

    public static void W(d dVar, n nVar, y.b bVar) {
        int i10;
        int i11;
        if (nVar == null) {
            return;
        }
        if (dVar.f18779g0 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.f19129e = 0;
            bVar.f19130f = 0;
            return;
        }
        int[] iArr = dVar.f18797p0;
        bVar.f19125a = iArr[0];
        bVar.f19126b = iArr[1];
        bVar.f19127c = dVar.r();
        bVar.f19128d = dVar.l();
        bVar.f19133i = false;
        bVar.f19134j = 0;
        boolean z7 = bVar.f19125a == 3;
        boolean z10 = bVar.f19126b == 3;
        boolean z11 = z7 && dVar.W > 0.0f;
        boolean z12 = z10 && dVar.W > 0.0f;
        if (z7 && dVar.u(0) && dVar.f18799r == 0 && !z11) {
            bVar.f19125a = 2;
            if (z10 && dVar.f18800s == 0) {
                bVar.f19125a = 1;
            }
            z7 = false;
        }
        if (z10 && dVar.u(1) && dVar.f18800s == 0 && !z12) {
            bVar.f19126b = 2;
            if (z7 && dVar.f18799r == 0) {
                bVar.f19126b = 1;
            }
            z10 = false;
        }
        if (dVar.B()) {
            bVar.f19125a = 1;
            z7 = false;
        }
        if (dVar.C()) {
            bVar.f19126b = 1;
            z10 = false;
        }
        int[] iArr2 = dVar.f18801t;
        if (z11) {
            if (iArr2[0] == 4) {
                bVar.f19125a = 1;
            } else if (!z10) {
                if (bVar.f19126b == 1) {
                    i11 = bVar.f19128d;
                } else {
                    bVar.f19125a = 2;
                    nVar.b(dVar, bVar);
                    i11 = bVar.f19130f;
                }
                bVar.f19125a = 1;
                bVar.f19127c = (int) (dVar.W * i11);
            }
        }
        if (z12) {
            if (iArr2[1] == 4) {
                bVar.f19126b = 1;
            } else if (!z7) {
                if (bVar.f19125a == 1) {
                    i10 = bVar.f19127c;
                } else {
                    bVar.f19126b = 2;
                    nVar.b(dVar, bVar);
                    i10 = bVar.f19129e;
                }
                bVar.f19126b = 1;
                bVar.f19128d = dVar.X == -1 ? (int) (i10 / dVar.W) : (int) (dVar.W * i10);
            }
        }
        nVar.b(dVar, bVar);
        dVar.P(bVar.f19129e);
        dVar.M(bVar.f19130f);
        dVar.E = bVar.f19132h;
        dVar.J(bVar.f19131g);
        bVar.f19134j = 0;
    }

    @Override // x.l, x.d
    public final void D() {
        this.f18813w0.t();
        this.f18814x0 = 0;
        this.f18815y0 = 0;
        super.D();
    }

    @Override // x.d
    public final void Q(boolean z7, boolean z10) {
        super.Q(z7, z10);
        int size = this.f18854q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f18854q0.get(i10)).Q(z7, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x066b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0796 A[PHI: r21 r22 r24
      0x0796: PHI (r21v4 boolean) = (r21v10 boolean), (r21v19 boolean) binds: [B:477:0x07b3, B:472:0x0793] A[DONT_GENERATE, DONT_INLINE]
      0x0796: PHI (r22v3 x.c) = (r22v5 x.c), (r22v10 x.c) binds: [B:477:0x07b3, B:472:0x0793] A[DONT_GENERATE, DONT_INLINE]
      0x0796: PHI (r24v3 x.c) = (r24v5 x.c), (r24v12 x.c) binds: [B:477:0x07b3, B:472:0x0793] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0809 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:509:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    @Override // x.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S() {
        boolean[] zArr;
        int i10;
        Object[] objArr;
        c cVar;
        int i11;
        int i12;
        int i13;
        c cVar2;
        int iL;
        v.d dVar;
        int i14;
        boolean z7;
        char c10;
        int i15;
        int i16;
        boolean z10;
        boolean z11;
        boolean z12;
        int size;
        int i17;
        boolean z13;
        boolean z14;
        int iMax;
        ?? r62;
        boolean z15;
        int iMax2;
        boolean z16;
        int i18;
        WeakReference weakReference;
        v.i iVarK;
        v.d dVar2;
        v.d dVar3;
        int i19;
        int i20;
        int i21;
        char c11;
        o oVar;
        int i22;
        int iR;
        int iB;
        o oVar2;
        o oVar3;
        j jVar;
        int i23;
        int[] iArr;
        boolean[] zArr2 = k.f18853a;
        this.Y = 0;
        this.Z = 0;
        this.E0 = false;
        this.F0 = false;
        int size2 = this.f18854q0.size();
        int iMax3 = Math.max(0, r());
        int iMax4 = Math.max(0, l());
        int[] iArr2 = this.f18797p0;
        int i24 = iArr2[1];
        int i25 = iArr2[0];
        int i26 = this.f18810t0;
        c cVar3 = this.J;
        c cVar4 = this.I;
        if (i26 == 0 && k.b(this.D0, 1)) {
            n nVar = this.f18811u0;
            int i27 = iArr2[0];
            int i28 = iArr2[1];
            F();
            ArrayList arrayList = this.f18854q0;
            int size3 = arrayList.size();
            for (int i29 = 0; i29 < size3; i29++) {
                ((d) arrayList.get(i29)).F();
            }
            boolean z17 = this.f18812v0;
            zArr = zArr2;
            if (i27 == 1) {
                K(0, r());
            } else {
                cVar4.l(0);
                this.Y = 0;
            }
            int i30 = 0;
            boolean z18 = false;
            boolean z19 = false;
            while (i30 < size3) {
                c cVar5 = cVar4;
                d dVar4 = (d) arrayList.get(i30);
                int i31 = iMax4;
                if (dVar4 instanceof h) {
                    h hVar = (h) dVar4;
                    iArr = iArr2;
                    if (hVar.f18849u0 == 1) {
                        int iR2 = hVar.f18846r0;
                        if (iR2 == -1) {
                            if (hVar.f18847s0 == -1 || !B()) {
                                if (B()) {
                                    iR2 = (int) ((hVar.f18845q0 * r()) + 0.5f);
                                }
                                z18 = true;
                            } else {
                                iR2 = r() - hVar.f18847s0;
                            }
                            hVar.S(iR2);
                            z18 = true;
                        } else {
                            hVar.S(iR2);
                            z18 = true;
                        }
                    }
                } else {
                    iArr = iArr2;
                    if ((dVar4 instanceof a) && ((a) dVar4).U() == 0) {
                        z19 = true;
                    }
                }
                i30++;
                iMax4 = i31;
                cVar4 = cVar5;
                iArr2 = iArr;
            }
            i10 = iMax4;
            objArr = iArr2;
            cVar = cVar4;
            if (z18) {
                for (int i32 = 0; i32 < size3; i32++) {
                    d dVar5 = (d) arrayList.get(i32);
                    if (dVar5 instanceof h) {
                        h hVar2 = (h) dVar5;
                        if (hVar2.f18849u0 == 1) {
                            y.h.b(0, hVar2, nVar, z17);
                        }
                    }
                }
            }
            y.h.b(0, this, nVar, z17);
            if (z19) {
                for (int i33 = 0; i33 < size3; i33++) {
                    d dVar6 = (d) arrayList.get(i33);
                    if (dVar6 instanceof a) {
                        a aVar = (a) dVar6;
                        if (aVar.U() == 0 && aVar.T()) {
                            y.h.b(1, aVar, nVar, z17);
                        }
                    }
                }
            }
            if (i28 == 1) {
                L(0, l());
            } else {
                cVar3.l(0);
                this.Z = 0;
            }
            boolean z20 = false;
            boolean z21 = false;
            for (int i34 = 0; i34 < size3; i34++) {
                d dVar7 = (d) arrayList.get(i34);
                if (dVar7 instanceof h) {
                    h hVar3 = (h) dVar7;
                    if (hVar3.f18849u0 == 0) {
                        int iL2 = hVar3.f18846r0;
                        if (iL2 == -1) {
                            if (hVar3.f18847s0 == -1 || !C()) {
                                if (C()) {
                                    iL2 = (int) ((hVar3.f18845q0 * l()) + 0.5f);
                                }
                                z20 = true;
                            } else {
                                iL2 = l() - hVar3.f18847s0;
                            }
                            hVar3.S(iL2);
                            z20 = true;
                        } else {
                            hVar3.S(iL2);
                            z20 = true;
                        }
                    }
                } else if ((dVar7 instanceof a) && ((a) dVar7).U() == 1) {
                    z21 = true;
                }
            }
            if (z20) {
                for (int i35 = 0; i35 < size3; i35++) {
                    d dVar8 = (d) arrayList.get(i35);
                    if (dVar8 instanceof h) {
                        h hVar4 = (h) dVar8;
                        if (hVar4.f18849u0 == 0) {
                            y.h.g(1, hVar4, nVar);
                        }
                    }
                }
            }
            y.h.g(0, this, nVar);
            if (z21) {
                for (int i36 = 0; i36 < size3; i36++) {
                    d dVar9 = (d) arrayList.get(i36);
                    if (dVar9 instanceof a) {
                        a aVar2 = (a) dVar9;
                        if (aVar2.U() == 1 && aVar2.T()) {
                            y.h.g(1, aVar2, nVar);
                        }
                    }
                }
            }
            for (int i37 = 0; i37 < size3; i37++) {
                d dVar10 = (d) arrayList.get(i37);
                if (dVar10.A() && y.h.a(dVar10)) {
                    W(dVar10, nVar, y.h.f19159a);
                    if (!(dVar10 instanceof h)) {
                        i23 = 0;
                        y.h.b(0, dVar10, nVar, z17);
                    } else if (((h) dVar10).f18849u0 == 0) {
                        i23 = 0;
                    } else {
                        y.h.b(0, dVar10, nVar, z17);
                    }
                    y.h.g(i23, dVar10, nVar);
                }
            }
            for (int i38 = 0; i38 < size2; i38++) {
                d dVar11 = (d) this.f18854q0.get(i38);
                if (dVar11.A() && !(dVar11 instanceof h) && !(dVar11 instanceof a) && !(dVar11 instanceof g) && !dVar11.F) {
                    int iK = dVar11.k(0);
                    int iK2 = dVar11.k(1);
                    if (iK != 3 || dVar11.f18799r == 1 || iK2 != 3 || dVar11.f18800s == 1) {
                        W(dVar11, this.f18811u0, new y.b());
                    }
                }
            }
        } else {
            zArr = zArr2;
            i10 = iMax4;
            objArr = iArr2;
            cVar = cVar4;
        }
        v.d dVar12 = this.f18813w0;
        if (size2 <= 2 || !((i25 == 2 || i24 == 2) && k.b(this.D0, 1024))) {
            i11 = iMax3;
            i12 = size2;
            i13 = i24;
            cVar2 = cVar3;
            iL = i10;
            dVar = dVar12;
            i14 = i25;
        } else {
            n nVar2 = this.f18811u0;
            ArrayList arrayList2 = this.f18854q0;
            int size4 = arrayList2.size();
            int i39 = 0;
            while (i39 < size4) {
                d dVar13 = (d) arrayList2.get(i39);
                char c12 = objArr[0];
                char c13 = objArr[1];
                int[] iArr3 = dVar13.f18797p0;
                cVar2 = cVar3;
                if (!y.u(c12, c13, iArr3[0], iArr3[1]) || (dVar13 instanceof g)) {
                    i19 = iMax3;
                    i12 = size2;
                    i20 = i24;
                    i21 = i25;
                    dVar = dVar12;
                    break;
                }
                i39++;
                cVar3 = cVar2;
            }
            cVar2 = cVar3;
            int i40 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i40 < size4) {
                int i41 = size2;
                d dVar14 = (d) arrayList2.get(i40);
                int i42 = i24;
                char c14 = objArr[0];
                int i43 = iMax3;
                char c15 = objArr[1];
                int i44 = i25;
                int[] iArr4 = dVar14.f18797p0;
                v.d dVar15 = dVar12;
                if (!y.u(c14, c15, iArr4[0], iArr4[1])) {
                    W(dVar14, nVar2, this.L0);
                }
                boolean z22 = dVar14 instanceof h;
                if (z22) {
                    h hVar5 = (h) dVar14;
                    if (hVar5.f18849u0 == 0) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(hVar5);
                    }
                    if (hVar5.f18849u0 == 1) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(hVar5);
                    }
                }
                if (dVar14 instanceof j) {
                    if (dVar14 instanceof a) {
                        a aVar3 = (a) dVar14;
                        if (aVar3.U() == 0) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(aVar3);
                        }
                        int iU = aVar3.U();
                        jVar = aVar3;
                        if (iU == 1) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                                jVar = aVar3;
                            }
                        }
                    } else {
                        j jVar2 = (j) dVar14;
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(jVar2);
                        jVar = jVar2;
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                            jVar = jVar2;
                        }
                    }
                    arrayList6.add(jVar);
                }
                if (dVar14.I.f18762f == null && dVar14.K.f18762f == null && !z22 && !(dVar14 instanceof a)) {
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                    }
                    arrayList7.add(dVar14);
                }
                if (dVar14.J.f18762f == null && dVar14.L.f18762f == null && dVar14.M.f18762f == null && !z22 && !(dVar14 instanceof a)) {
                    if (arrayList8 == null) {
                        arrayList8 = new ArrayList();
                    }
                    arrayList8.add(dVar14);
                }
                i40++;
                i24 = i42;
                size2 = i41;
                iMax3 = i43;
                i25 = i44;
                dVar12 = dVar15;
            }
            i19 = iMax3;
            v.d dVar16 = dVar12;
            i12 = size2;
            i20 = i24;
            i21 = i25;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    y.j((h) it.next(), 0, arrayList9, null);
                }
            }
            int i45 = 0;
            o oVar4 = null;
            if (arrayList4 != null) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    j jVar3 = (j) it2.next();
                    o oVarJ = y.j(jVar3, i45, arrayList9, oVar4);
                    jVar3.S(i45, oVarJ, arrayList9);
                    oVarJ.a(arrayList9);
                    i45 = 0;
                    oVar4 = null;
                }
            }
            HashSet hashSet = j(2).f18757a;
            if (hashSet != null) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    y.j(((c) it3.next()).f18760d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = j(4).f18757a;
            if (hashSet2 != null) {
                Iterator it4 = hashSet2.iterator();
                while (it4.hasNext()) {
                    y.j(((c) it4.next()).f18760d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = j(7).f18757a;
            if (hashSet3 != null) {
                Iterator it5 = hashSet3.iterator();
                while (it5.hasNext()) {
                    y.j(((c) it5.next()).f18760d, 0, arrayList9, null);
                }
            }
            o oVar5 = null;
            if (arrayList7 != null) {
                Iterator it6 = arrayList7.iterator();
                while (it6.hasNext()) {
                    y.j((d) it6.next(), 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    y.j((h) it7.next(), 1, arrayList9, null);
                }
            }
            int i46 = 1;
            if (arrayList6 != null) {
                Iterator it8 = arrayList6.iterator();
                while (it8.hasNext()) {
                    j jVar4 = (j) it8.next();
                    o oVarJ2 = y.j(jVar4, i46, arrayList9, oVar5);
                    jVar4.S(i46, oVarJ2, arrayList9);
                    oVarJ2.a(arrayList9);
                    i46 = 1;
                    oVar5 = null;
                }
            }
            HashSet hashSet4 = j(3).f18757a;
            if (hashSet4 != null) {
                Iterator it9 = hashSet4.iterator();
                while (it9.hasNext()) {
                    y.j(((c) it9.next()).f18760d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = j(6).f18757a;
            if (hashSet5 != null) {
                Iterator it10 = hashSet5.iterator();
                while (it10.hasNext()) {
                    y.j(((c) it10.next()).f18760d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = j(5).f18757a;
            if (hashSet6 != null) {
                Iterator it11 = hashSet6.iterator();
                while (it11.hasNext()) {
                    y.j(((c) it11.next()).f18760d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = j(7).f18757a;
            if (hashSet7 != null) {
                Iterator it12 = hashSet7.iterator();
                while (it12.hasNext()) {
                    y.j(((c) it12.next()).f18760d, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                Iterator it13 = arrayList8.iterator();
                while (it13.hasNext()) {
                    y.j((d) it13.next(), 1, arrayList9, null);
                }
            }
            for (int i47 = 0; i47 < size4; i47++) {
                d dVar17 = (d) arrayList2.get(i47);
                int[] iArr5 = dVar17.f18797p0;
                if (iArr5[0] == 3 && iArr5[1] == 3) {
                    int i48 = dVar17.f18793n0;
                    int size5 = arrayList9.size();
                    int i49 = 0;
                    while (true) {
                        if (i49 >= size5) {
                            oVar2 = null;
                            break;
                        }
                        oVar2 = (o) arrayList9.get(i49);
                        if (i48 == oVar2.f19175b) {
                            break;
                        } else {
                            i49++;
                        }
                    }
                    int i50 = dVar17.f18795o0;
                    int size6 = arrayList9.size();
                    int i51 = 0;
                    while (true) {
                        if (i51 >= size6) {
                            oVar3 = null;
                            break;
                        }
                        oVar3 = (o) arrayList9.get(i51);
                        if (i50 == oVar3.f19175b) {
                            break;
                        } else {
                            i51++;
                        }
                    }
                    if (oVar2 != null && oVar3 != null) {
                        oVar2.c(0, oVar3);
                        oVar3.f19176c = 2;
                        arrayList9.remove(oVar2);
                    }
                }
            }
            if (arrayList9.size() > 1) {
                if (objArr[0] == 2) {
                    Iterator it14 = arrayList9.iterator();
                    int i52 = 0;
                    oVar = null;
                    while (it14.hasNext()) {
                        o oVar6 = (o) it14.next();
                        if (oVar6.f19176c != 1) {
                            v.d dVar18 = dVar16;
                            int iB2 = oVar6.b(dVar18, 0);
                            if (iB2 > i52) {
                                oVar = oVar6;
                                i52 = iB2;
                            }
                            dVar16 = dVar18;
                        }
                    }
                    dVar = dVar16;
                    c11 = 1;
                    if (oVar != null) {
                        N(1);
                        P(i52);
                    }
                    if (objArr[c11] != 2) {
                        Iterator it15 = arrayList9.iterator();
                        int i53 = 0;
                        o oVar7 = null;
                        while (it15.hasNext()) {
                            o oVar8 = (o) it15.next();
                            if (oVar8.f19176c != 0 && (iB = oVar8.b(dVar, 1)) > i53) {
                                oVar7 = oVar8;
                                i53 = iB;
                            }
                        }
                        if (oVar7 != null) {
                            O(1);
                            M(i53);
                        } else {
                            oVar7 = null;
                        }
                        if (oVar != null || oVar7 != null) {
                            i14 = i21;
                            if (i14 == 2) {
                                i22 = i19;
                                if (i22 >= r() || i22 <= 0) {
                                    iR = r();
                                    i13 = i20;
                                    if (i13 != 2) {
                                        iL = i10;
                                        if (iL >= l() || iL <= 0) {
                                            iL = l();
                                        } else {
                                            M(iL);
                                            this.F0 = true;
                                        }
                                    } else {
                                        iL = i10;
                                    }
                                    i11 = iR;
                                    z7 = true;
                                } else {
                                    P(i22);
                                    this.E0 = true;
                                }
                            } else {
                                i22 = i19;
                            }
                            iR = i22;
                            i13 = i20;
                            if (i13 != 2) {
                            }
                            i11 = iR;
                            z7 = true;
                        }
                    }
                    boolean z23 = X(64) || X(128);
                    dVar.getClass();
                    dVar.f18334g = false;
                    if (this.D0 == 0 || !z23) {
                        c10 = 1;
                    } else {
                        c10 = 1;
                        dVar.f18334g = true;
                    }
                    ArrayList arrayList10 = this.f18854q0;
                    boolean z24 = objArr[0] == 2 || objArr[c10] == 2;
                    this.f18816z0 = 0;
                    this.A0 = 0;
                    i15 = i12;
                    for (i16 = 0; i16 < i15; i16++) {
                        d dVar19 = (d) this.f18854q0.get(i16);
                        if (dVar19 instanceof l) {
                            ((l) dVar19).S();
                        }
                    }
                    boolean zX = X(64);
                    boolean z25 = z7;
                    int i54 = 0;
                    z10 = true;
                    while (z10) {
                        int i55 = i54 + 1;
                        try {
                            dVar.t();
                            this.f18816z0 = 0;
                            this.A0 = 0;
                            h(dVar);
                            for (int i56 = 0; i56 < i15; i56++) {
                                ((d) this.f18854q0.get(i56)).h(dVar);
                            }
                            U(dVar);
                            try {
                                weakReference = this.G0;
                            } catch (Exception e10) {
                                e = e10;
                                z12 = z25;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            z12 = z25;
                        }
                        if (weakReference != null) {
                            try {
                                if (weakReference.get() != null) {
                                    c cVar6 = (c) this.G0.get();
                                    c cVar7 = cVar2;
                                    try {
                                        iVarK = dVar.k(cVar7);
                                        dVar2 = this.f18813w0;
                                        z12 = z25;
                                        cVar2 = cVar7;
                                    } catch (Exception e12) {
                                        e = e12;
                                        z12 = z25;
                                        cVar2 = cVar7;
                                    }
                                    try {
                                        dVar2.f(dVar2.k(cVar6), iVarK, 0, 5);
                                        this.G0 = null;
                                    } catch (Exception e13) {
                                        e = e13;
                                        z10 = true;
                                        e.printStackTrace();
                                        System.out.println("EXCEPTION : " + e);
                                        if (z10) {
                                        }
                                        if (z24) {
                                        }
                                        iMax = Math.max(this.f18769b0, r());
                                        if (iMax <= r()) {
                                        }
                                        iMax2 = Math.max(this.f18771c0, l());
                                        if (iMax2 <= l()) {
                                        }
                                        if (!z16) {
                                        }
                                        i18 = 8;
                                        if (i55 > i18) {
                                        }
                                        z25 = z16;
                                        i54 = i55;
                                        z24 = z14;
                                    }
                                } else {
                                    z12 = z25;
                                }
                                try {
                                    WeakReference weakReference2 = this.I0;
                                    if (weakReference2 != null && weakReference2.get() != null) {
                                        c cVar8 = (c) this.I0.get();
                                        v.i iVarK2 = dVar.k(this.L);
                                        v.d dVar20 = this.f18813w0;
                                        dVar20.f(iVarK2, dVar20.k(cVar8), 0, 5);
                                        this.I0 = null;
                                    }
                                    WeakReference weakReference3 = this.H0;
                                    if (weakReference3 != null && weakReference3.get() != null) {
                                        c cVar9 = (c) this.H0.get();
                                        c cVar10 = cVar;
                                        try {
                                            v.i iVarK3 = dVar.k(cVar10);
                                            v.d dVar21 = this.f18813w0;
                                            cVar = cVar10;
                                            dVar21.f(dVar21.k(cVar9), iVarK3, 0, 5);
                                            this.H0 = null;
                                        } catch (Exception e14) {
                                            e = e14;
                                            cVar = cVar10;
                                            z10 = true;
                                            e.printStackTrace();
                                            System.out.println("EXCEPTION : " + e);
                                            if (z10) {
                                            }
                                            if (z24) {
                                            }
                                            iMax = Math.max(this.f18769b0, r());
                                            if (iMax <= r()) {
                                            }
                                            iMax2 = Math.max(this.f18771c0, l());
                                            if (iMax2 <= l()) {
                                            }
                                            if (!z16) {
                                            }
                                            i18 = 8;
                                            if (i55 > i18) {
                                            }
                                            z25 = z16;
                                            i54 = i55;
                                            z24 = z14;
                                        }
                                    }
                                    WeakReference weakReference4 = this.J0;
                                    if (weakReference4 != null && weakReference4.get() != null) {
                                        c cVar11 = (c) this.J0.get();
                                        v.i iVarK4 = dVar.k(this.K);
                                        try {
                                            dVar3 = this.f18813w0;
                                        } catch (Exception e15) {
                                            e = e15;
                                            z10 = true;
                                            e.printStackTrace();
                                            System.out.println("EXCEPTION : " + e);
                                            if (z10) {
                                                zArr[2] = false;
                                                boolean zX2 = X(64);
                                                R(dVar, zX2);
                                                size = this.f18854q0.size();
                                                i17 = 0;
                                                z13 = false;
                                                while (i17 < size) {
                                                }
                                            } else {
                                                R(dVar, zX);
                                                for (int i57 = 0; i57 < i15; i57++) {
                                                    ((d) this.f18854q0.get(i57)).R(dVar, zX);
                                                }
                                                z13 = false;
                                            }
                                            if (z24) {
                                                z14 = z24;
                                            }
                                            iMax = Math.max(this.f18769b0, r());
                                            if (iMax <= r()) {
                                            }
                                            iMax2 = Math.max(this.f18771c0, l());
                                            if (iMax2 <= l()) {
                                            }
                                            if (!z16) {
                                            }
                                            i18 = 8;
                                            if (i55 > i18) {
                                            }
                                            z25 = z16;
                                            i54 = i55;
                                            z24 = z14;
                                        }
                                        try {
                                            dVar3.f(iVarK4, dVar3.k(cVar11), 0, 5);
                                        } catch (Exception e16) {
                                            e = e16;
                                            z10 = true;
                                            e.printStackTrace();
                                            System.out.println("EXCEPTION : " + e);
                                            if (z10) {
                                            }
                                            if (z24) {
                                            }
                                            iMax = Math.max(this.f18769b0, r());
                                            if (iMax <= r()) {
                                            }
                                            iMax2 = Math.max(this.f18771c0, l());
                                            if (iMax2 <= l()) {
                                            }
                                            if (!z16) {
                                            }
                                            i18 = 8;
                                            if (i55 > i18) {
                                            }
                                            z25 = z16;
                                            i54 = i55;
                                            z24 = z14;
                                        }
                                        try {
                                            this.J0 = null;
                                        } catch (Exception e17) {
                                            e = e17;
                                            z10 = true;
                                            e.printStackTrace();
                                            System.out.println("EXCEPTION : " + e);
                                            if (z10) {
                                            }
                                            if (z24) {
                                            }
                                            iMax = Math.max(this.f18769b0, r());
                                            if (iMax <= r()) {
                                            }
                                            iMax2 = Math.max(this.f18771c0, l());
                                            if (iMax2 <= l()) {
                                            }
                                            if (!z16) {
                                            }
                                            i18 = 8;
                                            if (i55 > i18) {
                                            }
                                            z25 = z16;
                                            i54 = i55;
                                            z24 = z14;
                                        }
                                    }
                                    dVar.p();
                                } catch (Exception e18) {
                                    e = e18;
                                }
                            } catch (Exception e19) {
                                e = e19;
                                z12 = z25;
                            }
                            zArr[2] = false;
                            boolean zX22 = X(64);
                            R(dVar, zX22);
                            size = this.f18854q0.size();
                            i17 = 0;
                            z13 = false;
                            while (i17 < size) {
                                d dVar22 = (d) this.f18854q0.get(i17);
                                dVar22.R(dVar, zX22);
                                boolean z26 = zX22;
                                int i58 = size;
                                if (dVar22.f18780h != -1 || dVar22.f18782i != -1) {
                                    z13 = true;
                                }
                                i17++;
                                zX22 = z26;
                                size = i58;
                            }
                        }
                        if (z24 || i55 >= 8 || !zArr[2]) {
                            z14 = z24;
                        } else {
                            int i59 = 0;
                            int iMax5 = 0;
                            int iMax6 = 0;
                            while (i59 < i15) {
                                d dVar23 = (d) this.f18854q0.get(i59);
                                iMax6 = Math.max(iMax6, dVar23.r() + dVar23.Y);
                                iMax5 = Math.max(iMax5, dVar23.l() + dVar23.Z);
                                i59++;
                                z24 = z24;
                            }
                            z14 = z24;
                            int iMax7 = Math.max(this.f18769b0, iMax6);
                            int iMax8 = Math.max(this.f18771c0, iMax5);
                            if (i14 == 2 && r() < iMax7) {
                                P(iMax7);
                                objArr[0] = 2;
                                z13 = true;
                                z12 = true;
                            }
                            if (i13 == 2 && l() < iMax8) {
                                M(iMax8);
                                objArr[1] = 2;
                                z13 = true;
                                z12 = true;
                            }
                        }
                        iMax = Math.max(this.f18769b0, r());
                        if (iMax <= r()) {
                            P(iMax);
                            r62 = 1;
                            objArr[0] = 1;
                            z13 = true;
                            z15 = true;
                        } else {
                            r62 = 1;
                            z15 = z12;
                        }
                        iMax2 = Math.max(this.f18771c0, l());
                        if (iMax2 <= l()) {
                            M(iMax2);
                            objArr[r62] = r62;
                            z16 = true;
                            z13 = true;
                        } else {
                            z16 = z15;
                        }
                        if (!z16) {
                            if (objArr[0] == 2 && i11 > 0 && r() > i11) {
                                this.E0 = r62;
                                objArr[0] = r62;
                                P(i11);
                                z16 = true;
                                z13 = true;
                            }
                            if (objArr[r62] == 2 && iL > 0 && l() > iL) {
                                this.F0 = r62;
                                objArr[r62] = r62;
                                M(iL);
                                z16 = true;
                                i18 = 8;
                                z13 = true;
                            }
                            z10 = i55 > i18 ? false : z13;
                            z25 = z16;
                            i54 = i55;
                            z24 = z14;
                        }
                        i18 = 8;
                        if (i55 > i18) {
                        }
                        z25 = z16;
                        i54 = i55;
                        z24 = z14;
                    }
                    z11 = z25;
                    this.f18854q0 = arrayList10;
                    if (z11) {
                        objArr[0] = i14;
                        objArr[1] = i13;
                    }
                    G(dVar.f18339l);
                }
                dVar = dVar16;
                c11 = 1;
                oVar = null;
                if (objArr[c11] != 2) {
                }
                if (X(64)) {
                }
                dVar.getClass();
                dVar.f18334g = false;
                if (this.D0 == 0) {
                    c10 = 1;
                }
                ArrayList arrayList102 = this.f18854q0;
                if (objArr[0] == 2) {
                }
                this.f18816z0 = 0;
                this.A0 = 0;
                i15 = i12;
                while (i16 < i15) {
                }
                boolean zX3 = X(64);
                boolean z252 = z7;
                int i542 = 0;
                z10 = true;
                while (z10) {
                }
                z11 = z252;
                this.f18854q0 = arrayList102;
                if (z11) {
                }
                G(dVar.f18339l);
            }
            dVar = dVar16;
            iL = i10;
            i13 = i20;
            i11 = i19;
            i14 = i21;
        }
        z7 = false;
        if (X(64)) {
        }
        dVar.getClass();
        dVar.f18334g = false;
        if (this.D0 == 0) {
        }
        ArrayList arrayList1022 = this.f18854q0;
        if (objArr[0] == 2) {
        }
        this.f18816z0 = 0;
        this.A0 = 0;
        i15 = i12;
        while (i16 < i15) {
        }
        boolean zX32 = X(64);
        boolean z2522 = z7;
        int i5422 = 0;
        z10 = true;
        while (z10) {
        }
        z11 = z2522;
        this.f18854q0 = arrayList1022;
        if (z11) {
        }
        G(dVar.f18339l);
    }

    public final void T(int i10, d dVar) {
        if (i10 == 0) {
            int i11 = this.f18816z0 + 1;
            b[] bVarArr = this.C0;
            if (i11 >= bVarArr.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.C0;
            int i12 = this.f18816z0;
            bVarArr2[i12] = new b(dVar, 0, this.f18812v0);
            this.f18816z0 = i12 + 1;
            return;
        }
        if (i10 == 1) {
            int i13 = this.A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i13 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i14 = this.A0;
            bVarArr4[i14] = new b(dVar, 1, this.f18812v0);
            this.A0 = i14 + 1;
        }
    }

    public final void U(v.d dVar) {
        boolean zX = X(64);
        c(dVar, zX);
        int size = this.f18854q0.size();
        boolean z7 = false;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar2 = (d) this.f18854q0.get(i10);
            boolean[] zArr = dVar2.S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar2 instanceof a) {
                z7 = true;
            }
        }
        if (z7) {
            for (int i11 = 0; i11 < size; i11++) {
                d dVar3 = (d) this.f18854q0.get(i11);
                if (dVar3 instanceof a) {
                    a aVar = (a) dVar3;
                    for (int i12 = 0; i12 < aVar.f18852r0; i12++) {
                        d dVar4 = aVar.f18851q0[i12];
                        if (aVar.f18737t0 || dVar4.d()) {
                            int i13 = aVar.f18736s0;
                            if (i13 == 0 || i13 == 1) {
                                dVar4.S[0] = true;
                            } else if (i13 == 2 || i13 == 3) {
                                dVar4.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i14 = 0; i14 < size; i14++) {
            d dVar5 = (d) this.f18854q0.get(i14);
            dVar5.getClass();
            boolean z10 = dVar5 instanceof g;
            if (z10 || (dVar5 instanceof h)) {
                if (z10) {
                    hashSet.add(dVar5);
                } else {
                    dVar5.c(dVar, zX);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((d) it.next());
                for (int i15 = 0; i15 < gVar.f18852r0; i15++) {
                    if (hashSet.contains(gVar.f18851q0[i15])) {
                        gVar.c(dVar, zX);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).c(dVar, zX);
                }
                hashSet.clear();
            }
        }
        if (v.d.f18326p) {
            HashSet hashSet2 = new HashSet();
            for (int i16 = 0; i16 < size; i16++) {
                d dVar6 = (d) this.f18854q0.get(i16);
                dVar6.getClass();
                if (!(dVar6 instanceof g) && !(dVar6 instanceof h)) {
                    hashSet2.add(dVar6);
                }
            }
            b(this, dVar, hashSet2, this.f18797p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar7 = (d) it3.next();
                k.a(this, dVar, dVar7);
                dVar7.c(dVar, zX);
            }
        } else {
            for (int i17 = 0; i17 < size; i17++) {
                d dVar8 = (d) this.f18854q0.get(i17);
                if (dVar8 instanceof e) {
                    int[] iArr = dVar8.f18797p0;
                    int i18 = iArr[0];
                    int i19 = iArr[1];
                    if (i18 == 2) {
                        dVar8.N(1);
                    }
                    if (i19 == 2) {
                        dVar8.O(1);
                    }
                    dVar8.c(dVar, zX);
                    if (i18 == 2) {
                        dVar8.N(i18);
                    }
                    if (i19 == 2) {
                        dVar8.O(i19);
                    }
                } else {
                    k.a(this, dVar, dVar8);
                    if (!(dVar8 instanceof g) && !(dVar8 instanceof h)) {
                        dVar8.c(dVar, zX);
                    }
                }
            }
        }
        if (this.f18816z0 > 0) {
            u.a(this, dVar, null, 0);
        }
        if (this.A0 > 0) {
            u.a(this, dVar, null, 1);
        }
    }

    public final boolean V(int i10, boolean z7) {
        boolean z10;
        y.g gVar;
        int iL;
        boolean z11 = true;
        boolean z12 = z7 & true;
        y.e eVar = this.f18809s0;
        e eVar2 = (e) eVar.f19139c;
        int iK = eVar2.k(0);
        int iK2 = eVar2.k(1);
        int iS = eVar2.s();
        int iT = eVar2.t();
        Object obj = eVar.f19141e;
        if (z12 && (iK == 2 || iK2 == 2)) {
            Iterator it = ((ArrayList) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.f19184f == i10 && !pVar.k()) {
                    z12 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z12 && iK == 2) {
                    eVar2.N(1);
                    eVar2.P(eVar.d(eVar2, 0));
                    gVar = eVar2.f18772d.f19183e;
                    iL = eVar2.r();
                    gVar.d(iL);
                }
            } else if (z12 && iK2 == 2) {
                eVar2.O(1);
                eVar2.M(eVar.d(eVar2, 1));
                gVar = eVar2.f18774e.f19183e;
                iL = eVar2.l();
                gVar.d(iL);
            }
        }
        if (i10 == 0) {
            int i11 = eVar2.f18797p0[0];
            if (i11 == 1 || i11 == 4) {
                int iR = eVar2.r() + iS;
                eVar2.f18772d.f19187i.d(iR);
                eVar2.f18772d.f19183e.d(iR - iS);
                z10 = true;
            }
            z10 = false;
        } else {
            int i12 = eVar2.f18797p0[1];
            if (i12 == 1 || i12 == 4) {
                int iL2 = eVar2.l() + iT;
                eVar2.f18774e.f19187i.d(iL2);
                eVar2.f18774e.f19183e.d(iL2 - iT);
                z10 = true;
            }
            z10 = false;
        }
        eVar.g();
        ArrayList arrayList = (ArrayList) obj;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            if (pVar2.f19184f == i10 && (pVar2.f19180b != eVar2 || pVar2.f19185g)) {
                pVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p pVar3 = (p) it3.next();
            if (pVar3.f19184f == i10 && (z10 || pVar3.f19180b != eVar2)) {
                if (!pVar3.f19186h.f19155j || !pVar3.f19187i.f19155j || (!(pVar3 instanceof y.c) && !pVar3.f19183e.f19155j)) {
                    z11 = false;
                    break;
                }
            }
        }
        eVar2.N(iK);
        eVar2.O(iK2);
        return z11;
    }

    public final boolean X(int i10) {
        return (this.D0 & i10) == i10;
    }

    @Override // x.d
    public final void o(StringBuilder sb) {
        sb.append(this.f18784j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        Iterator it = this.f18854q0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}