package com.onesignal;

import com.amazon.device.iap.PurchasingService;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a5 f12236b;

    public y4(a5 a5Var) {
        this.f12236b = a5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a5 a5Var = this.f12236b;
        PurchasingService.registerListener(a5.a(a5Var), a5.b(a5Var));
    }
}