package z4;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.ic1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z0 extends o0 {

    /* renamed from: b, reason: collision with root package name */
    public final x5.l f19744b;

    /* renamed from: c, reason: collision with root package name */
    public final k f19745c;

    public z0(k kVar, x5.l lVar) {
        super(4);
        this.f19744b = lVar;
        this.f19745c = kVar;
    }

    @Override // z4.a1
    public final void a(Status status) {
        this.f19744b.c(new y4.f(status));
    }

    @Override // z4.a1
    public final void b(RuntimeException runtimeException) {
        this.f19744b.c(runtimeException);
    }

    @Override // z4.a1
    public final void c(i0 i0Var) throws DeadObjectException {
        try {
            h(i0Var);
        } catch (DeadObjectException e10) {
            a(a1.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(a1.e(e11));
        } catch (RuntimeException e12) {
            this.f19744b.c(e12);
        }
    }

    @Override // z4.a1
    public final /* bridge */ /* synthetic */ void d(fx fxVar, boolean z7) {
    }

    @Override // z4.o0
    public final boolean f(i0 i0Var) {
        ic1.v(i0Var.f19654n.get(this.f19745c));
        return false;
    }

    @Override // z4.o0
    public final x4.d[] g(i0 i0Var) {
        ic1.v(i0Var.f19654n.get(this.f19745c));
        return null;
    }

    public final void h(i0 i0Var) {
        ic1.v(i0Var.f19654n.remove(this.f19745c));
        this.f19744b.d(Boolean.FALSE);
    }
}