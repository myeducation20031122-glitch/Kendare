package com.onesignal;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11912a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONArray f11913b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11914c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11915d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11916e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11917f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f11918g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f11919h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f11920i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f11921j;

    /* renamed from: k, reason: collision with root package name */
    public final k4 f11922k;

    /* renamed from: l, reason: collision with root package name */
    public final f2 f11923l;

    public j4(JSONObject jSONObject) {
        jSONObject.optBoolean("enterp", false);
        jSONObject.optBoolean("require_email_auth", false);
        jSONObject.optBoolean("require_user_id_auth", false);
        this.f11913b = jSONObject.optJSONArray("chnl_lst");
        this.f11914c = jSONObject.optBoolean("fba", false);
        this.f11915d = jSONObject.optBoolean("restore_ttl_filter", true);
        this.f11912a = jSONObject.optString("android_sender_id", null);
        this.f11916e = jSONObject.optBoolean("clear_group_on_summary_click", true);
        this.f11917f = jSONObject.optBoolean("receive_receipts_enable", false);
        this.f11918g = !jSONObject.has("disable_gms_missing_prompt") ? null : Boolean.valueOf(jSONObject.optBoolean("disable_gms_missing_prompt", false));
        this.f11919h = !jSONObject.has("unsubscribe_on_notifications_disabled") ? null : Boolean.valueOf(jSONObject.optBoolean("unsubscribe_on_notifications_disabled", true));
        this.f11920i = !jSONObject.has("location_shared") ? null : Boolean.valueOf(jSONObject.optBoolean("location_shared", true));
        this.f11921j = !jSONObject.has("requires_user_privacy_consent") ? null : Boolean.valueOf(jSONObject.optBoolean("requires_user_privacy_consent", false));
        k4 k4Var = new k4();
        k4Var.f11932a = 1440;
        k4Var.f11933b = 10;
        k4Var.f11934c = 1440;
        k4Var.f11935d = 10;
        k4Var.f11936e = false;
        k4Var.f11937f = false;
        k4Var.f11938g = false;
        k4Var.f11939h = false;
        this.f11922k = k4Var;
        if (jSONObject.has("outcomes")) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("outcomes");
            if (jSONObjectOptJSONObject.has("v2_enabled")) {
                k4Var.f11939h = jSONObjectOptJSONObject.optBoolean("v2_enabled");
            }
            if (jSONObjectOptJSONObject.has("direct")) {
                k4Var.f11936e = jSONObjectOptJSONObject.optJSONObject("direct").optBoolean("enabled");
            }
            if (jSONObjectOptJSONObject.has("indirect")) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("indirect");
                k4Var.f11937f = jSONObjectOptJSONObject2.optBoolean("enabled");
                if (jSONObjectOptJSONObject2.has("notification_attribution")) {
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("notification_attribution");
                    k4Var.f11932a = jSONObjectOptJSONObject3.optInt("minutes_since_displayed", 1440);
                    k4Var.f11933b = jSONObjectOptJSONObject3.optInt("limit", 10);
                }
                if (jSONObjectOptJSONObject2.has("in_app_message_attribution")) {
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject("in_app_message_attribution");
                    k4Var.f11934c = jSONObjectOptJSONObject4.optInt("minutes_since_displayed", 1440);
                    k4Var.f11935d = jSONObjectOptJSONObject4.optInt("limit", 10);
                }
            }
            if (jSONObjectOptJSONObject.has("unattributed")) {
                k4Var.f11938g = jSONObjectOptJSONObject.optJSONObject("unattributed").optBoolean("enabled");
            }
        }
        f2 f2Var = new f2();
        this.f11923l = f2Var;
        if (jSONObject.has("fcm")) {
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("fcm");
            f2Var.f11796c = jSONObjectOptJSONObject5.optString("api_key", null);
            f2Var.f11795b = jSONObjectOptJSONObject5.optString("app_id", null);
            f2Var.f11794a = jSONObjectOptJSONObject5.optString("project_id", null);
        }
    }
}