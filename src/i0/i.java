package i0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import fc.t;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class i extends Drawable implements Drawable.Callback, h, g {

    /* renamed from: t, reason: collision with root package name */
    public static final PorterDuff.Mode f13217t = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public int f13218b;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f13219e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13220f;

    /* renamed from: j, reason: collision with root package name */
    public k f13221j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13222m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f13223n;

    public i(Drawable drawable) {
        this.f13221j = b();
        c(drawable);
    }

    public abstract boolean a();

    public final k b() {
        k kVar = this.f13221j;
        k kVar2 = new k();
        kVar2.f13227c = null;
        kVar2.f13228d = f13217t;
        if (kVar != null) {
            kVar2.f13225a = kVar.f13225a;
            kVar2.f13226b = kVar.f13226b;
            kVar2.f13227c = kVar.f13227c;
            kVar2.f13228d = kVar.f13228d;
        }
        return kVar2;
    }

    public final void c(Drawable drawable) {
        Drawable drawable2 = this.f13223n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f13223n = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            k kVar = this.f13221j;
            if (kVar != null) {
                kVar.f13226b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean d(int[] iArr) {
        if (!a()) {
            return false;
        }
        k kVar = this.f13221j;
        ColorStateList colorStateList = kVar.f13227c;
        PorterDuff.Mode mode = kVar.f13228d;
        if (colorStateList == null || mode == null) {
            this.f13220f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f13220f || colorForState != this.f13218b || mode != this.f13219e) {
                setColorFilter(colorForState, mode);
                this.f13218b = colorForState;
                this.f13219e = mode;
                this.f13220f = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f13223n.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        k kVar = this.f13221j;
        return changingConfigurations | (kVar != null ? kVar.getChangingConfigurations() : 0) | this.f13223n.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        k kVar = this.f13221j;
        if (kVar == null || kVar.f13226b == null) {
            return null;
        }
        kVar.f13225a = getChangingConfigurations();
        return this.f13221j;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f13223n.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f13223n.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f13223n.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return t.t(this.f13223n);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f13223n.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f13223n.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f13223n.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f13223n.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f13223n.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f13223n.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f13223n.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        k kVar;
        ColorStateList colorStateList = (!a() || (kVar = this.f13221j) == null) ? null : kVar.f13227c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f13223n.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f13223n.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f13222m && super.mutate() == this) {
            this.f13221j = b();
            Drawable drawable = this.f13223n;
            if (drawable != null) {
                drawable.mutate();
            }
            k kVar = this.f13221j;
            if (kVar != null) {
                Drawable drawable2 = this.f13223n;
                kVar.f13226b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f13222m = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13223n;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        return t.F(this.f13223n, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        return this.f13223n.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f13223n.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z7) {
        this.f13223n.setAutoMirrored(z7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i10) {
        this.f13223n.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13223n.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z7) {
        this.f13223n.setDither(z7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z7) {
        this.f13223n.setFilterBitmap(z7);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return d(iArr) || this.f13223n.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f13221j.f13227c = colorStateList;
        d(this.f13223n.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f13221j.f13228d = mode;
        d(this.f13223n.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z10) {
        return super.setVisible(z7, z10) || this.f13223n.setVisible(z7, z10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public i(k kVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.f13221j = kVar;
        if (kVar == null || (constantState = kVar.f13226b) == null) {
            return;
        }
        c(constantState.newDrawable(resources));
    }
}