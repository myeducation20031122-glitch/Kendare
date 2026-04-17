package v6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n extends s {

    /* renamed from: c, reason: collision with root package name */
    public final p f18477c;

    public n(p pVar) {
        this.f18477c = pVar;
    }

    @Override // v6.s
    public final void a(Matrix matrix, u6.a aVar, int i10, Canvas canvas) {
        p pVar = this.f18477c;
        float f10 = pVar.f18486f;
        float f11 = pVar.f18487g;
        RectF rectF = new RectF(pVar.f18482b, pVar.f18483c, pVar.f18484d, pVar.f18485e);
        aVar.getClass();
        boolean z7 = f11 < 0.0f;
        Path path = aVar.f18293g;
        int[] iArr = u6.a.f18285k;
        if (z7) {
            iArr[0] = 0;
            iArr[1] = aVar.f18292f;
            iArr[2] = aVar.f18291e;
            iArr[3] = aVar.f18290d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = aVar.f18290d;
            iArr[2] = aVar.f18291e;
            iArr[3] = aVar.f18292f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i10 / fWidth);
        float[] fArr = u6.a.f18286l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f18288b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z7) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f18294h);
        }
        canvas.drawArc(rectF, f10, f11, true, paint);
        canvas.restore();
    }
}