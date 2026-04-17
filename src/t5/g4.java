package t5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class g4 extends m0.j {

    /* renamed from: e, reason: collision with root package name */
    public boolean f17368e;

    public g4(b4 b4Var) {
        fc.t.k(b4Var);
        this.f15046b = b4Var;
        b4Var.f17243h0++;
    }

    public abstract boolean p();

    public final void q() {
        if (!this.f17368e) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void r() {
        if (this.f17368e) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (p()) {
            return;
        }
        ((b4) this.f15046b).f17244i0.incrementAndGet();
        this.f17368e = true;
    }
}