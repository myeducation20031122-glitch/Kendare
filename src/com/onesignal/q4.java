package com.onesignal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q4 extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f12082c;

    public q4(String str, String str2, Class cls) {
        this.f12080a = str;
        this.f12081b = str2;
        this.f12082c = cls;
    }

    @Override // com.onesignal.c
    public final void a(Activity activity) {
        if (activity.getClass().equals(PermissionsActivity.class)) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) PermissionsActivity.class);
        intent.setFlags(131072);
        intent.putExtra("INTENT_EXTRA_PERMISSION_TYPE", this.f12080a).putExtra("INTENT_EXTRA_ANDROID_PERMISSION_STRING", this.f12081b).putExtra("INTENT_EXTRA_CALLBACK_CLASS", this.f12082c.getName());
        activity.startActivity(intent);
        activity.overridePendingTransition(2130772020, 2130772021);
    }
}