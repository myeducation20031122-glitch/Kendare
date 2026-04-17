package o0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class q0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(2131296910);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static m2 b(View view, m2 m2Var, Rect rect) {
        WindowInsets windowInsetsF = m2Var.f();
        if (windowInsetsF != null) {
            return m2.g(view, view.computeSystemWindowInsets(windowInsetsF, rect));
        }
        rect.setEmpty();
        return m2Var;
    }

    public static boolean c(View view, float f10, float f11, boolean z7) {
        return view.dispatchNestedFling(f10, f11, z7);
    }

    public static boolean d(View view, float f10, float f11) {
        return view.dispatchNestedPreFling(f10, f11);
    }

    public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static m2 j(View view) throws IllegalAccessException, IllegalArgumentException {
        if (!z1.f15651d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = z1.f15648a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) z1.f15649b.get(obj);
            Rect rect2 = (Rect) z1.f15650c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            g.u0 u0Var = new g.u0(8);
            ((d2) u0Var.f12903e).e(h0.c.b(rect.left, rect.top, rect.right, rect.bottom));
            ((d2) u0Var.f12903e).g(h0.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            m2 m2VarW = u0Var.w();
            m2VarW.f15585a.p(m2VarW);
            m2VarW.f15585a.d(view.getRootView());
            return m2VarW;
        } catch (IllegalAccessException e10) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f10) {
        view.setElevation(f10);
    }

    public static void t(View view, boolean z7) {
        view.setNestedScrollingEnabled(z7);
    }

    public static void u(View view, z zVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131296902, zVar);
        }
        if (zVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(2131296910));
        } else {
            view.setOnApplyWindowInsetsListener(new p0(view, zVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f10) {
        view.setTranslationZ(f10);
    }

    public static void x(View view, float f10) {
        view.setZ(f10);
    }

    public static boolean y(View view, int i10) {
        return view.startNestedScroll(i10);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}