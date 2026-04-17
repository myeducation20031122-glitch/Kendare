package o5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.isprid.kendare.ui.main.MainActivity;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public final Activity f15736b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f15737e;

    public h(j jVar, MainActivity mainActivity) {
        this.f15737e = jVar;
        this.f15736b = mainActivity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity != this.f15736b) {
            return;
        }
        f0 f0Var = new f0(3, "Activity is destroyed.");
        j jVar = this.f15737e;
        jVar.a();
        if (((m9.h) jVar.f15755j.getAndSet(null)) == null) {
            return;
        }
        f0Var.a();
        int i10 = MainActivity.f11666w;
        n7.c.w("consent_information");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}