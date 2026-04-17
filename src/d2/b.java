package d2;

import a2.l;
import a2.m;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import i2.e;
import i2.j;
import j2.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import z1.d;
import z1.o;
import z1.p;
import z1.x;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements a2.c {

    /* renamed from: m, reason: collision with root package name */
    public static final String f12295m = o.t("SystemJobScheduler");

    /* renamed from: b, reason: collision with root package name */
    public final Context f12296b;

    /* renamed from: e, reason: collision with root package name */
    public final JobScheduler f12297e;

    /* renamed from: f, reason: collision with root package name */
    public final m f12298f;

    /* renamed from: j, reason: collision with root package name */
    public final a f12299j;

    public b(Context context, m mVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f12296b = context;
        this.f12298f = mVar;
        this.f12297e = jobScheduler;
        this.f12299j = aVar;
    }

    public static void a(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            o.r().q(f12295m, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList c(Context context, JobScheduler jobScheduler, String str) {
        String string;
        ArrayList arrayListE = e(context, jobScheduler);
        if (arrayListE == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            PersistableBundle extras = jobInfo.getExtras();
            if (extras != null) {
                string = extras.containsKey("EXTRA_WORK_SPEC_ID") ? extras.getString("EXTRA_WORK_SPEC_ID") : null;
            }
            if (str.equals(string)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            o.r().q(f12295m, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // a2.c
    public final void b(String str) {
        Context context = this.f12296b;
        JobScheduler jobScheduler = this.f12297e;
        ArrayList arrayListC = c(context, jobScheduler, str);
        if (arrayListC == null || arrayListC.isEmpty()) {
            return;
        }
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.f12298f.f261e.k().M(str);
    }

    @Override // a2.c
    public final void d(j... jVarArr) {
        int iA;
        ArrayList arrayListC;
        int iA2;
        m mVar = this.f12298f;
        WorkDatabase workDatabase = mVar.f261e;
        f fVar = new f(workDatabase);
        for (j jVar : jVarArr) {
            workDatabase.c();
            try {
                j jVarI = workDatabase.n().i(jVar.f13258a);
                String str = f12295m;
                if (jVarI == null) {
                    o.r().u(str, "Skipping scheduling " + jVar.f13258a + " because it's no longer in the DB", new Throwable[0]);
                } else if (jVarI.f13259b != x.f19490b) {
                    o.r().u(str, "Skipping scheduling " + jVar.f13258a + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    e eVarD = workDatabase.k().D(jVar.f13258a);
                    if (eVarD != null) {
                        iA = eVarD.f13249b;
                    } else {
                        mVar.f260d.getClass();
                        iA = fVar.a(mVar.f260d.f19455g);
                    }
                    if (eVarD == null) {
                        mVar.f261e.k().G(new e(jVar.f13258a, iA));
                    }
                    g(jVar, iA);
                    if (Build.VERSION.SDK_INT == 23 && (arrayListC = c(this.f12296b, this.f12297e, jVar.f13258a)) != null) {
                        int iIndexOf = arrayListC.indexOf(Integer.valueOf(iA));
                        if (iIndexOf >= 0) {
                            arrayListC.remove(iIndexOf);
                        }
                        if (arrayListC.isEmpty()) {
                            mVar.f260d.getClass();
                            iA2 = fVar.a(mVar.f260d.f19455g);
                        } else {
                            iA2 = ((Integer) arrayListC.get(0)).intValue();
                        }
                        g(jVar, iA2);
                    }
                }
                workDatabase.h();
            } finally {
                workDatabase.f();
            }
        }
    }

    @Override // a2.c
    public final boolean f() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        if (r6 < 26) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(j jVar, int i10) {
        int i11;
        JobScheduler jobScheduler = this.f12297e;
        a aVar = this.f12299j;
        aVar.getClass();
        z1.c cVar = jVar.f13267j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", jVar.f13258a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", jVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i10, aVar.f12294a).setRequiresCharging(cVar.f19460b).setRequiresDeviceIdle(cVar.f19461c).setExtras(persistableBundle);
        p pVar = cVar.f19459a;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 30 || pVar != p.f19487n) {
            int iOrdinal = pVar.ordinal();
            if (iOrdinal == 0) {
                i11 = 0;
            } else if (iOrdinal == 1) {
                i11 = 1;
            } else if (iOrdinal == 2) {
                i11 = 2;
            } else if (iOrdinal != 3) {
                i11 = 4;
                if (iOrdinal == 4) {
                }
                o.r().p(a.f12293b, String.format("API version too low. Cannot convert network type value %s", pVar), new Throwable[0]);
                i11 = 1;
            } else {
                if (i12 >= 24) {
                    i11 = 3;
                }
                o.r().p(a.f12293b, String.format("API version too low. Cannot convert network type value %s", pVar), new Throwable[0]);
                i11 = 1;
            }
            extras.setRequiredNetworkType(i11);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!cVar.f19461c) {
            extras.setBackoffCriteria(jVar.f13270m, jVar.f13269l == 2 ? 0 : 1);
        }
        long jMax = Math.max(jVar.a() - System.currentTimeMillis(), 0L);
        if (i12 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!jVar.f13274q) {
            extras.setImportantWhileForeground(true);
        }
        if (i12 >= 24 && cVar.f19466h.f19469a.size() > 0) {
            Iterator it = cVar.f19466h.f19469a.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                boolean z7 = dVar.f19468b;
                l.C();
                l.r(extras, l.b(dVar.f19467a, z7 ? 1 : 0));
            }
            l.q(extras, cVar.f19464f);
            l.D(extras, cVar.f19465g);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f19462d);
            extras.setRequiresStorageNotLow(cVar.f19463e);
        }
        boolean z10 = jVar.f13268k > 0;
        if (k0.b.a() && jVar.f13274q && !z10) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        o oVarR = o.r();
        Object[] objArr = {jVar.f13258a, Integer.valueOf(i10)};
        String str = f12295m;
        oVarR.p(str, String.format("Scheduling work ID %s Job ID %s", objArr), new Throwable[0]);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                o.r().u(str, String.format("Unable to schedule work ID %s", jVar.f13258a), new Throwable[0]);
                if (jVar.f13274q && jVar.f13275r == 1) {
                    jVar.f13274q = false;
                    o.r().p(str, String.format("Scheduling a non-expedited job (work ID %s)", jVar.f13258a), new Throwable[0]);
                    g(jVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList arrayListE = e(this.f12296b, jobScheduler);
            int size = arrayListE != null ? arrayListE.size() : 0;
            Locale locale = Locale.getDefault();
            Object[] objArr2 = new Object[3];
            objArr2[0] = Integer.valueOf(size);
            m mVar = this.f12298f;
            objArr2[1] = Integer.valueOf(mVar.f261e.n().e().size());
            z1.b bVar = mVar.f260d;
            int i13 = Build.VERSION.SDK_INT;
            int i14 = bVar.f19456h;
            if (i13 == 23) {
                i14 /= 2;
            }
            objArr2[2] = Integer.valueOf(i14);
            String str2 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr2);
            o.r().q(str, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e10);
        } catch (Throwable th) {
            o.r().q(str, String.format("Unable to schedule %s", jVar), th);
        }
    }
}