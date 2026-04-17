package v5;

import android.os.Parcel;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c extends l5.a implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
    }

    @Override // l5.a
    public final boolean k2(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 3:
                l5.b.b(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                l5.b.b(parcel);
                parcel2.writeNoException();
                return true;
            case y4.g.INVALID_ACCOUNT /* 5 */:
            default:
                return false;
            case y4.g.NETWORK_ERROR /* 7 */:
                l5.b.b(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                h hVar = (h) l5.b.a(parcel, h.CREATOR);
                l5.b.b(parcel);
                Y0(hVar);
                parcel2.writeNoException();
                return true;
            case 9:
                l5.b.b(parcel);
                parcel2.writeNoException();
                return true;
        }
    }
}