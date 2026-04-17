package h0;

import com.google.android.gms.internal.ads.ae;
import com.google.android.gms.internal.ads.aj0;
import com.google.android.gms.internal.ads.ci1;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.rc;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.yu;
import com.google.android.gms.internal.ads.zd;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements pb, aj0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f13149b;

    /* renamed from: e, reason: collision with root package name */
    public int f13150e;

    @Override // com.google.android.gms.internal.ads.pb
    public final void B(rc rcVar) {
        boolean z7 = this.f13149b;
        int i10 = this.f13150e;
        int i11 = yu.B0;
        zd zdVarV = ae.v();
        if (((ae) zdVarV.f3329e).y() != z7) {
            zdVarV.f();
            ae.w((ae) zdVarV.f3329e, z7);
        }
        zdVarV.f();
        ae.x((ae) zdVarV.f3329e, i10);
        ae aeVar = (ae) zdVarV.d();
        rcVar.f();
        sc.F((sc) rcVar.f3329e, aeVar);
    }

    @Override // com.google.android.gms.internal.ads.aj0
    /* renamed from: zza */
    public final void mo1zza(Object obj) {
        ((ci1) obj).r(this.f13150e, this.f13149b);
    }
}