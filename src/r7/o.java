package r7;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final p5.g f16618a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.n f16619b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f16620c;

    /* renamed from: d, reason: collision with root package name */
    public final o7.a f16621d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f16622e = new AtomicBoolean(false);

    public o(p5.g gVar, a2.n nVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, o7.a aVar) {
        this.f16618a = gVar;
        this.f16619b = nVar;
        this.f16620c = uncaughtExceptionHandler;
        this.f16621d = aVar;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!((o7.b) this.f16621d).b()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f16620c;
        AtomicBoolean atomicBoolean = this.f16622e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th)) {
                    this.f16618a.o(this.f16619b, thread, th);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                }
            }
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
            atomicBoolean.set(false);
        } catch (Throwable th2) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
            atomicBoolean.set(false);
            throw th2;
        }
    }
}