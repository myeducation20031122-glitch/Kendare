package l1;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements d {

    /* renamed from: b, reason: collision with root package name */
    public IBinder f14469b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14469b;
    }

    @Override // l1.d
    public final void b1(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            parcelObtain.writeStringArray(strArr);
            this.f14469b.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}