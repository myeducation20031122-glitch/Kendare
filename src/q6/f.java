package q6;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import java.util.WeakHashMap;
import l.c0;
import l.o;
import l.q;
import o0.c1;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class f extends ViewGroup implements c0 {

    /* renamed from: l0, reason: collision with root package name */
    public static final int[] f16279l0 = {R.attr.state_checked};

    /* renamed from: m0, reason: collision with root package name */
    public static final int[] f16280m0 = {-16842910};
    public int M;
    public ColorStateList N;
    public final ColorStateList O;
    public int P;
    public int Q;
    public boolean R;
    public Drawable S;
    public ColorStateList T;
    public int U;
    public final SparseArray V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public int f16281a0;

    /* renamed from: b, reason: collision with root package name */
    public final t1.a f16282b;

    /* renamed from: b0, reason: collision with root package name */
    public int f16283b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f16284c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f16285d0;

    /* renamed from: e, reason: collision with root package name */
    public final g.d f16286e;

    /* renamed from: e0, reason: collision with root package name */
    public int f16287e0;

    /* renamed from: f, reason: collision with root package name */
    public final n0.d f16288f;

    /* renamed from: f0, reason: collision with root package name */
    public int f16289f0;

    /* renamed from: g0, reason: collision with root package name */
    public v6.j f16290g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f16291h0;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f16292i0;

    /* renamed from: j, reason: collision with root package name */
    public final SparseArray f16293j;

    /* renamed from: j0, reason: collision with root package name */
    public h f16294j0;

    /* renamed from: k0, reason: collision with root package name */
    public o f16295k0;

    /* renamed from: m, reason: collision with root package name */
    public int f16296m;

    /* renamed from: n, reason: collision with root package name */
    public d[] f16297n;

    /* renamed from: t, reason: collision with root package name */
    public int f16298t;

    /* renamed from: u, reason: collision with root package name */
    public int f16299u;

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f16300w;

    public f(Context context) {
        super(context);
        this.f16288f = new n0.d(5);
        this.f16293j = new SparseArray(5);
        this.f16298t = 0;
        this.f16299u = 0;
        this.V = new SparseArray(5);
        this.W = -1;
        this.f16281a0 = -1;
        this.f16283b0 = -1;
        this.f16291h0 = false;
        this.O = c();
        if (isInEditMode()) {
            this.f16282b = null;
        } else {
            t1.a aVar = new t1.a();
            this.f16282b = aVar;
            aVar.P(0);
            aVar.E(j4.L(getContext(), 2130903922, getResources().getInteger(2131361831)));
            aVar.G(j4.M(getContext(), 2130903935, z5.a.f19747b));
            aVar.M(new p6.l());
        }
        this.f16286e = new g.d(this, 4);
        WeakHashMap weakHashMap = c1.f15515a;
        setImportantForAccessibility(1);
    }

    private d getNewItem() {
        d dVar = (d) this.f16288f.j();
        return dVar == null ? new e6.a(getContext()) : dVar;
    }

    private void setBadgeIfNeeded(d dVar) {
        b6.a aVar;
        int id = dVar.getId();
        if (id == -1 || (aVar = (b6.a) this.V.get(id)) == null) {
            return;
        }
        dVar.setBadge(aVar);
    }

    @Override // l.c0
    public final void a(o oVar) {
        this.f16295k0 = oVar;
    }

    public final void b() throws Resources.NotFoundException {
        removeAllViews();
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    this.f16288f.d(dVar);
                    dVar.i(dVar.Q);
                    dVar.W = null;
                    dVar.f16265f0 = 0.0f;
                    dVar.f16258b = false;
                }
            }
        }
        if (this.f16295k0.f14362f.size() == 0) {
            this.f16298t = 0;
            this.f16299u = 0;
            this.f16297n = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.f16295k0.f14362f.size(); i10++) {
            hashSet.add(Integer.valueOf(this.f16295k0.getItem(i10).getItemId()));
        }
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.V;
            if (i11 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i11++;
        }
        this.f16297n = new d[this.f16295k0.f14362f.size()];
        int i12 = this.f16296m;
        boolean z7 = i12 != -1 ? i12 == 0 : this.f16295k0.l().size() > 3;
        for (int i13 = 0; i13 < this.f16295k0.f14362f.size(); i13++) {
            this.f16294j0.f16304e = true;
            this.f16295k0.getItem(i13).setCheckable(true);
            this.f16294j0.f16304e = false;
            d newItem = getNewItem();
            this.f16297n[i13] = newItem;
            newItem.setIconTintList(this.f16300w);
            newItem.setIconSize(this.M);
            newItem.setTextColor(this.O);
            newItem.setTextAppearanceInactive(this.P);
            newItem.setTextAppearanceActive(this.Q);
            newItem.setTextAppearanceActiveBoldEnabled(this.R);
            newItem.setTextColor(this.N);
            int i14 = this.W;
            if (i14 != -1) {
                newItem.setItemPaddingTop(i14);
            }
            int i15 = this.f16281a0;
            if (i15 != -1) {
                newItem.setItemPaddingBottom(i15);
            }
            int i16 = this.f16283b0;
            if (i16 != -1) {
                newItem.setActiveIndicatorLabelPadding(i16);
            }
            newItem.setActiveIndicatorWidth(this.f16285d0);
            newItem.setActiveIndicatorHeight(this.f16287e0);
            newItem.setActiveIndicatorMarginHorizontal(this.f16289f0);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.f16291h0);
            newItem.setActiveIndicatorEnabled(this.f16284c0);
            Drawable drawable = this.S;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.U);
            }
            newItem.setItemRippleColor(this.T);
            newItem.setShifting(z7);
            newItem.setLabelVisibilityMode(this.f16296m);
            q qVar = (q) this.f16295k0.getItem(i13);
            newItem.b(qVar);
            newItem.setItemPosition(i13);
            SparseArray sparseArray2 = this.f16293j;
            int i17 = qVar.f14384a;
            newItem.setOnTouchListener((View.OnTouchListener) sparseArray2.get(i17));
            newItem.setOnClickListener(this.f16286e);
            int i18 = this.f16298t;
            if (i18 != 0 && i17 == i18) {
                this.f16299u = i13;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.f16295k0.f14362f.size() - 1, this.f16299u);
        this.f16299u = iMin;
        this.f16295k0.getItem(iMin).setChecked(true);
    }

    public final ColorStateList c() throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListC = f0.f.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(2130903342, typedValue, true)) {
            return null;
        }
        int i10 = typedValue.data;
        int defaultColor = colorStateListC.getDefaultColor();
        int[] iArr = f16280m0;
        return new ColorStateList(new int[][]{iArr, f16279l0, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListC.getColorForState(iArr, defaultColor), i10, defaultColor});
    }

    public final v6.g d() {
        if (this.f16290g0 == null || this.f16292i0 == null) {
            return null;
        }
        v6.g gVar = new v6.g(this.f16290g0);
        gVar.l(this.f16292i0);
        return gVar;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f16283b0;
    }

    public SparseArray<b6.a> getBadgeDrawables() {
        return this.V;
    }

    public ColorStateList getIconTintList() {
        return this.f16300w;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f16292i0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f16284c0;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f16287e0;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f16289f0;
    }

    public v6.j getItemActiveIndicatorShapeAppearance() {
        return this.f16290g0;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f16285d0;
    }

    public Drawable getItemBackground() {
        d[] dVarArr = this.f16297n;
        return (dVarArr == null || dVarArr.length <= 0) ? this.S : dVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.U;
    }

    public int getItemIconSize() {
        return this.M;
    }

    public int getItemPaddingBottom() {
        return this.f16281a0;
    }

    public int getItemPaddingTop() {
        return this.W;
    }

    public ColorStateList getItemRippleColor() {
        return this.T;
    }

    public int getItemTextAppearanceActive() {
        return this.Q;
    }

    public int getItemTextAppearanceInactive() {
        return this.P;
    }

    public ColorStateList getItemTextColor() {
        return this.N;
    }

    public int getLabelVisibilityMode() {
        return this.f16296m;
    }

    public o getMenu() {
        return this.f16295k0;
    }

    public int getSelectedItemId() {
        return this.f16298t;
    }

    public int getSelectedItemPosition() {
        return this.f16299u;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f16295k0.l().size(), false, 1));
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f16283b0 = i10;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorLabelPadding(i10);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f16300w = colorStateList;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f16292i0 = colorStateList;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z7) {
        this.f16284c0 = z7;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorEnabled(z7);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f16287e0 = i10;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorHeight(i10);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f16289f0 = i10;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorMarginHorizontal(i10);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z7) {
        this.f16291h0 = z7;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorResizeable(z7);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(v6.j jVar) {
        this.f16290g0 = jVar;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f16285d0 = i10;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorWidth(i10);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.S = drawable;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.U = i10;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setItemBackground(i10);
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.M = i10;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setIconSize(i10);
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.f16281a0 = i10;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setItemPaddingBottom(i10);
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.W = i10;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setItemPaddingTop(i10);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.T = colorStateList;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) throws Resources.NotFoundException {
        this.Q = i10;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setTextAppearanceActive(i10);
                ColorStateList colorStateList = this.N;
                if (colorStateList != null) {
                    dVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z7) throws Resources.NotFoundException {
        this.R = z7;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setTextAppearanceActiveBoldEnabled(z7);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) throws Resources.NotFoundException {
        this.P = i10;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setTextAppearanceInactive(i10);
                ColorStateList colorStateList = this.N;
                if (colorStateList != null) {
                    dVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.N = colorStateList;
        d[] dVarArr = this.f16297n;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f16296m = i10;
    }

    public void setPresenter(h hVar) {
        this.f16294j0 = hVar;
    }
}