package a2;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.gms.internal.ads.kq;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import l1.p;
import l1.s;
import l1.t;
import z1.v;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends c7.b {

    /* renamed from: l, reason: collision with root package name */
    public static m f256l;

    /* renamed from: m, reason: collision with root package name */
    public static m f257m;

    /* renamed from: n, reason: collision with root package name */
    public static final Object f258n;

    /* renamed from: c, reason: collision with root package name */
    public final Context f259c;

    /* renamed from: d, reason: collision with root package name */
    public final z1.b f260d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f261e;

    /* renamed from: f, reason: collision with root package name */
    public final l2.a f262f;

    /* renamed from: g, reason: collision with root package name */
    public final List f263g;

    /* renamed from: h, reason: collision with root package name */
    public final b f264h;

    /* renamed from: i, reason: collision with root package name */
    public final j2.f f265i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f266j;

    /* renamed from: k, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f267k;

    static {
        z1.o.t("WorkManagerImpl");
        f256l = null;
        f257m = null;
        f258n = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0179 A[Catch: InstantiationException -> 0x02b1, IllegalAccessException -> 0x02c9, ClassNotFoundException -> 0x02e1, TryCatch #4 {ClassNotFoundException -> 0x02e1, IllegalAccessException -> 0x02c9, InstantiationException -> 0x02b1, blocks: (B:41:0x0171, B:45:0x018d, B:44:0x0179), top: B:94:0x0171 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(Context context, z1.b bVar, g.e eVar) throws Resources.NotFoundException {
        l1.o oVar;
        Executor executor;
        String name;
        String str;
        String str2;
        p1.d dVarE;
        ?? r62;
        int i10;
        c iVar;
        boolean z7 = context.getResources().getBoolean(2130968583);
        Context applicationContext = context.getApplicationContext();
        j2.i iVar2 = (j2.i) eVar.f12763e;
        int i11 = WorkDatabase.f1793k;
        Object obj = null;
        int i12 = 0;
        if (z7) {
            oVar = new l1.o(applicationContext, null);
            oVar.f14498h = true;
        } else {
            String str3 = k.f254a;
            oVar = new l1.o(applicationContext, "androidx.work.workdb");
            oVar.f14497g = new f(applicationContext, i12);
        }
        oVar.f14495e = iVar2;
        g gVar = new g();
        if (oVar.f14494d == null) {
            oVar.f14494d = new ArrayList();
        }
        oVar.f14494d.add(gVar);
        oVar.a(j.f247a);
        oVar.a(new i(applicationContext, 2, 3));
        oVar.a(j.f248b);
        oVar.a(j.f249c);
        oVar.a(new i(applicationContext, 5, 6));
        oVar.a(j.f250d);
        oVar.a(j.f251e);
        oVar.a(j.f252f);
        oVar.a(new i(applicationContext));
        oVar.a(new i(applicationContext, 10, 11));
        oVar.a(j.f253g);
        oVar.f14499i = false;
        oVar.f14500j = true;
        Context context2 = oVar.f14493c;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Class cls = oVar.f14491a;
        if (cls == null) {
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        Executor executor2 = oVar.f14495e;
        try {
            if (executor2 != null || oVar.f14496f != null) {
                if (executor2 != null && oVar.f14496f == null) {
                    oVar.f14496f = executor2;
                } else if (executor2 == null && (executor = oVar.f14496f) != null) {
                }
                if (oVar.f14497g == null) {
                    oVar.f14497g = new v6.e(18, obj);
                }
                String str4 = oVar.f14492b;
                p1.c cVar = oVar.f14497g;
                p8.c cVar2 = oVar.f14501k;
                ArrayList arrayList = oVar.f14494d;
                boolean z10 = oVar.f14498h;
                ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
                int i13 = (activityManager != null || activityManager.isLowRamDevice()) ? 2 : 3;
                Executor executor3 = oVar.f14495e;
                l1.a aVar = new l1.a(context2, str4, cVar, cVar2, arrayList, z10, i13, executor3, oVar.f14496f, oVar.f14499i, oVar.f14500j);
                name = cls.getPackage().getName();
                String canonicalName = cls.getCanonicalName();
                str = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
                if (name.isEmpty()) {
                    str2 = name + "." + str;
                } else {
                    str2 = str;
                }
                p pVar = (p) Class.forName(str2).newInstance();
                dVarE = pVar.e(aVar);
                pVar.f14505c = dVarE;
                if (dVarE instanceof s) {
                    ((s) dVarE).f14528n = aVar;
                }
                boolean z11 = i13 != 3;
                dVarE.setWriteAheadLoggingEnabled(z11);
                pVar.f14509g = arrayList;
                pVar.f14504b = executor3;
                new ArrayDeque();
                pVar.f14507e = z10;
                pVar.f14508f = z11;
                WorkDatabase workDatabase = (WorkDatabase) pVar;
                Context applicationContext2 = context.getApplicationContext();
                z1.o oVar2 = new z1.o(bVar.f19454f);
                synchronized (z1.o.class) {
                    z1.o.f19480e = oVar2;
                }
                c[] cVarArr = new c[2];
                int i14 = Build.VERSION.SDK_INT;
                String str5 = d.f232a;
                if (i14 >= 23) {
                    iVar = new d2.b(applicationContext2, this);
                    r62 = 1;
                    j2.g.a(applicationContext2, SystemJobService.class, true);
                    i10 = 0;
                    z1.o.r().p(str5, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
                } else {
                    try {
                        iVar = (c) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(applicationContext2);
                        z1.o.r().p(str5, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
                        r62 = 1;
                        i10 = 0;
                    } catch (Throwable th) {
                        r62 = 1;
                        i10 = 0;
                        z1.o.r().p(str5, "Unable to create GCM Scheduler", th);
                        iVar = null;
                    }
                    if (iVar == null) {
                        iVar = new c2.i(applicationContext2);
                        j2.g.a(applicationContext2, SystemAlarmService.class, r62);
                        z1.o.r().p(str5, "Created SystemAlarmScheduler", new Throwable[i10]);
                    }
                }
                cVarArr[i10] = iVar;
                cVarArr[r62] = new b2.b(applicationContext2, bVar, eVar, this);
                List listAsList = Arrays.asList(cVarArr);
                b bVar2 = new b(context, bVar, eVar, workDatabase, listAsList);
                Context applicationContext3 = context.getApplicationContext();
                this.f259c = applicationContext3;
                this.f260d = bVar;
                this.f262f = eVar;
                this.f261e = workDatabase;
                this.f263g = listAsList;
                this.f264h = bVar2;
                this.f265i = new j2.f(workDatabase);
                this.f266j = false;
                if (Build.VERSION.SDK_INT >= 24 && applicationContext3.isDeviceProtectedStorage()) {
                    throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
                }
                ((g.e) this.f262f).n(new j2.e(applicationContext3, this));
                return;
            }
            executor = n.b.f15243e;
            oVar.f14496f = executor;
            if (name.isEmpty()) {
            }
            p pVar2 = (p) Class.forName(str2).newInstance();
            dVarE = pVar2.e(aVar);
            pVar2.f14505c = dVarE;
            if (dVarE instanceof s) {
            }
            if (i13 != 3) {
            }
            dVarE.setWriteAheadLoggingEnabled(z11);
            pVar2.f14509g = arrayList;
            pVar2.f14504b = executor3;
            new ArrayDeque();
            pVar2.f14507e = z10;
            pVar2.f14508f = z11;
            WorkDatabase workDatabase2 = (WorkDatabase) pVar2;
            Context applicationContext22 = context.getApplicationContext();
            z1.o oVar22 = new z1.o(bVar.f19454f);
            synchronized (z1.o.class) {
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
        oVar.f14495e = executor;
        if (oVar.f14497g == null) {
        }
        String str42 = oVar.f14492b;
        p1.c cVar3 = oVar.f14497g;
        p8.c cVar22 = oVar.f14501k;
        ArrayList arrayList2 = oVar.f14494d;
        boolean z102 = oVar.f14498h;
        ActivityManager activityManager2 = (ActivityManager) context2.getSystemService("activity");
        if (activityManager2 != null) {
        }
        Executor executor32 = oVar.f14495e;
        l1.a aVar2 = new l1.a(context2, str42, cVar3, cVar22, arrayList2, z102, i13, executor32, oVar.f14496f, oVar.f14499i, oVar.f14500j);
        name = cls.getPackage().getName();
        String canonicalName2 = cls.getCanonicalName();
        if (name.isEmpty()) {
        }
        str = (name.isEmpty() ? canonicalName2 : canonicalName2.substring(name.length() + 1)).replace('.', '_') + "_Impl";
    }

    public static m r() {
        synchronized (f258n) {
            try {
                m mVar = f256l;
                if (mVar != null) {
                    return mVar;
                }
                return f257m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static m s(Context context) {
        m mVarR;
        synchronized (f258n) {
            try {
                mVarR = r();
                if (mVarR == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVarR;
    }

    public static void t(Context context, z1.b bVar) {
        synchronized (f258n) {
            try {
                m mVar = f256l;
                if (mVar != null && f257m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (mVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f257m == null) {
                        f257m = new m(applicationContext, bVar, new g.e(bVar.f19450b));
                    }
                    f256l = f257m;
                }
            } finally {
            }
        }
    }

    public final v p(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new e(this, null, list).j0();
    }

    public final v q(String str, List list) {
        return new e(this, str, list).j0();
    }

    public final void u() {
        synchronized (f258n) {
            try {
                this.f266j = true;
                BroadcastReceiver.PendingResult pendingResult = this.f267k;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f267k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v() {
        ArrayList arrayListE;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.f259c;
            String str = d2.b.f12295m;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null && (arrayListE = d2.b.e(context, jobScheduler)) != null && !arrayListE.isEmpty()) {
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    d2.b.a(jobScheduler, ((JobInfo) it.next()).getId());
                }
            }
        }
        kq kqVarN = this.f261e.n();
        Object obj = kqVarN.f6050a;
        p pVar = (p) obj;
        pVar.b();
        t tVar = (t) kqVarN.f6058i;
        q1.g gVarA = tVar.a();
        pVar.c();
        try {
            gVarA.f16112e.executeUpdateDelete();
            ((p) obj).h();
            pVar.f();
            tVar.c(gVarA);
            d.a(this.f260d, this.f261e, this.f263g);
        } catch (Throwable th) {
            pVar.f();
            tVar.c(gVarA);
            throw th;
        }
    }

    public final void w(String str, g.e eVar) {
        ((g.e) this.f262f).n(new l0.a(this, str, eVar, 9, 0));
    }

    public final void x(String str) {
        ((g.e) this.f262f).n(new j2.j(this, str, false));
    }
}