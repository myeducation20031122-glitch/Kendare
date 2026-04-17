package j4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.bl;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w0 extends x9 implements y0 {
    @Override // j4.y0
    public final cl getAdapterCreator() {
        Parcel parcelK2 = k2(T(), 2);
        cl clVarR3 = bl.r3(parcelK2.readStrongBinder());
        parcelK2.recycle();
        return clVarR3;
    }

    @Override // j4.y0
    public final l2 getLiteSdkVersion() {
        Parcel parcelK2 = k2(T(), 1);
        l2 l2Var = (l2) z9.a(parcelK2, l2.CREATOR);
        parcelK2.recycle();
        return l2Var;
    }
}