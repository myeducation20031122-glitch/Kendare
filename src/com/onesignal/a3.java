package com.onesignal;

import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a3 implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public com.bumptech.glide.manager.t f11713b;

    /* renamed from: e, reason: collision with root package name */
    public String f11714e;

    /* renamed from: f, reason: collision with root package name */
    public String f11715f;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f11714e;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("smsUserId", obj);
            String str = this.f11715f;
            if (str != null) {
                jSONObject.put("smsNumber", str);
            } else {
                jSONObject.put("smsNumber", JSONObject.NULL);
            }
            jSONObject.put("isSubscribed", (this.f11714e == null || str == null) ? false : true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String toString() {
        return b().toString();
    }
}