package k5;

import a5.k;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends k {
    @Override // a5.f
    public final String A() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // a5.f
    public final String B() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // a5.f
    public final boolean C() {
        return true;
    }

    @Override // a5.f, y4.c
    public final int j() {
        return 212800000;
    }

    @Override // a5.f
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new d(iBinder);
    }

    @Override // a5.f
    public final x4.d[] t() {
        return u4.e.f18279b;
    }
}