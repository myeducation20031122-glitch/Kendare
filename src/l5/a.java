package l5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a extends Binder implements IInterface {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14645b;

    public a(String str, int i10) {
        this.f14645b = i10;
        if (i10 == 1) {
            attachInterface(this, str);
            return;
        }
        if (i10 == 2) {
            attachInterface(this, str);
        } else if (i10 != 3) {
            attachInterface(this, str);
        } else {
            attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public abstract boolean k2(int i10, Parcel parcel, Parcel parcel2);

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (this.f14645b) {
            case 0:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                }
                break;
            case QueueFuseable.SYNC /* 1 */:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                }
                break;
            case 2:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                }
                break;
            default:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                }
                break;
        }
        return q2(i10, parcel, parcel2);
    }

    public boolean q2(int i10, Parcel parcel, Parcel parcel2) {
        return false;
    }
}