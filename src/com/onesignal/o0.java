package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class o0 {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f12032c;

    /* renamed from: e, reason: collision with root package name */
    public static l0 f12034e;

    /* renamed from: f, reason: collision with root package name */
    public static Thread f12035f;

    /* renamed from: g, reason: collision with root package name */
    public static Context f12036g;

    /* renamed from: h, reason: collision with root package name */
    public static Location f12037h;

    /* renamed from: i, reason: collision with root package name */
    public static String f12038i;

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f12030a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f12031b = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final l f12033d = new l();

    public static void a(m0 m0Var) {
        Thread thread;
        HashMap map = new HashMap();
        synchronized (o0.class) {
            ConcurrentHashMap concurrentHashMap = f12031b;
            map.putAll(concurrentHashMap);
            concurrentHashMap.clear();
            thread = f12035f;
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            ((k0) map.get((n0) it.next())).b(m0Var);
        }
        if (thread != null && !Thread.currentThread().equals(thread)) {
            thread.interrupt();
        }
        if (thread == f12035f) {
            synchronized (o0.class) {
                try {
                    if (thread == f12035f) {
                        f12035f = null;
                    }
                } finally {
                }
            }
        }
        z3.f12275u.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        h4.g(Long.valueOf(jCurrentTimeMillis), h4.f11856a, "OS_LAST_LOCATION_TIME");
    }

    public static void b(Location location) {
        double longitude;
        z3.b(y3.f12233n, "LocationController fireCompleteForLocation with location: " + location, null);
        m0 m0Var = new m0();
        m0Var.f11965c = Float.valueOf(location.getAccuracy());
        m0Var.f11967e = Boolean.valueOf(!z3.f12268n);
        m0Var.f11966d = Integer.valueOf(!f12032c ? 1 : 0);
        m0Var.f11968f = Long.valueOf(location.getTime());
        if (f12032c) {
            BigDecimal bigDecimal = new BigDecimal(location.getLatitude());
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            m0Var.f11963a = Double.valueOf(bigDecimal.setScale(7, roundingMode).doubleValue());
            longitude = new BigDecimal(location.getLongitude()).setScale(7, roundingMode).doubleValue();
        } else {
            m0Var.f11963a = Double.valueOf(location.getLatitude());
            longitude = location.getLongitude();
        }
        m0Var.f11964b = Double.valueOf(longitude);
        a(m0Var);
        h(f12036g);
    }

    public static void c() {
        synchronized (f12033d) {
            try {
                if (OSUtils.b() == 1 && OSUtils.i()) {
                    v.c();
                } else if (f()) {
                    e0.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(Context context, boolean z7, boolean z10, k0 k0Var) {
        int iG;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        String str;
        if (k0Var instanceof v3) {
            ArrayList arrayList = f12030a;
            synchronized (arrayList) {
                arrayList.add((v3) k0Var);
            }
        }
        f12036g = context;
        f12031b.put(k0Var.a(), k0Var);
        z3.f12276v.getClass();
        if (!h4.b(h4.f11856a, "PREFS_OS_LOCATION_SHARED", true)) {
            i(z7, 4);
            c();
            return;
        }
        int iG2 = q3.g(context, "android.permission.ACCESS_FINE_LOCATION");
        if (iG2 == -1) {
            iG = q3.g(context, "android.permission.ACCESS_COARSE_LOCATION");
            f12032c = true;
        } else {
            iG = -1;
        }
        int i10 = Build.VERSION.SDK_INT;
        int iG3 = i10 >= 29 ? q3.g(context, "android.permission.ACCESS_BACKGROUND_LOCATION") : -1;
        int i11 = 3;
        if (i10 < 23) {
            if (iG2 != 0 && iG != 0) {
                i(z7, 3);
                k0Var.b(null);
                return;
            }
        } else if (iG2 != 0) {
            x xVarI = l.i(androidx.recyclerview.widget.g1.FLAG_APPEARED_IN_PRE_LAYOUT, context, context.getPackageName());
            if (!xVarI.f12217a || (packageInfo2 = xVarI.f12218b) == null) {
                i(z7, 4);
                return;
            }
            List listAsList = Arrays.asList(packageInfo2.requestedPermissions);
            if (listAsList.contains("android.permission.ACCESS_FINE_LOCATION")) {
                str = "android.permission.ACCESS_FINE_LOCATION";
            } else if (!listAsList.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                z3.b(y3.f12232m, "Location permissions not added on AndroidManifest file", null);
                if (f12038i == null) {
                }
                if (iG != 0) {
                }
            } else if (iG != 0) {
                str = "android.permission.ACCESS_COARSE_LOCATION";
            } else {
                if (i10 >= 29 && listAsList.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    str = "android.permission.ACCESS_BACKGROUND_LOCATION";
                }
                i11 = 2;
                if (f12038i == null && z7) {
                    int i12 = q0.f12064a;
                    String androidPermissionString = f12038i;
                    Intrinsics.f(androidPermissionString, "androidPermissionString");
                    if (PermissionsActivity.f11699f) {
                        return;
                    }
                    PermissionsActivity.f11700j = z10;
                    q4 q4Var = new q4("LOCATION", androidPermissionString, q0.class);
                    boolean z11 = PermissionsActivity.f11699f;
                    e eVar = g.f11804e;
                    if (eVar != null) {
                        e.f11766d.put("com.onesignal.PermissionsActivity", q4Var);
                        Activity activity = eVar.f11770b;
                        if (activity != null) {
                            q4Var.a(activity);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (iG != 0) {
                    i(z7, i11);
                    c();
                    return;
                }
            }
            f12038i = str;
            i11 = 2;
            if (f12038i == null) {
            }
            if (iG != 0) {
            }
        } else if (i10 >= 29 && iG3 != 0) {
            x xVarI2 = l.i(androidx.recyclerview.widget.g1.FLAG_APPEARED_IN_PRE_LAYOUT, context, context.getPackageName());
            if (!xVarI2.f12217a || (packageInfo = xVarI2.f12218b) == null) {
                i(z7, 4);
                return;
            }
            if (Arrays.asList(packageInfo.requestedPermissions).contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                f12038i = "android.permission.ACCESS_BACKGROUND_LOCATION";
            }
            if (f12038i == null || !z7) {
                i(z7, 1);
                j();
                return;
            }
            int i13 = q0.f12064a;
            String androidPermissionString2 = f12038i;
            Intrinsics.f(androidPermissionString2, "androidPermissionString");
            if (PermissionsActivity.f11699f) {
                return;
            }
            PermissionsActivity.f11700j = z10;
            q4 q4Var2 = new q4("LOCATION", androidPermissionString2, q0.class);
            boolean z12 = PermissionsActivity.f11699f;
            e eVar2 = g.f11804e;
            if (eVar2 != null) {
                e.f11766d.put("com.onesignal.PermissionsActivity", q4Var2);
                Activity activity2 = eVar2.f11770b;
                if (activity2 != null) {
                    q4Var2.a(activity2);
                    return;
                }
                return;
            }
            return;
        }
        i(z7, 1);
        j();
    }

    public static l0 e() {
        if (f12034e == null) {
            synchronized (f12033d) {
                try {
                    if (f12034e == null) {
                        l0 l0Var = new l0("OSH_LocationHandlerThread");
                        l0Var.start();
                        l0Var.f11946b = new Handler(l0Var.getLooper());
                        f12034e = l0Var;
                    }
                } finally {
                }
            }
        }
        return f12034e;
    }

    public static boolean f() {
        return OSUtils.b() == 13 && OSUtils.l();
    }

    public static void g() {
        synchronized (f12033d) {
            try {
                if (OSUtils.b() == 1 && OSUtils.i()) {
                    v.g();
                } else {
                    if (f()) {
                        e0.g();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean h(Context context) {
        int iG = q3.g(context, "android.permission.ACCESS_FINE_LOCATION");
        y3 y3Var = y3.f12233n;
        if (iG != 0 && q3.g(context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z3.b(y3Var, "LocationController scheduleUpdate not possible, location permission not enabled", null);
            return false;
        }
        z3.f12276v.getClass();
        String str = h4.f11856a;
        if (!h4.b(str, "PREFS_OS_LOCATION_SHARED", true)) {
            z3.b(y3Var, "LocationController scheduleUpdate not possible, location shared not enabled", null);
            return false;
        }
        z3.f12275u.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - ((Long) h4.a(str, "OS_LAST_LOCATION_TIME", Long.class, -600000L)).longValue();
        long j10 = (z3.f12268n ? 300L : 600L) * 1000;
        z3.b(y3Var, "LocationController scheduleUpdate lastTime: " + jCurrentTimeMillis + " minTime: " + j10, null);
        long j11 = j10 - jCurrentTimeMillis;
        e3 e3VarD = e3.d();
        e3VarD.getClass();
        z3.b(y3.f12234t, "OSSyncService scheduleLocationUpdateTask:delayMs: " + j11, null);
        e3VarD.e(context, j11);
        return true;
    }

    public static void i(boolean z7, int i10) {
        if (!z7) {
            z3.b(y3.f12233n, "LocationController sendAndClearPromptHandlers from non prompt flow", null);
            return;
        }
        ArrayList arrayList = f12030a;
        synchronized (arrayList) {
            try {
                z3.b(y3.f12233n, "LocationController calling prompt handlers", null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    p1 p1Var = ((v3) it.next()).f12206a;
                    if (p1Var != null) {
                        p1Var.g(i10);
                    }
                }
                f12030a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void j() {
        y3 y3Var = y3.f12231j;
        z3.b(y3.f12233n, "LocationController startGetLocation with lastLocation: " + f12037h, null);
        try {
            if (OSUtils.b() == 1 && OSUtils.i()) {
                v.j();
            } else if (f()) {
                e0.k();
            } else {
                z3.b(y3Var, "LocationController startGetLocation not possible, no location dependency found", null);
                c();
            }
        } catch (Throwable th) {
            z3.b(y3Var, "Location permission exists but there was an error initializing: ", th);
            c();
        }
    }
}