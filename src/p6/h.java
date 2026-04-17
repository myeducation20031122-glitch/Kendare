package p6;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import m.p0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h {

    /* renamed from: m, reason: collision with root package name */
    public static final int f16034m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f16035n;

    /* renamed from: o, reason: collision with root package name */
    public static Constructor f16036o;

    /* renamed from: p, reason: collision with root package name */
    public static TextDirectionHeuristic f16037p;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f16038a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f16039b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16040c;

    /* renamed from: d, reason: collision with root package name */
    public int f16041d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16048k;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f16042e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f16043f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f16044g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f16045h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f16046i = f16034m;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16047j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f16049l = null;

    static {
        f16034m = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public h(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f16038a = charSequence;
        this.f16039b = textPaint;
        this.f16040c = i10;
        this.f16041d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f16038a == null) {
            this.f16038a = "";
        }
        int iMax = Math.max(0, this.f16040c);
        CharSequence charSequenceEllipsize = this.f16038a;
        int i10 = this.f16043f;
        TextPaint textPaint = this.f16039b;
        if (i10 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f16049l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f16041d);
        this.f16041d = iMin;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            if (!f16035n) {
                try {
                    f16037p = this.f16048k && i11 >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                    Class cls = Integer.TYPE;
                    Class cls2 = Float.TYPE;
                    Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                    f16036o = declaredConstructor;
                    declaredConstructor.setAccessible(true);
                    f16035n = true;
                } catch (Exception e10) {
                    throw new g(e10);
                }
            }
            try {
                Constructor constructor = f16036o;
                constructor.getClass();
                TextDirectionHeuristic textDirectionHeuristic = f16037p;
                textDirectionHeuristic.getClass();
                return (StaticLayout) constructor.newInstance(charSequenceEllipsize, 0, Integer.valueOf(this.f16041d), textPaint, Integer.valueOf(iMax), this.f16042e, textDirectionHeuristic, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f16047j), null, Integer.valueOf(iMax), Integer.valueOf(this.f16043f));
            } catch (Exception e11) {
                throw new g(e11);
            }
        }
        if (this.f16048k && this.f16043f == 1) {
            this.f16042e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderC = p0.c(charSequenceEllipsize, iMin, textPaint, iMax);
        p0.o(builderC, this.f16042e);
        p0.r(builderC, this.f16047j);
        p0.p(builderC, this.f16048k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f16049l;
        if (truncateAt != null) {
            p0.q(builderC, truncateAt);
        }
        p0.n(builderC, this.f16043f);
        float f10 = this.f16044g;
        if (f10 != 0.0f || this.f16045h != 1.0f) {
            p0.m(builderC, f10, this.f16045h);
        }
        if (this.f16043f > 1) {
            p0.y(builderC, this.f16046i);
        }
        return p0.d(builderC);
    }
}