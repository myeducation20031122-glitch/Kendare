package p6;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import fc.t;
import java.util.WeakHashMap;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;

    /* renamed from: a, reason: collision with root package name */
    public final View f15999a;

    /* renamed from: a0, reason: collision with root package name */
    public float f16000a0;

    /* renamed from: b, reason: collision with root package name */
    public float f16001b;

    /* renamed from: b0, reason: collision with root package name */
    public float f16002b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f16003c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f16004c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f16005d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f16007e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f16014j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f16015k;

    /* renamed from: l, reason: collision with root package name */
    public float f16016l;

    /* renamed from: m, reason: collision with root package name */
    public float f16017m;

    /* renamed from: n, reason: collision with root package name */
    public float f16018n;

    /* renamed from: o, reason: collision with root package name */
    public float f16019o;

    /* renamed from: p, reason: collision with root package name */
    public float f16020p;

    /* renamed from: q, reason: collision with root package name */
    public float f16021q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f16022r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f16023s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f16024t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f16025u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f16026v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f16027w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f16028x;

    /* renamed from: y, reason: collision with root package name */
    public s6.a f16029y;

    /* renamed from: f, reason: collision with root package name */
    public int f16009f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f16011g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f16012h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f16013i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f16030z = TextUtils.TruncateAt.END;
    public final boolean D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f16006d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f16008e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f16010f0 = h.f16034m;

    public b(View view) {
        this.f15999a = view;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f16005d = new Rect();
        this.f16003c = new Rect();
        this.f16007e = new RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i10, float f10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), Math.round((Color.red(i11) * f10) + (Color.red(i10) * f11)), Math.round((Color.green(i11) * f10) + (Color.green(i10) * f11)), Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static float f(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return z5.a.a(f10, f11, f12);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = c1.f15515a;
        boolean z7 = this.f15999a.getLayoutDirection() == 1;
        if (this.D) {
            return (z7 ? m0.l.f15051d : m0.l.f15050c).i(charSequence, charSequence.length());
        }
        return z7;
    }

    public final void c(float f10, boolean z7) {
        float f11;
        float f12;
        Typeface typeface;
        boolean z10;
        StaticLayout staticLayoutA;
        Layout.Alignment alignment;
        if (this.A == null) {
            return;
        }
        float fWidth = this.f16005d.width();
        float fWidth2 = this.f16003c.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            f11 = this.f16013i;
            f12 = this.V;
            this.F = 1.0f;
            typeface = this.f16022r;
        } else {
            float f13 = this.f16012h;
            float f14 = this.W;
            Typeface typeface2 = this.f16025u;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.f16012h, this.f16013i, f10, this.Q) / this.f16012h;
            }
            float f15 = this.f16013i / this.f16012h;
            fWidth = (z7 || fWidth2 * f15 <= fWidth) ? fWidth2 : Math.min(fWidth / f15, fWidth2);
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        TextPaint textPaint = this.N;
        if (fWidth > 0.0f) {
            boolean z11 = this.G != f11;
            boolean z12 = this.X != f12;
            boolean z13 = this.f16028x != typeface;
            StaticLayout staticLayout = this.Y;
            z10 = z11 || z12 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || this.M;
            this.G = f11;
            this.X = f12;
            this.f16028x = typeface;
            this.M = false;
            textPaint.setLinearText(this.F != 1.0f);
        } else {
            z10 = false;
        }
        if (this.B == null || z10) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f16028x);
            textPaint.setLetterSpacing(this.X);
            boolean zB = b(this.A);
            this.C = zB;
            int i10 = this.f16006d0;
            if (i10 <= 1 || zB) {
                i10 = 1;
            }
            try {
                if (i10 == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f16009f, zB ? 1 : 0) & 7;
                    if (absoluteGravity == 1) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    } else if (absoluteGravity != 5) {
                        alignment = this.C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        if (this.C) {
                        }
                    }
                }
                h hVar = new h(this.A, textPaint, (int) fWidth);
                hVar.f16049l = this.f16030z;
                hVar.f16048k = zB;
                hVar.f16042e = alignment;
                hVar.f16047j = false;
                hVar.f16043f = i10;
                float f16 = this.f16008e0;
                hVar.f16044g = 0.0f;
                hVar.f16045h = f16;
                hVar.f16046i = this.f16010f0;
                staticLayoutA = hVar.a();
            } catch (g e10) {
                Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
                staticLayoutA = null;
            }
            staticLayoutA.getClass();
            this.Y = staticLayoutA;
            this.B = staticLayoutA.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.f16013i);
        textPaint.setTypeface(this.f16022r);
        textPaint.setLetterSpacing(this.V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f16024t;
            if (typeface != null) {
                this.f16023s = t.A(configuration, typeface);
            }
            Typeface typeface2 = this.f16027w;
            if (typeface2 != null) {
                this.f16026v = t.A(configuration, typeface2);
            }
            Typeface typeface3 = this.f16023s;
            if (typeface3 == null) {
                typeface3 = this.f16024t;
            }
            this.f16022r = typeface3;
            Typeface typeface4 = this.f16026v;
            if (typeface4 == null) {
                typeface4 = this.f16027w;
            }
            this.f16025u = typeface4;
            h(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(boolean z7) {
        float fCenterX;
        float f10;
        float f11;
        StaticLayout staticLayout;
        float fMeasureText;
        StaticLayout staticLayout2;
        int i10;
        float fDescent;
        int i11;
        float fCenterX2;
        float f12;
        Bitmap bitmap;
        float f13;
        float f14;
        StaticLayout staticLayout3;
        View view = this.f15999a;
        if ((view.getHeight() <= 0 || view.getWidth() <= 0) && !z7) {
            return;
        }
        c(1.0f, z7);
        CharSequence charSequence = this.B;
        TextPaint textPaint = this.N;
        if (charSequence != null && (staticLayout3 = this.Y) != null) {
            this.f16004c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout3.getWidth(), this.f16030z);
        }
        CharSequence charSequence2 = this.f16004c0;
        if (charSequence2 != null) {
            this.Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f16011g, this.C ? 1 : 0);
        int i12 = absoluteGravity & 112;
        Rect rect = this.f16005d;
        if (i12 != 48) {
            this.f16017m = i12 != 80 ? rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f) : textPaint.ascent() + rect.bottom;
        } else {
            this.f16017m = rect.top;
        }
        int i13 = absoluteGravity & 8388615;
        if (i13 == 1) {
            fCenterX = rect.centerX();
            f10 = this.Z / 2.0f;
        } else {
            if (i13 != 5) {
                f11 = rect.left;
                this.f16019o = f11;
                c(0.0f, z7);
                float height = this.Y == null ? r1.getHeight() : 0.0f;
                staticLayout = this.Y;
                if (staticLayout != null || this.f16006d0 <= 1) {
                    CharSequence charSequence3 = this.B;
                    fMeasureText = charSequence3 == null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
                } else {
                    fMeasureText = staticLayout.getWidth();
                }
                staticLayout2 = this.Y;
                if (staticLayout2 != null) {
                    staticLayout2.getLineCount();
                }
                int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f16009f, this.C ? 1 : 0);
                i10 = absoluteGravity2 & 112;
                Rect rect2 = this.f16003c;
                if (i10 != 48) {
                    fDescent = rect2.top;
                } else {
                    if (i10 != 80) {
                        this.f16016l = rect2.centerY() - (height / 2.0f);
                        i11 = absoluteGravity2 & 8388615;
                        if (i11 == 1) {
                            fCenterX2 = rect2.centerX();
                            fMeasureText /= 2.0f;
                        } else {
                            if (i11 != 5) {
                                f12 = rect2.left;
                                this.f16018n = f12;
                                bitmap = this.E;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    this.E = null;
                                }
                                l(this.f16001b);
                                float f15 = this.f16001b;
                                float f16 = f(rect2.left, rect.left, f15, this.P);
                                RectF rectF = this.f16007e;
                                rectF.left = f16;
                                rectF.top = f(this.f16016l, this.f16017m, f15, this.P);
                                rectF.right = f(rect2.right, rect.right, f15, this.P);
                                rectF.bottom = f(rect2.bottom, rect.bottom, f15, this.P);
                                this.f16020p = f(this.f16018n, this.f16019o, f15, this.P);
                                this.f16021q = f(this.f16016l, this.f16017m, f15, this.P);
                                l(f15);
                                d1.b bVar = z5.a.f19747b;
                                this.f16000a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f15, bVar);
                                WeakHashMap weakHashMap = c1.f15515a;
                                view.postInvalidateOnAnimation();
                                this.f16002b0 = f(1.0f, 0.0f, f15, bVar);
                                view.postInvalidateOnAnimation();
                                ColorStateList colorStateList = this.f16015k;
                                ColorStateList colorStateList2 = this.f16014j;
                                textPaint.setColor(colorStateList == colorStateList2 ? a(e(colorStateList2), f15, e(this.f16015k)) : e(colorStateList));
                                f13 = this.V;
                                f14 = this.W;
                                if (f13 != f14) {
                                    f13 = f(f14, f13, f15, bVar);
                                }
                                textPaint.setLetterSpacing(f13);
                                this.H = f(0.0f, this.R, f15, null);
                                this.I = f(0.0f, this.S, f15, null);
                                this.J = f(0.0f, this.T, f15, null);
                                int iA = a(e(null), f15, e(this.U));
                                this.K = iA;
                                textPaint.setShadowLayer(this.H, this.I, this.J, iA);
                                view.postInvalidateOnAnimation();
                            }
                            fCenterX2 = rect2.right;
                        }
                        f12 = fCenterX2 - fMeasureText;
                        this.f16018n = f12;
                        bitmap = this.E;
                        if (bitmap != null) {
                        }
                        l(this.f16001b);
                        float f152 = this.f16001b;
                        float f162 = f(rect2.left, rect.left, f152, this.P);
                        RectF rectF2 = this.f16007e;
                        rectF2.left = f162;
                        rectF2.top = f(this.f16016l, this.f16017m, f152, this.P);
                        rectF2.right = f(rect2.right, rect.right, f152, this.P);
                        rectF2.bottom = f(rect2.bottom, rect.bottom, f152, this.P);
                        this.f16020p = f(this.f16018n, this.f16019o, f152, this.P);
                        this.f16021q = f(this.f16016l, this.f16017m, f152, this.P);
                        l(f152);
                        d1.b bVar2 = z5.a.f19747b;
                        this.f16000a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f152, bVar2);
                        WeakHashMap weakHashMap2 = c1.f15515a;
                        view.postInvalidateOnAnimation();
                        this.f16002b0 = f(1.0f, 0.0f, f152, bVar2);
                        view.postInvalidateOnAnimation();
                        ColorStateList colorStateList3 = this.f16015k;
                        ColorStateList colorStateList22 = this.f16014j;
                        textPaint.setColor(colorStateList3 == colorStateList22 ? a(e(colorStateList22), f152, e(this.f16015k)) : e(colorStateList3));
                        f13 = this.V;
                        f14 = this.W;
                        if (f13 != f14) {
                        }
                        textPaint.setLetterSpacing(f13);
                        this.H = f(0.0f, this.R, f152, null);
                        this.I = f(0.0f, this.S, f152, null);
                        this.J = f(0.0f, this.T, f152, null);
                        int iA2 = a(e(null), f152, e(this.U));
                        this.K = iA2;
                        textPaint.setShadowLayer(this.H, this.I, this.J, iA2);
                        view.postInvalidateOnAnimation();
                    }
                    fDescent = textPaint.descent() + (rect2.bottom - height);
                }
                this.f16016l = fDescent;
                i11 = absoluteGravity2 & 8388615;
                if (i11 == 1) {
                }
                f12 = fCenterX2 - fMeasureText;
                this.f16018n = f12;
                bitmap = this.E;
                if (bitmap != null) {
                }
                l(this.f16001b);
                float f1522 = this.f16001b;
                float f1622 = f(rect2.left, rect.left, f1522, this.P);
                RectF rectF22 = this.f16007e;
                rectF22.left = f1622;
                rectF22.top = f(this.f16016l, this.f16017m, f1522, this.P);
                rectF22.right = f(rect2.right, rect.right, f1522, this.P);
                rectF22.bottom = f(rect2.bottom, rect.bottom, f1522, this.P);
                this.f16020p = f(this.f16018n, this.f16019o, f1522, this.P);
                this.f16021q = f(this.f16016l, this.f16017m, f1522, this.P);
                l(f1522);
                d1.b bVar22 = z5.a.f19747b;
                this.f16000a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f1522, bVar22);
                WeakHashMap weakHashMap22 = c1.f15515a;
                view.postInvalidateOnAnimation();
                this.f16002b0 = f(1.0f, 0.0f, f1522, bVar22);
                view.postInvalidateOnAnimation();
                ColorStateList colorStateList32 = this.f16015k;
                ColorStateList colorStateList222 = this.f16014j;
                textPaint.setColor(colorStateList32 == colorStateList222 ? a(e(colorStateList222), f1522, e(this.f16015k)) : e(colorStateList32));
                f13 = this.V;
                f14 = this.W;
                if (f13 != f14) {
                }
                textPaint.setLetterSpacing(f13);
                this.H = f(0.0f, this.R, f1522, null);
                this.I = f(0.0f, this.S, f1522, null);
                this.J = f(0.0f, this.T, f1522, null);
                int iA22 = a(e(null), f1522, e(this.U));
                this.K = iA22;
                textPaint.setShadowLayer(this.H, this.I, this.J, iA22);
                view.postInvalidateOnAnimation();
            }
            fCenterX = rect.right;
            f10 = this.Z;
        }
        f11 = fCenterX - f10;
        this.f16019o = f11;
        c(0.0f, z7);
        if (this.Y == null) {
        }
        staticLayout = this.Y;
        if (staticLayout != null) {
            CharSequence charSequence32 = this.B;
            if (charSequence32 == null) {
            }
        }
        staticLayout2 = this.Y;
        if (staticLayout2 != null) {
        }
        int absoluteGravity22 = Gravity.getAbsoluteGravity(this.f16009f, this.C ? 1 : 0);
        i10 = absoluteGravity22 & 112;
        Rect rect22 = this.f16003c;
        if (i10 != 48) {
        }
        this.f16016l = fDescent;
        i11 = absoluteGravity22 & 8388615;
        if (i11 == 1) {
        }
        f12 = fCenterX2 - fMeasureText;
        this.f16018n = f12;
        bitmap = this.E;
        if (bitmap != null) {
        }
        l(this.f16001b);
        float f15222 = this.f16001b;
        float f16222 = f(rect22.left, rect.left, f15222, this.P);
        RectF rectF222 = this.f16007e;
        rectF222.left = f16222;
        rectF222.top = f(this.f16016l, this.f16017m, f15222, this.P);
        rectF222.right = f(rect22.right, rect.right, f15222, this.P);
        rectF222.bottom = f(rect22.bottom, rect.bottom, f15222, this.P);
        this.f16020p = f(this.f16018n, this.f16019o, f15222, this.P);
        this.f16021q = f(this.f16016l, this.f16017m, f15222, this.P);
        l(f15222);
        d1.b bVar222 = z5.a.f19747b;
        this.f16000a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f15222, bVar222);
        WeakHashMap weakHashMap222 = c1.f15515a;
        view.postInvalidateOnAnimation();
        this.f16002b0 = f(1.0f, 0.0f, f15222, bVar222);
        view.postInvalidateOnAnimation();
        ColorStateList colorStateList322 = this.f16015k;
        ColorStateList colorStateList2222 = this.f16014j;
        textPaint.setColor(colorStateList322 == colorStateList2222 ? a(e(colorStateList2222), f15222, e(this.f16015k)) : e(colorStateList322));
        f13 = this.V;
        f14 = this.W;
        if (f13 != f14) {
        }
        textPaint.setLetterSpacing(f13);
        this.H = f(0.0f, this.R, f15222, null);
        this.I = f(0.0f, this.S, f15222, null);
        this.J = f(0.0f, this.T, f15222, null);
        int iA222 = a(e(null), f15222, e(this.U));
        this.K = iA222;
        textPaint.setShadowLayer(this.H, this.I, this.J, iA222);
        view.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f16015k == colorStateList && this.f16014j == colorStateList) {
            return;
        }
        this.f16015k = colorStateList;
        this.f16014j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        s6.a aVar = this.f16029y;
        if (aVar != null) {
            aVar.D = true;
        }
        if (this.f16024t == typeface) {
            return false;
        }
        this.f16024t = typeface;
        Typeface typefaceA = t.A(this.f15999a.getContext().getResources().getConfiguration(), typeface);
        this.f16023s = typefaceA;
        if (typefaceA == null) {
            typefaceA = this.f16024t;
        }
        this.f16022r = typefaceA;
        return true;
    }

    public final void k(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f16001b) {
            this.f16001b = f10;
            float f11 = this.f16003c.left;
            Rect rect = this.f16005d;
            float f12 = f(f11, rect.left, f10, this.P);
            RectF rectF = this.f16007e;
            rectF.left = f12;
            rectF.top = f(this.f16016l, this.f16017m, f10, this.P);
            rectF.right = f(r2.right, rect.right, f10, this.P);
            rectF.bottom = f(r2.bottom, rect.bottom, f10, this.P);
            this.f16020p = f(this.f16018n, this.f16019o, f10, this.P);
            this.f16021q = f(this.f16016l, this.f16017m, f10, this.P);
            l(f10);
            d1.b bVar = z5.a.f19747b;
            this.f16000a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, bVar);
            WeakHashMap weakHashMap = c1.f15515a;
            View view = this.f15999a;
            view.postInvalidateOnAnimation();
            this.f16002b0 = f(1.0f, 0.0f, f10, bVar);
            view.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f16015k;
            ColorStateList colorStateList2 = this.f16014j;
            TextPaint textPaint = this.N;
            textPaint.setColor(colorStateList != colorStateList2 ? a(e(colorStateList2), f10, e(this.f16015k)) : e(colorStateList));
            float f13 = this.V;
            float f14 = this.W;
            if (f13 != f14) {
                f13 = f(f14, f13, f10, bVar);
            }
            textPaint.setLetterSpacing(f13);
            this.H = f(0.0f, this.R, f10, null);
            this.I = f(0.0f, this.S, f10, null);
            this.J = f(0.0f, this.T, f10, null);
            int iA = a(e(null), f10, e(this.U));
            this.K = iA;
            textPaint.setShadowLayer(this.H, this.I, this.J, iA);
            view.postInvalidateOnAnimation();
        }
    }

    public final void l(float f10) {
        c(f10, false);
        WeakHashMap weakHashMap = c1.f15515a;
        this.f15999a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z7;
        boolean zJ = j(typeface);
        if (this.f16027w != typeface) {
            this.f16027w = typeface;
            Typeface typefaceA = t.A(this.f15999a.getContext().getResources().getConfiguration(), typeface);
            this.f16026v = typefaceA;
            if (typefaceA == null) {
                typefaceA = this.f16027w;
            }
            this.f16025u = typefaceA;
            z7 = true;
        } else {
            z7 = false;
        }
        if (zJ || z7) {
            h(false);
        }
    }
}