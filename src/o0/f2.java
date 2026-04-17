package o0;

import android.view.WindowInsets;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class f2 extends e2 {

    /* renamed from: m, reason: collision with root package name */
    public h0.c f15543m;

    public f2(m2 m2Var, WindowInsets windowInsets) {
        super(m2Var, windowInsets);
        this.f15543m = null;
    }

    @Override // o0.j2
    public m2 b() {
        return m2.g(null, this.f15536c.consumeStableInsets());
    }

    @Override // o0.j2
    public m2 c() {
        return m2.g(null, this.f15536c.consumeSystemWindowInsets());
    }

    @Override // o0.j2
    public final h0.c h() {
        if (this.f15543m == null) {
            WindowInsets windowInsets = this.f15536c;
            this.f15543m = h0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f15543m;
    }

    @Override // o0.j2
    public boolean m() {
        return this.f15536c.isConsumed();
    }

    @Override // o0.j2
    public void q(h0.c cVar) {
        this.f15543m = cVar;
    }
}