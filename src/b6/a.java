package b6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import o0.c1;
import p6.i;
import p6.j;
import p6.n;
import q3.l;
import s6.d;
import v6.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends Drawable implements i {
    public float M;
    public float N;
    public WeakReference O;
    public WeakReference P;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f1934b;

    /* renamed from: e, reason: collision with root package name */
    public final g f1935e;

    /* renamed from: f, reason: collision with root package name */
    public final j f1936f;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f1937j;

    /* renamed from: m, reason: collision with root package name */
    public final c f1938m;

    /* renamed from: n, reason: collision with root package name */
    public float f1939n;

    /* renamed from: t, reason: collision with root package name */
    public float f1940t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1941u;

    /* renamed from: w, reason: collision with root package name */
    public float f1942w;

    public a(Context context, b bVar) {
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f1934b = weakReference;
        n.c(context, n.f16060b, "Theme.MaterialComponents");
        this.f1937j = new Rect();
        j jVar = new j(this);
        this.f1936f = jVar;
        TextPaint textPaint = jVar.f16050a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        c cVar = new c(context, bVar);
        this.f1938m = cVar;
        boolean zE = e();
        b bVar2 = cVar.f1960b;
        g gVar = new g(v6.j.a(context, zE ? bVar2.f1956t.intValue() : bVar2.f1954m.intValue(), e() ? bVar2.f1957u.intValue() : bVar2.f1955n.intValue(), new v6.a(0)).a());
        this.f1935e = gVar;
        g();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && jVar.f16056g != (dVar = new d(context2, bVar2.f1953j.intValue()))) {
            jVar.b(dVar, context2);
            textPaint.setColor(bVar2.f1950f.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i10 = bVar2.O;
        if (i10 != -2) {
            this.f1941u = ((int) Math.pow(10.0d, i10 - 1.0d)) - 1;
        } else {
            this.f1941u = bVar2.P;
        }
        jVar.f16054e = true;
        i();
        invalidateSelf();
        jVar.f16054e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(bVar2.f1948e.intValue());
        if (gVar.f18440b.f18420c != colorStateListValueOf) {
            gVar.l(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(bVar2.f1950f.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.O;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.O.get();
            WeakReference weakReference3 = this.P;
            h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        i();
        setVisible(bVar2.W.booleanValue(), false);
    }

    @Override // p6.i
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        c cVar = this.f1938m;
        b bVar = cVar.f1960b;
        String str = bVar.M;
        boolean z7 = str != null;
        WeakReference weakReference = this.f1934b;
        if (z7) {
            int i10 = bVar.O;
            if (i10 == -2 || str == null || str.length() <= i10) {
                return str;
            }
            Context context = (Context) weakReference.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(2131886559), str.substring(0, i10 - 1), "…");
        }
        if (!f()) {
            return null;
        }
        int i11 = this.f1941u;
        b bVar2 = cVar.f1960b;
        if (i11 == -2 || d() <= this.f1941u) {
            return NumberFormat.getInstance(bVar2.Q).format(d());
        }
        Context context2 = (Context) weakReference.get();
        return context2 == null ? "" : String.format(bVar2.Q, context2.getString(2131886669), Integer.valueOf(this.f1941u), "+");
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.P;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i10 = this.f1938m.f1960b.N;
        if (i10 != -1) {
            return i10;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strB;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f1935e.draw(canvas);
        if (!e() || (strB = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        j jVar = this.f1936f;
        jVar.f16050a.getTextBounds(strB, 0, strB.length(), rect);
        float fExactCenterY = this.f1940t - rect.exactCenterY();
        canvas.drawText(strB, this.f1939n, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), jVar.f16050a);
    }

    public final boolean e() {
        return this.f1938m.f1960b.M != null || f();
    }

    public final boolean f() {
        b bVar = this.f1938m.f1960b;
        return bVar.M == null && bVar.N != -1;
    }

    public final void g() {
        Context context = (Context) this.f1934b.get();
        if (context == null) {
            return;
        }
        boolean zE = e();
        c cVar = this.f1938m;
        this.f1935e.setShapeAppearanceModel(v6.j.a(context, zE ? cVar.f1960b.f1956t.intValue() : cVar.f1960b.f1954m.intValue(), e() ? cVar.f1960b.f1957u.intValue() : cVar.f1960b.f1955n.intValue(), new v6.a(0)).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f1938m.f1960b.f1958w;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f1937j.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f1937j.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.O = new WeakReference(view);
        this.P = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        float f10;
        float y10;
        float x10;
        float y11;
        float x11;
        float height;
        float width;
        WeakReference weakReference = this.f1934b;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.O;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f1937j;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.P;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zE = e();
        c cVar = this.f1938m;
        float fRound = zE ? cVar.f1962d : cVar.f1961c;
        this.f1942w = fRound;
        if (fRound != -1.0f) {
            this.M = fRound;
        } else {
            this.M = Math.round((e() ? cVar.f1965g : cVar.f1963e) / 2.0f);
            fRound = Math.round((e() ? cVar.f1966h : cVar.f1964f) / 2.0f);
        }
        this.N = fRound;
        if (e()) {
            String strB = b();
            float f11 = this.M;
            j jVar = this.f1936f;
            if (jVar.f16054e) {
                jVar.a(strB);
            }
            this.M = Math.max(f11, (jVar.f16052c / 2.0f) + cVar.f1960b.X.intValue());
            float f12 = this.N;
            if (jVar.f16054e) {
                jVar.a(strB);
            }
            float fMax = Math.max(f12, (jVar.f16053d / 2.0f) + cVar.f1960b.Y.intValue());
            this.N = fMax;
            this.M = Math.max(this.M, fMax);
        }
        int iIntValue = cVar.f1960b.f1943a0.intValue();
        boolean zE2 = e();
        b bVar = cVar.f1960b;
        if (zE2) {
            iIntValue = bVar.f1946c0.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = z5.a.c(iIntValue, z5.a.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), iIntValue - bVar.f1951f0.intValue());
            }
        }
        int i10 = cVar.f1969k;
        if (i10 == 0) {
            iIntValue -= Math.round(this.N);
        }
        int iIntValue2 = bVar.f1949e0.intValue() + iIntValue;
        int iIntValue3 = bVar.V.intValue();
        this.f1940t = (iIntValue3 == 8388691 || iIntValue3 == 8388693) ? rect3.bottom - iIntValue2 : rect3.top + iIntValue2;
        int iIntValue4 = e() ? bVar.f1945b0.intValue() : bVar.Z.intValue();
        if (i10 == 1) {
            iIntValue4 += e() ? cVar.f1968j : cVar.f1967i;
        }
        int iIntValue5 = bVar.f1947d0.intValue() + iIntValue4;
        int iIntValue6 = bVar.V.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap weakHashMap = c1.f15515a;
            f10 = view.getLayoutDirection() == 0 ? (rect3.left - this.M) + iIntValue5 : (rect3.right + this.M) - iIntValue5;
        } else {
            WeakHashMap weakHashMap2 = c1.f15515a;
            if (view.getLayoutDirection() == 0) {
            }
        }
        this.f1939n = f10;
        if (bVar.f1952g0.booleanValue()) {
            View viewC = c();
            if (viewC != null) {
                FrameLayout frameLayoutC = c();
                if (frameLayoutC == null || frameLayoutC.getId() != 2131296682) {
                    y10 = 0.0f;
                    x10 = 0.0f;
                } else if (viewC.getParent() instanceof View) {
                    y10 = viewC.getY();
                    x10 = viewC.getX();
                    viewC = (View) viewC.getParent();
                }
                y11 = viewC.getY() + (this.f1940t - this.N) + y10;
                x11 = viewC.getX() + (this.f1939n - this.M) + x10;
                if (!(viewC.getParent() instanceof View)) {
                }
                if (!(viewC.getParent() instanceof View)) {
                }
                if (y11 < 0.0f) {
                }
                if (x11 < 0.0f) {
                }
                if (height > 0.0f) {
                }
                if (width > 0.0f) {
                }
            } else if (view.getParent() instanceof View) {
                float y12 = view.getY();
                x10 = view.getX();
                View view2 = (View) view.getParent();
                y10 = y12;
                viewC = view2;
                y11 = viewC.getY() + (this.f1940t - this.N) + y10;
                x11 = viewC.getX() + (this.f1939n - this.M) + x10;
                height = !(viewC.getParent() instanceof View) ? ((this.f1940t + this.N) - (((View) viewC.getParent()).getHeight() - viewC.getY())) + y10 : 0.0f;
                width = !(viewC.getParent() instanceof View) ? ((this.f1939n + this.M) - (((View) viewC.getParent()).getWidth() - viewC.getX())) + x10 : 0.0f;
                if (y11 < 0.0f) {
                    this.f1940t = Math.abs(y11) + this.f1940t;
                }
                if (x11 < 0.0f) {
                    this.f1939n = Math.abs(x11) + this.f1939n;
                }
                if (height > 0.0f) {
                    this.f1940t -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f1939n -= Math.abs(width);
                }
            }
        }
        float f13 = this.f1939n;
        float f14 = this.f1940t;
        float f15 = this.M;
        float f16 = this.N;
        rect2.set((int) (f13 - f15), (int) (f14 - f16), (int) (f13 + f15), (int) (f14 + f16));
        float f17 = this.f1942w;
        g gVar = this.f1935e;
        if (f17 != -1.0f) {
            l lVarE = gVar.f18440b.f18418a.e();
            lVarE.f16192e = new v6.a(f17);
            lVarE.f16193f = new v6.a(f17);
            lVarE.f16194g = new v6.a(f17);
            lVarE.f16195h = new v6.a(f17);
            gVar.setShapeAppearanceModel(lVarE.a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        gVar.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, p6.i
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        c cVar = this.f1938m;
        cVar.f1959a.f1958w = i10;
        cVar.f1960b.f1958w = i10;
        this.f1936f.f16050a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}