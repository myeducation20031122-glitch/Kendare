package com.onesignal;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
class OSEmailSubscriptionChangedInternalObserver {
    public void changed(f1 f1Var) {
        b5 b5Var = new b5(z3.f12247a0, (f1) f1Var.clone(), 4);
        if (z3.f12249b0 == null) {
            z3.f12249b0 = new com.bumptech.glide.manager.t("onOSEmailSubscriptionChanged", true);
        }
        if (z3.f12249b0.h(b5Var)) {
            f1 f1Var2 = (f1) f1Var.clone();
            z3.f12247a0 = f1Var2;
            f1Var2.getClass();
            String str = h4.f11856a;
            h4.g(f1Var2.f11792e, str, "PREFS_ONESIGNAL_EMAIL_ID_LAST");
            h4.g(f1Var2.f11793f, str, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST");
        }
    }
}