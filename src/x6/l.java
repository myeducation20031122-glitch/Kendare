package x6;

import android.view.View;
import com.google.android.gms.internal.ads.wh0;
import com.google.android.gms.maps.model.LatLng;
import com.isprid.kendare.model.DArticle;
import com.isprid.kendare.model.DHospitalPlace;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z8.p;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19083b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19085f;

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.f19083b = i10;
        this.f19084e = obj;
        this.f19085f = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f19083b;
        Object obj = this.f19085f;
        Object obj2 = this.f19084e;
        switch (i10) {
            case 0:
                m mVar = (m) obj2;
                mVar.getClass();
                ((View.OnClickListener) obj).onClick(view);
                mVar.a(1);
                return;
            case QueueFuseable.SYNC /* 1 */:
                z8.b this$0 = (z8.b) obj2;
                DArticle article = (DArticle) obj;
                Intrinsics.f(this$0, "this$0");
                Intrinsics.f(article, "$article");
                this$0.f19762b.invoke(article);
                return;
            case 2:
                p this$02 = (p) obj2;
                z8.m this$1 = (z8.m) obj;
                int i11 = z8.m.f19785c;
                Intrinsics.f(this$02, "this$0");
                Intrinsics.f(this$1, "this$1");
                DHospitalPlace hospitalPlaces = (DHospitalPlace) this$02.f19789a.get(this$1.getAdapterPosition());
                m9.c cVar = (m9.c) this$02.f19790b;
                cVar.getClass();
                Intrinsics.f(hospitalPlaces, "hospitalPlaces");
                m9.a aVar = cVar.W;
                if (aVar != null) {
                    k9.f fVar = (k9.f) aVar;
                    LatLng latLng = new LatLng(hospitalPlaces.getLatitude(), hospitalPlaces.getLongitude());
                    e9.d dVar = fVar.f14056m;
                    if (dVar == null) {
                        Intrinsics.n("mHoroscope");
                        throw null;
                    }
                    dVar.f12592m = latLng;
                    dVar.f12586g = hospitalPlaces.getPlaceName();
                    e9.d dVar2 = fVar.f14056m;
                    if (dVar2 == null) {
                        Intrinsics.n("mHoroscope");
                        throw null;
                    }
                    dVar2.f12595p = null;
                    fVar.n();
                }
                cVar.h(false, false);
                return;
            default:
                Function0 function0 = (Function0) obj2;
                wh0 this$03 = (wh0) obj;
                Intrinsics.f(this$03, "this$0");
                if (function0 != null) {
                    function0.invoke();
                }
                g.m mVar2 = (g.m) this$03.f9518u;
                if (mVar2 != null) {
                    mVar2.dismiss();
                    return;
                }
                return;
        }
    }
}