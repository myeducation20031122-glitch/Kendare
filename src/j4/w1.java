package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.z9;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class w1 extends y9 implements x1 {
    public w1() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static x1 r3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof x1 ? (x1) iInterfaceQueryLocalInterface : new v1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        float fZzg;
        z1 y1Var;
        int i11;
        boolean zC;
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                zzl();
                parcel2.writeNoException();
                return true;
            case 2:
                zzk();
                parcel2.writeNoException();
                return true;
            case 3:
                ClassLoader classLoader = z9.f10427a;
                boolean z7 = parcel.readInt() != 0;
                z9.b(parcel);
                H(z7);
                parcel2.writeNoException();
                return true;
            case 4:
                zC = c();
                parcel2.writeNoException();
                ClassLoader classLoader2 = z9.f10427a;
                i11 = zC;
                parcel2.writeInt(i11);
                return true;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                int iZzh = zzh();
                parcel2.writeNoException();
                i11 = iZzh;
                parcel2.writeInt(i11);
                return true;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case y4.g.NETWORK_ERROR /* 7 */:
                fZzg = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    y1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    y1Var = iInterfaceQueryLocalInterface instanceof z1 ? (z1) iInterfaceQueryLocalInterface : new y1(strongBinder);
                }
                z9.b(parcel);
                H1(y1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                fZzg = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                zC = zzp();
                parcel2.writeNoException();
                ClassLoader classLoader22 = z9.f10427a;
                i11 = zC;
                parcel2.writeInt(i11);
                return true;
            case 11:
                z1 z1VarZzi = zzi();
                parcel2.writeNoException();
                z9.e(parcel2, z1VarZzi);
                return true;
            case 12:
                zC = zzo();
                parcel2.writeNoException();
                ClassLoader classLoader222 = z9.f10427a;
                i11 = zC;
                parcel2.writeInt(i11);
                return true;
            case y4.g.ERROR /* 13 */:
                zzn();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}