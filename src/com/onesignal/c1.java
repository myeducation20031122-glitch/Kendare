package com.onesignal;

import java.util.TimerTask;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c1 extends TimerTask {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11741b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1 f11742e;

    public c1(e1 e1Var, String str) {
        this.f11742e = e1Var;
        this.f11741b = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        e1 e1Var = this.f11742e;
        e1Var.f11776b.remove(this.f11741b);
        e1Var.f11775a.a();
    }
}