package x4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public boolean f18948b = false;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f18949e = new LinkedBlockingQueue();

    public final IBinder a(TimeUnit timeUnit) throws TimeoutException {
        fc.t.j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f18948b) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f18948b = true;
        IBinder iBinder = (IBinder) this.f18949e.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f18949e.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}