package com.onesignal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public x9.c f12201a;

    /* renamed from: b, reason: collision with root package name */
    public JSONArray f12202b;

    /* renamed from: c, reason: collision with root package name */
    public String f12203c;

    /* renamed from: d, reason: collision with root package name */
    public long f12204d;

    /* renamed from: e, reason: collision with root package name */
    public Float f12205e;

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = this.f12202b;
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject.put("notification_ids", jSONArray);
        }
        jSONObject.put("id", this.f12203c);
        Float f10 = this.f12205e;
        if (f10.floatValue() > 0.0f) {
            jSONObject.put("weight", f10);
        }
        long j10 = this.f12204d;
        if (j10 > 0) {
            jSONObject.put("timestamp", j10);
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v2.class != obj.getClass()) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return this.f12201a.equals(v2Var.f12201a) && this.f12202b.equals(v2Var.f12202b) && this.f12203c.equals(v2Var.f12203c) && this.f12204d == v2Var.f12204d && this.f12205e.equals(v2Var.f12205e);
    }

    public final int hashCode() {
        int iHashCode = 1;
        Object[] objArr = {this.f12201a, this.f12202b, this.f12203c, Long.valueOf(this.f12204d), this.f12205e};
        for (int i10 = 0; i10 < 5; i10++) {
            Object obj = objArr[i10];
            iHashCode = (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return iHashCode;
    }

    public final String toString() {
        return "OutcomeEvent{session=" + this.f12201a + ", notificationIds=" + this.f12202b + ", name='" + this.f12203c + "', timestamp=" + this.f12204d + ", weight=" + this.f12205e + '}';
    }
}