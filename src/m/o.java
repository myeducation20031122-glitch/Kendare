package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o implements l.a0 {
    public m M;
    public Drawable N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public i W;
    public i X;
    public k Y;
    public j Z;

    /* renamed from: b, reason: collision with root package name */
    public final Context f14858b;

    /* renamed from: b0, reason: collision with root package name */
    public int f14859b0;

    /* renamed from: e, reason: collision with root package name */
    public Context f14860e;

    /* renamed from: f, reason: collision with root package name */
    public l.o f14861f;

    /* renamed from: j, reason: collision with root package name */
    public final LayoutInflater f14862j;

    /* renamed from: m, reason: collision with root package name */
    public l.z f14863m;

    /* renamed from: u, reason: collision with root package name */
    public l.c0 f14866u;

    /* renamed from: w, reason: collision with root package name */
    public int f14867w;

    /* renamed from: n, reason: collision with root package name */
    public final int f14864n = 2131492867;

    /* renamed from: t, reason: collision with root package name */
    public final int f14865t = 2131492866;
    public final SparseBooleanArray V = new SparseBooleanArray();

    /* renamed from: a0, reason: collision with root package name */
    public final g.v0 f14857a0 = new g.v0(this, 1);

    public o(Context context) {
        this.f14858b = context;
        this.f14862j = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.b0] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(l.q qVar, View view, ViewGroup viewGroup) {
        View actionView = qVar.getActionView();
        if (actionView == null || qVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof l.b0 ? (l.b0) view : (l.b0) this.f14862j.inflate(this.f14865t, viewGroup, false);
            actionMenuItemView.b(qVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f14866u);
            if (this.Z == null) {
                this.Z = new j(this);
            }
            actionMenuItemView2.setPopupCallback(this.Z);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(qVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // l.a0
    public final void b(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof n) && (i10 = ((n) parcelable).f14851b) > 0 && (menuItemFindItem = this.f14861f.findItem(i10)) != null) {
            m((l.g0) menuItemFindItem.getSubMenu());
        }
    }

    public final boolean c() {
        Object obj;
        k kVar = this.Y;
        if (kVar != null && (obj = this.f14866u) != null) {
            ((View) obj).removeCallbacks(kVar);
            this.Y = null;
            return true;
        }
        i iVar = this.W;
        if (iVar == null) {
            return false;
        }
        if (iVar.b()) {
            iVar.f14431j.dismiss();
        }
        return true;
    }

    @Override // l.a0
    public final void d(l.o oVar, boolean z7) {
        c();
        i iVar = this.X;
        if (iVar != null && iVar.b()) {
            iVar.f14431j.dismiss();
        }
        l.z zVar = this.f14863m;
        if (zVar != null) {
            zVar.d(oVar, z7);
        }
    }

    public final boolean e() {
        i iVar = this.W;
        return iVar != null && iVar.b();
    }

    @Override // l.a0
    public final void f(l.z zVar) {
        this.f14863m = zVar;
    }

    @Override // l.a0
    public final /* bridge */ /* synthetic */ boolean g(l.q qVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.a0
    public final void h(boolean z7) {
        int size;
        int i10;
        ViewGroup viewGroup = (ViewGroup) this.f14866u;
        ArrayList arrayList = null;
        if (viewGroup != null) {
            l.o oVar = this.f14861f;
            if (oVar != null) {
                oVar.i();
                ArrayList arrayListL = this.f14861f.l();
                int size2 = arrayListL.size();
                i10 = 0;
                for (int i11 = 0; i11 < size2; i11++) {
                    l.q qVar = (l.q) arrayListL.get(i11);
                    if (qVar.f()) {
                        View childAt = viewGroup.getChildAt(i10);
                        l.q itemData = childAt instanceof l.b0 ? ((l.b0) childAt).getItemData() : null;
                        View viewA = a(qVar, childAt, viewGroup);
                        if (qVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f14866u).addView(viewA, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.M) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f14866u).requestLayout();
        l.o oVar2 = this.f14861f;
        if (oVar2 != null) {
            oVar2.i();
            ArrayList arrayList2 = oVar2.f14365i;
            int size3 = arrayList2.size();
            for (int i12 = 0; i12 < size3; i12++) {
                l.r rVar = ((l.q) arrayList2.get(i12)).A;
            }
        }
        l.o oVar3 = this.f14861f;
        if (oVar3 != null) {
            oVar3.i();
            arrayList = oVar3.f14366j;
        }
        if (!this.P || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!((l.q) arrayList.get(0)).C))) {
            m mVar = this.M;
            if (mVar != null) {
                Object parent = mVar.getParent();
                Object obj = this.f14866u;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.M);
                }
            }
        } else {
            if (this.M == null) {
                this.M = new m(this, this.f14858b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.M.getParent();
            if (viewGroup3 != this.f14866u) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.M);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f14866u;
                m mVar2 = this.M;
                actionMenuView.getClass();
                q qVarJ = ActionMenuView.j();
                qVarJ.f14888a = true;
                actionMenuView.addView(mVar2, qVarJ);
            }
        }
        ((ActionMenuView) this.f14866u).setOverflowReserved(this.P);
    }

    @Override // l.a0
    public final void i(Context context, l.o oVar) {
        this.f14860e = context;
        LayoutInflater.from(context);
        this.f14861f = oVar;
        Resources resources = context.getResources();
        if (!this.Q) {
            this.P = true;
        }
        int i10 = 2;
        this.R = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.T = i10;
        int measuredWidth = this.R;
        if (this.P) {
            if (this.M == null) {
                m mVar = new m(this, this.f14858b);
                this.M = mVar;
                if (this.O) {
                    mVar.setImageDrawable(this.N);
                    this.N = null;
                    this.O = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.M.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.M.getMeasuredWidth();
        } else {
            this.M = null;
        }
        this.S = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // l.a0
    public final int j() {
        return this.f14867w;
    }

    @Override // l.a0
    public final boolean k() {
        ArrayList arrayListL;
        int size;
        int i10;
        boolean z7;
        l.o oVar = this.f14861f;
        if (oVar != null) {
            arrayListL = oVar.l();
            size = arrayListL.size();
        } else {
            arrayListL = null;
            size = 0;
        }
        int i11 = this.T;
        int i12 = this.S;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f14866u;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z7 = true;
            if (i13 >= size) {
                break;
            }
            l.q qVar = (l.q) arrayListL.get(i13);
            int i16 = qVar.f14408y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z10 = true;
            }
            if (this.U && qVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (this.P && (z10 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = this.V;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            l.q qVar2 = (l.q) arrayListL.get(i18);
            int i20 = qVar2.f14408y;
            boolean z11 = (i20 & 2) == i10;
            int i21 = qVar2.f14385b;
            if (z11) {
                View viewA = a(qVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z7);
                }
                qVar2.h(z7);
            } else if ((i20 & 1) == z7) {
                boolean z12 = sparseBooleanArray.get(i21);
                boolean z13 = (i17 > 0 || z12) && i12 > 0;
                if (z13) {
                    View viewA2 = a(qVar2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z13 &= i12 + i19 > 0;
                }
                if (z13 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z12) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        l.q qVar3 = (l.q) arrayListL.get(i22);
                        if (qVar3.f14385b == i21) {
                            if (qVar3.f()) {
                                i17++;
                            }
                            qVar3.h(false);
                        }
                    }
                }
                if (z13) {
                    i17--;
                }
                qVar2.h(z13);
            } else {
                qVar2.h(false);
                i18++;
                i10 = 2;
                z7 = true;
            }
            i18++;
            i10 = 2;
            z7 = true;
        }
        return true;
    }

    @Override // l.a0
    public final Parcelable l() {
        n nVar = new n();
        nVar.f14851b = this.f14859b0;
        return nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.a0
    public final boolean m(l.g0 g0Var) {
        boolean z7;
        if (!g0Var.hasVisibleItems()) {
            return false;
        }
        l.g0 g0Var2 = g0Var;
        while (true) {
            l.o oVar = g0Var2.f14326z;
            if (oVar == this.f14861f) {
                break;
            }
            g0Var2 = (l.g0) oVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f14866u;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof l.b0) && ((l.b0) childAt).getItemData() == g0Var2.A) {
                    view = childAt;
                    break;
                }
                i10++;
            }
        }
        if (view == null) {
            return false;
        }
        this.f14859b0 = g0Var.A.f14384a;
        int size = g0Var.f14362f.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z7 = false;
                break;
            }
            MenuItem item = g0Var.getItem(i11);
            if (item.isVisible() && item.getIcon() != null) {
                z7 = true;
                break;
            }
            i11++;
        }
        i iVar = new i(this, this.f14860e, g0Var, view);
        this.X = iVar;
        iVar.f14429h = z7;
        l.w wVar = iVar.f14431j;
        if (wVar != null) {
            wVar.r(z7);
        }
        i iVar2 = this.X;
        if (!iVar2.b()) {
            if (iVar2.f14427f == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            iVar2.d(0, 0, false, false);
        }
        l.z zVar = this.f14863m;
        if (zVar != null) {
            zVar.l(g0Var);
        }
        return true;
    }

    @Override // l.a0
    public final /* bridge */ /* synthetic */ boolean n(l.q qVar) {
        return false;
    }

    public final boolean o() {
        l.o oVar;
        int i10 = 0;
        if (this.P && !e() && (oVar = this.f14861f) != null && this.f14866u != null && this.Y == null) {
            oVar.i();
            if (!oVar.f14366j.isEmpty()) {
                k kVar = new k(i10, this, new i(this, this.f14860e, this.f14861f, this.M));
                this.Y = kVar;
                ((View) this.f14866u).post(kVar);
                return true;
            }
        }
        return false;
    }
}