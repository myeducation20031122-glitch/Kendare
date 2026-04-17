package w4;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import j4.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new m2(18);

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f18659b;

    public e(IBinder iBinder) {
        this.f18659b = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f18659b;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((e) obj).f18659b;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f18659b;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f18659b;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}