package o5;

import android.app.Application;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15731b;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f15732e;

    public /* synthetic */ g(c0 c0Var, int i10) {
        this.f15731b = i10;
        this.f15732e = c0Var;
    }

    @Override // o5.c0
    public final Object zzb() {
        int i10 = this.f15731b;
        c0 c0Var = this.f15732e;
        switch (i10) {
            case 0:
                return new f((Application) c0Var.zzb());
            default:
                return new p((Application) c0Var.zzb());
        }
    }
}