package p5;

import android.os.Parcel;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends c {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.onesignal.u f15941m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GoogleApiClient googleApiClient, com.onesignal.u uVar) {
        super(googleApiClient);
        this.f15941m = uVar;
    }

    @Override // p5.c
    public final void r0(y4.c cVar) {
        x4.d dVar;
        q qVar = (q) cVar;
        com.onesignal.u uVar = this.f15941m;
        String simpleName = com.onesignal.u.class.getSimpleName();
        if (uVar == null) {
            throw new NullPointerException("Listener must not be null");
        }
        fc.t.h("Listener type must not be empty", simpleName);
        z4.k kVar = new z4.k(uVar, simpleName);
        x5.l lVar = new x5.l();
        lVar.f19011a.b(new p8.c(this, 28));
        synchronized (qVar.f15972i0) {
            try {
                o oVar = (o) qVar.f15972i0.remove(kVar);
                if (oVar == null) {
                    lVar.b(Boolean.FALSE);
                    return;
                }
                z4.m mVarZza = oVar.f15963f.zza();
                mVarZza.f19675b = null;
                mVarZza.f19676c = null;
                x4.d[] dVarArrU = qVar.u();
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
                        h0 h0Var = (h0) qVar.z();
                        r rVar = new r(1, null, oVar, null, null, null);
                        i iVar = new i(Boolean.TRUE, lVar);
                        Parcel parcelT = h0Var.T();
                        f.c(parcelT, rVar);
                        parcelT.writeStrongBinder(iVar);
                        h0Var.r3(parcelT, 89);
                    }
                }
                h0 h0Var2 = (h0) qVar.z();
                t tVar = new t(2, null, oVar, null, null, new k(Boolean.TRUE, lVar), null);
                Parcel parcelT2 = h0Var2.T();
                f.c(parcelT2, tVar);
                h0Var2.r3(parcelT2, 59);
            } finally {
            }
        }
    }
}