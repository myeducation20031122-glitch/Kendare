package z4;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x implements y4.k, y4.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f19726b;

    public /* synthetic */ x(y yVar) {
        this.f19726b = yVar;
    }

    @Override // z4.f
    public final void A(int i10) {
    }

    @Override // z4.f
    public final void T(Bundle bundle) {
        y yVar = this.f19726b;
        fc.t.k(yVar.U);
        u5.c cVar = yVar.N;
        fc.t.k(cVar);
        cVar.f(new w(yVar));
    }

    @Override // z4.n
    public final void x(x4.b bVar) {
        y yVar = this.f19726b;
        Lock lock = yVar.f19731e;
        Lock lock2 = yVar.f19731e;
        lock.lock();
        try {
            if (yVar.O && !bVar.h()) {
                yVar.a();
                yVar.m();
            } else {
                yVar.k(bVar);
            }
            lock2.unlock();
        } catch (Throwable th) {
            lock2.unlock();
            throw th;
        }
    }
}