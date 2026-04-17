package com.onesignal;

import android.os.Looper;
import android.os.WorkSource;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.location.LocationRequest;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u {
    public u(GoogleApiClient googleApiClient) {
        long j10 = z3.f12268n ? 270000L : 570000L;
        if (googleApiClient == null) {
            return;
        }
        LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
        fc.t.d(j10 >= 0, "illegal fastest interval: %d", new Object[]{Long.valueOf(j10)});
        locationRequest.f11283f = j10;
        fc.t.b("intervalMillis must be greater than or equal to 0", j10 >= 0);
        long j11 = locationRequest.f11283f;
        long j12 = locationRequest.f11282e;
        if (j11 == j12 / 6) {
            locationRequest.f11283f = j10 / 6;
        }
        if (locationRequest.f11289w == j12) {
            locationRequest.f11289w = j10;
        }
        locationRequest.f11282e = j10;
        long j13 = (long) (j10 * 1.5d);
        fc.t.d(j13 >= 0, "illegal max wait time: %d", new Object[]{Long.valueOf(j13)});
        locationRequest.f11284j = j13;
        dq0.v0(102);
        locationRequest.f11281b = 102;
        z3.b(y3.f12233n, "GMSLocationController GoogleApiClient requestLocationUpdates!", null);
        try {
            try {
                synchronized (o0.f12033d) {
                    try {
                        if (Looper.myLooper() == null) {
                            Looper.prepare();
                        }
                        if (googleApiClient.g()) {
                            r5.e.f16546b.getClass();
                            Looper looperMyLooper = Looper.myLooper();
                            fc.t.l(looperMyLooper, "invalid null looper");
                            googleApiClient.d(new p5.a(googleApiClient, new z4.m(looperMyLooper, this, u.class.getSimpleName()), locationRequest));
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                throw th;
            } catch (Throwable th3) {
                th = th3;
                z3.b(y3.f12231j, "FusedLocationApi.requestLocationUpdates failed!", th);
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}