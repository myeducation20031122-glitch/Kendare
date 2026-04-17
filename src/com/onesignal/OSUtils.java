package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.ic1;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.location.LocationCallback;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
class OSUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f11698a = {401, 402, 403, 404, 410};

    public static boolean a() {
        try {
            return new e0.n0(z3.f12248b).a();
        } catch (Throwable unused) {
            return true;
        }
    }

    public static int b() throws ClassNotFoundException {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return 2;
        } catch (ClassNotFoundException unused) {
            boolean zO = (k() && g()) ? o() : false;
            boolean zS = h() ? s("com.google.android.gms") : false;
            if (!zS || !zO) {
                if (zS) {
                    return 1;
                }
                if (zO) {
                    return 13;
                }
                return (!s("com.google.android.gms") && s("com.huawei.hwid")) ? 13 : 1;
            }
            Context context = z3.f12248b;
            if (context != null) {
                ApplicationInfo applicationInfoH = l.h(context);
                Bundle bundle = applicationInfoH == null ? null : applicationInfoH.metaData;
                if (bundle != null && bundle.getBoolean("com.onesignal.preferHMS")) {
                    return 13;
                }
            }
            return 1;
        }
    }

    public static Bundle c(Context context) {
        ApplicationInfo applicationInfoH = l.h(context);
        if (applicationInfoH == null) {
            return null;
        }
        return applicationInfoH.metaData;
    }

    public static Integer d() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) z3.f12248b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        return (type == 1 || type == 9) ? 0 : 1;
    }

    public static String e(Context context, String str, String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    public static Uri f(Context context, String str) {
        int identifier;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if ((!((str == null || str.matches("^[0-9]")) ? false : true) || (identifier = resources.getIdentifier(str, "raw", packageName)) == 0) && (identifier = resources.getIdentifier("onesignal_default_sound", "raw", packageName)) == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder("android.resource://");
        sb.append(packageName);
        sb.append("/");
        sb.append(identifier);
        return Uri.parse(sb.toString());
    }

    public static boolean g() {
        return j() && m();
    }

    public static boolean h() {
        try {
            return opaqueHasClass(FirebaseMessaging.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean i() {
        try {
            return opaqueHasClass(u.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean j() {
        try {
            return opaqueHasClass(AGConnectServicesConfig.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean k() {
        try {
            return opaqueHasClass(HuaweiApiAvailability.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean l() {
        try {
            return opaqueHasClass(LocationCallback.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean m() {
        try {
            return opaqueHasClass(HmsInstanceId.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static int n(Context context, String str) throws ClassNotFoundException {
        y3 y3Var = y3.f12229e;
        int iB = b();
        try {
            UUID.fromString(str);
            Integer num = null;
            if ("b2f7f966-d8cc-11e4-bed1-df8f05be55ba".equals(str) || "5eb5a37e-b458-11e3-ac11-000c2940e62c".equals(str)) {
                z3.b(y3.f12230f, "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com", null);
            }
            int iIntValue = 1;
            if (iB == 1) {
                if (!h()) {
                    z3.b(y3Var, "The Firebase FCM library is missing! Please make sure to include it in your project.", null);
                    num = -4;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                }
            }
            if (Build.VERSION.SDK_INT >= 26) {
                l.h(context);
            }
            return iIntValue;
        } catch (Throwable th) {
            z3.b(y3Var, "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n", th);
            return -999;
        }
    }

    public static boolean o() {
        try {
            return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(z3.f12248b) == 0;
        } catch (RuntimeException e10) {
            if (a2.l.z(e10.getCause())) {
                return false;
            }
            throw e10;
        }
    }

    private static boolean opaqueHasClass(Class<?> cls) {
        return true;
    }

    public static boolean p() {
        return Thread.currentThread().equals(Looper.getMainLooper().getThread());
    }

    public static Set q() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static Intent r(Uri uri) {
        Intent intentMakeMainSelectorActivity;
        int i10 = 3;
        int i11 = 0;
        if (uri.getScheme() != null) {
            String scheme = uri.getScheme();
            int[] iArrC = v.h.c(3);
            int length = iArrC.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                int i13 = iArrC[i12];
                if (ic1.g(i13).equalsIgnoreCase(scheme)) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
        }
        if (i11 != 0) {
            i10 = i11;
        } else if (!uri.toString().contains("://")) {
            uri = Uri.parse("http://" + uri.toString());
        }
        if (v.h.b(i10) != 0) {
            intentMakeMainSelectorActivity = new Intent("android.intent.action.VIEW", uri);
        } else {
            intentMakeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            intentMakeMainSelectorActivity.setData(uri);
        }
        intentMakeMainSelectorActivity.addFlags(268435456);
        return intentMakeMainSelectorActivity;
    }

    public static boolean s(String str) {
        PackageInfo packageInfo;
        x xVarI = l.i(128, z3.f12248b, str);
        if (xVarI.f12217a && (packageInfo = xVarI.f12218b) != null) {
            return packageInfo.applicationInfo.enabled;
        }
        return false;
    }

    public static long[] t(JSONObject jSONObject) {
        try {
            Object objOpt = jSONObject.opt("vib_pt");
            JSONArray jSONArray = objOpt instanceof String ? new JSONArray((String) objOpt) : (JSONArray) objOpt;
            long[] jArr = new long[jSONArray.length()];
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                jArr[i10] = jSONArray.optLong(i10);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void u(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public static void v(Thread thread) {
        boolean z7 = false;
        while (!z7) {
            try {
                thread.start();
                z7 = true;
            } catch (OutOfMemoryError unused) {
                try {
                    Thread.sleep(250L);
                } catch (InterruptedException unused2) {
                }
            }
        }
    }
}