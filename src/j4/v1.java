package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v1 extends x9 implements x1 {
    public v1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController", 0);
    }

    @Override // j4.x1
    public final void H1(z1 z1Var) {
        Parcel parcelT = T();
        z9.e(parcelT, z1Var);
        q2(parcelT, 8);
    }

    @Override // j4.x1
    public final float zze() {
        throw null;
    }

    @Override // j4.x1
    public final float zzf() {
        throw null;
    }

    @Override // j4.x1
    public final float zzg() {
        throw null;
    }

    @Override // j4.x1
    public final z1 zzi() {
        z1 y1Var;
        Parcel parcelK2 = k2(T(), 11);
        IBinder strongBinder = parcelK2.readStrongBinder();
        if (strongBinder == null) {
            y1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            y1Var = iInterfaceQueryLocalInterface instanceof z1 ? (z1) iInterfaceQueryLocalInterface : new y1(strongBinder);
        }
        parcelK2.recycle();
        return y1Var;
    }
}