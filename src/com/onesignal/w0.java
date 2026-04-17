package com.onesignal;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.math.BigInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f12212a = Pattern.compile("^([A-Fa-f0-9]{8})$");

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(Context context, NotificationManager notificationManager, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        long[] jArrT;
        Object objOpt = jSONObject.opt("chnl");
        JSONObject jSONObject2 = objOpt instanceof String ? new JSONObject((String) objOpt) : (JSONObject) objOpt;
        String strOptString = jSONObject2.optString("id", "fcm_fallback_notification_channel");
        String str = strOptString.equals("miscellaneous") ? "fcm_fallback_notification_channel" : strOptString;
        if (jSONObject2.has("langs")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("langs");
            String strG = y9.a.f19420b.f19421a.g();
            jSONObjectOptJSONObject = jSONObject3.has(strG) ? jSONObject3.optJSONObject(strG) : jSONObject2;
        }
        String strOptString2 = jSONObjectOptJSONObject.optString("nm", "Miscellaneous");
        int iOptInt = jSONObject.optInt("pri", 6);
        NotificationChannel notificationChannelD = a6.a.d(str, strOptString2, iOptInt <= 9 ? iOptInt > 7 ? 4 : iOptInt > 5 ? 3 : iOptInt > 3 ? 2 : iOptInt > 1 ? 1 : 0 : 5);
        notificationChannelD.setDescription(jSONObjectOptJSONObject.optString("dscr", null));
        if (jSONObject2.has("grp_id")) {
            String strOptString3 = jSONObject2.optString("grp_id");
            a6.a.t(notificationManager, a6.a.e(strOptString3, jSONObjectOptJSONObject.optString("grp_nm")));
            a6.a.q(notificationChannelD, strOptString3);
        }
        if (jSONObject.has("ledc")) {
            String strOptString4 = jSONObject.optString("ledc");
            if (!f12212a.matcher(strOptString4).matches()) {
                z3.b(y3.f12231j, "OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)", null);
                strOptString4 = "FFFFFFFF";
            }
            try {
                a6.a.o(notificationChannelD, new BigInteger(strOptString4, 16).intValue());
            } catch (Throwable th) {
                z3.b(y3.f12230f, "Couldn't convert ARGB Hex value to BigInteger:", th);
            }
        }
        a6.a.r(notificationChannelD, jSONObject.optInt("led", 1) == 1);
        if (jSONObject.has("vib_pt") && (jArrT = OSUtils.t(jSONObject)) != null) {
            a6.a.s(notificationChannelD, jArrT);
        }
        a6.a.C(notificationChannelD, jSONObject.optInt("vib", 1) == 1);
        if (jSONObject.has("sound")) {
            String strOptString5 = jSONObject.optString("sound", null);
            Uri uriF = OSUtils.f(context, strOptString5);
            if (uriF != null) {
                a6.a.p(notificationChannelD, uriF);
            } else if ("null".equals(strOptString5) || "nil".equals(strOptString5)) {
                a6.a.n(notificationChannelD);
            }
        }
        a6.a.B(notificationChannelD, jSONObject.optInt("vis", 0));
        notificationChannelD.setShowBadge(jSONObject.optInt("bdg", 1) == 1);
        notificationChannelD.setBypassDnd(jSONObject.optInt("bdnd", 0) == 1);
        z3.b(y3.f12234t, "Creating notification channel with channel:\n" + notificationChannelD.toString(), null);
        try {
            notificationManager.createNotificationChannel(notificationChannelD);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
        }
        return str;
    }

    public static String b(n2 n2Var) {
        if (Build.VERSION.SDK_INT < 26) {
            return "fcm_fallback_notification_channel";
        }
        Context context = n2Var.f12012b;
        JSONObject jSONObject = n2Var.f12013c;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (n2Var.f12014d) {
            notificationManager.createNotificationChannel(v0.c());
            return "restored_OS_notifications";
        }
        if (jSONObject.has("oth_chnl")) {
            String strOptString = jSONObject.optString("oth_chnl");
            if (notificationManager.getNotificationChannel(strOptString) != null) {
                return strOptString;
            }
        }
        if (jSONObject.has("chnl")) {
            try {
                return a(context, notificationManager, jSONObject);
            } catch (JSONException e10) {
                z3.b(y3.f12230f, "Could not create notification channel due to JSON payload error!", e10);
                return "fcm_fallback_notification_channel";
            }
        }
        NotificationChannel notificationChannelB = a6.a.b();
        a6.a.A(notificationChannelB);
        a6.a.D(notificationChannelB);
        notificationManager.createNotificationChannel(notificationChannelB);
        return "fcm_fallback_notification_channel";
    }
}