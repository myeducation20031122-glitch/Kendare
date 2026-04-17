package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class FCMIntentService extends IntentService {
    public FCMIntentService() {
        super("FCMIntentService");
        setIntentRedelivery(true);
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) throws Throwable {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        z3.y(this);
        q3.M(this, extras, new b(this, intent));
    }
}