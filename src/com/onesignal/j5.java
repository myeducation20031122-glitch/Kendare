package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class j5 extends m5 {
    public abstract void B();

    public abstract void C();

    public abstract String D();

    public abstract String E();

    public abstract int F();

    @Override // com.onesignal.m5
    public final void e(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("device_type", F());
            jSONObject.putOpt("device_player_id", z3.s());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.onesignal.m5
    public final void g(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            B();
        }
    }

    @Override // com.onesignal.m5
    public final y3 l() {
        return y3.f12232m;
    }

    @Override // com.onesignal.m5
    public final void s(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("identifier")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(E(), jSONObject.get("identifier"));
                if (jSONObject.has(D())) {
                    jSONObject2.put(D(), jSONObject.get(D()));
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            C();
        }
    }

    @Override // com.onesignal.m5
    public final void w() {
        if ((k() == null && n() == null) || z3.s() == null) {
            return;
        }
        m(0).a();
    }
}