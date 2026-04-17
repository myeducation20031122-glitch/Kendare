package x;

import com.google.android.gms.internal.ads.ic1;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kc.r;
import y.m;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class d {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final c I;
    public final c J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c P;
    public final c[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public d T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f18767a0;

    /* renamed from: b, reason: collision with root package name */
    public y.c f18768b;

    /* renamed from: b0, reason: collision with root package name */
    public int f18769b0;

    /* renamed from: c, reason: collision with root package name */
    public y.c f18770c;

    /* renamed from: c0, reason: collision with root package name */
    public int f18771c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f18773d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f18775e0;

    /* renamed from: f0, reason: collision with root package name */
    public Object f18777f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f18779g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f18781h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f18783i0;

    /* renamed from: j, reason: collision with root package name */
    public String f18784j;

    /* renamed from: j0, reason: collision with root package name */
    public int f18785j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18786k;

    /* renamed from: k0, reason: collision with root package name */
    public final float[] f18787k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18788l;

    /* renamed from: l0, reason: collision with root package name */
    public final d[] f18789l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18790m;

    /* renamed from: m0, reason: collision with root package name */
    public final d[] f18791m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18792n;

    /* renamed from: n0, reason: collision with root package name */
    public int f18793n0;

    /* renamed from: o, reason: collision with root package name */
    public int f18794o;

    /* renamed from: o0, reason: collision with root package name */
    public int f18795o0;

    /* renamed from: p, reason: collision with root package name */
    public int f18796p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f18797p0;

    /* renamed from: q, reason: collision with root package name */
    public int f18798q;

    /* renamed from: r, reason: collision with root package name */
    public int f18799r;

    /* renamed from: s, reason: collision with root package name */
    public int f18800s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f18801t;

    /* renamed from: u, reason: collision with root package name */
    public int f18802u;

    /* renamed from: v, reason: collision with root package name */
    public int f18803v;

    /* renamed from: w, reason: collision with root package name */
    public float f18804w;

    /* renamed from: x, reason: collision with root package name */
    public int f18805x;

    /* renamed from: y, reason: collision with root package name */
    public int f18806y;

    /* renamed from: z, reason: collision with root package name */
    public float f18807z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f18766a = false;

    /* renamed from: d, reason: collision with root package name */
    public y.k f18772d = null;

    /* renamed from: e, reason: collision with root package name */
    public m f18774e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f18776f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f18778g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f18780h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f18782i = -1;

    public d() {
        new HashMap();
        this.f18786k = false;
        this.f18788l = false;
        this.f18790m = false;
        this.f18792n = false;
        this.f18794o = -1;
        this.f18796p = -1;
        this.f18798q = 0;
        this.f18799r = 0;
        this.f18800s = 0;
        this.f18801t = new int[2];
        this.f18802u = 0;
        this.f18803v = 0;
        this.f18804w = 1.0f;
        this.f18805x = 0;
        this.f18806y = 0;
        this.f18807z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        c cVar = new c(this, 2);
        this.I = cVar;
        c cVar2 = new c(this, 3);
        this.J = cVar2;
        c cVar3 = new c(this, 4);
        this.K = cVar3;
        c cVar4 = new c(this, 5);
        this.L = cVar4;
        c cVar5 = new c(this, 6);
        this.M = cVar5;
        c cVar6 = new c(this, 8);
        this.N = cVar6;
        c cVar7 = new c(this, 9);
        this.O = cVar7;
        c cVar8 = new c(this, 7);
        this.P = cVar8;
        this.Q = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.f18797p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f18767a0 = 0;
        this.f18773d0 = 0.5f;
        this.f18775e0 = 0.5f;
        this.f18779g0 = 0;
        this.f18781h0 = null;
        this.f18783i0 = 0;
        this.f18785j0 = 0;
        this.f18787k0 = new float[]{-1.0f, -1.0f};
        this.f18789l0 = new d[]{null, null};
        this.f18791m0 = new d[]{null, null};
        this.f18793n0 = -1;
        this.f18795o0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void H(int i10, int i11, String str, StringBuilder sb) {
        if (i10 == i11) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i10);
        sb.append(",\n");
    }

    public static void I(StringBuilder sb, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f10);
        sb.append(",\n");
    }

    public static void p(StringBuilder sb, String str, int i10, int i11, int i12, int i13, int i14, float f10) {
        sb.append(str);
        sb.append(" :  {\n");
        H(i10, 0, "      size", sb);
        H(i11, 0, "      min", sb);
        H(i12, Integer.MAX_VALUE, "      max", sb);
        H(i13, 0, "      matchMin", sb);
        H(i14, 0, "      matchDef", sb);
        I(sb, "      matchPercent", f10, 1.0f);
        sb.append("    },\n");
    }

    public static void q(StringBuilder sb, String str, c cVar) {
        if (cVar.f18762f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cVar.f18762f);
        sb.append("'");
        if (cVar.f18764h != Integer.MIN_VALUE || cVar.f18763g != 0) {
            sb.append(",");
            sb.append(cVar.f18763g);
            if (cVar.f18764h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.f18764h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final boolean A() {
        return this.f18778g && this.f18779g0 != 8;
    }

    public boolean B() {
        return this.f18786k || (this.I.f18759c && this.K.f18759c);
    }

    public boolean C() {
        return this.f18788l || (this.J.f18759c && this.L.f18759c);
    }

    public void D() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = 0.0f;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f18767a0 = 0;
        this.f18769b0 = 0;
        this.f18771c0 = 0;
        this.f18773d0 = 0.5f;
        this.f18775e0 = 0.5f;
        int[] iArr = this.f18797p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f18777f0 = null;
        this.f18779g0 = 0;
        this.f18783i0 = 0;
        this.f18785j0 = 0;
        float[] fArr = this.f18787k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f18794o = -1;
        this.f18796p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f18799r = 0;
        this.f18800s = 0;
        this.f18804w = 1.0f;
        this.f18807z = 1.0f;
        this.f18803v = Integer.MAX_VALUE;
        this.f18806y = Integer.MAX_VALUE;
        this.f18802u = 0;
        this.f18805x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f18776f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f18778g = true;
        int[] iArr3 = this.f18801t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f18780h = -1;
        this.f18782i = -1;
    }

    public final void E() {
        d dVar = this.T;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) arrayList.get(i10)).j();
        }
    }

    public final void F() {
        this.f18786k = false;
        this.f18788l = false;
        this.f18790m = false;
        this.f18792n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) arrayList.get(i10);
            cVar.f18759c = false;
            cVar.f18758b = 0;
        }
    }

    public void G(g2.h hVar) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void J(int i10) {
        this.f18767a0 = i10;
        this.E = i10 > 0;
    }

    public final void K(int i10, int i11) {
        if (this.f18786k) {
            return;
        }
        this.I.l(i10);
        this.K.l(i11);
        this.Y = i10;
        this.U = i11 - i10;
        this.f18786k = true;
    }

    public final void L(int i10, int i11) {
        if (this.f18788l) {
            return;
        }
        this.J.l(i10);
        this.L.l(i11);
        this.Z = i10;
        this.V = i11 - i10;
        if (this.E) {
            this.M.l(i10 + this.f18767a0);
        }
        this.f18788l = true;
    }

    public final void M(int i10) {
        this.V = i10;
        int i11 = this.f18771c0;
        if (i10 < i11) {
            this.V = i11;
        }
    }

    public final void N(int i10) {
        this.f18797p0[0] = i10;
    }

    public final void O(int i10) {
        this.f18797p0[1] = i10;
    }

    public final void P(int i10) {
        this.U = i10;
        int i11 = this.f18769b0;
        if (i10 < i11) {
            this.U = i11;
        }
    }

    public void Q(boolean z7, boolean z10) {
        int i10;
        int i11;
        y.k kVar = this.f18772d;
        boolean z11 = z7 & kVar.f19185g;
        m mVar = this.f18774e;
        boolean z12 = z10 & mVar.f19185g;
        int i12 = kVar.f19186h.f19152g;
        int i13 = mVar.f19186h.f19152g;
        int i14 = kVar.f19187i.f19152g;
        int i15 = mVar.f19187i.f19152g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z11) {
            this.Y = i12;
        }
        if (z12) {
            this.Z = i13;
        }
        if (this.f18779g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f18797p0;
        if (z11) {
            if (iArr[0] == 1 && i17 < (i11 = this.U)) {
                i17 = i11;
            }
            this.U = i17;
            int i19 = this.f18769b0;
            if (i17 < i19) {
                this.U = i19;
            }
        }
        if (z12) {
            if (iArr[1] == 1 && i18 < (i10 = this.V)) {
                i18 = i10;
            }
            this.V = i18;
            int i20 = this.f18771c0;
            if (i18 < i20) {
                this.V = i20;
            }
        }
    }

    public void R(v.d dVar, boolean z7) {
        int i10;
        int i11;
        m mVar;
        y.k kVar;
        c cVar = this.I;
        dVar.getClass();
        int iN = v.d.n(cVar);
        int iN2 = v.d.n(this.J);
        int iN3 = v.d.n(this.K);
        int iN4 = v.d.n(this.L);
        if (z7 && (kVar = this.f18772d) != null) {
            y.f fVar = kVar.f19186h;
            if (fVar.f19155j) {
                y.f fVar2 = kVar.f19187i;
                if (fVar2.f19155j) {
                    iN = fVar.f19152g;
                    iN3 = fVar2.f19152g;
                }
            }
        }
        if (z7 && (mVar = this.f18774e) != null) {
            y.f fVar3 = mVar.f19186h;
            if (fVar3.f19155j) {
                y.f fVar4 = mVar.f19187i;
                if (fVar4.f19155j) {
                    iN2 = fVar3.f19152g;
                    iN4 = fVar4.f19152g;
                }
            }
        }
        int i12 = iN4 - iN2;
        if (iN3 - iN < 0 || i12 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i13 = iN3 - iN;
        int i14 = iN4 - iN2;
        this.Y = iN;
        this.Z = iN2;
        if (this.f18779g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f18797p0;
        int i15 = iArr[0];
        if (i15 == 1 && i13 < (i11 = this.U)) {
            i13 = i11;
        }
        if (iArr[1] == 1 && i14 < (i10 = this.V)) {
            i14 = i10;
        }
        this.U = i13;
        this.V = i14;
        int i16 = this.f18771c0;
        if (i14 < i16) {
            this.V = i16;
        }
        int i17 = this.f18769b0;
        if (i13 < i17) {
            this.U = i17;
        }
        int i18 = this.f18803v;
        if (i18 > 0 && i15 == 3) {
            this.U = Math.min(this.U, i18);
        }
        int i19 = this.f18806y;
        if (i19 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i19);
        }
        int i20 = this.U;
        if (i13 != i20) {
            this.f18780h = i20;
        }
        int i21 = this.V;
        if (i14 != i21) {
            this.f18782i = i21;
        }
    }

    public final void b(e eVar, v.d dVar, HashSet hashSet, int i10, boolean z7) {
        if (z7) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(eVar, dVar, this);
            hashSet.remove(this);
            c(dVar, eVar.X(64));
        }
        if (i10 == 0) {
            HashSet hashSet2 = this.I.f18757a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f18760d.b(eVar, dVar, hashSet, i10, true);
                }
            }
            HashSet hashSet3 = this.K.f18757a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).f18760d.b(eVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f18757a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).f18760d.b(eVar, dVar, hashSet, i10, true);
            }
        }
        HashSet hashSet5 = this.L.f18757a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).f18760d.b(eVar, dVar, hashSet, i10, true);
            }
        }
        HashSet hashSet6 = this.M.f18757a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).f18760d.b(eVar, dVar, hashSet, i10, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x071d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(v.d dVar, boolean z7) {
        boolean z10;
        boolean z11;
        d dVar2;
        d dVar3;
        boolean[] zArr;
        c cVar;
        boolean z12;
        boolean z13;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z14;
        int i14;
        char c10;
        boolean z15;
        c cVar2;
        int i15;
        int[] iArr2;
        c cVar3;
        c cVar4;
        v.i iVar;
        v.i iVar2;
        v.i iVar3;
        v.i iVar4;
        v.i iVar5;
        int[] iArr3;
        int[] iArr4;
        c cVar5;
        int i16;
        int i17;
        char c11;
        d dVar4;
        v.d dVar5;
        v.i iVar6;
        v.i iVar7;
        v.i iVar8;
        boolean z16;
        v.i iVar9;
        v.i iVar10;
        v.d dVar6;
        boolean z17;
        int iE;
        c cVar6;
        boolean z18;
        y.k kVar;
        int i18;
        int i19;
        boolean zY;
        boolean z19;
        boolean z20;
        y.k kVar2;
        m mVar;
        boolean z21;
        int i20;
        boolean z22;
        c cVar7 = this.I;
        v.i iVarK = dVar.k(cVar7);
        c cVar8 = this.K;
        v.i iVarK2 = dVar.k(cVar8);
        c cVar9 = this.J;
        v.i iVarK3 = dVar.k(cVar9);
        c cVar10 = this.L;
        v.i iVarK4 = dVar.k(cVar10);
        c cVar11 = this.M;
        v.i iVarK5 = dVar.k(cVar11);
        d dVar7 = this.T;
        if (dVar7 != null) {
            int[] iArr5 = dVar7.f18797p0;
            if (iArr5[0] == 2) {
                i20 = 1;
                z22 = true;
            } else {
                i20 = 1;
                z22 = false;
            }
            boolean z23 = iArr5[i20] == 2;
            int i21 = this.f18798q;
            if (i21 == i20) {
                z11 = z22;
                z10 = false;
            } else if (i21 != 2) {
                if (i21 != 3) {
                    z10 = z23;
                    z11 = z22;
                }
                z10 = false;
                z11 = false;
            } else {
                z10 = z23;
                z11 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        int i22 = this.f18779g0;
        boolean[] zArr2 = this.S;
        if (i22 == 8) {
            ArrayList arrayList = this.R;
            int size = arrayList.size();
            int i23 = 0;
            while (true) {
                if (i23 < size) {
                    ArrayList arrayList2 = arrayList;
                    HashSet hashSet = ((c) arrayList.get(i23)).f18757a;
                    if (hashSet != null && hashSet.size() > 0) {
                        break;
                    }
                    i23++;
                    arrayList = arrayList2;
                } else if (!zArr2[0] && !zArr2[1]) {
                    return;
                }
            }
        }
        boolean z24 = this.f18786k;
        if (z24 || this.f18788l) {
            if (z24) {
                dVar.d(iVarK, this.Y);
                dVar.d(iVarK2, this.Y + this.U);
                if (z11 && (dVar3 = this.T) != null) {
                    e eVar = (e) dVar3;
                    WeakReference weakReference = eVar.H0;
                    if (weakReference == null || weakReference.get() == null || cVar7.d() > ((c) eVar.H0.get()).d()) {
                        eVar.H0 = new WeakReference(cVar7);
                    }
                    WeakReference weakReference2 = eVar.J0;
                    if (weakReference2 == null || weakReference2.get() == null || cVar8.d() > ((c) eVar.J0.get()).d()) {
                        eVar.J0 = new WeakReference(cVar8);
                    }
                }
            }
            if (this.f18788l) {
                dVar.d(iVarK3, this.Z);
                dVar.d(iVarK4, this.Z + this.V);
                HashSet hashSet2 = cVar11.f18757a;
                if (hashSet2 != null && hashSet2.size() > 0) {
                    dVar.d(iVarK5, this.Z + this.f18767a0);
                }
                if (z10 && (dVar2 = this.T) != null) {
                    e eVar2 = (e) dVar2;
                    WeakReference weakReference3 = eVar2.G0;
                    if (weakReference3 == null || weakReference3.get() == null || cVar9.d() > ((c) eVar2.G0.get()).d()) {
                        eVar2.G0 = new WeakReference(cVar9);
                    }
                    WeakReference weakReference4 = eVar2.I0;
                    if (weakReference4 == null || weakReference4.get() == null || cVar10.d() > ((c) eVar2.I0.get()).d()) {
                        eVar2.I0 = new WeakReference(cVar10);
                    }
                }
            }
            if (this.f18786k && this.f18788l) {
                this.f18786k = false;
                this.f18788l = false;
                return;
            }
        }
        boolean[] zArr3 = this.f18776f;
        if (!z7 || (kVar2 = this.f18772d) == null || (mVar = this.f18774e) == null) {
            zArr = zArr2;
            cVar = cVar11;
        } else {
            zArr = zArr2;
            y.f fVar = kVar2.f19186h;
            cVar = cVar11;
            if (fVar.f19155j && kVar2.f19187i.f19155j && mVar.f19186h.f19155j && mVar.f19187i.f19155j) {
                dVar.d(iVarK, fVar.f19152g);
                dVar.d(iVarK2, this.f18772d.f19187i.f19152g);
                dVar.d(iVarK3, this.f18774e.f19186h.f19152g);
                dVar.d(iVarK4, this.f18774e.f19187i.f19152g);
                dVar.d(iVarK5, this.f18774e.f19163k.f19152g);
                if (this.T == null) {
                    z21 = false;
                } else {
                    if (z11 && zArr3[0] && !y()) {
                        dVar.f(dVar.k(this.T.K), iVarK2, 0, 8);
                    }
                    if (z10 && zArr3[1] && !z()) {
                        z21 = false;
                        dVar.f(dVar.k(this.T.L), iVarK4, 0, 8);
                    }
                }
                this.f18786k = z21;
                this.f18788l = z21;
                return;
            }
        }
        if (this.T != null) {
            if (x(0)) {
                ((e) this.T).T(0, this);
                zY = true;
            } else {
                zY = y();
            }
            if (x(1)) {
                ((e) this.T).T(1, this);
                z19 = true;
            } else {
                z19 = z();
            }
            if (!zY && z11 && this.f18779g0 != 8 && cVar7.f18762f == null && cVar8.f18762f == null) {
                z20 = zY;
                dVar.f(dVar.k(this.T.K), iVarK2, 0, 1);
            } else {
                z20 = zY;
            }
            if (!z19 && z10 && this.f18779g0 != 8 && cVar9.f18762f == null && cVar10.f18762f == null && cVar == null) {
                dVar.f(dVar.k(this.T.L), iVarK4, 0, 1);
            }
            z12 = z19;
            z13 = z20;
        } else {
            z12 = false;
            z13 = false;
        }
        int i24 = this.U;
        int i25 = this.f18769b0;
        if (i24 >= i25) {
            i25 = i24;
        }
        int i26 = this.V;
        int i27 = this.f18771c0;
        if (i26 >= i27) {
            i27 = i26;
        }
        int[] iArr6 = this.f18797p0;
        int i28 = i25;
        int i29 = iArr6[0];
        int i30 = i27;
        boolean z25 = i29 != 3;
        int i31 = iArr6[1];
        boolean z26 = i31 != 3;
        int i32 = this.X;
        this.A = i32;
        float f10 = this.W;
        this.B = f10;
        int i33 = this.f18799r;
        int i34 = this.f18800s;
        if (f10 > 0.0f) {
            iArr = iArr6;
            if (this.f18779g0 != 8) {
                if (i29 == 3 && i33 == 0) {
                    i33 = 3;
                }
                if (i31 == 3 && i34 == 0) {
                    i34 = 3;
                }
                if (i29 == 3 && i31 == 3 && i33 == 3 && i34 == 3) {
                    if (i32 == -1) {
                        if (z25 && !z26) {
                            this.A = 0;
                        } else if (!z25 && z26) {
                            this.A = 1;
                            if (i32 == -1) {
                                this.B = 1.0f / f10;
                            }
                        }
                    }
                    if (this.A != 0 || (cVar9.h() && cVar10.h())) {
                        i19 = (this.A == 1 && !(cVar7.h() && cVar8.h())) ? 0 : 1;
                        if (this.A == -1 && (!cVar9.h() || !cVar10.h() || !cVar7.h() || !cVar8.h())) {
                            if (!cVar9.h() && cVar10.h()) {
                                this.A = 0;
                            } else if (cVar7.h() && cVar8.h()) {
                                this.B = 1.0f / this.B;
                                this.A = 1;
                            }
                        }
                        if (this.A == -1) {
                            int i35 = this.f18802u;
                            if (i35 > 0 && this.f18805x == 0) {
                                this.A = 0;
                            } else if (i35 == 0 && this.f18805x > 0) {
                                this.B = 1.0f / this.B;
                                this.A = 1;
                            }
                        }
                    }
                    this.A = i19;
                    if (this.A == -1) {
                        if (!cVar9.h()) {
                            if (cVar7.h()) {
                                this.B = 1.0f / this.B;
                                this.A = 1;
                            }
                        }
                    }
                    if (this.A == -1) {
                    }
                } else if (i29 == 3 && i33 == 3) {
                    this.A = 0;
                    i12 = (int) (f10 * i26);
                    if (i31 != 3) {
                        i11 = i34;
                        i13 = i30;
                        z14 = false;
                        i10 = 4;
                    } else {
                        i10 = i33;
                        i11 = i34;
                        i13 = i30;
                        z14 = true;
                    }
                } else {
                    if (i31 == 3 && i34 == 3) {
                        this.A = 1;
                        if (i32 == -1) {
                            this.B = 1.0f / f10;
                        }
                        i13 = (int) (this.B * i24);
                        i10 = i33;
                        if (i29 != 3) {
                            i12 = i28;
                            z14 = false;
                            i11 = 4;
                        } else {
                            i11 = i34;
                            i12 = i28;
                        }
                    }
                    z14 = true;
                }
                i10 = i33;
                i11 = i34;
                i12 = i28;
                i13 = i30;
                z14 = true;
            }
            int[] iArr7 = this.f18801t;
            iArr7[0] = i10;
            iArr7[1] = i11;
            if (!z14) {
                int i36 = this.A;
                i14 = -1;
                boolean z27 = i36 == 0 || i36 == -1;
                if (z14 && ((i18 = this.A) == 1 || i18 == i14)) {
                    c10 = 0;
                    z15 = true;
                } else {
                    c10 = 0;
                    z15 = false;
                }
                boolean z28 = iArr[c10] == 2 && (this instanceof e);
                int i37 = z28 ? 0 : i12;
                cVar2 = this.P;
                boolean z29 = !cVar2.h();
                boolean z30 = zArr[0];
                boolean z31 = zArr[1];
                i15 = this.f18794o;
                iArr2 = this.C;
                if (i15 == 2 || this.f18786k) {
                    cVar3 = cVar10;
                    cVar4 = cVar;
                    iVar = iVarK3;
                    iVar2 = iVarK5;
                    iVar3 = iVarK4;
                    iVar4 = iVarK2;
                    iVar5 = iVarK;
                    iArr3 = iArr;
                    iArr4 = iArr2;
                    cVar5 = cVar2;
                } else {
                    if (z7 && (kVar = this.f18772d) != null) {
                        y.f fVar2 = kVar.f19186h;
                        if (fVar2.f19155j && kVar.f19187i.f19155j) {
                            if (z7) {
                                dVar.d(iVarK, fVar2.f19152g);
                                dVar.d(iVarK2, this.f18772d.f19187i.f19152g);
                                if (this.T != null && z11 && zArr3[0] && !y()) {
                                    dVar.f(dVar.k(this.T.K), iVarK2, 0, 8);
                                }
                                iVar4 = iVarK2;
                                iVar5 = iVarK;
                                cVar3 = cVar10;
                                iArr4 = iArr2;
                                cVar4 = cVar;
                                iVar = iVarK3;
                                iVar2 = iVarK5;
                                iVar3 = iVarK4;
                                iArr3 = iArr;
                                cVar5 = cVar2;
                            } else {
                                cVar3 = cVar10;
                                cVar4 = cVar;
                                iVar = iVarK3;
                                iVar2 = iVarK5;
                                iVar3 = iVarK4;
                                iVar4 = iVarK2;
                                iVar5 = iVarK;
                                iArr3 = iArr;
                                iArr4 = iArr2;
                                cVar5 = cVar2;
                            }
                        }
                    }
                    d dVar8 = this.T;
                    v.i iVarK6 = dVar8 != null ? dVar.k(dVar8.K) : null;
                    d dVar9 = this.T;
                    v.i iVarK7 = dVar9 != null ? dVar.k(dVar9.I) : null;
                    boolean z32 = zArr3[0];
                    int i38 = iArr[0];
                    c cVar12 = this.I;
                    c cVar13 = this.K;
                    int i39 = this.Y;
                    int i40 = this.f18769b0;
                    int i41 = iArr2[0];
                    float f11 = this.f18773d0;
                    boolean z33 = iArr[1] == 3;
                    iVar2 = iVarK5;
                    cVar4 = cVar;
                    iVar3 = iVarK4;
                    cVar3 = cVar10;
                    iArr4 = iArr2;
                    iVar = iVarK3;
                    iArr3 = iArr;
                    cVar5 = cVar2;
                    iVar4 = iVarK2;
                    iVar5 = iVarK;
                    e(dVar, true, z11, z10, z32, iVarK7, iVarK6, i38, z28, cVar12, cVar13, i39, i37, i40, i41, f11, z27, z33, z13, z12, z30, i10, i11, this.f18802u, this.f18803v, this.f18804w, z29);
                }
                if (z7) {
                    dVar4 = this;
                    m mVar2 = dVar4.f18774e;
                    if (mVar2 != null) {
                        y.f fVar3 = mVar2.f19186h;
                        if (fVar3.f19155j && mVar2.f19187i.f19155j) {
                            dVar5 = dVar;
                            iVar8 = iVar;
                            dVar5.d(iVar8, fVar3.f19152g);
                            iVar7 = iVar3;
                            dVar5.d(iVar7, dVar4.f18774e.f19187i.f19152g);
                            iVar6 = iVar2;
                            dVar5.d(iVar6, dVar4.f18774e.f19163k.f19152g);
                            d dVar10 = dVar4.T;
                            if (dVar10 == null || z12 || !z10) {
                                i16 = 8;
                                i17 = 0;
                                c11 = 1;
                            } else {
                                c11 = 1;
                                if (zArr3[1]) {
                                    i16 = 8;
                                    i17 = 0;
                                    dVar5.f(dVar5.k(dVar10.L), iVar7, 0, 8);
                                } else {
                                    i16 = 8;
                                    i17 = 0;
                                }
                            }
                            z16 = false;
                            if (dVar4.f18796p != 2 && z16 && !dVar4.f18788l) {
                                z17 = iArr3[c11] != 2 && (dVar4 instanceof e);
                                if (z17) {
                                    i13 = 0;
                                }
                                d dVar11 = dVar4.T;
                                v.i iVarK8 = dVar11 == null ? dVar5.k(dVar11.L) : null;
                                d dVar12 = dVar4.T;
                                v.i iVarK9 = dVar12 == null ? dVar5.k(dVar12.J) : null;
                                iE = dVar4.f18767a0;
                                if (iE <= 0 || dVar4.f18779g0 == i16) {
                                    cVar6 = cVar4;
                                    if (cVar6.f18762f == null) {
                                        dVar5.e(iVar6, iVar8, iE, i16);
                                        dVar5.e(iVar6, dVar5.k(cVar6.f18762f), cVar6.e(), i16);
                                        if (z10) {
                                            dVar5.f(iVarK8, dVar5.k(cVar3), i17, 5);
                                        }
                                        z18 = false;
                                        iVar9 = iVar7;
                                        iVar10 = iVar8;
                                        e(dVar, false, z10, z11, zArr3[c11], iVarK9, iVarK8, iArr3[c11], z17, dVar4.J, dVar4.L, dVar4.Z, i13, dVar4.f18771c0, iArr4[c11], dVar4.f18775e0, z15, iArr3[i17] == 3, z12, z13, z31, i11, i10, dVar4.f18805x, dVar4.f18806y, dVar4.f18807z, z18);
                                    } else {
                                        if (dVar4.f18779g0 == i16) {
                                            iE = cVar6.e();
                                        }
                                        dVar5.e(iVar6, iVar8, iE, i16);
                                        z18 = z29;
                                        iVar9 = iVar7;
                                        iVar10 = iVar8;
                                        e(dVar, false, z10, z11, zArr3[c11], iVarK9, iVarK8, iArr3[c11], z17, dVar4.J, dVar4.L, dVar4.Z, i13, dVar4.f18771c0, iArr4[c11], dVar4.f18775e0, z15, iArr3[i17] == 3, z12, z13, z31, i11, i10, dVar4.f18805x, dVar4.f18806y, dVar4.f18807z, z18);
                                    }
                                } else {
                                    z18 = z29;
                                    iVar9 = iVar7;
                                    iVar10 = iVar8;
                                    e(dVar, false, z10, z11, zArr3[c11], iVarK9, iVarK8, iArr3[c11], z17, dVar4.J, dVar4.L, dVar4.Z, i13, dVar4.f18771c0, iArr4[c11], dVar4.f18775e0, z15, iArr3[i17] == 3, z12, z13, z31, i11, i10, dVar4.f18805x, dVar4.f18806y, dVar4.f18807z, z18);
                                }
                            } else {
                                iVar9 = iVar7;
                                iVar10 = iVar8;
                            }
                            if (z14) {
                                dVar6 = dVar;
                            } else if (this.A == 1) {
                                float f12 = this.B;
                                v.c cVarL = dVar.l();
                                cVarL.f18324d.c(iVar9, -1.0f);
                                cVarL.f18324d.c(iVar10, 1.0f);
                                cVarL.f18324d.c(iVar4, f12);
                                cVarL.f18324d.c(iVar5, -f12);
                                dVar6 = dVar;
                                dVar6.c(cVarL);
                            } else {
                                dVar6 = dVar;
                                float f13 = this.B;
                                v.c cVarL2 = dVar.l();
                                cVarL2.f18324d.c(iVar4, -1.0f);
                                cVarL2.f18324d.c(iVar5, 1.0f);
                                cVarL2.f18324d.c(iVar9, f13);
                                cVarL2.f18324d.c(iVar10, -f13);
                                dVar6.c(cVarL2);
                            }
                            if (cVar5.h()) {
                                c cVar14 = cVar5;
                                d dVar13 = cVar14.f18762f.f18760d;
                                float radians = (float) Math.toRadians(this.D + 90.0f);
                                int iE2 = cVar14.e();
                                v.i iVarK10 = dVar6.k(j(2));
                                v.i iVarK11 = dVar6.k(j(3));
                                v.i iVarK12 = dVar6.k(j(4));
                                v.i iVarK13 = dVar6.k(j(5));
                                v.i iVarK14 = dVar6.k(dVar13.j(2));
                                v.i iVarK15 = dVar6.k(dVar13.j(3));
                                v.i iVarK16 = dVar6.k(dVar13.j(4));
                                v.i iVarK17 = dVar6.k(dVar13.j(5));
                                v.c cVarL3 = dVar.l();
                                double d10 = radians;
                                double d11 = iE2;
                                float fSin = (float) (Math.sin(d10) * d11);
                                cVarL3.f18324d.c(iVarK15, 0.5f);
                                cVarL3.f18324d.c(iVarK17, 0.5f);
                                cVarL3.f18324d.c(iVarK11, -0.5f);
                                cVarL3.f18324d.c(iVarK13, -0.5f);
                                cVarL3.f18322b = -fSin;
                                dVar6.c(cVarL3);
                                v.c cVarL4 = dVar.l();
                                float fCos = (float) (Math.cos(d10) * d11);
                                cVarL4.f18324d.c(iVarK14, 0.5f);
                                cVarL4.f18324d.c(iVarK16, 0.5f);
                                cVarL4.f18324d.c(iVarK10, -0.5f);
                                cVarL4.f18324d.c(iVarK12, -0.5f);
                                cVarL4.f18322b = -fCos;
                                dVar6.c(cVarL4);
                            }
                            this.f18786k = false;
                            this.f18788l = false;
                        }
                    }
                    dVar5 = dVar;
                    iVar6 = iVar2;
                    iVar7 = iVar3;
                    iVar8 = iVar;
                    i16 = 8;
                    i17 = 0;
                    c11 = 1;
                } else {
                    i16 = 8;
                    i17 = 0;
                    c11 = 1;
                    dVar4 = this;
                    dVar5 = dVar;
                    iVar6 = iVar2;
                    iVar7 = iVar3;
                    iVar8 = iVar;
                }
                z16 = true;
                if (dVar4.f18796p != 2) {
                    if (iArr3[c11] != 2) {
                        if (z17) {
                        }
                        d dVar112 = dVar4.T;
                        if (dVar112 == null) {
                        }
                        d dVar122 = dVar4.T;
                        if (dVar122 == null) {
                        }
                        iE = dVar4.f18767a0;
                        if (iE <= 0) {
                            cVar6 = cVar4;
                            if (cVar6.f18762f == null) {
                            }
                        }
                    }
                }
                if (z14) {
                }
                if (cVar5.h()) {
                }
                this.f18786k = false;
                this.f18788l = false;
            }
            i14 = -1;
            if (z14) {
                c10 = 0;
                z15 = false;
            }
            if (iArr[c10] == 2) {
            }
            if (z28) {
            }
            cVar2 = this.P;
            boolean z292 = !cVar2.h();
            boolean z302 = zArr[0];
            boolean z312 = zArr[1];
            i15 = this.f18794o;
            iArr2 = this.C;
            if (i15 == 2) {
                cVar3 = cVar10;
                cVar4 = cVar;
                iVar = iVarK3;
                iVar2 = iVarK5;
                iVar3 = iVarK4;
                iVar4 = iVarK2;
                iVar5 = iVarK;
                iArr3 = iArr;
                iArr4 = iArr2;
                cVar5 = cVar2;
            }
            if (z7) {
            }
            z16 = true;
            if (dVar4.f18796p != 2) {
            }
            if (z14) {
            }
            if (cVar5.h()) {
            }
            this.f18786k = false;
            this.f18788l = false;
        }
        iArr = iArr6;
        i10 = i33;
        i11 = i34;
        i12 = i28;
        i13 = i30;
        z14 = false;
        int[] iArr72 = this.f18801t;
        iArr72[0] = i10;
        iArr72[1] = i11;
        if (!z14) {
        }
        if (z14) {
        }
        if (iArr[c10] == 2) {
        }
        if (z28) {
        }
        cVar2 = this.P;
        boolean z2922 = !cVar2.h();
        boolean z3022 = zArr[0];
        boolean z3122 = zArr[1];
        i15 = this.f18794o;
        iArr2 = this.C;
        if (i15 == 2) {
        }
        if (z7) {
        }
        z16 = true;
        if (dVar4.f18796p != 2) {
        }
        if (z14) {
        }
        if (cVar5.h()) {
        }
        this.f18786k = false;
        this.f18788l = false;
    }

    public boolean d() {
        return this.f18779g0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x035f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0481 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:354:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(v.d dVar, boolean z7, boolean z10, boolean z11, boolean z12, v.i iVar, v.i iVar2, int i10, boolean z13, c cVar, c cVar2, int i11, int i12, int i13, int i14, float f10, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i15, int i16, int i17, int i18, float f11, boolean z19) {
        int iMin;
        boolean z20;
        int i19;
        int i20;
        int i21;
        boolean z21;
        v.i iVarK;
        v.i iVarK2;
        v.i iVar3;
        v.i iVar4;
        v.i iVar5;
        v.i iVar6;
        boolean z22;
        int i22;
        char c10;
        int i23;
        c cVar3;
        v.i iVar7;
        int i24;
        v.i iVar8;
        int i25;
        int i26;
        int i27;
        boolean z23;
        boolean z24;
        v.i iVar9;
        int iE;
        boolean z25;
        boolean z26;
        boolean z27;
        c cVar4;
        d dVar2;
        v.i iVar10;
        v.i iVar11;
        boolean z28;
        int i28;
        d dVar3;
        d dVar4;
        v.i iVar12;
        v.i iVar13;
        boolean z29;
        v.i iVar14;
        v.i iVar15;
        d dVar5;
        int iMax;
        int iMin2;
        HashSet hashSet;
        int i29;
        boolean z30;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z31;
        boolean z32;
        int i34;
        v.i iVar16;
        int iE2;
        int i35 = i17;
        int i36 = i18;
        v.i iVarK3 = dVar.k(cVar);
        v.i iVarK4 = dVar.k(cVar2);
        v.i iVarK5 = dVar.k(cVar.f18762f);
        v.i iVarK6 = dVar.k(cVar2.f18762f);
        boolean zH = cVar.h();
        boolean zH2 = cVar2.h();
        boolean zH3 = this.P.h();
        int i37 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i37++;
        }
        int i38 = i37;
        int i39 = z14 ? 3 : i15;
        if (i10 == 0) {
            throw null;
        }
        int i40 = i10 - 1;
        boolean z33 = (i40 == 0 || i40 == 1 || i40 != 2 || i39 == 4) ? false : true;
        int i41 = this.f18780h;
        boolean z34 = z33;
        if (i41 != -1 && z7) {
            this.f18780h = -1;
            i12 = i41;
            z34 = false;
        }
        int i42 = this.f18782i;
        if (i42 == -1 || z7) {
            i42 = i12;
        } else {
            this.f18782i = -1;
            z34 = false;
        }
        int i43 = i42;
        if (this.f18779g0 == 8) {
            iMin = 0;
            z34 = false;
        } else {
            iMin = i43;
        }
        if (z19) {
            if (!zH && !zH2 && !zH3) {
                dVar.d(iVarK3, i11);
            } else if (zH && !zH2) {
                z20 = zH3;
                i19 = 8;
                dVar.e(iVarK3, iVarK5, cVar.e(), 8);
            }
            z20 = zH3;
            i19 = 8;
        } else {
            z20 = zH3;
            i19 = 8;
        }
        if (z34) {
            if (i38 == 2 || z14 || !(i39 == 1 || i39 == 0)) {
                if (i35 == -2) {
                    i35 = iMin;
                }
                if (i36 == -2) {
                    i36 = iMin;
                }
                if (iMin > 0 && i39 != 1) {
                    iMin = 0;
                }
                if (i35 > 0) {
                    dVar.f(iVarK4, iVarK3, i35, 8);
                    iMin = Math.max(iMin, i35);
                }
                if (i36 > 0) {
                    if (!z10 || i39 != 1) {
                        dVar.g(iVarK4, iVarK3, i36, 8);
                    }
                    iMin = Math.min(iMin, i36);
                }
                if (i39 == 1) {
                    if (z10) {
                        dVar.e(iVarK4, iVarK3, iMin, 8);
                    } else {
                        dVar.e(iVarK4, iVarK3, iMin, 5);
                        dVar.g(iVarK4, iVarK3, iMin, 8);
                    }
                } else if (i39 == 2) {
                    int i44 = cVar.f18761e;
                    if (i44 == 3 || i44 == 5) {
                        iVarK = dVar.k(this.T.j(3));
                        iVarK2 = dVar.k(this.T.j(5));
                    } else {
                        iVarK = dVar.k(this.T.j(2));
                        iVarK2 = dVar.k(this.T.j(4));
                    }
                    v.c cVarL = dVar.l();
                    i20 = i38;
                    cVarL.f18324d.c(iVarK4, -1.0f);
                    cVarL.f18324d.c(iVarK3, 1.0f);
                    cVarL.f18324d.c(iVarK2, f11);
                    cVarL.f18324d.c(iVarK, -f11);
                    dVar.c(cVarL);
                    if (z10) {
                        z34 = false;
                    }
                    z21 = z12;
                    i21 = i35;
                } else {
                    i20 = i38;
                    i21 = i35;
                    z21 = true;
                }
            } else {
                int iMax2 = Math.max(i35, iMin);
                if (i36 > 0) {
                    iMax2 = Math.min(i36, iMax2);
                }
                dVar.e(iVarK4, iVarK3, iMax2, 8);
                z21 = z12;
                i20 = i38;
                i21 = i35;
                z34 = false;
            }
            if (z19) {
                iVar3 = iVar;
                iVar4 = iVar2;
                iVar5 = iVarK4;
                iVar6 = iVarK3;
                z22 = z21;
                i22 = i20;
                c10 = 1;
                i23 = 2;
            } else if (z16) {
                iVar3 = iVar;
                iVar4 = iVar2;
                iVar5 = iVarK4;
                iVar6 = iVarK3;
                z22 = z21;
                i22 = i20;
                i23 = 2;
                c10 = 1;
            } else {
                if (!zH && !zH2 && !z20) {
                    cVar4 = cVar2;
                    iVar15 = iVarK4;
                    z28 = z21;
                    iVar14 = iVarK6;
                } else if (!zH || zH2) {
                    if (zH || !zH2) {
                        iVar7 = iVarK6;
                        if (zH && zH2) {
                            d dVar6 = cVar.f18762f.f18760d;
                            d dVar7 = cVar2.f18762f.f18760d;
                            d dVar8 = this.T;
                            int i45 = 6;
                            if (z34) {
                                if (i39 == 0) {
                                    if (i36 != 0 || i21 != 0) {
                                        i32 = 5;
                                        i33 = 5;
                                        z31 = true;
                                        z32 = false;
                                        z23 = true;
                                    } else if (iVarK5.f18358n && iVar7.f18358n) {
                                        dVar.e(iVarK3, iVarK5, cVar.e(), 8);
                                        dVar.e(iVarK4, iVar7, -cVar2.e(), 8);
                                        return;
                                    } else {
                                        i32 = 8;
                                        i33 = 8;
                                        z31 = false;
                                        z32 = true;
                                        z23 = false;
                                    }
                                    if ((dVar6 instanceof a) || (dVar7 instanceof a)) {
                                        i25 = i32;
                                        i24 = i39;
                                        z24 = z31;
                                        z25 = z32;
                                        i26 = 6;
                                        i27 = 4;
                                    } else {
                                        i25 = i32;
                                        z24 = z31;
                                        z25 = z32;
                                        i26 = 6;
                                        i27 = i33;
                                        i24 = i39;
                                    }
                                } else {
                                    if (i39 == 2) {
                                        if ((dVar6 instanceof a) || (dVar7 instanceof a)) {
                                            i24 = i39;
                                            i25 = 5;
                                        } else {
                                            i24 = i39;
                                            i25 = 5;
                                            i26 = 6;
                                            i27 = 5;
                                            z23 = true;
                                            z24 = true;
                                            z25 = false;
                                        }
                                    } else if (i39 == 1) {
                                        i24 = i39;
                                        i25 = 8;
                                    } else if (i39 == 3) {
                                        i24 = i39;
                                        if (this.A == -1) {
                                            iVar8 = iVar2;
                                            i25 = 8;
                                            i26 = z17 ? z10 ? 5 : 4 : 8;
                                        } else if (z14) {
                                            if (i16 == 2 || i16 == 1) {
                                                i25 = 5;
                                                i31 = 4;
                                            } else {
                                                i25 = 8;
                                                i31 = 5;
                                            }
                                            i27 = i31;
                                            i26 = 6;
                                            z23 = true;
                                            z24 = true;
                                            z25 = true;
                                        } else if (i36 > 0) {
                                            iVar8 = iVar2;
                                            i25 = 5;
                                            i26 = 6;
                                        } else {
                                            if (i36 != 0 || i21 != 0) {
                                                iVar8 = iVar2;
                                                i25 = 5;
                                            } else {
                                                if (!z17) {
                                                    iVar8 = iVar2;
                                                    i25 = 5;
                                                    i26 = 6;
                                                    i27 = 8;
                                                    z23 = true;
                                                    z24 = true;
                                                    z25 = true;
                                                    if (z23 && iVarK5 == iVar7 && dVar6 != dVar8) {
                                                        z27 = false;
                                                        z26 = false;
                                                    } else {
                                                        z26 = z23;
                                                        z27 = true;
                                                    }
                                                    if (z24) {
                                                        cVar4 = cVar2;
                                                        dVar2 = dVar6;
                                                        iVar10 = iVar7;
                                                        iVar11 = iVarK4;
                                                        z28 = z21;
                                                        i28 = i21;
                                                        dVar3 = dVar8;
                                                        dVar4 = dVar7;
                                                        iVar12 = iVarK5;
                                                        iVar13 = iVarK3;
                                                        z29 = z10;
                                                    } else {
                                                        if (z34 || z15 || z17 || iVarK5 != iVar || iVar7 != iVar8) {
                                                            i29 = i26;
                                                            z30 = z27;
                                                            z29 = z10;
                                                            i30 = i25;
                                                        } else {
                                                            z29 = false;
                                                            i30 = 8;
                                                            i29 = 8;
                                                            z30 = false;
                                                        }
                                                        cVar4 = cVar2;
                                                        dVar2 = dVar6;
                                                        z28 = z21;
                                                        dVar4 = dVar7;
                                                        i28 = i21;
                                                        iVar10 = iVar7;
                                                        iVar12 = iVarK5;
                                                        dVar3 = dVar8;
                                                        iVar11 = iVarK4;
                                                        iVar13 = iVarK3;
                                                        dVar.b(iVarK3, iVarK5, cVar.e(), f10, iVar7, iVarK4, cVar2.e(), i29);
                                                        i25 = i30;
                                                        z27 = z30;
                                                    }
                                                    if (this.f18779g0 == 8 || ((hashSet = cVar4.f18757a) != null && hashSet.size() > 0)) {
                                                        iVar14 = iVar10;
                                                        if (z26) {
                                                            iVar15 = iVar11;
                                                        } else {
                                                            if (z29 && iVar12 != iVar14 && !z34 && ((dVar2 instanceof a) || (dVar4 instanceof a))) {
                                                                i25 = 6;
                                                            }
                                                            dVar.f(iVar13, iVar12, cVar.e(), i25);
                                                            iVar15 = iVar11;
                                                            dVar.g(iVar15, iVar14, -cVar2.e(), i25);
                                                        }
                                                        if (!z29 && z18 && !(dVar2 instanceof a) && !(dVar4 instanceof a)) {
                                                            dVar5 = dVar3;
                                                            if (dVar4 != dVar5) {
                                                                i25 = 6;
                                                                iMax = 6;
                                                                z27 = true;
                                                            }
                                                            if (z27) {
                                                                if (z25 && (!z17 || z11)) {
                                                                    if (dVar2 != dVar5 && dVar4 != dVar5) {
                                                                        i45 = iMax;
                                                                    }
                                                                    if ((dVar2 instanceof h) || (dVar4 instanceof h)) {
                                                                        i45 = 5;
                                                                    }
                                                                    if ((dVar2 instanceof a) || (dVar4 instanceof a)) {
                                                                        i45 = 5;
                                                                    }
                                                                    iMax = Math.max(z17 ? 5 : i45, iMax);
                                                                }
                                                                if (z29) {
                                                                    iMin2 = (z14 && !z17 && (dVar2 == dVar5 || dVar4 == dVar5)) ? 4 : Math.min(i25, iMax);
                                                                } else {
                                                                    iMin2 = iMax;
                                                                }
                                                                dVar.e(iVar13, iVar12, cVar.e(), iMin2);
                                                                dVar.e(iVar15, iVar14, -cVar2.e(), iMin2);
                                                            }
                                                            if (z29) {
                                                                v.i iVar17 = iVar12;
                                                                int iE3 = iVar == iVar17 ? cVar.e() : 0;
                                                                if (iVar17 != iVar) {
                                                                    dVar.f(iVar13, iVar, iE3, 5);
                                                                }
                                                            }
                                                            if (!z29 || !z34 || i13 != 0 || i28 != 0) {
                                                                i34 = 5;
                                                            } else if (z34 && i24 == 3) {
                                                                dVar.f(iVar15, iVar13, 0, 8);
                                                                i34 = 5;
                                                            } else {
                                                                dVar.f(iVar15, iVar13, 0, 5);
                                                                i34 = 5;
                                                            }
                                                            if (z29 || !z28) {
                                                                return;
                                                            }
                                                            if (cVar4.f18762f != null) {
                                                                iE2 = cVar2.e();
                                                                iVar16 = iVar2;
                                                            } else {
                                                                iVar16 = iVar2;
                                                                iE2 = 0;
                                                            }
                                                            if (iVar14 != iVar16) {
                                                                dVar.f(iVar16, iVar15, iE2, i34);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        dVar5 = dVar3;
                                                        iMax = i27;
                                                        if (z27) {
                                                        }
                                                        if (z29) {
                                                        }
                                                        if (!z29) {
                                                            i34 = 5;
                                                        }
                                                        if (z29) {
                                                            return;
                                                        } else {
                                                            return;
                                                        }
                                                    }
                                                    return;
                                                }
                                                i25 = (dVar6 == dVar8 || dVar7 == dVar8) ? 5 : 4;
                                                iVar8 = iVar2;
                                            }
                                            i26 = 6;
                                            i27 = 4;
                                            z23 = true;
                                            z24 = true;
                                            z25 = true;
                                            if (z23) {
                                                z26 = z23;
                                                z27 = true;
                                                if (z24) {
                                                }
                                                if (this.f18779g0 == 8) {
                                                }
                                                iVar14 = iVar10;
                                                if (z26) {
                                                }
                                                if (!z29) {
                                                    dVar5 = dVar3;
                                                    iMax = i27;
                                                    if (z27) {
                                                    }
                                                    if (z29) {
                                                    }
                                                    if (!z29) {
                                                    }
                                                }
                                            }
                                            if (z29) {
                                            }
                                        }
                                        i27 = 5;
                                        z23 = true;
                                        z24 = true;
                                        z25 = true;
                                        if (z23) {
                                        }
                                        if (z29) {
                                        }
                                    } else {
                                        i24 = i39;
                                        iVar8 = iVar2;
                                        i25 = 5;
                                        i26 = 6;
                                        i27 = 4;
                                        z23 = false;
                                        z24 = false;
                                    }
                                    i26 = 6;
                                    i27 = 4;
                                    z23 = true;
                                    z24 = true;
                                    z25 = false;
                                }
                                iVar8 = iVar2;
                                if (z23) {
                                }
                                if (z29) {
                                }
                            } else {
                                i24 = i39;
                                if (iVarK5.f18358n && iVar7.f18358n) {
                                    dVar.b(iVarK3, iVarK5, cVar.e(), f10, iVar7, iVarK4, cVar2.e(), 8);
                                    if (z10 && z21) {
                                        if (cVar2.f18762f != null) {
                                            iE = cVar2.e();
                                            iVar9 = iVar2;
                                        } else {
                                            iVar9 = iVar2;
                                            iE = 0;
                                        }
                                        if (iVar7 != iVar9) {
                                            dVar.f(iVar9, iVarK4, iE, 5);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                iVar8 = iVar2;
                                i25 = 5;
                                i26 = 6;
                                i27 = 4;
                                z23 = true;
                                z24 = true;
                            }
                            z25 = false;
                            if (z23) {
                            }
                            if (z29) {
                            }
                        }
                    } else {
                        iVar7 = iVarK6;
                        dVar.e(iVarK4, iVar7, -cVar2.e(), 8);
                        if (z10) {
                            dVar.f(iVarK3, iVar, 0, 5);
                        }
                    }
                    cVar4 = cVar2;
                    iVar14 = iVar7;
                    iVar15 = iVarK4;
                    z28 = z21;
                } else {
                    z29 = z10;
                    cVar4 = cVar2;
                    iVar15 = iVarK4;
                    z28 = z21;
                    i34 = (z10 && (cVar.f18762f.f18760d instanceof a)) ? 8 : 5;
                    iVar14 = iVarK6;
                    if (z29) {
                    }
                }
                z29 = z10;
                i34 = 5;
                if (z29) {
                }
            }
            if (i22 >= i23 && z10 && z22) {
                dVar.f(iVar6, iVar3, 0, 8);
                c cVar5 = this.M;
                boolean z35 = z7 || cVar5.f18762f == null;
                if (!z7 && (cVar3 = cVar5.f18762f) != null) {
                    d dVar9 = cVar3.f18760d;
                    if (dVar9.W == 0.0f) {
                        return;
                    }
                    int[] iArr = dVar9.f18797p0;
                    if (iArr[0] != 3 || iArr[c10] != 3) {
                        return;
                    }
                } else if (!z35) {
                    return;
                }
                dVar.f(iVar4, iVar5, 0, 8);
                return;
            }
            return;
        }
        if (z13) {
            dVar.e(iVarK4, iVarK3, 0, 3);
            if (i13 > 0) {
                dVar.f(iVarK4, iVarK3, i13, i19);
            }
            if (i14 < Integer.MAX_VALUE) {
                dVar.g(iVarK4, iVarK3, i14, i19);
            }
        } else {
            dVar.e(iVarK4, iVarK3, iMin, i19);
        }
        z21 = z12;
        i20 = i38;
        i21 = i35;
        if (z19) {
        }
        if (i22 >= i23) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x015f A[PHI: r11 r13
      0x015f: PHI (r11v3 x.c) = (r11v2 x.c), (r11v5 x.c) binds: [B:84:0x018a, B:75:0x015d] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r13v6 x.c) = (r13v5 x.c), (r13v8 x.c) binds: [B:84:0x018a, B:75:0x015d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i10, d dVar, int i11, int i12) {
        c cVarF;
        c cVarJ;
        c cVarJ2;
        c cVarJ3;
        boolean z7;
        if (i10 == 7) {
            if (i11 == 7) {
                c cVarJ4 = j(2);
                c cVarJ5 = j(4);
                c cVarJ6 = j(3);
                c cVarJ7 = j(5);
                boolean z10 = true;
                if ((cVarJ4 == null || !cVarJ4.h()) && (cVarJ5 == null || !cVarJ5.h())) {
                    f(2, dVar, 2, 0);
                    f(4, dVar, 4, 0);
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((cVarJ6 == null || !cVarJ6.h()) && (cVarJ7 == null || !cVarJ7.h())) {
                    f(3, dVar, 3, 0);
                    f(5, dVar, 5, 0);
                } else {
                    z10 = false;
                }
                if (z7 && z10) {
                    cVarJ2 = j(7);
                    cVarJ3 = dVar.j(7);
                } else if (z7) {
                    cVarJ2 = j(8);
                    cVarJ3 = dVar.j(8);
                } else {
                    if (!z10) {
                        return;
                    }
                    cVarJ2 = j(9);
                    cVarJ3 = dVar.j(9);
                }
            } else {
                if (i11 == 2 || i11 == 4) {
                    f(2, dVar, i11, 0);
                    f(4, dVar, i11, 0);
                } else {
                    if (i11 != 3 && i11 != 5) {
                        return;
                    }
                    f(3, dVar, i11, 0);
                    f(5, dVar, i11, 0);
                }
                cVarJ2 = j(7);
                cVarJ3 = dVar.j(i11);
            }
        } else if (i10 == 8 && (i11 == 2 || i11 == 4)) {
            c cVarJ8 = j(2);
            cVarJ3 = dVar.j(i11);
            c cVarJ9 = j(4);
            cVarJ8.a(cVarJ3, 0);
            cVarJ9.a(cVarJ3, 0);
            cVarJ2 = j(8);
        } else {
            if (i10 == 9 && (i11 == 3 || i11 == 5)) {
                c cVarJ10 = dVar.j(i11);
                j(3).a(cVarJ10, 0);
                j(5).a(cVarJ10, 0);
                j(9).a(cVarJ10, 0);
                return;
            }
            if (i10 == 8 && i11 == 8) {
                j(2).a(dVar.j(2), 0);
                j(4).a(dVar.j(4), 0);
                cVarJ2 = j(8);
            } else {
                if (i10 != 9 || i11 != 9) {
                    c cVarJ11 = j(i10);
                    c cVarJ12 = dVar.j(i11);
                    if (cVarJ11.i(cVarJ12)) {
                        if (i10 == 6) {
                            c cVarJ13 = j(3);
                            c cVarJ14 = j(5);
                            if (cVarJ13 != null) {
                                cVarJ13.j();
                            }
                            if (cVarJ14 != null) {
                                cVarJ14.j();
                            }
                        } else if (i10 == 3 || i10 == 5) {
                            c cVarJ15 = j(6);
                            if (cVarJ15 != null) {
                                cVarJ15.j();
                            }
                            c cVarJ16 = j(7);
                            if (cVarJ16.f18762f != cVarJ12) {
                                cVarJ16.j();
                            }
                            cVarF = j(i10).f();
                            cVarJ = j(9);
                            if (cVarJ.h()) {
                                cVarF.j();
                                cVarJ.j();
                            }
                        } else if (i10 == 2 || i10 == 4) {
                            c cVarJ17 = j(7);
                            if (cVarJ17.f18762f != cVarJ12) {
                                cVarJ17.j();
                            }
                            cVarF = j(i10).f();
                            cVarJ = j(8);
                            if (cVarJ.h()) {
                            }
                        }
                        cVarJ11.a(cVarJ12, i12);
                        return;
                    }
                    return;
                }
                j(3).a(dVar.j(3), 0);
                j(5).a(dVar.j(5), 0);
                cVarJ2 = j(9);
            }
            cVarJ3 = dVar.j(i11);
        }
        cVarJ2.a(cVarJ3, 0);
    }

    public final void g(c cVar, c cVar2, int i10) {
        if (cVar.f18760d == this) {
            f(cVar.f18761e, cVar2.f18760d, cVar2.f18761e, i10);
        }
    }

    public final void h(v.d dVar) {
        dVar.k(this.I);
        dVar.k(this.J);
        dVar.k(this.K);
        dVar.k(this.L);
        if (this.f18767a0 > 0) {
            dVar.k(this.M);
        }
    }

    public final void i() {
        if (this.f18772d == null) {
            y.k kVar = new y.k(this);
            kVar.f19186h.f19150e = 4;
            kVar.f19187i.f19150e = 5;
            kVar.f19184f = 0;
            this.f18772d = kVar;
        }
        if (this.f18774e == null) {
            m mVar = new m(this);
            y.f fVar = new y.f(mVar);
            mVar.f19163k = fVar;
            mVar.f19164l = null;
            mVar.f19186h.f19150e = 6;
            mVar.f19187i.f19150e = 7;
            fVar.f19150e = 8;
            mVar.f19184f = 1;
            this.f18774e = mVar;
        }
    }

    public c j(int i10) {
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return null;
            case QueueFuseable.SYNC /* 1 */:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return this.M;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return this.P;
            case y4.g.NETWORK_ERROR /* 7 */:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(r.n(i10));
        }
    }

    public final int k(int i10) {
        int[] iArr = this.f18797p0;
        if (i10 == 0) {
            return iArr[0];
        }
        if (i10 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int l() {
        if (this.f18779g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final d m(int i10) {
        c cVar;
        c cVar2;
        if (i10 != 0) {
            if (i10 == 1 && (cVar2 = (cVar = this.L).f18762f) != null && cVar2.f18762f == cVar) {
                return cVar2.f18760d;
            }
            return null;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f18762f;
        if (cVar4 == null || cVar4.f18762f != cVar3) {
            return null;
        }
        return cVar4.f18760d;
    }

    public final d n(int i10) {
        c cVar;
        c cVar2;
        if (i10 != 0) {
            if (i10 == 1 && (cVar2 = (cVar = this.J).f18762f) != null && cVar2.f18762f == cVar) {
                return cVar2.f18760d;
            }
            return null;
        }
        c cVar3 = this.I;
        c cVar4 = cVar3.f18762f;
        if (cVar4 == null || cVar4.f18762f != cVar3) {
            return null;
        }
        return cVar4.f18760d;
    }

    public void o(StringBuilder sb) {
        sb.append("  " + this.f18784j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        q(sb, "left", this.I);
        q(sb, "top", this.J);
        q(sb, "right", this.K);
        q(sb, "bottom", this.L);
        q(sb, "baseline", this.M);
        q(sb, "centerX", this.N);
        q(sb, "centerY", this.O);
        int i10 = this.U;
        int i11 = this.f18769b0;
        int[] iArr = this.C;
        int i12 = iArr[0];
        int i13 = this.f18802u;
        int i14 = this.f18799r;
        float f10 = this.f18804w;
        float[] fArr = this.f18787k0;
        float f11 = fArr[0];
        p(sb, "    width", i10, i11, i12, i13, i14, f10);
        int i15 = this.V;
        int i16 = this.f18771c0;
        int i17 = iArr[1];
        int i18 = this.f18805x;
        int i19 = this.f18800s;
        float f12 = this.f18807z;
        float f13 = fArr[1];
        p(sb, "    height", i15, i16, i17, i18, i19, f12);
        float f14 = this.W;
        int i20 = this.X;
        if (f14 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f14);
            sb.append(",");
            sb.append(i20);
            sb.append("");
            sb.append("],\n");
        }
        I(sb, "    horizontalBias", this.f18773d0, 0.5f);
        I(sb, "    verticalBias", this.f18775e0, 0.5f);
        H(this.f18783i0, 0, "    horizontalChainStyle", sb);
        H(this.f18785j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int r() {
        if (this.f18779g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int s() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Y : ((e) dVar).f18814x0 + this.Y;
    }

    public final int t() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Z : ((e) dVar).f18815y0 + this.Z;
    }

    public String toString() {
        StringBuilder sbN = ic1.n("");
        sbN.append(this.f18781h0 != null ? r.g(new StringBuilder("id: "), this.f18781h0, " ") : "");
        sbN.append("(");
        sbN.append(this.Y);
        sbN.append(", ");
        sbN.append(this.Z);
        sbN.append(") - (");
        sbN.append(this.U);
        sbN.append(" x ");
        return r.f(sbN, this.V, ")");
    }

    public final boolean u(int i10) {
        if (i10 == 0) {
            return (this.I.f18762f != null ? 1 : 0) + (this.K.f18762f != null ? 1 : 0) < 2;
        }
        return ((this.J.f18762f != null ? 1 : 0) + (this.L.f18762f != null ? 1 : 0)) + (this.M.f18762f != null ? 1 : 0) < 2;
    }

    public final boolean v(int i10, int i11) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i10 == 0) {
            c cVar5 = this.I;
            c cVar6 = cVar5.f18762f;
            if (cVar6 != null && cVar6.f18759c && (cVar4 = (cVar3 = this.K).f18762f) != null && cVar4.f18759c) {
                return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f18762f.d()) >= i11;
            }
        } else {
            c cVar7 = this.J;
            c cVar8 = cVar7.f18762f;
            if (cVar8 != null && cVar8.f18759c && (cVar2 = (cVar = this.L).f18762f) != null && cVar2.f18759c) {
                return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f18762f.d()) >= i11;
            }
        }
        return false;
    }

    public final void w(int i10, d dVar, int i11, int i12, int i13) {
        j(i10).b(dVar.j(i11), i12, i13, true);
    }

    public final boolean x(int i10) {
        c cVar;
        c cVar2;
        int i11 = i10 * 2;
        c[] cVarArr = this.Q;
        c cVar3 = cVarArr[i11];
        c cVar4 = cVar3.f18762f;
        return (cVar4 == null || cVar4.f18762f == cVar3 || (cVar2 = (cVar = cVarArr[i11 + 1]).f18762f) == null || cVar2.f18762f != cVar) ? false : true;
    }

    public final boolean y() {
        c cVar = this.I;
        c cVar2 = cVar.f18762f;
        if (cVar2 != null && cVar2.f18762f == cVar) {
            return true;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f18762f;
        return cVar4 != null && cVar4.f18762f == cVar3;
    }

    public final boolean z() {
        c cVar = this.J;
        c cVar2 = cVar.f18762f;
        if (cVar2 != null && cVar2.f18762f == cVar) {
            return true;
        }
        c cVar3 = this.L;
        c cVar4 = cVar3.f18762f;
        return cVar4 != null && cVar4.f18762f == cVar3;
    }
}