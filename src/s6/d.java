package s6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.internal.ads.dq0;
import fc.t;
import g0.q;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f16857a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16858b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16859c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16860d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16861e;

    /* renamed from: f, reason: collision with root package name */
    public final float f16862f;

    /* renamed from: g, reason: collision with root package name */
    public final float f16863g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16864h;

    /* renamed from: i, reason: collision with root package name */
    public final float f16865i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f16866j;

    /* renamed from: k, reason: collision with root package name */
    public float f16867k;

    /* renamed from: l, reason: collision with root package name */
    public final int f16868l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16869m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f16870n;

    public d(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, y5.a.E);
        this.f16867k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f16866j = j4.m(context, typedArrayObtainStyledAttributes, 3);
        j4.m(context, typedArrayObtainStyledAttributes, 4);
        j4.m(context, typedArrayObtainStyledAttributes, 5);
        this.f16859c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f16860d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i11 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f16868l = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
        this.f16858b = typedArrayObtainStyledAttributes.getString(i11);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f16857a = j4.m(context, typedArrayObtainStyledAttributes, 6);
        this.f16861e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f16862f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f16863g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, y5.a.f19284u);
        this.f16864h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f16865i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f16870n;
        int i10 = this.f16859c;
        if (typeface == null && (str = this.f16858b) != null) {
            this.f16870n = Typeface.create(str, i10);
        }
        if (this.f16870n == null) {
            int i11 = this.f16860d;
            this.f16870n = i11 != 1 ? i11 != 2 ? i11 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f16870n = Typeface.create(this.f16870n, i10);
        }
    }

    public final Typeface b(Context context) {
        if (this.f16869m) {
            return this.f16870n;
        }
        if (!context.isRestricted()) {
            try {
                int i10 = this.f16868l;
                ThreadLocal threadLocal = q.f12975a;
                Typeface typefaceB = context.isRestricted() ? null : q.b(context, i10, new TypedValue(), 0, null, false, false);
                this.f16870n = typefaceB;
                if (typefaceB != null) {
                    this.f16870n = Typeface.create(typefaceB, this.f16859c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f16858b, e10);
            }
        }
        a();
        this.f16869m = true;
        return this.f16870n;
    }

    public final void c(Context context, dq0 dq0Var) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f16868l;
        if (i10 == 0) {
            this.f16869m = true;
        }
        if (this.f16869m) {
            dq0Var.s(this.f16870n, true);
            return;
        }
        try {
            b bVar = new b(this, dq0Var);
            ThreadLocal threadLocal = q.f12975a;
            if (context.isRestricted()) {
                bVar.c(-4);
            } else {
                q.b(context, i10, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f16869m = true;
            dq0Var.r(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f16858b, e10);
            this.f16869m = true;
            dq0Var.r(-3);
        }
    }

    public final boolean d(Context context) {
        int i10 = this.f16868l;
        Typeface typefaceB = null;
        if (i10 != 0) {
            ThreadLocal threadLocal = q.f12975a;
            if (!context.isRestricted()) {
                typefaceB = q.b(context, i10, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceB != null;
    }

    public final void e(Context context, TextPaint textPaint, dq0 dq0Var) {
        f(context, textPaint, dq0Var);
        ColorStateList colorStateList = this.f16866j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f16857a;
        textPaint.setShadowLayer(this.f16863g, this.f16861e, this.f16862f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, dq0 dq0Var) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f16870n);
        c(context, new c(this, context, textPaint, dq0Var));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = t.A(context.getResources().getConfiguration(), typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f16859c;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f16867k);
        if (this.f16864h) {
            textPaint.setLetterSpacing(this.f16865i);
        }
    }
}