package com.onesignal;

import com.google.android.gms.internal.ads.ic1;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11846a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11847b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11848c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11849d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f11850e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final b5 f11851f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11852g;

    public h1(JSONObject jSONObject) throws JSONException {
        int i10;
        y1 y1Var;
        this.f11846a = jSONObject.optString("id", null);
        jSONObject.optString("name", null);
        this.f11848c = jSONObject.optString("url", null);
        jSONObject.optString("pageId", null);
        String strOptString = jSONObject.optString("url_target", null);
        int[] iArrC = v.h.c(3);
        int length = iArrC.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i10 = 0;
                break;
            }
            i10 = iArrC[i11];
            if (ic1.e(i10).equalsIgnoreCase(strOptString)) {
                break;
            } else {
                i11++;
            }
        }
        this.f11847b = i10;
        if (i10 == 0) {
            this.f11847b = 1;
        }
        jSONObject.optBoolean("close", true);
        if (jSONObject.has("outcomes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("outcomes");
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i12);
                v1 v1Var = new v1();
                v1Var.f12198a = jSONObject2.getString("name");
                v1Var.f12199b = jSONObject2.has("weight") ? (float) jSONObject2.getDouble("weight") : 0.0f;
                v1Var.f12200c = jSONObject2.has("unique") && jSONObject2.getBoolean("unique");
                this.f11849d.add(v1Var);
            }
        }
        if (jSONObject.has("tags")) {
            this.f11851f = new b5(jSONObject.getJSONObject("tags"), 7);
        }
        if (jSONObject.has("prompts")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("prompts");
            for (int i13 = 0; i13 < jSONArray2.length(); i13++) {
                String string = jSONArray2.getString(i13);
                string.getClass();
                boolean zEquals = string.equals("push");
                ArrayList arrayList = this.f11850e;
                if (zEquals) {
                    y1Var = new y1(0);
                } else if (string.equals("location")) {
                    y1Var = new y1(1);
                }
                arrayList.add(y1Var);
            }
        }
    }
}