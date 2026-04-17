package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class Purchase {

    /* renamed from: a, reason: collision with root package name */
    public final String f2194a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2195b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f2196c;

    public Purchase(String str, String str2) {
        this.f2194a = str;
        this.f2195b = str2;
        this.f2196c = new JSONObject(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f2194a, purchase.f2194a) && TextUtils.equals(this.f2195b, purchase.f2195b);
    }

    public final int hashCode() {
        return this.f2194a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f2194a));
    }
}