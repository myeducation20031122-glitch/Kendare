package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.fg;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.ih;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c0 extends x9 implements e0 {
    public c0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder", 0);
    }

    @Override // j4.e0
    public final void D2(oh ohVar) {
        Parcel parcelT = T();
        z9.e(parcelT, ohVar);
        q2(parcelT, 10);
    }

    @Override // j4.e0
    public final void N1(String str, ih ihVar, gh ghVar) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        z9.e(parcelT, ihVar);
        z9.e(parcelT, ghVar);
        q2(parcelT, 5);
    }

    @Override // j4.e0
    public final void c2(fg fgVar) {
        Parcel parcelT = T();
        z9.c(parcelT, fgVar);
        q2(parcelT, 6);
    }

    @Override // j4.e0
    public final void n0(w wVar) {
        Parcel parcelT = T();
        z9.e(parcelT, wVar);
        q2(parcelT, 2);
    }

    @Override // j4.e0
    public final b0 zze() {
        b0 zVar;
        Parcel parcelK2 = k2(T(), 1);
        IBinder strongBinder = parcelK2.readStrongBinder();
        if (strongBinder == null) {
            zVar = null;
        } else {
            String str = "com.google.android.gms.ads.internal.client.IAdLoader";
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zVar = iInterfaceQueryLocalInterface instanceof b0 ? (b0) iInterfaceQueryLocalInterface : new z(strongBinder, str, 0);
        }
        parcelK2.recycle();
        return zVar;
    }
}