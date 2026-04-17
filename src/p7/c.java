package p7;

import a5.x;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements b, a {

    /* renamed from: b, reason: collision with root package name */
    public final x f16063b;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f16064e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16065f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public CountDownLatch f16066j;

    public c(x xVar, TimeUnit timeUnit) {
        this.f16063b = xVar;
        this.f16064e = timeUnit;
    }

    @Override // p7.a
    public final void h(Bundle bundle) {
        synchronized (this.f16065f) {
            try {
                o7.c cVar = o7.c.f15807a;
                cVar.c("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f16066j = new CountDownLatch(1);
                this.f16063b.h(bundle);
                cVar.c("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f16066j.await(500, this.f16064e)) {
                        cVar.c("App exception callback received from Analytics listener.");
                    } else {
                        cVar.d("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f16066j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p7.b
    public final void i(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f16066j;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}