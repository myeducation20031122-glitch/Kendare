package o5;

import android.os.Handler;
import com.google.android.gms.internal.ads.dq0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f15774b;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f15775e;

    public o(c0 c0Var, c0 c0Var2) {
        this.f15774b = c0Var;
        this.f15775e = c0Var2;
    }

    @Override // o5.c0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n zzb() {
        p pVar = (p) this.f15774b.zzb();
        Handler handler = x.f15799a;
        dq0.f0(handler);
        return new n(pVar, handler, ((q) this.f15775e).zzb());
    }
}