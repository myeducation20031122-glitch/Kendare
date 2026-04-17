package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import fc.t;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int P = 0;
    public long M;
    public long N;
    public f O;

    /* renamed from: b, reason: collision with root package name */
    public g f13132b;

    /* renamed from: e, reason: collision with root package name */
    public Rect f13133e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f13134f;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f13135j;

    /* renamed from: m, reason: collision with root package name */
    public int f13136m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13137n;

    /* renamed from: t, reason: collision with root package name */
    public int f13138t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13139u;

    /* renamed from: w, reason: collision with root package name */
    public androidx.activity.i f13140w;

    public final void a(boolean z7) {
        boolean z10;
        boolean z11 = true;
        this.f13137n = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable = this.f13134f;
        if (drawable != null) {
            long j10 = this.M;
            if (j10 == 0) {
                z10 = false;
            } else if (j10 <= jUptimeMillis) {
                drawable.setAlpha(this.f13136m);
                this.M = 0L;
                z10 = false;
            } else {
                drawable.setAlpha(((255 - (((int) ((j10 - jUptimeMillis) * 255)) / this.f13132b.f13130y)) * this.f13136m) / 255);
                z10 = true;
            }
        } else {
            this.M = 0L;
            z10 = false;
        }
        Drawable drawable2 = this.f13135j;
        if (drawable2 != null) {
            long j11 = this.N;
            if (j11 == 0) {
                z11 = z10;
            } else if (j11 <= jUptimeMillis) {
                drawable2.setVisible(false, false);
                this.f13135j = null;
                this.N = 0L;
                z11 = z10;
            } else {
                drawable2.setAlpha(((((int) ((j11 - jUptimeMillis) * 255)) / this.f13132b.f13131z) * this.f13136m) / 255);
            }
        } else {
            this.N = 0L;
            z11 = z10;
        }
        if (z7 && z11) {
            scheduleSelf(this.f13140w, jUptimeMillis + 16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        g gVar = this.f13132b;
        if (theme == null) {
            gVar.getClass();
            return;
        }
        gVar.c();
        int i10 = gVar.f13113h;
        Drawable[] drawableArr = gVar.f13112g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null && i0.a.b(drawable)) {
                i0.a.a(drawableArr[i11], theme);
                gVar.f13110e |= drawableArr[i11].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            gVar.f13107b = resources;
            int i12 = resources.getDisplayMetrics().densityDpi;
            if (i12 == 0) {
                i12 = 160;
            }
            int i13 = gVar.f13108c;
            gVar.f13108c = i12;
            if (i13 != i12) {
                gVar.f13118m = false;
                gVar.f13115j = false;
            }
        }
    }

    public final void b(Drawable drawable) {
        if (this.O == null) {
            this.O = new f();
        }
        f fVar = this.O;
        fVar.f13105e = drawable.getCallback();
        drawable.setCallback(fVar);
        try {
            if (this.f13132b.f13130y <= 0 && this.f13137n) {
                drawable.setAlpha(this.f13136m);
            }
            g gVar = this.f13132b;
            if (gVar.C) {
                drawable.setColorFilter(gVar.B);
            } else {
                if (gVar.F) {
                    i0.a.h(drawable, gVar.D);
                }
                g gVar2 = this.f13132b;
                if (gVar2.G) {
                    i0.a.i(drawable, gVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f13132b.f13128w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                t.F(drawable, t.t(this));
            }
            drawable.setAutoMirrored(this.f13132b.A);
            Rect rect = this.f13133e;
            if (rect != null) {
                i0.a.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            f fVar2 = this.O;
            Drawable.Callback callback = (Drawable.Callback) fVar2.f13105e;
            fVar2.f13105e = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            f fVar3 = this.O;
            Drawable.Callback callback2 = (Drawable.Callback) fVar3.f13105e;
            fVar3.f13105e = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i10) {
        if (i10 == this.f13138t) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f13132b.f13131z > 0) {
            Drawable drawable = this.f13135j;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f13134f;
            if (drawable2 != null) {
                this.f13135j = drawable2;
                this.N = this.f13132b.f13131z + jUptimeMillis;
            } else {
                this.f13135j = null;
                this.N = 0L;
            }
        } else {
            Drawable drawable3 = this.f13134f;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i10 >= 0) {
            g gVar = this.f13132b;
            if (i10 < gVar.f13113h) {
                Drawable drawableD = gVar.d(i10);
                this.f13134f = drawableD;
                this.f13138t = i10;
                if (drawableD != null) {
                    int i11 = this.f13132b.f13130y;
                    if (i11 > 0) {
                        this.M = jUptimeMillis + i11;
                    }
                    b(drawableD);
                }
            } else {
                this.f13134f = null;
                this.f13138t = -1;
            }
        }
        if (this.M != 0 || this.N != 0) {
            androidx.activity.i iVar = this.f13140w;
            if (iVar == null) {
                this.f13140w = new androidx.activity.i(this, 2);
            } else {
                unscheduleSelf(iVar);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f13132b.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f13134f;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f13135j;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f13136m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f13132b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        g gVar = this.f13132b;
        if (!gVar.f13126u) {
            gVar.c();
            gVar.f13126u = true;
            int i10 = gVar.f13113h;
            Drawable[] drawableArr = gVar.f13112g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    gVar.f13127v = false;
                    return null;
                }
            }
            gVar.f13127v = true;
        } else if (!gVar.f13127v) {
            return null;
        }
        this.f13132b.f13109d = getChangingConfigurations();
        return this.f13132b;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f13134f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f13133e;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        g gVar = this.f13132b;
        if (gVar.f13117l) {
            if (!gVar.f13118m) {
                gVar.b();
            }
            return gVar.f13120o;
        }
        Drawable drawable = this.f13134f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        g gVar = this.f13132b;
        if (gVar.f13117l) {
            if (!gVar.f13118m) {
                gVar.b();
            }
            return gVar.f13119n;
        }
        Drawable drawable = this.f13134f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        g gVar = this.f13132b;
        if (gVar.f13117l) {
            if (!gVar.f13118m) {
                gVar.b();
            }
            return gVar.f13122q;
        }
        Drawable drawable = this.f13134f;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        g gVar = this.f13132b;
        if (gVar.f13117l) {
            if (!gVar.f13118m) {
                gVar.b();
            }
            return gVar.f13121p;
        }
        Drawable drawable = this.f13134f;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f13134f;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        g gVar = this.f13132b;
        if (gVar.f13123r) {
            return gVar.f13124s;
        }
        gVar.c();
        int i10 = gVar.f13113h;
        Drawable[] drawableArr = gVar.f13112g;
        int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i11 = 1; i11 < i10; i11++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
        }
        gVar.f13124s = opacity;
        gVar.f13123r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f13134f;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        g gVar = this.f13132b;
        boolean padding = false;
        Rect rect2 = null;
        if (!gVar.f13114i) {
            Rect rect3 = gVar.f13116k;
            if (rect3 != null || gVar.f13115j) {
                rect2 = rect3;
            } else {
                gVar.c();
                Rect rect4 = new Rect();
                int i10 = gVar.f13113h;
                Drawable[] drawableArr = gVar.f13112g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                gVar.f13115j = true;
                gVar.f13116k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f13134f;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f13132b.A && t.t(this) == 1) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        g gVar = this.f13132b;
        if (gVar != null) {
            gVar.f13123r = false;
            gVar.f13125t = false;
        }
        if (drawable != this.f13134f || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f13132b.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z7;
        Drawable drawable = this.f13135j;
        boolean z10 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f13135j = null;
            z7 = true;
        } else {
            z7 = false;
        }
        Drawable drawable2 = this.f13134f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f13137n) {
                this.f13134f.setAlpha(this.f13136m);
            }
        }
        if (this.N != 0) {
            this.N = 0L;
        } else {
            z10 = z7;
        }
        if (this.M != 0) {
            this.M = 0L;
        } else if (!z10) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f13139u && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.S, eVar, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            d(bVar);
            this.f13139u = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13135j;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f13134f;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        g gVar = this.f13132b;
        int i11 = this.f13138t;
        int i12 = gVar.f13113h;
        Drawable[] drawableArr = gVar.f13112g;
        boolean z7 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                boolean zF = Build.VERSION.SDK_INT >= 23 ? t.F(drawable, i10) : false;
                if (i13 == i11) {
                    z7 = zF;
                }
            }
        }
        gVar.f13129x = i10;
        return z7;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f13135j;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f13134f;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f13134f || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f13137n && this.f13136m == i10) {
            return;
        }
        this.f13137n = true;
        this.f13136m = i10;
        Drawable drawable = this.f13134f;
        if (drawable != null) {
            if (this.M == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z7) {
        g gVar = this.f13132b;
        if (gVar.A != z7) {
            gVar.A = z7;
            Drawable drawable = this.f13134f;
            if (drawable != null) {
                drawable.setAutoMirrored(z7);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        g gVar = this.f13132b;
        gVar.C = true;
        if (gVar.B != colorFilter) {
            gVar.B = colorFilter;
            Drawable drawable = this.f13134f;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z7) {
        g gVar = this.f13132b;
        if (gVar.f13128w != z7) {
            gVar.f13128w = z7;
            Drawable drawable = this.f13134f;
            if (drawable != null) {
                drawable.setDither(z7);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f13134f;
        if (drawable != null) {
            i0.a.e(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f13133e;
        if (rect == null) {
            this.f13133e = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f13134f;
        if (drawable != null) {
            i0.a.f(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        g gVar = this.f13132b;
        gVar.F = true;
        if (gVar.D != colorStateList) {
            gVar.D = colorStateList;
            t.H(this.f13134f, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        g gVar = this.f13132b;
        gVar.G = true;
        if (gVar.E != mode) {
            gVar.E = mode;
            t.I(this.f13134f, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z10) {
        boolean visible = super.setVisible(z7, z10);
        Drawable drawable = this.f13135j;
        if (drawable != null) {
            drawable.setVisible(z7, z10);
        }
        Drawable drawable2 = this.f13134f;
        if (drawable2 != null) {
            drawable2.setVisible(z7, z10);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f13134f || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}