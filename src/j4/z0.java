package j4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.jj;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.z9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z0 extends x9 implements b1 {
    public z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager", 0);
    }

    @Override // j4.b1
    public final void W(jj jjVar) {
        Parcel parcelT = T();
        z9.e(parcelT, jjVar);
        q2(parcelT, 12);
    }

    @Override // j4.b1
    public final void h0(cl clVar) {
        Parcel parcelT = T();
        z9.e(parcelT, clVar);
        q2(parcelT, 11);
    }

    @Override // j4.b1
    public final void i1(w2 w2Var) {
        Parcel parcelT = T();
        z9.c(parcelT, w2Var);
        q2(parcelT, 14);
    }

    @Override // j4.b1
    public final void s2(h5.a aVar, String str) {
        Parcel parcelT = T();
        parcelT.writeString(null);
        z9.e(parcelT, aVar);
        q2(parcelT, 6);
    }

    @Override // j4.b1
    public final void v(String str) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        q2(parcelT, 18);
    }

    @Override // j4.b1
    public final List zzg() {
        Parcel parcelK2 = k2(T(), 13);
        ArrayList arrayListCreateTypedArrayList = parcelK2.createTypedArrayList(ej.CREATOR);
        parcelK2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // j4.b1
    public final void zzk() {
        q2(T(), 1);
    }
}