package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.d10;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.z9;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class t1 extends y9 implements u1 {
    public static u1 r3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof u1 ? (u1) iInterfaceQueryLocalInterface : new s1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        String str;
        Parcelable parcelableZzf;
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                parcel2.writeNoException();
                str = ((d10) this).f3505b;
                parcel2.writeString(str);
                return true;
            case 2:
                parcel2.writeNoException();
                str = ((d10) this).f3506e;
                parcel2.writeString(str);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeTypedList(((d10) this).f3509m);
                return true;
            case 4:
                parcelableZzf = ((d10) this).zzf();
                parcel2.writeNoException();
                z9.d(parcel2, parcelableZzf);
                return true;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                parcel2.writeNoException();
                parcelableZzf = ((d10) this).f3513w;
                z9.d(parcel2, parcelableZzf);
                return true;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                parcel2.writeNoException();
                str = ((d10) this).f3507f;
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}