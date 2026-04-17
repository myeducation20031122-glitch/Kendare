package a2;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements a, h2.a {
    public static final String O = z1.o.t("Processor");

    /* renamed from: e, reason: collision with root package name */
    public final Context f224e;

    /* renamed from: f, reason: collision with root package name */
    public final z1.b f225f;

    /* renamed from: j, reason: collision with root package name */
    public final l2.a f226j;

    /* renamed from: m, reason: collision with root package name */
    public final WorkDatabase f227m;

    /* renamed from: u, reason: collision with root package name */
    public final List f230u;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f229t = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f228n = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public final HashSet f231w = new HashSet();
    public final ArrayList M = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public PowerManager.WakeLock f223b = null;
    public final Object N = new Object();

    public b(Context context, z1.b bVar, g.e eVar, WorkDatabase workDatabase, List list) {
        this.f224e = context;
        this.f225f = bVar;
        this.f226j = eVar;
        this.f227m = workDatabase;
        this.f230u = list;
    }

    public static boolean c(String str, o oVar) {
        boolean zIsDone;
        if (oVar == null) {
            z1.o.r().p(O, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        oVar.V = true;
        oVar.i();
        h7.a aVar = oVar.U;
        if (aVar != null) {
            zIsDone = aVar.isDone();
            oVar.U.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = oVar.f282n;
        if (listenableWorker == null || zIsDone) {
            z1.o.r().p(o.W, String.format("WorkSpec %s is already done. Not interrupting.", oVar.f281m), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        z1.o.r().p(O, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    @Override // a2.a
    public final void a(String str, boolean z7) {
        synchronized (this.N) {
            try {
                this.f229t.remove(str);
                z1.o.r().p(O, String.format("%s %s executed; reschedule = %s", b.class.getSimpleName(), str, Boolean.valueOf(z7)), new Throwable[0]);
                Iterator it = this.M.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(str, z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(a aVar) {
        synchronized (this.N) {
            this.M.add(aVar);
        }
    }

    public final boolean d(String str) {
        boolean zContains;
        synchronized (this.N) {
            zContains = this.f231w.contains(str);
        }
        return zContains;
    }

    public final boolean e(String str) {
        boolean z7;
        synchronized (this.N) {
            try {
                z7 = this.f229t.containsKey(str) || this.f228n.containsKey(str);
            } finally {
            }
        }
        return z7;
    }

    public final void f(a aVar) {
        synchronized (this.N) {
            this.M.remove(aVar);
        }
    }

    public final void g(String str, z1.h hVar) {
        synchronized (this.N) {
            try {
                z1.o.r().s(O, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
                o oVar = (o) this.f229t.remove(str);
                if (oVar != null) {
                    if (this.f223b == null) {
                        PowerManager.WakeLock wakeLockA = j2.k.a(this.f224e, "ProcessorForegroundLck");
                        this.f223b = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f228n.put(str, oVar);
                    Intent intentD = h2.c.d(this.f224e, str, hVar);
                    Context context = this.f224e;
                    Object obj = f0.f.f12651a;
                    if (Build.VERSION.SDK_INT >= 26) {
                        f0.d.b(context, intentD);
                    } else {
                        context.startService(intentD);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(String str, g.e eVar) {
        synchronized (this.N) {
            try {
                if (e(str)) {
                    z1.o.r().p(O, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                    return false;
                }
                Context context = this.f224e;
                z1.b bVar = this.f225f;
                l2.a aVar = this.f226j;
                WorkDatabase workDatabase = this.f227m;
                n nVar = new n();
                nVar.f276w = new g.e(12);
                nVar.f268b = context.getApplicationContext();
                nVar.f271j = aVar;
                nVar.f270f = this;
                nVar.f272m = bVar;
                nVar.f273n = workDatabase;
                nVar.f274t = str;
                nVar.f275u = this.f230u;
                if (eVar != null) {
                    nVar.f276w = eVar;
                }
                o oVarA = nVar.a();
                k2.j jVar = oVarA.T;
                jVar.g(new l0.a(this, str, jVar, 5, 0), ((g.e) this.f226j).A());
                this.f229t.put(str, oVarA);
                ((j2.i) ((g.e) this.f226j).f12763e).execute(oVarA);
                z1.o.r().p(O, String.format("%s: processing %s", b.class.getSimpleName(), str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.N) {
            try {
                if (!(!this.f228n.isEmpty())) {
                    Context context = this.f224e;
                    String str = h2.c.M;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f224e.startService(intent);
                    } catch (Throwable th) {
                        z1.o.r().q(O, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f223b;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f223b = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j(String str) {
        boolean zC;
        synchronized (this.N) {
            z1.o.r().p(O, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zC = c(str, (o) this.f228n.remove(str));
        }
        return zC;
    }

    public final boolean k(String str) {
        boolean zC;
        synchronized (this.N) {
            z1.o.r().p(O, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zC = c(str, (o) this.f229t.remove(str));
        }
        return zC;
    }
}