package j4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a0 extends y9 implements b0 {
    public a0() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        String strZze;
        if (i10 != 1) {
            if (i10 == 2) {
                strZze = zze();
            } else {
                if (i10 == 3) {
                    boolean zD0 = d0();
                    parcel2.writeNoException();
                    ClassLoader classLoader = z9.f10427a;
                    parcel2.writeInt(zD0 ? 1 : 0);
                    return true;
                }
                if (i10 == 4) {
                    strZze = zzf();
                } else {
                    if (i10 != 5) {
                        return false;
                    }
                    c3 c3Var = (c3) z9.a(parcel, c3.CREATOR);
                    int i11 = parcel.readInt();
                    z9.b(parcel);
                    A2(c3Var, i11);
                }
            }
            parcel2.writeNoException();
            parcel2.writeString(strZze);
            return true;
        }
        c3 c3Var2 = (c3) z9.a(parcel, c3.CREATOR);
        z9.b(parcel);
        a3(c3Var2);
        parcel2.writeNoException();
        return true;
    }
}