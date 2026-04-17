package com.onesignal;

import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d0 extends LocationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final FusedLocationProviderClient f11752a;

    public d0(FusedLocationProviderClient fusedLocationProviderClient) {
        this.f11752a = fusedLocationProviderClient;
        a();
    }

    public final void a() {
        long j10 = z3.A() ? 270000L : 570000L;
        LocationRequest priority = LocationRequest.create().setFastestInterval(j10).setInterval(j10).setMaxWaitTime((long) (j10 * 1.5d)).setPriority(102);
        z3.a(y3.f12233n, "HMSLocationController Huawei LocationServices requestLocationUpdates!");
        this.f11752a.requestLocationUpdates(priority, this, o0.e().getLooper());
    }
}