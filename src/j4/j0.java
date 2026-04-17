package j4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j0 extends x9 {
    public j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator", 0);
    }

    public final IBinder s3(h5.b bVar, f3 f3Var, String str, cl clVar, int i10) {
        Parcel parcelT = T();
        z9.e(parcelT, bVar);
        z9.c(parcelT, f3Var);
        parcelT.writeString(str);
        z9.e(parcelT, clVar);
        parcelT.writeInt(231004000);
        parcelT.writeInt(i10);
        Parcel parcelK2 = k2(parcelT, 2);
        IBinder strongBinder = parcelK2.readStrongBinder();
        parcelK2.recycle();
        return strongBinder;
    }
}