package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.y9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k2 extends y9 implements g1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f13753b;

    /* renamed from: e, reason: collision with root package name */
    public final String f13754e;

    public k2(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f13753b = str;
        this.f13754e = str2;
    }

    public static g1 r3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        String str = "com.google.android.gms.ads.internal.client.IMuteThisAdReason";
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof g1 ? (g1) iInterfaceQueryLocalInterface : new f1(iBinder, str, 0);
    }

    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        String str;
        if (i10 == 1) {
            parcel2.writeNoException();
            str = this.f13753b;
        } else {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            str = this.f13754e;
        }
        parcel2.writeString(str);
        return true;
    }

    @Override // j4.g1
    public final String zze() {
        return this.f13753b;
    }

    @Override // j4.g1
    public final String zzf() {
        return this.f13754e;
    }
}