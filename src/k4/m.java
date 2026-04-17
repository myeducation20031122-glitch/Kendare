package k4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.f50;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.gn;
import j4.q;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends gn {

    /* renamed from: e, reason: collision with root package name */
    public final AdOverlayInfoParcel f14009e;

    /* renamed from: f, reason: collision with root package name */
    public final Activity f14010f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14011j = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14012m = false;

    public m(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f14009e = adOverlayInfoParcel;
        this.f14010f = activity;
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void H2(int i10, int i11, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void M1(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f14011j);
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void P(h5.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void Z(int i10, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void c() {
        if (this.f14011j) {
            this.f14010f.finish();
            return;
        }
        this.f14011j = true;
        i iVar = this.f14009e.f2445f;
        if (iVar != null) {
            iVar.k2();
        }
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final boolean g() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void n1(Bundle bundle) {
        i iVar;
        boolean zBooleanValue = ((Boolean) q.f13781d.f13784c.a(ge.f4848v7)).booleanValue();
        Activity activity = this.f14010f;
        if (zBooleanValue) {
            activity.requestWindowFeature(1);
        }
        boolean z7 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z7 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f14009e;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z7) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            j4.a aVar = adOverlayInfoParcel.f2444e;
            if (aVar != null) {
                aVar.m();
            }
            f50 f50Var = adOverlayInfoParcel.f2443b0;
            if (f50Var != null) {
                f50Var.zzr();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (iVar = adOverlayInfoParcel.f2445f) != null) {
                iVar.zzb();
            }
        }
        w2.k kVar = i4.k.A.f13346a;
        c cVar = adOverlayInfoParcel.f2442b;
        if (w2.k.j(activity, cVar, adOverlayInfoParcel.f2451w, cVar.f13989w)) {
            return;
        }
        activity.finish();
    }

    public final synchronized void r3() {
        try {
            if (this.f14012m) {
                return;
            }
            i iVar = this.f14009e.f2445f;
            if (iVar != null) {
                iVar.zzf(4);
            }
            this.f14012m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zzl() {
        if (this.f14010f.isFinishing()) {
            r3();
        }
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zzn() {
        i iVar = this.f14009e.f2445f;
        if (iVar != null) {
            iVar.x();
        }
        if (this.f14010f.isFinishing()) {
            r3();
        }
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zzt() {
        if (this.f14010f.isFinishing()) {
            r3();
        }
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zzu() {
        i iVar = this.f14009e.f2445f;
        if (iVar != null) {
            iVar.b();
        }
    }
}