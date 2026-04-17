package t5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d6 f17282b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f17283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y5 f17284f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i5 f17285j;

    public c5(i5 i5Var, d6 d6Var, boolean z7, y5 y5Var) {
        this.f17285j = i5Var;
        this.f17282b = d6Var;
        this.f17283e = z7;
        this.f17284f = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        i5 i5Var = this.f17285j;
        c3 c3Var = i5Var.f17428j;
        if (c3Var == null) {
            i3 i3Var = ((b4) i5Var.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.f17397n.a("Discarding data. Failed to set user property");
        } else {
            d6 d6Var = this.f17282b;
            fc.t.k(d6Var);
            i5Var.s(c3Var, this.f17283e ? null : this.f17284f, d6Var);
            i5Var.A();
        }
    }
}