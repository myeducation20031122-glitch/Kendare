package h;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class k extends h {
    public j Q;
    public boolean R;

    @Override // h.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // h.h, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.R) {
            super.mutate();
            b bVar = (b) this.Q;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.R = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public abstract boolean onStateChange(int[] iArr);
}