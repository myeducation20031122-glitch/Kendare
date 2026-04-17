package a5;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r0 implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f395b = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f396e = 2;

    /* renamed from: f, reason: collision with root package name */
    public boolean f397f;

    /* renamed from: j, reason: collision with root package name */
    public IBinder f398j;

    /* renamed from: m, reason: collision with root package name */
    public final p0 f399m;

    /* renamed from: n, reason: collision with root package name */
    public ComponentName f400n;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s0 f401t;

    public r0(s0 s0Var, p0 p0Var) {
        this.f401t = s0Var;
        this.f399m = p0Var;
    }

    public final void a(String str, Executor executor) {
        this.f396e = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(q0.s(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        try {
            s0 s0Var = this.f401t;
            d5.a aVar = s0Var.f410d;
            Context context = s0Var.f408b;
            boolean zD = aVar.d(context, str, this.f399m.a(context), this, 4225, executor);
            this.f397f = zD;
            if (zD) {
                this.f401t.f409c.sendMessageDelayed(this.f401t.f409c.obtainMessage(1, this.f399m), this.f401t.f412f);
            } else {
                this.f396e = 2;
                try {
                    s0 s0Var2 = this.f401t;
                    s0Var2.f410d.c(s0Var2.f408b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f401t.f407a) {
            try {
                this.f401t.f409c.removeMessages(1, this.f399m);
                this.f398j = iBinder;
                this.f400n = componentName;
                Iterator it = this.f395b.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f396e = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f401t.f407a) {
            try {
                this.f401t.f409c.removeMessages(1, this.f399m);
                this.f398j = null;
                this.f400n = componentName;
                Iterator it = this.f395b.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f396e = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}