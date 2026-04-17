package h;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import t.l;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends j {
    public static final /* synthetic */ int K = 0;
    public t.e I;
    public l J;

    public b(b bVar, e eVar, Resources resources) {
        l lVar;
        super(bVar, eVar, resources);
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f13112g.length][];
        }
        if (bVar != null) {
            this.I = bVar.I;
            lVar = bVar.J;
        } else {
            this.I = new t.e();
            lVar = new l();
        }
        this.J = lVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}