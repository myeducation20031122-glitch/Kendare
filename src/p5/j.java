package p5;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j extends l5.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x5.l f15956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(x5.l lVar) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 2);
        this.f15956e = lVar;
    }

    @Override // l5.a
    public final boolean q2(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) f.a(parcel, Status.CREATOR);
        Location location = (Location) f.a(parcel, Location.CREATOR);
        f.b(parcel);
        com.bumptech.glide.d.D(status, location, this.f15956e);
        return true;
    }
}