package t5;

import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17300b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d6 f17301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f4 f17302f;

    public /* synthetic */ d4(f4 f4Var, d6 d6Var, int i10) {
        this.f17300b = i10;
        this.f17302f = f4Var;
        this.f17301e = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f17300b;
        d6 d6Var = this.f17301e;
        f4 f4Var = this.f17302f;
        switch (i10) {
            case 0:
                f4Var.f17347b.a();
                f4Var.f17347b.n(d6Var);
                break;
            case QueueFuseable.SYNC /* 1 */:
                f4Var.f17347b.a();
                w5 w5Var = f4Var.f17347b;
                w5Var.zzaz().o();
                w5Var.e();
                fc.t.g(d6Var.f17307b);
                w5Var.G(d6Var);
                break;
            case 2:
                f4Var.f17347b.a();
                w5 w5Var2 = f4Var.f17347b;
                w5Var2.zzaz().o();
                w5Var2.e();
                fc.t.g(d6Var.f17307b);
                h hVarB = h.b(d6Var.Y);
                String str = d6Var.f17307b;
                h hVarI = w5Var2.I(str);
                w5Var2.c().Q.c(str, "Setting consent, package, consent", hVarB);
                w5Var2.p(str, hVarB);
                if (hVarB.g(hVarI, (g[]) hVarB.f17378a.keySet().toArray(new g[0]))) {
                    w5Var2.n(d6Var);
                    break;
                }
                break;
            default:
                f4Var.f17347b.a();
                f4Var.f17347b.k(d6Var);
                break;
        }
    }
}