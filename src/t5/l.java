package t5;

import android.os.Handler;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class l {

    /* renamed from: d, reason: collision with root package name */
    public static volatile m5.b f17472d;

    /* renamed from: a, reason: collision with root package name */
    public final h4 f17473a;

    /* renamed from: b, reason: collision with root package name */
    public final z4.u0 f17474b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f17475c;

    public l(h4 h4Var) {
        fc.t.k(h4Var);
        this.f17473a = h4Var;
        this.f17474b = new z4.u0(5, this, h4Var);
    }

    public final void a() {
        this.f17475c = 0L;
        d().removeCallbacks(this.f17474b);
    }

    public abstract void b();

    public final void c(long j10) {
        a();
        if (j10 >= 0) {
            ((e5.b) this.f17473a.d()).getClass();
            this.f17475c = System.currentTimeMillis();
            if (d().postDelayed(this.f17474b, j10)) {
                return;
            }
            this.f17473a.c().f17397n.b(Long.valueOf(j10), "Failed to schedule delayed post. time");
        }
    }

    public final Handler d() {
        m5.b bVar;
        if (f17472d != null) {
            return f17472d;
        }
        synchronized (l.class) {
            try {
                if (f17472d == null) {
                    f17472d = new m5.b(this.f17473a.b().getMainLooper());
                }
                bVar = f17472d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}