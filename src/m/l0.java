package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l0 extends SeekBar {

    /* renamed from: b, reason: collision with root package name */
    public final m0 f14812b;

    public l0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130904076);
        d3.a(getContext(), this);
        m0 m0Var = new m0(this);
        this.f14812b = m0Var;
        m0Var.a(attributeSet, 2130904076);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m0 m0Var = this.f14812b;
        Drawable drawable = m0Var.f14817e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = m0Var.f14816d;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14812b.f14817e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f14812b.d(canvas);
    }
}