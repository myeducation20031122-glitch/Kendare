package j4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.x9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m0 extends x9 implements p0 {
    public m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener", 0);
    }

    @Override // j4.p0
    public final void P1(String str, String str2) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        q2(parcelT, 1);
    }
}