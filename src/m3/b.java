package m3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class b extends c {

    /* renamed from: h0, reason: collision with root package name */
    public final /* synthetic */ int f15162h0;

    public /* synthetic */ b(int i10) {
        this.f15162h0 = i10;
    }

    @Override // m3.c
    public final void h(Canvas canvas, Paint paint) {
        switch (this.f15162h0) {
            case 0:
                if (this.S != null) {
                    canvas.drawCircle(this.S.centerX(), this.S.centerY(), Math.min(r0.width(), this.S.height()) / 2, paint);
                    break;
                }
                break;
            default:
                Rect rect = this.S;
                if (rect != null) {
                    canvas.drawRect(rect, paint);
                    break;
                }
                break;
        }
    }
}