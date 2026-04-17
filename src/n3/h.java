package n3;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.PathInterpolator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h extends m3.c {
    public h() {
        g(0.0f);
    }

    @Override // m3.f
    public final ValueAnimator d() {
        float[] fArr = {0.0f, 0.7f, 1.0f};
        l3.e eVar = new l3.e(this);
        Float fValueOf = Float.valueOf(1.0f);
        eVar.d(fArr, m3.f.f15170c0, new Float[]{Float.valueOf(0.0f), fValueOf, fValueOf});
        eVar.e(fArr, m3.f.f15171d0, new Integer[]{255, 178, 0});
        eVar.f14541c = 1000L;
        q0.a aVar = new q0.a(new PathInterpolator(0.21f, 0.53f, 0.56f, 0.8f), new float[0]);
        aVar.f16093b = fArr;
        eVar.f14540b = aVar;
        return eVar.a();
    }

    @Override // m3.c
    public final void h(Canvas canvas, Paint paint) {
        if (this.S != null) {
            paint.setStyle(Paint.Style.STROKE);
            int iMin = Math.min(this.S.width(), this.S.height()) / 2;
            paint.setStrokeWidth(iMin / 12);
            canvas.drawCircle(this.S.centerX(), this.S.centerY(), iMin, paint);
        }
    }
}