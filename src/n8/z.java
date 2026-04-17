package n8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f15468n = new Object();

    /* renamed from: t, reason: collision with root package name */
    public static Boolean f15469t;

    /* renamed from: u, reason: collision with root package name */
    public static Boolean f15470u;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15471b;

    /* renamed from: e, reason: collision with root package name */
    public final com.android.volley.toolbox.e f15472e;

    /* renamed from: f, reason: collision with root package name */
    public final PowerManager.WakeLock f15473f;

    /* renamed from: j, reason: collision with root package name */
    public final x f15474j;

    /* renamed from: m, reason: collision with root package name */
    public final long f15475m;

    public z(x xVar, Context context, com.android.volley.toolbox.e eVar, long j10) {
        this.f15474j = xVar;
        this.f15471b = context;
        this.f15475m = j10;
        this.f15472e = eVar;
        this.f15473f = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f15468n) {
            try {
                Boolean bool = f15470u;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f15470u = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z7 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z7 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z7;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (f15468n) {
            try {
                Boolean bool = f15469t;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f15469t = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean d() {
        boolean z7;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f15471b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z7 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f15474j;
        Context context = this.f15471b;
        boolean zC = c(context);
        PowerManager.WakeLock wakeLock = this.f15473f;
        if (zC) {
            wakeLock.acquire(f.f15405a);
        }
        try {
            try {
                synchronized (xVar) {
                    xVar.f15464g = true;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                xVar.f(false);
                if (!c(context)) {
                    return;
                }
            }
            if (!this.f15472e.g()) {
                xVar.f(false);
                if (c(context)) {
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (a(context) && !d()) {
                new y(this, this).a();
                if (c(context)) {
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (xVar.g()) {
                xVar.f(false);
            } else {
                xVar.h(this.f15475m);
            }
            if (!c(context)) {
                return;
            }
            try {
                wakeLock.release();
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}