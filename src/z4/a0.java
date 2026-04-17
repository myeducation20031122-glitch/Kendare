package z4;

import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a0 extends i5.h {

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f19589e;

    public a0(b0 b0Var) {
        this.f19589e = new WeakReference(b0Var);
    }

    @Override // i5.h
    public final void e() {
        b0 b0Var = (b0) this.f19589e.get();
        if (b0Var == null) {
            return;
        }
        b0.j(b0Var);
    }
}