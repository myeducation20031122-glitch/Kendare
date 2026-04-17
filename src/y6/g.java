package y6;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends h {
    @Override // v6.g
    public final void g(Canvas canvas) {
        if (this.f19310b0.f19308v.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            x4.e.h(canvas, this.f19310b0.f19308v);
        } else {
            canvas.clipRect(this.f19310b0.f19308v, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }
}