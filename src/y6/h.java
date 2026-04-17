package y6;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h extends v6.g {

    /* renamed from: c0, reason: collision with root package name */
    public static final /* synthetic */ int f19309c0 = 0;

    /* renamed from: b0, reason: collision with root package name */
    public f f19310b0;

    public h(f fVar) {
        super(fVar);
        this.f19310b0 = fVar;
    }

    @Override // v6.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f19310b0 = new f(this.f19310b0);
        return this;
    }

    public final void p(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f19310b0.f19308v;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }
}