package t1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class t implements Cloneable {

    /* renamed from: a0, reason: collision with root package name */
    public static final Animator[] f17085a0 = new Animator[0];

    /* renamed from: b0, reason: collision with root package name */
    public static final int[] f17086b0 = {2, 1, 3, 4};

    /* renamed from: c0, reason: collision with root package name */
    public static final g8.e f17087c0 = new g8.e();

    /* renamed from: d0, reason: collision with root package name */
    public static final ThreadLocal f17088d0 = new ThreadLocal();
    public ArrayList N;
    public ArrayList O;
    public r[] P;
    public com.bumptech.glide.e Y;

    /* renamed from: b, reason: collision with root package name */
    public final String f17089b = getClass().getName();

    /* renamed from: e, reason: collision with root package name */
    public long f17090e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f17091f = -1;

    /* renamed from: j, reason: collision with root package name */
    public TimeInterpolator f17092j = null;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f17093m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f17094n = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public n8.s f17095t = new n8.s(4);

    /* renamed from: u, reason: collision with root package name */
    public n8.s f17096u = new n8.s(4);

    /* renamed from: w, reason: collision with root package name */
    public z f17097w = null;
    public final int[] M = f17086b0;
    public final ArrayList Q = new ArrayList();
    public Animator[] R = f17085a0;
    public int S = 0;
    public boolean T = false;
    public boolean U = false;
    public t V = null;
    public ArrayList W = null;
    public ArrayList X = new ArrayList();
    public g8.e Z = f17087c0;

    public static void d(n8.s sVar, View view, c0 c0Var) {
        ((t.b) sVar.f15435b).put(view, c0Var);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) sVar.f15436e).indexOfKey(id) >= 0) {
                ((SparseArray) sVar.f15436e).put(id, null);
            } else {
                ((SparseArray) sVar.f15436e).put(id, view);
            }
        }
        WeakHashMap weakHashMap = c1.f15515a;
        String strK = o0.q0.k(view);
        if (strK != null) {
            if (((t.b) sVar.f15438j).containsKey(strK)) {
                ((t.b) sVar.f15438j).put(strK, null);
            } else {
                ((t.b) sVar.f15438j).put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                t.e eVar = (t.e) sVar.f15437f;
                if (eVar.f16978b) {
                    eVar.e();
                }
                if (t.d.b(eVar.f16979e, eVar.f16981j, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    ((t.e) sVar.f15437f).i(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) ((t.e) sVar.f15437f).f(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    ((t.e) sVar.f15437f).i(itemIdAtPosition, null);
                }
            }
        }
    }

    public static t.b r() {
        ThreadLocal threadLocal = f17088d0;
        t.b bVar = (t.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        t.b bVar2 = new t.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean x(c0 c0Var, c0 c0Var2, String str) {
        Object obj = c0Var.f17017a.get(str);
        Object obj2 = c0Var2.f17017a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public t A(r rVar) {
        t tVar;
        ArrayList arrayList = this.W;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(rVar) && (tVar = this.V) != null) {
            tVar.A(rVar);
        }
        if (this.W.size() == 0) {
            this.W = null;
        }
        return this;
    }

    public void B(View view) {
        this.f17094n.remove(view);
    }

    public void C(ViewGroup viewGroup) {
        if (this.T) {
            if (!this.U) {
                ArrayList arrayList = this.Q;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.R);
                this.R = f17085a0;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.R = animatorArr;
                y(this, s.I);
            }
            this.T = false;
        }
    }

    public void D() {
        K();
        t.b bVarR = r();
        Iterator it = this.X.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (bVarR.containsKey(animator)) {
                K();
                if (animator != null) {
                    animator.addListener(new p(0, this, bVarR));
                    long j10 = this.f17091f;
                    if (j10 >= 0) {
                        animator.setDuration(j10);
                    }
                    long j11 = this.f17090e;
                    if (j11 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f17092j;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new m.d(this, 1));
                    animator.start();
                }
            }
        }
        this.X.clear();
        o();
    }

    public void E(long j10) {
        this.f17091f = j10;
    }

    public void F(com.bumptech.glide.e eVar) {
        this.Y = eVar;
    }

    public void G(TimeInterpolator timeInterpolator) {
        this.f17092j = timeInterpolator;
    }

    public void H(g8.e eVar) {
        if (eVar == null) {
            eVar = f17087c0;
        }
        this.Z = eVar;
    }

    public void I() {
    }

    public void J(long j10) {
        this.f17090e = j10;
    }

    public final void K() {
        if (this.S == 0) {
            y(this, s.E);
            this.U = false;
        }
        this.S++;
    }

    public String L(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f17091f != -1) {
            sb.append("dur(");
            sb.append(this.f17091f);
            sb.append(") ");
        }
        if (this.f17090e != -1) {
            sb.append("dly(");
            sb.append(this.f17090e);
            sb.append(") ");
        }
        if (this.f17092j != null) {
            sb.append("interp(");
            sb.append(this.f17092j);
            sb.append(") ");
        }
        ArrayList arrayList = this.f17093m;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f17094n;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (i10 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i10));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (i11 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i11));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void b(r rVar) {
        if (this.W == null) {
            this.W = new ArrayList();
        }
        this.W.add(rVar);
    }

    public void c(View view) {
        this.f17094n.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.R);
        this.R = f17085a0;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.R = animatorArr;
        y(this, s.G);
    }

    public abstract void e(c0 c0Var);

    public final void f(View view, boolean z7) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            c0 c0Var = new c0(view);
            if (z7) {
                i(c0Var);
            } else {
                e(c0Var);
            }
            c0Var.f17019c.add(this);
            g(c0Var);
            d(z7 ? this.f17095t : this.f17096u, view, c0Var);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), z7);
            }
        }
    }

    public void g(c0 c0Var) {
    }

    public abstract void i(c0 c0Var);

    public final void j(ViewGroup viewGroup, boolean z7) {
        k(z7);
        ArrayList arrayList = this.f17093m;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f17094n;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z7);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i10)).intValue());
            if (viewFindViewById != null) {
                c0 c0Var = new c0(viewFindViewById);
                if (z7) {
                    i(c0Var);
                } else {
                    e(c0Var);
                }
                c0Var.f17019c.add(this);
                g(c0Var);
                d(z7 ? this.f17095t : this.f17096u, viewFindViewById, c0Var);
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = (View) arrayList2.get(i11);
            c0 c0Var2 = new c0(view);
            if (z7) {
                i(c0Var2);
            } else {
                e(c0Var2);
            }
            c0Var2.f17019c.add(this);
            g(c0Var2);
            d(z7 ? this.f17095t : this.f17096u, view, c0Var2);
        }
    }

    public final void k(boolean z7) {
        n8.s sVar;
        if (z7) {
            ((t.b) this.f17095t.f15435b).clear();
            ((SparseArray) this.f17095t.f15436e).clear();
            sVar = this.f17095t;
        } else {
            ((t.b) this.f17096u.f15435b).clear();
            ((SparseArray) this.f17096u.f15436e).clear();
            sVar = this.f17096u;
        }
        ((t.e) sVar.f15437f).c();
    }

    @Override // 
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public t clone() {
        try {
            t tVar = (t) super.clone();
            tVar.X = new ArrayList();
            tVar.f17095t = new n8.s(4);
            tVar.f17096u = new n8.s(4);
            tVar.N = null;
            tVar.O = null;
            tVar.V = this;
            tVar.W = null;
            return tVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Animator m(ViewGroup viewGroup, c0 c0Var, c0 c0Var2) {
        return null;
    }

    public void n(ViewGroup viewGroup, n8.s sVar, n8.s sVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        View view;
        c0 c0Var;
        Animator animator;
        c0 c0Var2;
        t.b bVarR = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        q().getClass();
        int i11 = 0;
        while (i11 < size) {
            c0 c0Var3 = (c0) arrayList.get(i11);
            c0 c0Var4 = (c0) arrayList2.get(i11);
            if (c0Var3 != null && !c0Var3.f17019c.contains(this)) {
                c0Var3 = null;
            }
            if (c0Var4 != null && !c0Var4.f17019c.contains(this)) {
                c0Var4 = null;
            }
            if ((c0Var3 != null || c0Var4 != null) && (c0Var3 == null || c0Var4 == null || v(c0Var3, c0Var4))) {
                Animator animatorM = m(viewGroup, c0Var3, c0Var4);
                if (animatorM != null) {
                    String str = this.f17089b;
                    if (c0Var4 != null) {
                        String[] strArrS = s();
                        view = c0Var4.f17018b;
                        if (strArrS != null && strArrS.length > 0) {
                            c0Var2 = new c0(view);
                            c0 c0Var5 = (c0) ((t.b) sVar2.f15435b).getOrDefault(view, null);
                            i10 = size;
                            if (c0Var5 != null) {
                                int i12 = 0;
                                while (i12 < strArrS.length) {
                                    HashMap map = c0Var2.f17017a;
                                    String str2 = strArrS[i12];
                                    map.put(str2, c0Var5.f17017a.get(str2));
                                    i12++;
                                    strArrS = strArrS;
                                }
                            }
                            int i13 = bVarR.f17005f;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= i13) {
                                    animator = animatorM;
                                    break;
                                }
                                q qVar = (q) bVarR.getOrDefault((Animator) bVarR.i(i14), null);
                                if (qVar.f17075c != null && qVar.f17073a == view && qVar.f17074b.equals(str) && qVar.f17075c.equals(c0Var2)) {
                                    animator = null;
                                    break;
                                }
                                i14++;
                            }
                        } else {
                            i10 = size;
                            animator = animatorM;
                            c0Var2 = null;
                        }
                        animatorM = animator;
                        c0Var = c0Var2;
                    } else {
                        i10 = size;
                        view = c0Var3.f17018b;
                        c0Var = null;
                    }
                    if (animatorM != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        q qVar2 = new q();
                        qVar2.f17073a = view;
                        qVar2.f17074b = str;
                        qVar2.f17075c = c0Var;
                        qVar2.f17076d = windowId;
                        qVar2.f17077e = this;
                        qVar2.f17078f = animatorM;
                        bVarR.put(animatorM, qVar2);
                        this.X.add(animatorM);
                    }
                }
                i11++;
                size = i10;
            }
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                q qVar3 = (q) bVarR.getOrDefault((Animator) this.X.get(sparseIntArray.keyAt(i15)), null);
                qVar3.f17078f.setStartDelay(qVar3.f17078f.getStartDelay() + (sparseIntArray.valueAt(i15) - Long.MAX_VALUE));
            }
        }
    }

    public final void o() {
        int i10 = this.S - 1;
        this.S = i10;
        if (i10 == 0) {
            y(this, s.F);
            for (int i11 = 0; i11 < ((t.e) this.f17095t.f15437f).k(); i11++) {
                View view = (View) ((t.e) this.f17095t.f15437f).l(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < ((t.e) this.f17096u.f15437f).k(); i12++) {
                View view2 = (View) ((t.e) this.f17096u.f15437f).l(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.U = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (t1.c0) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c0 p(View view, boolean z7) {
        z zVar = this.f17097w;
        if (zVar != null) {
            return zVar.p(view, z7);
        }
        ArrayList arrayList = z7 ? this.N : this.O;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            c0 c0Var = (c0) arrayList.get(i10);
            if (c0Var == null) {
                return null;
            }
            if (c0Var.f17018b == view) {
                break;
            }
            i10++;
        }
    }

    public final t q() {
        z zVar = this.f17097w;
        return zVar != null ? zVar.q() : this;
    }

    public String[] s() {
        return null;
    }

    public final c0 t(View view, boolean z7) {
        z zVar = this.f17097w;
        if (zVar != null) {
            return zVar.t(view, z7);
        }
        return (c0) ((t.b) (z7 ? this.f17095t : this.f17096u).f15435b).getOrDefault(view, null);
    }

    public final String toString() {
        return L("");
    }

    public boolean u() {
        return !this.Q.isEmpty();
    }

    public boolean v(c0 c0Var, c0 c0Var2) {
        if (c0Var == null || c0Var2 == null) {
            return false;
        }
        String[] strArrS = s();
        if (strArrS == null) {
            Iterator it = c0Var.f17017a.keySet().iterator();
            while (it.hasNext()) {
                if (x(c0Var, c0Var2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrS) {
            if (!x(c0Var, c0Var2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean w(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f17093m;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f17094n;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void y(t tVar, o0.h hVar) {
        t tVar2 = this.V;
        if (tVar2 != null) {
            tVar2.y(tVar, hVar);
        }
        ArrayList arrayList = this.W;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.W.size();
        r[] rVarArr = this.P;
        if (rVarArr == null) {
            rVarArr = new r[size];
        }
        this.P = null;
        r[] rVarArr2 = (r[]) this.W.toArray(rVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            r rVar = rVarArr2[i10];
            switch (hVar.f15548b) {
                case 2:
                    rVar.g(tVar);
                    break;
                case 3:
                    rVar.b(tVar);
                    break;
                case 4:
                    rVar.d(tVar);
                    break;
                case y4.g.INVALID_ACCOUNT /* 5 */:
                    rVar.e();
                    break;
                default:
                    rVar.f();
                    break;
            }
            rVarArr2[i10] = null;
        }
        this.P = rVarArr2;
    }

    public void z(View view) {
        if (this.U) {
            return;
        }
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.R);
        this.R = f17085a0;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.R = animatorArr;
        y(this, s.H);
        this.T = true;
    }
}