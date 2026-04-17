package com.onesignal;

import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class OSSubscriptionState implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public com.bumptech.glide.manager.t f11693b;

    /* renamed from: e, reason: collision with root package name */
    public String f11694e;

    /* renamed from: f, reason: collision with root package name */
    public String f11695f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11696j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11697m;

    public final boolean b() {
        return (this.f11694e == null || this.f11695f == null || this.f11697m || !this.f11696j) ? false : true;
    }

    public final JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f11694e;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("userId", obj);
            Object obj2 = this.f11695f;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("pushToken", obj2);
            jSONObject.put("isPushDisabled", this.f11697m);
            jSONObject.put("isSubscribed", b());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public void changed(x2 x2Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z7 = x2Var.f12222e;
        boolean zB = b();
        this.f11696j = z7;
        if (zB != b()) {
            this.f11693b.h(this);
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final String toString() {
        return c().toString();
    }
}