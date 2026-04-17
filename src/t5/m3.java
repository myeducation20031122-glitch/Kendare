package t5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class m3 extends u2 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f17494e;

    public m3(b4 b4Var) {
        fc.t.k(b4Var);
        this.f15046b = b4Var;
        b4Var.f17243h0++;
    }

    public final void p() {
        if (!this.f17494e) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void q() {
        if (this.f17494e) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (r()) {
            return;
        }
        ((b4) this.f15046b).f17244i0.incrementAndGet();
        this.f17494e = true;
    }

    public abstract boolean r();
}