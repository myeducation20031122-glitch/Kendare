package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class SkuDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f2197a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f2198b;

    public SkuDetails(String str) {
        this.f2197a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f2198b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public final String a() {
        return this.f2198b.optString("type");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f2197a, ((SkuDetails) obj).f2197a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2197a.hashCode();
    }

    public final String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f2197a));
    }
}