package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l3 extends HandlerThread {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f11950e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static l3 f11951f;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f11952b;

    public l3() {
        super("com.onesignal.l3");
        start();
        this.f11952b = new Handler(getLooper());
    }

    public static l3 b() {
        if (f11951f == null) {
            synchronized (f11950e) {
                try {
                    if (f11951f == null) {
                        f11951f = new l3();
                    }
                } finally {
                }
            }
        }
        return f11951f;
    }

    public final void a(Runnable runnable) {
        synchronized (f11950e) {
            z3.b(y3.f12233n, "Running destroyTimeout with runnable: " + runnable.toString(), null);
            this.f11952b.removeCallbacks(runnable);
        }
    }

    public final void c(Runnable runnable, long j10) {
        synchronized (f11950e) {
            a(runnable);
            z3.b(y3.f12233n, "Running startTimeout with timeout: " + j10 + " and runnable: " + runnable.toString(), null);
            this.f11952b.postDelayed(runnable, j10);
        }
    }
}