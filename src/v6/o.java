package v6;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o extends s {

    /* renamed from: c, reason: collision with root package name */
    public final q f18478c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18479d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18480e;

    public o(q qVar, float f10, float f11) {
        this.f18478c = qVar;
        this.f18479d = f10;
        this.f18480e = f11;
    }

    @Override // v6.s
    public final void a(Matrix matrix, u6.a aVar, int i10, Canvas canvas) {
        q qVar = this.f18478c;
        float f10 = qVar.f18489c;
        float f11 = this.f18480e;
        float f12 = qVar.f18488b;
        float f13 = this.f18479d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
        Matrix matrix2 = this.f18492a;
        matrix2.set(matrix);
        matrix2.preTranslate(f13, f11);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = u6.a.f18283i;
        iArr[0] = aVar.f18292f;
        iArr[1] = aVar.f18291e;
        iArr[2] = aVar.f18290d;
        Paint paint = aVar.f18289c;
        float f14 = rectF.left;
        paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, u6.a.f18284j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        q qVar = this.f18478c;
        return (float) Math.toDegrees(Math.atan((qVar.f18489c - this.f18480e) / (qVar.f18488b - this.f18479d)));
    }
}