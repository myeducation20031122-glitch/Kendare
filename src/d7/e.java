package d7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements g, IInterface {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f12323b;

    public e(IBinder iBinder) {
        this.f12323b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12323b;
    }

    @Override // d7.g
    public final void d1(String str, Bundle bundle, c7.j jVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        parcelObtain.writeString(str);
        int i10 = d.f12322a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(jVar);
        try {
            this.f12323b.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // d7.g
    public final void h2(String str, Bundle bundle, c7.i iVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        parcelObtain.writeString(str);
        int i10 = d.f12322a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(iVar);
        try {
            this.f12323b.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}