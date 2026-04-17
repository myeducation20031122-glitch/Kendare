package a5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import j4.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e0 implements IInterface {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f311b;

    public e0(IBinder iBinder) {
        this.f311b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f311b;
    }

    public final void x(k0 k0Var, j jVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(k0Var);
            parcelObtain.writeInt(1);
            m2.a(jVar, parcelObtain, 0);
            this.f311b.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}