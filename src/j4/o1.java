package j4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o1 extends x9 implements q1 {
    public o1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester", 0);
    }

    @Override // j4.q1
    public final void k3(String str, h5.a aVar, h5.a aVar2) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        z9.e(parcelT, aVar);
        z9.e(parcelT, aVar2);
        q2(parcelT, 1);
    }
}