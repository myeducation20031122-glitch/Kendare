package c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new android.support.v4.media.a(9);

    /* renamed from: b, reason: collision with root package name */
    public b f2014b;

    public e(Parcel parcel) {
        b bVar;
        IBinder strongBinder = parcel.readStrongBinder();
        int i10 = c.f2008e;
        if (strongBinder == null) {
            bVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(b.f2007c);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) {
                a aVar = new a();
                aVar.f2006b = strongBinder;
                bVar = aVar;
            } else {
                bVar = (b) iInterfaceQueryLocalInterface;
            }
        }
        this.f2014b = bVar;
    }

    public void a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f2014b == null) {
                    this.f2014b = new c(this);
                }
                parcel.writeStrongBinder(this.f2014b.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}