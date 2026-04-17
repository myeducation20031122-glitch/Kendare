package com.onesignal;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import com.google.android.gms.internal.ads.iy;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class j0 extends Service {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f11900n = new Object();

    /* renamed from: t, reason: collision with root package name */
    public static final HashMap f11901t = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public JobIntentService$JobServiceEngineImpl f11902b;

    /* renamed from: e, reason: collision with root package name */
    public JobIntentService$WorkEnqueuer f11903e;

    /* renamed from: f, reason: collision with root package name */
    public JobIntentService$CommandProcessor f11904f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11905j = false;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f11906m = new ArrayList();

    public static JobIntentService$WorkEnqueuer b(final Context context, final ComponentName componentName, boolean z7, final int i10, final boolean z10) {
        JobIntentService$WorkEnqueuer jobIntentService$WorkEnqueuer;
        Object obj = new Object(componentName, z10) { // from class: com.onesignal.JobIntentService$ComponentNameWithWakeful
            private ComponentName componentName;
            private boolean useWakefulService;

            {
                this.componentName = componentName;
                this.useWakefulService = z10;
            }
        };
        HashMap map = f11901t;
        JobIntentService$WorkEnqueuer jobIntentService$WorkEnqueuer2 = (JobIntentService$WorkEnqueuer) map.get(obj);
        if (jobIntentService$WorkEnqueuer2 == null) {
            if (Build.VERSION.SDK_INT < 26 || z10) {
                jobIntentService$WorkEnqueuer = new JobIntentService$WorkEnqueuer(context, componentName) { // from class: com.onesignal.JobIntentService$CompatWorkEnqueuer
                    private final Context mContext;
                    private final PowerManager.WakeLock mLaunchWakeLock;
                    boolean mLaunchingService;
                    private final PowerManager.WakeLock mRunWakeLock;
                    boolean mServiceProcessing;

                    {
                        super(componentName);
                        this.mContext = context.getApplicationContext();
                        PowerManager powerManager = (PowerManager) context.getSystemService("power");
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
                        this.mLaunchWakeLock = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                        PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
                        this.mRunWakeLock = wakeLockNewWakeLock2;
                        wakeLockNewWakeLock2.setReferenceCounted(false);
                    }

                    @Override // com.onesignal.JobIntentService$WorkEnqueuer
                    public void enqueueWork(Intent intent) {
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(this.mComponentName);
                        if (this.mContext.startService(intent2) != null) {
                            synchronized (this) {
                                try {
                                    if (!this.mLaunchingService) {
                                        this.mLaunchingService = true;
                                        if (!this.mServiceProcessing) {
                                            this.mLaunchWakeLock.acquire(60000L);
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    }

                    @Override // com.onesignal.JobIntentService$WorkEnqueuer
                    public void serviceProcessingFinished() {
                        synchronized (this) {
                            try {
                                if (this.mServiceProcessing) {
                                    if (this.mLaunchingService) {
                                        this.mLaunchWakeLock.acquire(60000L);
                                    }
                                    this.mServiceProcessing = false;
                                    this.mRunWakeLock.release();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }

                    @Override // com.onesignal.JobIntentService$WorkEnqueuer
                    public void serviceProcessingStarted() {
                        synchronized (this) {
                            try {
                                if (!this.mServiceProcessing) {
                                    this.mServiceProcessing = true;
                                    this.mRunWakeLock.acquire(600000L);
                                    this.mLaunchWakeLock.release();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }

                    @Override // com.onesignal.JobIntentService$WorkEnqueuer
                    public void serviceStartReceived() {
                        synchronized (this) {
                            this.mLaunchingService = false;
                        }
                    }
                };
            } else {
                if (!z7) {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
                jobIntentService$WorkEnqueuer = new JobIntentService$WorkEnqueuer(context, componentName, i10) { // from class: com.onesignal.JobIntentService$JobWorkEnqueuer
                    private final JobInfo mJobInfo;
                    private final JobScheduler mJobScheduler;

                    {
                        super(componentName);
                        ensureJobId(i10);
                        this.mJobInfo = new JobInfo.Builder(i10, this.mComponentName).setOverrideDeadline(0L).build();
                        this.mJobScheduler = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
                    }

                    @Override // com.onesignal.JobIntentService$WorkEnqueuer
                    public void enqueueWork(Intent intent) {
                        a6.a.w(this.mJobScheduler, this.mJobInfo, a6.a.g(intent));
                    }
                };
            }
            jobIntentService$WorkEnqueuer2 = jobIntentService$WorkEnqueuer;
            map.put(obj, jobIntentService$WorkEnqueuer2);
        }
        return jobIntentService$WorkEnqueuer2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.onesignal.JobIntentService$CommandProcessor] */
    public final void a(boolean z7) {
        if (this.f11904f == null) {
            this.f11904f = new AsyncTask<Void, Void, Void>() { // from class: com.onesignal.JobIntentService$CommandProcessor
                @Override // android.os.AsyncTask
                public Void doInBackground(Void... voidArr) throws Throwable {
                    JobIntentService$GenericWorkItem jobIntentService$GenericWorkItemDequeueWork;
                    while (true) {
                        j0 j0Var = this.this$0;
                        JobIntentService$JobServiceEngineImpl jobIntentService$JobServiceEngineImpl = j0Var.f11902b;
                        if (jobIntentService$JobServiceEngineImpl == null || (jobIntentService$GenericWorkItemDequeueWork = jobIntentService$JobServiceEngineImpl.dequeueWork()) == null) {
                            synchronized (j0Var.f11906m) {
                                try {
                                    jobIntentService$GenericWorkItemDequeueWork = j0Var.f11906m.size() > 0 ? (JobIntentService$GenericWorkItem) j0Var.f11906m.remove(0) : null;
                                } finally {
                                }
                            }
                        }
                        if (jobIntentService$GenericWorkItemDequeueWork == null) {
                            return null;
                        }
                        j0 j0Var2 = this.this$0;
                        Intent intent = jobIntentService$GenericWorkItemDequeueWork.getIntent();
                        FCMIntentJobService fCMIntentJobService = (FCMIntentJobService) j0Var2;
                        fCMIntentJobService.getClass();
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            z3.y(fCMIntentJobService);
                            q3.M(fCMIntentJobService, extras, new iy(fCMIntentJobService, 1));
                        }
                        jobIntentService$GenericWorkItemDequeueWork.complete();
                    }
                }

                @Override // android.os.AsyncTask
                public void onCancelled(Void r12) {
                    this.this$0.c();
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(Void r12) {
                    this.this$0.c();
                }
            };
            JobIntentService$WorkEnqueuer jobIntentService$WorkEnqueuer = this.f11903e;
            if (jobIntentService$WorkEnqueuer != null && z7) {
                jobIntentService$WorkEnqueuer.serviceProcessingStarted();
            }
            executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void c() {
        ArrayList arrayList = this.f11906m;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f11904f = null;
                    ArrayList arrayList2 = this.f11906m;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        a(false);
                    } else if (!this.f11905j) {
                        this.f11903e.serviceProcessingFinished();
                    }
                } finally {
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        JobIntentService$JobServiceEngineImpl jobIntentService$JobServiceEngineImpl = this.f11902b;
        if (jobIntentService$JobServiceEngineImpl != null) {
            return jobIntentService$JobServiceEngineImpl.compatGetBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f11902b = new JobIntentService$JobServiceEngineImpl(this);
            this.f11903e = null;
        }
        this.f11903e = b(this, new ComponentName(this, getClass()), false, 0, true);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        JobIntentService$CommandProcessor jobIntentService$CommandProcessor = this.f11904f;
        if (jobIntentService$CommandProcessor != null) {
            jobIntentService$CommandProcessor.cancel(false);
        }
        synchronized (this.f11906m) {
            this.f11905j = true;
            this.f11903e.serviceProcessingFinished();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, final int i11) {
        this.f11903e.serviceStartReceived();
        synchronized (this.f11906m) {
            ArrayList arrayList = this.f11906m;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new JobIntentService$GenericWorkItem(intent, i11) { // from class: com.onesignal.JobIntentService$CompatWorkItem
                final Intent mIntent;
                final int mStartId;

                {
                    this.mIntent = intent;
                    this.mStartId = i11;
                }

                @Override // com.onesignal.JobIntentService$GenericWorkItem
                public void complete() {
                    this.this$0.stopSelf(this.mStartId);
                }

                @Override // com.onesignal.JobIntentService$GenericWorkItem
                public Intent getIntent() {
                    return this.mIntent;
                }
            });
            a(true);
        }
        return 3;
    }
}