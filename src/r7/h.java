package r7;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16574b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f16575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f16576f;

    public h(j jVar, long j10, String str) {
        this.f16576f = jVar;
        this.f16574b = j10;
        this.f16575e = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        j jVar = this.f16576f;
        o oVar = jVar.f16591l;
        if (oVar != null && oVar.f16622e.get()) {
            return null;
        }
        jVar.f16587h.f16876b.i(this.f16574b, this.f16575e);
        return null;
    }
}