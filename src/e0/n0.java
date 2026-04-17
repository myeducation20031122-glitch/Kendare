package e0;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n0 {

    /* renamed from: d, reason: collision with root package name */
    public static String f12409d;

    /* renamed from: g, reason: collision with root package name */
    public static l0 f12412g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12413a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f12414b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f12408c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f12410e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f12411f = new Object();

    public n0(Context context) {
        this.f12413a = context;
        this.f12414b = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() throws ClassNotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return h0.a(this.f12414b);
        }
        Context context = this.f12413a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i10), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public final void b(int i10, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f12414b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i10, notification);
            return;
        }
        i0 i0Var = new i0(this.f12413a.getPackageName(), i10, notification);
        synchronized (f12411f) {
            try {
                if (f12412g == null) {
                    f12412g = new l0(this.f12413a.getApplicationContext());
                }
                f12412g.f12405e.obtainMessage(0, i0Var).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i10);
    }
}