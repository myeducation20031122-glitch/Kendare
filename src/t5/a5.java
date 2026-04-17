package t5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17222b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b5 f17223e;

    public /* synthetic */ a5(b5 b5Var, int i10) {
        this.f17222b = i10;
        this.f17223e = b5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f17222b;
        b5 b5Var = this.f17223e;
        switch (i10) {
            case 0:
                b5Var.f17254m = b5Var.M;
                break;
            default:
                b5Var.M = null;
                break;
        }
    }
}