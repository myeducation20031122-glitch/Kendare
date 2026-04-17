package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import ba.a;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class OPPOHomeBader implements a {

    /* renamed from: a, reason: collision with root package name */
    public int f12143a = -1;

    @Override // ba.a
    public final List a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // ba.a
    public final void b(Context context, ComponentName componentName, int i10) {
        if (this.f12143a == i10) {
            return;
        }
        this.f12143a = i10;
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }
}