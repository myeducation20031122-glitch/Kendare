package j4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.z9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b3 extends y9 implements y {

    /* renamed from: b, reason: collision with root package name */
    public final c4.c f13641b;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13642e;

    public b3(c4.c cVar, Object obj) {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
        this.f13641b = cVar;
        this.f13642e = obj;
    }

    @Override // j4.y
    public final void O2(e2 e2Var) {
        c4.c cVar = this.f13641b;
        if (cVar != null) {
            cVar.k(e2Var.l());
        }
    }

    @Override // com.google.android.gms.internal.ads.y9
    public final boolean q3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            zzc();
        } else {
            if (i10 != 2) {
                return false;
            }
            e2 e2Var = (e2) z9.a(parcel, e2.CREATOR);
            z9.b(parcel);
            O2(e2Var);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // j4.y
    public final void zzc() {
        Object obj;
        c4.c cVar = this.f13641b;
        if (cVar == null || (obj = this.f13642e) == null) {
            return;
        }
        cVar.l(obj);
    }
}