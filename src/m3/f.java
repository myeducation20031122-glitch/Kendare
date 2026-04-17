package m3;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class f extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, Drawable.Callback {
    public static final Rect V = new Rect();
    public static final e W;
    public static final e X;
    public static final e Y;
    public static final d Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final d f15168a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final d f15169b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final d f15170c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final e f15171d0;
    public int M;
    public int N;
    public float O;
    public float P;
    public ValueAnimator Q;

    /* renamed from: j, reason: collision with root package name */
    public float f15175j;

    /* renamed from: m, reason: collision with root package name */
    public float f15176m;

    /* renamed from: n, reason: collision with root package name */
    public int f15177n;

    /* renamed from: t, reason: collision with root package name */
    public int f15178t;

    /* renamed from: u, reason: collision with root package name */
    public int f15179u;

    /* renamed from: w, reason: collision with root package name */
    public int f15180w;

    /* renamed from: b, reason: collision with root package name */
    public float f15172b = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f15173e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f15174f = 1.0f;
    public int R = 255;
    public Rect S = V;
    public final Camera T = new Camera();
    public final Matrix U = new Matrix();

    static {
        int i10 = 1;
        W = new e("rotateX", i10);
        int i11 = 2;
        X = new e("rotate", i11);
        int i12 = 3;
        Y = new e("rotateY", i12);
        int i13 = 4;
        new e("translateX", i13);
        new e("translateY", 5);
        Z = new d("translateXPercentage", i10);
        f15168a0 = new d("translateYPercentage", i11);
        new d("scaleX", i12);
        f15169b0 = new d("scaleY", i13);
        int i14 = 0;
        f15170c0 = new d("scale", i14);
        f15171d0 = new e("alpha", i14);
    }

    public static Rect a(Rect rect) {
        int iMin = Math.min(rect.width(), rect.height());
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        int i10 = iMin / 2;
        return new Rect(iCenterX - i10, iCenterY - i10, iCenterX + i10, iCenterY + i10);
    }

    public abstract void b(Canvas canvas);

    public abstract int c();

    public abstract ValueAnimator d();

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iWidth = this.f15180w;
        if (iWidth == 0) {
            iWidth = (int) (getBounds().width() * this.O);
        }
        int iHeight = this.M;
        if (iHeight == 0) {
            iHeight = (int) (getBounds().height() * this.P);
        }
        canvas.translate(iWidth, iHeight);
        canvas.scale(this.f15173e, this.f15174f, this.f15175j, this.f15176m);
        canvas.rotate(this.N, this.f15175j, this.f15176m);
        if (this.f15178t != 0 || this.f15179u != 0) {
            Camera camera = this.T;
            camera.save();
            camera.rotateX(this.f15178t);
            camera.rotateY(this.f15179u);
            Matrix matrix = this.U;
            camera.getMatrix(matrix);
            matrix.preTranslate(-this.f15175j, -this.f15176m);
            matrix.postTranslate(this.f15175j, this.f15176m);
            camera.restore();
            canvas.concat(matrix);
        }
        b(canvas);
    }

    public abstract void e(int i10);

    public final void f(int i10, int i11, int i12, int i13) {
        this.S = new Rect(i10, i11, i12, i13);
        this.f15175j = r0.centerX();
        this.f15176m = this.S.centerY();
    }

    public final void g(float f10) {
        this.f15172b = f10;
        this.f15173e = f10;
        this.f15174f = f10;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.R;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        ValueAnimator valueAnimator = this.Q;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.R = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            if (this.Q == null) {
                this.Q = d();
            }
            ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(this);
                this.Q.setStartDelay(this.f15177n);
            }
            ValueAnimator valueAnimator3 = this.Q;
            this.Q = valueAnimator3;
            if (valueAnimator3 == null) {
                return;
            }
            if (!valueAnimator3.isStarted()) {
                valueAnimator3.start();
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.Q.removeAllUpdateListeners();
        this.Q.end();
        this.f15172b = 1.0f;
        this.f15178t = 0;
        this.f15179u = 0;
        this.f15180w = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0.0f;
        this.P = 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }
}