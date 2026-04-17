package o0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final g8.e f15618a;

    /* JADX WARN: Multi-variable type inference failed */
    public r2(Window window, View view) {
        n2 p2Var;
        g.v0 v0Var = new g.v0(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            q2 q2Var = new q2(window.getInsetsController(), v0Var);
            q2Var.f15609j = window;
            p2Var = q2Var;
        } else {
            p2Var = i10 >= 26 ? new p2(window, v0Var) : i10 >= 23 ? new o2(window, v0Var) : new n2(window, v0Var);
        }
        this.f15618a = p2Var;
    }

    public r2(WindowInsetsController windowInsetsController) {
        this.f15618a = new q2(windowInsetsController, new g.v0(windowInsetsController));
    }
}