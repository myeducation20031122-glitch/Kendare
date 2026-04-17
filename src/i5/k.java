package i5;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.x9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k extends x9 {
    public final h5.a s3(h5.b bVar, String str, int i10) {
        Parcel parcelT = T();
        n5.a.c(parcelT, bVar);
        parcelT.writeString(str);
        parcelT.writeInt(i10);
        return ic1.l(A(parcelT, 2));
    }

    public final h5.a t3(h5.b bVar, String str, int i10, h5.b bVar2) {
        Parcel parcelT = T();
        n5.a.c(parcelT, bVar);
        parcelT.writeString(str);
        parcelT.writeInt(i10);
        n5.a.c(parcelT, bVar2);
        return ic1.l(A(parcelT, 8));
    }

    public final h5.a u3(h5.b bVar, String str, int i10) {
        Parcel parcelT = T();
        n5.a.c(parcelT, bVar);
        parcelT.writeString(str);
        parcelT.writeInt(i10);
        return ic1.l(A(parcelT, 4));
    }

    public final h5.a v3(h5.b bVar, String str, boolean z7, long j10) {
        Parcel parcelT = T();
        n5.a.c(parcelT, bVar);
        parcelT.writeString(str);
        parcelT.writeInt(z7 ? 1 : 0);
        parcelT.writeLong(j10);
        return ic1.l(A(parcelT, 7));
    }
}