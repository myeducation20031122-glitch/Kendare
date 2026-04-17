package o0;

import android.view.WindowInsets;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class b2 extends d2 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f15510c;

    public b2() {
        this.f15510c = m6.a.d();
    }

    @Override // o0.d2
    public m2 b() {
        a();
        m2 m2VarG = m2.g(null, this.f15510c.build());
        m2VarG.f15585a.o(this.f15523b);
        return m2VarG;
    }

    @Override // o0.d2
    public void d(h0.c cVar) {
        this.f15510c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // o0.d2
    public void e(h0.c cVar) {
        this.f15510c.setStableInsets(cVar.d());
    }

    @Override // o0.d2
    public void f(h0.c cVar) {
        this.f15510c.setSystemGestureInsets(cVar.d());
    }

    @Override // o0.d2
    public void g(h0.c cVar) {
        this.f15510c.setSystemWindowInsets(cVar.d());
    }

    @Override // o0.d2
    public void h(h0.c cVar) {
        this.f15510c.setTappableElementInsets(cVar.d());
    }

    public b2(m2 m2Var) {
        super(m2Var);
        WindowInsets windowInsetsF = m2Var.f();
        this.f15510c = windowInsetsF != null ? m6.a.e(windowInsetsF) : m6.a.d();
    }
}