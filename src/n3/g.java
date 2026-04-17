package n3;

import android.animation.ValueAnimator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends m3.b {

    /* renamed from: i0, reason: collision with root package name */
    public final /* synthetic */ int f15353i0;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(int i10) {
        this.f15353i0 = i10;
        int i11 = 0;
        if (i10 == 1) {
            super(i11);
        } else {
            super(i11);
            g(0.0f);
        }
    }

    @Override // m3.f
    public final ValueAnimator d() {
        switch (this.f15353i0) {
            case 0:
                float[] fArr = {0.0f, 1.0f};
                l3.e eVar = new l3.e(this);
                eVar.d(fArr, m3.f.f15170c0, new Float[]{Float.valueOf(0.0f), Float.valueOf(1.0f)});
                eVar.e(fArr, m3.f.f15171d0, new Integer[]{255, 0});
                eVar.f14541c = 1000L;
                eVar.b(fArr);
                return eVar.a();
            default:
                float[] fArr2 = {0.0f, 0.5f, 1.0f};
                l3.e eVar2 = new l3.e(this);
                eVar2.e(fArr2, m3.f.W, new Integer[]{0, -180, -180});
                eVar2.e(fArr2, m3.f.Y, new Integer[]{0, 0, -180});
                eVar2.f14541c = 1200L;
                eVar2.b(fArr2);
                return eVar2.a();
        }
    }
}