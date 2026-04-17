package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class NotificationOpenedActivityHMS extends Activity {
    public final void a() throws JSONException {
        JSONObject jSONObjectF;
        Intent intent = getIntent();
        z3.y(getApplicationContext());
        if (intent != null) {
            if (q3.D(intent.getExtras())) {
                jSONObjectF = q3.f(intent.getExtras());
                try {
                    String str = (String) q3.q(jSONObjectF).remove("actionId");
                    if (str != null) {
                        jSONObjectF.put("actionId", str);
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            } else {
                jSONObjectF = null;
            }
            if (jSONObjectF != null && !q3.I(this, jSONObjectF)) {
                z3.v(this, new JSONArray().put(jSONObjectF), q3.w(jSONObjectF));
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        a();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) throws JSONException {
        super.onNewIntent(intent);
        a();
    }
}