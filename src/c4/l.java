package c4;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l extends w4.j {

    /* renamed from: g, reason: collision with root package name */
    public final q f2121g;

    public l(int i10, String str, String str2, w4.j jVar, q qVar) {
        super(i10, str, str2, jVar);
        this.f2121g = qVar;
    }

    @Override // w4.j
    public final JSONObject c() throws JSONException {
        JSONObject jSONObjectC = super.c();
        q qVar = this.f2121g;
        jSONObjectC.put("Response Info", qVar == null ? "null" : qVar.a());
        return jSONObjectC;
    }

    @Override // w4.j
    public final String toString() {
        try {
            return c().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}