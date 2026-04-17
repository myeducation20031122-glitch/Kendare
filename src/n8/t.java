package n8;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final long f15439d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f15440a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15441b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15442c;

    public t(String str, String str2, long j10) {
        this.f15440a = str;
        this.f15441b = str2;
        this.f15442c = j10;
    }

    public static String a(String str, String str2, long j10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j10);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
            return null;
        }
    }

    public static t b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new t(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new t(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e10) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
            return null;
        }
    }
}