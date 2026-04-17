package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g4 extends HandlerThread {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f11838j = 0;

    /* renamed from: b, reason: collision with root package name */
    public Handler f11839b;

    /* renamed from: e, reason: collision with root package name */
    public long f11840e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11841f;

    public final synchronized void a() {
        try {
            Handler handler = this.f11839b;
            if (handler == null) {
                return;
            }
            handler.removeCallbacksAndMessages(null);
            if (this.f11840e == 0) {
                z3.f12275u.getClass();
                this.f11840e = System.currentTimeMillis();
            }
            long j10 = this.f11840e;
            z3.f12275u.getClass();
            long jCurrentTimeMillis = (j10 - System.currentTimeMillis()) + 200;
            this.f11839b.postDelayed(new g0(this, 4), jCurrentTimeMillis);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        this.f11839b = new Handler(getLooper());
        a();
    }
}