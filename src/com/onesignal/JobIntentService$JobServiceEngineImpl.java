package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
final class JobIntentService$JobServiceEngineImpl extends JobServiceEngine implements JobIntentService$CompatJobEngine {
    static final boolean DEBUG = false;
    static final String TAG = "JobServiceEngineImpl";
    final Object mLock;
    JobParameters mParams;
    final j0 mService;

    public final class WrapperWorkItem implements JobIntentService$GenericWorkItem {
        final JobWorkItem mJobWork;

        public WrapperWorkItem(JobWorkItem jobWorkItem) {
            this.mJobWork = jobWorkItem;
        }

        @Override // com.onesignal.JobIntentService$GenericWorkItem
        public void complete() {
            String str;
            String str2;
            synchronized (JobIntentService$JobServiceEngineImpl.this.mLock) {
                JobParameters jobParameters = JobIntentService$JobServiceEngineImpl.this.mParams;
                if (jobParameters != null) {
                    try {
                        a6.a.v(jobParameters, this.mJobWork);
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                        str = JobIntentService$JobServiceEngineImpl.TAG;
                        str2 = "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!";
                        Log.e(str, str2, e);
                    } catch (SecurityException e11) {
                        e = e11;
                        str = JobIntentService$JobServiceEngineImpl.TAG;
                        str2 = "SecurityException: Failed to run mParams.completeWork(mJobWork)!";
                        Log.e(str, str2, e);
                    }
                }
            }
        }

        @Override // com.onesignal.JobIntentService$GenericWorkItem
        public Intent getIntent() {
            return a6.a.h(this.mJobWork);
        }
    }

    public JobIntentService$JobServiceEngineImpl(j0 j0Var) {
        super(j0Var);
        this.mLock = new Object();
        this.mService = j0Var;
    }

    @Override // com.onesignal.JobIntentService$CompatJobEngine
    public IBinder compatGetBinder() {
        return a6.a.j(this);
    }

    @Override // com.onesignal.JobIntentService$CompatJobEngine
    public JobIntentService$GenericWorkItem dequeueWork() {
        synchronized (this.mLock) {
            JobParameters jobParameters = this.mParams;
            if (jobParameters == null) {
                return null;
            }
            try {
                JobWorkItem jobWorkItemF = a6.a.f(jobParameters);
                if (jobWorkItemF == null) {
                    return null;
                }
                a6.a.h(jobWorkItemF).setExtrasClassLoader(this.mService.getClassLoader());
                return new WrapperWorkItem(jobWorkItemF);
            } catch (SecurityException e10) {
                Log.e(TAG, "Failed to run mParams.dequeueWork()!", e10);
                return null;
            }
        }
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStartJob(JobParameters jobParameters) {
        this.mParams = jobParameters;
        this.mService.a(DEBUG);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStopJob(JobParameters jobParameters) {
        JobIntentService$CommandProcessor jobIntentService$CommandProcessor = this.mService.f11904f;
        if (jobIntentService$CommandProcessor != null) {
            jobIntentService$CommandProcessor.cancel(DEBUG);
        }
        synchronized (this.mLock) {
            this.mParams = null;
        }
        return true;
    }
}