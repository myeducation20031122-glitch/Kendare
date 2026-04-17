package b3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends Drawable implements f, Animatable {
    public Rect M;

    /* renamed from: b, reason: collision with root package name */
    public final b f1850b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1851e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1852f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1853j;

    /* renamed from: n, reason: collision with root package name */
    public int f1855n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1857u;

    /* renamed from: w, reason: collision with root package name */
    public Paint f1858w;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1854m = true;

    /* renamed from: t, reason: collision with root package name */
    public final int f1856t = -1;

    public c(b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f1850b = bVar;
    }

    public final void a() {
        g5.a.c("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f1853j);
        h hVar = this.f1850b.f1849a;
        if (((p2.e) hVar.f1869a).f15907l.f15883c != 1) {
            if (this.f1851e) {
                return;
            }
            this.f1851e = true;
            if (hVar.f1878j) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            }
            ArrayList arrayList = hVar.f1871c;
            if (arrayList.contains(this)) {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            boolean zIsEmpty = arrayList.isEmpty();
            arrayList.add(this);
            if (zIsEmpty && !hVar.f1874f) {
                hVar.f1874f = true;
                hVar.f1878j = false;
                hVar.a();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f1853j) {
            return;
        }
        if (this.f1857u) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.M == null) {
                this.M = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.M);
            this.f1857u = false;
        }
        h hVar = this.f1850b.f1849a;
        e eVar = hVar.f1877i;
        Bitmap bitmap = eVar != null ? eVar.f1866t : hVar.f1880l;
        if (this.M == null) {
            this.M = new Rect();
        }
        Rect rect = this.M;
        if (this.f1858w == null) {
            this.f1858w = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f1858w);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1850b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f1850b.f1849a.f1884p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f1850b.f1849a.f1883o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f1851e;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1857u = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f1858w == null) {
            this.f1858w = new Paint(2);
        }
        this.f1858w.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f1858w == null) {
            this.f1858w = new Paint(2);
        }
        this.f1858w.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z10) {
        g5.a.c("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f1853j);
        this.f1854m = z7;
        if (!z7) {
            this.f1851e = false;
            h hVar = this.f1850b.f1849a;
            ArrayList arrayList = hVar.f1871c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                hVar.f1874f = false;
            }
        } else if (this.f1852f) {
            a();
        }
        return super.setVisible(z7, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f1852f = true;
        this.f1855n = 0;
        if (this.f1854m) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f1852f = false;
        this.f1851e = false;
        h hVar = this.f1850b.f1849a;
        ArrayList arrayList = hVar.f1871c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            hVar.f1874f = false;
        }
    }
}