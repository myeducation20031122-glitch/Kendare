package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class ADMMessageHandler extends ADMMessageHandlerBase {
    private static final int JOB_ID = 123891;

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public void onMessage(Intent intent) throws Throwable {
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        q3.M(applicationContext, extras, new a(this, extras, applicationContext));
    }

    public void onRegistered(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        z3.b(y3.f12232m, "ADM registration ID: " + str, null);
        l.g(str);
    }

    public void onRegistrationError(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        y3 y3Var = y3.f12230f;
        z3.b(y3Var, "ADM:onRegistrationError: " + str, null);
        if ("INVALID_SENDER".equals(str)) {
            z3.b(y3Var, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null);
        }
        l.g(null);
    }

    public void onUnregistered(String str) {
        z3.b(y3.f12232m, "ADM:onUnregistered: " + str, null);
    }
}