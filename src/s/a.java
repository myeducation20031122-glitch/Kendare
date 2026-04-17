package s;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f16668a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f16669b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f16670c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f16671d;

    /* renamed from: e, reason: collision with root package name */
    public float f16672e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f16675h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f16676i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f16677j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16673f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16674g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f16678k = PorterDuff.Mode.SRC_IN;

    public a(float f10, ColorStateList colorStateList) {
        this.f16668a = f10;
        Paint paint = new Paint(5);
        this.f16669b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f16675h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f16675h.getDefaultColor()));
        this.f16670c = new RectF();
        this.f16671d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f16670c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f16671d;
        rect2.set(rect);
        if (this.f16673f) {
            rect2.inset((int) Math.ceil(b.a(this.f16672e, this.f16668a, this.f16674g)), (int) Math.ceil(b.b(this.f16672e, this.f16668a, this.f16674g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z7;
        Paint paint = this.f16669b;
        if (this.f16676i == null || paint.getColorFilter() != null) {
            z7 = false;
        } else {
            paint.setColorFilter(this.f16676i);
            z7 = true;
        }
        RectF rectF = this.f16670c;
        float f10 = this.f16668a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z7) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f16671d, this.f16668a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f16677j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f16675h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f16675h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f16669b;
        boolean z7 = colorForState != paint.getColor();
        if (z7) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f16677j;
        if (colorStateList2 == null || (mode = this.f16678k) == null) {
            return z7;
        }
        this.f16676i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f16669b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f16669b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f16677j = colorStateList;
        this.f16676i = a(colorStateList, this.f16678k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f16678k = mode;
        this.f16676i = a(this.f16677j, mode);
        invalidateSelf();
    }
}