package j5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements d, IInterface {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f13797b;

    public b(IBinder iBinder) {
        this.f13797b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f13797b;
    }

    public final Parcel x(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f13797b.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }
}