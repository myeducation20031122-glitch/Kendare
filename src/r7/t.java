package r7;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.measurement.l9;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import m.s3;
import t5.j4;
import t7.f0;
import t7.g0;
import t7.h1;
import t7.o0;
import t7.q1;
import t7.y;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final n f16636a;

    /* renamed from: b, reason: collision with root package name */
    public final v7.a f16637b;

    /* renamed from: c, reason: collision with root package name */
    public final w7.a f16638c;

    /* renamed from: d, reason: collision with root package name */
    public final s7.c f16639d;

    /* renamed from: e, reason: collision with root package name */
    public final v7.b f16640e;

    public t(n nVar, v7.a aVar, w7.a aVar2, s7.c cVar, v7.b bVar) {
        this.f16636a = nVar;
        this.f16637b = aVar;
        this.f16638c = aVar2;
        this.f16639d = cVar;
        this.f16640e = bVar;
    }

    public static f0 a(f0 f0Var, s7.c cVar, v7.b bVar) {
        q.d dVar = new q.d(f0Var);
        String strE = cVar.f16876b.e();
        if (strE != null) {
            dVar.f16091m = new o0(strE);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        ArrayList arrayListC = c(((com.bumptech.glide.m) bVar.f18512j).e());
        ArrayList arrayListC2 = c(((com.bumptech.glide.m) bVar.f18513m).e());
        if (!arrayListC.isEmpty() || !arrayListC2.isEmpty()) {
            g0 g0Var = (g0) f0Var.f17801c;
            g0Var.getClass();
            h1 h1Var = g0Var.f17805a;
            Boolean bool = g0Var.f17808d;
            Integer numValueOf = Integer.valueOf(g0Var.f17809e);
            q1 q1Var = new q1(arrayListC);
            q1 q1Var2 = new q1(arrayListC2);
            String strConcat = h1Var == null ? " execution" : "";
            if (numValueOf == null) {
                strConcat = strConcat.concat(" uiOrientation");
            }
            if (!strConcat.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(strConcat));
            }
            dVar.f16089f = new g0(h1Var, q1Var, q1Var2, bool, numValueOf.intValue());
        }
        return dVar.c();
    }

    public static t b(Context context, r rVar, v7.b bVar, s3 s3Var, s7.c cVar, v7.b bVar2, g0.d dVar, a2.n nVar, l9 l9Var) {
        n nVar2 = new n(context, rVar, s3Var, dVar);
        v7.a aVar = new v7.a(bVar, nVar);
        u7.c cVar2 = w7.a.f18703b;
        r3.r.b(context);
        return new t(nVar2, aVar, new w7.a(new w7.b(r3.r.a().c(new p3.a(w7.a.f18704c, w7.a.f18705d)).a("FIREBASE_CRASHLYTICS_REPORT", new o3.c("json"), w7.a.f18706e), (x7.a) ((AtomicReference) nVar.f275u).get(), l9Var)), cVar, bVar2);
    }

    public static ArrayList c(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new y(str, str2));
        }
        Collections.sort(arrayList, new l0.b(1));
        return arrayList;
    }

    public final x5.s d(String str, Executor executor) {
        x5.l lVar;
        ArrayList arrayListB = this.f16637b.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                u7.c cVar = v7.a.f18503f;
                String strE = v7.a.e(file);
                cVar.getClass();
                arrayList.add(new a(u7.c.g(strE), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (str == null || str.equals(aVar.f16558b)) {
                w7.a aVar2 = this.f16638c;
                boolean z7 = str != null;
                w7.b bVar = aVar2.f18707a;
                synchronized (bVar.f18712e) {
                    try {
                        lVar = new x5.l();
                        if (z7) {
                            ((AtomicInteger) bVar.f18715h.f10881e).getAndIncrement();
                            if (bVar.f18712e.size() < bVar.f18711d) {
                                o7.c cVar2 = o7.c.f15807a;
                                cVar2.b("Enqueueing report: " + aVar.f16558b);
                                cVar2.b("Queue size: " + bVar.f18712e.size());
                                bVar.f18713f.execute(new l0.a(bVar, aVar, lVar));
                                cVar2.b("Closing task for report: " + aVar.f16558b);
                                lVar.d(aVar);
                            } else {
                                bVar.a();
                                String str2 = "Dropping report due to queue being full: " + aVar.f16558b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str2, null);
                                }
                                ((AtomicInteger) bVar.f18715h.f10882f).getAndIncrement();
                                lVar.d(aVar);
                            }
                        } else {
                            bVar.b(aVar, lVar);
                        }
                    } finally {
                    }
                }
                arrayList2.add(lVar.f19011a.e(executor, new e0.g(this, 12)));
            }
        }
        return j4.R(arrayList2);
    }
}