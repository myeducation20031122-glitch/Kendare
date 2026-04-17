package o0;

import android.view.View;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class v0 {
    public static void a(View view, a1 a1Var) {
        t.k kVar = (t.k) view.getTag(2131296909);
        if (kVar == null) {
            kVar = new t.k();
            view.setTag(2131296909, kVar);
        }
        Objects.requireNonNull(a1Var);
        View.OnUnhandledKeyEventListener u0Var = new u0();
        kVar.put(a1Var, u0Var);
        view.addOnUnhandledKeyEventListener(u0Var);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, a1 a1Var) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        t.k kVar = (t.k) view.getTag(2131296909);
        if (kVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) kVar.getOrDefault(a1Var, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i10) {
        return (T) view.requireViewById(i10);
    }

    public static void g(View view, boolean z7) {
        view.setAccessibilityHeading(z7);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, r0.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z7) {
        view.setScreenReaderFocusable(z7);
    }
}