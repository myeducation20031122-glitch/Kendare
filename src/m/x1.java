package m;

import android.graphics.Canvas;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x1 extends h.i {

    /* renamed from: e, reason: collision with root package name */
    public boolean f14994e;

    @Override // h.i, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f14994e) {
            super.draw(canvas);
        }
    }

    @Override // h.i, android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        if (this.f14994e) {
            super.setHotspot(f10, f11);
        }
    }

    @Override // h.i, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        if (this.f14994e) {
            super.setHotspotBounds(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f14994e) {
            return this.f13141b.setState(iArr);
        }
        return false;
    }

    @Override // h.i, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z10) {
        if (this.f14994e) {
            return super.setVisible(z7, z10);
        }
        return false;
    }
}