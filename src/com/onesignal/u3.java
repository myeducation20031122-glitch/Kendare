package com.onesignal;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f12188b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f12189e;

    public u3(p1 p1Var, boolean z7) {
        this.f12188b = p1Var;
        this.f12189e = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z3.f12272r.getClass();
        l.d("Running promptLocation() operation from pending queue.");
        z3.G(this.f12188b, this.f12189e);
    }
}