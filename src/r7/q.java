package r7;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q extends b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16624b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f16625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f16626f = 2;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f16627j;

    public q(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f16624b = str;
        this.f16625e = executorService;
        this.f16627j = timeUnit;
    }

    @Override // r7.b
    public final void a() {
        String str = this.f16624b;
        ExecutorService executorService = this.f16625e;
        try {
            String str2 = "Executing shutdown hook for " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            executorService.shutdown();
            if (executorService.awaitTermination(this.f16626f, this.f16627j)) {
                return;
            }
            String str3 = str + " did not shut down in the allocated time. Requesting immediate shutdown.";
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            String str4 = String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str4, null);
            }
            executorService.shutdownNow();
        }
    }
}