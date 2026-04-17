package x4;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.d0;
import androidx.fragment.app.x0;
import z4.c1;
import z4.m0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends g {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f18961c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final f f18962d = new f();

    public static AlertDialog f(Context context, int i10, a5.w wVar, DialogInterface.OnCancelListener onCancelListener) throws Resources.NotFoundException {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(a5.t.b(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String string = context.getResources().getString(i10 != 1 ? i10 != 2 ? i10 != 3 ? R.string.ok : 2131886328 : 2131886338 : 2131886331);
        if (string != null) {
            builder.setPositiveButton(string, wVar);
        }
        String strC = a5.t.c(context, i10);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public static m0 g(Context context, i5.h hVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        m0 m0Var = new m0(hVar);
        int i10 = e0.h.f12378b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            context.registerReceiver(m0Var, intentFilter, i11 >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(m0Var, intentFilter);
        }
        m0Var.f19677a = context;
        if (j.b(context)) {
            return m0Var;
        }
        hVar.e();
        m0Var.a();
        return null;
    }

    public static void h(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof d0) {
                x0 supportFragmentManager = ((d0) activity).getSupportFragmentManager();
                l lVar = new l();
                if (alertDialog == null) {
                    throw new NullPointerException("Cannot display null dialog");
                }
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                lVar.T = alertDialog;
                if (onCancelListener != null) {
                    lVar.U = onCancelListener;
                }
                lVar.k(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        if (alertDialog == null) {
            throw new NullPointerException("Cannot display null dialog");
        }
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f18955b = alertDialog;
        if (onCancelListener != null) {
            cVar.f18956e = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    @Override // x4.g
    public final Intent b(int i10, Context context, String str) {
        return super.b(i10, context, str);
    }

    @Override // x4.g
    public final int d(Context context, int i10) {
        return super.d(context, i10);
    }

    public final void e(Activity activity, int i10, DialogInterface.OnCancelListener onCancelListener) throws Resources.NotFoundException {
        AlertDialog alertDialogF = f(activity, i10, new a5.u(activity, super.b(i10, activity, "d")), onCancelListener);
        if (alertDialogF == null) {
            return;
        }
        h(activity, alertDialogF, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void i(Context context, int i10, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i11;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            new m(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i10 == 6 ? a5.t.e(context, "common_google_play_services_resolution_required_title") : a5.t.c(context, i10);
        if (strE == null) {
            strE = context.getResources().getString(2131886335);
        }
        String strD = (i10 == 6 || i10 == 19) ? a5.t.d(context, "common_google_play_services_resolution_required_text", a5.t.a(context)) : a5.t.b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        fc.t.k(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        e0.w wVar = new e0.w(context, null);
        wVar.f12445o = true;
        wVar.d(16, true);
        wVar.f12435e = e0.w.b(strE);
        e0.u uVar = new e0.u(0);
        uVar.f12430f = e0.w.b(strD);
        wVar.g(uVar);
        PackageManager packageManager = context.getPackageManager();
        if (com.bumptech.glide.c.f2237a == null) {
            com.bumptech.glide.c.f2237a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (com.bumptech.glide.c.f2237a.booleanValue()) {
            wVar.f12452v.icon = context.getApplicationInfo().icon;
            wVar.f12440j = 2;
            if (com.bumptech.glide.c.e(context)) {
                wVar.f12432b.add(new e0.q(2131165330, resources.getString(2131886343), pendingIntent));
            } else {
                wVar.f12437g = pendingIntent;
            }
        } else {
            wVar.f12452v.icon = R.drawable.stat_sys_warning;
            wVar.f12452v.tickerText = e0.w.b(resources.getString(2131886335));
            wVar.f12452v.when = System.currentTimeMillis();
            wVar.f12437g = pendingIntent;
            wVar.f12436f = e0.w.b(strD);
        }
        if (o5.y.q()) {
            fc.t.n(o5.y.q());
            synchronized (f18961c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(2131886334);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(e.a(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            wVar.f12449s = "com.google.android.gms.availability";
        }
        Notification notificationA = wVar.a();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            j.f18966a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationA);
    }

    public final void j(Activity activity, z4.j jVar, int i10, c1 c1Var) throws Resources.NotFoundException {
        AlertDialog alertDialogF = f(activity, i10, new a5.v(super.b(i10, activity, "d"), jVar), c1Var);
        if (alertDialogF == null) {
            return;
        }
        h(activity, alertDialogF, "GooglePlayServicesErrorDialog", c1Var);
    }
}