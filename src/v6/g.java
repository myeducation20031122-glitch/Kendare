package v6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.gms.internal.ads.sg1;
import java.util.BitSet;
import java.util.Objects;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class g extends Drawable implements i0.g, u {

    /* renamed from: a0, reason: collision with root package name */
    public static final Paint f18439a0;
    public final RectF M;
    public final Region N;
    public final Region O;
    public j P;
    public final Paint Q;
    public final Paint R;
    public final u6.a S;
    public final p5.g T;
    public final l U;
    public PorterDuffColorFilter V;
    public PorterDuffColorFilter W;
    public int X;
    public final RectF Y;
    public final boolean Z;

    /* renamed from: b, reason: collision with root package name */
    public f f18440b;

    /* renamed from: e, reason: collision with root package name */
    public final s[] f18441e;

    /* renamed from: f, reason: collision with root package name */
    public final s[] f18442f;

    /* renamed from: j, reason: collision with root package name */
    public final BitSet f18443j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18444m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f18445n;

    /* renamed from: t, reason: collision with root package name */
    public final Path f18446t;

    /* renamed from: u, reason: collision with root package name */
    public final Path f18447u;

    /* renamed from: w, reason: collision with root package name */
    public final RectF f18448w;

    static {
        Paint paint = new Paint(1);
        f18439a0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new j());
    }

    public final void b(RectF rectF, Path path) {
        l lVar = this.U;
        f fVar = this.f18440b;
        lVar.a(fVar.f18418a, fVar.f18427j, rectF, this.T, path);
        if (this.f18440b.f18426i != 1.0f) {
            Matrix matrix = this.f18445n;
            matrix.reset();
            float f10 = this.f18440b.f18426i;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.Y, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z7) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z7) {
                colorForState = d(colorForState);
            }
            this.X = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z7) {
            int color = paint.getColor();
            int iD = d(color);
            this.X = iD;
            porterDuffColorFilter = iD != color ? new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN) : null;
        }
        return porterDuffColorFilter;
    }

    public final int d(int i10) {
        int i11;
        f fVar = this.f18440b;
        float f10 = fVar.f18431n + fVar.f18432o + fVar.f18430m;
        n6.a aVar = fVar.f18419b;
        if (aVar == null || !aVar.f15358a || h0.a.d(i10, 255) != aVar.f15361d) {
            return i10;
        }
        float fMin = (aVar.f15362e <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f10 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i10);
        int iF = j4.F(h0.a.d(i10, 255), fMin, aVar.f15359b);
        if (fMin > 0.0f && (i11 = aVar.f15360c) != 0) {
            iF = h0.a.b(h0.a.d(i11, n6.a.f15357f), iF);
        }
        return h0.a.d(iF, iAlpha);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00de  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        Paint paint = this.Q;
        paint.setColorFilter(this.V);
        int alpha = paint.getAlpha();
        int i10 = this.f18440b.f18429l;
        paint.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.R;
        paint2.setColorFilter(this.W);
        paint2.setStrokeWidth(this.f18440b.f18428k);
        int alpha2 = paint2.getAlpha();
        int i11 = this.f18440b.f18429l;
        paint2.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        boolean z7 = this.f18444m;
        Path path = this.f18446t;
        if (z7) {
            float strokeWidth = i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            j jVar = this.f18440b.f18418a;
            sg1 sg1Var = new sg1(-strokeWidth);
            q3.l lVarE = jVar.e();
            lVarE.f16192e = sg1Var.a(jVar.f18454e);
            lVarE.f16193f = sg1Var.a(jVar.f18455f);
            lVarE.f16195h = sg1Var.a(jVar.f18457h);
            lVarE.f16194g = sg1Var.a(jVar.f18456g);
            j jVarA = lVarE.a();
            this.P = jVarA;
            l lVar = this.U;
            float f10 = this.f18440b.f18427j;
            RectF rectF = this.M;
            rectF.set(h());
            float strokeWidth2 = i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth2, strokeWidth2);
            lVar.a(jVarA, f10, rectF, null, this.f18447u);
            b(h(), path);
            this.f18444m = false;
        }
        f fVar = this.f18440b;
        int i12 = fVar.f18433p;
        if (i12 != 1 && fVar.f18434q > 0) {
            if (i12 != 2) {
                int i13 = Build.VERSION.SDK_INT;
                if (!fVar.f18418a.d(h()) && !path.isConvex() && i13 < 29) {
                    canvas.save();
                    f fVar2 = this.f18440b;
                    int iSin = (int) (Math.sin(Math.toRadians(fVar2.f18436s)) * fVar2.f18435r);
                    f fVar3 = this.f18440b;
                    canvas.translate(iSin, (int) (Math.cos(Math.toRadians(fVar3.f18436s)) * fVar3.f18435r));
                    if (this.Z) {
                        RectF rectF2 = this.Y;
                        int iWidth = (int) (rectF2.width() - getBounds().width());
                        int iHeight = (int) (rectF2.height() - getBounds().height());
                        if (iWidth < 0 || iHeight < 0) {
                            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f18440b.f18434q * 2) + ((int) rectF2.width()) + iWidth, (this.f18440b.f18434q * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                        float f11 = (getBounds().left - this.f18440b.f18434q) - iWidth;
                        float f12 = (getBounds().top - this.f18440b.f18434q) - iHeight;
                        canvas2.translate(-f11, -f12);
                        e(canvas2);
                        canvas.drawBitmap(bitmapCreateBitmap, f11, f12, (Paint) null);
                        bitmapCreateBitmap.recycle();
                    } else {
                        e(canvas);
                    }
                    canvas.restore();
                }
            }
        }
        f fVar4 = this.f18440b;
        Paint.Style style = fVar4.f18438u;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            f(canvas, paint, path, fVar4.f18418a, h());
        }
        if (i()) {
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.f18443j.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f18440b.f18435r;
        Path path = this.f18446t;
        u6.a aVar = this.S;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.f18287a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            s sVar = this.f18441e[i11];
            int i12 = this.f18440b.f18434q;
            Matrix matrix = s.f18491b;
            sVar.a(matrix, aVar, i12, canvas);
            this.f18442f[i11].a(matrix, aVar, this.f18440b.f18434q, canvas);
        }
        if (this.Z) {
            f fVar = this.f18440b;
            int iSin = (int) (Math.sin(Math.toRadians(fVar.f18436s)) * fVar.f18435r);
            f fVar2 = this.f18440b;
            int iCos = (int) (Math.cos(Math.toRadians(fVar2.f18436s)) * fVar2.f18435r);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f18439a0);
            canvas.translate(iSin, iCos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, j jVar, RectF rectF) {
        if (!jVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = jVar.f18455f.a(rectF) * this.f18440b.f18427j;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void g(Canvas canvas) {
        Paint paint = this.R;
        Path path = this.f18447u;
        j jVar = this.P;
        RectF rectF = this.M;
        rectF.set(h());
        float strokeWidth = i() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        f(canvas, paint, path, jVar, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f18440b.f18429l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f18440b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        f fVar = this.f18440b;
        if (fVar.f18433p == 2) {
            return;
        }
        if (fVar.f18418a.d(h())) {
            outline.setRoundRect(getBounds(), this.f18440b.f18418a.f18454e.a(h()) * this.f18440b.f18427j);
            return;
        }
        RectF rectFH = h();
        Path path = this.f18446t;
        b(rectFH, path);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            m6.c.a(outline, path);
            return;
        }
        if (i10 >= 29) {
            try {
                m6.b.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            m6.b.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f18440b.f18425h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.N;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.f18446t;
        b(rectFH, path);
        Region region2 = this.O;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.f18448w;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean i() {
        Paint.Style style = this.f18440b.f18438u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.R.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f18444m = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f18440b.f18423f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f18440b.f18422e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f18440b.f18421d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f18440b.f18420c) != null && colorStateList4.isStateful())));
    }

    public final void j(Context context) {
        this.f18440b.f18419b = new n6.a(context);
        o();
    }

    public final void k(float f10) {
        f fVar = this.f18440b;
        if (fVar.f18431n != f10) {
            fVar.f18431n = f10;
            o();
        }
    }

    public final void l(ColorStateList colorStateList) {
        f fVar = this.f18440b;
        if (fVar.f18420c != colorStateList) {
            fVar.f18420c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean m(int[] iArr) {
        boolean z7;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f18440b.f18420c == null || color2 == (colorForState2 = this.f18440b.f18420c.getColorForState(iArr, (color2 = (paint2 = this.Q).getColor())))) {
            z7 = false;
        } else {
            paint2.setColor(colorForState2);
            z7 = true;
        }
        if (this.f18440b.f18421d == null || color == (colorForState = this.f18440b.f18421d.getColorForState(iArr, (color = (paint = this.R).getColor())))) {
            return z7;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f18440b = new f(this.f18440b);
        return this;
    }

    public final boolean n() {
        PorterDuffColorFilter porterDuffColorFilter = this.V;
        PorterDuffColorFilter porterDuffColorFilter2 = this.W;
        f fVar = this.f18440b;
        this.V = c(fVar.f18423f, fVar.f18424g, this.Q, true);
        f fVar2 = this.f18440b;
        this.W = c(fVar2.f18422e, fVar2.f18424g, this.R, false);
        f fVar3 = this.f18440b;
        if (fVar3.f18437t) {
            int colorForState = fVar3.f18423f.getColorForState(getState(), 0);
            u6.a aVar = this.S;
            aVar.getClass();
            aVar.f18290d = h0.a.d(colorForState, 68);
            aVar.f18291e = h0.a.d(colorForState, 20);
            aVar.f18292f = h0.a.d(colorForState, 0);
            aVar.f18287a.setColor(aVar.f18290d);
        }
        return (Objects.equals(porterDuffColorFilter, this.V) && Objects.equals(porterDuffColorFilter2, this.W)) ? false : true;
    }

    public final void o() {
        f fVar = this.f18440b;
        float f10 = fVar.f18431n + fVar.f18432o;
        fVar.f18434q = (int) Math.ceil(0.75f * f10);
        this.f18440b.f18435r = (int) Math.ceil(f10 * 0.25f);
        n();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f18444m = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, p6.i
    public boolean onStateChange(int[] iArr) {
        boolean z7 = m(iArr) || n();
        if (z7) {
            invalidateSelf();
        }
        return z7;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        f fVar = this.f18440b;
        if (fVar.f18429l != i10) {
            fVar.f18429l = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f18440b.getClass();
        super.invalidateSelf();
    }

    @Override // v6.u
    public final void setShapeAppearanceModel(j jVar) {
        this.f18440b.f18418a = jVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f18440b.f18423f = colorStateList;
        n();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f18440b;
        if (fVar.f18424g != mode) {
            fVar.f18424g = mode;
            n();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(j.b(context, attributeSet, i10, i11).a());
    }

    public g(f fVar) {
        l lVar;
        this.f18441e = new s[4];
        this.f18442f = new s[4];
        this.f18443j = new BitSet(8);
        this.f18445n = new Matrix();
        this.f18446t = new Path();
        this.f18447u = new Path();
        this.f18448w = new RectF();
        this.M = new RectF();
        this.N = new Region();
        this.O = new Region();
        Paint paint = new Paint(1);
        this.Q = paint;
        Paint paint2 = new Paint(1);
        this.R = paint2;
        this.S = new u6.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = k.f18462a;
        } else {
            lVar = new l();
        }
        this.U = lVar;
        this.Y = new RectF();
        this.Z = true;
        this.f18440b = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        n();
        m(getState());
        this.T = new p5.g(this);
    }

    public g(j jVar) {
        this(new f(jVar));
    }
}