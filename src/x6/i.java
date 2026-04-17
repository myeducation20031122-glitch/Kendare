package x6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import fc.t;
import java.util.WeakHashMap;
import o0.c1;
import o0.o0;
import o0.q0;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class i extends FrameLayout {
    public static final h O = new h();
    public Rect M;
    public boolean N;

    /* renamed from: b, reason: collision with root package name */
    public j f19048b;

    /* renamed from: e, reason: collision with root package name */
    public final v6.j f19049e;

    /* renamed from: f, reason: collision with root package name */
    public int f19050f;

    /* renamed from: j, reason: collision with root package name */
    public final float f19051j;

    /* renamed from: m, reason: collision with root package name */
    public final float f19052m;

    /* renamed from: n, reason: collision with root package name */
    public final int f19053n;

    /* renamed from: t, reason: collision with root package name */
    public final int f19054t;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f19055u;

    /* renamed from: w, reason: collision with root package name */
    public PorterDuff.Mode f19056w;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        Drawable drawableP;
        super(a7.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, y5.a.D);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = c1.f15515a;
            q0.s(this, dimensionPixelSize);
        }
        this.f19050f = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f19049e = v6.j.b(context2, attributeSet, 0, 0).a();
        }
        this.f19051j = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(j4.m(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(com.bumptech.glide.f.o(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f19052m = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f19053n = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f19054t = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(O);
        setFocusable(true);
        if (getBackground() == null) {
            int iF = j4.F(j4.l(this, 2130903356), getBackgroundOverlayColorAlpha(), j4.l(this, 2130903333));
            v6.j jVar = this.f19049e;
            if (jVar != null) {
                d1.b bVar = j.f19057u;
                v6.g gVar = new v6.g(jVar);
                gVar.l(ColorStateList.valueOf(iF));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                d1.b bVar2 = j.f19057u;
                float dimension = resources.getDimension(2131100416);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iF);
                gradientDrawable = gradientDrawable2;
            }
            if (this.f19055u != null) {
                drawableP = t.P(gradientDrawable);
                i0.a.h(drawableP, this.f19055u);
            } else {
                drawableP = t.P(gradientDrawable);
            }
            WeakHashMap weakHashMap2 = c1.f15515a;
            setBackground(drawableP);
        }
    }

    private void setBaseTransientBottomBar(j jVar) {
        this.f19048b = jVar;
    }

    public float getActionTextColorAlpha() {
        return this.f19052m;
    }

    public int getAnimationMode() {
        return this.f19050f;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f19051j;
    }

    public int getMaxInlineActionWidth() {
        return this.f19054t;
    }

    public int getMaxWidth() {
        return this.f19053n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j jVar = this.f19048b;
        if (jVar != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                WindowInsets rootWindowInsets = jVar.f19071i.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    jVar.f19078p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                    jVar.e();
                }
            } else {
                jVar.getClass();
            }
        }
        WeakHashMap weakHashMap = c1.f15515a;
        o0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i10;
        boolean z7;
        n nVar;
        super.onDetachedFromWindow();
        j jVar = this.f19048b;
        if (jVar != null) {
            o oVarB = o.b();
            g gVar = jVar.f19082t;
            synchronized (oVarB.f19090a) {
                i10 = 1;
                z7 = oVarB.c(gVar) || !((nVar = oVarB.f19093d) == null || gVar == null || nVar.f19086a.get() != gVar);
            }
            if (z7) {
                j.f19060x.post(new f(jVar, i10));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i10, int i11, int i12, int i13) {
        super.onLayout(z7, i10, i11, i12, i13);
        j jVar = this.f19048b;
        if (jVar == null || !jVar.f19080r) {
            return;
        }
        jVar.d();
        jVar.f19080r = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f19053n;
        if (i12 <= 0 || getMeasuredWidth() <= i12) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
    }

    public void setAnimationMode(int i10) {
        this.f19050f = i10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f19055u != null) {
            drawable = t.P(drawable.mutate());
            i0.a.h(drawable, this.f19055u);
            i0.a.i(drawable, this.f19056w);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f19055u = colorStateList;
        if (getBackground() != null) {
            Drawable drawableP = t.P(getBackground().mutate());
            i0.a.h(drawableP, colorStateList);
            i0.a.i(drawableP, this.f19056w);
            if (drawableP != getBackground()) {
                super.setBackgroundDrawable(drawableP);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f19056w = mode;
        if (getBackground() != null) {
            Drawable drawableP = t.P(getBackground().mutate());
            i0.a.i(drawableP, mode);
            if (drawableP != getBackground()) {
                super.setBackgroundDrawable(drawableP);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.N || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.M = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        j jVar = this.f19048b;
        if (jVar != null) {
            d1.b bVar = j.f19057u;
            jVar.e();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : O);
        super.setOnClickListener(onClickListener);
    }
}