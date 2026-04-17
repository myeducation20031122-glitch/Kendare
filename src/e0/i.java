package e0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public Object f12379b;

    /* renamed from: e, reason: collision with root package name */
    public Activity f12380e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12381f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12382j = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12383m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12384n = false;

    public i(Activity activity) {
        this.f12380e = activity;
        this.f12381f = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f12380e == activity) {
            this.f12380e = null;
            this.f12383m = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f12383m || this.f12384n || this.f12382j) {
            return;
        }
        Object obj = this.f12379b;
        try {
            Object obj2 = j.f12391c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f12381f) {
                j.f12395g.postAtFrontOfQueue(new m.k(j.f12390b.get(activity), obj2, 4));
                this.f12384n = true;
                this.f12379b = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f12380e == activity) {
            this.f12382j = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}