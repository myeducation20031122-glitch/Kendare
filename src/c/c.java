package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends Binder implements b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f2008e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f2009b;

    public c(e eVar) {
        this.f2009b = eVar;
        attachInterface(this, b.f2007c);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String str = b.f2007c;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        int i12 = parcel.readInt();
        Object objCreateFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
        e eVar = this.f2009b;
        eVar.getClass();
        eVar.a(i12, (Bundle) objCreateFromParcel);
        return true;
    }
}