package u1;

import android.graphics.Paint;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends l {

    /* renamed from: e, reason: collision with root package name */
    public g0.d f18164e;

    /* renamed from: f, reason: collision with root package name */
    public float f18165f;

    /* renamed from: g, reason: collision with root package name */
    public g0.d f18166g;

    /* renamed from: h, reason: collision with root package name */
    public float f18167h;

    /* renamed from: i, reason: collision with root package name */
    public float f18168i;

    /* renamed from: j, reason: collision with root package name */
    public float f18169j;

    /* renamed from: k, reason: collision with root package name */
    public float f18170k;

    /* renamed from: l, reason: collision with root package name */
    public float f18171l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Cap f18172m;

    /* renamed from: n, reason: collision with root package name */
    public Paint.Join f18173n;

    /* renamed from: o, reason: collision with root package name */
    public float f18174o;

    @Override // u1.k
    public final boolean a() {
        return this.f18166g.c() || this.f18164e.c();
    }

    @Override // u1.k
    public final boolean b(int[] iArr) {
        return this.f18164e.d(iArr) | this.f18166g.d(iArr);
    }

    public float getFillAlpha() {
        return this.f18168i;
    }

    public int getFillColor() {
        return this.f18166g.f12950b;
    }

    public float getStrokeAlpha() {
        return this.f18167h;
    }

    public int getStrokeColor() {
        return this.f18164e.f12950b;
    }

    public float getStrokeWidth() {
        return this.f18165f;
    }

    public float getTrimPathEnd() {
        return this.f18170k;
    }

    public float getTrimPathOffset() {
        return this.f18171l;
    }

    public float getTrimPathStart() {
        return this.f18169j;
    }

    public void setFillAlpha(float f10) {
        this.f18168i = f10;
    }

    public void setFillColor(int i10) {
        this.f18166g.f12950b = i10;
    }

    public void setStrokeAlpha(float f10) {
        this.f18167h = f10;
    }

    public void setStrokeColor(int i10) {
        this.f18164e.f12950b = i10;
    }

    public void setStrokeWidth(float f10) {
        this.f18165f = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f18170k = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f18171l = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f18169j = f10;
    }
}