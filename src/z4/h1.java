package z4;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h1 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f19648b;

    public /* synthetic */ h1(p pVar, int i10) {
        this.f19647a = i10;
        this.f19648b = pVar;
    }

    @Override // z4.n0
    public final void a(Bundle bundle) {
        x4.b bVar = x4.b.f18950m;
        int i10 = this.f19647a;
        p pVar = this.f19648b;
        switch (i10) {
            case 0:
                pVar.O.lock();
                try {
                    Bundle bundle2 = pVar.f19686u;
                    if (bundle2 == null) {
                        pVar.f19686u = bundle;
                    } else if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    pVar.f19687w = bVar;
                    p.i(pVar);
                    return;
                } finally {
                }
            default:
                pVar.O.lock();
                try {
                    pVar.M = bVar;
                    p.i(pVar);
                    return;
                } finally {
                }
        }
    }

    @Override // z4.n0
    public final void b(x4.b bVar) {
        int i10 = this.f19647a;
        p pVar = this.f19648b;
        switch (i10) {
            case 0:
                pVar.O.lock();
                try {
                    pVar.f19687w = bVar;
                    p.i(pVar);
                    return;
                } finally {
                }
            default:
                pVar.O.lock();
                try {
                    pVar.M = bVar;
                    p.i(pVar);
                    return;
                } finally {
                }
        }
    }

    @Override // z4.n0
    public final void c(int i10, boolean z7) {
        Lock lock;
        x4.b bVar;
        int i11 = this.f19647a;
        p pVar = this.f19648b;
        switch (i11) {
            case 0:
                lock = pVar.O;
                lock.lock();
                try {
                    if (pVar.N || (bVar = pVar.M) == null || !bVar.l()) {
                        pVar.N = false;
                        p.h(pVar, i10, z7);
                    } else {
                        pVar.N = true;
                        pVar.f19682j.A(i10);
                    }
                    return;
                } finally {
                    lock.unlock();
                }
            default:
                lock = pVar.O;
                lock.lock();
                try {
                    if (pVar.N) {
                        pVar.N = false;
                        p.h(pVar, i10, z7);
                    } else {
                        pVar.N = true;
                        pVar.f19681f.A(i10);
                    }
                    return;
                } finally {
                    lock.unlock();
                }
        }
    }
}