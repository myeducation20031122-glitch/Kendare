package com.onesignal;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e3 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f11781e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static e3 f11782f;

    /* renamed from: d, reason: collision with root package name */
    public Long f11783d;

    public static e3 d() {
        if (f11782f == null) {
            synchronized (f11781e) {
                try {
                    if (f11782f == null) {
                        e3 e3Var = new e3();
                        e3Var.f11727a = false;
                        e3Var.f11783d = 0L;
                        f11782f = e3Var;
                    }
                } finally {
                }
            }
        }
        return f11782f;
    }

    public final void e(Context context, long j10) {
        synchronized (b1.f11726c) {
            try {
                if (this.f11783d.longValue() != 0) {
                    z3.f12275u.getClass();
                    if (System.currentTimeMillis() + j10 > this.f11783d.longValue()) {
                        z3.b(y3.f12234t, "OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.f11783d, null);
                        return;
                    }
                }
                if (j10 < 5000) {
                    j10 = 5000;
                }
                b(context, j10);
                z3.f12275u.getClass();
                this.f11783d = Long.valueOf(System.currentTimeMillis() + j10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}