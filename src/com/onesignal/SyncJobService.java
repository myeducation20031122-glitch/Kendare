package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class SyncJobService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) throws InterruptedException {
        e3 e3VarD = e3.d();
        c3 c3Var = new c3(1);
        c3Var.f11746e = new WeakReference(this);
        c3Var.f11747f = jobParameters;
        e3VarD.getClass();
        z3.b(y3.f12233n, "OSBackground sync, calling initWithContext", null);
        z3.y(this);
        Thread thread = new Thread(c3Var, "OS_SYNCSRV_BG_SYNC");
        e3VarD.f11728b = thread;
        OSUtils.v(thread);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        e3 e3VarD = e3.d();
        Thread thread = e3VarD.f11728b;
        boolean z7 = false;
        if (thread != null && thread.isAlive()) {
            e3VarD.f11728b.interrupt();
            z7 = true;
        }
        z3.b(y3.f12233n, "SyncJobService onStopJob called, system conditions not available reschedule: " + z7, null);
        return z7;
    }
}