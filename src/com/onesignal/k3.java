package com.onesignal;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k3 extends s {

    /* renamed from: f, reason: collision with root package name */
    public static final HashSet f11930f = new HashSet(Arrays.asList("getTags()", "setSMSNumber()", "setEmail()", "logoutSMSNumber()", "logoutEmail()", "syncHashedEmail()", "setExternalUserId()", "setLanguage()", "setSubscription()", "promptLocation()", "idsAvailable()", "sendTag()", "sendTags()", "setLocationShared()", "setDisableGMSMissingPrompt()", "setRequiresUserPrivacyConsent()", "unsubscribeWhenNotificationsAreDisabled()", "handleNotificationOpen()", "onAppLostFocus()", "sendOutcome()", "sendUniqueOutcome()", "sendOutcomeWithValue()", "removeGroupedNotifications()", "removeNotification()", "clearOneSignalNotifications()"));

    /* renamed from: e, reason: collision with root package name */
    public final f0 f11931e;

    public k3(f0 f0Var, l lVar) {
        super(lVar);
        this.f11931e = f0Var;
    }

    public final boolean f(String str) {
        return ((j4) this.f11931e.f11790b) == null && f11930f.contains(str);
    }
}