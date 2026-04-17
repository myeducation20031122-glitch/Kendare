package t5;

import com.google.android.gms.internal.measurement.l9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17505b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f17506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q5 f17507f;

    public /* synthetic */ m5(q5 q5Var, long j10, int i10) {
        this.f17505b = i10;
        this.f17507f = q5Var;
        this.f17506e = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10 = this.f17505b;
        q5 q5Var = this.f17507f;
        switch (i10) {
            case 0:
                q5Var.o();
                q5Var.s();
                b4 b4Var = (b4) q5Var.f15046b;
                i3 i3Var = b4Var.f17251w;
                b4.i(i3Var);
                long j10 = this.f17506e;
                i3Var.Q.b(Long.valueOf(j10), "Activity resumed, time");
                if (!b4Var.f17249t.z()) {
                    q3 q3Var = b4Var.f17250u;
                    b4.g(q3Var);
                    if (q3Var.S.b()) {
                        com.google.android.gms.internal.ads.l2 l2Var = q5Var.f17583m;
                        ((q5) l2Var.f6224j).o();
                        ((l) l2Var.f6223f).a();
                        l2Var.f6221b = j10;
                        l2Var.f6222e = j10;
                    }
                }
                l9 l9Var = q5Var.f17584n;
                ((q5) l9Var.f10882f).o();
                o5 o5Var = (o5) l9Var.f10881e;
                if (o5Var != null) {
                    ((q5) l9Var.f10882f).f17581f.removeCallbacks(o5Var);
                }
                q3 q3Var2 = ((b4) ((q5) l9Var.f10882f).f15046b).f17250u;
                b4.g(q3Var2);
                q3Var2.S.a(false);
                a5.x xVar = q5Var.f17582j;
                ((q5) xVar.f423e).o();
                if (((b4) ((q5) xVar.f423e).f15046b).e()) {
                    ((b4) ((q5) xVar.f423e).f15046b).Q.getClass();
                    xVar.k(System.currentTimeMillis(), false);
                    break;
                }
                break;
            default:
                long j11 = this.f17506e;
                q5Var.o();
                q5Var.s();
                b4 b4Var2 = (b4) q5Var.f15046b;
                i3 i3Var2 = b4Var2.f17251w;
                b4.i(i3Var2);
                i3Var2.Q.b(Long.valueOf(j11), "Activity paused, time");
                l9 l9Var2 = q5Var.f17584n;
                ((b4) ((q5) l9Var2.f10882f).f15046b).Q.getClass();
                o5 o5Var2 = new o5(l9Var2, System.currentTimeMillis(), j11);
                l9Var2.f10881e = o5Var2;
                ((q5) l9Var2.f10882f).f17581f.postDelayed(o5Var2, 2000L);
                if (b4Var2.f17249t.z()) {
                    ((l) q5Var.f17583m.f6223f).a();
                    break;
                }
                break;
        }
    }
}