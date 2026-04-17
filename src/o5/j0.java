package o5;

import android.app.Application;
import android.os.Handler;
import com.google.android.gms.internal.ads.dq0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j0 implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f15757b;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f15758e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f15759f;

    /* renamed from: j, reason: collision with root package name */
    public final c0 f15760j;

    /* renamed from: m, reason: collision with root package name */
    public final c0 f15761m;

    /* renamed from: n, reason: collision with root package name */
    public final c0 f15762n;

    /* renamed from: t, reason: collision with root package name */
    public final c0 f15763t;

    public j0(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4, c0 c0Var5, c0 c0Var6, c0 c0Var7) {
        this.f15757b = c0Var;
        this.f15758e = c0Var2;
        this.f15759f = c0Var3;
        this.f15760j = c0Var4;
        this.f15761m = c0Var5;
        this.f15762n = c0Var6;
        this.f15763t = c0Var7;
    }

    @Override // o5.c0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a2.n zzb() {
        Application application = (Application) this.f15757b.zzb();
        b bVar = (b) this.f15758e.zzb();
        Handler handler = x.f15799a;
        dq0.f0(handler);
        w wVar = x.f15800b;
        dq0.f0(wVar);
        return new a2.n(application, bVar, handler, wVar, (f) this.f15759f.zzb(), (k) this.f15760j.zzb(), ((h0) this.f15761m).zzb(), ((a) this.f15762n).zzb(), (e0) this.f15763t.zzb());
    }
}