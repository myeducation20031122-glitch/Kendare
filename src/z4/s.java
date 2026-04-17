package z4;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final e0 f19699b;

    public s(e0 e0Var) {
        this.f19699b = e0Var;
    }

    @Override // z4.c0
    public final void b(Bundle bundle) {
    }

    @Override // z4.c0
    public final void c(int i10) {
        e0 e0Var = this.f19699b;
        e0Var.f();
        e0Var.Q.c(i10, false);
    }

    @Override // z4.c0
    public final void d() {
    }

    @Override // z4.c0
    public final void e() {
    }

    @Override // z4.c0
    public final p5.c f(p5.c cVar) throws DeadObjectException {
        e0 e0Var = this.f19699b;
        try {
            x0 x0Var = e0Var.P.f19612w;
            x0Var.f19728a.add(cVar);
            cVar.f2491e.set(x0Var.f19729b);
            y4.d dVar = cVar.f15943k;
            y4.c cVar2 = (y4.c) e0Var.P.f19604o.get(dVar);
            fc.t.l(cVar2, "Appropriate Api was not requested.");
            if (cVar2.a() || !e0Var.f19628t.containsKey(dVar)) {
                try {
                    cVar.r0(cVar2);
                } catch (DeadObjectException e10) {
                    cVar.s0(new Status(8, e10.getLocalizedMessage(), null, null));
                    throw e10;
                } catch (RemoteException e11) {
                    cVar.s0(new Status(8, e11.getLocalizedMessage(), null, null));
                }
            } else {
                cVar.s0(new Status(17, null, null, null));
            }
        } catch (DeadObjectException unused) {
            r rVar = new r(this, this, 0);
            z zVar = e0Var.f19626m;
            zVar.sendMessage(zVar.obtainMessage(1, rVar));
        }
        return cVar;
    }

    @Override // z4.c0
    public final boolean g() {
        e0 e0Var = this.f19699b;
        e0Var.P.getClass();
        e0Var.f();
        return true;
    }

    @Override // z4.c0
    public final void h(x4.b bVar, y4.e eVar, boolean z7) {
    }
}