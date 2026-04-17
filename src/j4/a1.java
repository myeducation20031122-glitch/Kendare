package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.bl;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.hj;
import com.google.android.gms.internal.ads.jj;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.z9;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a1 extends y9 implements b1 {
    public a1() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        jj hjVar = null;
        j1 h1Var = null;
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float f10 = parcel.readFloat();
                z9.b(parcel);
                e0(f10);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                z9.b(parcel);
                I(string);
                parcel2.writeNoException();
                return true;
            case 4:
                ClassLoader classLoader = z9.f10427a;
                z = parcel.readInt() != 0;
                z9.b(parcel);
                o3(z);
                parcel2.writeNoException();
                return true;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                h5.a aVarQ3 = h5.b.q3(parcel.readStrongBinder());
                String string2 = parcel.readString();
                z9.b(parcel);
                P0(aVarQ3, string2);
                parcel2.writeNoException();
                return true;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                String string3 = parcel.readString();
                h5.a aVarQ32 = h5.b.q3(parcel.readStrongBinder());
                z9.b(parcel);
                s2(aVarQ32, string3);
                parcel2.writeNoException();
                return true;
            case y4.g.NETWORK_ERROR /* 7 */:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zF = f();
                parcel2.writeNoException();
                ClassLoader classLoader2 = z9.f10427a;
                parcel2.writeInt(zF ? 1 : 0);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                String string4 = parcel.readString();
                z9.b(parcel);
                p0(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                cl clVarR3 = bl.r3(parcel.readStrongBinder());
                z9.b(parcel);
                h0(clVarR3);
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    String str = "com.google.android.gms.ads.internal.initialization.IInitializationCallback";
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    hjVar = iInterfaceQueryLocalInterface instanceof jj ? (jj) iInterfaceQueryLocalInterface : new hj(strongBinder, str, z ? 1 : 0);
                }
                z9.b(parcel);
                W(hjVar);
                parcel2.writeNoException();
                return true;
            case y4.g.ERROR /* 13 */:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case y4.g.INTERRUPTED /* 14 */:
                w2 w2Var = (w2) z9.a(parcel, w2.CREATOR);
                z9.b(parcel);
                i1(w2Var);
                parcel2.writeNoException();
                return true;
            case y4.g.TIMEOUT /* 15 */:
                zzi();
                parcel2.writeNoException();
                return true;
            case y4.g.CANCELED /* 16 */:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    String str2 = "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener";
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    h1Var = iInterfaceQueryLocalInterface2 instanceof j1 ? (j1) iInterfaceQueryLocalInterface2 : new h1(strongBinder2, str2, z ? 1 : 0);
                }
                z9.b(parcel);
                m3(h1Var);
                parcel2.writeNoException();
                return true;
            case y4.g.API_NOT_CONNECTED /* 17 */:
                ClassLoader classLoader3 = z9.f10427a;
                boolean z7 = parcel.readInt() != 0;
                z9.b(parcel);
                H(z7);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                z9.b(parcel);
                v(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}