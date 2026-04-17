package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c3 extends j {

    /* renamed from: e, reason: collision with root package name */
    public WeakReference f11746e;

    /* renamed from: f, reason: collision with root package name */
    public JobParameters f11747f;

    @Override // com.onesignal.j
    public final void a() {
        z3.b(y3.f12233n, "LollipopSyncRunnable:JobFinished needsJobReschedule: " + e3.d().f11727a, null);
        boolean z7 = e3.d().f11727a;
        e3.d().f11727a = false;
        WeakReference weakReference = this.f11746e;
        if (weakReference.get() != null) {
            ((JobService) weakReference.get()).jobFinished(this.f11747f, z7);
        }
    }
}