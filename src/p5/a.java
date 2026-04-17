package p5;

import android.os.Build;
import android.os.Parcel;
import android.os.WorkSource;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import g.v0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends c {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z4.m f15936m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LocationRequest f15937n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GoogleApiClient googleApiClient, z4.m mVar, LocationRequest locationRequest) {
        super(googleApiClient);
        this.f15936m = mVar;
        this.f15937n = locationRequest;
    }

    @Override // p5.c
    public final void r0(y4.c cVar) {
        o oVar;
        long j10;
        x4.d dVar;
        q qVar = (q) cVar;
        v0 v0Var = new v0(this.f15936m, 29);
        LocationRequest locationRequest = this.f15937n;
        x5.l lVar = new x5.l();
        lVar.f19011a.b(new p8.c(this, 28));
        qVar.getClass();
        z4.m mVarZza = v0Var.zza();
        z4.k kVar = mVarZza.f19676c;
        kVar.getClass();
        x4.d[] dVarArrU = qVar.u();
        boolean z7 = false;
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
                z7 = true;
            }
        }
        synchronized (qVar.f15972i0) {
            try {
                o oVar2 = (o) qVar.f15972i0.getOrDefault(kVar, null);
                if (oVar2 == null || z7) {
                    o oVar3 = new o(v0Var);
                    qVar.f15972i0.put(kVar, oVar3);
                    oVar = oVar3;
                } else {
                    oVar2.f15963f.b(mVarZza);
                    oVar = oVar2;
                    oVar2 = null;
                }
                String str = kVar.f19667b + "@" + System.identityHashCode(kVar.f19666a);
                if (z7) {
                    h0 h0Var = (h0) qVar.z();
                    r rVar = new r(1, oVar2 == null ? null : oVar2, oVar, null, null, str);
                    i iVar = new i(null, lVar);
                    Parcel parcelT = h0Var.T();
                    f.c(parcelT, rVar);
                    f.c(parcelT, locationRequest);
                    parcelT.writeStrongBinder(iVar);
                    h0Var.r3(parcelT, 88);
                } else {
                    h0 h0Var2 = (h0) qVar.z();
                    int i11 = locationRequest.f11281b;
                    long j11 = locationRequest.f11282e;
                    long jMin = locationRequest.f11283f;
                    long j12 = locationRequest.f11284j;
                    long j13 = locationRequest.f11285m;
                    int i12 = locationRequest.f11286n;
                    float f10 = locationRequest.f11287t;
                    boolean z10 = locationRequest.f11288u;
                    long j14 = locationRequest.f11289w;
                    int i13 = locationRequest.M;
                    o oVar4 = oVar;
                    int i14 = locationRequest.N;
                    String str2 = locationRequest.O;
                    boolean z11 = locationRequest.P;
                    WorkSource workSource = locationRequest.Q;
                    p pVar = locationRequest.R;
                    String str3 = Build.VERSION.SDK_INT < 30 ? null : str2;
                    if (jMin == -1) {
                        j10 = j11;
                    } else {
                        if (i11 != 105) {
                            jMin = Math.min(jMin, j11);
                        }
                        j10 = jMin;
                    }
                    t tVar = new t(1, new s(new LocationRequest(i11, j11, j10, Math.max(j12, j11), Long.MAX_VALUE, j13, i12, f10, z10, j14 == -1 ? j11 : j14, i13, i14, str3, z11, new WorkSource(workSource), pVar), null, false, false, null, false, false, null, Long.MAX_VALUE), oVar4, null, null, new k(lVar, oVar4, 1), str);
                    Parcel parcelT2 = h0Var2.T();
                    f.c(parcelT2, tVar);
                    h0Var2.r3(parcelT2, 59);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}