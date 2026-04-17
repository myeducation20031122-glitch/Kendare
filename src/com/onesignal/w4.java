package com.onesignal;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w4 implements s4 {
    @Override // com.onesignal.s4
    public final void a(Context context, String str, l lVar) {
        new Thread(new v4(this, context, lVar), "OS_HMS_GET_TOKEN").start();
    }

    public final synchronized void c(Context context, l lVar) {
        if (!OSUtils.g()) {
            lVar.getClass();
            l.c(-28, null);
            return;
        }
        String token = HmsInstanceId.getInstance(context).getToken(AGConnectServicesConfig.fromContext(context).getString("client/app_id"), "HCM");
        if (TextUtils.isEmpty(token)) {
            try {
                Thread.sleep(30000L);
            } catch (InterruptedException unused) {
            }
            z3.b(y3.f12230f, "HmsMessageServiceOneSignal.onNewToken timed out.", null);
            lVar.getClass();
            l.c(-25, null);
        } else {
            z3.a(y3.f12232m, "Device registered for HMS, push token = " + token);
            lVar.getClass();
            l.c(1, token);
        }
    }
}