package l4;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.hr;
import com.google.android.gms.internal.measurement.l9;
import io.reactivex.internal.fuseable.QueueFuseable;
import j4.i2;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import t5.d6;
import t5.f4;
import t5.j4;
import t5.w5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class z implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14642b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14644f;

    public /* synthetic */ z(int i10, Object obj, Object obj2) {
        this.f14642b = i10;
        this.f14643e = obj;
        this.f14644f = obj2;
    }

    public final x5.s a() {
        int i10 = this.f14642b;
        Object obj = this.f14643e;
        Object obj2 = this.f14644f;
        switch (i10) {
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    l9 l9Var = (l9) obj2;
                    i2 i2Var = ((r7.j) l9Var.f10882f).f16581b;
                    if (!zBooleanValue) {
                        i2Var.getClass();
                        throw new IllegalStateException("An invalid data collection token was used.");
                    }
                    ((x5.l) i2Var.f13745h).d(null);
                    Executor executor = (Executor) ((r7.j) l9Var.f10882f).f16583d.f13011b;
                    return ((x5.k) l9Var.f10881e).k(executor, new l9(15, this, executor));
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                l9 l9Var2 = (l9) obj2;
                r7.j jVar = (r7.j) l9Var2.f10882f;
                Iterator it = v7.b.k(((File) jVar.f16585f.f18510e).listFiles(r7.j.f16579p)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                v7.b bVar = ((r7.j) l9Var2.f10882f).f16590k.f16637b.f18507b;
                v7.a.a(v7.b.k(((File) bVar.f18512j).listFiles()));
                v7.a.a(v7.b.k(((File) bVar.f18513m).listFiles()));
                v7.a.a(v7.b.k(((File) bVar.f18514n).listFiles()));
                ((r7.j) l9Var2.f10882f).f16594o.d(null);
                return j4.i(null);
            default:
                return r7.m.a((r7.m) obj2, (a2.n) obj);
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SharedPreferences sharedPreferences;
        int i10 = this.f14642b;
        boolean z7 = false;
        Object obj = this.f14643e;
        Object obj2 = this.f14644f;
        switch (i10) {
            case 0:
                Context context = (Context) obj;
                Context context2 = (Context) obj2;
                if (context != null) {
                    b0.k("Attempting to read user agent from Google Play Services.");
                    sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
                } else {
                    b0.k("Attempting to read user agent from local cache.");
                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                    z7 = true;
                }
                String string = sharedPreferences.getString("user_agent", "");
                if (TextUtils.isEmpty(string)) {
                    b0.k("Reading user agent from WebSettings");
                    string = WebSettings.getDefaultUserAgent(context2);
                    if (z7) {
                        sharedPreferences.edit().putString("user_agent", string).apply();
                        b0.k("Persisting user agent.");
                    }
                }
                return string;
            case QueueFuseable.SYNC /* 1 */:
                WebSettings webSettings = (WebSettings) obj2;
                c0 c0Var = g0.f14590i;
                webSettings.setDatabasePath(((Context) obj).getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) j4.q.f13781d.f13784c.a(ge.f4861x0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            case 2:
                return ((r4.a) obj).getClickSignals((String) obj2);
            case 3:
                r4.b bVar = (r4.b) obj;
                hr hrVar = (hr) obj2;
                return bVar.s3(bVar.f16456f, hrVar.f5216b, hrVar.f5217e, hrVar.f5218f, hrVar.f5219j);
            case 4:
                f4 f4Var = (f4) obj2;
                f4Var.f17347b.a();
                t5.k kVar = f4Var.f17347b.f17666f;
                w5.F(kVar);
                return kVar.T((String) obj);
            case y4.g.INVALID_ACCOUNT /* 5 */:
                w5 w5Var = (w5) obj2;
                d6 d6Var = (d6) obj;
                String str = d6Var.f17307b;
                fc.t.k(str);
                t5.h hVarI = w5Var.I(str);
                t5.g gVar = t5.g.ANALYTICS_STORAGE;
                if (hVarI.f(gVar) && t5.h.b(d6Var.Y).f(gVar)) {
                    return w5Var.G(d6Var).F();
                }
                w5Var.c().Q.a("Analytics storage consent denied. Returning null app instance id");
                return null;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return a();
            case y4.g.NETWORK_ERROR /* 7 */:
                r7.j.a((r7.j) obj2, (String) obj);
                return null;
            default:
                return a();
        }
    }

    public /* synthetic */ z(Object obj, Object obj2, int i10) {
        this.f14642b = i10;
        this.f14644f = obj;
        this.f14643e = obj2;
    }
}