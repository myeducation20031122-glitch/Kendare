package r5;

import a5.x;
import android.location.Location;
import android.os.Parcel;
import p5.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class l extends l5.a implements m {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f16553e = 0;

    @Override // l5.a
    public final boolean q2(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            Location location = (Location) p5.f.a(parcel, Location.CREATOR);
            p5.f.b(parcel);
            ((o) this).f15963f.zza().a(new x(4, location));
        } else {
            if (i10 != 2) {
                return false;
            }
            ((o) this).b();
        }
        return true;
    }
}