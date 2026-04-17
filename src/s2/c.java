package s2;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16690a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f16691b;

    /* renamed from: c, reason: collision with root package name */
    public final ReferenceQueue f16692c;

    /* renamed from: d, reason: collision with root package name */
    public x f16693d;

    public c() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new a(0));
        this.f16691b = new HashMap();
        this.f16692c = new ReferenceQueue();
        this.f16690a = false;
        executorServiceNewSingleThreadExecutor.execute(new androidx.activity.i(this, 17));
    }

    public final synchronized void a(q2.j jVar, y yVar) {
        b bVar = (b) this.f16691b.put(jVar, new b(jVar, yVar, this.f16692c, this.f16690a));
        if (bVar != null) {
            bVar.f16689c = null;
            bVar.clear();
        }
    }

    public final void b(b bVar) {
        e0 e0Var;
        synchronized (this) {
            this.f16691b.remove(bVar.f16687a);
            if (bVar.f16688b && (e0Var = bVar.f16689c) != null) {
                ((q) this.f16693d).f(bVar.f16687a, new y(e0Var, true, false, bVar.f16687a, this.f16693d));
            }
        }
    }
}