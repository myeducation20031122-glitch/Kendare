package c4;

import j4.e2;
import j4.h3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final h3 f2118a;

    /* renamed from: b, reason: collision with root package name */
    public final w4.j f2119b;

    public j(h3 h3Var) {
        this.f2118a = h3Var;
        e2 e2Var = h3Var.f13726f;
        this.f2119b = e2Var == null ? null : e2Var.h();
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        h3 h3Var = this.f2118a;
        jSONObject.put("Adapter", h3Var.f13724b);
        jSONObject.put("Latency", h3Var.f13725e);
        String str = h3Var.f13728m;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = h3Var.f13729n;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = h3Var.f13730t;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = h3Var.f13731u;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str5 : h3Var.f13727j.keySet()) {
            jSONObject2.put(str5, h3Var.f13727j.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        w4.j jVar = this.f2119b;
        if (jVar == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", jVar.c());
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}