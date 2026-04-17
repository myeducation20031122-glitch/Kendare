package p5;

import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q extends a5.k {

    /* renamed from: i0, reason: collision with root package name */
    public final t.k f15972i0;

    /* renamed from: j0, reason: collision with root package name */
    public final t.k f15973j0;

    /* renamed from: k0, reason: collision with root package name */
    public final t.k f15974k0;

    public q(Context context, Looper looper, a5.h hVar, z4.f fVar, z4.n nVar) {
        super(context, looper, 23, hVar, fVar, nVar);
        this.f15972i0 = new t.k();
        this.f15973j0 = new t.k();
        this.f15974k0 = new t.k();
    }

    @Override // a5.f
    public final String A() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // a5.f
    public final String B() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // a5.f
    public final void E(int i10) {
        super.E(i10);
        synchronized (this.f15972i0) {
            this.f15972i0.clear();
        }
        synchronized (this.f15973j0) {
            this.f15973j0.clear();
        }
        synchronized (this.f15974k0) {
            this.f15974k0.clear();
        }
    }

    @Override // a5.f
    public final boolean F() {
        return true;
    }

    public final void J(z4.k kVar, boolean z7, x5.l lVar) {
        x4.d dVar;
        synchronized (this.f15973j0) {
            try {
                n nVar = (n) this.f15973j0.remove(kVar);
                if (nVar == null) {
                    lVar.b(Boolean.FALSE);
                    return;
                }
                z4.m mVarZza = nVar.f15962f.zza();
                mVarZza.f19675b = null;
                mVarZza.f19676c = null;
                if (z7) {
                    x4.d[] dVarArrU = u();
                    if (dVarArrU != null) {
                        int length = dVarArrU.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                dVar = null;
                                break;
                            }
                            dVar = dVarArrU[i10];
                            if ("location_updates_with_callback".equals(dVar.f18958b)) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        if (dVar != null && dVar.h() >= 1) {
                            h0 h0Var = (h0) z();
                            r rVar = new r(2, null, nVar, null, null, null);
                            i iVar = new i(Boolean.TRUE, lVar);
                            Parcel parcelT = h0Var.T();
                            f.c(parcelT, rVar);
                            parcelT.writeStrongBinder(iVar);
                            h0Var.r3(parcelT, 89);
                        }
                    }
                    h0 h0Var2 = (h0) z();
                    t tVar = new t(2, null, null, nVar, null, new k(Boolean.TRUE, lVar), null);
                    Parcel parcelT2 = h0Var2.T();
                    f.c(parcelT2, tVar);
                    h0Var2.r3(parcelT2, 59);
                } else {
                    lVar.b(Boolean.TRUE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void K(r5.c cVar, x5.l lVar) {
        x4.d dVar;
        x4.d[] dVarArrU = u();
        if (dVarArrU != null) {
            int length = dVarArrU.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    dVar = null;
                    break;
                }
                dVar = dVarArrU[i10];
                if ("get_last_location_with_request".equals(dVar.f18958b)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (dVar != null && dVar.h() >= 1) {
                h0 h0Var = (h0) z();
                j jVar = new j(lVar);
                Parcel parcelT = h0Var.T();
                f.c(parcelT, cVar);
                parcelT.writeStrongBinder(jVar);
                h0Var.r3(parcelT, 82);
                return;
            }
        }
        h0 h0Var2 = (h0) z();
        Parcel parcelP1 = h0Var2.p1(h0Var2.T(), 7);
        Location location = (Location) f.a(parcelP1, Location.CREATOR);
        parcelP1.recycle();
        lVar.b(location);
    }

    @Override // a5.f, y4.c
    public final int j() {
        return 11717000;
    }

    @Override // a5.f
    public final IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        String str = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof h0 ? (h0) iInterfaceQueryLocalInterface : new h0(iBinder, str, 3);
    }

    @Override // a5.f
    public final x4.d[] t() {
        return r5.g.f16551a;
    }
}