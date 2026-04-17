package com.onesignal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class e5 {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f11784d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final HashSet f11785e = new HashSet(Arrays.asList("lat", "long", "loc_acc", "loc_type", "loc_bg", "loc_time_stamp"));

    /* renamed from: a, reason: collision with root package name */
    public final String f11786a;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f11787b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f11788c;

    public e5(String str, boolean z7) throws JSONException {
        boolean z10;
        this.f11786a = str;
        if (!z7) {
            this.f11787b = new JSONObject();
            this.f11788c = new JSONObject();
            return;
        }
        String strE = h4.e(h4.f11856a, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + str, null);
        if (strE == null) {
            JSONObject jSONObject = new JSONObject();
            synchronized (f11784d) {
                this.f11787b = jSONObject;
            }
            try {
                int i10 = 1;
                int iC = h4.c(1, str.equals("CURRENT_STATE") ? "ONESIGNAL_SUBSCRIPTION" : "ONESIGNAL_SYNCED_SUBSCRIPTION");
                if (iC == -2) {
                    z10 = false;
                } else {
                    i10 = iC;
                    z10 = true;
                }
                HashMap map = new HashMap();
                map.put("subscribableStatus", Integer.valueOf(i10));
                map.put("userSubscribePref", Boolean.valueOf(z10));
                o(this.f11787b, map);
            } catch (JSONException unused) {
            }
        } else {
            try {
                r(new JSONObject(strE));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        String str2 = h4.f11856a;
        String strE2 = h4.e(str2, "ONESIGNAL_USERSTATE_SYNCVALYES_" + str, null);
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (strE2 == null) {
                jSONObject2.put("identifier", h4.e(str2, "GT_REGISTRATION_ID", null));
            } else {
                jSONObject2 = new JSONObject(strE2);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        s(jSONObject2);
    }

    public static JSONObject c(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, HashSet hashSet) {
        JSONObject jSONObjectJ;
        synchronized (f11784d) {
            jSONObjectJ = q3.j(jSONObject, jSONObject2, jSONObject3, hashSet);
        }
        return jSONObjectJ;
    }

    public static void o(JSONObject jSONObject, HashMap map) {
        synchronized (f11784d) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public final JSONObject b(e5 e5Var, boolean z7) throws JSONException {
        HashSet hashSet;
        JSONObject jSONObjectJ;
        a();
        e5Var.a();
        if (this.f11787b.optLong("loc_time_stamp") != e5Var.f11787b.getLong("loc_time_stamp")) {
            HashMap map = new HashMap();
            map.put("loc_bg", e5Var.f11787b.opt("loc_bg"));
            map.put("loc_time_stamp", e5Var.f11787b.opt("loc_time_stamp"));
            o(e5Var.f11788c, map);
            hashSet = f11785e;
        } else {
            hashSet = null;
        }
        JSONObject jSONObject = this.f11788c;
        JSONObject jSONObject2 = e5Var.f11788c;
        synchronized (f11784d) {
            jSONObjectJ = q3.j(jSONObject, jSONObject2, null, hashSet);
        }
        if (!z7 && jSONObjectJ.toString().equals("{}")) {
            return null;
        }
        try {
            if (!jSONObjectJ.has("app_id")) {
                jSONObjectJ.put("app_id", this.f11788c.optString("app_id"));
            }
            if (this.f11788c.has("email_auth_hash")) {
                jSONObjectJ.put("email_auth_hash", this.f11788c.optString("email_auth_hash"));
            }
            if (this.f11788c.has("sms_auth_hash")) {
                jSONObjectJ.put("sms_auth_hash", this.f11788c.optString("sms_auth_hash"));
            }
            if (this.f11788c.has("external_user_id_auth_hash") && !jSONObjectJ.has("external_user_id_auth_hash")) {
                jSONObjectJ.put("external_user_id_auth_hash", this.f11788c.optString("external_user_id_auth_hash"));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObjectJ;
    }

    public final JSONObject d(e5 e5Var) {
        JSONObject jSONObjectJ;
        synchronized (f11784d) {
            jSONObjectJ = q3.j(this.f11787b, e5Var.f11787b, null, null);
        }
        return jSONObjectJ;
    }

    public final void e(JSONObject jSONObject) {
        synchronized (f11784d) {
            JSONObject jSONObject2 = this.f11788c;
            q3.j(jSONObject2, jSONObject, jSONObject2, null);
        }
    }

    public final f0 f() {
        try {
            return new f0(g(), 4);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return new f0(4);
        }
    }

    public final JSONObject g() {
        JSONObject jSONObject;
        synchronized (f11784d) {
            jSONObject = new JSONObject(this.f11787b.toString());
        }
        return jSONObject;
    }

    public final f0 h() {
        try {
            return new f0(i(), 4);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return new f0(4);
        }
    }

    public final JSONObject i() {
        JSONObject jSONObject;
        synchronized (f11784d) {
            jSONObject = new JSONObject(this.f11788c.toString());
        }
        return jSONObject;
    }

    public final void j(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3;
        if (jSONObject.has("tags")) {
            try {
                JSONObject jSONObjectI = i();
                if (jSONObjectI.has("tags")) {
                    try {
                        jSONObject3 = new JSONObject(jSONObjectI.optString("tags"));
                    } catch (JSONException unused) {
                        jSONObject3 = new JSONObject();
                    }
                } else {
                    jSONObject3 = new JSONObject();
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tags");
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if ("".equals(jSONObjectOptJSONObject.optString(next))) {
                        jSONObject3.remove(next);
                    } else if (jSONObject2 == null || !jSONObject2.has(next)) {
                        jSONObject3.put(next, jSONObjectOptJSONObject.optString(next));
                    }
                }
                synchronized (f11784d) {
                    try {
                        if (jSONObject3.toString().equals("{}")) {
                            this.f11788c.remove("tags");
                        } else {
                            this.f11788c.put("tags", jSONObject3);
                        }
                    } finally {
                    }
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[Catch: all -> 0x002c, JSONException -> 0x002e, TRY_LEAVE, TryCatch #1 {JSONException -> 0x002e, blocks: (B:4:0x0007, B:6:0x0011, B:8:0x001b, B:17:0x003a, B:15:0x0030), top: B:25:0x0007, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        synchronized (f11784d) {
            try {
                try {
                    if (this.f11788c.has("external_user_id_auth_hash")) {
                        if (!this.f11788c.has("external_user_id") || this.f11788c.get("external_user_id").toString() != "") {
                            if (!this.f11788c.has("external_user_id")) {
                                this.f11788c.remove("external_user_id_auth_hash");
                            }
                        }
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                String str = h4.f11856a;
                h4.g(this.f11788c.toString(), str, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f11786a);
                h4.g(this.f11787b.toString(), str, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f11786a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject != null) {
            JSONObject jSONObject3 = this.f11787b;
            synchronized (f11784d) {
                q3.j(jSONObject3, jSONObject, jSONObject3, null);
            }
        }
        if (jSONObject2 != null) {
            JSONObject jSONObject4 = this.f11788c;
            c(jSONObject4, jSONObject2, jSONObject4, null);
            j(jSONObject2, null);
        }
        if (jSONObject == null && jSONObject2 == null) {
            return;
        }
        k();
    }

    public final void m(Boolean bool, String str) {
        synchronized (f11784d) {
            this.f11787b.put(str, bool);
        }
    }

    public final void n(Object obj, String str) {
        synchronized (f11784d) {
            this.f11788c.put(str, obj);
        }
    }

    public final void p(String str) {
        synchronized (f11784d) {
            this.f11787b.remove(str);
        }
    }

    public final void q(String str) {
        synchronized (f11784d) {
            this.f11788c.remove(str);
        }
    }

    public final void r(JSONObject jSONObject) {
        synchronized (f11784d) {
            this.f11787b = jSONObject;
        }
    }

    public final void s(JSONObject jSONObject) {
        synchronized (f11784d) {
            this.f11788c = jSONObject;
        }
    }

    public final String toString() {
        return "UserState{persistKey='" + this.f11786a + "', dependValues=" + this.f11787b + ", syncValues=" + this.f11788c + '}';
    }
}