package com.onesignal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.measurement.l9;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.reactivex.annotations.SchedulerSupport;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class z3 {
    public static final l9 A;
    public static final p1 B;
    public static p1 C;
    public static n8.s D;
    public static m2 E;
    public static final l F;
    public static final String G;
    public static String H;
    public static final OSUtils I;
    public static boolean J;
    public static boolean K;
    public static boolean L;
    public static boolean M;
    public static boolean N;
    public static m0 O;
    public static final ArrayList P;
    public static final HashSet Q;
    public static final ArrayList R;
    public static b5 S;
    public static x2 T;
    public static x2 U;
    public static com.bumptech.glide.manager.t V;
    public static OSSubscriptionState W;
    public static OSSubscriptionState X;
    public static com.bumptech.glide.manager.t Y;
    public static f1 Z;

    /* renamed from: a0, reason: collision with root package name */
    public static f1 f12247a0;

    /* renamed from: b, reason: collision with root package name */
    public static Context f12248b;

    /* renamed from: b0, reason: collision with root package name */
    public static com.bumptech.glide.manager.t f12249b0;

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f12250c;

    /* renamed from: c0, reason: collision with root package name */
    public static a3 f12251c0;

    /* renamed from: d, reason: collision with root package name */
    public static String f12252d;

    /* renamed from: d0, reason: collision with root package name */
    public static a3 f12253d0;

    /* renamed from: e, reason: collision with root package name */
    public static String f12254e;

    /* renamed from: e0, reason: collision with root package name */
    public static com.bumptech.glide.manager.t f12255e0;

    /* renamed from: f0, reason: collision with root package name */
    public static com.bumptech.glide.manager.t f12257f0;

    /* renamed from: g0, reason: collision with root package name */
    public static s4 f12259g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final CopyOnWriteArrayList f12261h0;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f12267m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f12268n;

    /* renamed from: o, reason: collision with root package name */
    public static d5 f12269o;

    /* renamed from: p, reason: collision with root package name */
    public static a5 f12270p;

    /* renamed from: q, reason: collision with root package name */
    public static b5 f12271q;

    /* renamed from: r, reason: collision with root package name */
    public static final l f12272r;

    /* renamed from: s, reason: collision with root package name */
    public static s f12273s;

    /* renamed from: t, reason: collision with root package name */
    public static final t1 f12274t;

    /* renamed from: u, reason: collision with root package name */
    public static final l f12275u;

    /* renamed from: v, reason: collision with root package name */
    public static final f0 f12276v;

    /* renamed from: w, reason: collision with root package name */
    public static final s f12277w;

    /* renamed from: x, reason: collision with root package name */
    public static final k3 f12278x;

    /* renamed from: y, reason: collision with root package name */
    public static final l f12279y;

    /* renamed from: z, reason: collision with root package name */
    public static final l f12280z;

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f12246a = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public static y3 f12256f = y3.f12228b;

    /* renamed from: g, reason: collision with root package name */
    public static y3 f12258g = y3.f12231j;

    /* renamed from: h, reason: collision with root package name */
    public static String f12260h = null;

    /* renamed from: i, reason: collision with root package name */
    public static String f12262i = null;

    /* renamed from: j, reason: collision with root package name */
    public static String f12264j = null;

    /* renamed from: k, reason: collision with root package name */
    public static int f12265k = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public static y9.a f12266l = null;

    /* renamed from: i0, reason: collision with root package name */
    public static int f12263i0 = 3;

    static {
        l lVar = new l();
        f12272r = lVar;
        l lVar2 = new l();
        f12274t = new t1();
        l lVar3 = new l();
        f12275u = lVar3;
        f0 f0Var = new f0(1);
        f12276v = f0Var;
        f12277w = new s(lVar);
        f12278x = new k3(f0Var, lVar);
        f12279y = new l();
        l lVar4 = new l();
        f12280z = lVar4;
        l9 l9Var = new l9(lVar4, lVar, lVar3);
        A = l9Var;
        B = new p1(lVar2, l9Var, lVar);
        F = new l();
        G = "native";
        I = new OSUtils();
        P = new ArrayList();
        Q = new HashSet();
        R = new ArrayList();
        f12261h0 = new CopyOnWriteArrayList();
    }

    public static boolean A() {
        return f12268n;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void B(String str, int i10, String str2, Throwable th) {
        String strW;
        if (str2 != null) {
            y3 y3Var = y3.f12232m;
            strW = (y3Var.compareTo(f12256f) < 1 || y3Var.compareTo(f12258g) < 1) ? a0.h.w("\n", str2, "\n") : "";
        }
        b(y3.f12231j, "HTTP code: " + i10 + " " + str + strW, th);
    }

    public static void C(String str, String str2, boolean z7) {
        if (((j4) f12276v.f11790b) != null || N) {
            return;
        }
        N = true;
        q3.E(str, str2, new com.google.android.gms.internal.ads.d0(z7, 5));
    }

    public static void D(Context context, JSONObject jSONObject, l2 l2Var) {
        if (E == null) {
            E = new m2(f4.b(context), f12272r);
        }
        m2 m2Var = E;
        m2Var.getClass();
        String strW = q3.w(jSONObject);
        l lVar = m2Var.f11970i;
        if (strW == null) {
            lVar.getClass();
            l.d("Notification notValidOrDuplicated with id null");
            l2Var.a(true);
            return;
        }
        if ("".equals(strW)) {
            l2Var.a(false);
            return;
        }
        Set set = t2.f12152a;
        if (!TextUtils.isEmpty(strW)) {
            Set set2 = t2.f12152a;
            if (set2.contains(strW)) {
                b(y3.f12233n, "OSNotificationWorkManager notification with notificationId: " + strW + " already queued", null);
                lVar.getClass();
                l.d("Notification notValidOrDuplicated with id duplicated");
                l2Var.a(true);
                return;
            }
            set2.add(strW);
        }
        q3.R(new k2(m2Var, strW, l2Var), "OS_NOTIFICATIONS_THREAD");
    }

    public static void E() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AtomicLong atomicLong;
        if (O("onAppFocus")) {
            return;
        }
        m().b();
        g();
        d5 d5Var = f12269o;
        if (d5Var != null) {
            d5Var.b();
        }
        s2.a(f12248b, false);
        x2 x2VarJ = j(f12248b);
        x2VarJ.getClass();
        boolean zA = OSUtils.a();
        boolean z7 = x2VarJ.f12222e != zA;
        x2VarJ.f12222e = zA;
        if (z7) {
            x2VarJ.f12221b.h(x2VarJ);
        }
        if (f12271q != null) {
            f12276v.getClass();
            if (h4.b(h4.f11856a, "GT_FIREBASE_TRACKING_ENABLED", false)) {
                b5 b5Var = f12271q;
                b5Var.getClass();
                if (b5.f11735m != null && b5.f11737t != null) {
                    f12275u.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - b5.f11735m.get() <= 120000 && ((atomicLong = b5.f11736n) == null || jCurrentTimeMillis - atomicLong.get() >= 30000)) {
                        try {
                            Object objE = b5Var.e((Context) b5Var.f11739e);
                            Method methodG = b5.g(b5.f11734j);
                            Bundle bundle = new Bundle();
                            bundle.putString("source", "OneSignal");
                            bundle.putString("medium", "notification");
                            bundle.putString("notification_id", b5.f11737t.f11815d);
                            bundle.putString("campaign", b5.d(b5.f11737t));
                            methodG.invoke(objE, "os_notification_influence_open", bundle);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            }
        }
        e3 e3VarD = e3.d();
        Context context = f12248b;
        e3VarD.getClass();
        synchronized (b1.f11726c) {
            try {
                e3VarD.f11783d = 0L;
                if (!o0.h(context)) {
                    e3VarD.a(context);
                }
            } finally {
            }
        }
    }

    public static void F(Activity context, JSONArray jSONArray) throws JSONException {
        Intent launchIntentForPackage;
        try {
            JSONObject fcmPayload = jSONArray.getJSONObject(0);
            Intrinsics.f(context, "context");
            Intrinsics.f(fcmPayload, "fcmPayload");
            b5 b5Var = new b5(context, fcmPayload);
            Uri uriH = b5Var.h();
            Intent intentR = uriH == null ? null : OSUtils.r(uriH);
            boolean zF = (q3.B(fcmPayload) != null) | b5Var.f();
            if (intentR == null) {
                if (zF && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName())) != null) {
                    launchIntentForPackage.setPackage(null);
                    launchIntentForPackage.setFlags(270532608);
                    intentR = launchIntentForPackage;
                } else {
                    intentR = null;
                }
            }
            l lVar = f12272r;
            y3 y3Var = y3.f12232m;
            if (intentR == null) {
                lVar.getClass();
                b(y3Var, "SDK not showing an Activity automatically due to it's settings.", null);
                return;
            }
            lVar.getClass();
            b(y3Var, "SDK running startActivity with Intent: " + intentR, null);
            context.startActivity(intentR);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void G(p1 p1Var, boolean z7) {
        k3 k3Var = f12278x;
        if (k3Var.f("promptLocation()")) {
            f12272r.getClass();
            l.e("Waiting for remote params. Moving promptLocation() operation to a pending queue.");
            k3Var.a(new u3(p1Var, z7));
        } else {
            if (O("promptLocation()")) {
                return;
            }
            o0.d(f12248b, true, z7, new v3(p1Var));
        }
    }

    public static void H() {
        s4 w4Var;
        s4 s4Var = f12259g0;
        if (s4Var == null) {
            if (OSUtils.b() == 2) {
                w4Var = new l();
            } else if (OSUtils.b() == 1) {
                if (OSUtils.h()) {
                    f2 f2Var = ((j4) f12276v.f11790b).f11923l;
                    w4Var = new u4(f12248b, f2Var != null ? new f2(f2Var.f11794a, f2Var.f11795b, f2Var.f11796c) : null);
                }
                s4Var = f12259g0;
            } else {
                w4Var = new w4();
            }
            f12259g0 = w4Var;
            s4Var = f12259g0;
        }
        s4Var.a(f12248b, f12254e, new l());
    }

    public static void I(int i10) {
        k3 k3Var = f12278x;
        if (k3Var.f("removeNotification()") || E == null) {
            f12272r.getClass();
            l.e("Waiting for remote params. Moving removeNotification() operation to a pending queue.");
            k3Var.a(new w3(i10));
        } else {
            if (O("removeNotification()")) {
                return;
            }
            m2 m2Var = E;
            WeakReference weakReference = new WeakReference(f12248b);
            m2Var.getClass();
            q3.R(new j2(m2Var, weakReference, i10), "OS_NOTIFICATIONS_THREAD");
        }
    }

    public static boolean J() {
        if (f12248b != null) {
            f0 f0Var = f12276v;
            f0Var.getClass();
            String str = h4.f11856a;
            if (!h4.b(str, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", false)) {
                return false;
            }
            f0Var.getClass();
            if (h4.b(str, "ONESIGNAL_USER_PROVIDED_CONSENT", false)) {
                return false;
            }
        }
        return true;
    }

    public static void K(JSONArray jSONArray, boolean z7, q3 q3Var) {
        if (O("sendPurchases()")) {
            return;
        }
        if (s() == null) {
            com.bumptech.glide.manager.t tVar = new com.bumptech.glide.manager.t(jSONArray);
            f12257f0 = tVar;
            tVar.f2365f = z7;
            tVar.f2364e = q3Var;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", q(f12248b));
            if (z7) {
                jSONObject.put("existing", true);
            }
            jSONObject.put("purchases", jSONArray);
            p4.e(jSONObject, q3Var);
        } catch (Throwable th) {
            b(y3.f12230f, "Failed to generate JSON for sendPurchases.", th);
        }
    }

    public static void L(JSONObject jSONObject) {
        r3 r3Var;
        k3 k3Var = f12278x;
        boolean zF = k3Var.f("sendTags()");
        l lVar = f12272r;
        if (zF) {
            lVar.getClass();
            l.e("Waiting for remote params. Moving sendTags() operation to a pending task queue.");
            r3Var = new r3(jSONObject, 0);
        } else {
            if (O("sendTags()")) {
                return;
            }
            r3Var = new r3(jSONObject, 1);
            if (!k3Var.d()) {
                r3Var.run();
                return;
            } else {
                lVar.getClass();
                l.d("Sending sendTags() operation to pending task queue.");
            }
        }
        k3Var.a(r3Var);
    }

    public static void M(String str) {
        String str2;
        l lVar = f12272r;
        if (str == null || str.isEmpty()) {
            str2 = "setAppId called with id: " + str + ", ignoring!";
            lVar.getClass();
        } else {
            if (!str.equals(f12252d)) {
                f12267m = false;
                StringBuilder sbA = a0.h.A("setAppId called with id: ", str, " changing id from: ");
                sbA.append(f12252d);
                String string = sbA.toString();
                lVar.getClass();
                l.k(string);
            }
            f12252d = str;
            if (f12248b != null) {
                WeakReference weakReference = f12250c;
                x((weakReference == null || weakReference.get() == null) ? f12248b : (Context) f12250c.get());
                return;
            } else {
                lVar.getClass();
                str2 = "appId set, but please call initWithContext(appContext) with Application context to complete OneSignal init!";
            }
        }
        l.l(str2);
    }

    public static void N(long j10) {
        String strE = kc.r.e("Last session time set to: ", j10);
        f12272r.getClass();
        l.d(strE);
        h4.g(Long.valueOf(j10), h4.f11856a, "OS_LAST_SESSION_TIME");
    }

    public static boolean O(String str) {
        if (!J()) {
            return false;
        }
        if (str == null) {
            return true;
        }
        b(y3.f12231j, "Method " + str + " was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()", null);
        return true;
    }

    public static void a(y3 y3Var, String str) {
        b(y3Var, str, null);
    }

    public static void b(y3 y3Var, String entry, Throwable th) {
        if (y3Var.compareTo(f12258g) < 1) {
            if (y3Var == y3.f12234t) {
                Log.v("OneSignal", entry, th);
            } else if (y3Var == y3.f12233n) {
                Log.d("OneSignal", entry, th);
            } else if (y3Var == y3.f12232m) {
                Log.i("OneSignal", entry, th);
            } else if (y3Var == y3.f12231j) {
                Log.w("OneSignal", entry, th);
            } else if (y3Var == y3.f12230f || y3Var == y3.f12229e) {
                Log.e("OneSignal", entry, th);
            }
        }
        if (y3Var.compareTo(f12256f) < 1 && i() != null) {
            try {
                String str = entry + "\n";
                if (th != null) {
                    String str2 = str + th.getMessage();
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    str = str2 + stringWriter.toString();
                }
                OSUtils.u(new o1(y3Var, str, 8));
            } catch (Throwable th2) {
                Log.e("OneSignal", "Error showing logging message.", th2);
            }
        }
        if (th != null) {
            StringBuilder sbO = ic1.o(entry, "\n");
            sbO.append(Log.getStackTraceString(th));
            entry = sbO.toString();
        }
        Iterator it = f12261h0.iterator();
        if (it.hasNext()) {
            ic1.v(it.next());
            Intrinsics.f(entry, "entry");
            throw null;
        }
    }

    public static void c() throws JSONException {
        boolean z7;
        m0 m0Var;
        PackageInfo packageInfo;
        String packageName = f12248b.getPackageName();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", q(f12248b));
        jSONObject.put("device_os", Build.VERSION.RELEASE);
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        jSONObject.put("timezone", rawOffset / com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS);
        jSONObject.put("timezone_id", Build.VERSION.SDK_INT >= 26 ? ZoneId.systemDefault().getId() : TimeZone.getDefault().getID());
        jSONObject.put("language", f12266l.f19421a.g());
        jSONObject.put("sdk", "040812");
        jSONObject.put("sdk_type", G);
        jSONObject.put("android_package", packageName);
        jSONObject.put("device_model", Build.MODEL);
        x xVarI = l.i(0, f12248b, f12248b.getPackageName());
        String str = null;
        Integer numValueOf = (!xVarI.f12217a || (packageInfo = xVarI.f12218b) == null) ? null : Integer.valueOf(packageInfo.versionCode);
        if (numValueOf != null) {
            jSONObject.put("game_version", numValueOf);
        }
        I.getClass();
        jSONObject.put("net_type", OSUtils.d());
        try {
            String networkOperatorName = ((TelephonyManager) f12248b.getSystemService("phone")).getNetworkOperatorName();
            if (!"".equals(networkOperatorName)) {
                str = networkOperatorName;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        jSONObject.put("carrier", str);
        String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i10 = 0; i10 < 8; i10++) {
            try {
                if (new File(strArr[i10] + "su").exists()) {
                    z7 = true;
                    break;
                }
            } catch (Throwable unused) {
            }
        }
        z7 = false;
        jSONObject.put("rooted", z7);
        p4.b().p().e(jSONObject);
        p4.a().p().e(jSONObject);
        p4.c().p().e(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("identifier", H);
        jSONObject2.put("subscribableStatus", f12265k);
        f12276v.getClass();
        String str2 = h4.f11856a;
        jSONObject2.put("androidPermission", h4.b(str2, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", true) ? OSUtils.a() : true);
        jSONObject2.put("device_type", OSUtils.b());
        p4.g(jSONObject2);
        f12276v.getClass();
        if (h4.b(str2, "PREFS_OS_LOCATION_SHARED", true) && (m0Var = O) != null) {
            p4.f(m0Var);
        }
        f12272r.getClass();
        l.d("registerUserTask calling readyToUpdate");
        p4.b().u();
        p4.a().u();
        p4.c().u();
        M = false;
    }

    public static void d() {
        String str = "registerUser:registerForPushFired:" + J + ", locationFired: " + K + ", remoteParams: " + ((j4) f12276v.f11790b) + ", appId: " + f12252d;
        f12272r.getClass();
        l.d(str);
        if (!J || !K || ((j4) f12276v.f11790b) == null || f12252d == null) {
            l.d("registerUser not possible");
        } else {
            OSUtils.v(new Thread(new a0(4), "OS_REG_USER"));
        }
    }

    public static void e(String str) {
        f12263i0 = 1;
        p1 p1Var = B;
        ((l) p1Var.f12056f).getClass();
        l.d("OneSignal SessionManager onDirectInfluenceFromNotificationOpen notificationId: " + str);
        if (str == null || str.isEmpty()) {
            return;
        }
        p1Var.b(1, str);
    }

    public static void f() {
        if (f12268n) {
            return;
        }
        a5 a5Var = f12270p;
        if (a5Var != null) {
            a5Var.c();
        }
        s sVarM = m();
        synchronized (sVarM.f12107c) {
            l lVar = sVarM.f12105a;
            String str = "Application backgrounded focus time: " + ((Long) sVarM.f12106b);
            lVar.getClass();
            l.d(str);
            r.a(((f0) sVarM.f12108d).a());
            sVarM.f12106b = null;
        }
        boolean zT = p4.b().t();
        boolean zT2 = p4.a().t();
        boolean zT3 = p4.c().t();
        boolean z7 = true;
        if (zT2) {
            zT2 = p4.a().n() != null;
        }
        if (zT3) {
            zT3 = p4.c().n() != null;
        }
        if (!zT && !zT2 && !zT3) {
            z7 = false;
        }
        f12272r.getClass();
        l.d("OneSignal scheduleSyncService unsyncedChanges: " + z7);
        if (z7) {
            e3 e3VarD = e3.d();
            Context context = f12248b;
            e3VarD.getClass();
            b(y3.f12234t, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000", null);
            e3VarD.e(context, 30000L);
        }
        l.d("OneSignal scheduleSyncService locationScheduled: " + o0.h(f12248b));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g() {
        if (f12268n) {
            f12275u.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = ((Long) h4.a(h4.f11856a, "OS_LAST_SESSION_TIME", Long.class, -31000L)).longValue();
            long j10 = jCurrentTimeMillis - jLongValue;
            f12272r.getClass();
            l.d("isPastOnSessionTime currentTimeMillis: " + jCurrentTimeMillis + " lastSessionTime: " + jLongValue + " difference: " + j10);
            if (j10 >= 30000) {
                l.d("Starting new session with appEntryState: ".concat(ic1.D(f12263i0)));
                p4.b().x();
                p4.a().x();
                p4.c().x();
                p1 p1VarO = o();
                p1VarO.getClass();
                b(y3.f12233n, "OneSignal cleanOutcomes for session", null);
                p1VarO.f12054b = OSUtils.q();
                p1VarO.i();
                p1 p1Var = B;
                int i10 = f12263i0;
                ArrayList arrayListG = ((l9) p1Var.f12054b).g(i10);
                ArrayList arrayList = new ArrayList();
                l lVar = (l) p1Var.f12056f;
                String str = "OneSignal SessionManager restartSessionIfNeeded with entryAction: " + ic1.D(i10) + "\n channelTrackers: " + arrayListG.toString();
                lVar.getClass();
                l.d(str);
                Iterator it = arrayListG.iterator();
                while (it.hasNext()) {
                    w9.a aVar = (w9.a) it.next();
                    JSONArray jSONArrayF = aVar.f();
                    l.d("OneSignal SessionManager restartSessionIfNeeded lastIds: " + jSONArrayF);
                    x9.a aVarC = aVar.c();
                    if (jSONArrayF.length() > 0 ? p1Var.l(aVar, x9.c.f19121e, null, jSONArrayF) : p1Var.l(aVar, x9.c.f19122f, null, null)) {
                        arrayList.add(aVarC);
                    }
                }
                p1Var.k(arrayList);
                n().getClass();
                Date date = e1.f11774c;
                e1.f11774c = new Date();
                f12275u.getClass();
                N(System.currentTimeMillis());
            }
        } else if (f12268n) {
            l lVar2 = f12272r;
            String strConcat = "Continue on same session with appEntryState: ".concat(ic1.D(f12263i0));
            lVar2.getClass();
            l.d(strConcat);
            B.b(f12263i0, null);
        }
        s1 s1VarN = n();
        if (s1VarN.f12122n.isEmpty()) {
            e2 e2Var = s1VarN.f12120l;
            e2Var.getClass();
            String str2 = h4.f11856a;
            e2Var.f11779c.getClass();
            String strE = h4.e(str2, "PREFS_OS_CACHED_IAMS", null);
            s1VarN.f12116h.getClass();
            l.d("initWithCachedInAppMessages: " + strE);
            if (strE != null && !strE.isEmpty()) {
                synchronized (s1.A) {
                    try {
                        if (s1VarN.f12122n.isEmpty()) {
                            s1VarN.m0(new JSONArray(strE));
                        }
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
            }
        } else {
            l lVar3 = s1VarN.f12116h;
            String str3 = "initWithCachedInAppMessages with already in memory messages: " + s1VarN.f12122n;
            lVar3.getClass();
            l.d(str3);
        }
        if (!f12268n && s() != null) {
            f12272r.getClass();
            l.d("doSessionInit on background with already registered user");
        }
        if (M) {
            return;
        }
        M = true;
        if (f12268n && (((JSONObject) p4.b().p().f().f11790b).optBoolean("session") || ((JSONObject) p4.a().p().f().f11790b).optBoolean("session") || ((JSONObject) p4.c().p().f().f11790b).optBoolean("session"))) {
            K = false;
        }
        o0.d(f12248b, false, false, new x3());
        J = false;
        if (((j4) f12276v.f11790b) != null) {
            H();
        } else {
            C(f12252d, s(), true);
        }
    }

    public static q2 h(JSONArray jSONArray) {
        int length = jSONArray.length();
        int iOptInt = jSONArray.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean z7 = true;
        String strOptString = null;
        JSONObject jSONObject = null;
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jSONObject = jSONArray.getJSONObject(i10);
                if (strOptString == null && jSONObject.has("actionId")) {
                    strOptString = jSONObject.optString("actionId", null);
                }
                if (z7) {
                    z7 = false;
                } else {
                    arrayList.add(new g2(jSONObject));
                }
            } catch (Throwable th) {
                b(y3.f12230f, "Error parsing JSON item " + i10 + "/" + length + " for callback.", th);
            }
        }
        return new q2(new g2(arrayList, jSONObject, iOptInt), new b5(strOptString != null ? h2.f11854e : h2.f11853b, strOptString, 8));
    }

    public static Activity i() {
        e eVar = g.f11804e;
        if (eVar != null) {
            return eVar.f11770b;
        }
        return null;
    }

    public static x2 j(Context context) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (context == null) {
            return null;
        }
        if (T == null) {
            x2 x2Var = new x2();
            com.bumptech.glide.manager.t tVar = new com.bumptech.glide.manager.t("changed", false);
            x2Var.f12221b = tVar;
            boolean zA = OSUtils.a();
            boolean z7 = x2Var.f12222e != zA;
            x2Var.f12222e = zA;
            if (z7) {
                x2Var.f12221b.h(x2Var);
            }
            T = x2Var;
            ((List) tVar.f2364e).add(new OSPermissionChangedInternalObserver());
        }
        return T;
    }

    public static OSSubscriptionState k(Context context) {
        if (context == null) {
            return null;
        }
        if (W == null) {
            boolean z7 = j(context).f12222e;
            OSSubscriptionState oSSubscriptionState = new OSSubscriptionState();
            oSSubscriptionState.f11693b = new com.bumptech.glide.manager.t("changed", false);
            oSSubscriptionState.f11697m = !((JSONObject) p4.b().o().f().f11790b).optBoolean("userSubscribePref", true);
            oSSubscriptionState.f11694e = s();
            oSSubscriptionState.f11695f = p4.b().n();
            oSSubscriptionState.f11696j = z7;
            W = oSSubscriptionState;
            ((List) j(context).f12221b.f2364e).add(new WeakReference(W));
            ((List) W.f11693b.f2364e).add(new OSSubscriptionChangedInternalObserver());
        }
        return W;
    }

    public static String l() {
        if (f12262i == null && f12248b != null) {
            f12262i = h4.e(h4.f11856a, "OS_EMAIL_ID", null);
        }
        if (TextUtils.isEmpty(f12262i)) {
            return null;
        }
        return f12262i;
    }

    public static s m() {
        if (f12273s == null) {
            f0 f0Var = new f0(5);
            s sVar = new s();
            sVar.f12107c = new Object();
            sVar.f12108d = f0Var;
            sVar.f12105a = f12272r;
            f12273s = sVar;
        }
        return f12273s;
    }

    public static s1 n() {
        t1 t1Var = f12274t;
        f4 f4VarB = f4.b(f12248b);
        s sVar = f12277w;
        l lVar = f12272r;
        l lVar2 = f12280z;
        y9.a aVar = f12266l;
        if (t1Var.f12151a == null) {
            synchronized (t1.f12150b) {
                try {
                    if (t1Var.f12151a == null) {
                        t1Var.f12151a = new s1(f4VarB, sVar, lVar, lVar2, aVar);
                    }
                } finally {
                }
            }
        }
        return t1Var.f12151a;
    }

    public static p1 o() {
        if (C == null) {
            synchronized (F) {
                try {
                    if (C == null) {
                        if (D == null) {
                            D = new n8.s(f12272r, f12279y, f4.b(f12248b), f12280z);
                        }
                        C = new p1(B, D);
                    }
                } finally {
                }
            }
        }
        return C;
    }

    public static String p() {
        if (f12264j == null && f12248b != null) {
            f12264j = h4.e(h4.f11856a, "PREFS_OS_SMS_ID", null);
        }
        if (TextUtils.isEmpty(f12264j)) {
            return null;
        }
        return f12264j;
    }

    public static String q(Context context) {
        if (context == null) {
            return null;
        }
        return h4.e(h4.f11856a, "GT_APP_ID", null);
    }

    public static void r(k1 k1Var) {
        k3 k3Var = f12278x;
        boolean zF = k3Var.f("getTags()");
        l lVar = f12272r;
        if (zF) {
            lVar.getClass();
            l.e("Waiting for remote params. Moving getTags() operation to a pending queue.");
            k3Var.a(new s3(k1Var, 0));
        } else {
            if (O("getTags()")) {
                return;
            }
            if (k1Var != null) {
                new Thread(new s3(k1Var, 1), "OS_GETTAGS").start();
            } else {
                lVar.getClass();
                l.e("getTags called with null GetTagsHandler!");
            }
        }
    }

    public static String s() {
        if (f12260h == null && f12248b != null) {
            f12260h = h4.e(h4.f11856a, "GT_PLAYER_ID", null);
        }
        return f12260h;
    }

    public static void t(Context context) {
        e eVar = g.f11804e;
        boolean z7 = context instanceof Activity;
        boolean z10 = i() == null;
        f12268n = !z10 || z7;
        String str = "OneSignal handleActivityLifecycleHandler inForeground: " + f12268n;
        f12272r.getClass();
        l.d(str);
        if (!f12268n) {
            if (eVar != null) {
                eVar.f11771c = true;
                return;
            }
            return;
        }
        if (z10 && z7 && eVar != null) {
            eVar.d((Activity) context);
            eVar.f11771c = true;
        }
        s2.a(context, false);
        m().b();
    }

    public static void u() {
        String strQ = q(f12248b);
        y3 y3Var = y3.f12233n;
        if (strQ == null) {
            b(y3Var, "App id set for first time:  " + f12252d, null);
            Context context = f12248b;
            if (q3.e(context)) {
                try {
                    ba.c.a(context, 0);
                } catch (ba.b unused) {
                }
            }
            String str = f12252d;
            if (f12248b == null) {
                return;
            }
            h4.g(str, h4.f11856a, "GT_APP_ID");
            return;
        }
        if (strQ.equals(f12252d)) {
            return;
        }
        StringBuilder sbA = a0.h.A("App id has changed:\nFrom: ", strQ, "\n To: ");
        sbA.append(f12252d);
        sbA.append("\nClearing the user id, app state, and remoteParams as they are no longer valid");
        b(y3Var, sbA.toString(), null);
        String str2 = f12252d;
        if (f12248b != null) {
            h4.g(str2, h4.f11856a, "GT_APP_ID");
        }
        p4.b().v();
        p4.a().v();
        p4.c().v();
        p4.b().getClass();
        f12260h = null;
        if (f12248b != null) {
            h4.g(f12260h, h4.f11856a, "GT_PLAYER_ID");
        }
        p4.a().getClass();
        f12262i = null;
        if (f12248b != null) {
            h4.g("".equals(f12262i) ? null : f12262i, h4.f11856a, "OS_EMAIL_ID");
        }
        p4.c().getClass();
        f12264j = null;
        if (f12248b != null) {
            h4.g("".equals(f12264j) ? null : f12264j, h4.f11856a, "PREFS_OS_SMS_ID");
        }
        N(-3660L);
        f12276v.f11790b = null;
    }

    public static void v(Activity activity, JSONArray jSONArray, String str) throws JSONException {
        if (O(null)) {
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                String strOptString = new JSONObject(jSONArray.getJSONObject(i11).optString(SchedulerSupport.CUSTOM, null)).optString("i", null);
                HashSet hashSet = Q;
                if (!hashSet.contains(strOptString)) {
                    hashSet.add(strOptString);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", q(activity));
                    jSONObject.put("player_id", activity == null ? null : h4.e(h4.f11856a, "GT_PLAYER_ID", null));
                    jSONObject.put("opened", true);
                    I.getClass();
                    jSONObject.put("device_type", OSUtils.b());
                    OSUtils.v(new Thread(new l4("notifications/" + strOptString, jSONObject, new t3(), i10), "OS_REST_ASYNC_PUT"));
                }
            } catch (Throwable th) {
                b(y3.f12230f, "Failed to generate JSON to send notification opened.", th);
            }
        }
        if (f12271q != null) {
            f12276v.getClass();
            if (h4.b(h4.f11856a, "GT_FIREBASE_TRACKING_ENABLED", false)) {
                b5 b5Var = f12271q;
                g2 g2Var = h(jSONArray).f12070c;
                b5Var.getClass();
                if (b5.f11736n == null) {
                    b5.f11736n = new AtomicLong();
                }
                AtomicLong atomicLong = b5.f11736n;
                f12275u.getClass();
                atomicLong.set(System.currentTimeMillis());
                try {
                    Object objE = b5Var.e((Context) b5Var.f11739e);
                    Method methodG = b5.g(b5.f11734j);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "OneSignal");
                    bundle.putString("medium", "notification");
                    bundle.putString("notification_id", g2Var.f11815d);
                    bundle.putString("campaign", b5.d(g2Var));
                    methodG.invoke(objE, "os_notification_opened", bundle);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
        if (!f12268n) {
            try {
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            if (new b5(activity, jSONArray.getJSONObject(0)).f()) {
                e(str);
            }
        }
        F(activity, jSONArray);
        P.add(jSONArray);
    }

    public static void w(n2 n2Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(n2Var.f12013c.toString());
            jSONObject.put("androidNotificationId", n2Var.a());
            q2 q2VarH = h(new JSONArray().put(jSONObject));
            if (f12271q != null) {
                f12276v.getClass();
                if (h4.b(h4.f11856a, "GT_FIREBASE_TRACKING_ENABLED", false)) {
                    f12271q.j(q2VarH);
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static synchronized void x(Context context) {
        f12272r.getClass();
        l.k("Starting OneSignal initialization!");
        i2.a(f12248b);
        int i10 = 1;
        if (J() || ((j4) f12276v.f11790b) == null) {
            l.k(((j4) f12276v.f11790b) != null ? "OneSignal SDK initialization delayed, waiting for privacy consent to be set." : "OneSignal SDK initialization delayed, waiting for remote params.");
            Context context2 = f12248b;
            String str = f12252d;
            S = new b5(i10, context2, str);
            f12252d = null;
            if (str != null && context != null) {
                C(str, s(), false);
            }
            return;
        }
        int iN = f12265k;
        if (iN == Integer.MAX_VALUE) {
            OSUtils oSUtils = I;
            Context context3 = f12248b;
            String str2 = f12252d;
            oSUtils.getClass();
            iN = OSUtils.n(context3, str2);
        }
        f12265k = iN;
        if (iN == -999) {
            return;
        }
        if (f12267m) {
            l.d("OneSignal SDK initialization already completed.");
            return;
        }
        t(context);
        f12250c = null;
        p4.b().q();
        p4.a().q();
        p4.c().q();
        u();
        try {
            Class.forName("com.amazon.device.iap.PurchasingListener");
            f12270p = new a5(f12248b);
        } catch (ClassNotFoundException unused) {
        }
        OSPermissionChangedInternalObserver.a(j(f12248b));
        g();
        Context context4 = f12248b;
        if (d5.f11756i == -99) {
            d5.f11756i = context4.checkCallingOrSelfPermission("com.android.vending.BILLING");
        }
        try {
            if (d5.f11756i == 0) {
                d5.f11757j = Class.forName("com.android.vending.billing.IInAppBillingService");
            }
            if (d5.f11756i == 0) {
                f12269o = new d5(f12248b);
            }
        } catch (Throwable unused2) {
            d5.f11756i = 0;
        }
        try {
            b5.f11734j = FirebaseAnalytics.class;
            f12271q = new b5(f12248b);
        } catch (ClassNotFoundException unused3) {
        }
        f12267m = true;
        b(y3.f12234t, "OneSignal SDK initialization done.", null);
        p1 p1VarO = o();
        p1VarO.getClass();
        new Thread(new w2(p1VarO, i10), "OS_SEND_SAVED_OUTCOMES").start();
        f12278x.e();
    }

    public static void y(Context context) {
        String string;
        l lVar = f12272r;
        if (context == null) {
            lVar.getClass();
            l.l("initWithContext called with null context, ignoring!");
            return;
        }
        if (context instanceof Activity) {
            f12250c = new WeakReference((Activity) context);
        }
        int i10 = 0;
        int i11 = 1;
        boolean z7 = f12248b == null;
        Context applicationContext = context.getApplicationContext();
        f12248b = applicationContext;
        Application application = (Application) applicationContext;
        if (g.f11803b == null) {
            g gVar = new g();
            g.f11803b = gVar;
            application.registerActivityLifecycleCallbacks(gVar);
        }
        if (g.f11804e == null) {
            g.f11804e = new e(new g1());
        }
        if (g.f11805f == null) {
            f fVar = new f();
            g.f11805f = fVar;
            application.registerComponentCallbacks(fVar);
        }
        if (z7) {
            y9.a aVar = new y9.a();
            y9.a.f19420b = aVar;
            l lVar2 = f12280z;
            lVar2.getClass();
            aVar.f19421a = h4.e(h4.f11856a, "PREFS_OS_LANGUAGE", null) != null ? new p5.g(lVar2) : new q6.b(23);
            f12266l = aVar;
            h4.i();
            f4 f4VarB = f4.b(f12248b);
            m2 m2Var = new m2(f4VarB, lVar);
            E = m2Var;
            q3.R(new n1(m2Var, 2), "OS_NOTIFICATIONS_THREAD");
            s1 s1VarN = n();
            s1VarN.getClass();
            q3.R(new n1(s1VarN, i11), "OS_IAM_DB_ACCESS");
            if (D == null) {
                D = new n8.s(lVar, f12279y, f4VarB, lVar2);
            }
            Collection collectionValues = ((ConcurrentHashMap) ((l9) B.f12054b).f10881e).values();
            Intrinsics.e(collectionValues, "trackers.values");
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                ((w9.a) it.next()).g();
            }
            p1 p1VarO = o();
            p1VarO.getClass();
            new Thread(new w2(p1VarO, i10), "OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD").start();
        }
        ApplicationInfo applicationInfoH = l.h(f12248b);
        if (applicationInfoH != null && (string = applicationInfoH.metaData.getString("com.onesignal.PrivacyConsent")) != null) {
            boolean zEqualsIgnoreCase = "ENABLE".equalsIgnoreCase(string);
            j4 j4Var = (j4) f12276v.f11790b;
            if (j4Var != null && j4Var.f11921j != null) {
                lVar.getClass();
                l.l("setRequiresUserPrivacyConsent already called by remote params!, ignoring user set");
            } else if (!J() || zEqualsIgnoreCase) {
                h4.h(h4.f11856a, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", zEqualsIgnoreCase);
            } else {
                b(y3.f12230f, "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE", null);
            }
        }
        if (f12252d != null) {
            lVar.getClass();
            l.k("initWithContext called with: " + context);
            x(context);
            return;
        }
        String strQ = q(f12248b);
        if (strQ == null) {
            lVar.getClass();
            l.l("appContext set, but please call setAppId(appId) with a valid appId to complete OneSignal init!");
        } else {
            String strConcat = "appContext set and cached app id found, calling setAppId with: ".concat(strQ);
            lVar.getClass();
            l.k(strConcat);
            M(strQ);
        }
    }

    public static void z() {
        ArrayList arrayList = R;
        synchronized (arrayList) {
            try {
                if (arrayList.size() == 0) {
                    return;
                }
                new Thread(new a0(1), "OS_GETTAGS_CALLBACK").start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}