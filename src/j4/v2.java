package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v2 extends y9 implements n1 {
    public v2() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static n1 r3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof n1 ? (n1) iInterfaceQueryLocalInterface : new m1(iBinder);
    }

    @Override // j4.n1
    public final void Q2(g3 g3Var) {
    }

    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        z9.b(parcel);
        parcel2.writeNoException();
        return true;
    }
}