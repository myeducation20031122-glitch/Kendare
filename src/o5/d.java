package o5;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.le;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.measurement.l9;
import com.onesignal.f4;
import com.onesignal.h4;
import g.v0;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t5.j4;
import t7.k0;
import t7.l0;
import t7.q1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements d0, b0, d7.c, x5.j, s7.g, t9.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15720b;

    /* renamed from: e, reason: collision with root package name */
    public Object f15721e;

    /* renamed from: f, reason: collision with root package name */
    public Object f15722f;

    /* renamed from: j, reason: collision with root package name */
    public Object f15723j;

    public d(int i10) {
        this.f15720b = i10;
        if (i10 != 5) {
            return;
        }
        this.f15721e = new com.google.android.gms.internal.measurement.b("", 0L, null);
        this.f15722f = new com.google.android.gms.internal.measurement.b("", 0L, null);
        this.f15723j = new ArrayList();
    }

    public static void e(ArrayList arrayList, JSONArray jSONArray, x9.b bVar) throws JSONException {
        int length;
        if (jSONArray == null || (length = jSONArray.length()) <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            try {
                String influenceId = jSONArray.getString(i10);
                Intrinsics.e(influenceId, "influenceId");
                arrayList.add(new aa.a(influenceId, bVar));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            if (i11 >= length) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    public static void f(d dVar, x7.d dVar2) {
        g(dVar, "X-CRASHLYTICS-GOOGLE-APP-ID", dVar2.f19101a);
        g(dVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        g(dVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.2.12");
        g(dVar, "Accept", "application/json");
        g(dVar, "X-CRASHLYTICS-DEVICE-MODEL", dVar2.f19102b);
        g(dVar, "X-CRASHLYTICS-OS-BUILD-VERSION", dVar2.f19103c);
        g(dVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", dVar2.f19104d);
        g(dVar, "X-CRASHLYTICS-INSTALLATION-ID", ((r7.r) dVar2.f19105e).c());
    }

    public static void g(d dVar, String str, String str2) {
        if (str2 != null) {
            ((Map) dVar.f15723j).put(str, str2);
        }
    }

    public static String k(String str, Map map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? (String) entry.getValue() : "");
        String string = sb2.toString();
        while (true) {
            sb.append(string);
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            StringBuilder sb3 = new StringBuilder("&");
            sb3.append((String) entry2.getKey());
            sb3.append("=");
            sb3.append(entry2.getValue() != null ? (String) entry2.getValue() : "");
            string = sb3.toString();
        }
        String string2 = sb.toString();
        if (string2.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return a0.h.G(str, "?", string2);
        }
        if (!str.endsWith("&")) {
            string2 = "&".concat(string2);
        }
        return a0.h.F(str, string2);
    }

    public static void n(x9.c cVar, l9 l9Var, l9 l9Var2, String str, aa.c cVar2) {
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            l9Var.f10882f = new JSONArray(str);
            if (cVar2 == null) {
                return;
            }
            cVar2.f469a = l9Var;
            return;
        }
        if (iOrdinal != 1) {
            return;
        }
        l9Var2.f10882f = new JSONArray(str);
        if (cVar2 == null) {
            return;
        }
        cVar2.f470b = l9Var2;
    }

    public static aa.c o(x9.c cVar, l9 l9Var, l9 l9Var2, String str) {
        aa.c cVar2;
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            l9Var.f10881e = new JSONArray(str);
            cVar2 = new aa.c(l9Var, null);
        } else {
            if (iOrdinal != 1) {
                return null;
            }
            l9Var2.f10881e = new JSONArray(str);
            cVar2 = new aa.c(null, l9Var2);
        }
        return cVar2;
    }

    public static HashMap p(x7.d dVar) {
        HashMap map = new HashMap();
        map.put("build_version", dVar.f19108h);
        map.put("display_version", dVar.f19107g);
        map.put("source", Integer.toString(dVar.f19109i));
        String str = dVar.f19106f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // s7.g
    public final void a(s7.f fVar, int i10) throws IOException {
        try {
            fVar.read((byte[]) this.f15721e, ((int[]) this.f15722f)[0], i10);
            int[] iArr = (int[]) this.f15722f;
            iArr[0] = iArr[0] + i10;
        } finally {
            fVar.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // o5.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(String str, JSONObject jSONObject) {
        char c10;
        String str2;
        float fFloatValue;
        int iHashCode = str.hashCode();
        if (iHashCode != 94746189) {
            c10 = (iHashCode == 113399775 && str.equals("write")) ? (char) 0 : (char) 65535;
        } else if (str.equals("clear")) {
            c10 = 1;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                return false;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("keys");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                String strValueOf = String.valueOf(jSONObject.toString());
                Log.d("UserMessagingPlatform", strValueOf.length() != 0 ? "Action[clear]: wrong args.".concat(strValueOf) : new String("Action[clear]: wrong args."));
            } else {
                HashSet hashSet = new HashSet();
                int length = jSONArrayOptJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (TextUtils.isEmpty(strOptString)) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("Action[clear]: empty key at index: ");
                        sb.append(i10);
                        Log.d("UserMessagingPlatform", sb.toString());
                    } else {
                        hashSet.add(strOptString);
                    }
                }
                Application application = (Application) this.f15721e;
                HashMap map = new HashMap();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    le leVarE = dq0.E(application, str3);
                    if (leVarE == null) {
                        String strValueOf2 = String.valueOf(str3);
                        Log.d("UserMessagingPlatform", strValueOf2.length() != 0 ? "clearKeys: unable to process key: ".concat(strValueOf2) : new String("clearKeys: unable to process key: "));
                    } else {
                        String str4 = leVarE.f6293b;
                        if (!map.containsKey(str4)) {
                            map.put(str4, application.getSharedPreferences(str4, 0).edit());
                        }
                        ((SharedPreferences.Editor) map.get(str4)).remove(leVarE.f6294e);
                    }
                }
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    ((SharedPreferences.Editor) it2.next()).apply();
                }
            }
            return true;
        }
        Application application2 = (Application) this.f15721e;
        HashMap map2 = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            String strValueOf3 = String.valueOf(objOpt);
            Log.d("UserMessagingPlatform", kc.r.h(new StringBuilder(String.valueOf(next).length() + 23 + strValueOf3.length()), "Writing to storage: [", next, "] ", strValueOf3));
            le leVarE2 = dq0.E(application2, next);
            if (leVarE2 != null) {
                String str5 = leVarE2.f6293b;
                if (!map2.containsKey(str5)) {
                    map2.put(str5, application2.getSharedPreferences(str5, 0).edit());
                }
                SharedPreferences.Editor editor = (SharedPreferences.Editor) map2.get(str5);
                if (objOpt instanceof Integer) {
                    editor.putInt(leVarE2.f6294e, ((Integer) objOpt).intValue());
                } else if (objOpt instanceof Long) {
                    editor.putLong(leVarE2.f6294e, ((Long) objOpt).longValue());
                } else {
                    if (objOpt instanceof Double) {
                        str2 = leVarE2.f6294e;
                        fFloatValue = ((Double) objOpt).floatValue();
                    } else if (objOpt instanceof Float) {
                        str2 = leVarE2.f6294e;
                        fFloatValue = ((Float) objOpt).floatValue();
                    } else if (objOpt instanceof Boolean) {
                        editor.putBoolean(leVarE2.f6294e, ((Boolean) objOpt).booleanValue());
                    } else if (objOpt instanceof String) {
                        editor.putString(leVarE2.f6294e, (String) objOpt);
                    }
                    editor.putFloat(str2, fFloatValue);
                }
                ((f) this.f15722f).f15729c.add(next);
            }
            String strValueOf4 = String.valueOf(next);
            Log.d("UserMessagingPlatform", strValueOf4.length() != 0 ? "Failed writing key: ".concat(strValueOf4) : new String("Failed writing key: "));
        }
        f fVar = (f) this.f15722f;
        fVar.f15728b.edit().putStringSet("written_values", fVar.f15729c).apply();
        Iterator it3 = map2.values().iterator();
        while (it3.hasNext()) {
            ((SharedPreferences.Editor) it3.next()).apply();
        }
        return true;
    }

    @Override // t9.f
    public final void c() {
        Object obj = this.f15723j;
        ((t9.g) obj).x("subs", ((t9.g) obj).f18073j, (t9.f) this.f15721e);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        switch (this.f15720b) {
            case y4.g.INVALID_ACCOUNT /* 5 */:
                d dVar = new d(((com.google.android.gms.internal.measurement.b) this.f15721e).clone());
                Iterator it = ((List) this.f15723j).iterator();
                while (it.hasNext()) {
                    ((List) dVar.f15723j).add(((com.google.android.gms.internal.measurement.b) it.next()).clone());
                }
                return dVar;
            default:
                return super.clone();
        }
    }

    @Override // t9.f
    public final void d() {
        Object obj = this.f15723j;
        ((t9.g) obj).x("subs", ((t9.g) obj).f18073j, (t9.f) this.f15722f);
    }

    public final l8.b h() {
        String str = ((Long) this.f15722f) == null ? " tokenExpirationTimestamp" : "";
        if (str.isEmpty()) {
            return new l8.b((String) this.f15721e, ((Long) this.f15722f).longValue(), (l8.f) this.f15723j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final k0 i() {
        String strF = ((String) this.f15721e) == null ? " name" : "";
        if (((String) this.f15722f) == null) {
            strF = strF.concat(" code");
        }
        if (((Long) this.f15723j) == null) {
            strF = a0.h.F(strF, " address");
        }
        if (strF.isEmpty()) {
            return new k0((String) this.f15721e, (String) this.f15722f, ((Long) this.f15723j).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strF));
    }

    public final l0 j() {
        String strF = ((String) this.f15721e) == null ? " name" : "";
        if (((Integer) this.f15722f) == null) {
            strF = strF.concat(" importance");
        }
        if (((q1) this.f15723j) == null) {
            strF = a0.h.F(strF, " frames");
        }
        if (strF.isEmpty()) {
            return new l0((String) this.f15721e, ((Integer) this.f15722f).intValue(), (q1) this.f15723j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strF));
    }

    public final void l(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map map = (Map) this.f15721e;
        e8.f fVar = new e8.f(byteArrayOutputStream, map, (Map) this.f15722f, (b8.d) this.f15723j);
        if (obj == null) {
            return;
        }
        b8.d dVar = (b8.d) map.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new b8.b("No encoder for " + obj.getClass());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m2.e m() throws Throwable {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        String strK;
        String str;
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            try {
                strK = k((String) this.f15721e, (Map) this.f15722f);
                str = "GET Request URL: " + strK;
            } catch (Throwable th2) {
                th = th2;
                httpsURLConnection = null;
                if (inputStream != null) {
                }
                if (httpsURLConnection != null) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(strK).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((Map) this.f15723j).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int i10 = bufferedReader.read(cArr);
                            if (i10 == -1) {
                                break;
                            }
                            sb.append(cArr, 0, i10);
                        }
                        string = sb.toString();
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new m2.e(responseCode, 3, string);
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            th = th;
            httpsURLConnection = null;
            if (inputStream != null) {
            }
            if (httpsURLConnection != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q() throws JSONException, PackageManager.NameNotFoundException {
        n8.m mVar;
        Bundle bundle;
        String str;
        String string;
        int i10;
        int identifier;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        Integer numValueOf;
        Long lValueOf;
        long[] jArr;
        int[] iArr;
        String str2;
        String strK;
        IconCompat iconCompat;
        boolean z7;
        ApplicationInfo applicationInfo;
        if (((p5.m) this.f15723j).e("gcm.n.noui")) {
            return true;
        }
        if (!((KeyguardManager) ((Context) this.f15722f).getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) ((Context) this.f15722f).getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == iMyPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String strK2 = ((p5.m) this.f15723j).k("gcm.n.image");
        if (TextUtils.isEmpty(strK2)) {
            mVar = null;
        } else {
            try {
                mVar = new n8.m(new URL(strK2));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strK2);
            }
        }
        if (mVar != null) {
            ExecutorService executorService = (ExecutorService) this.f15721e;
            x5.l lVar = new x5.l();
            mVar.f15425e = executorService.submit(new g.u(11, mVar, lVar));
            mVar.f15426f = lVar.f19011a;
        }
        Context context = (Context) this.f15722f;
        p5.m mVar2 = (p5.m) this.f15723j;
        AtomicInteger atomicInteger = n8.e.f15404a;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        if (applicationInfo != null) {
            bundle = applicationInfo.metaData;
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
        }
        Bundle bundle2 = bundle;
        String strK3 = mVar2.k("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT < 26) {
            strK3 = null;
        } else {
            try {
                if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strK3)) {
                        strK3 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (TextUtils.isEmpty(strK3)) {
                            str = notificationManager.getNotificationChannel(strK3) == null ? "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used." : "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
                        }
                        Log.w("FirebaseMessaging", str);
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            int identifier2 = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                            if (identifier2 == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = context.getString(identifier2);
                            }
                            notificationManager.createNotificationChannel(l4.j0.f(string));
                        }
                        strK3 = "fcm_fallback_notification_channel";
                    } else if (notificationManager.getNotificationChannel(strK3) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + strK3 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        strK3 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (TextUtils.isEmpty(strK3)) {
                        }
                        Log.w("FirebaseMessaging", str);
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        }
                        strK3 = "fcm_fallback_notification_channel";
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        PackageManager packageManager = context.getPackageManager();
        e0.w wVar = new e0.w(context, strK3);
        String strJ = mVar2.j(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strJ)) {
            wVar.f12435e = e0.w.b(strJ);
        }
        String strJ2 = mVar2.j(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strJ2)) {
            wVar.f12436f = e0.w.b(strJ2);
            e0.u uVar = new e0.u(0);
            uVar.f12430f = e0.w.b(strJ2);
            wVar.g(uVar);
        }
        String strK4 = mVar2.k("gcm.n.icon");
        if (TextUtils.isEmpty(strK4)) {
            i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i10 != 0 || !n8.e.a(resources, i10)) {
                try {
                    i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                } catch (PackageManager.NameNotFoundException e11) {
                    Log.w("FirebaseMessaging", "Couldn't get own application info: " + e11);
                }
            }
            identifier = (i10 == 0 && n8.e.a(resources, i10)) ? i10 : R.drawable.sym_def_app_icon;
        } else {
            identifier = resources.getIdentifier(strK4, "drawable", packageName);
            if ((identifier == 0 || !n8.e.a(resources, identifier)) && ((identifier = resources.getIdentifier(strK4, "mipmap", packageName)) == 0 || !n8.e.a(resources, identifier))) {
                Log.w("FirebaseMessaging", "Icon resource " + strK4 + " not found. Notification will use default icon.");
                i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i10 != 0) {
                    i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i10 == 0) {
                    }
                }
            }
        }
        wVar.f12452v.icon = identifier;
        String strK5 = mVar2.k("gcm.n.sound2");
        if (TextUtils.isEmpty(strK5)) {
            strK5 = mVar2.k("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strK5)) {
            defaultUri = null;
        } else if ("default".equals(strK5) || resources.getIdentifier(strK5, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strK5);
        }
        if (defaultUri != null) {
            wVar.f(defaultUri);
        }
        String strK6 = mVar2.k("gcm.n.click_action");
        if (TextUtils.isEmpty(strK6)) {
            String strK7 = mVar2.k("gcm.n.link_android");
            if (TextUtils.isEmpty(strK7)) {
                strK7 = mVar2.k("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strK7) ? Uri.parse(strK7) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            launchIntentForPackage = new Intent(strK6);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        AtomicInteger atomicInteger2 = n8.e.f15404a;
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = new Bundle((Bundle) mVar2.f15961e);
            for (String str3 : ((Bundle) mVar2.f15961e).keySet()) {
                if (str3.startsWith("google.c.") || str3.startsWith("gcm.n.") || str3.startsWith("gcm.notification.")) {
                    bundle3.remove(str3);
                }
            }
            launchIntentForPackage.putExtras(bundle3);
            if (mVar2.e("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", mVar2.n());
            }
            activity = PendingIntent.getActivity(context, atomicInteger2.incrementAndGet(), launchIntentForPackage, Build.VERSION.SDK_INT >= 23 ? 1140850688 : 1073741824);
        }
        wVar.f12437g = activity;
        if (mVar2.e("google.c.a.e")) {
            broadcast = PendingIntent.getBroadcast(context, atomicInteger2.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(mVar2.n())), Build.VERSION.SDK_INT >= 23 ? 1140850688 : 1073741824);
        } else {
            broadcast = null;
        }
        if (broadcast != null) {
            wVar.f12452v.deleteIntent = broadcast;
        }
        String strK8 = mVar2.k("gcm.n.color");
        if (TextUtils.isEmpty(strK8)) {
            int i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i11 != 0) {
                try {
                    numValueOf = Integer.valueOf(f0.f.b(context, i11));
                } catch (Resources.NotFoundException unused3) {
                    Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                }
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strK8));
            } catch (IllegalArgumentException unused4) {
                Log.w("FirebaseMessaging", "Color is invalid: " + strK8 + ". Notification will use default color.");
            }
        }
        if (numValueOf != null) {
            wVar.f12447q = numValueOf.intValue();
        }
        wVar.d(16, !mVar2.e("gcm.n.sticky"));
        wVar.f12445o = mVar2.e("gcm.n.local_only");
        String strK9 = mVar2.k("gcm.n.ticker");
        if (strK9 != null) {
            wVar.f12452v.tickerText = e0.w.b(strK9);
        }
        Integer numG = mVar2.g("gcm.n.notification_priority");
        if (numG == null) {
            numG = null;
        } else if (numG.intValue() < -2 || numG.intValue() > 2) {
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numG + ". Skipping setting notificationPriority.");
            numG = null;
        }
        if (numG != null) {
            wVar.f12440j = numG.intValue();
        }
        Integer numG2 = mVar2.g("gcm.n.visibility");
        if (numG2 == null) {
            numG2 = null;
        } else if (numG2.intValue() < -1 || numG2.intValue() > 1) {
            Log.w("NotificationParams", "visibility is invalid: " + numG2 + ". Skipping setting visibility.");
            numG2 = null;
        }
        if (numG2 != null) {
            wVar.f12448r = numG2.intValue();
        }
        Integer numG3 = mVar2.g("gcm.n.notification_count");
        if (numG3 == null) {
            numG3 = null;
        } else if (numG3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numG3 + ". Skipping setting notificationCount.");
            numG3 = null;
        }
        if (numG3 != null) {
            wVar.f12439i = numG3.intValue();
        }
        String strK10 = mVar2.k("gcm.n.event_time");
        if (TextUtils.isEmpty(strK10)) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(strK10));
            } catch (NumberFormatException unused5) {
                Log.w("NotificationParams", "Couldn't parse value of " + p5.m.o("gcm.n.event_time") + "(" + strK10 + ") into a long");
            }
        }
        if (lValueOf != null) {
            wVar.f12441k = true;
            wVar.f12452v.when = lValueOf.longValue();
        }
        JSONArray jSONArrayH = mVar2.h("gcm.n.vibrate_timings");
        if (jSONArrayH == null) {
            jArr = null;
        } else {
            try {
                if (jSONArrayH.length() <= 1) {
                    throw new JSONException("vibrateTimings have invalid length");
                }
                int length = jSONArrayH.length();
                jArr = new long[length];
                for (int i12 = 0; i12 < length; i12++) {
                    jArr[i12] = jSONArrayH.optLong(i12);
                }
            } catch (NumberFormatException | JSONException unused6) {
                Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayH + ". Skipping setting vibrateTimings.");
            }
        }
        if (jArr != null) {
            wVar.f12452v.vibrate = jArr;
        }
        JSONArray jSONArrayH2 = mVar2.h("gcm.n.light_settings");
        if (jSONArrayH2 == null) {
            iArr = null;
        } else {
            iArr = new int[3];
            try {
                if (jSONArrayH2.length() != 3) {
                    throw new JSONException("lightSettings don't have all three fields");
                }
                int color = Color.parseColor(jSONArrayH2.optString(0));
                if (color == -16777216) {
                    throw new IllegalArgumentException("Transparent color is invalid");
                }
                iArr[0] = color;
                iArr[1] = jSONArrayH2.optInt(1);
                iArr[2] = jSONArrayH2.optInt(2);
            } catch (IllegalArgumentException e12) {
                str2 = "LightSettings is invalid: " + jSONArrayH2 + ". " + e12.getMessage() + ". Skipping setting LightSettings";
                Log.w("NotificationParams", str2);
                iArr = null;
                if (iArr != null) {
                }
                boolean zE = mVar2.e("gcm.n.default_sound");
                boolean z10 = zE;
                if (mVar2.e("gcm.n.default_vibrate_timings")) {
                }
                int i13 = z10;
                if (mVar2.e("gcm.n.default_light_settings")) {
                }
                wVar.c(i13);
                strK = mVar2.k("gcm.n.tag");
                if (TextUtils.isEmpty(strK)) {
                }
                String str4 = strK;
                if (mVar != null) {
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                }
                ((NotificationManager) ((Context) this.f15722f).getSystemService("notification")).notify(str4, 0, wVar.a());
                return true;
            } catch (JSONException unused7) {
                str2 = "LightSettings is invalid: " + jSONArrayH2 + ". Skipping setting LightSettings";
                Log.w("NotificationParams", str2);
                iArr = null;
                if (iArr != null) {
                }
                boolean zE2 = mVar2.e("gcm.n.default_sound");
                boolean z102 = zE2;
                if (mVar2.e("gcm.n.default_vibrate_timings")) {
                }
                int i132 = z102;
                if (mVar2.e("gcm.n.default_light_settings")) {
                }
                wVar.c(i132);
                strK = mVar2.k("gcm.n.tag");
                if (TextUtils.isEmpty(strK)) {
                }
                String str42 = strK;
                if (mVar != null) {
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                }
                ((NotificationManager) ((Context) this.f15722f).getSystemService("notification")).notify(str42, 0, wVar.a());
                return true;
            }
        }
        if (iArr != null) {
            int i14 = iArr[0];
            int i15 = iArr[1];
            int i16 = iArr[2];
            Notification notification = wVar.f12452v;
            notification.ledARGB = i14;
            notification.ledOnMS = i15;
            notification.ledOffMS = i16;
            notification.flags = ((i15 == 0 || i16 == 0) ? 0 : 1) | ((-2) & notification.flags);
        }
        boolean zE22 = mVar2.e("gcm.n.default_sound");
        boolean z1022 = zE22;
        if (mVar2.e("gcm.n.default_vibrate_timings")) {
            z1022 = (zE22 ? 1 : 0) | 2;
        }
        int i1322 = z1022;
        if (mVar2.e("gcm.n.default_light_settings")) {
            i1322 = (z1022 ? 1 : 0) | 4;
        }
        wVar.c(i1322);
        strK = mVar2.k("gcm.n.tag");
        if (TextUtils.isEmpty(strK)) {
            strK = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str422 = strK;
        if (mVar != null) {
            try {
                x5.s sVar = mVar.f15426f;
                fc.t.k(sVar);
                Bitmap bitmap = (Bitmap) j4.b(sVar, 5L, TimeUnit.SECONDS);
                wVar.e(bitmap);
                e0.t tVar = new e0.t();
                if (bitmap == null) {
                    iconCompat = null;
                    z7 = true;
                } else {
                    z7 = true;
                    iconCompat = new IconCompat(1);
                    iconCompat.f807b = bitmap;
                }
                tVar.f12424e = iconCompat;
                tVar.f12425f = null;
                tVar.f12426g = z7;
                wVar.g(tVar);
            } catch (InterruptedException unused8) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                mVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e13) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e13.getCause());
            } catch (TimeoutException unused9) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                mVar.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) ((Context) this.f15722f).getSystemService("notification")).notify(str422, 0, wVar.a());
        return true;
    }

    public final JSONObject r(m2.e eVar) {
        int i10 = eVar.f15097b;
        ((o7.c) this.f15723j).c("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            o7.c cVar = (o7.c) this.f15723j;
            StringBuilder sbY = a0.h.y("Settings request failed; (status: ", i10, ") from ");
            sbY.append((String) this.f15721e);
            String string = sbY.toString();
            if (!cVar.a(6)) {
                return null;
            }
            Log.e("FirebaseCrashlytics", string, null);
            return null;
        }
        String str = eVar.f15098c;
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            ((o7.c) this.f15723j).d("Failed to parse settings JSON from " + ((String) this.f15721e), e10);
            ((o7.c) this.f15723j).d("Settings response " + str, null);
            return null;
        }
    }

    public final boolean s() {
        Object obj = this.f15723j;
        com.onesignal.l lVar = (com.onesignal.l) obj;
        ((com.onesignal.l) obj).getClass();
        String str = h4.f11856a;
        ((com.onesignal.l) this.f15723j).getClass();
        lVar.getClass();
        return h4.b(str, "PREFS_OS_OUTCOMES_V2", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r5 t(Activity activity, g7.a aVar) throws PackageManager.NameNotFoundException, f0 {
        Bundle bundle;
        l1.q qVar;
        r rVar;
        List listEmptyList;
        List listEmptyList2;
        PackageInfo packageInfo;
        h0.f fVar = aVar.f13081c;
        if (fVar == null) {
            boolean z7 = u.r() || new ArrayList().contains(u.q(((Application) this.f15721e).getApplicationContext()));
            h0.f fVar2 = new h0.f();
            fVar2.f13149b = z7;
            fVar2.f13150e = 0;
            fVar = fVar2;
        }
        r5 r5Var = new r5(3);
        String string = aVar.f13080b;
        if (TextUtils.isEmpty(string)) {
            try {
                bundle = ((Application) this.f15721e).getPackageManager().getApplicationInfo(((Application) this.f15721e).getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(string)) {
                throw new f0(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        r5Var.f7937a = string;
        v0 v0Var = (v0) this.f15723j;
        v0Var.getClass();
        try {
            g4.a aVarA = g4.b.a((Application) v0Var.f12909e);
            qVar = new l1.q(aVarA.f13016a, aVarA.f13017b);
        } catch (IOException | x4.h e10) {
            Log.d("UserMessagingPlatform", "Failed to get ad id.", e10);
            qVar = null;
        }
        if (qVar != null) {
            r5Var.f7939c = qVar.f14513b;
            r5Var.f7938b = Boolean.valueOf(qVar.f14512a);
        }
        if (fVar.f13149b) {
            ArrayList arrayList = new ArrayList();
            int i10 = fVar.f13150e;
            if (i10 != 1) {
                if (i10 == 2) {
                    rVar = r.f15784e;
                }
                arrayList.add(r.f15785f);
                listEmptyList = arrayList;
            } else {
                rVar = r.f15783b;
            }
            arrayList.add(rVar);
            arrayList.add(r.f15785f);
            listEmptyList = arrayList;
        } else {
            listEmptyList = Collections.emptyList();
        }
        r5Var.f7945i = listEmptyList;
        r5Var.f7943g = ((f) this.f15722f).a();
        r5Var.f7942f = Boolean.valueOf(aVar.f13079a);
        int i11 = Build.VERSION.SDK_INT;
        r5Var.f7941e = Locale.getDefault().toLanguageTag();
        g0.d dVar = new g0.d(3);
        dVar.f12952f = Integer.valueOf(i11);
        dVar.f12951e = Build.MODEL;
        dVar.f12950b = 2;
        r5Var.f7940d = dVar;
        Configuration configuration = ((Application) this.f15721e).getResources().getConfiguration();
        ((Application) this.f15721e).getResources().getConfiguration();
        g2.h hVar = new g2.h(7);
        hVar.f13011b = Integer.valueOf(configuration.screenWidthDp);
        hVar.f13012e = Integer.valueOf(configuration.screenHeightDp);
        hVar.f13013f = Double.valueOf(((Application) this.f15721e).getResources().getDisplayMetrics().density);
        if (i11 >= 28) {
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                listEmptyList2 = Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        s sVar = new s();
                        sVar.f15788b = Integer.valueOf(rect.left);
                        sVar.f15789c = Integer.valueOf(rect.right);
                        sVar.f15787a = Integer.valueOf(rect.top);
                        sVar.f15790d = Integer.valueOf(rect.bottom);
                        arrayList2.add(sVar);
                    }
                }
                listEmptyList2 = arrayList2;
            }
        }
        hVar.f13014j = listEmptyList2;
        r5Var.f7944h = hVar;
        Object obj = this.f15721e;
        Application application = (Application) obj;
        try {
            packageInfo = ((Application) obj).getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        d dVar2 = new d(1);
        dVar2.f15721e = application.getPackageName();
        CharSequence applicationLabel = ((Application) this.f15721e).getPackageManager().getApplicationLabel(((Application) this.f15721e).getApplicationInfo());
        dVar2.f15722f = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            dVar2.f15723j = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        r5Var.f7946j = dVar2;
        m2.l lVar = new m2.l();
        lVar.f15113b = "2.0.0";
        r5Var.f7947k = lVar;
        return r5Var;
    }

    @Override // x5.j
    public final x5.k then(Object obj) {
        if (((x7.a) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return j4.i(null);
        }
        x5.k[] kVarArr = new x5.k[2];
        kVarArr[0] = r7.j.b(((r7.g) this.f15722f).f16573n);
        r7.g gVar = (r7.g) this.f15722f;
        kVarArr[1] = gVar.f16573n.f16590k.d(gVar.f16572m ? (String) this.f15721e : null, (Executor) this.f15723j);
        return j4.R(Arrays.asList(kVarArr));
    }

    @Override // d7.c
    public final Object zza() {
        Object objZza = ((d7.c) this.f15721e).zza();
        c7.c cVar = (c7.c) ((d7.c) this.f15722f).zza();
        Context context = ((c7.f) ((d7.c) this.f15723j)).f2161b.f243e;
        if (context != null) {
            return new c7.e((c7.k) objZza, cVar, context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // o5.c0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new g0((f) ((c0) this.f15721e).zzb(), ((j0) ((c0) this.f15722f)).zzb(), (k) ((c0) this.f15723j).zzb());
    }

    public d(com.google.android.gms.internal.measurement.b bVar) {
        this.f15720b = 5;
        this.f15721e = bVar;
        this.f15722f = bVar.clone();
        this.f15723j = new ArrayList();
    }

    public d(l9 l9Var) throws IOException {
        String str;
        this.f15720b = 10;
        this.f15723j = l9Var;
        int iD = r7.e.d((Context) l9Var.f10881e, "com.google.firebase.crashlytics.unity_version", "string");
        if (iD != 0) {
            this.f15721e = "Unity";
            this.f15722f = ((Context) l9Var.f10881e).getResources().getString(iD);
            str = "Unity Editor version is: " + ((String) this.f15722f);
            if (!Log.isLoggable("FirebaseCrashlytics", 2)) {
                return;
            }
        } else {
            if (((Context) l9Var.f10881e).getAssets() != null) {
                try {
                    InputStream inputStreamOpen = ((Context) l9Var.f10881e).getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    this.f15721e = "Flutter";
                    this.f15722f = null;
                    if (!Log.isLoggable("FirebaseCrashlytics", 2)) {
                        return;
                    } else {
                        str = "Development platform is: Flutter";
                    }
                } catch (IOException unused) {
                }
            }
            this.f15721e = null;
            this.f15722f = null;
            return;
        }
        Log.v("FirebaseCrashlytics", str, null);
    }

    @Override // o5.d0
    /* renamed from: zza, reason: collision with other method in class */
    public final Executor mo26zza() {
        return (Executor) this.f15723j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(l9 l9Var, int i10) {
        this(l9Var);
        this.f15720b = 10;
    }

    public d(com.onesignal.l logger, f4 dbHelper, com.onesignal.l preferences) {
        this.f15720b = 23;
        Intrinsics.f(logger, "logger");
        Intrinsics.f(dbHelper, "dbHelper");
        Intrinsics.f(preferences, "preferences");
        this.f15721e = logger;
        this.f15722f = dbHelper;
        this.f15723j = preferences;
    }

    public d(i7.e eVar) {
        this.f15720b = 9;
        this.f15721e = new ArrayList();
        this.f15722f = new ArrayList();
        this.f15723j = eVar;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i10) {
        this.f15720b = i10;
        this.f15721e = obj;
        this.f15722f = obj2;
        this.f15723j = obj3;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f15720b = i10;
        this.f15722f = obj;
        this.f15723j = obj2;
        this.f15721e = obj3;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i10, Object obj4) {
        this.f15720b = i10;
        this.f15723j = obj;
        this.f15721e = obj2;
        this.f15722f = obj3;
    }

    public /* synthetic */ d(Object obj, c0 c0Var, f fVar, int i10) {
        this.f15720b = i10;
        this.f15721e = obj;
        this.f15723j = c0Var;
        this.f15722f = fVar;
    }

    public d(String str, HashMap map) {
        this.f15720b = 15;
        this.f15721e = str;
        this.f15722f = map;
        this.f15723j = new HashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, q6.b bVar) {
        this(str, bVar, 0);
        this.f15720b = 16;
    }

    public d(String str, q6.b bVar, int i10) {
        o7.c cVar = o7.c.f15807a;
        this.f15720b = 16;
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f15723j = cVar;
        this.f15722f = bVar;
        this.f15721e = str;
    }

    public d(IntRange argumentRange, Method[] methodArr, Method method) {
        this.f15720b = 24;
        Intrinsics.f(argumentRange, "argumentRange");
        this.f15721e = argumentRange;
        this.f15722f = methodArr;
        this.f15723j = method;
    }

    public d(p5.g gVar, l9 l9Var) {
        this.f15720b = 8;
        this.f15721e = l9Var;
        this.f15722f = gVar;
        l7.c cVar = new l7.c(this, 1);
        this.f15723j = cVar;
        gVar.p(cVar);
    }
}