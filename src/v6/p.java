package v6;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p extends r {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f18481h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f18482b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18483c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18484d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18485e;

    /* renamed from: f, reason: collision with root package name */
    public float f18486f;

    /* renamed from: g, reason: collision with root package name */
    public float f18487g;

    public p(float f10, float f11, float f12, float f13) {
        this.f18482b = f10;
        this.f18483c = f11;
        this.f18484d = f12;
        this.f18485e = f13;
    }

    @Override // v6.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f18490a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f18481h;
        rectF.set(this.f18482b, this.f18483c, this.f18484d, this.f18485e);
        path.arcTo(rectF, this.f18486f, this.f18487g, false);
        path.transform(matrix);
    }
}