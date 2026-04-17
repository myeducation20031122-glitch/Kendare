package com.onesignal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l implements s4 {

    /* renamed from: a, reason: collision with root package name */
    public static l f11944a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f11945b = false;

    public static void c(int i10, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i11;
        z3.f12272r.getClass();
        d("registerForPushToken completed with id: " + str + " status: " + i10);
        if (i10 >= 1 ? z3.f12265k < -6 : !(p4.b().n() != null || ((i11 = z3.f12265k) != 1 && i11 >= -6))) {
            z3.f12265k = i10;
        }
        z3.H = str;
        z3.J = true;
        OSSubscriptionState oSSubscriptionStateK = z3.k(z3.f12248b);
        if (str == null) {
            oSSubscriptionStateK.getClass();
        } else {
            boolean z7 = !str.equals(oSSubscriptionStateK.f11695f);
            oSSubscriptionStateK.f11695f = str;
            if (z7) {
                oSSubscriptionStateK.f11693b.h(oSSubscriptionStateK);
            }
        }
        z3.d();
    }

    public static void d(String str) {
        z3.b(y3.f12233n, str, null);
    }

    public static void e(String str) {
        z3.b(y3.f12230f, str, null);
    }

    public static void f(String str, Exception exc) {
        z3.b(y3.f12230f, str, exc);
    }

    public static void g(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (f11944a == null) {
            return;
        }
        f11945b = true;
        c(1, str);
    }

    public static ApplicationInfo h(Context context) {
        Intrinsics.f(context, "context");
        ApplicationInfo applicationInfo = q3.f12079g;
        if (applicationInfo != null) {
            return applicationInfo;
        }
        try {
            ApplicationInfo applicationInfo2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            q3.f12079g = applicationInfo2;
            return applicationInfo2;
        } catch (RuntimeException e10) {
            if (a2.l.z(e10.getCause())) {
                return null;
            }
            throw e10;
        }
    }

    public static x i(int i10, Context appContext, String packageName) {
        Intrinsics.f(appContext, "appContext");
        Intrinsics.f(packageName, "packageName");
        try {
            return new x(appContext.getPackageManager().getPackageInfo(packageName, i10), true);
        } catch (PackageManager.NameNotFoundException unused) {
            return new x(null, true);
        } catch (RuntimeException e10) {
            if (a2.l.z(e10.getCause())) {
                return new x(null, false);
            }
            throw e10;
        }
    }

    public static void j(u2 u2Var) {
        OSUtils.u(u2Var);
    }

    public static void k(String str) {
        z3.b(y3.f12234t, str, null);
    }

    public static void l(String str) {
        z3.b(y3.f12231j, str, null);
    }

    @Override // com.onesignal.s4
    public void a(Context context, String str, l lVar) {
        f11944a = lVar;
        new Thread(new t4(context, lVar)).start();
    }
}