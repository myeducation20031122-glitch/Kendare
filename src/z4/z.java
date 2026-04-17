package z4;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.ads.bu0;
import java.util.concurrent.locks.Lock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z extends bu0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj, Looper looper, int i10) {
        super(looper, 1);
        this.f19742b = i10;
        this.f19743c = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f19742b) {
            case 0:
                int i10 = message.what;
                Object obj = this.f19743c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        b0.j((b0) obj);
                        return;
                    }
                    Log.w("GoogleApiClientImpl", "Unknown message id: " + i10);
                    return;
                }
                b0 b0Var = (b0) obj;
                Lock lock = b0Var.f19591b;
                lock.lock();
                try {
                    if (b0Var.k()) {
                        b0Var.m();
                    }
                    return;
                } finally {
                    lock.unlock();
                }
            default:
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    Log.w("GACStateManager", "Unknown message id: " + i11);
                    return;
                }
                d0 d0Var = (d0) message.obj;
                e0 e0Var = (e0) this.f19743c;
                d0Var.getClass();
                e0Var.f19622b.lock();
                try {
                    if (e0Var.N == d0Var.f19620a) {
                        d0Var.a();
                    }
                    return;
                } finally {
                    e0Var.f19622b.unlock();
                }
        }
    }
}