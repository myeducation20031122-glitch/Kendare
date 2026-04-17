package c5;

import a5.h;
import a5.k;
import a5.s;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import z4.f;
import z4.n;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends k {

    /* renamed from: i0, reason: collision with root package name */
    public final s f2136i0;

    public d(Context context, Looper looper, h hVar, s sVar, f fVar, n nVar) {
        super(context, looper, 270, hVar, fVar, nVar);
        this.f2136i0 = sVar;
    }

    @Override // a5.f
    public final String A() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // a5.f
    public final String B() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // a5.f
    public final boolean C() {
        return true;
    }

    @Override // a5.f, y4.c
    public final int j() {
        return 203400000;
    }

    @Override // a5.f
    public final IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        String str = "com.google.android.gms.common.internal.service.IClientTelemetryService";
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, str, 1);
    }

    @Override // a5.f
    public final x4.d[] t() {
        return l5.c.f14648b;
    }

    @Override // a5.f
    public final Bundle x() {
        s sVar = this.f2136i0;
        sVar.getClass();
        Bundle bundle = new Bundle();
        String str = sVar.f403b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}