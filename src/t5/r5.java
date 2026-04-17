package t5;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r5 extends t5 {

    /* renamed from: j, reason: collision with root package name */
    public final AlarmManager f17594j;

    /* renamed from: m, reason: collision with root package name */
    public p5 f17595m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f17596n;

    public r5(w5 w5Var) {
        super(w5Var);
        this.f17594j = (AlarmManager) ((b4) this.f15046b).f17234b.getSystemService("alarm");
    }

    @Override // t5.t5
    public final boolean r() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.f17594j;
        if (alarmManager != null) {
            alarmManager.cancel(u());
        }
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) ((b4) this.f15046b).f17234b.getSystemService("jobscheduler")) == null) {
            return false;
        }
        jobScheduler.cancel(t());
        return false;
    }

    public final void s() {
        JobScheduler jobScheduler;
        p();
        i3 i3Var = ((b4) this.f15046b).f17251w;
        b4.i(i3Var);
        i3Var.Q.a("Unscheduling upload");
        AlarmManager alarmManager = this.f17594j;
        if (alarmManager != null) {
            alarmManager.cancel(u());
        }
        w().a();
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) ((b4) this.f15046b).f17234b.getSystemService("jobscheduler")) == null) {
            return;
        }
        jobScheduler.cancel(t());
    }

    public final int t() {
        if (this.f17596n == null) {
            this.f17596n = Integer.valueOf("measurement".concat(String.valueOf(((b4) this.f15046b).f17234b.getPackageName())).hashCode());
        }
        return this.f17596n.intValue();
    }

    public final PendingIntent u() {
        Context context = ((b4) this.f15046b).f17234b;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.c0.f10696a);
    }

    public final l w() {
        if (this.f17595m == null) {
            this.f17595m = new p5(this, this.f17607e.O, 1);
        }
        return this.f17595m;
    }
}