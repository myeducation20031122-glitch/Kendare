package m3;

import android.graphics.Canvas;
import android.graphics.Rect;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a extends g {
    @Override // m3.g
    public final void h(Canvas canvas) {
        for (int i10 = 0; i10 < j(); i10++) {
            f fVarI = i(i10);
            int iSave = canvas.save();
            canvas.rotate((i10 * 360) / j(), getBounds().centerX(), getBounds().centerY());
            fVarI.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // m3.g, m3.f, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = f.a(rect);
        int iWidth = (int) (((rectA.width() * 3.141592653589793d) / 3.5999999046325684d) / j());
        int iCenterX = rectA.centerX() - iWidth;
        int iCenterX2 = rectA.centerX() + iWidth;
        for (int i10 = 0; i10 < j(); i10++) {
            f fVarI = i(i10);
            int i11 = rectA.top;
            fVarI.f(iCenterX, i11, iCenterX2, (iWidth * 2) + i11);
        }
    }
}