package r7;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.measurement.l9;
import j4.i2;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import t5.j4;
import t5.n5;
import z4.u0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16598a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f16599b;

    /* renamed from: c, reason: collision with root package name */
    public final l9 f16600c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16601d;

    /* renamed from: e, reason: collision with root package name */
    public l9 f16602e;

    /* renamed from: f, reason: collision with root package name */
    public l9 f16603f;

    /* renamed from: g, reason: collision with root package name */
    public j f16604g;

    /* renamed from: h, reason: collision with root package name */
    public final r f16605h;

    /* renamed from: i, reason: collision with root package name */
    public final v7.b f16606i;

    /* renamed from: j, reason: collision with root package name */
    public final q7.a f16607j;

    /* renamed from: k, reason: collision with root package name */
    public final p7.a f16608k;

    /* renamed from: l, reason: collision with root package name */
    public final ExecutorService f16609l;

    /* renamed from: m, reason: collision with root package name */
    public final g2.h f16610m;

    /* renamed from: n, reason: collision with root package name */
    public final o7.a f16611n;

    public m(i7.g gVar, r rVar, o7.b bVar, i2 i2Var, n7.a aVar, n7.a aVar2, v7.b bVar2, ExecutorService executorService) {
        this.f16599b = i2Var;
        gVar.a();
        this.f16598a = gVar.f13427a;
        this.f16605h = rVar;
        this.f16611n = bVar;
        this.f16607j = aVar;
        this.f16608k = aVar2;
        this.f16609l = executorService;
        this.f16606i = bVar2;
        g2.h hVar = new g2.h();
        hVar.f13012e = j4.i(null);
        hVar.f13013f = new Object();
        hVar.f13014j = new ThreadLocal();
        hVar.f13011b = executorService;
        executorService.execute(new n5(hVar, 5));
        this.f16610m = hVar;
        this.f16601d = System.currentTimeMillis();
        this.f16600c = new l9(18);
    }

    public static x5.s a(m mVar, a2.n nVar) throws IOException {
        x5.s sVarH;
        l lVar;
        g2.h hVar = mVar.f16610m;
        g2.h hVar2 = mVar.f16610m;
        if (!Boolean.TRUE.equals(((ThreadLocal) hVar.f13014j).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        mVar.f16602e.f();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        int i10 = 0;
        try {
            try {
                mVar.f16607j.b(new k(mVar));
                if (((x7.a) ((AtomicReference) nVar.f275u).get()).f19095b.f15099a) {
                    if (!mVar.f16604g.d(nVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    sVarH = mVar.f16604g.e(((x5.l) ((AtomicReference) nVar.f276w).get()).f19011a);
                    lVar = new l(mVar, i10);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    sVarH = j4.h(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    lVar = new l(mVar, i10);
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                sVarH = j4.h(e10);
                lVar = new l(mVar, i10);
            }
            hVar2.l(lVar);
            return sVarH;
        } catch (Throwable th) {
            hVar2.l(new l(mVar, i10));
            throw th;
        }
    }

    public final void b(a2.n nVar) throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        Future<?> futureSubmit = this.f16609l.submit(new u0(22, this, nVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            str = "Crashlytics was interrupted during initialization.";
            Log.e("FirebaseCrashlytics", str, e);
        } catch (ExecutionException e11) {
            e = e11;
            str = "Crashlytics encountered a problem during initialization.";
            Log.e("FirebaseCrashlytics", str, e);
        } catch (TimeoutException e12) {
            e = e12;
            str = "Crashlytics timed out during initialization.";
            Log.e("FirebaseCrashlytics", str, e);
        }
    }
}