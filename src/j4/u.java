package j4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u extends x9 implements w {
    public u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener", 0);
    }

    @Override // j4.w
    public final void d(e2 e2Var) {
        Parcel parcelT = T();
        z9.c(parcelT, e2Var);
        q2(parcelT, 8);
    }

    @Override // j4.w
    public final void e() {
        q2(T(), 1);
    }

    @Override // j4.w
    public final void zzc() {
        q2(T(), 6);
    }

    @Override // j4.w
    public final void zze(int i10) {
        Parcel parcelT = T();
        parcelT.writeInt(i10);
        q2(parcelT, 2);
    }

    @Override // j4.w
    public final void zzg() {
        q2(T(), 7);
    }

    @Override // j4.w
    public final void zzh() {
        q2(T(), 3);
    }

    @Override // j4.w
    public final void zzi() {
        q2(T(), 4);
    }

    @Override // j4.w
    public final void zzj() {
        q2(T(), 5);
    }

    @Override // j4.w
    public final void zzk() {
        q2(T(), 9);
    }
}