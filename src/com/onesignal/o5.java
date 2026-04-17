package com.onesignal;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12049b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t5 f12050e;

    public /* synthetic */ o5(t5 t5Var, int i10) {
        this.f12049b = i10;
        this.f12050e = t5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f12049b;
        int i11 = 0;
        t5 t5Var = this.f12050e;
        switch (i10) {
            case 0:
                int[] iArrC = o3.c(t5Var.f12160d);
                t5Var.f12158b.evaluateJavascript(String.format("setSafeAreaInsets(%s)", String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", Integer.valueOf(iArrC[0]), Integer.valueOf(iArrC[1]), Integer.valueOf(iArrC[2]), Integer.valueOf(iArrC[3]))), null);
                break;
            default:
                t5.d(t5Var, t5Var.f12160d);
                if (t5Var.f12162f.f11887d) {
                    OSUtils.u(new o5(t5Var, i11));
                }
                t5Var.f12158b.evaluateJavascript("getPageMetaData()", new p5(this));
                break;
        }
    }
}