package x4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class j {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f18967b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f18968c = false;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f18966a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f18969d = new AtomicBoolean();

    public static boolean a(Context context) {
        if (!f18968c) {
            try {
                try {
                    PackageInfo packageInfoG = g5.b.a(context).g(64, "com.google.android.gms");
                    k.c(context);
                    if (packageInfoG == null || k.f(packageInfoG, false) || !k.f(packageInfoG, true)) {
                        f18967b = false;
                    } else {
                        f18967b = true;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                }
                f18968c = true;
            } catch (Throwable th) {
                f18968c = true;
                throw th;
            }
        }
        return f18967b || !"user".equals(Build.TYPE);
    }

    public static boolean b(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}