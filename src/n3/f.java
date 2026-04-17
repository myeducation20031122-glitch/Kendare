package n3;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends m3.g {
    @Override // m3.g
    public final void h(Canvas canvas) {
        Rect rectA = m3.f.a(getBounds());
        for (int i10 = 0; i10 < j(); i10++) {
            int iSave = canvas.save();
            canvas.rotate((i10 * 90) + 45, rectA.centerX(), rectA.centerY());
            i(i10).draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // m3.g
    public final m3.f[] l() {
        e[] eVarArr = new e[4];
        for (int i10 = 0; i10 < 4; i10++) {
            e eVar = new e(0);
            eVarArr[i10] = eVar;
            eVar.f15177n = Build.VERSION.SDK_INT >= 24 ? i10 * 300 : (i10 * 300) - 1200;
        }
        return eVarArr;
    }

    @Override // m3.g, m3.f, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = m3.f.a(rect);
        int iMin = Math.min(rectA.width(), rectA.height()) / 2;
        int i10 = rectA.left + iMin + 1;
        int i11 = rectA.top + iMin + 1;
        for (int i12 = 0; i12 < j(); i12++) {
            m3.f fVarI = i(i12);
            fVarI.f(rectA.left, rectA.top, i10, i11);
            Rect rect2 = fVarI.S;
            fVarI.f15175j = rect2.right;
            fVarI.f15176m = rect2.bottom;
        }
    }
}