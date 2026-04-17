package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final n2 f11891a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11892b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11893c = true;

    public i2(Context context, g2 g2Var, JSONObject jSONObject, boolean z7, Long l10) {
        this.f11892b = z7;
        n2 n2Var = new n2(context);
        n2Var.f12013c = jSONObject;
        n2Var.f12016f = l10;
        n2Var.f12014d = z7;
        n2Var.b(g2Var);
        this.f11891a = n2Var;
    }

    public static void a(Context context) throws IllegalAccessException, InstantiationException {
        Bundle bundleC = OSUtils.c(context);
        String string = bundleC != null ? bundleC.getString("com.onesignal.NotificationServiceExtension") : null;
        y3 y3Var = y3.f12234t;
        if (string == null) {
            z3.b(y3Var, "No class found, not setting up OSRemoteNotificationReceivedHandler", null);
            return;
        }
        z3.b(y3Var, "Found class: " + string + ", attempting to call constructor", null);
        try {
            Class.forName(string).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            e10.printStackTrace();
        }
    }

    public final String toString() {
        return "OSNotificationController{notificationJob=" + this.f11891a + ", isRestoring=" + this.f11892b + ", isBackgroundLogic=" + this.f11893c + '}';
    }

    public i2(n2 n2Var, boolean z7) {
        this.f11892b = z7;
        this.f11891a = n2Var;
    }
}