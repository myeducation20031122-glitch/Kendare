package com.onesignal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f11726c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f11727a;

    /* renamed from: b, reason: collision with root package name */
    public Thread f11728b;

    public final void a(Context context) {
        z3.b(y3.f12233n, getClass().getSimpleName().concat(" cancel background sync"), null);
        synchronized (f11726c) {
            ((JobScheduler) context.getSystemService("jobscheduler")).cancel(2071862118);
        }
    }

    public final void b(Context context, long j10) {
        synchronized (f11726c) {
            c(context, j10);
        }
    }

    public final void c(Context context, long j10) {
        Thread thread;
        y3 y3Var = y3.f12234t;
        z3.b(y3Var, "OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j10, null);
        Iterator<JobInfo> it = ((JobScheduler) context.getSystemService("jobscheduler")).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == 2071862118 && (thread = this.f11728b) != null && thread.isAlive()) {
                z3.b(y3Var, "OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!", null);
                this.f11727a = true;
                return;
            }
        }
        JobInfo.Builder builder = new JobInfo.Builder(2071862118, new ComponentName(context, (Class<?>) SyncJobService.class));
        builder.setMinimumLatency(j10).setRequiredNetworkType(1);
        if (q3.g(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0) {
            builder.setPersisted(true);
        }
        try {
            int iSchedule = ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
            z3.b(y3.f12232m, "OSBackgroundSync scheduleSyncServiceAsJob:result: " + iSchedule, null);
        } catch (NullPointerException e10) {
            z3.b(y3.f12230f, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e10);
        }
    }
}