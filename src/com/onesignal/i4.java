package com.onesignal;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.measurement.l9;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i4 extends q3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11895h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f11896i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f11897j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f11898k;

    public i4(m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f11898k = m5Var;
        this.f11896i = jSONObject;
        this.f11897j = jSONObject2;
    }

    @Override // com.onesignal.q3
    public final void J(int i10, String str, Throwable th) {
        switch (this.f11895h) {
            case 0:
                if (i10 == 403) {
                    z3.b(y3.f12229e, "403 error getting OneSignal params, omitting further retries!", null);
                    return;
                } else {
                    new Thread(new g0(this, 5), "OS_PARAMS_REQUEST").start();
                    return;
                }
            default:
                y3 y3Var = y3.f12230f;
                z3.b(y3Var, "Failed PUT sync request with status code: " + i10 + " and response: " + str, null);
                synchronized (((m5) this.f11898k).f11983a) {
                    try {
                        if (m5.a((m5) this.f11898k, i10, str, "No user with this id found")) {
                            m5.c((m5) this.f11898k);
                        } else {
                            m5.d((m5) this.f11898k, i10);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (((JSONObject) this.f11896i).has("tags")) {
                    ic1.v(((m5) this.f11898k).f11987e.poll());
                }
                if (((JSONObject) this.f11896i).has("external_user_id")) {
                    z3.b(y3Var, "Error setting external user id for push with status code: " + i10 + " and message: " + str, null);
                    ic1.v(((m5) this.f11898k).f11988f.poll());
                }
                if (((JSONObject) this.f11896i).has("language")) {
                    ic1.v(((m5) this.f11898k).f11989g.poll());
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0229  */
    @Override // com.onesignal.q3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        JSONArray jSONArray;
        Context context;
        String strQ;
        List notificationChannels = null;
        int i10 = 0;
        switch (this.f11895h) {
            case 0:
                com.google.android.gms.internal.ads.d0 d0Var = (com.google.android.gms.internal.ads.d0) this.f11898k;
                try {
                    j4 j4Var = new j4(new JSONObject(str));
                    d0Var.getClass();
                    z3.N = false;
                    String str2 = j4Var.f11912a;
                    if (str2 != null) {
                        z3.f12254e = str2;
                    }
                    f0 f0Var = z3.f12276v;
                    l9 l9Var = z3.A;
                    l lVar = z3.f12280z;
                    l lVar2 = z3.f12272r;
                    f0Var.f11790b = j4Var;
                    String str3 = h4.f11856a;
                    h4.h(str3, "GT_FIREBASE_TRACKING_ENABLED", j4Var.f11914c);
                    h4.h(str3, "OS_RESTORE_TTL_FILTER", ((j4) f0Var.f11790b).f11915d);
                    h4.h(str3, "OS_CLEAR_GROUP_SUMMARY_CLICK", j4Var.f11916e);
                    lVar.getClass();
                    k4 k4Var = j4Var.f11922k;
                    h4.h(str3, "PREFS_OS_OUTCOMES_V2", k4Var.f11939h);
                    h4.h(str3, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", j4Var.f11917f);
                    String str4 = "OneSignal saveInfluenceParams: " + k4Var.toString();
                    lVar2.getClass();
                    l.d(str4);
                    l9Var.getClass();
                    p5.m mVar = (p5.m) l9Var.f10882f;
                    mVar.getClass();
                    ((l) mVar.f15961e).getClass();
                    h4.h(str3, "PREFS_OS_DIRECT_ENABLED", k4Var.f11936e);
                    ((l) mVar.f15961e).getClass();
                    h4.h(str3, "PREFS_OS_INDIRECT_ENABLED", k4Var.f11937f);
                    ((l) mVar.f15961e).getClass();
                    h4.h(str3, "PREFS_OS_UNATTRIBUTED_ENABLED", k4Var.f11938g);
                    ((l) mVar.f15961e).getClass();
                    h4.g(Integer.valueOf(k4Var.f11933b), str3, "PREFS_OS_NOTIFICATION_LIMIT");
                    ((l) mVar.f15961e).getClass();
                    h4.g(Integer.valueOf(k4Var.f11932a), str3, "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW");
                    ((l) mVar.f15961e).getClass();
                    h4.g(Integer.valueOf(k4Var.f11935d), str3, "PREFS_OS_IAM_LIMIT");
                    ((l) mVar.f15961e).getClass();
                    h4.g(Integer.valueOf(k4Var.f11934c), str3, "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW");
                    Boolean bool = j4Var.f11918g;
                    if (bool != null) {
                        h4.h(str3, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", bool.booleanValue());
                    }
                    Boolean bool2 = j4Var.f11919h;
                    if (bool2 != null) {
                        h4.h(str3, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", bool2.booleanValue());
                    }
                    Boolean bool3 = j4Var.f11920i;
                    if (bool3 != null) {
                        boolean zBooleanValue = bool3.booleanValue();
                        l.d("OneSignal startLocationShared: " + zBooleanValue);
                        h4.h(str3, "PREFS_OS_LOCATION_SHARED", zBooleanValue);
                        if (!zBooleanValue) {
                            l.d("OneSignal is shareLocation set false, clearing last location!");
                            p4.b().f();
                            p4.a().f();
                            p4.c().f();
                        }
                    }
                    Boolean bool4 = j4Var.f11921j;
                    if (bool4 != null) {
                        h4.h(str3, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", bool4.booleanValue());
                    }
                    if (!z3.f12267m) {
                        b5 b5Var = z3.S;
                        if (b5Var == null) {
                            strQ = z3.q(z3.f12248b);
                            context = z3.f12248b;
                            l.e("Trying to continue OneSignal with null delayed params");
                        } else {
                            String str5 = (String) b5Var.f11740f;
                            context = (Context) b5Var.f11739e;
                            strQ = str5;
                        }
                        l.d("reassignDelayedInitParams with appContext: " + z3.f12248b);
                        z3.S = null;
                        z3.M(strQ);
                        if (!z3.f12267m) {
                            if (context == null) {
                                l.e("Trying to continue OneSignal with null delayed params context");
                                if (z3.f12268n) {
                                    z3.E();
                                }
                            } else {
                                z3.y(context);
                            }
                        }
                    } else if (z3.f12268n) {
                    }
                    Context context2 = z3.f12248b;
                    Pattern pattern = w0.f12212a;
                    if (Build.VERSION.SDK_INT >= 26 && (jSONArray = j4Var.f11913b) != null && jSONArray.length() != 0) {
                        NotificationManager notificationManager = (NotificationManager) context2.getSystemService("notification");
                        HashSet hashSet = new HashSet();
                        int length = jSONArray.length();
                        while (true) {
                            y3 y3Var = y3.f12230f;
                            if (i10 < length) {
                                try {
                                    hashSet.add(w0.a(context2, notificationManager, jSONArray.getJSONObject(i10)));
                                } catch (JSONException e10) {
                                    z3.b(y3Var, "Could not create notification channel due to JSON payload error!", e10);
                                }
                                i10++;
                            } else if (!hashSet.isEmpty()) {
                                try {
                                    notificationChannels = notificationManager.getNotificationChannels();
                                } catch (NullPointerException e11) {
                                    z3.b(y3Var, "Error when trying to delete notification channel: " + e11.getMessage(), null);
                                } catch (RuntimeException e12) {
                                    if (!a2.l.z(e12.getCause())) {
                                        throw e12;
                                    }
                                }
                                if (notificationChannels != null) {
                                    Iterator it = notificationChannels.iterator();
                                    while (it.hasNext()) {
                                        String strM = a6.a.m(a6.a.c(it.next()));
                                        if (strM.startsWith("OS_") && !hashSet.contains(strM)) {
                                            a6.a.u(notificationManager, strM);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (d0Var.f3498e) {
                        z3.H();
                        return;
                    }
                    return;
                } catch (NullPointerException | JSONException e13) {
                    y3 y3Var2 = y3.f12229e;
                    z3.b(y3Var2, "Error parsing android_params!: ", e13);
                    z3.b(y3Var2, "Response that errored from android_params!: " + str, null);
                    return;
                }
            default:
                synchronized (((m5) this.f11898k).f11983a) {
                    ((m5) this.f11898k).j().l((JSONObject) this.f11897j, (JSONObject) this.f11896i);
                    ((m5) this.f11898k).s((JSONObject) this.f11896i);
                }
                if (((JSONObject) this.f11896i).has("tags")) {
                    m5 m5Var = (m5) this.f11898k;
                    m5Var.getClass();
                    p4.d(false);
                    ic1.v(m5Var.f11987e.poll());
                }
                if (((JSONObject) this.f11896i).has("external_user_id")) {
                    ic1.v(((m5) this.f11898k).f11988f.poll());
                }
                if (((JSONObject) this.f11896i).has("language")) {
                    m5 m5Var2 = (m5) this.f11898k;
                    m5Var2.getClass();
                    ((JSONObject) p4.b().o().f().f11790b).optString("language", null);
                    ic1.v(m5Var2.f11989g.poll());
                    return;
                }
                return;
        }
    }

    public i4(String str, String str2, com.google.android.gms.internal.ads.d0 d0Var) {
        this.f11896i = str;
        this.f11897j = str2;
        this.f11898k = d0Var;
    }
}