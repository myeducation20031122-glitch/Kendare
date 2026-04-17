package x4;

import a5.d0;
import a5.v0;
import a5.w0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x extends b5.a {
    public static final Parcelable.Creator<x> CREATOR = new n(4);

    /* renamed from: b, reason: collision with root package name */
    public final String f19001b;

    /* renamed from: e, reason: collision with root package name */
    public final q f19002e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19003f;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f19004j;

    public x(String str, IBinder iBinder, boolean z7, boolean z10) {
        this.f19001b = str;
        r rVar = null;
        if (iBinder != null) {
            try {
                int i10 = w0.f421e;
                String str2 = "com.google.android.gms.common.internal.ICertData";
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                h5.a aVarZzd = (iInterfaceQueryLocalInterface instanceof d0 ? (d0) iInterfaceQueryLocalInterface : new v0(iBinder, str2, 2)).zzd();
                byte[] bArr = aVarZzd == null ? null : (byte[]) h5.b.r3(aVarZzd);
                if (bArr != null) {
                    rVar = new r(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f19002e = rVar;
        this.f19003f = z7;
        this.f19004j = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = com.bumptech.glide.e.c0(parcel, 20293);
        com.bumptech.glide.e.X(parcel, 1, this.f19001b);
        q qVar = this.f19002e;
        if (qVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            qVar = null;
        }
        com.bumptech.glide.e.V(parcel, 2, qVar);
        com.bumptech.glide.e.i0(parcel, 3, 4);
        parcel.writeInt(this.f19003f ? 1 : 0);
        com.bumptech.glide.e.i0(parcel, 4, 4);
        parcel.writeInt(this.f19004j ? 1 : 0);
        com.bumptech.glide.e.h0(parcel, iC0);
    }
}