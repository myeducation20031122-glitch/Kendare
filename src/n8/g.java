package n8;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class g extends Service {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f15406n = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f15407b;

    /* renamed from: e, reason: collision with root package name */
    public b0 f15408e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15409f;

    /* renamed from: j, reason: collision with root package name */
    public int f15410j;

    /* renamed from: m, reason: collision with root package name */
    public int f15411m;

    public g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new n.c("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f15407b = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f15409f = new Object();
        this.f15411m = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            a0.b(intent);
        }
        synchronized (this.f15409f) {
            try {
                int i10 = this.f15411m - 1;
                this.f15411m = i10;
                if (i10 == 0) {
                    stopSelfResult(this.f15410j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f15408e == null) {
                this.f15408e = new b0(new a5.x(this, 14));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f15408e;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f15407b.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        int i12;
        synchronized (this.f15409f) {
            this.f15410j = i11;
            i12 = 1;
            this.f15411m++;
        }
        Intent intent2 = (Intent) ((Queue) s.d().f15438j).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        x5.l lVar = new x5.l();
        this.f15407b.execute(new androidx.emoji2.text.m(this, intent2, lVar, i12));
        x5.s sVar = lVar.f19011a;
        if (sVar.i()) {
            a(intent);
            return 2;
        }
        sVar.a(new n.a(6), new w3.i(4, this, intent));
        return 3;
    }
}