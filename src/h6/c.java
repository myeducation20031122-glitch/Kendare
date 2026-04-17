package h6;

import com.google.android.gms.internal.ads.j2;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends j2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13202c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f13203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, CarouselLayoutManager carouselLayoutManager, int i11) {
        super(i10);
        this.f13202c = i11;
        this.f13203d = carouselLayoutManager;
    }

    public final int d() {
        int i10 = this.f13202c;
        CarouselLayoutManager carouselLayoutManager = this.f13203d;
        switch (i10) {
            case 0:
                return carouselLayoutManager.f1550n - carouselLayoutManager.K();
            default:
                return carouselLayoutManager.f1550n;
        }
    }

    public final int e() {
        CarouselLayoutManager carouselLayoutManager = this.f13203d;
        int i10 = this.f13202c;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return 0;
                    default:
                        return carouselLayoutManager.L();
                }
            default:
                if (carouselLayoutManager.O0()) {
                    return d();
                }
                switch (i10) {
                    case 0:
                        return carouselLayoutManager.J();
                    default:
                        return 0;
                }
        }
    }
}