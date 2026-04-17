package d7;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h extends l5.a implements i {
    @Override // l5.a
    public final boolean q2(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            int i11 = d.f12322a;
            Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail > 0) {
                throw new BadParcelableException(r.d("Parcel data not fully consumed, unread size: ", iDataAvail));
            }
            a0(bundle);
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        int i12 = d.f12322a;
        Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
        int iDataAvail2 = parcel.dataAvail();
        if (iDataAvail2 > 0) {
            throw new BadParcelableException(r.d("Parcel data not fully consumed, unread size: ", iDataAvail2));
        }
        X0(bundle2);
        return true;
    }
}