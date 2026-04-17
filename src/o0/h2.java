package o0;

import android.view.WindowInsets;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class h2 extends g2 {

    /* renamed from: n, reason: collision with root package name */
    public h0.c f15549n;

    /* renamed from: o, reason: collision with root package name */
    public h0.c f15550o;

    /* renamed from: p, reason: collision with root package name */
    public h0.c f15551p;

    public h2(m2 m2Var, WindowInsets windowInsets) {
        super(m2Var, windowInsets);
        this.f15549n = null;
        this.f15550o = null;
        this.f15551p = null;
    }

    @Override // o0.j2
    public h0.c g() {
        if (this.f15550o == null) {
            this.f15550o = h0.c.c(m6.a.x(this.f15536c));
        }
        return this.f15550o;
    }

    @Override // o0.j2
    public h0.c i() {
        if (this.f15549n == null) {
            this.f15549n = h0.c.c(m6.a.c(this.f15536c));
        }
        return this.f15549n;
    }

    @Override // o0.j2
    public h0.c k() {
        if (this.f15551p == null) {
            this.f15551p = h0.c.c(m6.a.s(this.f15536c));
        }
        return this.f15551p;
    }

    @Override // o0.e2, o0.j2
    public m2 l(int i10, int i11, int i12, int i13) {
        return m2.g(null, m6.a.g(this.f15536c, i10, i11, i12, i13));
    }

    @Override // o0.f2, o0.j2
    public void q(h0.c cVar) {
    }
}