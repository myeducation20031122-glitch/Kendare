package com.onesignal;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t implements y4.k, y4.l {
    @Override // z4.f
    public final void A(int i10) {
        z3.b(y3.f12233n, "GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i10, null);
        v.c();
    }

    @Override // z4.f
    public final void T(Bundle bundle) {
        synchronized (o0.f12033d) {
            try {
                b5 b5Var = v.f12196j;
                if (b5Var != null && ((GoogleApiClient) b5Var.f11740f) != null) {
                    y3 y3Var = y3.f12233n;
                    z3.b(y3Var, "GMSLocationController GoogleApiClientListener onConnected lastLocation: " + o0.f12037h, null);
                    if (o0.f12037h == null) {
                        o0.f12037h = q3.t((GoogleApiClient) v.f12196j.f11740f);
                        z3.b(y3Var, "GMSLocationController GoogleApiClientListener lastLocation: " + o0.f12037h, null);
                        Location location = o0.f12037h;
                        if (location != null) {
                            o0.b(location);
                        }
                    }
                    v.f12197k = new u((GoogleApiClient) v.f12196j.f11740f);
                    return;
                }
                z3.b(y3.f12233n, "GMSLocationController GoogleApiClientListener onConnected googleApiClient not available, returning", null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z4.n
    public final void x(x4.b bVar) {
        z3.b(y3.f12233n, "GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + bVar, null);
        v.c();
    }
}