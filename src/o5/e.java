package o5;

import android.app.Application;
import com.google.android.gms.internal.ads.dq0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f15724b;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f15725e;

    public e(c0 c0Var, c0 c0Var2) {
        this.f15724b = c0Var;
        this.f15725e = c0Var2;
    }

    @Override // o5.c0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d zzb() {
        Application application = (Application) this.f15724b.zzb();
        f fVar = (f) this.f15725e.zzb();
        w wVar = x.f15800b;
        dq0.f0(wVar);
        return new d(application, fVar, wVar, 0);
    }
}