package c2;

import a2.m;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import j2.k;
import j2.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import z1.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h implements a2.a {
    public static final String N = o.t("SystemAlarmDispatcher");
    public g M;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2075b;

    /* renamed from: e, reason: collision with root package name */
    public final l2.a f2076e;

    /* renamed from: f, reason: collision with root package name */
    public final r f2077f;

    /* renamed from: j, reason: collision with root package name */
    public final a2.b f2078j;

    /* renamed from: m, reason: collision with root package name */
    public final m f2079m;

    /* renamed from: n, reason: collision with root package name */
    public final b f2080n;

    /* renamed from: t, reason: collision with root package name */
    public final Handler f2081t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f2082u;

    /* renamed from: w, reason: collision with root package name */
    public Intent f2083w;

    public h(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f2075b = applicationContext;
        this.f2080n = new b(applicationContext);
        this.f2077f = new r();
        m mVarS = m.s(context);
        this.f2079m = mVarS;
        a2.b bVar = mVarS.f264h;
        this.f2078j = bVar;
        this.f2076e = mVarS.f262f;
        bVar.b(this);
        this.f2082u = new ArrayList();
        this.f2083w = null;
        this.f2081t = new Handler(Looper.getMainLooper());
    }

    @Override // a2.a
    public final void a(String str, boolean z7) {
        String str2 = b.f2055j;
        Intent intent = new Intent(this.f2075b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z7);
        f(new c.d(this, intent, 0, 7));
    }

    public final void b(Intent intent, int i10) {
        o oVarR = o.r();
        String str = N;
        oVarR.p(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            o.r().u(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && d()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f2082u) {
            try {
                boolean z7 = !this.f2082u.isEmpty();
                this.f2082u.add(intent);
                if (!z7) {
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        if (this.f2081t.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final boolean d() {
        c();
        synchronized (this.f2082u) {
            try {
                Iterator it = this.f2082u.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        o.r().p(N, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f2078j.f(this);
        ScheduledExecutorService scheduledExecutorService = this.f2077f.f13619a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.M = null;
    }

    public final void f(Runnable runnable) {
        this.f2081t.post(runnable);
    }

    public final void g() {
        c();
        PowerManager.WakeLock wakeLockA = k.a(this.f2075b, "ProcessCommand");
        try {
            wakeLockA.acquire();
            ((g.e) this.f2079m.f262f).n(new f(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}