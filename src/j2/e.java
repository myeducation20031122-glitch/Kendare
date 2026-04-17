package j2;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import com.google.android.gms.internal.ads.a9;
import com.google.android.gms.internal.ads.kq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import z1.x;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final String f13582j = z1.o.t("ForceStopRunnable");

    /* renamed from: m, reason: collision with root package name */
    public static final long f13583m = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: b, reason: collision with root package name */
    public final Context f13584b;

    /* renamed from: e, reason: collision with root package name */
    public final a2.m f13585e;

    /* renamed from: f, reason: collision with root package name */
    public int f13586f = 0;

    public e(Context context, a2.m mVar) {
        this.f13584b = context.getApplicationContext();
        this.f13585e = mVar;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i10 = k0.b.a() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long jCurrentTimeMillis = System.currentTimeMillis() + f13583m;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z7;
        WorkDatabase workDatabase;
        PendingIntent broadcast;
        String string;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 1;
        Context context = this.f13584b;
        a2.m mVar = this.f13585e;
        if (i10 >= 23) {
            String str = d2.b.f12295m;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            ArrayList arrayListE = d2.b.e(context, jobScheduler);
            g.e eVarK = mVar.f261e.k();
            eVarK.getClass();
            l1.r rVarA = l1.r.a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
            ((l1.p) eVarK.f12763e).b();
            Cursor cursorG = ((l1.p) eVarK.f12763e).g(rVarA);
            try {
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList.add(cursorG.getString(0));
                }
                HashSet hashSet = new HashSet(arrayListE != null ? arrayListE.size() : 0);
                if (arrayListE != null && !arrayListE.isEmpty()) {
                    Iterator it = arrayListE.iterator();
                    while (it.hasNext()) {
                        JobInfo jobInfo = (JobInfo) it.next();
                        PersistableBundle extras = jobInfo.getExtras();
                        if (extras != null) {
                            string = extras.containsKey("EXTRA_WORK_SPEC_ID") ? extras.getString("EXTRA_WORK_SPEC_ID") : null;
                        }
                        if (TextUtils.isEmpty(string)) {
                            d2.b.a(jobScheduler, jobInfo.getId());
                        } else {
                            hashSet.add(string);
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!hashSet.contains((String) it2.next())) {
                            z1.o.r().p(d2.b.f12295m, "Reconciling jobs", new Throwable[0]);
                            z7 = true;
                            break;
                        }
                    } else {
                        z7 = false;
                        break;
                    }
                }
                if (z7) {
                    workDatabase = mVar.f261e;
                    workDatabase.c();
                    try {
                        kq kqVarN = workDatabase.n();
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            kqVarN.m(-1L, (String) it3.next());
                        }
                        workDatabase.h();
                        workDatabase.f();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } finally {
                cursorG.close();
                rVarA.e();
            }
        } else {
            z7 = false;
        }
        workDatabase = mVar.f261e;
        kq kqVarN2 = workDatabase.n();
        g2.h hVarM = workDatabase.m();
        workDatabase.c();
        try {
            ArrayList arrayListD = kqVarN2.d();
            boolean z10 = !arrayListD.isEmpty();
            if (z10) {
                Iterator it4 = arrayListD.iterator();
                while (it4.hasNext()) {
                    i2.j jVar = (i2.j) it4.next();
                    x xVar = x.f19490b;
                    String[] strArr = new String[i11];
                    strArr[0] = jVar.f13258a;
                    kqVarN2.q(xVar, strArr);
                    kqVarN2.m(-1L, jVar.f13258a);
                    i11 = 1;
                }
            }
            hVarM.g();
            workDatabase.h();
            workDatabase.f();
            boolean z11 = z10 || z7;
            Long lB = mVar.f265i.f13587a.j().b("reschedule_needed");
            String str2 = f13582j;
            if (lB != null && lB.longValue() == 1) {
                z1.o.r().p(str2, "Rescheduling Workers.", new Throwable[0]);
                mVar.v();
                f fVar = mVar.f265i;
                fVar.getClass();
                fVar.f13587a.j().e(new i2.d("reschedule_needed", 0L));
                return;
            }
            try {
                int i12 = k0.b.a() ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                broadcast = PendingIntent.getBroadcast(context, -1, intent, i12);
            } catch (IllegalArgumentException e10) {
                e = e10;
                z1.o.r().u(str2, "Ignoring exception", e);
                z1.o.r().p(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                mVar.v();
                return;
            } catch (SecurityException e11) {
                e = e11;
                z1.o.r().u(str2, "Ignoring exception", e);
                z1.o.r().p(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                mVar.v();
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i13 = 0; i13 < historicalProcessExitReasons.size(); i13++) {
                        if (a9.g(historicalProcessExitReasons.get(i13)).getReason() == 10) {
                            z1.o.r().p(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                            mVar.v();
                            return;
                        }
                    }
                }
                if (z11) {
                    return;
                }
                z1.o.r().p(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                a2.d.a(mVar.f260d, mVar.f261e, mVar.f263g);
                return;
            }
            if (broadcast == null) {
                c(context);
                z1.o.r().p(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                mVar.v();
                return;
            }
            if (z11) {
            }
        } finally {
            workDatabase.f();
        }
    }

    public final boolean b() {
        z1.b bVar = this.f13585e.f260d;
        bVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f13582j;
        if (zIsEmpty) {
            z1.o.r().p(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zA = h.a(this.f13584b, bVar);
        z1.o.r().p(str, String.format("Is default app process = %s", Boolean.valueOf(zA)), new Throwable[0]);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f13582j;
        a2.m mVar = this.f13585e;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                a2.k.a(this.f13584b);
                z1.o.r().p(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                    int i10 = this.f13586f + 1;
                    this.f13586f = i10;
                    if (i10 >= 3) {
                        z1.o.r().q(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        mVar.f260d.getClass();
                        throw illegalStateException;
                    }
                    z1.o.r().p(str, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                    try {
                        Thread.sleep(this.f13586f * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            mVar.u();
        }
    }
}