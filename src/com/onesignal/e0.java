package com.onesignal;

import android.location.Location;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationServices;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class e0 extends o0 {

    /* renamed from: j, reason: collision with root package name */
    public static FusedLocationProviderClient f11772j;

    /* renamed from: k, reason: collision with root package name */
    public static d0 f11773k;

    public static void c() {
        synchronized (o0.f12033d) {
            f11772j = null;
        }
    }

    public static void g() {
        synchronized (o0.f12033d) {
            try {
                z3.a(y3.f12233n, "HMSLocationController onFocusChange!");
                if (o0.f() && f11772j == null) {
                    return;
                }
                FusedLocationProviderClient fusedLocationProviderClient = f11772j;
                if (fusedLocationProviderClient != null) {
                    d0 d0Var = f11773k;
                    if (d0Var != null) {
                        fusedLocationProviderClient.removeLocationUpdates(d0Var);
                    }
                    f11773k = new d0(f11772j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void k() {
        synchronized (o0.f12033d) {
            if (f11772j == null) {
                try {
                    f11772j = LocationServices.getFusedLocationProviderClient(o0.f12036g);
                } catch (Exception e10) {
                    z3.a(y3.f12230f, "Huawei LocationServices getFusedLocationProviderClient failed! " + e10);
                    c();
                    return;
                }
            }
            Location location = o0.f12037h;
            if (location != null) {
                o0.b(location);
            } else {
                f11772j.getLastLocation().addOnSuccessListener(new c0()).addOnFailureListener(new b0());
            }
        }
    }
}