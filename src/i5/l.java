package i5;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.x9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l extends x9 {
    public final h5.a s3(h5.b bVar, String str, int i10, h5.b bVar2) {
        Parcel parcelT = T();
        n5.a.c(parcelT, bVar);
        parcelT.writeString(str);
        parcelT.writeInt(i10);
        n5.a.c(parcelT, bVar2);
        return ic1.l(A(parcelT, 2));
    }

    public final h5.a t3(h5.b bVar, String str, int i10, h5.b bVar2) {
        Parcel parcelT = T();
        n5.a.c(parcelT, bVar);
        parcelT.writeString(str);
        parcelT.writeInt(i10);
        n5.a.c(parcelT, bVar2);
        return ic1.l(A(parcelT, 3));
    }
}