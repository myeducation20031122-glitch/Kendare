package t5;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.l9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q5 extends m3 {

    /* renamed from: f, reason: collision with root package name */
    public m5.b f17581f;

    /* renamed from: j, reason: collision with root package name */
    public final a5.x f17582j;

    /* renamed from: m, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.l2 f17583m;

    /* renamed from: n, reason: collision with root package name */
    public final l9 f17584n;

    public q5(b4 b4Var) {
        super(b4Var);
        this.f17582j = new a5.x(this, 6);
        com.google.android.gms.internal.ads.l2 l2Var = new com.google.android.gms.internal.ads.l2();
        l2Var.f6224j = this;
        l2Var.f6223f = new p5(l2Var, (b4) this.f15046b, 0);
        ((b4) this.f15046b).Q.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        l2Var.f6221b = jElapsedRealtime;
        l2Var.f6222e = jElapsedRealtime;
        this.f17583m = l2Var;
        this.f17584n = new l9(this, 2);
    }

    @Override // t5.m3
    public final boolean r() {
        return false;
    }

    public final void s() {
        o();
        if (this.f17581f == null) {
            this.f17581f = new m5.b(Looper.getMainLooper());
        }
    }
}