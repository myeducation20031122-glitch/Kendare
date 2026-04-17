package l4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v extends x9 implements w {
    @Override // l4.w
    public final void zze(h5.a aVar) {
        Parcel parcelT = T();
        z9.e(parcelT, aVar);
        q2(parcelT, 2);
    }

    @Override // l4.w
    public final boolean zzf(h5.a aVar, String str, String str2) {
        Parcel parcelT = T();
        z9.e(parcelT, aVar);
        parcelT.writeString(str);
        parcelT.writeString(str2);
        Parcel parcelK2 = k2(parcelT, 1);
        boolean z7 = parcelK2.readInt() != 0;
        parcelK2.recycle();
        return z7;
    }
}