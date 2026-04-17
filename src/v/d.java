package v;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f18326p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f18327q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final g f18330c;

    /* renamed from: f, reason: collision with root package name */
    public c[] f18333f;

    /* renamed from: l, reason: collision with root package name */
    public final g2.h f18339l;

    /* renamed from: o, reason: collision with root package name */
    public c f18342o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f18328a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f18329b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f18331d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f18332e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18334g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f18335h = new boolean[32];

    /* renamed from: i, reason: collision with root package name */
    public int f18336i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f18337j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f18338k = 32;

    /* renamed from: m, reason: collision with root package name */
    public i[] f18340m = new i[f18327q];

    /* renamed from: n, reason: collision with root package name */
    public int f18341n = 0;

    public d() {
        this.f18333f = null;
        this.f18333f = new c[32];
        s();
        g2.h hVar = new g2.h(3);
        this.f18339l = hVar;
        g gVar = new g(hVar);
        gVar.f18348f = new i[128];
        gVar.f18349g = new i[128];
        gVar.f18350h = 0;
        gVar.f18351i = new g.e(gVar, gVar);
        this.f18330c = gVar;
        this.f18342o = new c(hVar);
    }

    public static int n(x.c cVar) {
        i iVar = cVar.f18765i;
        if (iVar != null) {
            return (int) (iVar.f18357m + 0.5f);
        }
        return 0;
    }

    public final i a(int i10) {
        i iVar = (i) ((e) this.f18339l.f13013f).j();
        if (iVar == null) {
            iVar = new i(i10);
        } else {
            iVar.g();
        }
        iVar.O = i10;
        int i11 = this.f18341n;
        int i12 = f18327q;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            f18327q = i13;
            this.f18340m = (i[]) Arrays.copyOf(this.f18340m, i13);
        }
        i[] iVarArr = this.f18340m;
        int i14 = this.f18341n;
        this.f18341n = i14 + 1;
        iVarArr[i14] = iVar;
        return iVar;
    }

    public final void b(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        int i13;
        float f11;
        c cVarL = l();
        if (iVar2 == iVar3) {
            cVarL.f18324d.c(iVar, 1.0f);
            cVarL.f18324d.c(iVar4, 1.0f);
            cVarL.f18324d.c(iVar2, -2.0f);
        } else {
            if (f10 == 0.5f) {
                cVarL.f18324d.c(iVar, 1.0f);
                cVarL.f18324d.c(iVar2, -1.0f);
                cVarL.f18324d.c(iVar3, -1.0f);
                cVarL.f18324d.c(iVar4, 1.0f);
                if (i10 > 0 || i11 > 0) {
                    i13 = (-i10) + i11;
                    f11 = i13;
                }
            } else if (f10 <= 0.0f) {
                cVarL.f18324d.c(iVar, -1.0f);
                cVarL.f18324d.c(iVar2, 1.0f);
                f11 = i10;
            } else if (f10 >= 1.0f) {
                cVarL.f18324d.c(iVar4, -1.0f);
                cVarL.f18324d.c(iVar3, 1.0f);
                i13 = -i11;
                f11 = i13;
            } else {
                float f12 = 1.0f - f10;
                cVarL.f18324d.c(iVar, f12 * 1.0f);
                cVarL.f18324d.c(iVar2, f12 * (-1.0f));
                cVarL.f18324d.c(iVar3, (-1.0f) * f10);
                cVarL.f18324d.c(iVar4, 1.0f * f10);
                if (i10 > 0 || i11 > 0) {
                    cVarL.f18322b = (i11 * f10) + ((-i10) * f12);
                }
            }
            cVarL.f18322b = f11;
        }
        if (i12 != 8) {
            cVarL.a(this, i12);
        }
        c(cVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ad A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(c cVar) {
        boolean z7;
        boolean z10;
        i iVar;
        i iVarF;
        ArrayList arrayList;
        if (this.f18337j + 1 >= this.f18338k || this.f18336i + 1 >= this.f18332e) {
            o();
        }
        if (!cVar.f18325e) {
            if (this.f18333f.length != 0) {
                boolean z11 = false;
                while (!z11) {
                    int iD = cVar.f18324d.d();
                    int i10 = 0;
                    while (true) {
                        arrayList = cVar.f18323c;
                        if (i10 >= iD) {
                            break;
                        }
                        i iVarH = cVar.f18324d.h(i10);
                        if (iVarH.f18355f != -1 || iVarH.f18358n) {
                            arrayList.add(iVarH);
                        }
                        i10++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i11 = 0; i11 < size; i11++) {
                            i iVar2 = (i) arrayList.get(i11);
                            if (iVar2.f18358n) {
                                cVar.h(this, iVar2, true);
                            } else {
                                cVar.i(this, this.f18333f[iVar2.f18355f], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z11 = true;
                    }
                }
                if (cVar.f18321a != null && cVar.f18324d.d() == 0) {
                    cVar.f18325e = true;
                    this.f18328a = true;
                }
            }
            if (cVar.e()) {
                return;
            }
            float f10 = cVar.f18322b;
            if (f10 < 0.0f) {
                cVar.f18322b = f10 * (-1.0f);
                cVar.f18324d.k();
            }
            int iD2 = cVar.f18324d.d();
            i iVar3 = null;
            i iVar4 = null;
            float f11 = 0.0f;
            boolean z12 = false;
            float f12 = 0.0f;
            boolean z13 = false;
            for (int i12 = 0; i12 < iD2; i12++) {
                float fA = cVar.f18324d.a(i12);
                i iVarH2 = cVar.f18324d.h(i12);
                if (iVarH2.O == 1) {
                    if (iVar3 == null) {
                        z12 = iVarH2.N <= 1;
                    } else if (f11 > fA) {
                        if (iVarH2.N <= 1) {
                        }
                    } else if (!z12 && iVarH2.N <= 1) {
                        iVar3 = iVarH2;
                        f11 = fA;
                        z12 = true;
                    }
                    iVar3 = iVarH2;
                    f11 = fA;
                } else if (iVar3 == null && fA < 0.0f) {
                    if (iVar4 == null) {
                        z13 = iVarH2.N <= 1;
                    } else if (f12 > fA) {
                        if (iVarH2.N <= 1) {
                        }
                    } else if (!z13 && iVarH2.N <= 1) {
                        iVar4 = iVarH2;
                        f12 = fA;
                        z13 = true;
                    }
                    iVar4 = iVarH2;
                    f12 = fA;
                }
            }
            if (iVar3 == null) {
                iVar3 = iVar4;
            }
            if (iVar3 == null) {
                z7 = true;
            } else {
                cVar.g(iVar3);
                z7 = false;
            }
            if (cVar.f18324d.d() == 0) {
                cVar.f18325e = true;
            }
            if (z7) {
                if (this.f18336i + 1 >= this.f18332e) {
                    o();
                }
                i iVarA = a(3);
                int i13 = this.f18329b + 1;
                this.f18329b = i13;
                this.f18336i++;
                iVarA.f18354e = i13;
                g2.h hVar = this.f18339l;
                ((i[]) hVar.f13014j)[i13] = iVarA;
                cVar.f18321a = iVarA;
                int i14 = this.f18337j;
                h(cVar);
                if (this.f18337j == i14 + 1) {
                    c cVar2 = this.f18342o;
                    cVar2.getClass();
                    cVar2.f18321a = null;
                    cVar2.f18324d.clear();
                    for (int i15 = 0; i15 < cVar.f18324d.d(); i15++) {
                        cVar2.f18324d.f(cVar.f18324d.h(i15), cVar.f18324d.a(i15), true);
                    }
                    r(this.f18342o);
                    if (iVarA.f18355f == -1) {
                        if (cVar.f18321a == iVarA && (iVarF = cVar.f(null, iVarA)) != null) {
                            cVar.g(iVarF);
                        }
                        if (!cVar.f18325e) {
                            cVar.f18321a.k(this, cVar);
                        }
                        ((e) hVar.f13012e).d(cVar);
                        this.f18337j--;
                    }
                    z10 = true;
                }
                iVar = cVar.f18321a;
                if (iVar != null) {
                }
            } else {
                z10 = false;
                iVar = cVar.f18321a;
                if (iVar != null) {
                    return;
                }
                if ((iVar.O != 1 && cVar.f18322b < 0.0f) || z10) {
                    return;
                }
            }
        }
        h(cVar);
    }

    public final void d(i iVar, int i10) {
        c cVarL;
        b bVar;
        float f10;
        int i11 = iVar.f18355f;
        if (i11 == -1) {
            iVar.j(this, i10);
            for (int i12 = 0; i12 < this.f18329b + 1; i12++) {
                i iVar2 = ((i[]) this.f18339l.f13014j)[i12];
            }
            return;
        }
        if (i11 != -1) {
            c cVar = this.f18333f[i11];
            if (!cVar.f18325e) {
                if (cVar.f18324d.d() == 0) {
                    cVar.f18325e = true;
                } else {
                    cVarL = l();
                    if (i10 < 0) {
                        cVarL.f18322b = i10 * (-1);
                        bVar = cVarL.f18324d;
                        f10 = 1.0f;
                    } else {
                        cVarL.f18322b = i10;
                        bVar = cVarL.f18324d;
                        f10 = -1.0f;
                    }
                    bVar.c(iVar, f10);
                }
            }
            cVar.f18322b = i10;
            return;
        }
        cVarL = l();
        cVarL.f18321a = iVar;
        float f11 = i10;
        iVar.f18357m = f11;
        cVarL.f18322b = f11;
        cVarL.f18325e = true;
        c(cVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(i iVar, i iVar2, int i10, int i11) {
        boolean z7;
        if (i11 == 8 && iVar2.f18358n && iVar.f18355f == -1) {
            iVar.j(this, iVar2.f18357m + i10);
            return;
        }
        c cVarL = l();
        if (i10 == 0) {
            cVarL.f18324d.c(iVar, -1.0f);
            cVarL.f18324d.c(iVar2, 1.0f);
        } else {
            if (i10 < 0) {
                i10 *= -1;
                z7 = true;
            } else {
                z7 = false;
            }
            cVarL.f18322b = i10;
            if (z7) {
                cVarL.f18324d.c(iVar, 1.0f);
                cVarL.f18324d.c(iVar2, -1.0f);
            }
        }
        if (i11 != 8) {
            cVarL.a(this, i11);
        }
        c(cVarL);
    }

    public final void f(i iVar, i iVar2, int i10, int i11) {
        c cVarL = l();
        i iVarM = m();
        iVarM.f18356j = 0;
        cVarL.b(iVar, iVar2, iVarM, i10);
        if (i11 != 8) {
            cVarL.f18324d.c(j(i11), (int) (cVarL.f18324d.g(iVarM) * (-1.0f)));
        }
        c(cVarL);
    }

    public final void g(i iVar, i iVar2, int i10, int i11) {
        c cVarL = l();
        i iVarM = m();
        iVarM.f18356j = 0;
        cVarL.c(iVar, iVar2, iVarM, i10);
        if (i11 != 8) {
            cVarL.f18324d.c(j(i11), (int) (cVarL.f18324d.g(iVarM) * (-1.0f)));
        }
        c(cVarL);
    }

    public final void h(c cVar) {
        int i10;
        if (cVar.f18325e) {
            cVar.f18321a.j(this, cVar.f18322b);
        } else {
            c[] cVarArr = this.f18333f;
            int i11 = this.f18337j;
            cVarArr[i11] = cVar;
            i iVar = cVar.f18321a;
            iVar.f18355f = i11;
            this.f18337j = i11 + 1;
            iVar.k(this, cVar);
        }
        if (this.f18328a) {
            int i12 = 0;
            while (i12 < this.f18337j) {
                if (this.f18333f[i12] == null) {
                    System.out.println("WTF");
                }
                c cVar2 = this.f18333f[i12];
                if (cVar2 != null && cVar2.f18325e) {
                    cVar2.f18321a.j(this, cVar2.f18322b);
                    ((e) this.f18339l.f13012e).d(cVar2);
                    this.f18333f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f18337j;
                        if (i13 >= i10) {
                            break;
                        }
                        c[] cVarArr2 = this.f18333f;
                        int i15 = i13 - 1;
                        c cVar3 = cVarArr2[i13];
                        cVarArr2[i15] = cVar3;
                        i iVar2 = cVar3.f18321a;
                        if (iVar2.f18355f == i13) {
                            iVar2.f18355f = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f18333f[i14] = null;
                    }
                    this.f18337j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f18328a = false;
        }
    }

    public final void i() {
        for (int i10 = 0; i10 < this.f18337j; i10++) {
            c cVar = this.f18333f[i10];
            cVar.f18321a.f18357m = cVar.f18322b;
        }
    }

    public final i j(int i10) {
        if (this.f18336i + 1 >= this.f18332e) {
            o();
        }
        i iVarA = a(4);
        int i11 = this.f18329b + 1;
        this.f18329b = i11;
        this.f18336i++;
        iVarA.f18354e = i11;
        iVarA.f18356j = i10;
        ((i[]) this.f18339l.f13014j)[i11] = iVarA;
        g gVar = this.f18330c;
        gVar.f18351i.f12763e = iVarA;
        float[] fArr = iVarA.f18360u;
        Arrays.fill(fArr, 0.0f);
        fArr[iVarA.f18356j] = 1.0f;
        gVar.j(iVarA);
        return iVarA;
    }

    public final i k(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f18336i + 1 >= this.f18332e) {
            o();
        }
        if (obj instanceof x.c) {
            x.c cVar = (x.c) obj;
            iVar = cVar.f18765i;
            if (iVar == null) {
                cVar.k();
                iVar = cVar.f18765i;
            }
            int i10 = iVar.f18354e;
            g2.h hVar = this.f18339l;
            if (i10 == -1 || i10 > this.f18329b || ((i[]) hVar.f13014j)[i10] == null) {
                if (i10 != -1) {
                    iVar.g();
                }
                int i11 = this.f18329b + 1;
                this.f18329b = i11;
                this.f18336i++;
                iVar.f18354e = i11;
                iVar.O = 1;
                ((i[]) hVar.f13014j)[i11] = iVar;
            }
        }
        return iVar;
    }

    public final c l() {
        g2.h hVar = this.f18339l;
        c cVar = (c) ((e) hVar.f13012e).j();
        if (cVar == null) {
            return new c(hVar);
        }
        cVar.f18321a = null;
        cVar.f18324d.clear();
        cVar.f18322b = 0.0f;
        cVar.f18325e = false;
        return cVar;
    }

    public final i m() {
        if (this.f18336i + 1 >= this.f18332e) {
            o();
        }
        i iVarA = a(3);
        int i10 = this.f18329b + 1;
        this.f18329b = i10;
        this.f18336i++;
        iVarA.f18354e = i10;
        ((i[]) this.f18339l.f13014j)[i10] = iVarA;
        return iVarA;
    }

    public final void o() {
        int i10 = this.f18331d * 2;
        this.f18331d = i10;
        this.f18333f = (c[]) Arrays.copyOf(this.f18333f, i10);
        g2.h hVar = this.f18339l;
        hVar.f13014j = (i[]) Arrays.copyOf((i[]) hVar.f13014j, this.f18331d);
        int i11 = this.f18331d;
        this.f18335h = new boolean[i11];
        this.f18332e = i11;
        this.f18338k = i11;
    }

    public final void p() {
        g gVar = this.f18330c;
        if (gVar.e()) {
            i();
            return;
        }
        if (this.f18334g) {
            for (int i10 = 0; i10 < this.f18337j; i10++) {
                if (this.f18333f[i10].f18325e) {
                }
            }
            i();
            return;
        }
        q(gVar);
    }

    public final void q(g gVar) {
        int i10 = 0;
        while (true) {
            if (i10 >= this.f18337j) {
                break;
            }
            c cVar = this.f18333f[i10];
            int i11 = 1;
            if (cVar.f18321a.O != 1) {
                float f10 = 0.0f;
                if (cVar.f18322b < 0.0f) {
                    boolean z7 = false;
                    int i12 = 0;
                    while (!z7) {
                        i12 += i11;
                        float f11 = Float.MAX_VALUE;
                        int i13 = 0;
                        int i14 = -1;
                        int i15 = -1;
                        int i16 = 0;
                        while (i13 < this.f18337j) {
                            c cVar2 = this.f18333f[i13];
                            if (cVar2.f18321a.O != i11 && !cVar2.f18325e && cVar2.f18322b < f10) {
                                int iD = cVar2.f18324d.d();
                                int i17 = 0;
                                while (i17 < iD) {
                                    i iVarH = cVar2.f18324d.h(i17);
                                    float fG = cVar2.f18324d.g(iVarH);
                                    if (fG > f10) {
                                        for (int i18 = 0; i18 < 9; i18++) {
                                            float f12 = iVarH.f18359t[i18] / fG;
                                            if ((f12 < f11 && i18 == i16) || i18 > i16) {
                                                i16 = i18;
                                                i15 = iVarH.f18354e;
                                                i14 = i13;
                                                f11 = f12;
                                            }
                                        }
                                    }
                                    i17++;
                                    f10 = 0.0f;
                                }
                            }
                            i13++;
                            f10 = 0.0f;
                            i11 = 1;
                        }
                        if (i14 != -1) {
                            c cVar3 = this.f18333f[i14];
                            cVar3.f18321a.f18355f = -1;
                            cVar3.g(((i[]) this.f18339l.f13014j)[i15]);
                            i iVar = cVar3.f18321a;
                            iVar.f18355f = i14;
                            iVar.k(this, cVar3);
                        } else {
                            z7 = true;
                        }
                        if (i12 > this.f18336i / 2) {
                            z7 = true;
                        }
                        f10 = 0.0f;
                        i11 = 1;
                    }
                }
            }
            i10++;
        }
        r(gVar);
        i();
    }

    public final void r(c cVar) {
        for (int i10 = 0; i10 < this.f18336i; i10++) {
            this.f18335h[i10] = false;
        }
        boolean z7 = false;
        int i11 = 0;
        while (!z7) {
            i11++;
            if (i11 >= this.f18336i * 2) {
                return;
            }
            i iVar = cVar.f18321a;
            if (iVar != null) {
                this.f18335h[iVar.f18354e] = true;
            }
            i iVarD = cVar.d(this.f18335h);
            if (iVarD != null) {
                boolean[] zArr = this.f18335h;
                int i12 = iVarD.f18354e;
                if (zArr[i12]) {
                    return;
                } else {
                    zArr[i12] = true;
                }
            }
            if (iVarD != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f18337j; i14++) {
                    c cVar2 = this.f18333f[i14];
                    if (cVar2.f18321a.O != 1 && !cVar2.f18325e && cVar2.f18324d.i(iVarD)) {
                        float fG = cVar2.f18324d.g(iVarD);
                        if (fG < 0.0f) {
                            float f11 = (-cVar2.f18322b) / fG;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    c cVar3 = this.f18333f[i13];
                    cVar3.f18321a.f18355f = -1;
                    cVar3.g(iVarD);
                    i iVar2 = cVar3.f18321a;
                    iVar2.f18355f = i13;
                    iVar2.k(this, cVar3);
                }
            } else {
                z7 = true;
            }
        }
    }

    public final void s() {
        for (int i10 = 0; i10 < this.f18337j; i10++) {
            c cVar = this.f18333f[i10];
            if (cVar != null) {
                ((e) this.f18339l.f13012e).d(cVar);
            }
            this.f18333f[i10] = null;
        }
    }

    public final void t() {
        g2.h hVar;
        int i10 = 0;
        while (true) {
            hVar = this.f18339l;
            i[] iVarArr = (i[]) hVar.f13014j;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.g();
            }
            i10++;
        }
        e eVar = (e) hVar.f13013f;
        i[] iVarArr2 = this.f18340m;
        int length = this.f18341n;
        eVar.getClass();
        if (length > iVarArr2.length) {
            length = iVarArr2.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            i iVar2 = iVarArr2[i11];
            int i12 = eVar.f18345f;
            Object[] objArr = eVar.f18344e;
            if (i12 < objArr.length) {
                objArr[i12] = iVar2;
                eVar.f18345f = i12 + 1;
            }
        }
        this.f18341n = 0;
        Arrays.fill((i[]) hVar.f13014j, (Object) null);
        this.f18329b = 0;
        g gVar = this.f18330c;
        gVar.f18350h = 0;
        gVar.f18322b = 0.0f;
        this.f18336i = 1;
        for (int i13 = 0; i13 < this.f18337j; i13++) {
            c cVar = this.f18333f[i13];
        }
        s();
        this.f18337j = 0;
        this.f18342o = new c(hVar);
    }
}