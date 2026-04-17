package m;

import androidx.appcompat.widget.Toolbar;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class h3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14792b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Toolbar f14793e;

    public /* synthetic */ h3(Toolbar toolbar, int i10) {
        this.f14792b = i10;
        this.f14793e = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14792b;
        Toolbar toolbar = this.f14793e;
        switch (i10) {
            case 0:
                toolbar.n();
                break;
            default:
                j3 j3Var = toolbar.f746s0;
                l.q qVar = j3Var == null ? null : j3Var.f14805e;
                if (qVar != null) {
                    qVar.collapseActionView();
                    break;
                }
                break;
        }
    }
}