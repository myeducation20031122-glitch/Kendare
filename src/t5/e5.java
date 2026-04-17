package t5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e5 extends l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i5 f17328f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e5(i5 i5Var, h4 h4Var, int i10) {
        super(h4Var);
        this.f17327e = i10;
        this.f17328f = i5Var;
    }

    @Override // t5.l
    public final void b() {
        int i10 = this.f17327e;
        i5 i5Var = this.f17328f;
        switch (i10) {
            case 0:
                i5Var.o();
                if (i5Var.u()) {
                    i3 i3Var = ((b4) i5Var.f15046b).f17251w;
                    b4.i(i3Var);
                    i3Var.Q.a("Inactivity, disconnecting from the service");
                    i5Var.F();
                    break;
                }
                break;
            default:
                i3 i3Var2 = ((b4) i5Var.f15046b).f17251w;
                b4.i(i3Var2);
                i3Var2.f17400w.a("Tasks have been queued for a long time");
                break;
        }
    }
}