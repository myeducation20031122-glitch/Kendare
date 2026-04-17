package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f14737a;

    /* renamed from: b, reason: collision with root package name */
    public f3 f14738b;

    /* renamed from: c, reason: collision with root package name */
    public f3 f14739c;

    /* renamed from: d, reason: collision with root package name */
    public f3 f14740d;

    /* renamed from: e, reason: collision with root package name */
    public f3 f14741e;

    /* renamed from: f, reason: collision with root package name */
    public f3 f14742f;

    /* renamed from: g, reason: collision with root package name */
    public f3 f14743g;

    /* renamed from: h, reason: collision with root package name */
    public f3 f14744h;

    /* renamed from: i, reason: collision with root package name */
    public final m1 f14745i;

    /* renamed from: j, reason: collision with root package name */
    public int f14746j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f14747k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f14748l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14749m;

    public d1(TextView textView) {
        this.f14737a = textView;
        this.f14745i = new m1(textView);
    }

    public static f3 c(Context context, x xVar, int i10) {
        ColorStateList colorStateListI;
        synchronized (xVar) {
            colorStateListI = xVar.f14989a.i(context, i10);
        }
        if (colorStateListI == null) {
            return null;
        }
        f3 f3Var = new f3(0);
        f3Var.f14777b = true;
        f3Var.f14778c = colorStateListI;
        return f3Var;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i11 >= 30) {
            t0.b.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i11 >= 30) {
            t0.b.a(editorInfo, text);
            return;
        }
        int i12 = editorInfo.initialSelStart;
        int i13 = editorInfo.initialSelEnd;
        int i14 = i12 > i13 ? i13 : i12;
        if (i12 <= i13) {
            i12 = i13;
        }
        int length = text.length();
        if (i14 < 0 || i12 > length || (i10 = editorInfo.inputType & 4095) == 129 || i10 == 225 || i10 == 18) {
            t0.c.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            t0.c.a(editorInfo, text, i14, i12);
            return;
        }
        int i15 = i12 - i14;
        int i16 = i15 > 1024 ? 0 : i15;
        int i17 = 2048 - i16;
        int iMin = Math.min(text.length() - i12, i17 - Math.min(i14, (int) (i17 * 0.8d)));
        int iMin2 = Math.min(i14, i17 - iMin);
        int i18 = i14 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i18))) {
            i18++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i12 + iMin) - 1))) {
            iMin--;
        }
        int i19 = iMin2 + i16;
        t0.c.a(editorInfo, i16 != i15 ? TextUtils.concat(text.subSequence(i18, i18 + iMin2), text.subSequence(i12, iMin + i12)) : text.subSequence(i18, i19 + iMin + i18), iMin2, i19);
    }

    public final void a(Drawable drawable, f3 f3Var) {
        if (drawable == null || f3Var == null) {
            return;
        }
        x.e(drawable, f3Var, this.f14737a.getDrawableState());
    }

    public final void b() {
        f3 f3Var = this.f14738b;
        TextView textView = this.f14737a;
        if (f3Var != null || this.f14739c != null || this.f14740d != null || this.f14741e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f14738b);
            a(compoundDrawables[1], this.f14739c);
            a(compoundDrawables[2], this.f14740d);
            a(compoundDrawables[3], this.f14741e);
        }
        if (this.f14742f == null && this.f14743g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f14742f);
        a(compoundDrawablesRelative[2], this.f14743g);
    }

    public final ColorStateList d() {
        f3 f3Var = this.f14744h;
        if (f3Var != null) {
            return (ColorStateList) f3Var.f14778c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        f3 f3Var = this.f14744h;
        if (f3Var != null) {
            return (PorterDuff.Mode) f3Var.f14779d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i10) {
        boolean zQ;
        String strC;
        boolean z7;
        ColorStateList colorStateListR;
        ColorStateList colorStateListR2;
        ColorStateList colorStateListR3;
        String strC2;
        x xVar;
        int i11;
        int i12;
        float fApplyDimension;
        int i13;
        float fT;
        int i14;
        int i15;
        int resourceId;
        int i16;
        int i17;
        int i18;
        TextView textView = this.f14737a;
        Context context = textView.getContext();
        x xVarA = x.a();
        int[] iArr = f.a.f12631h;
        g.e eVarI = g.e.I(context, attributeSet, iArr, i10);
        o0.c1.q(textView, textView.getContext(), iArr, attributeSet, (TypedArray) eVarI.f12764f, i10);
        int iB = eVarI.B(0, -1);
        if (eVarI.F(3)) {
            this.f14738b = c(context, xVarA, eVarI.B(3, 0));
        }
        if (eVarI.F(1)) {
            this.f14739c = c(context, xVarA, eVarI.B(1, 0));
        }
        if (eVarI.F(4)) {
            this.f14740d = c(context, xVarA, eVarI.B(4, 0));
        }
        if (eVarI.F(2)) {
            this.f14741e = c(context, xVarA, eVarI.B(2, 0));
        }
        if (eVarI.F(5)) {
            this.f14742f = c(context, xVarA, eVarI.B(5, 0));
        }
        if (eVarI.F(6)) {
            this.f14743g = c(context, xVarA, eVarI.B(6, 0));
        }
        eVarI.L();
        boolean z10 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.f12646w;
        if (iB != -1) {
            g.e eVar = new g.e(context, context.obtainStyledAttributes(iB, iArr2));
            if (z10 || !eVar.F(14)) {
                zQ = false;
                z7 = false;
            } else {
                zQ = eVar.q(14, false);
                z7 = true;
            }
            n(context, eVar);
            int i19 = Build.VERSION.SDK_INT;
            if (i19 < 23) {
                colorStateListR = eVar.F(3) ? eVar.r(3) : null;
                if (eVar.F(4)) {
                    colorStateListR2 = eVar.r(4);
                    i18 = 5;
                } else {
                    i18 = 5;
                    colorStateListR2 = null;
                }
                if (eVar.F(i18)) {
                    colorStateListR3 = eVar.r(i18);
                    i16 = 15;
                    if (eVar.F(i16)) {
                        i17 = 26;
                        strC2 = null;
                    } else {
                        strC2 = eVar.C(i16);
                        i17 = 26;
                    }
                    strC = (i19 >= i17 || !eVar.F(13)) ? null : eVar.C(13);
                    eVar.L();
                } else {
                    i16 = 15;
                }
            } else {
                i16 = 15;
                colorStateListR = null;
                colorStateListR2 = null;
            }
            colorStateListR3 = null;
            if (eVar.F(i16)) {
            }
            if (i19 >= i17) {
                eVar.L();
            }
        } else {
            zQ = false;
            strC = null;
            z7 = false;
            colorStateListR = null;
            colorStateListR2 = null;
            colorStateListR3 = null;
            strC2 = null;
        }
        g.e eVar2 = new g.e(context, context.obtainStyledAttributes(attributeSet, iArr2, i10, 0));
        if (!z10 && eVar2.F(14)) {
            zQ = eVar2.q(14, false);
            z7 = true;
        }
        int i20 = Build.VERSION.SDK_INT;
        if (i20 < 23) {
            if (eVar2.F(3)) {
                colorStateListR = eVar2.r(3);
            }
            if (eVar2.F(4)) {
                colorStateListR2 = eVar2.r(4);
            }
            if (eVar2.F(5)) {
                colorStateListR3 = eVar2.r(5);
            }
        }
        ColorStateList colorStateList = colorStateListR;
        ColorStateList colorStateList2 = colorStateListR2;
        ColorStateList colorStateList3 = colorStateListR3;
        if (eVar2.F(15)) {
            strC2 = eVar2.C(15);
        }
        String str = strC2;
        if (i20 >= 26 && eVar2.F(13)) {
            strC = eVar2.C(13);
        }
        if (i20 < 28 || !eVar2.F(0)) {
            xVar = xVarA;
        } else {
            xVar = xVarA;
            if (eVar2.t(0, -1) == 0) {
                textView.setTextSize(0, 0.0f);
            }
        }
        n(context, eVar2);
        eVar2.L();
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            textView.setHintTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            textView.setLinkTextColor(colorStateList3);
        }
        if (!z10 && z7) {
            textView.setAllCaps(zQ);
        }
        Typeface typeface = this.f14748l;
        if (typeface != null) {
            if (this.f14747k == -1) {
                textView.setTypeface(typeface, this.f14746j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (strC != null) {
            b1.d(textView, strC);
        }
        if (str == null) {
            i11 = 0;
        } else if (i20 >= 24) {
            a1.b(textView, a1.a(str));
            i11 = 0;
        } else {
            i11 = 0;
            textView.setTextLocale(z0.a(str.split(",")[0]));
        }
        int[] iArr3 = f.a.f12632i;
        m1 m1Var = this.f14745i;
        Context context2 = m1Var.f14833j;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i10, i11);
        TextView textView2 = m1Var.f14832i;
        o0.c1.q(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes, i10);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            m1Var.f14824a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            fApplyDimension = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
            i12 = 1;
        } else {
            i12 = 1;
            fApplyDimension = -1.0f;
        }
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i12) ? typedArrayObtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i21 = 0; i21 < length; i21++) {
                    iArr4[i21] = typedArrayObtainTypedArray.getDimensionPixelSize(i21, -1);
                }
                m1Var.f14829f = m1.b(iArr4);
                m1Var.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!m1Var.j()) {
            m1Var.f14824a = 0;
        } else if (m1Var.f14824a == 1) {
            if (!m1Var.f14830g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (fApplyDimension == -1.0f) {
                    i15 = 2;
                    fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i15 = 2;
                }
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(i15, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1Var.k(fApplyDimension, dimension2, dimension);
            }
            m1Var.h();
        }
        if (w3.f14986c && m1Var.f14824a != 0) {
            int[] iArr5 = m1Var.f14829f;
            if (iArr5.length > 0) {
                if (b1.a(textView) != -1.0f) {
                    b1.b(textView, Math.round(m1Var.f14827d), Math.round(m1Var.f14828e), Math.round(m1Var.f14826c), 0);
                } else {
                    b1.c(textView, iArr5, 0);
                }
            }
        }
        g.e eVar3 = new g.e(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int iB2 = eVar3.B(8, -1);
        x xVar2 = xVar;
        Drawable drawableB = iB2 != -1 ? xVar2.b(context, iB2) : null;
        int iB3 = eVar3.B(13, -1);
        Drawable drawableB2 = iB3 != -1 ? xVar2.b(context, iB3) : null;
        int iB4 = eVar3.B(9, -1);
        Drawable drawableB3 = iB4 != -1 ? xVar2.b(context, iB4) : null;
        int iB5 = eVar3.B(6, -1);
        Drawable drawableB4 = iB5 != -1 ? xVar2.b(context, iB5) : null;
        int iB6 = eVar3.B(10, -1);
        Drawable drawableB5 = iB6 != -1 ? xVar2.b(context, iB6) : null;
        int iB7 = eVar3.B(7, -1);
        Drawable drawableB6 = iB7 != -1 ? xVar2.b(context, iB7) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (eVar3.F(11)) {
            ColorStateList colorStateListR4 = eVar3.r(11);
            if (Build.VERSION.SDK_INT >= 24) {
                u0.m.f(textView, colorStateListR4);
            } else if (textView instanceof u0.t) {
                ((u0.t) textView).setSupportCompoundDrawablesTintList(colorStateListR4);
            }
        }
        if (eVar3.F(12)) {
            PorterDuff.Mode modeC = t1.c(eVar3.y(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                u0.m.g(textView, modeC);
            } else if (textView instanceof u0.t) {
                ((u0.t) textView).setSupportCompoundDrawablesTintMode(modeC);
            }
        }
        int iT = eVar3.t(15, -1);
        int iT2 = eVar3.t(18, -1);
        if (eVar3.F(19)) {
            TypedValue typedValuePeekValue = ((TypedArray) eVar3.f12764f).peekValue(19);
            if (typedValuePeekValue != null && typedValuePeekValue.type == 5) {
                int i22 = typedValuePeekValue.data;
                int i23 = i22 & 15;
                fT = TypedValue.complexToFloat(i22);
                i14 = i23;
                i13 = -1;
                eVar3.L();
                if (iT != i13) {
                    o5.u.k(textView, iT);
                }
                if (iT2 != i13) {
                    o5.u.l(textView, iT2);
                }
                if (fT == -1.0f) {
                    if (i14 == i13) {
                        o5.u.m(textView, (int) fT);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        u0.p.a(textView, i14, fT);
                        return;
                    } else {
                        o5.u.m(textView, Math.round(TypedValue.applyDimension(i14, fT, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i13 = -1;
            fT = eVar3.t(19, -1);
        } else {
            i13 = -1;
            fT = -1.0f;
        }
        i14 = -1;
        eVar3.L();
        if (iT != i13) {
        }
        if (iT2 != i13) {
        }
        if (fT == -1.0f) {
        }
    }

    public final void g(Context context, int i10) {
        String strC;
        ColorStateList colorStateListR;
        ColorStateList colorStateListR2;
        ColorStateList colorStateListR3;
        g.e eVar = new g.e(context, context.obtainStyledAttributes(i10, f.a.f12646w));
        boolean zF = eVar.F(14);
        TextView textView = this.f14737a;
        if (zF) {
            textView.setAllCaps(eVar.q(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            if (eVar.F(3) && (colorStateListR3 = eVar.r(3)) != null) {
                textView.setTextColor(colorStateListR3);
            }
            if (eVar.F(5) && (colorStateListR2 = eVar.r(5)) != null) {
                textView.setLinkTextColor(colorStateListR2);
            }
            if (eVar.F(4) && (colorStateListR = eVar.r(4)) != null) {
                textView.setHintTextColor(colorStateListR);
            }
        }
        if (eVar.F(0) && eVar.t(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, eVar);
        if (i11 >= 26 && eVar.F(13) && (strC = eVar.C(13)) != null) {
            b1.d(textView, strC);
        }
        eVar.L();
        Typeface typeface = this.f14748l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f14746j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        m1 m1Var = this.f14745i;
        if (m1Var.j()) {
            DisplayMetrics displayMetrics = m1Var.f14833j.getResources().getDisplayMetrics();
            m1Var.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (m1Var.h()) {
                m1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        m1 m1Var = this.f14745i;
        if (m1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = m1Var.f14833j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                m1Var.f14829f = m1.b(iArrCopyOf);
                if (!m1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                m1Var.f14830g = false;
            }
            if (m1Var.h()) {
                m1Var.a();
            }
        }
    }

    public final void k(int i10) {
        m1 m1Var = this.f14745i;
        if (m1Var.j()) {
            if (i10 == 0) {
                m1Var.f14824a = 0;
                m1Var.f14827d = -1.0f;
                m1Var.f14828e = -1.0f;
                m1Var.f14826c = -1.0f;
                m1Var.f14829f = new int[0];
                m1Var.f14825b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(kc.r.d("Unknown auto-size text type: ", i10));
            }
            DisplayMetrics displayMetrics = m1Var.f14833j.getResources().getDisplayMetrics();
            m1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1Var.h()) {
                m1Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f14744h == null) {
            this.f14744h = new f3(0);
        }
        f3 f3Var = this.f14744h;
        f3Var.f14778c = colorStateList;
        f3Var.f14777b = colorStateList != null;
        this.f14738b = f3Var;
        this.f14739c = f3Var;
        this.f14740d = f3Var;
        this.f14741e = f3Var;
        this.f14742f = f3Var;
        this.f14743g = f3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f14744h == null) {
            this.f14744h = new f3(0);
        }
        f3 f3Var = this.f14744h;
        f3Var.f14779d = mode;
        f3Var.f14776a = mode != null;
        this.f14738b = f3Var;
        this.f14739c = f3Var;
        this.f14740d = f3Var;
        this.f14741e = f3Var;
        this.f14742f = f3Var;
        this.f14743g = f3Var;
    }

    public final void n(Context context, g.e eVar) {
        String strC;
        Typeface typefaceCreate;
        Typeface typeface;
        this.f14746j = eVar.y(2, this.f14746j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iY = eVar.y(11, -1);
            this.f14747k = iY;
            if (iY != -1) {
                this.f14746j &= 2;
            }
        }
        if (!eVar.F(10) && !eVar.F(12)) {
            if (eVar.F(1)) {
                this.f14749m = false;
                int iY2 = eVar.y(1, 1);
                if (iY2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iY2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iY2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f14748l = typeface;
                return;
            }
            return;
        }
        this.f14748l = null;
        int i11 = eVar.F(12) ? 12 : 10;
        int i12 = this.f14747k;
        int i13 = this.f14746j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceW = eVar.w(i11, this.f14746j, new x0(this, i12, i13, new WeakReference(this.f14737a)));
                if (typefaceW != null) {
                    if (i10 >= 28 && this.f14747k != -1) {
                        typefaceW = c1.a(Typeface.create(typefaceW, 0), this.f14747k, (this.f14746j & 2) != 0);
                    }
                    this.f14748l = typefaceW;
                }
                this.f14749m = this.f14748l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f14748l != null || (strC = eVar.C(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f14747k == -1) {
            typefaceCreate = Typeface.create(strC, this.f14746j);
        } else {
            typefaceCreate = c1.a(Typeface.create(strC, 0), this.f14747k, (this.f14746j & 2) != 0);
        }
        this.f14748l = typefaceCreate;
    }
}