package n3;

import android.animation.ValueAnimator;
import io.reactivex.internal.fuseable.QueueFuseable;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends m3.b {

    /* renamed from: i0, reason: collision with root package name */
    public final /* synthetic */ int f15349i0 = 0;

    public b() {
        super(0);
        g(0.0f);
    }

    @Override // m3.f
    public final ValueAnimator d() {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        int i10 = this.f15349i0;
        m3.d dVar = m3.f.f15170c0;
        switch (i10) {
            case 0:
                float[] fArr = {0.0f, 0.5f, 1.0f};
                l3.e eVar = new l3.e(this);
                eVar.d(fArr, dVar, new Float[]{fValueOf2, fValueOf, fValueOf2});
                eVar.f14541c = 2000L;
                eVar.b(fArr);
                return eVar.a();
            case QueueFuseable.SYNC /* 1 */:
                float[] fArr2 = {0.0f, 0.5f, 1.0f};
                l3.e eVar2 = new l3.e(this);
                eVar2.d(fArr2, dVar, new Float[]{fValueOf2, fValueOf, fValueOf2});
                eVar2.f14541c = 1200L;
                eVar2.b(fArr2);
                return eVar2.a();
            case 2:
                float[] fArr3 = {0.0f, 0.5f, 1.0f};
                l3.e eVar3 = new l3.e(this);
                eVar3.d(fArr3, dVar, new Float[]{fValueOf2, fValueOf, fValueOf2});
                eVar3.f14541c = 2000L;
                eVar3.b(fArr3);
                return eVar3.a();
            case 3:
                float[] fArr4 = {0.0f, 0.39f, 0.4f, 1.0f};
                l3.e eVar4 = new l3.e(this);
                eVar4.e(fArr4, m3.f.f15171d0, new Integer[]{0, 0, 255, 0});
                eVar4.f14541c = 1200L;
                eVar4.b(fArr4);
                return eVar4.a();
            default:
                float[] fArr5 = {0.0f, 0.4f, 0.8f, 1.0f};
                l3.e eVar5 = new l3.e(this);
                eVar5.d(fArr5, dVar, new Float[]{fValueOf2, fValueOf, fValueOf2, fValueOf2});
                eVar5.f14541c = 1400L;
                eVar5.b(fArr5);
                return eVar5.a();
        }
    }

    public b(int i10) {
        super(0);
        g(0.0f);
    }

    public b(Object obj) {
        super(0);
        setAlpha(153);
        g(0.0f);
    }

    public b(r rVar) {
        super(0);
        setAlpha(0);
    }

    public b(a aVar) {
        super(0);
        g(0.0f);
    }
}