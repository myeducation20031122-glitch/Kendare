package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m0 extends h0 {

    /* renamed from: d, reason: collision with root package name */
    public final SeekBar f14816d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f14817e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f14818f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f14819g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14820h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14821i;

    public m0(SeekBar seekBar) {
        super(seekBar);
        this.f14818f = null;
        this.f14819g = null;
        this.f14820h = false;
        this.f14821i = false;
        this.f14816d = seekBar;
    }

    @Override // m.h0
    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, 2130904076);
        SeekBar seekBar = this.f14816d;
        Context context = seekBar.getContext();
        int[] iArr = f.a.f12630g;
        g.e eVarI = g.e.I(context, attributeSet, iArr, 2130904076);
        o0.c1.q(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) eVarI.f12764f, 2130904076);
        Drawable drawableV = eVarI.v(0);
        if (drawableV != null) {
            seekBar.setThumb(drawableV);
        }
        Drawable drawableU = eVarI.u(1);
        Drawable drawable = this.f14817e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f14817e = drawableU;
        if (drawableU != null) {
            drawableU.setCallback(seekBar);
            fc.t.F(drawableU, seekBar.getLayoutDirection());
            if (drawableU.isStateful()) {
                drawableU.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (eVarI.F(3)) {
            this.f14819g = t1.c(eVarI.y(3, -1), this.f14819g);
            this.f14821i = true;
        }
        if (eVarI.F(2)) {
            this.f14818f = eVarI.r(2);
            this.f14820h = true;
        }
        eVarI.L();
        c();
    }

    public final void c() {
        Drawable drawable = this.f14817e;
        if (drawable != null) {
            if (this.f14820h || this.f14821i) {
                Drawable drawableP = fc.t.P(drawable.mutate());
                this.f14817e = drawableP;
                if (this.f14820h) {
                    i0.a.h(drawableP, this.f14818f);
                }
                if (this.f14821i) {
                    i0.a.i(this.f14817e, this.f14819g);
                }
                if (this.f14817e.isStateful()) {
                    this.f14817e.setState(this.f14816d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f14817e != null) {
            int max = this.f14816d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f14817e.getIntrinsicWidth();
                int intrinsicHeight = this.f14817e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f14817e.setBounds(-i10, -i11, i10, i11);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f14817e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}