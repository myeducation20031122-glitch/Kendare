package com.onesignal;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class OSNotificationWorkManager$NotificationWorker extends Worker {
    public OSNotificationWorkManager$NotificationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final z1.n doWork() {
        z1.g inputData = getInputData();
        try {
            z3.b(y3.f12233n, "NotificationWorker running doWork with data: " + inputData, null);
            Object obj = inputData.f19473a.get("android_notif_id");
            int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
            JSONObject jSONObject = new JSONObject(inputData.b("json_payload"));
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            HashMap map = inputData.f19473a;
            Object obj2 = map.get("timestamp");
            if (obj2 instanceof Long) {
                jCurrentTimeMillis = ((Long) obj2).longValue();
            }
            Object obj3 = map.get("is_restoring");
            boolean zBooleanValue = obj3 instanceof Boolean ? ((Boolean) obj3).booleanValue() : false;
            Context applicationContext = getApplicationContext();
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            g2 g2Var = new g2(null, jSONObject, iIntValue);
            r2 r2Var = new r2(new i2(applicationContext, g2Var, jSONObject, zBooleanValue, lValueOf), g2Var);
            z3.b(y3.f12231j, "remoteNotificationReceivedHandler not setup, displaying normal OneSignal notification", null);
            r2Var.a(g2Var);
            return z1.n.a();
        } catch (JSONException e10) {
            z3.b(y3.f12230f, "Error occurred doing work for job with id: " + getId().toString(), null);
            e10.printStackTrace();
            return new z1.k();
        }
    }
}