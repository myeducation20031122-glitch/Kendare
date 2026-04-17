package w4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import fc.t;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n8.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements ServiceConnection {

    /* renamed from: f, reason: collision with root package name */
    public d3.d f18664f;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f18667n;

    /* renamed from: b, reason: collision with root package name */
    public int f18662b = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f18663e = new Messenger(new m5.b(Looper.getMainLooper(), new b3.g(this, 1)));

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque f18665j = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f18666m = new SparseArray();

    public g(j jVar) {
        this.f18667n = jVar;
    }

    public final synchronized void a(int i10, String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
            }
            int i10 = this.f18662b;
            if (i10 == 0) {
                throw new IllegalStateException();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f18662b = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f18662b = 4;
            d5.a.b().c((Context) this.f18667n.f18676c, this);
            r rVar = new r(str, securityException);
            Iterator it = this.f18665j.iterator();
            while (it.hasNext()) {
                ((i) it.next()).a(rVar);
            }
            this.f18665j.clear();
            for (int i11 = 0; i11 < this.f18666m.size(); i11++) {
                ((i) this.f18666m.valueAt(i11)).a(rVar);
            }
            this.f18666m.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f18662b == 2 && this.f18665j.isEmpty() && this.f18666m.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f18662b = 3;
                d5.a.b().c((Context) this.f18667n.f18676c, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(h hVar) {
        int i10 = this.f18662b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f18665j.add(hVar);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f18665j.add(hVar);
            ((ScheduledExecutorService) this.f18667n.f18677d).execute(new f(this, 1));
            return true;
        }
        this.f18665j.add(hVar);
        t.n(this.f18662b == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f18662b = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (d5.a.b().a((Context) this.f18667n.f18676c, intent, this, 1)) {
                ((ScheduledExecutorService) this.f18667n.f18677d).schedule(new f(this, 2), 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b("Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f18667n.f18677d).execute(new m.k(this, iBinder, 26));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f18667n.f18677d).execute(new f(this, 0));
    }
}