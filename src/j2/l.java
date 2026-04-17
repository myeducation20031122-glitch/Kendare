package j2;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;
import o0.s1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13600b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k2.j f13601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f13602f;

    public /* synthetic */ l(m mVar, k2.j jVar, int i10) {
        this.f13600b = i10;
        this.f13602f = mVar;
        this.f13601e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f13600b;
        k2.j jVar = this.f13601e;
        m mVar = this.f13602f;
        switch (i10) {
            case 0:
                jVar.m(mVar.f13607j.getForegroundInfoAsync());
                return;
            default:
                try {
                    z1.h hVar = (z1.h) jVar.get();
                    if (hVar == null) {
                        throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", mVar.f13606f.f13260c));
                    }
                    z1.o oVarR = z1.o.r();
                    String str = m.f13603t;
                    Object[] objArr = new Object[1];
                    i2.j jVar2 = mVar.f13606f;
                    ListenableWorker listenableWorker = mVar.f13607j;
                    objArr[0] = jVar2.f13260c;
                    oVarR.p(str, String.format("Updating notification for %s", objArr), new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    k2.j jVar3 = mVar.f13604b;
                    z1.i iVar = mVar.f13608m;
                    Context context = mVar.f13605e;
                    UUID id = listenableWorker.getId();
                    n nVar = (n) iVar;
                    nVar.getClass();
                    k2.j jVar4 = new k2.j();
                    ((g.e) nVar.f13610a).n(new s1(nVar, jVar4, id, hVar, context, 1));
                    jVar3.m(jVar4);
                    return;
                } catch (Throwable th) {
                    mVar.f13604b.l(th);
                    return;
                }
        }
    }
}