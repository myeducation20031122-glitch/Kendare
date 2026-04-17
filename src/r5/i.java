package r5;

import a5.x;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p5.n;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class i extends l5.a implements j {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f16552e = 0;

    @Override // l5.a
    public final boolean q2(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) p5.f.a(parcel, LocationResult.CREATOR);
            p5.f.b(parcel);
            ((n) this).f15962f.zza().a(new x(3, locationResult));
        } else if (i10 == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) p5.f.a(parcel, LocationAvailability.CREATOR);
            p5.f.b(parcel);
            ((n) this).f15962f.zza().a(new p5.m(0, locationAvailability));
        } else {
            if (i10 != 3) {
                return false;
            }
            ((n) this).a();
        }
        return true;
    }
}