package a5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m0 extends c0 {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f365g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f366h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(f fVar, int i10, IBinder iBinder, Bundle bundle) {
        super(fVar, i10, bundle);
        this.f366h = fVar;
        this.f365g = iBinder;
    }

    @Override // a5.c0
    public final void b(x4.b bVar) {
        f fVar = this.f366h;
        c cVar = fVar.X;
        if (cVar != null) {
            cVar.x(bVar);
        }
        fVar.f321j = bVar.f18952e;
        fVar.f322m = System.currentTimeMillis();
    }

    @Override // a5.c0
    public final boolean c() throws RemoteException {
        IBinder iBinder = this.f365g;
        try {
            fc.t.k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            f fVar = this.f366h;
            if (!fVar.A().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + fVar.A() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceR = fVar.r(iBinder);
            if (iInterfaceR == null || !(f.H(fVar, 2, 4, iInterfaceR) || f.H(fVar, 3, 4, iInterfaceR))) {
                return false;
            }
            fVar.f315b0 = null;
            b bVar = fVar.W;
            if (bVar == null) {
                return true;
            }
            bVar.T(null);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}