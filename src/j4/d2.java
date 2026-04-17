package j4;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.wr;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d2 extends c4.b {

    /* renamed from: b, reason: collision with root package name */
    public final Object f13668b = new Object();

    /* renamed from: e, reason: collision with root package name */
    public c4.b f13669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f2 f13670f;

    public d2(f2 f2Var) {
        this.f13670f = f2Var;
    }

    @Override // c4.b
    public final void a() {
        synchronized (this.f13668b) {
            try {
                c4.b bVar = this.f13669e;
                if (bVar != null) {
                    bVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c4.b
    public final void b(c4.l lVar) {
        f2 f2Var = this.f13670f;
        g.e eVar = f2Var.f13687c;
        i0 i0Var = f2Var.f13693i;
        x1 x1VarZzl = null;
        if (i0Var != null) {
            try {
                x1VarZzl = i0Var.zzl();
            } catch (RemoteException e10) {
                wr.i("#007 Could not call remote method.", e10);
            }
        }
        eVar.T(x1VarZzl);
        synchronized (this.f13668b) {
            try {
                c4.b bVar = this.f13669e;
                if (bVar != null) {
                    bVar.b(lVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c4.b
    public final void d() {
        synchronized (this.f13668b) {
            try {
                c4.b bVar = this.f13669e;
                if (bVar != null) {
                    bVar.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c4.b
    public final void e() {
        f2 f2Var = this.f13670f;
        g.e eVar = f2Var.f13687c;
        i0 i0Var = f2Var.f13693i;
        x1 x1VarZzl = null;
        if (i0Var != null) {
            try {
                x1VarZzl = i0Var.zzl();
            } catch (RemoteException e10) {
                wr.i("#007 Could not call remote method.", e10);
            }
        }
        eVar.T(x1VarZzl);
        synchronized (this.f13668b) {
            try {
                c4.b bVar = this.f13669e;
                if (bVar != null) {
                    bVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c4.b
    public final void h() {
        synchronized (this.f13668b) {
            try {
                c4.b bVar = this.f13669e;
                if (bVar != null) {
                    bVar.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c4.b, j4.a
    public final void m() {
        synchronized (this.f13668b) {
            try {
                c4.b bVar = this.f13669e;
                if (bVar != null) {
                    bVar.m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}