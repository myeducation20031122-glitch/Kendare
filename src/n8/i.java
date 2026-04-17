package n8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import java.util.Queue;
import java.util.concurrent.Callable;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f15414c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static d0 f15415d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15416a;

    /* renamed from: b, reason: collision with root package name */
    public final n.a f15417b = new n.a(7);

    public i(Context context) {
        this.f15416a = context;
    }

    public static x5.s a(Context context, Intent intent) {
        d0 d0Var;
        int i10 = 3;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f15414c) {
            try {
                if (f15415d == null) {
                    f15415d = new d0(context);
                }
                d0Var = f15415d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d0Var.b(intent).e(new n.a(8), new u7.a(i10));
    }

    public final x5.s b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zQ = o5.y.q();
        final Context context = this.f15416a;
        boolean z7 = zQ && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z10 = (intent.getFlags() & 268435456) != 0;
        if (z7 && !z10) {
            return a(context, intent);
        }
        Callable callable = new Callable() { // from class: n8.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                String str3;
                int i10;
                ComponentName componentNameStartService;
                Context context2 = context;
                Intent intent2 = intent;
                s sVarD = s.d();
                sVarD.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((Queue) sVarD.f15438j).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (sVarD) {
                    try {
                        Object obj = sVarD.f15435b;
                        if (((String) obj) != null) {
                            str = (String) obj;
                        } else {
                            ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        str3 = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        str3 = serviceInfo.name;
                                    }
                                    sVarD.f15435b = str3;
                                    str = (String) sVarD.f15435b;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (sVarD.g(context2)) {
                        componentNameStartService = a0.c(context2, intent3);
                    } else {
                        componentNameStartService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = 404;
                    } else {
                        i10 = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i10 = 402;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i10 = 401;
                }
                return Integer.valueOf(i10);
            }
        };
        n.a aVar = this.f15417b;
        return j4.c(callable, aVar).f(aVar, new w3.i(5, context, intent));
    }
}