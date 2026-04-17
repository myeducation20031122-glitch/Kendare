package com.onesignal;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
class OSSubscriptionChangedInternalObserver {
    public void changed(OSSubscriptionState oSSubscriptionState) {
        b5 b5Var = new b5(z3.X, (OSSubscriptionState) oSSubscriptionState.clone(), 13);
        if (z3.Y == null) {
            z3.Y = new com.bumptech.glide.manager.t("onOSSubscriptionChanged", true);
        }
        if (z3.Y.h(b5Var)) {
            OSSubscriptionState oSSubscriptionState2 = (OSSubscriptionState) oSSubscriptionState.clone();
            z3.X = oSSubscriptionState2;
            oSSubscriptionState2.getClass();
            String str = h4.f11856a;
            h4.h(str, "ONESIGNAL_SUBSCRIPTION_LAST", oSSubscriptionState2.f11697m);
            h4.g(oSSubscriptionState2.f11694e, str, "ONESIGNAL_PLAYER_ID_LAST");
            h4.g(oSSubscriptionState2.f11695f, str, "ONESIGNAL_PUSH_TOKEN_LAST");
            h4.h(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", oSSubscriptionState2.f11696j);
        }
    }
}