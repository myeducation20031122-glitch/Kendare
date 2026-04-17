package n8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d0 implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final Context f15398b;

    /* renamed from: e, reason: collision with root package name */
    public final Intent f15399e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f15400f;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque f15401j;

    /* renamed from: m, reason: collision with root package name */
    public b0 f15402m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15403n;

    public d0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new n.c("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f15401j = new ArrayDeque();
        this.f15403n = false;
        Context applicationContext = context.getApplicationContext();
        this.f15398b = applicationContext;
        this.f15399e = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f15400f = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f15401j.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                b0 b0Var = this.f15402m;
                if (b0Var == null || !b0Var.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f15402m.a((c0) this.f15401j.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized x5.s b(Intent intent) {
        c0 c0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            c0Var = new c0(intent);
            ScheduledExecutorService scheduledExecutorService = this.f15400f;
            c0Var.f15395b.f19011a.a(scheduledExecutorService, new e0.g(scheduledExecutorService.schedule(new androidx.activity.d(c0Var, 16), 9000L, TimeUnit.MILLISECONDS), 16));
            this.f15401j.add(c0Var);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return c0Var.f15395b.f19011a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f15403n);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f15403n) {
            return;
        }
        this.f15403n = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (d5.a.b().a(this.f15398b, this.f15399e, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f15403n = false;
        while (true) {
            ArrayDeque arrayDeque = this.f15401j;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((c0) arrayDeque.poll()).f15395b.d(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f15403n = false;
            if (iBinder instanceof b0) {
                this.f15402m = (b0) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f15401j;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((c0) arrayDeque.poll()).f15395b.d(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}