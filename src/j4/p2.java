package j4;

import com.google.android.gms.internal.ads.sr;
import com.google.android.gms.internal.ads.wr;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p2 extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2 f13780b;

    public /* synthetic */ p2(q2 q2Var) {
        this.f13780b = q2Var;
    }

    @Override // j4.b0
    public final void A2(c3 c3Var, int i10) {
        wr.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        sr.f8512b.post(new androidx.activity.i(this, 18));
    }

    @Override // j4.b0
    public final void a3(c3 c3Var) {
        A2(c3Var, 1);
    }

    @Override // j4.b0
    public final boolean d0() {
        return false;
    }

    @Override // j4.b0
    public final String zze() {
        return null;
    }

    @Override // j4.b0
    public final String zzf() {
        return null;
    }
}