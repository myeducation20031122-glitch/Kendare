package com.onesignal;

import android.app.Activity;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n3 extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f12017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f12018b;

    public n3(o1 o1Var, e eVar) {
        this.f12018b = o1Var;
        this.f12017a = eVar;
    }

    @Override // com.onesignal.c
    public final void a(Activity activity) {
        o1 o1Var = this.f12018b;
        String str = (String) o1Var.f12040e;
        this.f12017a.getClass();
        e.f11766d.remove(str);
        boolean zE = o3.e(activity);
        Runnable runnable = (Runnable) o1Var.f12041f;
        if (zE) {
            runnable.run();
        } else {
            o3.a(activity, runnable);
        }
    }
}