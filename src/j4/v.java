package j4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.z9;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class v extends y9 implements w {
    public v() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                e();
                break;
            case 2:
                int i11 = parcel.readInt();
                z9.b(parcel);
                zze(i11);
                break;
            case 3:
                break;
            case 4:
                zzi();
                break;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                zzj();
                break;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                zzc();
                break;
            case y4.g.NETWORK_ERROR /* 7 */:
                zzg();
                break;
            case 8:
                e2 e2Var = (e2) z9.a(parcel, e2.CREATOR);
                z9.b(parcel);
                d(e2Var);
                break;
            case 9:
                zzk();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}