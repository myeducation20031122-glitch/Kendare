package o0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q2 extends g8.e {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f15607e;

    /* renamed from: f, reason: collision with root package name */
    public final g.v0 f15608f;

    /* renamed from: j, reason: collision with root package name */
    public Window f15609j;

    public q2(WindowInsetsController windowInsetsController, g.v0 v0Var) {
        this.f15607e = windowInsetsController;
        this.f15608f = v0Var;
    }

    @Override // g8.e
    public final void F(boolean z7) {
        Window window = this.f15609j;
        WindowInsetsController windowInsetsController = this.f15607e;
        if (z7) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            k2.k(windowInsetsController);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        k2.q(windowInsetsController);
    }

    @Override // g8.e
    public final void G(boolean z7) {
        Window window = this.f15609j;
        WindowInsetsController windowInsetsController = this.f15607e;
        if (z7) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            k2.s(windowInsetsController);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        k2.t(windowInsetsController);
    }

    @Override // g8.e
    public final void J() {
        ((v6.e) this.f15608f.f12909e).x();
        this.f15607e.show(0);
    }
}