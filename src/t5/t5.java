package t5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class t5 extends s5 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f17621f;

    public t5(w5 w5Var) {
        super(w5Var);
        this.f17607e.T++;
    }

    public final void p() {
        if (!this.f17621f) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void q() {
        if (this.f17621f) {
            throw new IllegalStateException("Can't initialize twice");
        }
        r();
        this.f17607e.U++;
        this.f17621f = true;
    }

    public abstract boolean r();
}