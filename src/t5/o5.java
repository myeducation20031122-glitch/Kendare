package t5;

import com.google.android.gms.internal.measurement.l9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f17541b;

    /* renamed from: e, reason: collision with root package name */
    public final long f17542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l9 f17543f;

    public o5(l9 l9Var, long j10, long j11) {
        this.f17543f = l9Var;
        this.f17541b = j10;
        this.f17542e = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a4 a4Var = ((b4) ((q5) this.f17543f.f10882f).f15046b).M;
        b4.i(a4Var);
        a4Var.x(new n5(this, 0));
    }
}