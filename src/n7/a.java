package n7;

import a5.x;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.l9;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p5.g;
import r7.k;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class a implements q7.a, p7.a, i8.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f15363b;

    public /* synthetic */ a(b bVar) {
        this.f15363b = bVar;
    }

    @Override // q7.a
    public final void b(k kVar) {
        b bVar = this.f15363b;
        synchronized (bVar) {
            try {
                if (bVar.f15365b instanceof q7.b) {
                    bVar.f15366c.add(kVar);
                }
                bVar.f15365b.b(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i8.a
    public final void d(i8.c cVar) {
        b bVar = this.f15363b;
        bVar.getClass();
        o7.c cVar2 = o7.c.f15807a;
        cVar2.b("AnalyticsConnector now available.");
        k7.a aVar = (k7.a) cVar.get();
        x xVar = new x(aVar, 12);
        l9 l9Var = new l9(12, 0);
        k7.b bVar2 = (k7.b) aVar;
        l9 l9VarB = bVar2.b(l9Var, "clx");
        if (l9VarB == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            l9 l9VarB2 = bVar2.b(l9Var, "crash");
            if (l9VarB2 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            l9VarB = l9VarB2;
        }
        if (l9VarB == null) {
            cVar2.d("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        cVar2.b("Registered Firebase Analytics listener.");
        g gVar = new g(11);
        p7.c cVar3 = new p7.c(xVar, TimeUnit.MILLISECONDS);
        synchronized (bVar) {
            try {
                Iterator it = bVar.f15366c.iterator();
                while (it.hasNext()) {
                    gVar.b((k) it.next());
                }
                l9Var.f10882f = gVar;
                l9Var.f10881e = cVar3;
                bVar.f15365b = gVar;
                bVar.f15364a = cVar3;
            } finally {
            }
        }
    }

    @Override // p7.a
    public final void h(Bundle bundle) {
        this.f15363b.f15364a.h(bundle);
    }
}