package com.isprid.kendare;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.v0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.y3;
import com.onesignal.z3;
import fc.t;
import h1.b;
import i7.g;
import io.reactivex.internal.fuseable.QueueFuseable;
import j4.i2;
import java.io.File;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n7.c;
import n7.d;
import r7.m;
import x5.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/isprid/kendare/MyApplication;", "Landroid/app/Application;", "<init>", "()V", "n7/c", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class MyApplication extends Application {

    /* renamed from: b, reason: collision with root package name */
    public static final c f11640b = new c(10, 0);

    /* renamed from: e, reason: collision with root package name */
    public static FirebaseAnalytics f11641e;

    /* renamed from: f, reason: collision with root package name */
    public static MyApplication f11642f;

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context base) {
        ApplicationInfo applicationInfo;
        Intrinsics.f(base, "base");
        super.attachBaseContext(base);
        HashSet hashSet = b.f13167a;
        Log.i("MultiDex", "Installing application");
        try {
            if (b.f13168b) {
                Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
                return;
            }
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException e10) {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e10);
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            } else {
                b.b(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
                Log.i("MultiDex", "install done");
            }
        } catch (Exception e11) {
            Log.e("MultiDex", "MultiDex installation failure", e11);
            throw new RuntimeException("MultiDex installation failed (" + e11.getMessage() + ").");
        }
    }

    @Override // android.app.Application
    public final void onCreate() {
        int i10;
        Boolean boolA;
        super.onCreate();
        f11642f = this;
        y3 y3Var = y3.f12234t;
        y3 y3Var2 = y3.f12228b;
        z3.f12258g = y3Var;
        z3.f12256f = y3Var2;
        z3.y(this);
        z3.M("61a9d494-ef05-4a62-9c14-ae3db2d979ff");
        d dVar = (d) g.c().b(d.class);
        if (dVar == null) {
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        }
        m mVar = dVar.f15369a;
        Boolean bool = Boolean.TRUE;
        i2 i2Var = mVar.f16599b;
        synchronized (i2Var) {
            i10 = 0;
            if (bool != null) {
                try {
                    i2Var.f13740c = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bool != null) {
                boolA = bool;
            } else {
                g gVar = (g) i2Var.f13742e;
                gVar.a();
                boolA = i2Var.a(gVar.f13427a);
            }
            i2Var.f13744g = boolA;
            SharedPreferences.Editor editorEdit = ((SharedPreferences) i2Var.f13741d).edit();
            if (bool != null) {
                editorEdit.putBoolean("firebase_crashlytics_collection_enabled", true);
            } else {
                editorEdit.remove("firebase_crashlytics_collection_enabled");
            }
            editorEdit.apply();
            synchronized (i2Var.f13738a) {
                try {
                    if (i2Var.b()) {
                        if (!i2Var.f13739b) {
                            ((l) i2Var.f13743f).d(null);
                            i2Var.f13739b = true;
                        }
                    } else if (i2Var.f13739b) {
                        i2Var.f13743f = new l();
                        i2Var.f13739b = false;
                    }
                } finally {
                }
            }
        }
        t.v(this);
        t.y(this);
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        Intrinsics.e(firebaseAnalytics, "getInstance(this)");
        f11641e = firebaseAnalytics;
        j1 j1Var = firebaseAnalytics.f11624a;
        j1Var.getClass();
        j1Var.b(new u0(j1Var, bool, i10));
        FirebaseAnalytics firebaseAnalytics2 = f11641e;
        if (firebaseAnalytics2 == null) {
            Intrinsics.n("firebaseAnalytics");
            throw null;
        }
        j1 j1Var2 = firebaseAnalytics2.f11624a;
        j1Var2.getClass();
        j1Var2.b(new v0(j1Var2));
    }
}