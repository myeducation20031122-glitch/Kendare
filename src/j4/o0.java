package j4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ia;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class o0 extends y9 implements p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13777b = 0;

    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        z9.b(parcel);
        ((ia) this).P1(string, string2);
        parcel2.writeNoException();
        return true;
    }
}