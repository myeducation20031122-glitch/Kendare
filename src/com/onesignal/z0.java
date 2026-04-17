package com.onesignal;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z0 extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f12238b = new z0(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ApplicationInfo applicationInfoH;
        return Boolean.valueOf(Build.VERSION.SDK_INT > 32 && (applicationInfoH = l.h(z3.f12248b)) != null && applicationInfoH.targetSdkVersion > 32);
    }
}