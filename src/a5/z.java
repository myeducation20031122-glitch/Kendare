package a5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.ads.bu0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final y f424b;

    /* renamed from: u, reason: collision with root package name */
    public final bu0 f431u;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f425e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f426f = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f427j = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f428m = false;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicInteger f429n = new AtomicInteger(0);

    /* renamed from: t, reason: collision with root package name */
    public boolean f430t = false;

    /* renamed from: w, reason: collision with root package name */
    public final Object f432w = new Object();

    public z(Looper looper, d9.c cVar) {
        this.f424b = cVar;
        this.f431u = new bu0(looper, this, 1);
    }

    public final void a(y4.l lVar) {
        fc.t.k(lVar);
        synchronized (this.f432w) {
            try {
                if (this.f427j.contains(lVar)) {
                    Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(lVar) + " is already registered");
                } else {
                    this.f427j.add(lVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.wtf("GmsClientEvents", kc.r.d("Don't know how to handle message: ", i10), new Exception());
            return false;
        }
        y4.k kVar = (y4.k) message.obj;
        synchronized (this.f432w) {
            try {
                if (this.f428m && this.f424b.a() && this.f425e.contains(kVar)) {
                    kVar.T(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}