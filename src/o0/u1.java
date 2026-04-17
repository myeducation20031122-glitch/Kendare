package o0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.google.android.gms.internal.measurement.n3;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u1 extends x1 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f15627e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final d1.a f15628f = new d1.a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f15629g = new DecelerateInterpolator();

    public static void e(View view) {
        f6.d dVarJ = j(view);
        if (dVarJ != null) {
            dVarJ.f12702b.setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z7) {
        f6.d dVarJ = j(view);
        if (dVarJ != null) {
            dVarJ.f12701a = windowInsets;
            if (!z7) {
                View view2 = dVarJ.f12702b;
                int[] iArr = dVarJ.f12705e;
                view2.getLocationOnScreen(iArr);
                z7 = true;
                dVarJ.f12703c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), windowInsets, z7);
            }
        }
    }

    public static void g(View view, m2 m2Var, List list) {
        f6.d dVarJ = j(view);
        if (dVarJ != null) {
            dVarJ.a(m2Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), m2Var, list);
            }
        }
    }

    public static void h(View view, n3 n3Var) {
        f6.d dVarJ = j(view);
        if (dVarJ != null) {
            View view2 = dVarJ.f12702b;
            int[] iArr = dVarJ.f12705e;
            view2.getLocationOnScreen(iArr);
            int i10 = dVarJ.f12703c - iArr[1];
            dVarJ.f12704d = i10;
            view2.setTranslationY(i10);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                h(viewGroup.getChildAt(i11), n3Var);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(2131296902) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static f6.d j(View view) {
        Object tag = view.getTag(2131296910);
        if (tag instanceof t1) {
            return ((t1) tag).f15625a;
        }
        return null;
    }
}