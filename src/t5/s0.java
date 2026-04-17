package t5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17598b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f17599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u2 f17600f;

    public /* synthetic */ s0(u2 u2Var, long j10, int i10) {
        this.f17598b = i10;
        this.f17600f = u2Var;
        this.f17599e = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f17598b;
        long j10 = this.f17599e;
        u2 u2Var = this.f17600f;
        switch (i10) {
            case 0:
                ((t1) u2Var).u(j10);
                break;
            default:
                b5 b5Var = (b5) u2Var;
                ((b4) b5Var.f15046b).k().r(j10);
                b5Var.f17254m = null;
                break;
        }
    }
}