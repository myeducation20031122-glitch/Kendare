package x5;

import java.util.concurrent.Executor;
import z4.u0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p implements r, g, f, d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19023b;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f19024e;

    /* renamed from: f, reason: collision with root package name */
    public final c f19025f;

    /* renamed from: j, reason: collision with root package name */
    public final s f19026j;

    public /* synthetic */ p(Executor executor, c cVar, s sVar, int i10) {
        this.f19023b = i10;
        this.f19024e = executor;
        this.f19025f = cVar;
        this.f19026j = sVar;
    }

    @Override // x5.r
    public final void a(k kVar) {
        int i10 = this.f19023b;
        Executor executor = this.f19024e;
        switch (i10) {
            case 0:
                executor.execute(new u0(15, this, kVar));
                break;
            default:
                executor.execute(new u0(16, this, kVar));
                break;
        }
    }

    @Override // x5.f
    public final void f(Exception exc) {
        this.f19026j.m(exc);
    }

    @Override // x5.d
    public final void onCanceled() {
        this.f19026j.o();
    }

    @Override // x5.g
    public final void onSuccess(Object obj) {
        this.f19026j.n(obj);
    }
}