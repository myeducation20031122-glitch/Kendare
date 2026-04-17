package o0;

import android.view.View;
import android.view.Window;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class n2 extends g8.e {

    /* renamed from: e, reason: collision with root package name */
    public final Window f15594e;

    /* renamed from: f, reason: collision with root package name */
    public final g.v0 f15595f;

    public n2(Window window, g.v0 v0Var) {
        this.f15594e = window;
        this.f15595f = v0Var;
    }

    @Override // g8.e
    public final void J() {
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((8 & i10) != 0) {
                if (i10 == 1) {
                    K(4);
                    this.f15594e.clearFlags(1024);
                } else if (i10 == 2) {
                    K(2);
                } else if (i10 == 8) {
                    ((v6.e) this.f15595f.f12909e).x();
                }
            }
        }
    }

    public final void K(int i10) {
        View decorView = this.f15594e.getDecorView();
        decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
    }
}