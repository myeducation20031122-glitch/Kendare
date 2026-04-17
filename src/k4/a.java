package k4;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.f50;
import com.google.android.gms.internal.ads.p10;
import com.google.android.gms.internal.ads.wr;
import l4.b0;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends h {
    public final /* synthetic */ int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, Activity activity) {
        super(activity);
        this.Z = i10;
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void n1(Bundle bundle) throws e, JSONException {
        int i10 = this.Z;
        Activity activity = this.f13995e;
        switch (i10) {
            case 4:
                b0.k("AdOverlayParcel is null or does not contain valid overlay type.");
                this.X = 4;
                activity.finish();
                return;
            default:
                activity.requestWindowFeature(1);
                this.M = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
                try {
                    AdOverlayInfoParcel adOverlayInfoParcelH = AdOverlayInfoParcel.h(activity.getIntent());
                    this.f13996f = adOverlayInfoParcelH;
                    if (adOverlayInfoParcelH == null) {
                        throw new e("Could not get info for ad overlay.");
                    }
                    if (adOverlayInfoParcelH.P.f10589f > 7500000) {
                        this.X = 4;
                    }
                    if (activity.getIntent() != null) {
                        this.W = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = this.f13996f;
                    i4.f fVar = adOverlayInfoParcel.R;
                    int i11 = adOverlayInfoParcel.N;
                    if (fVar != null) {
                        boolean z7 = fVar.f13324b;
                        this.N = z7;
                        if (z7) {
                            if (i11 != 5 && fVar.f13329n != -1) {
                                new g(this).b();
                            }
                        }
                    } else if (i11 == 5) {
                        this.N = true;
                        if (i11 != 5) {
                            new g(this).b();
                        }
                    } else {
                        this.N = false;
                    }
                    if (bundle == null) {
                        if (this.W) {
                            p10 p10Var = this.f13996f.f2441a0;
                            if (p10Var != null) {
                                p10Var.b();
                            }
                            i iVar = this.f13996f.f2445f;
                            if (iVar != null) {
                                iVar.zzb();
                            }
                        }
                        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f13996f;
                        if (adOverlayInfoParcel2.N != 1) {
                            j4.a aVar = adOverlayInfoParcel2.f2444e;
                            if (aVar != null) {
                                aVar.m();
                            }
                            f50 f50Var = this.f13996f.f2443b0;
                            if (f50Var != null) {
                                f50Var.zzr();
                            }
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.f13996f;
                    f fVar2 = new f(activity, adOverlayInfoParcel3.Q, adOverlayInfoParcel3.P.f10587b, adOverlayInfoParcel3.Z);
                    this.O = fVar2;
                    fVar2.setId(com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS);
                    i4.k.A.f13350e.r(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel4 = this.f13996f;
                    int i12 = adOverlayInfoParcel4.N;
                    if (i12 != 1) {
                        if (i12 == 2) {
                            this.f13998m = new w4.j(adOverlayInfoParcel4.f2446j);
                        } else if (i12 == 3) {
                            r3(true);
                            return;
                        } else if (i12 != 5) {
                            throw new e("Could not determine ad overlay type.");
                        }
                    }
                    r3(false);
                    return;
                } catch (e e10) {
                    wr.g(e10.getMessage());
                    this.X = 4;
                    activity.finish();
                    return;
                }
        }
    }
}