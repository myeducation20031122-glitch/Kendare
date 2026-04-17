package j2;

import android.content.Context;
import androidx.work.ListenableWorker;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    public static final String f13603t = z1.o.t("WorkForegroundRunnable");

    /* renamed from: b, reason: collision with root package name */
    public final k2.j f13604b = new k2.j();

    /* renamed from: e, reason: collision with root package name */
    public final Context f13605e;

    /* renamed from: f, reason: collision with root package name */
    public final i2.j f13606f;

    /* renamed from: j, reason: collision with root package name */
    public final ListenableWorker f13607j;

    /* renamed from: m, reason: collision with root package name */
    public final z1.i f13608m;

    /* renamed from: n, reason: collision with root package name */
    public final l2.a f13609n;

    public m(Context context, i2.j jVar, ListenableWorker listenableWorker, n nVar, l2.a aVar) {
        this.f13605e = context;
        this.f13606f = jVar;
        this.f13607j = listenableWorker;
        this.f13608m = nVar;
        this.f13609n = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f13606f.f13274q || k0.b.a()) {
            this.f13604b.k(null);
            return;
        }
        k2.j jVar = new k2.j();
        l2.a aVar = this.f13609n;
        ((g.e) aVar).A().execute(new l(this, jVar, 0));
        jVar.g(new l(this, jVar, 1), ((g.e) aVar).A());
    }
}