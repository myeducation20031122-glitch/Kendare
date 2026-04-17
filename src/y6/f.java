package y6;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends v6.f {

    /* renamed from: v, reason: collision with root package name */
    public final RectF f19308v;

    public f(v6.j jVar, RectF rectF) {
        super(jVar);
        this.f19308v = rectF;
    }

    @Override // v6.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f19308v = fVar.f19308v;
    }
}