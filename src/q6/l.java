package q6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.dq0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import l.a0;
import l.c0;
import o0.c1;
import p5.m;
import p6.n;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class l extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f16307n = 0;

    /* renamed from: b, reason: collision with root package name */
    public final e f16308b;

    /* renamed from: e, reason: collision with root package name */
    public final e6.b f16309e;

    /* renamed from: f, reason: collision with root package name */
    public final h f16310f;

    /* renamed from: j, reason: collision with root package name */
    public k.i f16311j;

    /* renamed from: m, reason: collision with root package name */
    public j f16312m;

    public l(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(a7.a.a(context, attributeSet, 2130903178, 2131952570), attributeSet, 2130903178);
        h hVar = new h();
        hVar.f16304e = false;
        this.f16310f = hVar;
        Context context2 = getContext();
        g.e eVarF = n.f(context2, attributeSet, y5.a.f19288y, 2130903178, 2131952570, 12, 10);
        e eVar = new e(context2, getClass(), getMaxItemCount());
        this.f16308b = eVar;
        e6.b bVar = new e6.b(context2);
        this.f16309e = bVar;
        hVar.f16303b = bVar;
        hVar.f16305f = 1;
        bVar.setPresenter(hVar);
        eVar.b(hVar, eVar.f14357a);
        getContext();
        hVar.f16303b.f16295k0 = eVar;
        bVar.setIconTintList(eVarF.F(6) ? eVarF.r(6) : bVar.c());
        setItemIconSize(eVarF.t(5, getResources().getDimensionPixelSize(2131100370)));
        if (eVarF.F(12)) {
            setItemTextAppearanceInactive(eVarF.B(12, 0));
        }
        if (eVarF.F(10)) {
            setItemTextAppearanceActive(eVarF.B(10, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(eVarF.q(11, true));
        if (eVarF.F(13)) {
            setItemTextColor(eVarF.r(13));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListI = dq0.i(background);
        if (background == null || colorStateListI != null) {
            v6.g gVar = new v6.g(v6.j.b(context2, attributeSet, 2130903178, 2131952570).a());
            if (colorStateListI != null) {
                gVar.l(colorStateListI);
            }
            gVar.j(context2);
            WeakHashMap weakHashMap = c1.f15515a;
            setBackground(gVar);
        }
        if (eVarF.F(8)) {
            setItemPaddingTop(eVarF.t(8, 0));
        }
        if (eVarF.F(7)) {
            setItemPaddingBottom(eVarF.t(7, 0));
        }
        if (eVarF.F(0)) {
            setActiveIndicatorLabelPadding(eVarF.t(0, 0));
        }
        if (eVarF.F(2)) {
            setElevation(eVarF.t(2, 0));
        }
        i0.a.h(getBackground().mutate(), j4.n(context2, eVarF, 1));
        setLabelVisibilityMode(((TypedArray) eVarF.f12764f).getInteger(14, -1));
        int iB = eVarF.B(4, 0);
        if (iB != 0) {
            bVar.setItemBackgroundRes(iB);
        } else {
            setItemRippleColor(j4.n(context2, eVarF, 9));
        }
        int iB2 = eVarF.B(3, 0);
        if (iB2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iB2, y5.a.f19287x);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(j4.m(context2, typedArrayObtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(v6.j.a(context2, typedArrayObtainStyledAttributes.getResourceId(4, 0), 0, new v6.a(0)).a());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (eVarF.F(15)) {
            int iB3 = eVarF.B(15, 0);
            hVar.f16304e = true;
            getMenuInflater().inflate(iB3, eVar);
            hVar.f16304e = false;
            hVar.h(true);
        }
        eVarF.L();
        addView(bVar);
        eVar.f14361e = new m(this, 8);
    }

    private MenuInflater getMenuInflater() {
        if (this.f16311j == null) {
            this.f16311j = new k.i(getContext());
        }
        return this.f16311j;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f16309e.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f16309e.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f16309e.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f16309e.getItemActiveIndicatorMarginHorizontal();
    }

    public v6.j getItemActiveIndicatorShapeAppearance() {
        return this.f16309e.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f16309e.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f16309e.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f16309e.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f16309e.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f16309e.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f16309e.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f16309e.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f16309e.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f16309e.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f16309e.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f16309e.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f16309e.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f16308b;
    }

    public c0 getMenuView() {
        return this.f16309e;
    }

    public h getPresenter() {
        return this.f16310f;
    }

    public int getSelectedItemId() {
        return this.f16309e.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof v6.g) {
            j4.N(this, (v6.g) background);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.f18520b);
        Bundle bundle = kVar.f16306f;
        e eVar = this.f16308b;
        eVar.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = eVar.f14377u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                a0 a0Var = (a0) weakReference.get();
                if (a0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int iJ = a0Var.j();
                    if (iJ > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(iJ)) != null) {
                        a0Var.b(parcelable2);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableL;
        k kVar = new k(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        kVar.f16306f = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16308b.f14377u;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                a0 a0Var = (a0) weakReference.get();
                if (a0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int iJ = a0Var.j();
                    if (iJ > 0 && (parcelableL = a0Var.l()) != null) {
                        sparseArray.put(iJ, parcelableL);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return kVar;
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f16309e.setActiveIndicatorLabelPadding(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof v6.g) {
            ((v6.g) background).k(f10);
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f16309e.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z7) {
        this.f16309e.setItemActiveIndicatorEnabled(z7);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f16309e.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f16309e.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(v6.j jVar) {
        this.f16309e.setItemActiveIndicatorShapeAppearance(jVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f16309e.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f16309e.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        this.f16309e.setItemBackgroundRes(i10);
    }

    public void setItemIconSize(int i10) {
        this.f16309e.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f16309e.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i10) {
        this.f16309e.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f16309e.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f16309e.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i10) throws Resources.NotFoundException {
        this.f16309e.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z7) throws Resources.NotFoundException {
        this.f16309e.setItemTextAppearanceActiveBoldEnabled(z7);
    }

    public void setItemTextAppearanceInactive(int i10) throws Resources.NotFoundException {
        this.f16309e.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f16309e.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i10) throws Resources.NotFoundException {
        e6.b bVar = this.f16309e;
        if (bVar.getLabelVisibilityMode() != i10) {
            bVar.setLabelVisibilityMode(i10);
            this.f16310f.h(false);
        }
    }

    public void setOnItemReselectedListener(i iVar) {
    }

    public void setOnItemSelectedListener(j jVar) {
        this.f16312m = jVar;
    }

    public void setSelectedItemId(int i10) {
        e eVar = this.f16308b;
        MenuItem menuItemFindItem = eVar.findItem(i10);
        if (menuItemFindItem == null || eVar.q(menuItemFindItem, this.f16310f, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }
}