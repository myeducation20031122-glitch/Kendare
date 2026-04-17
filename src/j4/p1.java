package j4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.kc0;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class p1 extends y9 implements q1 {
    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        String string = parcel.readString();
        h5.a aVarQ3 = h5.b.q3(parcel.readStrongBinder());
        h5.a aVarQ32 = h5.b.q3(parcel.readStrongBinder());
        z9.b(parcel);
        ((kc0) this).k3(string, aVarQ3, aVarQ32);
        parcel2.writeNoException();
        return true;
    }
}