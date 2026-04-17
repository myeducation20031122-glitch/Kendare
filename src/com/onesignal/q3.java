package com.onesignal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.service.notification.StatusBarNotification;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.measurement.l9;
import io.reactivex.annotations.SchedulerSupport;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class q3 {

    /* renamed from: a, reason: collision with root package name */
    public static int f12073a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static Resources f12074b;

    /* renamed from: c, reason: collision with root package name */
    public static Context f12075c;

    /* renamed from: d, reason: collision with root package name */
    public static String f12076d;

    /* renamed from: e, reason: collision with root package name */
    public static Integer f12077e;

    /* renamed from: f, reason: collision with root package name */
    public static int f12078f;

    /* renamed from: g, reason: collision with root package name */
    public static ApplicationInfo f12079g;

    public static void A(String str, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject) throws JSONException {
        if (str.endsWith("_a") || str.endsWith("_d")) {
            jSONObject.put(str, jSONArray);
            return;
        }
        String strX = X(jSONArray);
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        String strX2 = jSONArray2 == null ? null : X(jSONArray2);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String str2 = (String) jSONArray.get(i10);
            if (jSONArray2 == null || !strX2.contains(str2)) {
                jSONArray3.put(str2);
            }
        }
        if (jSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String string = jSONArray2.getString(i11);
                if (!strX.contains(string)) {
                    jSONArray4.put(string);
                }
            }
        }
        if (!jSONArray3.toString().equals("[]")) {
            jSONObject.put(str.concat("_a"), jSONArray3);
        }
        if (jSONArray4.toString().equals("[]")) {
            return;
        }
        jSONObject.put(str.concat("_d"), jSONArray4);
    }

    public static final String B(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObjectQ = q(jSONObject);
            if (jSONObjectQ.has("a") && (jSONObjectOptJSONObject = jSONObjectQ.optJSONObject("a")) != null && jSONObjectOptJSONObject.has("os_in_app_message_preview_id")) {
                return jSONObjectOptJSONObject.optString("os_in_app_message_preview_id");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static Cursor C(Context context, f4 f4Var, String str, boolean z7) throws Throwable {
        Long lValueOf;
        String string;
        Cursor cursorH = f4Var.h("notification", new String[]{"android_notification_id", "created_time", "full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, "_id DESC");
        int count = cursorH.getCount();
        Cursor cursorH2 = null;
        if (count == 0 && !str.equals("os_group_undefined")) {
            cursorH.close();
            Integer numZ = z(f4Var, str);
            if (numZ == null) {
                return cursorH;
            }
            ((NotificationManager) context.getSystemService("notification")).cancel(numZ.intValue());
            ContentValues contentValues = new ContentValues();
            contentValues.put(z7 ? "dismissed" : "opened", (Integer) 1);
            f4Var.m("notification", contentValues, "android_notification_id = " + numZ, null);
            return cursorH;
        }
        if (count == 1) {
            cursorH.close();
            if (z(f4Var, str) == null) {
                return cursorH;
            }
            try {
                cursorH2 = f4.b(context).h("notification", s2.f12135a, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, null);
                s2.b(context, cursorH2, 0);
            } catch (Throwable th) {
                try {
                    z3.b(y3.f12230f, "Error restoring notification records! ", th);
                    if (cursorH2 != null && !cursorH2.isClosed()) {
                    }
                } catch (Throwable th2) {
                    if (cursorH2 != null && !cursorH2.isClosed()) {
                        cursorH2.close();
                    }
                    throw th2;
                }
            }
            if (!cursorH2.isClosed()) {
                cursorH2.close();
            }
            return cursorH;
        }
        try {
            cursorH.moveToFirst();
            lValueOf = Long.valueOf(cursorH.getLong(cursorH.getColumnIndex("created_time")));
            string = cursorH.getString(cursorH.getColumnIndex("full_data"));
            cursorH.close();
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (z(f4Var, str) == null) {
            return cursorH;
        }
        n2 n2Var = new n2(context);
        n2Var.f12014d = true;
        n2Var.f12016f = lValueOf;
        n2Var.f12013c = new JSONObject(string);
        Context context2 = n2Var.f12012b;
        f12075c = context2;
        f12076d = context2.getPackageName();
        f12074b = f12075c.getResources();
        i(n2Var, null);
        return cursorH;
    }

    public static boolean D(Bundle bundle) {
        String strX = null;
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString(SchedulerSupport.CUSTOM, null);
            if (string != null) {
                strX = x(string);
            } else {
                z3.b(y3.f12233n, "Not a OneSignal formatted Bundle. No 'custom' field in the bundle.", null);
            }
        }
        return strX != null;
    }

    public static void E(String str, String str2, com.google.android.gms.internal.ads.d0 d0Var) {
        i4 i4Var = new i4(str, str2, d0Var);
        String strW = a0.h.w("apps/", str, "/android_params.js");
        if (str2 != null) {
            strW = a0.h.G(strW, "?player_id=", str2);
        }
        z3.b(y3.f12233n, "Starting request to get Android parameters.", null);
        OSUtils.v(new Thread(new r1(strW, i4Var, "CACHE_KEY_REMOTE_PARAMS"), "OS_REST_ASYNC_GET"));
    }

    public static void F(String str, String str2, JSONObject jSONObject, q3 q3Var, int i10, String str3) throws InterruptedException {
        if (OSUtils.p()) {
            throw new androidx.fragment.app.y(a0.h.w("Method: ", str2, " was called from the Main Thread!"));
        }
        if (str2 == null || !z3.O(null)) {
            Thread[] threadArr = new Thread[1];
            Thread thread = new Thread(new m4(threadArr, str, str2, jSONObject, q3Var, i10, str3), "OS_HTTPConnection");
            OSUtils.v(thread);
            try {
                thread.join(i10 + 5000);
                if (thread.getState() != Thread.State.TERMINATED) {
                    thread.interrupt();
                }
                Thread thread2 = threadArr[0];
                if (thread2 != null) {
                    thread2.join();
                }
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void G(n2 n2Var) {
        if (n2Var.f12015e) {
            z3.b(y3.f12233n, "Marking restored or disabled notifications as dismissed: " + n2Var.toString(), null);
            String str = "android_notification_id = " + n2Var.a();
            f4 f4VarB = f4.b(n2Var.f12012b);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", (Integer) 1);
            f4VarB.m("notification", contentValues, str, null);
            Y(f4VarB, n2Var.f12012b);
        }
    }

    public static Object H(Object obj) {
        Class<?> cls = obj.getClass();
        return cls.equals(Integer.class) ? Long.valueOf(((Integer) obj).intValue()) : cls.equals(Float.class) ? Double.valueOf(((Float) obj).floatValue()) : obj;
    }

    public static final boolean I(Activity activity, JSONObject jSONObject) throws JSONException {
        Intrinsics.f(activity, "activity");
        String strB = B(jSONObject);
        if (strB == null) {
            return false;
        }
        z3.F(activity, new JSONArray().put(jSONObject));
        z3.n().e0(strB);
        return true;
    }

    public static void L(String str, JSONObject jSONObject, q3 q3Var) {
        OSUtils.v(new Thread(new l4(str, jSONObject, q3Var, 1), "OS_REST_ASYNC_POST"));
    }

    public static void M(Context context, Bundle bundle, t0 t0Var) throws Throwable {
        String str;
        String str2;
        u0 u0Var = new u0();
        if (!D(bundle)) {
            t0Var.d(u0Var);
            return;
        }
        u0Var.f12167a = true;
        String str3 = "n";
        if (bundle.containsKey("o")) {
            try {
                JSONObject jSONObject = new JSONObject(bundle.getString(SchedulerSupport.CUSTOM));
                JSONObject jSONObject2 = jSONObject.has("a") ? jSONObject.getJSONObject("a") : new JSONObject();
                JSONArray jSONArray = new JSONArray(bundle.getString("o"));
                bundle.remove("o");
                int i10 = 0;
                while (i10 < jSONArray.length()) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    String string = jSONObject3.getString(str3);
                    jSONObject3.remove(str3);
                    if (jSONObject3.has("i")) {
                        String string2 = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                        str = str3;
                        str2 = string2;
                    } else {
                        str = str3;
                        str2 = string;
                    }
                    jSONObject3.put("id", str2);
                    jSONObject3.put("text", string);
                    if (jSONObject3.has("p")) {
                        jSONObject3.put("icon", jSONObject3.getString("p"));
                        jSONObject3.remove("p");
                    }
                    i10++;
                    str3 = str;
                }
                jSONObject2.put("actionButtons", jSONArray);
                jSONObject2.put("actionId", "__DEFAULT__");
                if (!jSONObject.has("a")) {
                    jSONObject.put("a", jSONObject2);
                }
                bundle.putString(SchedulerSupport.CUSTOM, jSONObject.toString());
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        JSONObject jSONObjectF = f(bundle);
        String strB = B(jSONObjectF);
        if (strB == null) {
            b5 b5Var = new b5(u0Var, t0Var, 3);
            JSONObject jSONObjectF2 = f(bundle);
            z3.f12275u.getClass();
            z3.D(context, jSONObjectF2, new s0(bundle.getBoolean("is_restoring", false), context, bundle, b5Var, jSONObjectF2, System.currentTimeMillis() / 1000, Integer.parseInt(bundle.getString("pri", "0")) > 9, u0Var));
            return;
        }
        if (z3.f12267m && z3.f12268n) {
            z3.n().e0(strB);
        } else {
            g2 g2Var = new g2(jSONObjectF);
            n2 n2Var = new n2();
            n2Var.f12012b = context;
            n2Var.f12013c = jSONObjectF;
            n2Var.b(g2Var);
            Context context2 = n2Var.f12012b;
            f12075c = context2;
            f12076d = context2.getPackageName();
            f12074b = f12075c.getResources();
            V(n2Var);
        }
        u0Var.f12169c = true;
        t0Var.d(u0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void N(Context context, Intent intent) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArrayPut;
        boolean z7;
        String str;
        y3 y3Var;
        boolean z10;
        o2 o2Var;
        o2 o2Var2;
        JSONObject jSONObject2;
        boolean z11;
        String strConcat;
        String[] strArr;
        o2 o2Var3;
        int i10;
        boolean booleanExtra;
        String stringExtra;
        Cursor cursorC;
        String[] strArr2;
        if (!intent.hasExtra("onesignalData") && !intent.hasExtra("summary") && !intent.hasExtra("androidNotificationId")) {
            return;
        }
        if (context != null) {
            z3.y(context.getApplicationContext());
        }
        if (intent.getBooleanExtra("action_button", false)) {
            new e0.n0(context).f12414b.cancel(null, intent.getIntExtra("androidNotificationId", 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
        f4 f4VarB = f4.b(context);
        String stringExtra2 = intent.getStringExtra("summary");
        boolean booleanExtra2 = intent.getBooleanExtra("dismissed", false);
        y3 y3Var2 = y3.f12230f;
        if (booleanExtra2) {
            str = "NotificationOpenedProcessor processIntent from an non Activity context: ";
            y3Var = y3Var2;
            z7 = booleanExtra2;
            z10 = true;
            o2Var2 = null;
        } else {
            try {
                jSONObject = new JSONObject(intent.getStringExtra("onesignalData"));
                try {
                } catch (JSONException e10) {
                    e = e10;
                    e.printStackTrace();
                    jSONArrayPut = null;
                    JSONObject jSONObject3 = jSONObject;
                    if (stringExtra2 == null) {
                    }
                    o2Var = new o2();
                    o2Var.f12042a = jSONArrayPut;
                    o2Var.f12043b = jSONObject2;
                    if (o2Var == null) {
                    }
                }
            } catch (JSONException e11) {
                e = e11;
                jSONObject = null;
            }
            if (!(context instanceof Activity)) {
                z3.b(y3Var2, "NotificationOpenedProcessor processIntent from an non Activity context: " + context, null);
            } else if (I((Activity) context, jSONObject)) {
                o2Var = null;
                str = "NotificationOpenedProcessor processIntent from an non Activity context: ";
                y3Var = y3Var2;
                z7 = booleanExtra2;
                z10 = true;
                if (o2Var == null) {
                    return;
                } else {
                    o2Var2 = o2Var;
                }
            }
            jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
            intent.putExtra("onesignalData", jSONObject.toString());
            jSONArrayPut = new JSONArray().put(new JSONObject(intent.getStringExtra("onesignalData")));
            JSONObject jSONObject32 = jSONObject;
            if (stringExtra2 == null) {
                jSONObject2 = jSONObject32;
                str = "NotificationOpenedProcessor processIntent from an non Activity context: ";
                z10 = true;
                y3 y3Var3 = y3Var2;
                z7 = booleanExtra2;
                Cursor cursorH = f4VarB.h("notification", new String[]{"full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{stringExtra2}, null);
                if (cursorH.getCount() > 1) {
                    cursorH.moveToFirst();
                    while (true) {
                        try {
                            jSONArrayPut.put(new JSONObject(cursorH.getString(cursorH.getColumnIndex("full_data"))));
                            y3Var = y3Var3;
                        } catch (JSONException unused) {
                            y3Var = y3Var3;
                            z3.b(y3Var, "Could not parse JSON of sub notification in group: ".concat(stringExtra2), null);
                        }
                        if (!cursorH.moveToNext()) {
                            break;
                        } else {
                            y3Var3 = y3Var;
                        }
                    }
                } else {
                    y3Var = y3Var3;
                }
                cursorH.close();
            } else {
                jSONObject2 = jSONObject32;
                str = "NotificationOpenedProcessor processIntent from an non Activity context: ";
                y3Var = y3Var2;
                z7 = booleanExtra2;
                z10 = true;
            }
            o2Var = new o2();
            o2Var.f12042a = jSONArrayPut;
            o2Var.f12043b = jSONObject2;
            if (o2Var == null) {
            }
        }
        String stringExtra3 = intent.getStringExtra("summary");
        if (stringExtra3 != null) {
            boolean zEquals = stringExtra3.equals("os_group_undefined");
            if (zEquals) {
                strConcat = "group_id IS NULL";
                z11 = z7;
                strArr2 = null;
            } else {
                z11 = z7;
                strArr2 = new String[]{stringExtra3};
                strConcat = "group_id = ?";
            }
            if (!z11) {
                z3.f12276v.getClass();
                if (h4.b(h4.f11856a, "OS_CLEAR_GROUP_SUMMARY_CLICK", z10)) {
                    strArr = strArr2;
                } else {
                    String strValueOf = String.valueOf(u(f4VarB, stringExtra3, zEquals));
                    strConcat = strConcat.concat(" AND android_notification_id = ?");
                    strArr = zEquals ? new String[]{strValueOf} : new String[]{stringExtra3, strValueOf};
                }
            }
        } else {
            z11 = z7;
            strConcat = "android_notification_id = " + intent.getIntExtra("androidNotificationId", 0);
            strArr = null;
        }
        if (stringExtra3 == null) {
            o2Var3 = o2Var2;
            if (Build.VERSION.SDK_INT >= 23) {
                int i11 = 0;
                for (StatusBarNotification statusBarNotification : l(context)) {
                    if ((statusBarNotification.getNotification().flags & 512) == 0 && "os_group_undefined".equals(statusBarNotification.getNotification().getGroup())) {
                        i11++;
                    }
                }
                i10 = 1;
                if (Integer.valueOf(i11).intValue() < 1) {
                    ((NotificationManager) context.getSystemService("notification")).cancel(-718463522);
                }
            }
            ContentValues contentValues = new ContentValues();
            booleanExtra = intent.getBooleanExtra("dismissed", false);
            Integer numValueOf = Integer.valueOf(i10);
            if (booleanExtra) {
                contentValues.put("opened", numValueOf);
            } else {
                contentValues.put("dismissed", numValueOf);
            }
            f4VarB.m("notification", contentValues, strConcat, strArr);
            Y(f4VarB, context);
            if (stringExtra2 == null && (stringExtra = intent.getStringExtra("grp")) != null) {
                try {
                    cursorC = C(context, f4VarB, stringExtra, z11);
                    if (!cursorC.isClosed()) {
                        cursorC.close();
                    }
                } catch (Throwable th) {
                    z3.b(y3Var, "Error running updateSummaryNotificationAfterChildRemoved!", th);
                }
            }
            y3 y3Var4 = y3.f12233n;
            z3.b(y3Var4, "processIntent from context: " + context + " and intent: " + intent, null);
            if (intent.getExtras() != null) {
                z3.b(y3Var4, "processIntent intent extras: " + intent.getExtras().toString(), null);
            }
            if (z11) {
                if (!(context instanceof Activity)) {
                    z3.b(y3Var, str + context, null);
                    return;
                } else {
                    o2 o2Var4 = o2Var3;
                    z3.v((Activity) context, o2Var4.f12042a, w(o2Var4.f12043b));
                    return;
                }
            }
            return;
        }
        Integer numZ = z(f4VarB, stringExtra3);
        boolean zEquals2 = stringExtra3.equals("os_group_undefined");
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        Integer numU = u(f4VarB, stringExtra3, zEquals2);
        if (numU != null) {
            z3.f12276v.getClass();
            o2Var3 = o2Var2;
            if (h4.b(h4.f11856a, "OS_CLEAR_GROUP_SUMMARY_CLICK", z10)) {
                if (zEquals2) {
                    numZ = -718463522;
                }
                if (numZ != null) {
                    notificationManager.cancel(numZ.intValue());
                }
            } else {
                z3.I(numU.intValue());
            }
        } else {
            o2Var3 = o2Var2;
        }
        i10 = 1;
        ContentValues contentValues2 = new ContentValues();
        booleanExtra = intent.getBooleanExtra("dismissed", false);
        Integer numValueOf2 = Integer.valueOf(i10);
        if (booleanExtra) {
        }
        f4VarB.m("notification", contentValues2, strConcat, strArr);
        Y(f4VarB, context);
        if (stringExtra2 == null) {
            cursorC = C(context, f4VarB, stringExtra, z11);
            if (!cursorC.isClosed()) {
            }
        }
        y3 y3Var42 = y3.f12233n;
        z3.b(y3Var42, "processIntent from context: " + context + " and intent: " + intent, null);
        if (intent.getExtras() != null) {
        }
        if (z11) {
        }
    }

    public static int O(i2 i2Var, boolean z7) {
        boolean zV;
        z3.b(y3.f12233n, "Starting processJobForDisplay opened: false fromBackgroundLogic: " + z7, null);
        n2 n2Var = i2Var.f11891a;
        if (!n2Var.f12014d && n2Var.f12013c.has("collapse_key") && !"do_not_collapse".equals(n2Var.f12013c.optString("collapse_key"))) {
            Cursor cursorH = f4.b(n2Var.f12012b).h("notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{n2Var.f12013c.optString("collapse_key")}, null);
            if (cursorH.moveToFirst()) {
                n2Var.f12011a.f11814c = cursorH.getInt(cursorH.getColumnIndex("android_notification_id"));
            }
            cursorH.close();
        }
        int iIntValue = n2Var.a().intValue();
        n2Var.f12011a.getClass();
        if (!TextUtils.isEmpty(n2Var.f12013c.optString("alert"))) {
            n2Var.f12015e = true;
            if (z7) {
                z3.b(y3.f12232m, !z3.f12268n ? "App is in background, show notification" : "No NotificationWillShowInForegroundHandler setup, show notification", null);
            }
            Context context = n2Var.f12012b;
            f12075c = context;
            f12076d = context.getPackageName();
            f12074b = f12075c.getResources();
            if (OSUtils.p()) {
                throw new androidx.fragment.app.y("Process for showing a notification should never been done on Main Thread!");
            }
            f12077e = Build.VERSION.SDK_INT >= 24 ? 2 : 1;
            zV = V(n2Var);
        } else {
            zV = false;
        }
        if (!n2Var.f12014d) {
            P(n2Var, false, zV);
            String strW = w(n2Var.f12013c);
            Set set = t2.f12152a;
            if (!TextUtils.isEmpty(strW)) {
                t2.f12152a.remove(strW);
            }
            z3.w(n2Var);
        }
        return iIntValue;
    }

    public static void P(n2 n2Var, boolean z7, boolean z10) {
        JSONObject jSONObject;
        String strOptString;
        z2 z2Var;
        y3 y3Var = y3.f12233n;
        z3.b(y3Var, "Saving Notification job: " + n2Var.toString(), null);
        Context context = n2Var.f12012b;
        JSONObject jSONObject2 = n2Var.f12013c;
        try {
            JSONObject jSONObjectQ = q(jSONObject2);
            f4 f4VarB = f4.b(n2Var.f12012b);
            if (n2Var.f12015e) {
                String str = "android_notification_id = " + n2Var.a();
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", (Integer) 1);
                f4VarB.m("notification", contentValues, str, null);
                Y(f4VarB, context);
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("notification_id", jSONObjectQ.optString("i"));
            if (jSONObject2.has("grp")) {
                contentValues2.put("group_id", jSONObject2.optString("grp"));
            }
            if (jSONObject2.has("collapse_key") && !"do_not_collapse".equals(jSONObject2.optString("collapse_key"))) {
                contentValues2.put("collapse_id", jSONObject2.optString("collapse_key"));
            }
            contentValues2.put("opened", Integer.valueOf(z7 ? 1 : 0));
            if (!z7) {
                contentValues2.put("android_notification_id", n2Var.a());
            }
            String str2 = n2Var.f12011a.f11818g;
            if (str2 != null) {
                contentValues2.put("title", str2.toString());
            }
            String str3 = n2Var.f12011a.f11819h;
            if (str3 != null) {
                contentValues2.put("message", str3.toString());
            }
            z3.f12275u.getClass();
            contentValues2.put("expire_time", Long.valueOf((jSONObject2.optLong("google.sent_time", System.currentTimeMillis()) / 1000) + jSONObject2.optInt("google.ttl", 259200)));
            contentValues2.put("full_data", jSONObject2.toString());
            f4VarB.f(contentValues2);
            z3.b(y3Var, "Notification saved values: " + contentValues2.toString(), null);
            if (!z7) {
                Y(f4VarB, context);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (!z10) {
            G(n2Var);
            return;
        }
        JSONObject jSONObject3 = n2Var.f12013c;
        l lVar = z3.f12272r;
        if (jSONObject3 == null) {
            strOptString = null;
        } else {
            try {
                jSONObject = new JSONObject(jSONObject3.getString(SchedulerSupport.CUSTOM));
            } catch (JSONException unused) {
                lVar.getClass();
                l.d("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.");
            }
            if (jSONObject.has("i")) {
                strOptString = jSONObject.optString("i", null);
            } else {
                lVar.getClass();
                l.d("Not a OneSignal formatted FCM message. No 'i' field in custom.");
                strOptString = null;
            }
        }
        Context context2 = n2Var.f12012b;
        synchronized (z2.class) {
            try {
                if (z2.f12244b == null) {
                    z2.f12244b = new z2();
                }
                z2Var = z2.f12244b;
            } catch (Throwable th) {
                throw th;
            }
        }
        z2Var.f12245a.getClass();
        boolean zB = h4.b(h4.f11856a, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", false);
        y3 y3Var2 = y3.f12233n;
        if (zB) {
            int iNextInt = new Random().nextInt(26);
            HashMap map = new HashMap();
            map.put("os_notification_id", strOptString);
            z1.g gVar = new z1.g(map);
            z1.g.c(gVar);
            z1.p pVar = z1.p.f19482b;
            z1.e eVar = new z1.e();
            z1.p pVar2 = z1.p.f19483e;
            z1.c cVar = new z1.c();
            cVar.f19459a = pVar;
            cVar.f19464f = -1L;
            cVar.f19465g = -1L;
            cVar.f19466h = new z1.e();
            cVar.f19460b = false;
            int i10 = Build.VERSION.SDK_INT;
            cVar.f19461c = false;
            cVar.f19459a = pVar2;
            cVar.f19462d = false;
            cVar.f19463e = false;
            if (i10 >= 24) {
                cVar.f19466h = eVar;
                cVar.f19464f = -1L;
                cVar.f19465g = -1L;
            }
            z1.q qVar = new z1.q(OSReceiveReceiptController$ReceiveReceiptWorker.class);
            qVar.f19498b.f13267j = cVar;
            z1.q qVarB = qVar.b(iNextInt, TimeUnit.SECONDS);
            qVarB.f19498b.f13262e = gVar;
            z1.r rVarA = qVarB.a();
            z3.b(y3Var2, "OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + strOptString + " and delay: " + iNextInt + " seconds", null);
            s(context2).q(a0.h.F(strOptString, "_receive_receipt"), Collections.singletonList(rVarA));
        } else {
            z3.b(y3Var2, "sendReceiveReceipt disabled", null);
        }
        p1 p1Var = z3.B;
        ((l) p1Var.f12056f).getClass();
        l.d("OneSignal SessionManager onNotificationReceived notificationId: " + strOptString);
        if (strOptString == null || strOptString.isEmpty()) {
            return;
        }
        ((l9) p1Var.f12054b).l().i(strOptString);
    }

    public static Bitmap Q(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int dimension = (int) f12074b.getDimension(R.dimen.notification_large_icon_height);
            int dimension2 = (int) f12074b.getDimension(R.dimen.notification_large_icon_width);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width <= dimension2 && height <= dimension) {
                return bitmap;
            }
            if (height > width) {
                dimension2 = (int) (dimension * (width / height));
            } else if (width > height) {
                dimension = (int) (dimension2 * (height / width));
            }
            return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    public static void R(j jVar, String str) {
        if (OSUtils.p()) {
            new Thread(jVar, str).start();
        } else {
            jVar.run();
        }
    }

    public static void S(c1 c1Var, String str, long j10) {
        z3.b(y3.f12233n, "scheduleTrigger: " + str + " delay: " + j10, null);
        new Timer(a0.h.v("trigger_timer:", str)).schedule(c1Var, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void T(RemoteViews remoteViews, JSONObject jSONObject, int i10, String str, String str2) {
        Integer numValueOf;
        int iB;
        if (jSONObject != null) {
            numValueOf = jSONObject.has(str) ? Integer.valueOf(new BigInteger(jSONObject.optString(str), 16).intValue()) : null;
        }
        if (numValueOf != null) {
            iB = numValueOf.intValue();
        } else {
            int identifier = f12074b.getIdentifier(str2, "color", f12076d);
            if (identifier == 0) {
                return;
            }
            Context context = f12075c;
            iB = Build.VERSION.SDK_INT > 22 ? a6.c.b(context, identifier) : context.getResources().getColor(identifier);
        }
        remoteViews.setTextColor(i10, iB);
    }

    public static void U(Activity activity, String str, String str2, final p0 p0Var) {
        String string = activity.getString(2131886850);
        Intrinsics.e(string, "activity.getString(R.str…sion_not_available_title)");
        final int i10 = 1;
        final int i11 = 0;
        String str3 = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.e(str3, "java.lang.String.format(this, *args)");
        String string2 = activity.getString(2131886848);
        Intrinsics.e(string2, "activity.getString(R.str…on_not_available_message)");
        String str4 = String.format(string2, Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.e(str4, "java.lang.String.format(this, *args)");
        new AlertDialog.Builder(activity).setTitle(str3).setMessage(str4).setPositiveButton(2131886849, new DialogInterface.OnClickListener() { // from class: com.onesignal.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) throws PackageManager.NameNotFoundException {
                int i13 = i11;
                i callback = p0Var;
                switch (i13) {
                    case 0:
                        Intrinsics.f(callback, "$callback");
                        p0 p0Var2 = (p0) callback;
                        int i14 = p0Var2.f12052a;
                        Activity context = p0Var2.f12053b;
                        switch (i14) {
                            case 0:
                                Intrinsics.f(context, "context");
                                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intent.setData(Uri.parse(Intrinsics.l(context.getPackageName(), "package:")));
                                context.startActivity(intent);
                                o0.i(true, 2);
                                break;
                            default:
                                Intrinsics.f(context, "context");
                                Intent intent2 = new Intent();
                                intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                                intent2.addFlags(268435456);
                                intent2.putExtra("app_package", context.getPackageName());
                                ApplicationInfo applicationInfoH = l.h(context);
                                if (applicationInfoH != null) {
                                    intent2.putExtra("app_uid", applicationInfoH.uid);
                                }
                                intent2.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                                context.startActivity(intent2);
                                a1.f11711b = true;
                                break;
                        }
                    default:
                        Intrinsics.f(callback, "$callback");
                        switch (((p0) callback).f12052a) {
                            case 0:
                                o0.i(true, 2);
                                break;
                            default:
                                a1.c(false);
                                break;
                        }
                }
            }
        }).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() { // from class: com.onesignal.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) throws PackageManager.NameNotFoundException {
                int i13 = i10;
                i callback = p0Var;
                switch (i13) {
                    case 0:
                        Intrinsics.f(callback, "$callback");
                        p0 p0Var2 = (p0) callback;
                        int i14 = p0Var2.f12052a;
                        Activity context = p0Var2.f12053b;
                        switch (i14) {
                            case 0:
                                Intrinsics.f(context, "context");
                                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intent.setData(Uri.parse(Intrinsics.l(context.getPackageName(), "package:")));
                                context.startActivity(intent);
                                o0.i(true, 2);
                                break;
                            default:
                                Intrinsics.f(context, "context");
                                Intent intent2 = new Intent();
                                intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                                intent2.addFlags(268435456);
                                intent2.putExtra("app_package", context.getPackageName());
                                ApplicationInfo applicationInfoH = l.h(context);
                                if (applicationInfoH != null) {
                                    intent2.putExtra("app_uid", applicationInfoH.uid);
                                }
                                intent2.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                                context.startActivity(intent2);
                                a1.f11711b = true;
                                break;
                        }
                    default:
                        Intrinsics.f(callback, "$callback");
                        switch (((p0) callback).f12052a) {
                            case 0:
                                o0.i(true, 2);
                                break;
                            default:
                                a1.c(false);
                                break;
                        }
                }
            }
        }).show();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|(19:4|(6:6|(1:8)(1:9)|10|(1:16)(1:15)|(1:99)(2:19|97)|20)|96|(0)(4:24|(2:27|25)|100|28)|31|94|32|36|(1:38)|(1:40)(1:41)|42|92|43|(1:45)(1:46)|91|49|(9:51|87|52|53|(1:58)(1:57)|59|(1:61)|62|(1:69)(4:66|89|67|68))(1:70)|71|(2:73|(1:81)(1:75))(1:83))(1:30)|29|31|94|32|36|(0)|(0)(0)|42|92|43|(0)(0)|91|49|(0)(0)|71|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        com.onesignal.z3.b(com.onesignal.y3.f12230f, "Could not set background notification image!", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
    
        com.onesignal.x0.a(r14, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5 A[Catch: all -> 0x00fd, TryCatch #2 {all -> 0x00fd, blocks: (B:43:0x00ef, B:45:0x00f5, B:46:0x00f9), top: B:92:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9 A[Catch: all -> 0x00fd, TRY_LEAVE, TryCatch #2 {all -> 0x00fd, blocks: (B:43:0x00ef, B:45:0x00f5, B:46:0x00f9), top: B:92:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean V(n2 n2Var) throws Throwable {
        ArrayList arrayList;
        String str;
        Notification notificationA;
        int i10;
        NotificationChannel notificationChannel;
        int iIntValue = n2Var.a().intValue();
        JSONObject jSONObject = n2Var.f12013c;
        String strOptString = jSONObject.optString("grp", null);
        p1 p1Var = new p1(f12075c);
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            Context context = f12075c;
            arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : l(context)) {
                Notification notification = statusBarNotification.getNotification();
                String str2 = x0.f12219a;
                boolean z7 = (statusBarNotification.getNotification().flags & 512) != 0;
                boolean z10 = notification.getGroup() == null || notification.getGroup().equals("os_group_undefined");
                if (!z7 && z10) {
                    arrayList.add(statusBarNotification);
                }
            }
            if (strOptString == null && arrayList.size() >= 3) {
                Context context2 = f12075c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    StatusBarNotification statusBarNotification2 = (StatusBarNotification) it.next();
                    new e0.n0(context2).b(statusBarNotification2.getId(), a2.l.a(context2, statusBarNotification2.getNotification()).setGroup("os_group_undefined").setOnlyAlertOnce(true).build());
                }
                str = "os_group_undefined";
            }
            w wVarN = n(n2Var);
            e0.w wVar = (e0.w) wVarN.f12211e;
            c(iIntValue, wVar, p1Var, null, jSONObject);
            b(jSONObject, wVar);
            n2Var.f12011a.getClass();
            if (n2Var.f12014d) {
                wVar.d(8, true);
                wVar.c(0);
                wVar.f(null);
                Notification notification2 = wVar.f12452v;
                notification2.vibrate = null;
                notification2.tickerText = e0.w.b(null);
            }
            int i11 = str == null ? 2 : 1;
            Context context3 = f12075c;
            String str3 = x0.f12219a;
            if (Build.VERSION.SDK_INT < 23) {
                x0.b(context3, i11);
            } else {
                x0.a(context3, i11);
            }
            if (str == null) {
                SecureRandom secureRandom = new SecureRandom();
                wVar.f12437g = p1Var.e(p1Var.f(iIntValue).putExtra("onesignalData", jSONObject.toString()).putExtra("grp", str), secureRandom.nextInt());
                wVar.f12452v.deleteIntent = PendingIntent.getBroadcast(f12075c, secureRandom.nextInt(), v(iIntValue).putExtra("grp", str), 201326592);
                wVar.f12443m = str;
                try {
                    wVar.f12450t = f12077e.intValue();
                } catch (Throwable unused) {
                }
                int i12 = Build.VERSION.SDK_INT;
                boolean z11 = i12 < 24 && !n2Var.f12014d;
                notificationA = wVar.a();
                if (z11) {
                    wVar.f(null);
                }
                if (i12 < 24 || !str.equals("os_group_undefined")) {
                    i(n2Var, wVarN);
                } else {
                    int size = arrayList.size() + 1;
                    JSONObject jSONObject2 = n2Var.f12013c;
                    SecureRandom secureRandom2 = new SecureRandom();
                    String str4 = size + " new messages";
                    h(f4.b(f12075c), "os_group_undefined", -718463522);
                    PendingIntent pendingIntentE = p1Var.e(p1Var.f(-718463522).putExtra("onesignalData", jSONObject2.toString()).putExtra("summary", "os_group_undefined"), secureRandom2.nextInt());
                    PendingIntent broadcast = PendingIntent.getBroadcast(f12075c, secureRandom2.nextInt(), v(0).putExtra("summary", "os_group_undefined"), 201326592);
                    e0.w wVar2 = (e0.w) n(n2Var).f12211e;
                    wVar2.f12437g = pendingIntentE;
                    wVar2.f12452v.deleteIntent = broadcast;
                    wVar2.f12435e = e0.w.b(m());
                    wVar2.f12436f = e0.w.b(str4);
                    wVar2.f12439i = size;
                    wVar2.f12452v.icon = r();
                    wVar2.e(Q(p("ic_onesignal_large_icon_default")));
                    wVar2.d(8, true);
                    wVar2.d(16, false);
                    wVar2.f12443m = "os_group_undefined";
                    wVar2.f12444n = true;
                    try {
                        wVar2.f12450t = f12077e.intValue();
                    } catch (Throwable unused2) {
                    }
                    e0.u uVar = new e0.u(1);
                    uVar.f12455b = e0.w.b(str4);
                    wVar2.g(uVar);
                    new e0.n0(f12075c).b(-718463522, wVar2.a());
                }
            } else {
                SecureRandom secureRandom3 = new SecureRandom();
                wVar.f12437g = p1Var.e(p1Var.f(iIntValue).putExtra("onesignalData", jSONObject.toString()), secureRandom3.nextInt());
                wVar.f12452v.deleteIntent = PendingIntent.getBroadcast(f12075c, secureRandom3.nextInt(), v(iIntValue), 201326592);
                notificationA = wVar.a();
            }
            d(wVarN, notificationA);
            new e0.n0(f12075c).b(iIntValue, notificationA);
            i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                return true;
            }
            Context context4 = f12075c;
            return new e0.n0(context4).a() && (i10 < 26 || (notificationChannel = ((NotificationManager) context4.getSystemService("notification")).getNotificationChannel(a6.a.l(notificationA))) == null || notificationChannel.getImportance() != 0);
        }
        arrayList = arrayList2;
        str = strOptString;
        w wVarN2 = n(n2Var);
        e0.w wVar3 = (e0.w) wVarN2.f12211e;
        c(iIntValue, wVar3, p1Var, null, jSONObject);
        b(jSONObject, wVar3);
        n2Var.f12011a.getClass();
        if (n2Var.f12014d) {
        }
        if (str == null) {
        }
        Context context32 = f12075c;
        String str32 = x0.f12219a;
        if (Build.VERSION.SDK_INT < 23) {
        }
        if (str == null) {
        }
        d(wVarN2, notificationA);
        new e0.n0(f12075c).b(iIntValue, notificationA);
        i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
        }
    }

    public static void W() {
        PackageInfo packageInfo;
        if (OSUtils.b() == 1) {
            x xVarI = l.i(128, z3.f12248b, "com.google.android.gms");
            if (xVarI.f12217a && (packageInfo = xVarI.f12218b) != null) {
                if (!((String) packageInfo.applicationInfo.loadLabel(z3.f12248b.getPackageManager())).equals("Market")) {
                    z3.f12276v.getClass();
                    String str = h4.f11856a;
                    int i10 = 0;
                    if (h4.b(str, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", false) || h4.b(str, "GT_DO_NOT_SHOW_MISSING_GPS", false)) {
                        return;
                    }
                    OSUtils.u(new a0(i10));
                }
            }
        }
    }

    public static String X(JSONArray jSONArray) {
        String str = "[";
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                str = str + "\"" + jSONArray.getString(i10) + "\"";
            } catch (JSONException unused) {
            }
        }
        return a0.h.F(str, "]");
    }

    public static void Y(f4 f4Var, Context context) {
        if (e(context) && OSUtils.a()) {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    int i10 = 0;
                    for (StatusBarNotification statusBarNotification : l(context)) {
                        String str = x0.f12219a;
                        if ((statusBarNotification.getNotification().flags & 512) == 0) {
                            i10++;
                        }
                    }
                    if (e(context)) {
                        ba.c.a(context, i10);
                    }
                } else {
                    Cursor cursorJ = f4Var.j("notification", null, f4.k().toString(), null, null, x0.f12219a);
                    int count = cursorJ.getCount();
                    cursorJ.close();
                    if (e(context)) {
                        ba.c.a(context, count);
                    }
                }
            } catch (ba.b unused) {
            }
        }
    }

    public static void b(JSONObject jSONObject, e0.w wVar) throws JSONException {
        Bitmap bitmapP;
        JSONObject jSONObject2;
        String string;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            z3.b(y3.f12234t, "Cannot use background images in notifications for device on version: " + i10, null);
            return;
        }
        String strOptString = jSONObject.optString("bg_img", null);
        if (strOptString != null) {
            jSONObject2 = new JSONObject(strOptString);
            bitmapP = o(jSONObject2.optString("img", null));
        } else {
            bitmapP = null;
            jSONObject2 = null;
        }
        if (bitmapP == null) {
            bitmapP = p("onesignal_bgimage_default_image");
        }
        if (bitmapP != null) {
            RemoteViews remoteViews = new RemoteViews(f12075c.getPackageName(), 2131493012);
            CharSequence charSequenceOptString = jSONObject.optString("title", null);
            if (charSequenceOptString == null) {
                charSequenceOptString = m();
            }
            remoteViews.setTextViewText(2131296757, charSequenceOptString);
            remoteViews.setTextViewText(2131296756, jSONObject.optString("alert"));
            T(remoteViews, jSONObject2, 2131296757, "tc", "onesignal_bgimage_notif_title_color");
            T(remoteViews, jSONObject2, 2131296756, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                int identifier = f12074b.getIdentifier("onesignal_bgimage_notif_image_align", "string", f12076d);
                string = identifier != 0 ? f12074b.getString(identifier) : null;
            } else {
                string = jSONObject2.getString("img_align");
            }
            if ("right".equals(string)) {
                remoteViews.setViewPadding(2131296754, -5000, 0, 0, 0);
                remoteViews.setImageViewBitmap(2131296755, bitmapP);
                remoteViews.setViewVisibility(2131296755, 0);
                remoteViews.setViewVisibility(2131296753, 2);
            } else {
                remoteViews.setImageViewBitmap(2131296753, bitmapP);
            }
            wVar.f12452v.contentView = remoteViews;
            wVar.g(null);
        }
    }

    public static void c(int i10, e0.w wVar, p1 p1Var, String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString(SchedulerSupport.CUSTOM));
            if (jSONObject2.has("a")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
                        JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                        Intent intentF = p1Var.f(i10);
                        intentF.setAction("" + i11);
                        intentF.putExtra("action_button", true);
                        jSONObject4.put("actionId", jSONObjectOptJSONObject.optString("id"));
                        intentF.putExtra("onesignalData", jSONObject4.toString());
                        if (str != null) {
                            intentF.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            intentF.putExtra("grp", jSONObject.optString("grp"));
                        }
                        wVar.f12432b.add(new e0.q(jSONObjectOptJSONObject.has("icon") ? y(jSONObjectOptJSONObject.optString("icon")) : 0, jSONObjectOptJSONObject.optString("text"), p1Var.e(intentF, i10)));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void d(w wVar, Notification notification) {
        if (wVar.f12210b) {
            try {
                Object objNewInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = objNewInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(objNewInstance, Boolean.TRUE);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, objNewInstance);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean e(Context context) {
        int i10 = f12073a;
        if (i10 != -1) {
            return i10 == 1;
        }
        ApplicationInfo applicationInfoH = l.h(context);
        if (applicationInfoH == null) {
            f12073a = 0;
            z3.b(y3.f12230f, "Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", null);
            return false;
        }
        Bundle bundle = applicationInfoH.metaData;
        if (bundle != null) {
            f12073a = !"DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 1 : 0;
        } else {
            f12073a = 1;
        }
        return f12073a == 1;
    }

    public static JSONObject f(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e10) {
                z3.b(y3.f12230f, "bundleAsJSONObject error for key: " + str, e10);
            }
        }
        return jSONObject;
    }

    public static int g(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            Log.e("OneSignal", "checkSelfPermission failed, returning PERMISSION_DENIED");
            return -1;
        }
    }

    public static void h(f4 f4Var, String str, int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("android_notification_id", Integer.valueOf(i10));
        contentValues.put("group_id", str);
        contentValues.put("is_summary", (Integer) 1);
        f4Var.f(contentValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0112 A[EDGE_INSN: B:114:0x0112->B:33:0x0112 BREAK  A[LOOP:0: B:15:0x008a->B:40:0x0123], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123 A[LOOP:0: B:15:0x008a->B:40:0x0123, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(n2 n2Var, w wVar) throws Throwable {
        Cursor cursorH;
        Cursor cursor;
        String str;
        PendingIntent pendingIntent;
        JSONObject jSONObject;
        ArrayList<SpannableString> arrayList;
        Integer numValueOf;
        Notification notificationA;
        String str2;
        String str3;
        String str4;
        String string;
        String str5 = "message";
        String str6 = "title";
        String str7 = "is_summary";
        boolean z7 = n2Var.f12014d;
        JSONObject jSONObject2 = n2Var.f12013c;
        p1 p1Var = new p1(f12075c);
        String strOptString = jSONObject2.optString("grp", null);
        SecureRandom secureRandom = new SecureRandom();
        PendingIntent broadcast = PendingIntent.getBroadcast(f12075c, secureRandom.nextInt(), v(0).putExtra("summary", strOptString), 201326592);
        f4 f4VarB = f4.b(f12075c);
        try {
            String[] strArr = {"android_notification_id", "full_data", "is_summary", "title", "message"};
            String[] strArr2 = {strOptString};
            if (z7) {
                str = "group_id = ? AND dismissed = 0 AND opened = 0";
            } else {
                try {
                    str = "group_id = ? AND dismissed = 0 AND opened = 0 AND android_notification_id <> " + n2Var.a();
                } catch (Throwable th) {
                    th = th;
                    cursor = null;
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            cursorH = f4VarB.h("notification", strArr, str, strArr2, "_id DESC");
        } catch (Throwable th2) {
            th = th2;
            cursorH = null;
        }
        try {
            if (cursorH.moveToFirst()) {
                arrayList = new ArrayList();
                pendingIntent = broadcast;
                String str8 = null;
                numValueOf = null;
                while (true) {
                    String str9 = str7;
                    if (cursorH.getInt(cursorH.getColumnIndex(str7)) == 1) {
                        str3 = str5;
                        numValueOf = Integer.valueOf(cursorH.getInt(cursorH.getColumnIndex("android_notification_id")));
                        str4 = str6;
                    } else {
                        String string2 = cursorH.getString(cursorH.getColumnIndex(str6));
                        String str10 = string2 == null ? "" : string2 + " ";
                        str3 = str5;
                        str4 = str6;
                        SpannableString spannableString = new SpannableString(str10 + cursorH.getString(cursorH.getColumnIndex(str5)));
                        if (str10.length() > 0) {
                            spannableString.setSpan(new StyleSpan(1), 0, str10.length(), 0);
                        }
                        arrayList.add(spannableString);
                        if (str8 == null) {
                            string = cursorH.getString(cursorH.getColumnIndex("full_data"));
                        }
                        if (cursorH.moveToNext()) {
                            break;
                        }
                        str8 = string;
                        str7 = str9;
                        str5 = str3;
                        str6 = str4;
                    }
                    string = str8;
                    if (cursorH.moveToNext()) {
                    }
                }
                if (!z7 || string == null) {
                    jSONObject = jSONObject2;
                } else {
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
            } else {
                pendingIntent = broadcast;
                jSONObject = jSONObject2;
                arrayList = null;
                numValueOf = null;
            }
            if (!cursorH.isClosed()) {
                cursorH.close();
            }
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(secureRandom.nextInt());
                h(f4VarB, strOptString, numValueOf.intValue());
            }
            PendingIntent pendingIntentE = p1Var.e(p1Var.f(numValueOf.intValue()).putExtra("onesignalData", jSONObject.toString()).putExtra("summary", strOptString), secureRandom.nextInt());
            if (arrayList == null || ((!z7 || arrayList.size() <= 1) && (z7 || arrayList.size() <= 0))) {
                e0.w wVar2 = (e0.w) wVar.f12211e;
                wVar2.f12432b.clear();
                c(numValueOf.intValue(), wVar2, p1Var, strOptString, jSONObject);
                wVar2.f12437g = pendingIntentE;
                wVar2.f12452v.deleteIntent = pendingIntent;
                wVar2.d(8, z7);
                wVar2.d(16, false);
                wVar2.f12443m = strOptString;
                wVar2.f12444n = true;
                try {
                    wVar2.f12450t = f12077e.intValue();
                } catch (Throwable unused) {
                }
                notificationA = wVar2.a();
                d(wVar, notificationA);
            } else {
                int size = arrayList.size() + (!z7 ? 1 : 0);
                String strOptString2 = jSONObject.optString("grp_msg", null);
                String strReplace = strOptString2 == null ? size + " new messages" : strOptString2.replace("$[notif_count]", "" + size);
                e0.w wVar3 = (e0.w) n(n2Var).f12211e;
                if (z7) {
                    wVar3.d(8, true);
                    wVar3.c(0);
                    str2 = null;
                    wVar3.f(null);
                    Notification notification = wVar3.f12452v;
                    notification.vibrate = null;
                    notification.tickerText = e0.w.b(null);
                } else {
                    str2 = null;
                }
                wVar3.f12437g = pendingIntentE;
                wVar3.f12452v.deleteIntent = pendingIntent;
                wVar3.f12435e = e0.w.b(m());
                wVar3.f12436f = e0.w.b(strReplace);
                wVar3.f12439i = size;
                wVar3.f12452v.icon = r();
                wVar3.e(Q(p("ic_onesignal_large_icon_default")));
                wVar3.d(8, z7);
                wVar3.d(16, false);
                wVar3.f12443m = strOptString;
                wVar3.f12444n = true;
                try {
                    wVar3.f12450t = f12077e.intValue();
                } catch (Throwable unused2) {
                }
                if (!z7) {
                    wVar3.f12452v.tickerText = e0.w.b(strReplace);
                }
                e0.u uVar = new e0.u(1);
                if (!z7) {
                    String str11 = n2Var.f12011a.f11818g;
                    String string3 = str11 != null ? str11.toString() : str2;
                    String strConcat = string3 != null ? string3.concat(" ") : "";
                    SpannableString spannableString2 = new SpannableString(a0.h.F(strConcat, n2Var.f12011a.f11819h.toString()));
                    if (strConcat.length() > 0) {
                        spannableString2.setSpan(new StyleSpan(1), 0, strConcat.length(), 0);
                    }
                    ((ArrayList) uVar.f12430f).add(e0.w.b(spannableString2));
                }
                for (SpannableString spannableString3 : arrayList) {
                    if (spannableString3 != null) {
                        ((ArrayList) uVar.f12430f).add(e0.w.b(spannableString3));
                    }
                }
                uVar.f12455b = e0.w.b(strReplace);
                wVar3.g(uVar);
                notificationA = wVar3.a();
            }
            new e0.n0(f12075c).b(numValueOf.intValue(), notificationA);
        } catch (Throwable th3) {
            th = th3;
            cursor = cursorH;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static JSONObject j(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, HashSet hashSet) throws JSONException {
        JSONObject jSONObject4;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject2 == null) {
            return jSONObject3;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        JSONObject jSONObject5 = jSONObject3 != null ? jSONObject3 : new JSONObject();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.has(next)) {
                    if (obj instanceof JSONObject) {
                        String string = j(jSONObject.getJSONObject(next), (JSONObject) obj, (jSONObject3 == null || !jSONObject3.has(next)) ? null : jSONObject3.getJSONObject(next), hashSet).toString();
                        if (!string.equals("{}")) {
                            jSONObject4 = new JSONObject(string);
                            jSONObject5.put(next, jSONObject4);
                        }
                    } else if (obj instanceof JSONArray) {
                        A(next, (JSONArray) obj, jSONObject.getJSONArray(next), jSONObject5);
                    } else {
                        if (hashSet == null || !hashSet.contains(next)) {
                            Object obj2 = jSONObject.get(next);
                            if (obj.equals(obj2) || ((obj2 instanceof Number) && (obj instanceof Number) && ((Number) obj2).doubleValue() == ((Number) obj).doubleValue())) {
                            }
                        }
                        jSONObject5.put(next, obj);
                    }
                } else if (obj instanceof JSONObject) {
                    jSONObject4 = new JSONObject(obj.toString());
                    jSONObject5.put(next, jSONObject4);
                } else if (obj instanceof JSONArray) {
                    A(next, (JSONArray) obj, null, jSONObject5);
                } else {
                    jSONObject5.put(next, obj);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONObject5;
    }

    public static BigInteger k(JSONObject jSONObject) {
        try {
            if (jSONObject.has("bgac")) {
                return new BigInteger(jSONObject.optString("bgac", null), 16);
            }
        } catch (Throwable unused) {
        }
        try {
            String strE = OSUtils.e(z3.f12248b, "onesignal_notification_accent_color", null);
            if (strE != null) {
                return new BigInteger(strE, 16);
            }
        } catch (Throwable unused2) {
        }
        try {
            ApplicationInfo applicationInfoH = l.h(z3.f12248b);
            Bundle bundle = applicationInfoH == null ? null : applicationInfoH.metaData;
            String string = bundle != null ? bundle.getString("com.onesignal.NotificationAccentColor.DEFAULT") : null;
            if (string != null) {
                return new BigInteger(string, 16);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    public static StatusBarNotification[] l(Context context) {
        StatusBarNotification[] statusBarNotificationArr = new StatusBarNotification[0];
        try {
            return a6.c.A((NotificationManager) context.getSystemService("notification"));
        } catch (Throwable unused) {
            return statusBarNotificationArr;
        }
    }

    public static CharSequence m() {
        ApplicationInfo applicationInfoH = l.h(f12075c);
        return applicationInfoH == null ? "" : f12075c.getPackageManager().getApplicationLabel(applicationInfoH);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static w n(n2 n2Var) {
        e0.w wVar;
        String strOptString;
        Uri uriF;
        JSONObject jSONObject = n2Var.f12013c;
        w wVar2 = new w();
        try {
            wVar = new e0.w(f12075c, w0.b(n2Var));
        } catch (Throwable unused) {
            wVar = new e0.w(f12075c, null);
        }
        String strOptString2 = jSONObject.optString("alert", null);
        wVar.d(16, true);
        int iY = y(jSONObject.optString("sicon", null));
        if (iY == 0) {
            iY = r();
        }
        wVar.f12452v.icon = iY;
        int i10 = 0;
        e0.u uVar = new e0.u(0);
        uVar.f12430f = e0.w.b(strOptString2);
        wVar.g(uVar);
        wVar.f12436f = e0.w.b(strOptString2);
        wVar.f12452v.tickerText = e0.w.b(strOptString2);
        if (Build.VERSION.SDK_INT < 24 || !jSONObject.optString("title").equals("")) {
            CharSequence charSequenceOptString = jSONObject.optString("title", null);
            if (charSequenceOptString == null) {
                charSequenceOptString = m();
            }
            wVar.f12435e = e0.w.b(charSequenceOptString);
        }
        try {
            BigInteger bigIntegerK = k(jSONObject);
            if (bigIntegerK != null) {
                wVar.f12447q = bigIntegerK.intValue();
            }
        } catch (Throwable unused2) {
        }
        try {
            wVar.f12448r = jSONObject.has("vis") ? Integer.parseInt(jSONObject.optString("vis")) : 1;
        } catch (Throwable unused3) {
        }
        Bitmap bitmapO = o(jSONObject.optString("licon"));
        if (bitmapO == null) {
            bitmapO = p("ic_onesignal_large_icon_default");
        }
        Bitmap bitmapQ = bitmapO == null ? null : Q(bitmapO);
        if (bitmapQ != null) {
            wVar2.f12210b = true;
            wVar.e(bitmapQ);
        }
        Bitmap bitmapO2 = o(jSONObject.optString("bicon", null));
        if (bitmapO2 != null) {
            e0.t tVar = new e0.t();
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f807b = bitmapO2;
            tVar.f12424e = iconCompat;
            tVar.f12456c = e0.w.b(strOptString2);
            tVar.f12457d = true;
            wVar.g(tVar);
        }
        Long l10 = n2Var.f12016f;
        if (l10 != null) {
            try {
                wVar.f12452v.when = l10.longValue() * 1000;
            } catch (Throwable unused4) {
            }
        }
        int iOptInt = jSONObject.optInt("pri", 6);
        int i11 = iOptInt <= 9 ? iOptInt > 7 ? 1 : iOptInt > 4 ? 0 : iOptInt > 2 ? -1 : -2 : 2;
        wVar.f12440j = i11;
        if (i11 >= 0) {
            if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
                try {
                    int iIntValue = new BigInteger(jSONObject.optString("ledc"), 16).intValue();
                    Notification notification = wVar.f12452v;
                    notification.ledARGB = iIntValue;
                    notification.ledOnMS = 2000;
                    notification.ledOffMS = 5000;
                    notification.flags = (notification.flags & (-2)) | 1;
                } catch (Throwable unused5) {
                }
                if (jSONObject.optInt("vib", 1) == 1) {
                }
                strOptString = jSONObject.optString("sound", null);
                if (!"null".equals(strOptString)) {
                    uriF = OSUtils.f(f12075c, jSONObject.optString("sound", null));
                    if (uriF == null) {
                    }
                }
                wVar.c(i10);
            } else {
                i10 = 4;
                if (jSONObject.optInt("vib", 1) == 1) {
                    if (jSONObject.has("vib_pt")) {
                        long[] jArrT = OSUtils.t(jSONObject);
                        if (jArrT != null) {
                            wVar.f12452v.vibrate = jArrT;
                        }
                    } else {
                        i10 |= 2;
                    }
                }
                strOptString = jSONObject.optString("sound", null);
                if (!"null".equals(strOptString) && !"nil".equals(strOptString)) {
                    uriF = OSUtils.f(f12075c, jSONObject.optString("sound", null));
                    if (uriF == null) {
                        wVar.f(uriF);
                    } else {
                        i10 |= 1;
                    }
                }
                wVar.c(i10);
            }
        }
        wVar2.f12211e = wVar;
        return wVar2;
    }

    public static Bitmap o(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
            return p(str);
        }
        try {
            return BitmapFactory.decodeStream(new URL(strTrim).openConnection().getInputStream());
        } catch (Throwable th) {
            z3.b(y3.f12231j, "Could not download image!", th);
            return null;
        }
    }

    public static Bitmap p(String str) {
        Bitmap bitmapDecodeStream;
        try {
            bitmapDecodeStream = BitmapFactory.decodeStream(f12075c.getAssets().open(str));
        } catch (Throwable unused) {
            bitmapDecodeStream = null;
        }
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        try {
            for (String str2 : Arrays.asList(".png", ".webp", ".jpg", ".gif", ".bmp")) {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(f12075c.getAssets().open(str + str2));
                } catch (Throwable unused2) {
                }
                if (bitmapDecodeStream != null) {
                    return bitmapDecodeStream;
                }
            }
            int iY = y(str);
            if (iY != 0) {
                return BitmapFactory.decodeResource(f12074b, iY);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    public static JSONObject q(JSONObject jSONObject) {
        return new JSONObject(jSONObject.optString(SchedulerSupport.CUSTOM));
    }

    public static int r() {
        int identifier = f12074b.getIdentifier("ic_stat_onesignal_default", "drawable", f12076d);
        if (identifier != 0) {
            return identifier;
        }
        int identifier2 = f12074b.getIdentifier("corona_statusbar_icon_default", "drawable", f12076d);
        if (identifier2 != 0) {
            return identifier2;
        }
        int identifier3 = f12074b.getIdentifier("ic_os_notification_fallback_white_24dp", "drawable", f12076d);
        return identifier3 != 0 ? identifier3 : R.drawable.ic_popup_reminder;
    }

    public static final synchronized a2.m s(Context context) {
        a2.m mVarS;
        Intrinsics.f(context, "context");
        try {
            mVarS = a2.m.s(context);
        } catch (IllegalStateException e10) {
            z3.b(y3.f12230f, "OSWorkManagerHelper.getInstance failed, attempting to initialize: ", e10);
            try {
                context.getApplicationContext();
                a2.m.t(context, new z1.b(new g8.e()));
            } catch (IllegalStateException e11) {
                z3.b(y3.f12230f, "OSWorkManagerHelper initializing WorkManager failed: ", e11);
            }
            mVarS = a2.m.s(context);
        }
        return mVarS;
    }

    public static Location t(GoogleApiClient googleApiClient) {
        synchronized (o0.f12033d) {
            try {
                if (!googleApiClient.g()) {
                    return null;
                }
                r5.e.f16546b.getClass();
                return w2.k.g(googleApiClient);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Integer u(f4 f4Var, String str, boolean z7) {
        Cursor cursorJ = f4Var.j("notification", null, (z7 ? "group_id IS NULL" : "group_id = ?").concat(" AND dismissed = 0 AND opened = 0 AND is_summary = 0"), z7 ? null : new String[]{str}, "created_time DESC", "1");
        if (!cursorJ.moveToFirst()) {
            cursorJ.close();
            return null;
        }
        Integer numValueOf = Integer.valueOf(cursorJ.getInt(cursorJ.getColumnIndex("android_notification_id")));
        cursorJ.close();
        return numValueOf;
    }

    public static Intent v(int i10) {
        return new Intent(f12075c, (Class<?>) NotificationDismissReceiver.class).putExtra("androidNotificationId", i10).putExtra("dismissed", true);
    }

    public static String w(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return x(jSONObject.optString(SchedulerSupport.CUSTOM, null));
    }

    public static String x(String str) {
        JSONObject jSONObject;
        y3 y3Var = y3.f12233n;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            z3.b(y3Var, "Not a OneSignal formatted JSON String, error parsing string as JSON.", null);
        }
        if (jSONObject.has("i")) {
            return jSONObject.optString("i", null);
        }
        z3.b(y3Var, "Not a OneSignal formatted JSON string. No 'i' field in custom.", null);
        return null;
    }

    public static int y(String str) {
        String strTrim;
        if (str != null && (strTrim = str.trim()) != null && !strTrim.matches("^[0-9]")) {
            int identifier = f12074b.getIdentifier(strTrim, "drawable", f12076d);
            if (identifier != 0) {
                return identifier;
            }
            try {
                return R.drawable.class.getField(str).getInt(null);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static Integer z(f4 f4Var, String str) {
        Integer num;
        Cursor cursor = null;
        try {
            Cursor cursorH = f4Var.h("notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1", new String[]{str}, null);
            try {
                if (!cursorH.moveToFirst()) {
                    cursorH.close();
                    if (!cursorH.isClosed()) {
                        cursorH.close();
                    }
                    return null;
                }
                Integer numValueOf = Integer.valueOf(cursorH.getInt(cursorH.getColumnIndex("android_notification_id")));
                cursorH.close();
                if (cursorH.isClosed()) {
                    return numValueOf;
                }
                cursorH.close();
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                cursor = cursorH;
                num = null;
                try {
                    z3.b(y3.f12230f, "Error getting android notification id for summary notification group: ".concat(str), th);
                    return num;
                } finally {
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            num = null;
        }
    }

    public void J(int i10, String str, Throwable th) {
    }

    public void K(String str) {
    }
}