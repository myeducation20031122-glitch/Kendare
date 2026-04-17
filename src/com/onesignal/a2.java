package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a2 extends JSONObject {
    public a2(String str, int i10, String str2, String str3, String str4, boolean z7) throws JSONException {
        put("app_id", str);
        put("device_type", i10);
        put("player_id", str2);
        put("click_id", str3);
        put("variant_id", str4);
        if (z7) {
            put("first_click", true);
        }
    }

    public a2(String str, String str2, String str3, int i10) throws JSONException {
        put("app_id", str);
        put("player_id", str2);
        put("variant_id", str3);
        put("device_type", i10);
        put("first_impression", true);
    }

    public a2(String str, String str2, String str3, int i10, String str4) throws JSONException {
        put("app_id", str);
        put("player_id", str2);
        put("variant_id", str3);
        put("device_type", i10);
        put("page_id", str4);
    }
}