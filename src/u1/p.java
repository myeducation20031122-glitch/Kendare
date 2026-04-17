package u1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.recyclerview.widget.g1;
import fc.t;
import java.io.IOException;
import java.util.ArrayDeque;
import o5.u;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p extends g {
    public static final PorterDuff.Mode M = PorterDuff.Mode.SRC_IN;

    /* renamed from: e, reason: collision with root package name */
    public n f18220e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuffColorFilter f18221f;

    /* renamed from: j, reason: collision with root package name */
    public ColorFilter f18222j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18223m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18224n;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f18225t;

    /* renamed from: u, reason: collision with root package name */
    public final Matrix f18226u;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f18227w;

    public p() {
        this.f18224n = true;
        this.f18225t = new float[9];
        this.f18226u = new Matrix();
        this.f18227w = new Rect();
        n nVar = new n();
        nVar.f18209c = null;
        nVar.f18210d = M;
        nVar.f18208b = new m();
        this.f18220e = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f18163b;
        if (drawable == null) {
            return false;
        }
        i0.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f18227w;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f18222j;
        if (colorFilter == null) {
            colorFilter = this.f18221f;
        }
        Matrix matrix = this.f18226u;
        canvas.getMatrix(matrix);
        float[] fArr = this.f18225t;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(g1.FLAG_MOVED, iWidth);
        int iMin2 = Math.min(g1.FLAG_MOVED, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && t.t(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n nVar = this.f18220e;
        Bitmap bitmap = nVar.f18212f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != nVar.f18212f.getHeight()) {
            nVar.f18212f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            nVar.f18217k = true;
        }
        if (this.f18224n) {
            n nVar2 = this.f18220e;
            if (nVar2.f18217k || nVar2.f18213g != nVar2.f18209c || nVar2.f18214h != nVar2.f18210d || nVar2.f18216j != nVar2.f18211e || nVar2.f18215i != nVar2.f18208b.getRootAlpha()) {
                n nVar3 = this.f18220e;
                nVar3.f18212f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f18212f);
                m mVar = nVar3.f18208b;
                mVar.a(mVar.f18198g, m.f18191p, canvas2, iMin, iMin2);
                n nVar4 = this.f18220e;
                nVar4.f18213g = nVar4.f18209c;
                nVar4.f18214h = nVar4.f18210d;
                nVar4.f18215i = nVar4.f18208b.getRootAlpha();
                nVar4.f18216j = nVar4.f18211e;
                nVar4.f18217k = false;
            }
        } else {
            n nVar5 = this.f18220e;
            nVar5.f18212f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f18212f);
            m mVar2 = nVar5.f18208b;
            mVar2.a(mVar2.f18198g, m.f18191p, canvas3, iMin, iMin2);
        }
        n nVar6 = this.f18220e;
        if (nVar6.f18208b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f18218l == null) {
                Paint paint2 = new Paint();
                nVar6.f18218l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f18218l.setAlpha(nVar6.f18208b.getRootAlpha());
            nVar6.f18218l.setColorFilter(colorFilter);
            paint = nVar6.f18218l;
        }
        canvas.drawBitmap(nVar6.f18212f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f18163b;
        return drawable != null ? drawable.getAlpha() : this.f18220e.f18208b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f18163b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f18220e.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f18163b;
        return drawable != null ? i0.a.c(drawable) : this.f18222j;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f18163b != null && Build.VERSION.SDK_INT >= 24) {
            return new o(this.f18163b.getConstantState());
        }
        this.f18220e.f18207a = getChangingConfigurations();
        return this.f18220e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f18163b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f18220e.f18208b.f18200i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f18163b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f18220e.f18208b.f18199h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f18163b;
        return drawable != null ? drawable.isAutoMirrored() : this.f18220e.f18211e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f18220e;
            if (nVar != null) {
                m mVar = nVar.f18208b;
                if (mVar.f18205n == null) {
                    mVar.f18205n = Boolean.valueOf(mVar.f18198g.a());
                }
                if (mVar.f18205n.booleanValue() || ((colorStateList = this.f18220e.f18209c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f18223m && super.mutate() == this) {
            n nVar = this.f18220e;
            n nVar2 = new n();
            nVar2.f18209c = null;
            nVar2.f18210d = M;
            if (nVar != null) {
                nVar2.f18207a = nVar.f18207a;
                m mVar = new m(nVar.f18208b);
                nVar2.f18208b = mVar;
                if (nVar.f18208b.f18196e != null) {
                    mVar.f18196e = new Paint(nVar.f18208b.f18196e);
                }
                if (nVar.f18208b.f18195d != null) {
                    nVar2.f18208b.f18195d = new Paint(nVar.f18208b.f18195d);
                }
                nVar2.f18209c = nVar.f18209c;
                nVar2.f18210d = nVar.f18210d;
                nVar2.f18211e = nVar.f18211e;
            }
            this.f18220e = nVar2;
            this.f18223m = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z7;
        PorterDuff.Mode mode;
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f18220e;
        ColorStateList colorStateList = nVar.f18209c;
        if (colorStateList == null || (mode = nVar.f18210d) == null) {
            z7 = false;
        } else {
            this.f18221f = a(colorStateList, mode);
            invalidateSelf();
            z7 = true;
        }
        m mVar = nVar.f18208b;
        if (mVar.f18205n == null) {
            mVar.f18205n = Boolean.valueOf(mVar.f18198g.a());
        }
        if (mVar.f18205n.booleanValue()) {
            boolean zB = nVar.f18208b.f18198g.b(iArr);
            nVar.f18217k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f18220e.f18208b.getRootAlpha() != i10) {
            this.f18220e.f18208b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            drawable.setAutoMirrored(z7);
        } else {
            this.f18220e.f18211e = z7;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f18222j = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            t.G(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            i0.a.h(drawable, colorStateList);
            return;
        }
        n nVar = this.f18220e;
        if (nVar.f18209c != colorStateList) {
            nVar.f18209c = colorStateList;
            this.f18221f = a(colorStateList, nVar.f18210d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            i0.a.i(drawable, mode);
            return;
        }
        n nVar = this.f18220e;
        if (nVar.f18210d != mode) {
            nVar.f18210d = mode;
            this.f18221f = a(nVar.f18209c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z10) {
        Drawable drawable = this.f18163b;
        return drawable != null ? drawable.setVisible(z7, z10) : super.setVisible(z7, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public p(n nVar) {
        this.f18224n = true;
        this.f18225t = new float[9];
        this.f18226u = new Matrix();
        this.f18227w = new Rect();
        this.f18220e = nVar;
        this.f18221f = a(nVar.f18209c, nVar.f18210d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        m mVar;
        int i10;
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            i0.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f18220e;
        nVar.f18208b = new m();
        TypedArray typedArrayX = g5.a.x(resources, theme, attributeSet, a.f18139a);
        n nVar2 = this.f18220e;
        m mVar2 = nVar2.f18208b;
        int i11 = !g5.a.s(xmlPullParser, "tintMode") ? -1 : typedArrayX.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i12 = 3;
        if (i11 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i11 != 5) {
            if (i11 != 9) {
                switch (i11) {
                    case y4.g.INTERRUPTED /* 14 */:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case y4.g.TIMEOUT /* 15 */:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case y4.g.CANCELED /* 16 */:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f18210d = mode;
        ColorStateList colorStateListA = null;
        if (g5.a.s(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayX.getValue(1, typedValue);
            int i13 = typedValue.type;
            if (i13 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i13 < 28 || i13 > 31) {
                Resources resources2 = typedArrayX.getResources();
                int resourceId = typedArrayX.getResourceId(1, 0);
                ThreadLocal threadLocal = g0.c.f12949a;
                try {
                    colorStateListA = g0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e10) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
                }
            } else {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            nVar2.f18209c = colorStateList;
        }
        boolean z7 = nVar2.f18211e;
        if (g5.a.s(xmlPullParser, "autoMirrored")) {
            z7 = typedArrayX.getBoolean(5, z7);
        }
        nVar2.f18211e = z7;
        float f10 = mVar2.f18201j;
        if (g5.a.s(xmlPullParser, "viewportWidth")) {
            f10 = typedArrayX.getFloat(7, f10);
        }
        mVar2.f18201j = f10;
        float f11 = mVar2.f18202k;
        if (g5.a.s(xmlPullParser, "viewportHeight")) {
            f11 = typedArrayX.getFloat(8, f11);
        }
        mVar2.f18202k = f11;
        if (mVar2.f18201j <= 0.0f) {
            throw new XmlPullParserException(typedArrayX.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 <= 0.0f) {
            throw new XmlPullParserException(typedArrayX.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        mVar2.f18199h = typedArrayX.getDimension(3, mVar2.f18199h);
        float dimension = typedArrayX.getDimension(2, mVar2.f18200i);
        mVar2.f18200i = dimension;
        if (mVar2.f18199h <= 0.0f) {
            throw new XmlPullParserException(typedArrayX.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayX.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = mVar2.getAlpha();
        if (g5.a.s(xmlPullParser, "alpha")) {
            alpha = typedArrayX.getFloat(4, alpha);
        }
        mVar2.setAlpha(alpha);
        String string = typedArrayX.getString(0);
        if (string != null) {
            mVar2.f18204m = string;
            mVar2.f18206o.put(string, mVar2);
        }
        typedArrayX.recycle();
        nVar.f18207a = getChangingConfigurations();
        nVar.f18217k = true;
        n nVar3 = this.f18220e;
        m mVar3 = nVar3.f18208b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(mVar3.f18198g);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        for (int i14 = 1; eventType != i14 && (xmlPullParser.getDepth() >= depth || eventType != i12); i14 = 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                j jVar = (j) arrayDeque.peek();
                boolean zEquals = "path".equals(name);
                t.b bVar = mVar3.f18206o;
                mVar = mVar3;
                if (zEquals) {
                    i iVar = new i();
                    iVar.f18165f = 0.0f;
                    iVar.f18167h = 1.0f;
                    iVar.f18168i = 1.0f;
                    iVar.f18169j = 0.0f;
                    iVar.f18170k = 1.0f;
                    iVar.f18171l = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    iVar.f18172m = cap;
                    Paint.Join join = Paint.Join.MITER;
                    iVar.f18173n = join;
                    i10 = depth;
                    iVar.f18174o = 4.0f;
                    TypedArray typedArrayX2 = g5.a.x(resources, theme, attributeSet, a.f18141c);
                    if (g5.a.s(xmlPullParser, "pathData")) {
                        String string2 = typedArrayX2.getString(0);
                        if (string2 != null) {
                            iVar.f18188b = string2;
                        }
                        String string3 = typedArrayX2.getString(2);
                        if (string3 != null) {
                            iVar.f18187a = u.e(string3);
                        }
                        iVar.f18166g = g5.a.o(typedArrayX2, xmlPullParser, theme, "fillColor", 1);
                        float f12 = iVar.f18168i;
                        if (g5.a.s(xmlPullParser, "fillAlpha")) {
                            f12 = typedArrayX2.getFloat(12, f12);
                        }
                        iVar.f18168i = f12;
                        int i15 = !g5.a.s(xmlPullParser, "strokeLineCap") ? -1 : typedArrayX2.getInt(8, -1);
                        iVar.f18172m = i15 != 0 ? i15 != 1 ? i15 != 2 ? iVar.f18172m : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i16 = !g5.a.s(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayX2.getInt(9, -1);
                        Paint.Join join2 = iVar.f18173n;
                        if (i16 != 0) {
                            join = i16 != 1 ? i16 != 2 ? join2 : Paint.Join.BEVEL : Paint.Join.ROUND;
                        }
                        iVar.f18173n = join;
                        float f13 = iVar.f18174o;
                        if (g5.a.s(xmlPullParser, "strokeMiterLimit")) {
                            f13 = typedArrayX2.getFloat(10, f13);
                        }
                        iVar.f18174o = f13;
                        iVar.f18164e = g5.a.o(typedArrayX2, xmlPullParser, theme, "strokeColor", 3);
                        float f14 = iVar.f18167h;
                        if (g5.a.s(xmlPullParser, "strokeAlpha")) {
                            f14 = typedArrayX2.getFloat(11, f14);
                        }
                        iVar.f18167h = f14;
                        float f15 = iVar.f18165f;
                        if (g5.a.s(xmlPullParser, "strokeWidth")) {
                            f15 = typedArrayX2.getFloat(4, f15);
                        }
                        iVar.f18165f = f15;
                        float f16 = iVar.f18170k;
                        if (g5.a.s(xmlPullParser, "trimPathEnd")) {
                            f16 = typedArrayX2.getFloat(6, f16);
                        }
                        iVar.f18170k = f16;
                        float f17 = iVar.f18171l;
                        if (g5.a.s(xmlPullParser, "trimPathOffset")) {
                            f17 = typedArrayX2.getFloat(7, f17);
                        }
                        iVar.f18171l = f17;
                        float f18 = iVar.f18169j;
                        if (g5.a.s(xmlPullParser, "trimPathStart")) {
                            f18 = typedArrayX2.getFloat(5, f18);
                        }
                        iVar.f18169j = f18;
                        int i17 = iVar.f18189c;
                        if (g5.a.s(xmlPullParser, "fillType")) {
                            i17 = typedArrayX2.getInt(13, i17);
                        }
                        iVar.f18189c = i17;
                    }
                    typedArrayX2.recycle();
                    jVar.f18176b.add(iVar);
                    if (iVar.getPathName() != null) {
                        bVar.put(iVar.getPathName(), iVar);
                    }
                    nVar3.f18207a |= iVar.f18190d;
                    z10 = false;
                } else {
                    i10 = depth;
                    if ("clip-path".equals(name)) {
                        h hVar = new h();
                        if (g5.a.s(xmlPullParser, "pathData")) {
                            TypedArray typedArrayX3 = g5.a.x(resources, theme, attributeSet, a.f18142d);
                            String string4 = typedArrayX3.getString(0);
                            if (string4 != null) {
                                hVar.f18188b = string4;
                            }
                            String string5 = typedArrayX3.getString(1);
                            if (string5 != null) {
                                hVar.f18187a = u.e(string5);
                            }
                            hVar.f18189c = !g5.a.s(xmlPullParser, "fillType") ? 0 : typedArrayX3.getInt(2, 0);
                            typedArrayX3.recycle();
                        }
                        jVar.f18176b.add(hVar);
                        if (hVar.getPathName() != null) {
                            bVar.put(hVar.getPathName(), hVar);
                        }
                        nVar3.f18207a |= hVar.f18190d;
                    } else if ("group".equals(name)) {
                        j jVar2 = new j();
                        TypedArray typedArrayX4 = g5.a.x(resources, theme, attributeSet, a.f18140b);
                        float f19 = jVar2.f18177c;
                        if (g5.a.s(xmlPullParser, "rotation")) {
                            f19 = typedArrayX4.getFloat(5, f19);
                        }
                        jVar2.f18177c = f19;
                        jVar2.f18178d = typedArrayX4.getFloat(1, jVar2.f18178d);
                        jVar2.f18179e = typedArrayX4.getFloat(2, jVar2.f18179e);
                        float f20 = jVar2.f18180f;
                        if (g5.a.s(xmlPullParser, "scaleX")) {
                            f20 = typedArrayX4.getFloat(3, f20);
                        }
                        jVar2.f18180f = f20;
                        float f21 = jVar2.f18181g;
                        if (g5.a.s(xmlPullParser, "scaleY")) {
                            f21 = typedArrayX4.getFloat(4, f21);
                        }
                        jVar2.f18181g = f21;
                        float f22 = jVar2.f18182h;
                        if (g5.a.s(xmlPullParser, "translateX")) {
                            f22 = typedArrayX4.getFloat(6, f22);
                        }
                        jVar2.f18182h = f22;
                        float f23 = jVar2.f18183i;
                        if (g5.a.s(xmlPullParser, "translateY")) {
                            f23 = typedArrayX4.getFloat(7, f23);
                        }
                        jVar2.f18183i = f23;
                        String string6 = typedArrayX4.getString(0);
                        if (string6 != null) {
                            jVar2.f18186l = string6;
                        }
                        jVar2.c();
                        typedArrayX4.recycle();
                        jVar.f18176b.add(jVar2);
                        arrayDeque.push(jVar2);
                        if (jVar2.getGroupName() != null) {
                            bVar.put(jVar2.getGroupName(), jVar2);
                        }
                        nVar3.f18207a = jVar2.f18185k | nVar3.f18207a;
                    }
                }
                i12 = 3;
            } else {
                mVar = mVar3;
                i10 = depth;
                i12 = 3;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            mVar3 = mVar;
            depth = i10;
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
        this.f18221f = a(nVar.f18209c, nVar.f18210d);
    }
}