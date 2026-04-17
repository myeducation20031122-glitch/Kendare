package n3;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import io.reactivex.internal.fuseable.QueueFuseable;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends m3.b {

    /* renamed from: i0, reason: collision with root package name */
    public final /* synthetic */ int f15352i0 = 0;

    public /* synthetic */ e() {
        this((r) null);
    }

    @Override // m3.f
    public final ValueAnimator d() {
        Float fValueOf = Float.valueOf(1.0f);
        switch (this.f15352i0) {
            case 0:
                float[] fArr = {0.0f, 0.35f, 0.7f, 1.0f};
                l3.e eVar = new l3.e(this);
                eVar.d(fArr, m3.f.f15170c0, new Float[]{fValueOf, Float.valueOf(0.0f), fValueOf, fValueOf});
                eVar.f14541c = 1300L;
                eVar.b(fArr);
                return eVar.a();
            case QueueFuseable.SYNC /* 1 */:
                float[] fArr2 = {0.0f, 0.1f, 0.25f, 0.75f, 0.9f, 1.0f};
                l3.e eVar2 = new l3.e(this);
                eVar2.e(fArr2, m3.f.f15171d0, new Integer[]{0, 0, 255, 255, 0, 0});
                eVar2.e(fArr2, m3.f.W, new Integer[]{-180, -180, 0, 0, 0, 0});
                eVar2.e(fArr2, m3.f.Y, new Integer[]{0, 0, 0, 0, 180, 180});
                eVar2.f14541c = 2400L;
                eVar2.f14540b = new LinearInterpolator();
                return eVar2.a();
            default:
                float[] fArr3 = {0.0f, 0.2f, 0.4f, 1.0f};
                l3.e eVar3 = new l3.e(this);
                Float fValueOf2 = Float.valueOf(0.4f);
                eVar3.d(fArr3, m3.f.f15169b0, new Float[]{fValueOf2, fValueOf, fValueOf2, fValueOf2});
                eVar3.f14541c = 1200L;
                eVar3.b(fArr3);
                return eVar3.a();
        }
    }

    public e(int i10) {
        super(1);
        setAlpha(0);
        this.f15178t = -180;
    }

    public e(Object obj) {
        super(1);
        this.f15174f = 0.4f;
    }

    public e(r rVar) {
        super(1);
    }
}