package n3;

import android.animation.ValueAnimator;
import android.graphics.Rect;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends m3.b {
    @Override // m3.f
    public final ValueAnimator d() {
        float[] fArr = {0.0f, 0.5f, 1.0f};
        l3.e eVar = new l3.e(this);
        eVar.e(fArr, m3.f.W, new Integer[]{0, -180, -180});
        eVar.e(fArr, m3.f.Y, new Integer[]{0, 0, -180});
        eVar.f14541c = 1200L;
        eVar.b(fArr);
        return eVar.a();
    }

    @Override // m3.f, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Rect rectA = m3.f.a(rect);
        f(rectA.left, rectA.top, rectA.right, rectA.bottom);
    }
}