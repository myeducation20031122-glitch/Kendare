package t1;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public t f17101b;

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f17102e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e8 A[EDGE_INSN: B:135:0x01e8->B:90:0x01e8 BREAK  A[LOOP:1: B:19:0x0088->B:89:0x01de], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ee  */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [t.k] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        t tVar;
        t.b bVar;
        t.b bVar2;
        int i10;
        int[] iArr;
        t.b bVar3;
        int i11;
        int i12;
        int i13;
        q qVar;
        View view;
        t.b bVar4;
        c0 c0Var;
        View view2;
        View view3;
        ?? r82;
        ViewGroup viewGroup = this.f17102e;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = x.f17105c;
        ViewGroup viewGroup2 = this.f17102e;
        int i14 = 1;
        if (!arrayList2.remove(viewGroup2)) {
            return true;
        }
        t.b bVarB = x.b();
        Long l10 = null;
        ArrayList arrayList3 = (ArrayList) bVarB.getOrDefault(viewGroup2, null);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            tVar = this.f17101b;
            arrayList3.add(tVar);
            tVar.b(new v(0, this, bVarB));
            tVar.j(viewGroup2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).C(viewGroup2);
                }
            }
            tVar.N = new ArrayList();
            tVar.O = new ArrayList();
            n8.s sVar = tVar.f17095t;
            n8.s sVar2 = tVar.f17096u;
            bVar = new t.b((t.b) sVar.f15435b);
            bVar2 = new t.b((t.b) sVar2.f15435b);
            i10 = 0;
            while (true) {
                iArr = tVar.M;
                if (i10 < iArr.length) {
                    break;
                }
                int i15 = iArr[i10];
                if (i15 == i14) {
                    bVar4 = bVar2;
                    for (int i16 = bVar.f17005f - 1; i16 >= 0; i16--) {
                        View view4 = (View) bVar.i(i16);
                        if (view4 != null && tVar.w(view4) && (c0Var = (c0) bVar4.remove(view4)) != null && tVar.w(c0Var.f17018b)) {
                            tVar.N.add((c0) bVar.k(i16));
                            tVar.O.add(c0Var);
                        }
                    }
                } else if (i15 == 2) {
                    bVar4 = bVar2;
                    t.b bVar5 = (t.b) sVar.f15438j;
                    t.b bVar6 = (t.b) sVar2.f15438j;
                    int i17 = bVar5.f17005f;
                    for (int i18 = 0; i18 < i17; i18++) {
                        View view5 = (View) bVar5.m(i18);
                        if (view5 != null && tVar.w(view5) && (view2 = (View) bVar6.getOrDefault(bVar5.i(i18), null)) != null && tVar.w(view2)) {
                            c0 c0Var2 = (c0) bVar.getOrDefault(view5, null);
                            c0 c0Var3 = (c0) bVar4.getOrDefault(view2, null);
                            if (c0Var2 != null && c0Var3 != null) {
                                tVar.N.add(c0Var2);
                                tVar.O.add(c0Var3);
                                bVar.remove(view5);
                                bVar4.remove(view2);
                            }
                        }
                    }
                } else if (i15 != 3) {
                    if (i15 == 4) {
                        t.e eVar = (t.e) sVar.f15437f;
                        t.e eVar2 = (t.e) sVar2.f15437f;
                        int iK = eVar.k();
                        int i19 = 0;
                        while (i19 < iK) {
                            View view6 = (View) eVar.l(i19);
                            if (view6 == null || !tVar.w(view6)) {
                                r82 = bVar2;
                            } else {
                                t.b bVar7 = bVar2;
                                View view7 = (View) eVar2.f(eVar.g(i19), l10);
                                if (view7 == null || !tVar.w(view7)) {
                                    r82 = bVar7;
                                } else {
                                    c0 c0Var4 = (c0) bVar.getOrDefault(view6, l10);
                                    r82 = bVar7;
                                    c0 c0Var5 = (c0) r82.getOrDefault(view7, l10);
                                    if (c0Var4 != null && c0Var5 != null) {
                                        tVar.N.add(c0Var4);
                                        tVar.O.add(c0Var5);
                                        bVar.remove(view6);
                                        r82.remove(view7);
                                    }
                                }
                            }
                            i19++;
                            bVar2 = r82;
                            l10 = null;
                        }
                    }
                    bVar4 = bVar2;
                } else {
                    bVar4 = bVar2;
                    SparseArray sparseArray = (SparseArray) sVar.f15436e;
                    SparseArray sparseArray2 = (SparseArray) sVar2.f15436e;
                    int size = sparseArray.size();
                    for (int i20 = 0; i20 < size; i20++) {
                        View view8 = (View) sparseArray.valueAt(i20);
                        if (view8 != null && tVar.w(view8) && (view3 = (View) sparseArray2.get(sparseArray.keyAt(i20))) != null && tVar.w(view3)) {
                            c0 c0Var6 = (c0) bVar.getOrDefault(view8, null);
                            c0 c0Var7 = (c0) bVar4.getOrDefault(view3, null);
                            if (c0Var6 != null && c0Var7 != null) {
                                tVar.N.add(c0Var6);
                                tVar.O.add(c0Var7);
                                bVar.remove(view8);
                                bVar4.remove(view3);
                            }
                        }
                    }
                }
                i10++;
                bVar2 = bVar4;
                l10 = null;
                i14 = 1;
            }
            bVar3 = bVar2;
            for (i11 = 0; i11 < bVar.f17005f; i11++) {
                c0 c0Var8 = (c0) bVar.m(i11);
                if (tVar.w(c0Var8.f17018b)) {
                    tVar.N.add(c0Var8);
                    tVar.O.add(null);
                }
            }
            for (i12 = 0; i12 < bVar3.f17005f; i12++) {
                c0 c0Var9 = (c0) bVar3.m(i12);
                if (tVar.w(c0Var9.f17018b)) {
                    tVar.O.add(c0Var9);
                    tVar.N.add(null);
                }
            }
            t.b bVarR = t.r();
            int i21 = bVarR.f17005f;
            WindowId windowId = viewGroup2.getWindowId();
            for (i13 = i21 - 1; i13 >= 0; i13--) {
                Animator animator = (Animator) bVarR.i(i13);
                if (animator != null && (qVar = (q) bVarR.getOrDefault(animator, null)) != null && (view = qVar.f17073a) != null && windowId.equals(qVar.f17076d)) {
                    c0 c0VarT = tVar.t(view, true);
                    c0 c0VarP = tVar.p(view, true);
                    if (c0VarT == null && c0VarP == null) {
                        c0VarP = (c0) ((t.b) tVar.f17096u.f15435b).getOrDefault(view, null);
                    }
                    if (c0VarT != null || c0VarP != null) {
                        c0 c0Var10 = qVar.f17075c;
                        t tVar2 = qVar.f17077e;
                        if (tVar2.v(c0Var10, c0VarP)) {
                            tVar2.q().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                bVarR.remove(animator);
                            }
                        }
                    }
                }
            }
            tVar.n(viewGroup2, tVar.f17095t, tVar.f17096u, tVar.N, tVar.O);
            tVar.D();
            return true;
        }
        arrayList3 = new ArrayList();
        bVarB.put(viewGroup2, arrayList3);
        tVar = this.f17101b;
        arrayList3.add(tVar);
        tVar.b(new v(0, this, bVarB));
        tVar.j(viewGroup2, false);
        if (arrayList != null) {
        }
        tVar.N = new ArrayList();
        tVar.O = new ArrayList();
        n8.s sVar3 = tVar.f17095t;
        n8.s sVar22 = tVar.f17096u;
        bVar = new t.b((t.b) sVar3.f15435b);
        bVar2 = new t.b((t.b) sVar22.f15435b);
        i10 = 0;
        while (true) {
            iArr = tVar.M;
            if (i10 < iArr.length) {
            }
            i10++;
            bVar2 = bVar4;
            l10 = null;
            i14 = 1;
        }
        bVar3 = bVar2;
        while (i11 < bVar.f17005f) {
        }
        while (i12 < bVar3.f17005f) {
        }
        t.b bVarR2 = t.r();
        int i212 = bVarR2.f17005f;
        WindowId windowId2 = viewGroup2.getWindowId();
        while (i13 >= 0) {
        }
        tVar.n(viewGroup2, tVar.f17095t, tVar.f17096u, tVar.N, tVar.O);
        tVar.D();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f17102e;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = x.f17105c;
        ViewGroup viewGroup2 = this.f17102e;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) x.b().getOrDefault(viewGroup2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((t) it.next()).C(viewGroup2);
            }
        }
        this.f17101b.k(true);
    }
}