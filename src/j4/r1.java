package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r1 extends x9 {
    public final q1 s3(h5.b bVar, cl clVar) {
        q1 o1Var;
        Parcel parcelT = T();
        z9.e(parcelT, bVar);
        z9.e(parcelT, clVar);
        parcelT.writeInt(231004000);
        Parcel parcelK2 = k2(parcelT, 1);
        IBinder strongBinder = parcelK2.readStrongBinder();
        if (strongBinder == null) {
            o1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            o1Var = iInterfaceQueryLocalInterface instanceof q1 ? (q1) iInterfaceQueryLocalInterface : new o1(strongBinder);
        }
        parcelK2.recycle();
        return o1Var;
    }
}