package com.onesignal;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public JSONArray f12042a;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f12043b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return Intrinsics.a(this.f12042a, o2Var.f12042a) && Intrinsics.a(this.f12043b, o2Var.f12043b);
    }

    public final int hashCode() {
        JSONArray jSONArray = this.f12042a;
        int iHashCode = (jSONArray == null ? 0 : jSONArray.hashCode()) * 31;
        JSONObject jSONObject = this.f12043b;
        return iHashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public final String toString() {
        return "OSNotificationIntentExtras(dataArray=" + this.f12042a + ", jsonData=" + this.f12043b + ')';
    }
}