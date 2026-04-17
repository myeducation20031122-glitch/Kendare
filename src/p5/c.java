package p5;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c extends BasePendingResult implements z4.d {

    /* renamed from: k, reason: collision with root package name */
    public final y4.d f15943k;

    /* renamed from: l, reason: collision with root package name */
    public final y4.e f15944l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GoogleApiClient googleApiClient) {
        super(googleApiClient);
        if (googleApiClient == null) {
            throw new NullPointerException("GoogleApiClient must not be null");
        }
        y4.e eVar = e.f15950j;
        fc.t.l(eVar, "Api must not be null");
        this.f15943k = eVar.f19236b;
        this.f15944l = eVar;
    }

    public abstract void r0(y4.c cVar);

    public final void s0(Status status) {
        fc.t.b("Failed result must not be success", !(status.f2482b <= 0));
        n0(status);
    }
}