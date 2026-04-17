package t5;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17604b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.l0 f17605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f17606f;

    public /* synthetic */ s4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.l0 l0Var, int i10) {
        this.f17604b = i10;
        this.f17606f = appMeasurementDynamiteService;
        this.f17605e = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f17604b;
        com.google.android.gms.internal.measurement.l0 l0Var = this.f17605e;
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f17606f;
        switch (i10) {
            case 0:
                i5 i5VarR = appMeasurementDynamiteService.f11301b.r();
                i5VarR.o();
                i5VarR.p();
                i5VarR.B(new l0.a(i5VarR, i5VarR.y(false), l0Var, 24));
                break;
            default:
                b6 b6Var = appMeasurementDynamiteService.f11301b.O;
                b4.g(b6Var);
                b6Var.H(l0Var, appMeasurementDynamiteService.f11301b.a());
                break;
        }
    }
}