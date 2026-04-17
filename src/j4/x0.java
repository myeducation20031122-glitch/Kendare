package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class x0 extends y9 implements y0 {
    public static y0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        String str = "com.google.android.gms.ads.internal.client.ILiteSdkInfo";
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof y0 ? (y0) iInterfaceQueryLocalInterface : new w0(iBinder, str, 0);
    }

    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            l2 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            z9.d(parcel2, liteSdkVersion);
        } else {
            if (i10 != 2) {
                return false;
            }
            cl adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            z9.e(parcel2, adapterCreator);
        }
        return true;
    }
}