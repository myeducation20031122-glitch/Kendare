package com.onesignal;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
class OSSMSSubscriptionChangedInternalObserver {
    public void changed(a3 a3Var) {
        b5 b5Var = new b5(z3.f12253d0, (a3) a3Var.clone(), 12);
        if (z3.f12255e0 == null) {
            z3.f12255e0 = new com.bumptech.glide.manager.t("onSMSSubscriptionChanged", true);
        }
        if (z3.f12255e0.h(b5Var)) {
            a3 a3Var2 = (a3) a3Var.clone();
            z3.f12253d0 = a3Var2;
            a3Var2.getClass();
            String str = h4.f11856a;
            h4.g(a3Var2.f11714e, str, "PREFS_OS_SMS_ID_LAST");
            h4.g(a3Var2.f11715f, str, "PREFS_OS_SMS_NUMBER_LAST");
        }
    }
}