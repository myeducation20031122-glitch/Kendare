package t5;

import com.google.android.gms.internal.measurement.u8;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f17628b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f17630f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f17631j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f17632m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v4 f17633n;

    public u4(v4 v4Var, h hVar, int i10, long j10, boolean z7, h hVar2) {
        this.f17633n = v4Var;
        this.f17628b = hVar;
        this.f17629e = i10;
        this.f17630f = j10;
        this.f17631j = z7;
        this.f17632m = hVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v4 v4Var = this.f17633n;
        h hVar = this.f17628b;
        v4Var.D(hVar);
        v4.J(this.f17633n, this.f17628b, this.f17629e, this.f17630f, false, this.f17631j);
        u8.a();
        if (((b4) v4Var.f15046b).f17249t.y(null, a3.f17204u0)) {
            v4.I(v4Var, hVar, this.f17632m);
        }
    }
}