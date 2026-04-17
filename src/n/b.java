package n;

import android.os.Looper;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends c7.b {

    /* renamed from: d, reason: collision with root package name */
    public static volatile b f15242d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f15243e = new a(1);

    /* renamed from: c, reason: collision with root package name */
    public final e f15244c = new e();

    public static b p() {
        if (f15242d != null) {
            return f15242d;
        }
        synchronized (b.class) {
            try {
                if (f15242d == null) {
                    f15242d = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f15242d;
    }

    public final void q(Runnable runnable) {
        e eVar = this.f15244c;
        if (eVar.f15250e == null) {
            synchronized (eVar.f15248c) {
                try {
                    if (eVar.f15250e == null) {
                        eVar.f15250e = e.p(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        eVar.f15250e.post(runnable);
    }
}