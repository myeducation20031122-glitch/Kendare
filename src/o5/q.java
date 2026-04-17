package o5;

import android.app.Application;
import android.os.Handler;
import com.google.android.gms.internal.ads.dq0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f15777b;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f15778e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f15779f;

    /* renamed from: j, reason: collision with root package name */
    public final c0 f15780j;

    /* renamed from: m, reason: collision with root package name */
    public final c0 f15781m;

    /* renamed from: n, reason: collision with root package name */
    public final c0 f15782n;

    public q(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4, c0 c0Var5, c0 c0Var6) {
        this.f15777b = c0Var;
        this.f15778e = c0Var2;
        this.f15779f = c0Var3;
        this.f15780j = c0Var4;
        this.f15781m = c0Var5;
        this.f15782n = c0Var6;
    }

    @Override // o5.c0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final android.support.v4.media.b zzb() {
        Application application = (Application) this.f15777b.zzb();
        p pVar = (p) this.f15778e.zzb();
        Handler handler = x.f15799a;
        dq0.f0(handler);
        w wVar = x.f15800b;
        dq0.f0(wVar);
        return new android.support.v4.media.b(application, pVar, handler, wVar, (e0) this.f15779f.zzb(), ((e) this.f15780j).zzb(), (j) this.f15781m.zzb(), (f) this.f15782n.zzb());
    }
}