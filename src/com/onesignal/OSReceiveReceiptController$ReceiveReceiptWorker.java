package com.onesignal;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class OSReceiveReceiptController$ReceiveReceiptWorker extends Worker {
    public OSReceiveReceiptController$ReceiveReceiptWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final z1.n doWork() throws JSONException {
        Integer numValueOf;
        String strB = getInputData().b("os_notification_id");
        String str = z3.f12252d;
        String strQ = (str == null || str.isEmpty()) ? z3.q(z3.f12248b) : z3.f12252d;
        String strS = z3.s();
        try {
            numValueOf = Integer.valueOf(OSUtils.b());
        } catch (NullPointerException e10) {
            e10.printStackTrace();
            numValueOf = null;
        }
        z3.b(y3.f12233n, "ReceiveReceiptWorker: Device Type is: " + numValueOf, null);
        int i10 = 0;
        y2 y2Var = new y2(i10, this, strB);
        try {
            JSONObject jSONObjectPut = new JSONObject().put("app_id", strQ).put("player_id", strS);
            if (numValueOf != null) {
                jSONObjectPut.put("device_type", numValueOf);
            }
            OSUtils.v(new Thread(new l4("notifications/" + strB + "/report_received", jSONObjectPut, y2Var, i10), "OS_REST_ASYNC_PUT"));
        } catch (JSONException e11) {
            z3.b(y3.f12230f, "Generating direct receive receipt:JSON Failed.", e11);
        }
        return z1.n.a();
    }
}