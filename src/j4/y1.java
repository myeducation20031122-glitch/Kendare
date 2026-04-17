package j4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y1 extends x9 implements z1 {
    public y1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks", 0);
    }

    @Override // j4.z1
    public final void K(boolean z7) {
        Parcel parcelT = T();
        ClassLoader classLoader = z9.f10427a;
        parcelT.writeInt(z7 ? 1 : 0);
        q2(parcelT, 5);
    }

    @Override // j4.z1
    public final void b() {
        q2(T(), 4);
    }

    @Override // j4.z1
    public final void zzg() {
        q2(T(), 3);
    }

    @Override // j4.z1
    public final void zzh() {
        q2(T(), 2);
    }

    @Override // j4.z1
    public final void zzi() {
        q2(T(), 1);
    }
}