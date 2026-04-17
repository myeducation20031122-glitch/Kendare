package t6;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import i0.g;
import v6.j;
import v6.u;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends Drawable implements u, g {

    /* renamed from: b, reason: collision with root package name */
    public a f17729b;

    public b(a aVar) {
        this.f17729b = aVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        a aVar = this.f17729b;
        if (aVar.f17728b) {
            aVar.f17727a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f17729b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f17729b.f17727a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f17729b = new a(this.f17729b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f17729b.f17727a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f17729b.f17727a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zC = d.c(iArr);
        a aVar = this.f17729b;
        if (aVar.f17728b == zC) {
            return zOnStateChange;
        }
        aVar.f17728b = zC;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f17729b.f17727a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17729b.f17727a.setColorFilter(colorFilter);
    }

    @Override // v6.u
    public final void setShapeAppearanceModel(j jVar) {
        this.f17729b.f17727a.setShapeAppearanceModel(jVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        this.f17729b.f17727a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f17729b.f17727a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f17729b.f17727a.setTintMode(mode);
    }
}