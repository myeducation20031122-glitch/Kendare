package u1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f18155a;

    public d(Drawable.ConstantState constantState) {
        this.f18155a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f18155a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f18155a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f18155a.newDrawable();
        eVar.f18163b = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f18161n);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f18155a.newDrawable(resources);
        eVar.f18163b = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f18161n);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f18155a.newDrawable(resources, theme);
        eVar.f18163b = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f18161n);
        return eVar;
    }
}