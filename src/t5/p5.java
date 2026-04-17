package t5;

import android.os.SystemClock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p5 extends l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17557f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5(Object obj, b4 b4Var, int i10) {
        super(b4Var);
        this.f17556e = i10;
        this.f17557f = obj;
    }

    @Override // t5.l
    public final void b() {
        int i10 = this.f17556e;
        Object obj = this.f17557f;
        switch (i10) {
            case 0:
                com.google.android.gms.internal.ads.l2 l2Var = (com.google.android.gms.internal.ads.l2) obj;
                ((q5) l2Var.f6224j).o();
                ((b4) ((q5) l2Var.f6224j).f15046b).Q.getClass();
                l2Var.d(SystemClock.elapsedRealtime(), false, false);
                t1 t1VarK = ((b4) ((q5) l2Var.f6224j).f15046b).k();
                ((b4) ((q5) l2Var.f6224j).f15046b).Q.getClass();
                t1VarK.r(SystemClock.elapsedRealtime());
                break;
            default:
                r5 r5Var = (r5) obj;
                r5Var.s();
                i3 i3Var = ((b4) r5Var.f15046b).f17251w;
                b4.i(i3Var);
                i3Var.Q.a("Starting upload from DelayedRunnable");
                r5Var.f17607e.r();
                break;
        }
    }
}