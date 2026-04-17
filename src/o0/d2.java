package o0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final m2 f15522a;

    /* renamed from: b, reason: collision with root package name */
    public h0.c[] f15523b;

    public d2() {
        this(new m2());
    }

    public final void a() {
        h0.c[] cVarArr = this.f15523b;
        if (cVarArr != null) {
            h0.c cVarF = cVarArr[com.bumptech.glide.e.o(1)];
            h0.c cVarF2 = this.f15523b[com.bumptech.glide.e.o(2)];
            m2 m2Var = this.f15522a;
            if (cVarF2 == null) {
                cVarF2 = m2Var.f15585a.f(2);
            }
            if (cVarF == null) {
                cVarF = m2Var.f15585a.f(1);
            }
            g(h0.c.a(cVarF, cVarF2));
            h0.c cVar = this.f15523b[com.bumptech.glide.e.o(16)];
            if (cVar != null) {
                f(cVar);
            }
            h0.c cVar2 = this.f15523b[com.bumptech.glide.e.o(32)];
            if (cVar2 != null) {
                d(cVar2);
            }
            h0.c cVar3 = this.f15523b[com.bumptech.glide.e.o(64)];
            if (cVar3 != null) {
                h(cVar3);
            }
        }
    }

    public abstract m2 b();

    public void c(int i10, h0.c cVar) {
        if (this.f15523b == null) {
            this.f15523b = new h0.c[9];
        }
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f15523b[com.bumptech.glide.e.o(i11)] = cVar;
            }
        }
    }

    public void d(h0.c cVar) {
    }

    public abstract void e(h0.c cVar);

    public void f(h0.c cVar) {
    }

    public abstract void g(h0.c cVar);

    public void h(h0.c cVar) {
    }

    public d2(m2 m2Var) {
        this.f15522a = m2Var;
    }
}