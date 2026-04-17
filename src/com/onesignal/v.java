package com.onesignal;

import android.location.Location;
import android.os.Handler;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class v extends o0 {

    /* renamed from: j, reason: collision with root package name */
    public static b5 f12196j;

    /* renamed from: k, reason: collision with root package name */
    public static u f12197k;

    public static void c() {
        synchronized (o0.f12033d) {
            b5 b5Var = f12196j;
            if (b5Var != null) {
                try {
                    ((Class) b5Var.f11739e).getMethod("disconnect", new Class[0]).invoke((GoogleApiClient) b5Var.f11740f, new Object[0]);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                f12196j = null;
            } else {
                f12196j = null;
            }
        }
    }

    public static void g() {
        synchronized (o0.f12033d) {
            try {
                z3.b(y3.f12233n, "GMSLocationController onFocusChange!", null);
                b5 b5Var = f12196j;
                if (b5Var != null && ((GoogleApiClient) b5Var.f11740f).g()) {
                    b5 b5Var2 = f12196j;
                    if (b5Var2 != null) {
                        GoogleApiClient googleApiClient = (GoogleApiClient) b5Var2.f11740f;
                        if (f12197k != null) {
                            w2.k kVar = r5.e.f16546b;
                            u uVar = f12197k;
                            kVar.getClass();
                            googleApiClient.d(new p5.b(googleApiClient, uVar));
                        }
                        f12197k = new u(googleApiClient);
                    }
                }
            } finally {
            }
        }
    }

    public static void j() {
        Location location;
        if (o0.f12035f != null) {
            return;
        }
        synchronized (o0.f12033d) {
            try {
                Thread thread = new Thread(new a0(3), "OS_GMS_LOCATION_FALLBACK");
                o0.f12035f = thread;
                thread.start();
                if (f12196j == null || (location = o0.f12037h) == null) {
                    t tVar = new t();
                    y4.j jVar = new y4.j(o0.f12036g);
                    y4.e eVar = r5.e.f16545a;
                    fc.t.l(eVar, "Api must not be null");
                    jVar.f19256g.put(eVar, null);
                    fc.t.l(eVar.f19235a, "Base client builder must not be null");
                    List listEmptyList = Collections.emptyList();
                    jVar.f19251b.addAll(listEmptyList);
                    jVar.f19250a.addAll(listEmptyList);
                    jVar.f19261l.add(tVar);
                    jVar.f19262m.add(tVar);
                    Handler handler = o0.e().f11946b;
                    fc.t.l(handler, "Handler must not be null");
                    jVar.f19258i = handler.getLooper();
                    b5 b5Var = new b5(jVar.a());
                    f12196j = b5Var;
                    try {
                        ((Class) b5Var.f11739e).getMethod("connect", new Class[0]).invoke((GoogleApiClient) b5Var.f11740f, new Object[0]);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } else {
                    o0.b(location);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}