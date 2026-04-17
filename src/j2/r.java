package j2;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final String f13618e = z1.o.t("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f13619a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f13620b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f13621c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13622d;

    public r() {
        l0.k kVar = new l0.k(this);
        this.f13620b = new HashMap();
        this.f13621c = new HashMap();
        this.f13622d = new Object();
        this.f13619a = Executors.newSingleThreadScheduledExecutor(kVar);
    }

    public final void a(String str, p pVar) {
        synchronized (this.f13622d) {
            z1.o.r().p(f13618e, String.format("Starting timer for %s", str), new Throwable[0]);
            b(str);
            q qVar = new q(this, str);
            this.f13620b.put(str, qVar);
            this.f13621c.put(str, pVar);
            this.f13619a.schedule(qVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f13622d) {
            try {
                if (((q) this.f13620b.remove(str)) != null) {
                    z1.o.r().p(f13618e, String.format("Stopping timer for %s", str), new Throwable[0]);
                    this.f13621c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}