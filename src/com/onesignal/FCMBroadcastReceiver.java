package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import com.google.android.gms.internal.ads.iy;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class FCMBroadcastReceiver extends e1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11691f = 0;

    public static void c(Bundle bundle, f0 f0Var) {
        String string = q3.f(bundle).toString();
        int i10 = f0Var.f11789a;
        switch (i10) {
            case 2:
                ((Bundle) f0Var.f11790b).putString("json_payload", string);
                break;
            default:
                ((PersistableBundle) f0Var.f11790b).putString("json_payload", string);
                break;
        }
        z3.f12275u.getClass();
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        switch (i10) {
            case 2:
                ((Bundle) f0Var.f11790b).putLong("timestamp", lValueOf.longValue());
                break;
            default:
                ((PersistableBundle) f0Var.f11790b).putLong("timestamp", lValueOf.longValue());
                break;
        }
    }

    public static void d(Context context, Bundle bundle) {
        Parcelable parcelable;
        f0 f0Var = Build.VERSION.SDK_INT >= 22 ? new f0(3) : new f0(2);
        c(bundle, f0Var);
        Intent intent = new Intent(context, (Class<?>) FCMIntentJobService.class);
        switch (f0Var.f11789a) {
            case 2:
                parcelable = (Bundle) f0Var.f11790b;
                break;
            default:
                parcelable = (PersistableBundle) f0Var.f11790b;
                break;
        }
        intent.putExtra("Bundle:Parcelable:Extras", parcelable);
        int i10 = FCMIntentJobService.f11692u;
        ComponentName componentName = new ComponentName(context, (Class<?>) FCMIntentJobService.class);
        synchronized (j0.f11900n) {
            try {
                JobIntentService$WorkEnqueuer jobIntentService$WorkEnqueuerB = j0.b(context, componentName, true, 123890, false);
                jobIntentService$WorkEnqueuerB.ensureJobId(123890);
                try {
                    jobIntentService$WorkEnqueuerB.enqueueWork(intent);
                } catch (IllegalStateException e10) {
                    throw e10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(Context context, Bundle bundle) {
        Cloneable cloneable;
        ComponentName componentName = new ComponentName(context.getPackageName(), FCMIntentService.class.getName());
        f0 f0Var = new f0(2);
        c(bundle, f0Var);
        Intent intent = new Intent();
        switch (f0Var.f11789a) {
            case 2:
                cloneable = (Bundle) f0Var.f11790b;
                break;
            default:
                cloneable = (PersistableBundle) f0Var.f11790b;
                break;
        }
        e1.a.b(context, intent.replaceExtras((Bundle) cloneable).setComponent(componentName));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        String stringExtra;
        Bundle extras = intent.getExtras();
        if (extras == null || "google.com/iid".equals(extras.getString("from"))) {
            return;
        }
        z3.y(context);
        iy iyVar = new iy(this, 0);
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()) || ((stringExtra = intent.getStringExtra("message_type")) != null && !"gcm".equals(stringExtra))) {
            iyVar.d(null);
        }
        q3.M(context, extras, new a(context, extras, iyVar));
    }
}