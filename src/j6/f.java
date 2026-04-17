package j6;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import fc.t;
import i0.h;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p6.i;
import p6.j;
import q3.l;
import v6.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends g implements Drawable.Callback, i {

    /* renamed from: k1, reason: collision with root package name */
    public static final int[] f13802k1 = {R.attr.state_enabled};

    /* renamed from: l1, reason: collision with root package name */
    public static final ShapeDrawable f13803l1 = new ShapeDrawable(new OvalShape());
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public float E0;
    public float F0;
    public float G0;
    public float H0;
    public final Context I0;
    public final Paint J0;
    public final Paint.FontMetrics K0;
    public final RectF L0;
    public final PointF M0;
    public final Path N0;
    public final j O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public boolean V0;
    public int W0;
    public int X0;
    public ColorFilter Y0;
    public PorterDuffColorFilter Z0;

    /* renamed from: a1, reason: collision with root package name */
    public ColorStateList f13804a1;

    /* renamed from: b0, reason: collision with root package name */
    public ColorStateList f13805b0;

    /* renamed from: b1, reason: collision with root package name */
    public PorterDuff.Mode f13806b1;

    /* renamed from: c0, reason: collision with root package name */
    public ColorStateList f13807c0;

    /* renamed from: c1, reason: collision with root package name */
    public int[] f13808c1;

    /* renamed from: d0, reason: collision with root package name */
    public float f13809d0;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f13810d1;

    /* renamed from: e0, reason: collision with root package name */
    public float f13811e0;

    /* renamed from: e1, reason: collision with root package name */
    public ColorStateList f13812e1;

    /* renamed from: f0, reason: collision with root package name */
    public ColorStateList f13813f0;

    /* renamed from: f1, reason: collision with root package name */
    public WeakReference f13814f1;

    /* renamed from: g0, reason: collision with root package name */
    public float f13815g0;

    /* renamed from: g1, reason: collision with root package name */
    public TextUtils.TruncateAt f13816g1;

    /* renamed from: h0, reason: collision with root package name */
    public ColorStateList f13817h0;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f13818h1;

    /* renamed from: i0, reason: collision with root package name */
    public CharSequence f13819i0;

    /* renamed from: i1, reason: collision with root package name */
    public int f13820i1;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f13821j0;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f13822j1;

    /* renamed from: k0, reason: collision with root package name */
    public Drawable f13823k0;

    /* renamed from: l0, reason: collision with root package name */
    public ColorStateList f13824l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f13825m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f13826n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f13827o0;

    /* renamed from: p0, reason: collision with root package name */
    public Drawable f13828p0;

    /* renamed from: q0, reason: collision with root package name */
    public RippleDrawable f13829q0;

    /* renamed from: r0, reason: collision with root package name */
    public ColorStateList f13830r0;

    /* renamed from: s0, reason: collision with root package name */
    public float f13831s0;

    /* renamed from: t0, reason: collision with root package name */
    public SpannableStringBuilder f13832t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f13833u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f13834v0;

    /* renamed from: w0, reason: collision with root package name */
    public Drawable f13835w0;

    /* renamed from: x0, reason: collision with root package name */
    public ColorStateList f13836x0;

    /* renamed from: y0, reason: collision with root package name */
    public z5.b f13837y0;

    /* renamed from: z0, reason: collision with root package name */
    public z5.b f13838z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903273, 2131952786);
        this.f13811e0 = -1.0f;
        this.J0 = new Paint(1);
        this.K0 = new Paint.FontMetrics();
        this.L0 = new RectF();
        this.M0 = new PointF();
        this.N0 = new Path();
        this.X0 = 255;
        this.f13806b1 = PorterDuff.Mode.SRC_IN;
        this.f13814f1 = new WeakReference(null);
        j(context);
        this.I0 = context;
        j jVar = new j(this);
        this.O0 = jVar;
        this.f13819i0 = "";
        jVar.f16050a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f13802k1;
        setState(iArr);
        if (!Arrays.equals(this.f13808c1, iArr)) {
            this.f13808c1 = iArr;
            if (U()) {
                x(getState(), iArr);
            }
        }
        this.f13818h1 = true;
        int[] iArr2 = t6.d.f17730a;
        f13803l1.setTint(-1);
    }

    public static void V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean u(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean v(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f13836x0 != colorStateList) {
            this.f13836x0 = colorStateList;
            if (this.f13834v0 && (drawable = this.f13835w0) != null && this.f13833u0) {
                i0.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void B(boolean z7) {
        if (this.f13834v0 != z7) {
            boolean zS = S();
            this.f13834v0 = z7;
            boolean zS2 = S();
            if (zS != zS2) {
                if (zS2) {
                    p(this.f13835w0);
                } else {
                    V(this.f13835w0);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void C(float f10) {
        if (this.f13811e0 != f10) {
            this.f13811e0 = f10;
            l lVarE = this.f18440b.f18418a.e();
            lVarE.f16192e = new v6.a(f10);
            lVarE.f16193f = new v6.a(f10);
            lVarE.f16194g = new v6.a(f10);
            lVarE.f16195h = new v6.a(f10);
            setShapeAppearanceModel(lVarE.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f13823k0;
        if (drawable3 != 0) {
            boolean z7 = drawable3 instanceof h;
            drawable2 = drawable3;
            if (z7) {
                drawable2 = ((i0.i) ((h) drawable3)).f13223n;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fR = r();
            this.f13823k0 = drawable != null ? t.P(drawable).mutate() : null;
            float fR2 = r();
            V(drawable2);
            if (T()) {
                p(this.f13823k0);
            }
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void E(float f10) {
        if (this.f13825m0 != f10) {
            float fR = r();
            this.f13825m0 = f10;
            float fR2 = r();
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        this.f13826n0 = true;
        if (this.f13824l0 != colorStateList) {
            this.f13824l0 = colorStateList;
            if (T()) {
                i0.a.h(this.f13823k0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void G(boolean z7) {
        if (this.f13821j0 != z7) {
            boolean zT = T();
            this.f13821j0 = z7;
            boolean zT2 = T();
            if (zT != zT2) {
                if (zT2) {
                    p(this.f13823k0);
                } else {
                    V(this.f13823k0);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        if (this.f13813f0 != colorStateList) {
            this.f13813f0 = colorStateList;
            if (this.f13822j1) {
                v6.f fVar = this.f18440b;
                if (fVar.f18421d != colorStateList) {
                    fVar.f18421d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void I(float f10) {
        if (this.f13815g0 != f10) {
            this.f13815g0 = f10;
            this.J0.setStrokeWidth(f10);
            if (this.f13822j1) {
                this.f18440b.f18428k = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f13828p0;
        if (drawable3 != 0) {
            boolean z7 = drawable3 instanceof h;
            drawable2 = drawable3;
            if (z7) {
                drawable2 = ((i0.i) ((h) drawable3)).f13223n;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fS = s();
            this.f13828p0 = drawable != null ? t.P(drawable).mutate() : null;
            int[] iArr = t6.d.f17730a;
            this.f13829q0 = new RippleDrawable(t6.d.b(this.f13817h0), this.f13828p0, f13803l1);
            float fS2 = s();
            V(drawable2);
            if (U()) {
                p(this.f13828p0);
            }
            invalidateSelf();
            if (fS != fS2) {
                w();
            }
        }
    }

    public final void K(float f10) {
        if (this.G0 != f10) {
            this.G0 = f10;
            invalidateSelf();
            if (U()) {
                w();
            }
        }
    }

    public final void L(float f10) {
        if (this.f13831s0 != f10) {
            this.f13831s0 = f10;
            invalidateSelf();
            if (U()) {
                w();
            }
        }
    }

    public final void M(float f10) {
        if (this.F0 != f10) {
            this.F0 = f10;
            invalidateSelf();
            if (U()) {
                w();
            }
        }
    }

    public final void N(ColorStateList colorStateList) {
        if (this.f13830r0 != colorStateList) {
            this.f13830r0 = colorStateList;
            if (U()) {
                i0.a.h(this.f13828p0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void O(boolean z7) {
        if (this.f13827o0 != z7) {
            boolean zU = U();
            this.f13827o0 = z7;
            boolean zU2 = U();
            if (zU != zU2) {
                if (zU2) {
                    p(this.f13828p0);
                } else {
                    V(this.f13828p0);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void P(float f10) {
        if (this.C0 != f10) {
            float fR = r();
            this.C0 = f10;
            float fR2 = r();
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void Q(float f10) {
        if (this.B0 != f10) {
            float fR = r();
            this.B0 = f10;
            float fR2 = r();
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void R(ColorStateList colorStateList) {
        if (this.f13817h0 != colorStateList) {
            this.f13817h0 = colorStateList;
            this.f13812e1 = this.f13810d1 ? t6.d.b(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final boolean S() {
        return this.f13834v0 && this.f13835w0 != null && this.V0;
    }

    public final boolean T() {
        return this.f13821j0 && this.f13823k0 != null;
    }

    public final boolean U() {
        return this.f13827o0 && this.f13828p0 != null;
    }

    @Override // p6.i
    public final void a() {
        w();
        invalidateSelf();
    }

    @Override // v6.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        int iSaveLayerAlpha;
        int i11;
        RectF rectF;
        int i12;
        int i13;
        int iSave;
        float f10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i10 = this.X0) == 0) {
            return;
        }
        if (i10 < 255) {
            float f11 = bounds.left;
            float f12 = bounds.top;
            float f13 = bounds.right;
            float f14 = bounds.bottom;
            iSaveLayerAlpha = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f11, f12, f13, f14, i10) : canvas.saveLayerAlpha(f11, f12, f13, f14, i10, 31);
        } else {
            iSaveLayerAlpha = 0;
        }
        boolean z7 = this.f13822j1;
        Paint paint = this.J0;
        RectF rectF2 = this.L0;
        if (!z7) {
            paint.setColor(this.P0);
            paint.setStyle(Paint.Style.FILL);
            rectF2.set(bounds);
            canvas.drawRoundRect(rectF2, t(), t(), paint);
        }
        if (!this.f13822j1) {
            paint.setColor(this.Q0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.Y0;
            if (colorFilter == null) {
                colorFilter = this.Z0;
            }
            paint.setColorFilter(colorFilter);
            rectF2.set(bounds);
            canvas.drawRoundRect(rectF2, t(), t(), paint);
        }
        if (this.f13822j1) {
            super.draw(canvas);
        }
        if (this.f13815g0 > 0.0f && !this.f13822j1) {
            paint.setColor(this.S0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f13822j1) {
                ColorFilter colorFilter2 = this.Y0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.Z0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f15 = bounds.left;
            float f16 = this.f13815g0 / 2.0f;
            rectF2.set(f15 + f16, bounds.top + f16, bounds.right - f16, bounds.bottom - f16);
            float f17 = this.f13811e0 - (this.f13815g0 / 2.0f);
            canvas.drawRoundRect(rectF2, f17, f17, paint);
        }
        paint.setColor(this.T0);
        paint.setStyle(Paint.Style.FILL);
        rectF2.set(bounds);
        if (this.f13822j1) {
            RectF rectF3 = new RectF(bounds);
            Path path = this.N0;
            v6.l lVar = this.U;
            v6.f fVar = this.f18440b;
            lVar.a(fVar.f18418a, fVar.f18427j, rectF3, this.T, path);
            i11 = 0;
            f(canvas, paint, path, this.f18440b.f18418a, h());
        } else {
            canvas.drawRoundRect(rectF2, t(), t(), paint);
            i11 = 0;
        }
        if (T()) {
            q(bounds, rectF2);
            float f18 = rectF2.left;
            float f19 = rectF2.top;
            canvas.translate(f18, f19);
            this.f13823k0.setBounds(i11, i11, (int) rectF2.width(), (int) rectF2.height());
            this.f13823k0.draw(canvas);
            canvas.translate(-f18, -f19);
        }
        if (S()) {
            q(bounds, rectF2);
            float f20 = rectF2.left;
            float f21 = rectF2.top;
            canvas.translate(f20, f21);
            this.f13835w0.setBounds(i11, i11, (int) rectF2.width(), (int) rectF2.height());
            this.f13835w0.draw(canvas);
            canvas.translate(-f20, -f21);
        }
        if (!this.f13818h1 || this.f13819i0 == null) {
            rectF = rectF2;
            i12 = iSaveLayerAlpha;
            i13 = 255;
        } else {
            PointF pointF = this.M0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f13819i0;
            j jVar = this.O0;
            if (charSequence != null) {
                float fR = r() + this.A0 + this.D0;
                if (t.t(this) == 0) {
                    pointF.x = bounds.left + fR;
                } else {
                    pointF.x = bounds.right - fR;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = jVar.f16050a;
                Paint.FontMetrics fontMetrics = this.K0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF2.setEmpty();
            if (this.f13819i0 != null) {
                float fR2 = r() + this.A0 + this.D0;
                float fS = s() + this.H0 + this.E0;
                if (t.t(this) == 0) {
                    rectF2.left = bounds.left + fR2;
                    f10 = bounds.right - fS;
                } else {
                    rectF2.left = bounds.left + fS;
                    f10 = bounds.right - fR2;
                }
                rectF2.right = f10;
                rectF2.top = bounds.top;
                rectF2.bottom = bounds.bottom;
            }
            s6.d dVar = jVar.f16056g;
            TextPaint textPaint2 = jVar.f16050a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                jVar.f16056g.e(this.I0, textPaint2, jVar.f16051b);
            }
            textPaint2.setTextAlign(align);
            String string = this.f13819i0.toString();
            if (jVar.f16054e) {
                jVar.a(string);
            }
            boolean z10 = Math.round(jVar.f16052c) > Math.round(rectF2.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(rectF2);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f13819i0;
            if (z10 && this.f13816g1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF2.width(), this.f13816g1);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f22 = pointF.x;
            float f23 = pointF.y;
            i13 = 255;
            rectF = rectF2;
            i12 = iSaveLayerAlpha;
            canvas.drawText(charSequence2, 0, length, f22, f23, textPaint2);
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
        if (U()) {
            rectF.setEmpty();
            if (U()) {
                float f24 = this.H0 + this.G0;
                if (t.t(this) == 0) {
                    float f25 = bounds.right - f24;
                    rectF.right = f25;
                    rectF.left = f25 - this.f13831s0;
                } else {
                    float f26 = bounds.left + f24;
                    rectF.left = f26;
                    rectF.right = f26 + this.f13831s0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f27 = this.f13831s0;
                float f28 = fExactCenterY - (f27 / 2.0f);
                rectF.top = f28;
                rectF.bottom = f28 + f27;
            }
            float f29 = rectF.left;
            float f30 = rectF.top;
            canvas.translate(f29, f30);
            this.f13828p0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = t6.d.f17730a;
            this.f13829q0.setBounds(this.f13828p0.getBounds());
            this.f13829q0.jumpToCurrentState();
            this.f13829q0.draw(canvas);
            canvas.translate(-f29, -f30);
        }
        if (this.X0 < i13) {
            canvas.restoreToCount(i12);
        }
    }

    @Override // v6.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.X0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.Y0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f13809d0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float fR = r() + this.A0 + this.D0;
        String string = this.f13819i0.toString();
        j jVar = this.O0;
        if (jVar.f16054e) {
            jVar.a(string);
        }
        return Math.min(Math.round(s() + jVar.f16052c + fR + this.E0 + this.H0), this.f13820i1);
    }

    @Override // v6.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // v6.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f13822j1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f13809d0, this.f13811e0);
        } else {
            outline.setRoundRect(bounds, this.f13811e0);
        }
        outline.setAlpha(this.X0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // v6.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        s6.d dVar;
        ColorStateList colorStateList;
        return u(this.f13805b0) || u(this.f13807c0) || u(this.f13813f0) || (this.f13810d1 && u(this.f13812e1)) || (!((dVar = this.O0.f16056g) == null || (colorStateList = dVar.f16866j) == null || !colorStateList.isStateful()) || ((this.f13834v0 && this.f13835w0 != null && this.f13833u0) || v(this.f13823k0) || v(this.f13835w0) || u(this.f13804a1)));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (T()) {
            zOnLayoutDirectionChanged |= t.F(this.f13823k0, i10);
        }
        if (S()) {
            zOnLayoutDirectionChanged |= t.F(this.f13835w0, i10);
        }
        if (U()) {
            zOnLayoutDirectionChanged |= t.F(this.f13828p0, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (T()) {
            zOnLevelChange |= this.f13823k0.setLevel(i10);
        }
        if (S()) {
            zOnLevelChange |= this.f13835w0.setLevel(i10);
        }
        if (U()) {
            zOnLevelChange |= this.f13828p0.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // v6.g, android.graphics.drawable.Drawable, p6.i
    public final boolean onStateChange(int[] iArr) {
        if (this.f13822j1) {
            super.onStateChange(iArr);
        }
        return x(iArr, this.f13808c1);
    }

    public final void p(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        t.F(drawable, t.t(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f13828p0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f13808c1);
            }
            i0.a.h(drawable, this.f13830r0);
            return;
        }
        Drawable drawable2 = this.f13823k0;
        if (drawable == drawable2 && this.f13826n0) {
            i0.a.h(drawable2, this.f13824l0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void q(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (T() || S()) {
            float f10 = this.A0 + this.B0;
            Drawable drawable = this.V0 ? this.f13835w0 : this.f13823k0;
            float intrinsicWidth = this.f13825m0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (t.t(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + intrinsicWidth;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - intrinsicWidth;
            }
            Drawable drawable2 = this.V0 ? this.f13835w0 : this.f13823k0;
            float fCeil = this.f13825m0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.I0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float r() {
        if (!T() && !S()) {
            return 0.0f;
        }
        float f10 = this.B0;
        Drawable drawable = this.V0 ? this.f13835w0 : this.f13823k0;
        float intrinsicWidth = this.f13825m0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f10 + this.C0;
    }

    public final float s() {
        if (U()) {
            return this.F0 + this.f13831s0 + this.G0;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // v6.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.X0 != i10) {
            this.X0 = i10;
            invalidateSelf();
        }
    }

    @Override // v6.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.Y0 != colorFilter) {
            this.Y0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // v6.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f13804a1 != colorStateList) {
            this.f13804a1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // v6.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f13806b1 != mode) {
            this.f13806b1 = mode;
            ColorStateList colorStateList = this.f13804a1;
            this.Z0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z10) {
        boolean visible = super.setVisible(z7, z10);
        if (T()) {
            visible |= this.f13823k0.setVisible(z7, z10);
        }
        if (S()) {
            visible |= this.f13835w0.setVisible(z7, z10);
        }
        if (U()) {
            visible |= this.f13828p0.setVisible(z7, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        return this.f13822j1 ? this.f18440b.f18418a.f18454e.a(h()) : this.f13811e0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void w() {
        e eVar = (e) this.f13814f1.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.S);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean x(int[] iArr, int[] iArr2) {
        boolean z7;
        boolean z10;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f13805b0;
        int iD = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.P0) : 0);
        boolean state = true;
        if (this.P0 != iD) {
            this.P0 = iD;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f13807c0;
        int iD2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.Q0) : 0);
        if (this.Q0 != iD2) {
            this.Q0 = iD2;
            zOnStateChange = true;
        }
        int iB = h0.a.b(iD2, iD);
        if ((this.R0 != iB) | (this.f18440b.f18420c == null)) {
            this.R0 = iB;
            l(ColorStateList.valueOf(iB));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f13813f0;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.S0) : 0;
        if (this.S0 != colorForState) {
            this.S0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f13812e1 == null || !t6.d.c(iArr)) ? 0 : this.f13812e1.getColorForState(iArr, this.T0);
        if (this.T0 != colorForState2) {
            this.T0 = colorForState2;
            if (this.f13810d1) {
                zOnStateChange = true;
            }
        }
        s6.d dVar = this.O0.f16056g;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f16866j) == null) ? 0 : colorStateList.getColorForState(iArr, this.U0);
        if (this.U0 != colorForState3) {
            this.U0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (state2[i10] == 16842912) {
                    z7 = this.f13833u0;
                } else {
                    i10++;
                }
            }
        }
        if (this.V0 == z7 || this.f13835w0 == null) {
            z10 = false;
        } else {
            float fR = r();
            this.V0 = z7;
            if (fR != r()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                zOnStateChange = true;
                z10 = false;
            }
        }
        ColorStateList colorStateList5 = this.f13804a1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.W0) : 0;
        if (this.W0 != colorForState4) {
            this.W0 = colorForState4;
            ColorStateList colorStateList6 = this.f13804a1;
            PorterDuff.Mode mode = this.f13806b1;
            this.Z0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (v(this.f13823k0)) {
            state |= this.f13823k0.setState(iArr);
        }
        if (v(this.f13835w0)) {
            state |= this.f13835w0.setState(iArr);
        }
        if (v(this.f13828p0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f13828p0.setState(iArr3);
        }
        int[] iArr4 = t6.d.f17730a;
        if (v(this.f13829q0)) {
            state |= this.f13829q0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            w();
        }
        return state;
    }

    public final void y(boolean z7) {
        if (this.f13833u0 != z7) {
            this.f13833u0 = z7;
            float fR = r();
            if (!z7 && this.V0) {
                this.V0 = false;
            }
            float fR2 = r();
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void z(Drawable drawable) {
        if (this.f13835w0 != drawable) {
            float fR = r();
            this.f13835w0 = drawable;
            float fR2 = r();
            V(this.f13835w0);
            p(this.f13835w0);
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }
}