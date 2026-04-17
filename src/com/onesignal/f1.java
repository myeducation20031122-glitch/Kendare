package com.onesignal;

import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f1 implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public com.bumptech.glide.manager.t f11791b;

    /* renamed from: e, reason: collision with root package name */
    public String f11792e;

    /* renamed from: f, reason: collision with root package name */
    public String f11793f;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f11792e;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("emailUserId", obj);
            String str = this.f11793f;
            if (str != null) {
                jSONObject.put("emailAddress", str);
            } else {
                jSONObject.put("emailAddress", JSONObject.NULL);
            }
            jSONObject.put("isSubscribed", (this.f11792e == null || str == null) ? false : true);
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