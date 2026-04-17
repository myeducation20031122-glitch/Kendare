package t5;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c6 implements k4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.n0 f17286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f17287b;

    public c6(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.n0 n0Var) {
        this.f17287b = appMeasurementDynamiteService;
        this.f17286a = n0Var;
    }

    @Override // t5.k4
    public final void a(long j10, Bundle bundle, String str, String str2) {
        try {
            this.f17286a.l1(j10, bundle, str, str2);
        } catch (RemoteException e10) {
            b4 b4Var = this.f17287b.f11301b;
            if (b4Var != null) {
                i3 i3Var = b4Var.f17251w;
                b4.i(i3Var);
                i3Var.f17400w.b(e10, "Event listener threw exception");
            }
        }
    }
}