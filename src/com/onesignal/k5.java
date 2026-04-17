package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k5 extends q3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ JSONObject f11940h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ JSONObject f11941i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f11942j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m5 f11943k;

    public k5(m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        this.f11943k = m5Var;
        this.f11940h = jSONObject;
        this.f11941i = jSONObject2;
        this.f11942j = str;
    }

    @Override // com.onesignal.q3
    public final void J(int i10, String str, Throwable th) {
        synchronized (this.f11943k.f11983a) {
            try {
                this.f11943k.f11992j = false;
                z3.b(y3.f12231j, "Failed last request. statusCode: " + i10 + "\nresponse: " + str, null);
                if (m5.a(this.f11943k, i10, str, "not a valid device_type")) {
                    m5.c(this.f11943k);
                } else {
                    m5.d(this.f11943k, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.onesignal.q3
    public final void K(String str) {
        synchronized (this.f11943k.f11983a) {
            try {
                m5 m5Var = this.f11943k;
                m5Var.f11992j = false;
                m5Var.j().l(this.f11940h, this.f11941i);
                try {
                    z3.b(y3.f12233n, "doCreateOrNewSession:response: " + str, null);
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("id")) {
                        String strOptString = jSONObject.optString("id");
                        this.f11943k.z(strOptString);
                        z3.b(y3.f12232m, "Device registered, UserId = " + strOptString, null);
                    } else {
                        z3.b(y3.f12232m, "session sent, UserId = " + this.f11942j, null);
                    }
                    this.f11943k.p().m(Boolean.FALSE, "session");
                    this.f11943k.p().k();
                    if (jSONObject.has("in_app_messages")) {
                        z3.n().o0(jSONObject.getJSONArray("in_app_messages"));
                    }
                    this.f11943k.s(this.f11941i);
                } catch (JSONException e10) {
                    z3.b(y3.f12230f, "ERROR parsing on_session or create JSON Response.", e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}