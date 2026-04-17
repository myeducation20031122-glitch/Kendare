package w5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.y;
import com.google.android.gms.internal.ads.ic1;
import e5.d;
import e5.e;
import fc.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import t5.n5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f18682n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f18683o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f18684p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f18685a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f18686b;

    /* renamed from: c, reason: collision with root package name */
    public int f18687c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f18688d;

    /* renamed from: e, reason: collision with root package name */
    public long f18689e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f18690f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18691g;

    /* renamed from: h, reason: collision with root package name */
    public q5.a f18692h;

    /* renamed from: i, reason: collision with root package name */
    public final e5.b f18693i;

    /* renamed from: j, reason: collision with root package name */
    public final String f18694j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f18695k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f18696l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f18697m;

    public a(Context context) {
        String str;
        ApplicationInfo applicationInfoF;
        String packageName = context.getPackageName();
        this.f18685a = new Object();
        this.f18687c = 0;
        this.f18690f = new HashSet();
        this.f18691g = true;
        this.f18693i = e5.b.f12525a;
        this.f18695k = new HashMap();
        this.f18696l = new AtomicInteger(0);
        t.h("WakeLock: wakeLockName must not be empty", "wake:com.google.firebase.iid.WakeLockHolder");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f18692h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f18694j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f18694j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new y(sb.toString());
        }
        this.f18686b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (e.b(context)) {
            int i10 = d.f12531a;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    applicationInfoF = g5.b.a(context).f(0, packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    str = "Could not find package: ";
                }
                if (applicationInfoF == null) {
                    str = "Could not get applicationInfo from package: ";
                    Log.e("WorkSourceUtil", str.concat(packageName));
                } else {
                    int i11 = applicationInfoF.uid;
                    workSource = new WorkSource();
                    e.a(workSource, i11, packageName);
                }
            }
            if (workSource != null) {
                try {
                    this.f18686b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                    Log.wtf("WakeLock", e10.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f18683o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f18684p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f18683o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f18683o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f18697m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a(long j10) {
        this.f18696l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f18682n), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f18685a) {
            try {
                if (!b()) {
                    this.f18692h = q5.a.f16249b;
                    this.f18686b.acquire();
                    this.f18693i.getClass();
                    SystemClock.elapsedRealtime();
                }
                int i10 = 1;
                this.f18687c++;
                if (this.f18691g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f18695k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f18695k.put(null, bVar);
                }
                bVar.f18698a++;
                this.f18693i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j11 > this.f18689e) {
                    this.f18689e = j11;
                    ScheduledFuture scheduledFuture = this.f18688d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f18688d = this.f18697m.schedule(new n5(this, i10), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z7;
        synchronized (this.f18685a) {
            z7 = this.f18687c > 0;
        }
        return z7;
    }

    public final void c() {
        if (this.f18696l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f18694j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f18685a) {
            try {
                if (this.f18691g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f18695k.containsKey(null)) {
                    b bVar = (b) this.f18695k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f18698a - 1;
                        bVar.f18698a = i10;
                        if (i10 == 0) {
                            this.f18695k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f18694j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f18690f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        ic1.v(arrayList.get(0));
        throw null;
    }

    public final void e() {
        synchronized (this.f18685a) {
            try {
                if (b()) {
                    if (this.f18691g) {
                        int i10 = this.f18687c - 1;
                        this.f18687c = i10;
                        if (i10 > 0) {
                            return;
                        }
                    } else {
                        this.f18687c = 0;
                    }
                    d();
                    Iterator it = this.f18695k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f18698a = 0;
                    }
                    this.f18695k.clear();
                    ScheduledFuture scheduledFuture = this.f18688d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f18688d = null;
                        this.f18689e = 0L;
                    }
                    if (this.f18686b.isHeld()) {
                        try {
                            try {
                                this.f18686b.release();
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.f18694j).concat(" failed to release!"), e10);
                                if (this.f18692h != null) {
                                }
                            }
                        } finally {
                            if (this.f18692h != null) {
                                this.f18692h = null;
                            }
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f18694j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}