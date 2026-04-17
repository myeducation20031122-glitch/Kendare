package com.onesignal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class p4 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f12059a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f12060b = new HashMap();

    public static g5 a() {
        HashMap map = f12060b;
        o4 o4Var = o4.f12046e;
        if (!map.containsKey(o4Var) || map.get(o4Var) == null) {
            synchronized (f12059a) {
                try {
                    if (map.get(o4Var) == null) {
                        map.put(o4Var, new g5(o4Var));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (g5) map.get(o4Var);
    }

    public static h5 b() {
        HashMap map = f12060b;
        o4 o4Var = o4.f12045b;
        if (!map.containsKey(o4Var) || map.get(o4Var) == null) {
            synchronized (f12059a) {
                try {
                    if (map.get(o4Var) == null) {
                        map.put(o4Var, new h5(o4Var));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (h5) map.get(o4Var);
    }

    public static i5 c() {
        HashMap map = f12060b;
        o4 o4Var = o4.f12047f;
        if (!map.containsKey(o4Var) || map.get(o4Var) == null) {
            synchronized (f12059a) {
                try {
                    if (map.get(o4Var) == null) {
                        map.put(o4Var, new i5(o4Var));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (i5) map.get(o4Var);
    }

    public static w d(boolean z7) {
        w wVar;
        JSONObject jSONObject;
        h5 h5VarB = b();
        if (z7) {
            h5VarB.getClass();
            q3.F("players/" + z3.s() + "?app_id=" + z3.q(z3.f12248b), null, null, new q(h5VarB, 1), 60000, "CACHE_KEY_GET_TAGS");
        }
        synchronized (h5VarB.f11983a) {
            boolean z10 = h5.f11859m;
            f0 f0VarH = h5VarB.o().h();
            if (((JSONObject) f0VarH.f11790b).has("tags")) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObjectOptJSONObject = ((JSONObject) f0VarH.f11790b).optJSONObject("tags");
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        Object obj = jSONObjectOptJSONObject.get(next);
                        if (!"".equals(obj)) {
                            jSONObject2.put(next, obj);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject = jSONObject2;
            } else {
                jSONObject = null;
            }
            wVar = new w();
            wVar.f12210b = z10;
            wVar.f12211e = jSONObject;
        }
        return wVar;
    }

    public static void e(JSONObject jSONObject, q3 q3Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(b());
        if (!TextUtils.isEmpty(z3.f12262i)) {
            arrayList.add(a());
        }
        if (!TextUtils.isEmpty(z3.f12264j)) {
            arrayList.add(c());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q3.L("players/" + ((m5) it.next()).k() + "/on_purchase", jSONObject, q3Var);
        }
    }

    public static void f(m0 m0Var) {
        b().A(m0Var);
        a().A(m0Var);
        c().A(m0Var);
    }

    public static void g(JSONObject jSONObject) {
        h5 h5VarB = b();
        h5VarB.getClass();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("identifier", jSONObject.optString("identifier", null));
            if (jSONObject.has("device_type")) {
                jSONObject2.put("device_type", jSONObject.optInt("device_type"));
            }
            jSONObject2.putOpt("parent_player_id", jSONObject.optString("parent_player_id", null));
            h5VarB.p().e(jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("subscribableStatus")) {
                jSONObject3.put("subscribableStatus", jSONObject.optInt("subscribableStatus"));
            }
            if (jSONObject.has("androidPermission")) {
                jSONObject3.put("androidPermission", jSONObject.optBoolean("androidPermission"));
            }
            e5 e5VarP = h5VarB.p();
            e5VarP.getClass();
            synchronized (e5.f11784d) {
                JSONObject jSONObject4 = e5VarP.f11787b;
                q3.j(jSONObject4, jSONObject3, jSONObject4, null);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}