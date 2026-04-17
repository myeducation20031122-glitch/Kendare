package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class f0 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, m0 m0Var) {
        Objects.requireNonNull(m0Var);
        androidx.activity.t tVar = new androidx.activity.t(m0Var, 1);
        androidx.activity.n.e(obj).registerOnBackInvokedCallback(1000000, tVar);
        return tVar;
    }

    public static void c(Object obj, Object obj2) {
        androidx.activity.n.e(obj).unregisterOnBackInvokedCallback(androidx.activity.n.b(obj2));
    }
}