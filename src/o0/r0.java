package o0;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class r0 {
    public static m2 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        m2 m2VarG = m2.g(null, rootWindowInsets);
        j2 j2Var = m2VarG.f15585a;
        j2Var.p(m2VarG);
        j2Var.d(view.getRootView());
        return m2VarG;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i10) {
        view.setScrollIndicators(i10);
    }

    public static void d(View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }
}