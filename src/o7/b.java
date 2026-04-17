package o7;

import a0.h;
import android.util.Log;
import e0.g;
import java.util.concurrent.atomic.AtomicReference;
import kc.r;
import m7.q;
import t7.r0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements a {

    /* renamed from: c, reason: collision with root package name */
    public static final q6.b f15804c = new q6.b((r) null);

    /* renamed from: a, reason: collision with root package name */
    public final i8.b f15805a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f15806b = new AtomicReference(null);

    public b(i8.b bVar) {
        this.f15805a = bVar;
        ((q) bVar).a(new g(this, 11));
    }

    public final q6.b a(String str) {
        a aVar = (a) this.f15806b.get();
        return aVar == null ? f15804c : ((b) aVar).a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f15806b.get();
        return aVar != null && ((b) aVar).b();
    }

    public final boolean c(String str) {
        a aVar = (a) this.f15806b.get();
        return aVar != null && ((b) aVar).c(str);
    }

    public final void d(String str, String str2, long j10, r0 r0Var) {
        String strV = h.v("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strV, null);
        }
        ((q) this.f15805a).a(new w3.h(str, str2, j10, r0Var));
    }
}