package j4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m1 extends x9 implements n1 {
    public m1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener", 0);
    }

    @Override // j4.n1
    public final void Q2(g3 g3Var) {
        Parcel parcelT = T();
        z9.c(parcelT, g3Var);
        q2(parcelT, 1);
    }
}