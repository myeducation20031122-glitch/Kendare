package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v0 extends Spinner {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f14954w = {R.attr.spinnerMode};

    /* renamed from: b, reason: collision with root package name */
    public final t f14955b;

    /* renamed from: e, reason: collision with root package name */
    public final Context f14956e;

    /* renamed from: f, reason: collision with root package name */
    public final l f14957f;

    /* renamed from: j, reason: collision with root package name */
    public SpinnerAdapter f14958j;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f14959m;

    /* renamed from: n, reason: collision with root package name */
    public final u0 f14960n;

    /* renamed from: t, reason: collision with root package name */
    public int f14961t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f14962u;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v0(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, 2130904129);
        this.f14962u = new Rect();
        d3.a(getContext(), this);
        int[] iArr = f.a.f12644u;
        g.e eVar = new g.e(context, context.obtainStyledAttributes(attributeSet, iArr, 2130904129, 0));
        this.f14955b = new t(this);
        int iB = eVar.B(4, 0);
        if (iB != 0) {
            this.f14956e = new k.d(context, iB);
        } else {
            this.f14956e = context;
        }
        int i10 = -1;
        TypedArray typedArray = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f14954w, 2130904129, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i10 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e10) {
                    e = e10;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                    int i11 = 1;
                    if (i10 != 0) {
                    }
                    textArray = ((TypedArray) eVar.f12764f).getTextArray(0);
                    if (textArray != null) {
                    }
                    eVar.L();
                    this.f14959m = true;
                    spinnerAdapter = this.f14958j;
                    if (spinnerAdapter != null) {
                    }
                    this.f14955b.e(attributeSet, 2130904129);
                }
            } catch (Throwable th) {
                th = th;
                typedArray = typedArrayObtainStyledAttributes;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray != null) {
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        int i112 = 1;
        if (i10 != 0) {
            o0 o0Var = new o0(this);
            this.f14960n = o0Var;
            o0Var.f14871j = eVar.C(2);
        } else if (i10 == 1) {
            s0 s0Var = new s0(this, this.f14956e, attributeSet);
            g.e eVarI = g.e.I(this.f14956e, attributeSet, iArr, 2130904129);
            this.f14961t = ((TypedArray) eVarI.f12764f).getLayoutDimension(3, -2);
            s0Var.g(eVarI.u(1));
            s0Var.f14921g0 = eVar.C(2);
            eVarI.L();
            this.f14960n = s0Var;
            this.f14957f = new l(this, this, s0Var, i112);
        }
        textArray = ((TypedArray) eVar.f12764f).getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(2131493040);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        eVar.L();
        this.f14959m = true;
        spinnerAdapter = this.f14958j;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f14958j = null;
        }
        this.f14955b.e(attributeSet, 2130904129);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f14962u;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f14955b;
        if (tVar != null) {
            tVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        u0 u0Var = this.f14960n;
        return u0Var != null ? u0Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        u0 u0Var = this.f14960n;
        return u0Var != null ? u0Var.l() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f14960n != null ? this.f14961t : super.getDropDownWidth();
    }

    public final u0 getInternalPopup() {
        return this.f14960n;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        u0 u0Var = this.f14960n;
        return u0Var != null ? u0Var.d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f14956e;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        u0 u0Var = this.f14960n;
        return u0Var != null ? u0Var.n() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        t tVar = this.f14955b;
        if (tVar != null) {
            return tVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t tVar = this.f14955b;
        if (tVar != null) {
            return tVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u0 u0Var = this.f14960n;
        if (u0Var == null || !u0Var.a()) {
            return;
        }
        u0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f14960n == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        t0 t0Var = (t0) parcelable;
        super.onRestoreInstanceState(t0Var.getSuperState());
        if (!t0Var.f14941b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new l.e(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        t0 t0Var = new t0(super.onSaveInstanceState());
        u0 u0Var = this.f14960n;
        t0Var.f14941b = u0Var != null && u0Var.a();
        return t0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l lVar = this.f14957f;
        if (lVar == null || !lVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        u0 u0Var = this.f14960n;
        if (u0Var == null) {
            return super.performClick();
        }
        if (u0Var.a()) {
            return true;
        }
        this.f14960n.k(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t tVar = this.f14955b;
        if (tVar != null) {
            tVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        t tVar = this.f14955b;
        if (tVar != null) {
            tVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        u0 u0Var = this.f14960n;
        if (u0Var == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            u0Var.i(i10);
            u0Var.j(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        u0 u0Var = this.f14960n;
        if (u0Var != null) {
            u0Var.h(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f14960n != null) {
            this.f14961t = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        u0 u0Var = this.f14960n;
        if (u0Var != null) {
            u0Var.g(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(com.bumptech.glide.c.c(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        u0 u0Var = this.f14960n;
        if (u0Var != null) {
            u0Var.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t tVar = this.f14955b;
        if (tVar != null) {
            tVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t tVar = this.f14955b;
        if (tVar != null) {
            tVar.j(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f14959m) {
            this.f14958j = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        u0 u0Var = this.f14960n;
        if (u0Var != null) {
            Context context = this.f14956e;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            q0 q0Var = new q0();
            q0Var.f14894a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                q0Var.f14895b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && p0.w(spinnerAdapter)) {
                n0.a(p0.h(spinnerAdapter), theme);
            }
            u0Var.o(q0Var);
        }
    }
}