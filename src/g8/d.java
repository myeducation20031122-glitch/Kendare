package g8;

import android.content.Context;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k0.n;
import t5.j4;
import x5.s;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements f, g {

    /* renamed from: f, reason: collision with root package name */
    public static final b f13086f = new b();

    /* renamed from: a, reason: collision with root package name */
    public final i8.c f13087a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f13088b;

    /* renamed from: c, reason: collision with root package name */
    public final i8.c f13089c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f13090d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f13091e;

    public d(Context context, String str, Set set, i8.c cVar) {
        i7.b bVar = new i7.b(context, str);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f13086f);
        this.f13087a = bVar;
        this.f13090d = set;
        this.f13091e = threadPoolExecutor;
        this.f13089c = cVar;
        this.f13088b = context;
    }

    public final synchronized int a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        h hVar = (h) this.f13087a.get();
        if (!hVar.i(jCurrentTimeMillis)) {
            return 1;
        }
        hVar.g();
        return 3;
    }

    public final s b() {
        return (Build.VERSION.SDK_INT >= 24 ? n.a(this.f13088b) : true) ^ true ? j4.i("") : j4.c(new c(this, 0), this.f13091e);
    }

    public final void c() {
        if (this.f13090d.size() <= 0) {
            j4.i(null);
            return;
        }
        if (!(Build.VERSION.SDK_INT >= 24 ? n.a(this.f13088b) : true)) {
            j4.i(null);
        } else {
            j4.c(new c(this, 1), this.f13091e);
        }
    }
}