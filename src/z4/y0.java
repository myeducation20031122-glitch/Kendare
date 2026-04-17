package z4;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.fx;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y0 extends o0 {

    /* renamed from: b, reason: collision with root package name */
    public final m2.c f19739b;

    /* renamed from: c, reason: collision with root package name */
    public final x5.l f19740c;

    /* renamed from: d, reason: collision with root package name */
    public final z1.o f19741d;

    public y0(int i10, m2.c cVar, x5.l lVar, z1.o oVar) {
        super(i10);
        this.f19740c = lVar;
        this.f19739b = cVar;
        this.f19741d = oVar;
        if (i10 == 2 && cVar.f15084b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // z4.a1
    public final void a(Status status) {
        this.f19741d.getClass();
        this.f19740c.c(status.f2484f != null ? new y4.m(status) : new y4.f(status));
    }

    @Override // z4.a1
    public final void b(RuntimeException runtimeException) {
        this.f19740c.c(runtimeException);
    }

    @Override // z4.a1
    public final void c(i0 i0Var) throws DeadObjectException {
        x5.l lVar = this.f19740c;
        try {
            this.f19739b.d(i0Var.f19650e, lVar);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(a1.e(e11));
        } catch (RuntimeException e12) {
            lVar.c(e12);
        }
    }

    @Override // z4.a1
    public final void d(fx fxVar, boolean z7) {
        Boolean boolValueOf = Boolean.valueOf(z7);
        Map map = fxVar.f4470b;
        x5.l lVar = this.f19740c;
        map.put(lVar, boolValueOf);
        lVar.f19011a.b(new d3.d(fxVar, lVar, 19, 0));
    }

    @Override // z4.o0
    public final boolean f(i0 i0Var) {
        return this.f19739b.f15084b;
    }

    @Override // z4.o0
    public final x4.d[] g(i0 i0Var) {
        return (x4.d[]) this.f19739b.f15086d;
    }
}