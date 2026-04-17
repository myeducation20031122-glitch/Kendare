package j4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.z9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s1 extends x9 implements u1 {
    public s1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo", 0);
    }

    @Override // j4.u1
    public final Bundle zze() {
        Parcel parcelK2 = k2(T(), 5);
        Bundle bundle = (Bundle) z9.a(parcelK2, Bundle.CREATOR);
        parcelK2.recycle();
        return bundle;
    }

    @Override // j4.u1
    public final h3 zzf() {
        Parcel parcelK2 = k2(T(), 4);
        h3 h3Var = (h3) z9.a(parcelK2, h3.CREATOR);
        parcelK2.recycle();
        return h3Var;
    }

    @Override // j4.u1
    public final String zzg() {
        Parcel parcelK2 = k2(T(), 1);
        String string = parcelK2.readString();
        parcelK2.recycle();
        return string;
    }

    @Override // j4.u1
    public final String zzh() {
        Parcel parcelK2 = k2(T(), 6);
        String string = parcelK2.readString();
        parcelK2.recycle();
        return string;
    }

    @Override // j4.u1
    public final String zzi() {
        Parcel parcelK2 = k2(T(), 2);
        String string = parcelK2.readString();
        parcelK2.recycle();
        return string;
    }

    @Override // j4.u1
    public final List zzj() {
        Parcel parcelK2 = k2(T(), 3);
        ArrayList arrayListCreateTypedArrayList = parcelK2.createTypedArrayList(h3.CREATOR);
        parcelK2.recycle();
        return arrayListCreateTypedArrayList;
    }
}