package m3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c extends f {

    /* renamed from: e0, reason: collision with root package name */
    public final Paint f15163e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f15164f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f15165g0;

    public c() {
        e(-1);
        Paint paint = new Paint();
        this.f15163e0 = paint;
        paint.setAntiAlias(true);
        paint.setColor(this.f15164f0);
    }

    @Override // m3.f
    public final void b(Canvas canvas) {
        Paint paint = this.f15163e0;
        paint.setColor(this.f15164f0);
        h(canvas, paint);
    }

    @Override // m3.f
    public final int c() {
        return this.f15165g0;
    }

    @Override // m3.f
    public final void e(int i10) {
        this.f15165g0 = i10;
        i();
    }

    public abstract void h(Canvas canvas, Paint paint);

    public final void i() {
        int i10 = this.R;
        int i11 = this.f15165g0;
        this.f15164f0 = ((((i11 >>> 24) * (i10 + (i10 >> 7))) >> 8) << 24) | ((i11 << 8) >>> 8);
    }

    @Override // m3.f, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.R = i10;
        i();
    }

    @Override // m3.f, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15163e0.setColorFilter(colorFilter);
    }
}