package j4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.iy;
import com.google.android.gms.internal.ads.j5;
import com.google.android.gms.internal.ads.te;
import com.google.android.gms.internal.ads.wr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i2 {

    /* renamed from: i, reason: collision with root package name */
    public static i2 f13737i;

    /* renamed from: a, reason: collision with root package name */
    public final Object f13738a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13739b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13740c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13741d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13742e;

    /* renamed from: f, reason: collision with root package name */
    public Object f13743f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f13744g;

    /* renamed from: h, reason: collision with root package name */
    public Object f13745h;

    public i2() {
        this.f13738a = new Object();
        this.f13739b = false;
        this.f13740c = false;
        this.f13741d = new Object();
        this.f13744g = null;
        this.f13745h = new c4.p(-1, -1, null, new ArrayList());
        this.f13742e = new ArrayList();
    }

    public static i2 f() {
        i2 i2Var;
        synchronized (i2.class) {
            try {
                if (f13737i == null) {
                    f13737i = new i2();
                }
                i2Var = f13737i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2Var;
    }

    public static iy g(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ej ejVar = (ej) it.next();
            map.put(ejVar.f4039b, new te(ejVar.f4040e ? h4.a.f13195e : h4.a.f13194b, ejVar.f4042j, ejVar.f4041f));
        }
        return new iy(map, 5);
    }

    public final Boolean a(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e10);
        }
        Boolean boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        if (boolValueOf == null) {
            this.f13740c = false;
            return null;
        }
        this.f13740c = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolValueOf));
    }

    public final synchronized boolean b() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f13744g;
            zBooleanValue = bool != null ? bool.booleanValue() : ((i7.g) this.f13742e).g();
            c(zBooleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    public final void c(boolean z7) {
        String str = String.format("Crashlytics automatic data collection %s by %s.", z7 ? "ENABLED" : "DISABLED", this.f13744g == null ? "global Firebase setting" : this.f13740c ? "firebase_crashlytics_collection_enabled manifest flag" : "API");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public final void d(Context context) {
        if (((b1) this.f13743f) == null) {
            this.f13743f = (b1) new k(o.f13771f.f13773b, context).d(context, false);
        }
    }

    public final void e(c4.p pVar) {
        try {
            ((b1) this.f13743f).i1(new w2(pVar));
        } catch (RemoteException e10) {
            wr.e("Unable to set request configuration parcel.", e10);
        }
    }

    public final void h(Context context) {
        try {
            if (iy.f5528f == null) {
                iy.f5528f = new iy(7);
            }
            iy iyVar = iy.f5528f;
            int i10 = 1;
            Object obj = null;
            if (((AtomicBoolean) iyVar.f5530e).compareAndSet(false, true)) {
                new Thread(new j5(iyVar, context, obj, i10)).start();
            }
            ((b1) this.f13743f).zzk();
            ((b1) this.f13743f).s2(new h5.b(null), null);
        } catch (RemoteException e10) {
            wr.h("MobileAdsSettingManager initialization failed", e10);
        }
    }

    public i2(i7.g gVar) {
        Boolean boolValueOf;
        Object obj = new Object();
        this.f13738a = obj;
        this.f13743f = new x5.l();
        this.f13739b = false;
        this.f13740c = false;
        this.f13745h = new x5.l();
        gVar.a();
        Context context = gVar.f13427a;
        this.f13742e = gVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f13741d = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f13740c = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        this.f13744g = boolValueOf == null ? a(context) : boolValueOf;
        synchronized (obj) {
            try {
                if (b()) {
                    ((x5.l) this.f13743f).d(null);
                    this.f13739b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}