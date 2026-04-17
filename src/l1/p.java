package l1;

import android.database.Cursor;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public volatile p1.a f14503a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f14504b;

    /* renamed from: c, reason: collision with root package name */
    public p1.d f14505c;

    /* renamed from: d, reason: collision with root package name */
    public final i f14506d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14507e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14508f;

    /* renamed from: g, reason: collision with root package name */
    public List f14509g;

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f14510h = new ReentrantReadWriteLock();

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f14511i = new ThreadLocal();

    public p() {
        new ConcurrentHashMap();
        this.f14506d = d();
    }

    public final void a() {
        if (!this.f14507e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((q1.b) this.f14505c.i()).f16098b.inTransaction() && this.f14511i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        p1.a aVarI = this.f14505c.i();
        this.f14506d.c(aVarI);
        ((q1.b) aVarI).a();
    }

    public abstract i d();

    public abstract p1.d e(a aVar);

    public final void f() {
        ((q1.b) this.f14505c.i()).b();
        if (((q1.b) this.f14505c.i()).f16098b.inTransaction()) {
            return;
        }
        i iVar = this.f14506d;
        if (iVar.f14480d.compareAndSet(false, true)) {
            iVar.f14479c.f14504b.execute(iVar.f14485i);
        }
    }

    public final Cursor g(p1.e eVar) {
        a();
        b();
        return ((q1.b) this.f14505c.i()).e(eVar);
    }

    public final void h() {
        ((q1.b) this.f14505c.i()).f();
    }
}