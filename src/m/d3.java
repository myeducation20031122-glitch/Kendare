package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f14750a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f14751b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f14752c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f14753d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f14754e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f14755f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f14756g = new int[1];

    public static void a(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f.a.f12633j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList colorStateListD = d(context, i10);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f14751b, colorStateListD.getDefaultColor());
        }
        ThreadLocal threadLocal = f14750a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        return h0.a.d(c(context, i10), Math.round(Color.alpha(r4) * f10));
    }

    public static int c(Context context, int i10) {
        int[] iArr = f14756g;
        iArr[0] = i10;
        g.e eVar = new g.e(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return ((TypedArray) eVar.f12764f).getColor(0, 0);
        } finally {
            eVar.L();
        }
    }

    public static ColorStateList d(Context context, int i10) {
        int[] iArr = f14756g;
        iArr[0] = i10;
        g.e eVar = new g.e(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return eVar.r(0);
        } finally {
            eVar.L();
        }
    }
}