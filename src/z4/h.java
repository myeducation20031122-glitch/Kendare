package z4;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h extends l5.a {
    @Override // l5.a
    public final boolean k2(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) l5.b.a(parcel, Status.CREATOR);
        l5.b.b(parcel);
        p5.i iVar = (p5.i) this;
        com.bumptech.glide.d.D(status, iVar.f15954e, iVar.f15955f);
        return true;
    }
}