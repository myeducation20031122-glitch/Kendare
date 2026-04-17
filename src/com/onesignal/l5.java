package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l5 extends HandlerThread {

    /* renamed from: b, reason: collision with root package name */
    public final int f11957b;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f11958e;

    /* renamed from: f, reason: collision with root package name */
    public int f11959f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m5 f11960j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(m5 m5Var, int i10) {
        super("OSH_NetworkHandlerThread_" + m5Var.f11984b);
        this.f11960j = m5Var;
        this.f11957b = i10;
        start();
        this.f11958e = new Handler(getLooper());
    }

    public final void a() {
        if (this.f11960j.f11985c) {
            synchronized (this.f11958e) {
                this.f11959f = 0;
                g0 g0Var = null;
                this.f11958e.removeCallbacksAndMessages(null);
                Handler handler = this.f11958e;
                if (this.f11957b == 0) {
                    g0Var = new g0(this, 7);
                }
                handler.postDelayed(g0Var, 5000L);
            }
        }
    }
}