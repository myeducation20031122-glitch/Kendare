package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.google.android.gms.internal.ads.ic1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class h1 extends TextView implements u0.t {

    /* renamed from: b, reason: collision with root package name */
    public final t f14785b;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f14786e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.n3 f14787f;

    /* renamed from: j, reason: collision with root package name */
    public a0 f14788j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14789m;

    /* renamed from: n, reason: collision with root package name */
    public p8.c f14790n;

    /* renamed from: t, reason: collision with root package name */
    public Future f14791t;

    public h1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private a0 getEmojiTextViewHelper() {
        if (this.f14788j == null) {
            this.f14788j = new a0(this);
        }
        return this.f14788j;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f14785b;
        if (tVar != null) {
            tVar.a();
        }
        d1 d1Var = this.f14786e;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (w3.f14986c) {
            return super.getAutoSizeMaxTextSize();
        }
        d1 d1Var = this.f14786e;
        if (d1Var != null) {
            return Math.round(d1Var.f14745i.f14828e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (w3.f14986c) {
            return super.getAutoSizeMinTextSize();
        }
        d1 d1Var = this.f14786e;
        if (d1Var != null) {
            return Math.round(d1Var.f14745i.f14827d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (w3.f14986c) {
            return super.getAutoSizeStepGranularity();
        }
        d1 d1Var = this.f14786e;
        if (d1Var != null) {
            return Math.round(d1Var.f14745i.f14826c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (w3.f14986c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        d1 d1Var = this.f14786e;
        return d1Var != null ? d1Var.f14745i.f14829f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (w3.f14986c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        d1 d1Var = this.f14786e;
        if (d1Var != null) {
            return d1Var.f14745i.f14824a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o5.u.o(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public e1 getSuperCaller() {
        p8.c cVar;
        if (this.f14790n == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                cVar = new g1(this);
            } else if (i10 >= 28) {
                cVar = new f1(this);
            } else if (i10 >= 26) {
                cVar = new p8.c(this, 4);
            }
            this.f14790n = cVar;
        }
        return this.f14790n;
    }

    public ColorStateList getSupportBackgroundTintList() {
        t tVar = this.f14785b;
        if (tVar != null) {
            return tVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t tVar = this.f14785b;
        if (tVar != null) {
            return tVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14786e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14786e.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        com.google.android.gms.internal.measurement.n3 n3Var;
        if (Build.VERSION.SDK_INT >= 28 || (n3Var = this.f14787f) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) n3Var.f10910f;
        return textClassifier == null ? w0.a((TextView) n3Var.f10909e) : textClassifier;
    }

    public m0.f getTextMetricsParamsCompat() {
        return o5.u.i(this);
    }

    public final void m() {
        Future future = this.f14791t;
        if (future == null) {
            return;
        }
        try {
            this.f14791t = null;
            ic1.v(future.get());
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            o5.u.i(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f14786e.getClass();
        d1.h(this, inputConnectionOnCreateInputConnection, editorInfo);
        o5.y.t(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z7, int i10, int i11, int i12, int i13) {
        super.onLayout(z7, i10, i11, i12, i13);
        d1 d1Var = this.f14786e;
        if (d1Var == null || w3.f14986c) {
            return;
        }
        d1Var.f14745i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        m();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        d1 d1Var = this.f14786e;
        if (d1Var == null || w3.f14986c) {
            return;
        }
        m1 m1Var = d1Var.f14745i;
        if (m1Var.f()) {
            m1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().c(z7);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (w3.f14986c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        d1 d1Var = this.f14786e;
        if (d1Var != null) {
            d1Var.i(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (w3.f14986c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        d1 d1Var = this.f14786e;
        if (d1Var != null) {
            d1Var.j(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (w3.f14986c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        d1 d1Var = this.f14786e;
        if (d1Var != null) {
            d1Var.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t tVar = this.f14785b;
        if (tVar != null) {
            tVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        t tVar = this.f14785b;
        if (tVar != null) {
            tVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f14786e;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f14786e;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? com.bumptech.glide.c.c(context, i10) : null, i11 != 0 ? com.bumptech.glide.c.c(context, i11) : null, i12 != 0 ? com.bumptech.glide.c.c(context, i12) : null, i13 != 0 ? com.bumptech.glide.c.c(context, i13) : null);
        d1 d1Var = this.f14786e;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? com.bumptech.glide.c.c(context, i10) : null, i11 != 0 ? com.bumptech.glide.c.c(context, i11) : null, i12 != 0 ? com.bumptech.glide.c.c(context, i12) : null, i13 != 0 ? com.bumptech.glide.c.c(context, i13) : null);
        d1 d1Var = this.f14786e;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o5.u.p(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().d(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i10);
        } else {
            o5.u.k(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            o5.u.l(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        o5.u.m(this, i10);
    }

    public void setPrecomputedText(m0.g gVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        o5.u.i(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t tVar = this.f14785b;
        if (tVar != null) {
            tVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t tVar = this.f14785b;
        if (tVar != null) {
            tVar.j(mode);
        }
    }

    @Override // u0.t
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        d1 d1Var = this.f14786e;
        d1Var.l(colorStateList);
        d1Var.b();
    }

    @Override // u0.t
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        d1 d1Var = this.f14786e;
        d1Var.m(mode);
        d1Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        d1 d1Var = this.f14786e;
        if (d1Var != null) {
            d1Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        com.google.android.gms.internal.measurement.n3 n3Var;
        if (Build.VERSION.SDK_INT >= 28 || (n3Var = this.f14787f) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            n3Var.f10910f = textClassifier;
        }
    }

    public void setTextFuture(Future<m0.g> future) {
        this.f14791t = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(m0.f fVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = fVar.f15042b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        setTextDirection(i10);
        int i11 = Build.VERSION.SDK_INT;
        TextPaint textPaint = fVar.f15041a;
        if (i11 >= 23) {
            getPaint().set(textPaint);
            u0.m.e(this, fVar.f15043c);
            u0.m.h(this, fVar.f15044d);
        } else {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z7 = w3.f14986c;
        if (z7) {
            super.setTextSize(i10, f10);
            return;
        }
        d1 d1Var = this.f14786e;
        if (d1Var == null || z7) {
            return;
        }
        m1 m1Var = d1Var.f14745i;
        if (m1Var.f()) {
            return;
        }
        m1Var.g(i10, f10);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typefaceCreate;
        if (this.f14789m) {
            return;
        }
        if (typeface == null || i10 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            g.v0 v0Var = h0.h.f13153a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i10);
        }
        this.f14789m = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f14789m = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e3.a(context);
        this.f14789m = false;
        this.f14790n = null;
        d3.a(getContext(), this);
        t tVar = new t(this);
        this.f14785b = tVar;
        tVar.e(attributeSet, i10);
        d1 d1Var = new d1(this);
        this.f14786e = d1Var;
        d1Var.f(attributeSet, i10);
        d1Var.b();
        this.f14787f = new com.google.android.gms.internal.measurement.n3(this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f14786e;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f14786e;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i10, float f10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            getSuperCaller().h(i10, f10);
        } else if (i11 >= 34) {
            u0.p.a(this, i10, f10);
        } else {
            o5.u.m(this, Math.round(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics())));
        }
    }
}