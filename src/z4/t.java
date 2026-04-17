package z4;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t implements a5.d {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f19703a;

    /* renamed from: b, reason: collision with root package name */
    public final y4.e f19704b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19705c;

    public t(y yVar, y4.e eVar, boolean z7) {
        this.f19703a = new WeakReference(yVar);
        this.f19704b = eVar;
        this.f19705c = z7;
    }

    @Override // a5.d
    public final void a(x4.b bVar) {
        y yVar = (y) this.f19703a.get();
        if (yVar == null) {
            return;
        }
        fc.t.m("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == yVar.f19730b.P.f19596g);
        Lock lock = yVar.f19731e;
        lock.lock();
        try {
            if (yVar.n(0)) {
                if (!bVar.l()) {
                    yVar.l(bVar, this.f19704b, this.f19705c);
                }
                if (yVar.o()) {
                    yVar.m();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}