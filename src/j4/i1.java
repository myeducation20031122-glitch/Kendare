package j4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class i1 extends y9 implements j1 {
    public i1() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        e2 e2Var = (e2) z9.a(parcel, e2.CREATOR);
        z9.b(parcel);
        T1(e2Var);
        parcel2.writeNoException();
        return true;
    }
}