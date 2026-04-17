package y;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.ae0;
import com.google.android.gms.internal.ads.aj0;
import com.google.android.gms.internal.ads.gq0;
import com.google.android.gms.internal.ads.nj0;
import com.google.android.gms.internal.ads.nk;
import com.google.android.gms.internal.ads.ui0;
import com.google.android.gms.internal.ads.vh0;
import com.google.android.gms.internal.ads.wp0;
import com.google.android.gms.internal.ads.zj0;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19137a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19138b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19139c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19140d;

    /* renamed from: e, reason: collision with root package name */
    public Object f19141e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractCollection f19142f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractCollection f19143g;

    /* renamed from: h, reason: collision with root package name */
    public Object f19144h;

    /* renamed from: i, reason: collision with root package name */
    public Object f19145i;

    public e(Looper looper, ae0 ae0Var, nj0 nj0Var) {
        this(new CopyOnWriteArraySet(), looper, ae0Var, nj0Var);
    }

    public final void a(f fVar, int i10, ArrayList arrayList, l lVar) {
        p pVar = fVar.f19149d;
        if (pVar.f19181c == null) {
            x.e eVar = (x.e) this.f19139c;
            if (pVar == eVar.f18772d || pVar == eVar.f18774e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f19161a = null;
                lVar.f19162b = new ArrayList();
                lVar.f19161a = pVar;
                arrayList.add(lVar);
            }
            pVar.f19181c = lVar;
            lVar.f19162b.add(pVar);
            f fVar2 = pVar.f19186h;
            Iterator it = fVar2.f19156k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar instanceof f) {
                    a((f) dVar, i10, arrayList, lVar);
                }
            }
            f fVar3 = pVar.f19187i;
            Iterator it2 = fVar3.f19156k.iterator();
            while (it2.hasNext()) {
                d dVar2 = (d) it2.next();
                if (dVar2 instanceof f) {
                    a((f) dVar2, i10, arrayList, lVar);
                }
            }
            if (i10 == 1 && (pVar instanceof m)) {
                Iterator it3 = ((m) pVar).f19163k.f19156k.iterator();
                while (it3.hasNext()) {
                    d dVar3 = (d) it3.next();
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i10, arrayList, lVar);
                    }
                }
            }
            Iterator it4 = fVar2.f19157l.iterator();
            while (it4.hasNext()) {
                a((f) it4.next(), i10, arrayList, lVar);
            }
            Iterator it5 = fVar3.f19157l.iterator();
            while (it5.hasNext()) {
                a((f) it5.next(), i10, arrayList, lVar);
            }
            if (i10 == 1 && (pVar instanceof m)) {
                Iterator it6 = ((m) pVar).f19163k.f19157l.iterator();
                while (it6.hasNext()) {
                    a((f) it6.next(), i10, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(x.e eVar) {
        int iR;
        int iL;
        e eVar2;
        x.d dVar;
        int iR2;
        int i10;
        g gVar;
        int iL2;
        Iterator it = eVar.f18854q0.iterator();
        while (it.hasNext()) {
            x.d dVar2 = (x.d) it.next();
            int[] iArr = dVar2.f18797p0;
            int i11 = iArr[0];
            int i12 = iArr[1];
            if (dVar2.f18779g0 == 8) {
                dVar2.f18766a = true;
            } else {
                float f10 = dVar2.f18804w;
                if (f10 < 1.0f && i11 == 3) {
                    dVar2.f18799r = 2;
                }
                float f11 = dVar2.f18807z;
                if (f11 < 1.0f && i12 == 3) {
                    dVar2.f18800s = 2;
                }
                int i13 = 1;
                if (dVar2.W > 0.0f) {
                    if (i11 == 3 && (i12 == 2 || i12 == 1)) {
                        dVar2.f18799r = 3;
                    } else if (i12 != 3 || (i11 != 2 && i11 != 1)) {
                        if (i11 == 3 && i12 == 3) {
                            if (dVar2.f18799r == 0) {
                                dVar2.f18799r = 3;
                            }
                            if (dVar2.f18800s == 0) {
                                dVar2.f18800s = 3;
                            }
                        }
                    }
                }
                x.c cVar = dVar2.K;
                x.c cVar2 = dVar2.I;
                if (i11 == 3 && dVar2.f18799r == 1 && (cVar2.f18762f == null || cVar.f18762f == null)) {
                    i11 = 2;
                }
                x.c cVar3 = dVar2.L;
                x.c cVar4 = dVar2.J;
                int i14 = (i12 == 3 && dVar2.f18800s == 1 && (cVar4.f18762f == null || cVar3.f18762f == null)) ? 2 : i12;
                k kVar = dVar2.f18772d;
                kVar.f19182d = i11;
                int i15 = dVar2.f18799r;
                kVar.f19179a = i15;
                m mVar = dVar2.f18774e;
                mVar.f19182d = i14;
                int i16 = dVar2.f18800s;
                mVar.f19179a = i16;
                if ((i11 == 4 || i11 == 1 || i11 == 2) && (i14 == 4 || i14 == 1 || i14 == 2)) {
                    int iR3 = dVar2.r();
                    if (i11 == 4) {
                        iR = (eVar.r() - cVar2.f18763g) - cVar.f18763g;
                        i11 = 1;
                    } else {
                        iR = iR3;
                    }
                    int iL3 = dVar2.l();
                    if (i14 == 4) {
                        iL3 = (eVar.l() - cVar4.f18763g) - cVar3.f18763g;
                    } else {
                        i13 = i14;
                    }
                    iL = iL3;
                    eVar2 = this;
                    dVar = dVar2;
                    iR2 = iR;
                    i10 = i13;
                    eVar2.f(dVar, i11, iR2, i10, iL);
                    dVar2.f18772d.f19183e.d(dVar2.r());
                    dVar2.f18774e.f19183e.d(dVar2.l());
                    dVar2.f18766a = true;
                } else {
                    int[] iArr2 = eVar.f18797p0;
                    x.c[] cVarArr = dVar2.Q;
                    if (i11 == 3 && (i14 == 2 || i14 == 1)) {
                        if (i15 == 3) {
                            if (i14 == 2) {
                                f(dVar2, 2, 0, 2, 0);
                            }
                            int iL4 = dVar2.l();
                            f(dVar2, 1, (int) ((iL4 * dVar2.W) + 0.5f), 1, iL4);
                            dVar2.f18772d.f19183e.d(dVar2.r());
                            dVar2.f18774e.f19183e.d(dVar2.l());
                            dVar2.f18766a = true;
                        } else if (i15 == 1) {
                            f(dVar2, 2, 0, i14, 0);
                            gVar = dVar2.f18772d.f19183e;
                            iL2 = dVar2.r();
                            gVar.f19158m = iL2;
                        } else if (i15 == 2) {
                            int i17 = iArr2[0];
                            if (i17 == 1 || i17 == 4) {
                                f(dVar2, 1, (int) ((f10 * eVar.r()) + 0.5f), i14, dVar2.l());
                                dVar2.f18772d.f19183e.d(dVar2.r());
                                dVar2.f18774e.f19183e.d(dVar2.l());
                                dVar2.f18766a = true;
                            }
                        } else {
                            if (cVarArr[0].f18762f == null || cVarArr[1].f18762f == null) {
                            }
                            iR2 = 0;
                            eVar2 = this;
                            dVar = dVar2;
                            i11 = 2;
                            i10 = i14;
                            iL = 0;
                            eVar2.f(dVar, i11, iR2, i10, iL);
                            dVar2.f18772d.f19183e.d(dVar2.r());
                            dVar2.f18774e.f19183e.d(dVar2.l());
                            dVar2.f18766a = true;
                        }
                    }
                    if (i14 == 3 && (i11 == 2 || i11 == 1)) {
                        if (i16 == 3) {
                            if (i11 == 2) {
                                f(dVar2, 2, 0, 2, 0);
                            }
                            iR2 = dVar2.r();
                            float f12 = dVar2.W;
                            if (dVar2.X == -1) {
                                f12 = 1.0f / f12;
                            }
                            iL = (int) ((iR2 * f12) + 0.5f);
                            eVar2 = this;
                            dVar = dVar2;
                            i11 = 1;
                            i10 = i13;
                            eVar2.f(dVar, i11, iR2, i10, iL);
                            dVar2.f18772d.f19183e.d(dVar2.r());
                            dVar2.f18774e.f19183e.d(dVar2.l());
                            dVar2.f18766a = true;
                        } else if (i16 == 1) {
                            f(dVar2, i11, 0, 2, 0);
                            gVar = dVar2.f18774e.f19183e;
                            iL2 = dVar2.l();
                            gVar.f19158m = iL2;
                        } else {
                            if (i16 == 2) {
                                int i18 = iArr2[1];
                                if (i18 == 1 || i18 == 4) {
                                    iR2 = dVar2.r();
                                    iL = (int) ((f11 * eVar.l()) + 0.5f);
                                    eVar2 = this;
                                    dVar = dVar2;
                                    i10 = i13;
                                    eVar2.f(dVar, i11, iR2, i10, iL);
                                    dVar2.f18772d.f19183e.d(dVar2.r());
                                    dVar2.f18774e.f19183e.d(dVar2.l());
                                    dVar2.f18766a = true;
                                }
                            } else if (cVarArr[2].f18762f == null || cVarArr[3].f18762f == null) {
                                iR2 = 0;
                                eVar2 = this;
                                dVar = dVar2;
                                i11 = 2;
                                i10 = i14;
                                iL = 0;
                                eVar2.f(dVar, i11, iR2, i10, iL);
                                dVar2.f18772d.f19183e.d(dVar2.r());
                                dVar2.f18774e.f19183e.d(dVar2.l());
                                dVar2.f18766a = true;
                            }
                            if (i11 != 3) {
                            }
                        }
                    } else if (i11 != 3 && i14 == 3) {
                        if (i15 == 1 || i16 == 1) {
                            f(dVar2, 2, 0, 2, 0);
                            dVar2.f18772d.f19183e.f19158m = dVar2.r();
                            gVar = dVar2.f18774e.f19183e;
                            iL2 = dVar2.l();
                            gVar.f19158m = iL2;
                        } else if (i16 == 2 && i15 == 2 && iArr2[0] == 1 && iArr2[1] == 1) {
                            iR2 = (int) ((f10 * eVar.r()) + 0.5f);
                            iL = (int) ((f11 * eVar.l()) + 0.5f);
                            eVar2 = this;
                            dVar = dVar2;
                            i11 = 1;
                            i10 = i13;
                            eVar2.f(dVar, i11, iR2, i10, iL);
                            dVar2.f18772d.f19183e.d(dVar2.r());
                            dVar2.f18774e.f19183e.d(dVar2.l());
                            dVar2.f18766a = true;
                        }
                    }
                }
            }
        }
    }

    public final void c() {
        p iVar;
        ArrayList arrayList = (ArrayList) this.f19141e;
        arrayList.clear();
        x.e eVar = (x.e) this.f19140d;
        eVar.f18772d.f();
        eVar.f18774e.f();
        arrayList.add(eVar.f18772d);
        arrayList.add(eVar.f18774e);
        Iterator it = eVar.f18854q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            x.d dVar = (x.d) it.next();
            if (dVar instanceof x.h) {
                iVar = new i(dVar);
                dVar.f18772d.f();
                dVar.f18774e.f();
                iVar.f19184f = ((x.h) dVar).f18849u0;
            } else {
                if (dVar.y()) {
                    if (dVar.f18768b == null) {
                        dVar.f18768b = new c(0, dVar);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f18768b);
                } else {
                    arrayList.add(dVar.f18772d);
                }
                if (dVar.z()) {
                    if (dVar.f18770c == null) {
                        dVar.f18770c = new c(1, dVar);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f18770c);
                } else {
                    arrayList.add(dVar.f18774e);
                }
                if (dVar instanceof x.j) {
                    iVar = new j(dVar);
                }
            }
            arrayList.add(iVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f19180b != eVar) {
                pVar.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f19143g;
        arrayList2.clear();
        x.e eVar2 = (x.e) this.f19139c;
        e(eVar2.f18772d, 0, arrayList2);
        e(eVar2.f18774e, 1, arrayList2);
        this.f19137a = false;
    }

    public final int d(x.e eVar, int i10) {
        ArrayList arrayList;
        int i11;
        int i12;
        long j10;
        long j11;
        long jB;
        float f10;
        x.e eVar2 = eVar;
        ArrayList arrayList2 = (ArrayList) this.f19143g;
        int size = arrayList2.size();
        int i13 = 0;
        long jMax = 0;
        while (i13 < size) {
            p pVar = ((l) arrayList2.get(i13)).f19161a;
            if (!(pVar instanceof c) ? !(i10 != 0 ? (pVar instanceof m) : (pVar instanceof k)) : ((c) pVar).f19184f != i10) {
                f fVar = (i10 == 0 ? eVar2.f18772d : eVar2.f18774e).f19186h;
                f fVar2 = (i10 == 0 ? eVar2.f18772d : eVar2.f18774e).f19187i;
                boolean zContains = pVar.f19186h.f19157l.contains(fVar);
                f fVar3 = pVar.f19187i;
                boolean zContains2 = fVar3.f19157l.contains(fVar2);
                long j12 = pVar.j();
                f fVar4 = pVar.f19186h;
                if (zContains && zContains2) {
                    long jB2 = l.b(fVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i11 = size;
                    long jA = l.a(fVar3, 0L);
                    long j13 = jB2 - j12;
                    int i14 = fVar3.f19151f;
                    arrayList = arrayList3;
                    i12 = i13;
                    if (j13 >= (-i14)) {
                        j13 += i14;
                    }
                    long j14 = (-jA) - j12;
                    long j15 = fVar4.f19151f;
                    long j16 = j14 - j15;
                    if (j16 >= j15) {
                        j16 -= j15;
                    }
                    x.d dVar = pVar.f19180b;
                    if (i10 == 0) {
                        f10 = dVar.f18773d0;
                    } else if (i10 == 1) {
                        f10 = dVar.f18775e0;
                    } else {
                        dVar.getClass();
                        f10 = -1.0f;
                    }
                    float f11 = f10 > 0.0f ? (long) ((j13 / (1.0f - f10)) + (j16 / f10)) : 0L;
                    j10 = (fVar4.f19151f + ((((long) ((f11 * f10) + 0.5f)) + j12) + ((long) (((1.0f - f10) * f11) + 0.5f)))) - fVar3.f19151f;
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    i12 = i13;
                    if (zContains) {
                        jB = l.b(fVar4, fVar4.f19151f);
                        j11 = fVar4.f19151f + j12;
                    } else if (zContains2) {
                        j11 = (-fVar3.f19151f) + j12;
                        jB = -l.a(fVar3, fVar3.f19151f);
                    } else {
                        j10 = (pVar.j() + fVar4.f19151f) - fVar3.f19151f;
                    }
                    j10 = Math.max(jB, j11);
                }
            } else {
                arrayList = arrayList2;
                i11 = size;
                i12 = i13;
                j10 = 0;
            }
            jMax = Math.max(jMax, j10);
            i13 = i12 + 1;
            eVar2 = eVar;
            size = i11;
            arrayList2 = arrayList;
        }
        return (int) jMax;
    }

    public final void e(p pVar, int i10, ArrayList arrayList) {
        f fVar;
        f fVar2;
        f fVar3;
        Iterator it = pVar.f19186h.f19156k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fVar = pVar.f19187i;
            if (!zHasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                fVar3 = (f) dVar;
            } else if (dVar instanceof p) {
                fVar3 = ((p) dVar).f19186h;
            }
            a(fVar3, i10, arrayList, null);
        }
        Iterator it2 = fVar.f19156k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                fVar2 = (f) dVar2;
            } else if (dVar2 instanceof p) {
                fVar2 = ((p) dVar2).f19187i;
            }
            a(fVar2, i10, arrayList, null);
        }
        if (i10 == 1) {
            Iterator it3 = ((m) pVar).f19163k.f19156k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, arrayList, null);
                }
            }
        }
    }

    public final void f(x.d dVar, int i10, int i11, int i12, int i13) {
        b bVar = (b) this.f19145i;
        bVar.f19125a = i10;
        bVar.f19126b = i12;
        bVar.f19127c = i11;
        bVar.f19128d = i13;
        ((n) this.f19144h).b(dVar, bVar);
        dVar.P(bVar.f19129e);
        dVar.M(bVar.f19130f);
        dVar.E = bVar.f19132h;
        dVar.J(bVar.f19131g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r10 == 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r2.f19158m = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r2.d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r8 == 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        g gVar;
        int iR;
        a aVar;
        Iterator it = ((x.e) this.f19139c).f18854q0.iterator();
        while (it.hasNext()) {
            x.d dVar = (x.d) it.next();
            if (!dVar.f18766a) {
                int[] iArr = dVar.f18797p0;
                boolean z7 = false;
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = dVar.f18799r;
                int i13 = dVar.f18800s;
                boolean z10 = i10 == 2 || (i10 == 3 && i12 == 1);
                if (i11 == 2 || (i11 == 3 && i13 == 1)) {
                    z7 = true;
                }
                g gVar2 = dVar.f18772d.f19183e;
                boolean z11 = gVar2.f19155j;
                g gVar3 = dVar.f18774e.f19183e;
                boolean z12 = gVar3.f19155j;
                if (z11 && z12) {
                    f(dVar, 1, gVar2.f19152g, 1, gVar3.f19152g);
                } else if (z11 && z7) {
                    f(dVar, 1, gVar2.f19152g, 2, gVar3.f19152g);
                    gVar = dVar.f18774e.f19183e;
                    iR = dVar.l();
                } else {
                    if (z12 && z10) {
                        f(dVar, 2, gVar2.f19152g, 1, gVar3.f19152g);
                        gVar = dVar.f18772d.f19183e;
                        iR = dVar.r();
                    }
                    if (!dVar.f18766a && (aVar = dVar.f18774e.f19164l) != null) {
                        aVar.d(dVar.f18767a0);
                    }
                }
                dVar.f18766a = true;
                if (!dVar.f18766a) {
                }
            }
        }
    }

    public final void h(Object obj) {
        synchronized (this.f19145i) {
            try {
                if (this.f19137a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f19142f).add(new zj0(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        l();
        if (((ArrayDeque) this.f19144h).isEmpty()) {
            return;
        }
        gq0 gq0Var = (gq0) ((vh0) this.f19140d);
        if (!gq0Var.f4986a.hasMessages(0)) {
            gq0Var.getClass();
            wp0 wp0VarD = gq0.d();
            Handler handler = gq0Var.f4986a;
            Message messageObtainMessage = handler.obtainMessage(0);
            wp0VarD.f9571a = messageObtainMessage;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            wp0VarD.b();
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f19143g;
        boolean z7 = !arrayDeque.isEmpty();
        arrayDeque.addAll((ArrayDeque) this.f19144h);
        ((ArrayDeque) this.f19144h).clear();
        if (z7) {
            return;
        }
        while (!arrayDeque.isEmpty()) {
            ((Runnable) arrayDeque.peekFirst()).run();
            arrayDeque.removeFirst();
        }
    }

    public final void j(int i10, aj0 aj0Var) {
        l();
        ((ArrayDeque) this.f19144h).add(new ui0(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f19142f), i10, aj0Var));
    }

    public final void k() {
        l();
        synchronized (this.f19145i) {
            this.f19137a = true;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f19142f).iterator();
        while (it.hasNext()) {
            zj0 zj0Var = (zj0) it.next();
            nj0 nj0Var = (nj0) this.f19141e;
            zj0Var.f10522d = true;
            if (zj0Var.f10521c) {
                zj0Var.f10521c = false;
                nj0Var.d(zj0Var.f10519a, zj0Var.f10520b.f());
            }
        }
        ((CopyOnWriteArraySet) this.f19142f).clear();
    }

    public final void l() {
        if (this.f19138b) {
            com.bumptech.glide.f.N(Thread.currentThread() == ((gq0) ((vh0) this.f19140d)).f4986a.getLooper().getThread());
        }
    }

    public e(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, ae0 ae0Var, nj0 nj0Var) {
        this.f19139c = ae0Var;
        this.f19142f = copyOnWriteArraySet;
        this.f19141e = nj0Var;
        this.f19145i = new Object();
        this.f19143g = new ArrayDeque();
        this.f19144h = new ArrayDeque();
        this.f19140d = ((nk) ae0Var).m(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.gi0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                y.e eVar = this.f4938b;
                Iterator it = ((CopyOnWriteArraySet) eVar.f19142f).iterator();
                while (it.hasNext()) {
                    zj0 zj0Var = (zj0) it.next();
                    nj0 nj0Var2 = (nj0) eVar.f19141e;
                    if (!zj0Var.f10522d && zj0Var.f10521c) {
                        t1 t1VarF = zj0Var.f10520b.f();
                        zj0Var.f10520b = new com.onesignal.w(3);
                        zj0Var.f10521c = false;
                        nj0Var2.d(zj0Var.f10519a, t1VarF);
                    }
                    if (((gq0) ((vh0) eVar.f19140d)).f4986a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f19138b = true;
    }
}